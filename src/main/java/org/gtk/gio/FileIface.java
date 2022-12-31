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
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
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
    public org.gtk.gobject.TypeInterface getGIface() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("g_iface"));
        return org.gtk.gobject.TypeInterface.fromAddress.marshal(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Change the value of the field {@code g_iface}
     * @param gIface The new value of the field {@code g_iface}
     */
    public void setGIface(org.gtk.gobject.TypeInterface gIface) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("g_iface"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (gIface == null ? MemoryAddress.NULL : gIface.handle()));
    }
    
    @FunctionalInterface
    public interface DupCallback {
        org.gtk.gio.File run(org.gtk.gio.File file);

        @ApiStatus.Internal default Addressable upcall(MemoryAddress file) {
            var RESULT = run((org.gtk.gio.File) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(file)), org.gtk.gio.File.fromAddress).marshal(file, Ownership.NONE));
            return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(DupCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code dup}
     * @param dup The new value of the field {@code dup}
     */
    public void setDup(DupCallback dup) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("dup"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (dup == null ? MemoryAddress.NULL : dup.toCallback()));
    }
    
    @FunctionalInterface
    public interface HashCallback {
        int run(org.gtk.gio.File file);

        @ApiStatus.Internal default int upcall(MemoryAddress file) {
            var RESULT = run((org.gtk.gio.File) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(file)), org.gtk.gio.File.fromAddress).marshal(file, Ownership.NONE));
            return RESULT;
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(HashCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code hash}
     * @param hash The new value of the field {@code hash}
     */
    public void setHash(HashCallback hash) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("hash"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (hash == null ? MemoryAddress.NULL : hash.toCallback()));
    }
    
    @FunctionalInterface
    public interface EqualCallback {
        boolean run(org.gtk.gio.File file1, org.gtk.gio.File file2);

        @ApiStatus.Internal default int upcall(MemoryAddress file1, MemoryAddress file2) {
            var RESULT = run((org.gtk.gio.File) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(file1)), org.gtk.gio.File.fromAddress).marshal(file1, Ownership.NONE), (org.gtk.gio.File) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(file2)), org.gtk.gio.File.fromAddress).marshal(file2, Ownership.NONE));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(EqualCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code equal}
     * @param equal The new value of the field {@code equal}
     */
    public void setEqual(EqualCallback equal) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("equal"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (equal == null ? MemoryAddress.NULL : equal.toCallback()));
    }
    
    @FunctionalInterface
    public interface IsNativeCallback {
        boolean run(org.gtk.gio.File file);

        @ApiStatus.Internal default int upcall(MemoryAddress file) {
            var RESULT = run((org.gtk.gio.File) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(file)), org.gtk.gio.File.fromAddress).marshal(file, Ownership.NONE));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(IsNativeCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code is_native}
     * @param isNative The new value of the field {@code is_native}
     */
    public void setIsNative(IsNativeCallback isNative) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("is_native"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (isNative == null ? MemoryAddress.NULL : isNative.toCallback()));
    }
    
    @FunctionalInterface
    public interface HasUriSchemeCallback {
        boolean run(org.gtk.gio.File file, java.lang.String uriScheme);

        @ApiStatus.Internal default int upcall(MemoryAddress file, MemoryAddress uriScheme) {
            var RESULT = run((org.gtk.gio.File) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(file)), org.gtk.gio.File.fromAddress).marshal(file, Ownership.NONE), Marshal.addressToString.marshal(uriScheme, null));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(HasUriSchemeCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code has_uri_scheme}
     * @param hasUriScheme The new value of the field {@code has_uri_scheme}
     */
    public void setHasUriScheme(HasUriSchemeCallback hasUriScheme) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("has_uri_scheme"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (hasUriScheme == null ? MemoryAddress.NULL : hasUriScheme.toCallback()));
    }
    
    @FunctionalInterface
    public interface GetUriSchemeCallback {
        @Nullable java.lang.String run(org.gtk.gio.File file);

        @ApiStatus.Internal default Addressable upcall(MemoryAddress file) {
            var RESULT = run((org.gtk.gio.File) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(file)), org.gtk.gio.File.fromAddress).marshal(file, Ownership.NONE));
            return RESULT == null ? MemoryAddress.NULL.address() : (Marshal.stringToAddress.marshal(RESULT, null)).address();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(GetUriSchemeCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_uri_scheme}
     * @param getUriScheme The new value of the field {@code get_uri_scheme}
     */
    public void setGetUriScheme(GetUriSchemeCallback getUriScheme) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("get_uri_scheme"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getUriScheme == null ? MemoryAddress.NULL : getUriScheme.toCallback()));
    }
    
    @FunctionalInterface
    public interface GetBasenameCallback {
        @Nullable java.lang.String run(org.gtk.gio.File file);

        @ApiStatus.Internal default Addressable upcall(MemoryAddress file) {
            var RESULT = run((org.gtk.gio.File) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(file)), org.gtk.gio.File.fromAddress).marshal(file, Ownership.NONE));
            return RESULT == null ? MemoryAddress.NULL.address() : (Marshal.stringToAddress.marshal(RESULT, null)).address();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(GetBasenameCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_basename}
     * @param getBasename The new value of the field {@code get_basename}
     */
    public void setGetBasename(GetBasenameCallback getBasename) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("get_basename"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getBasename == null ? MemoryAddress.NULL : getBasename.toCallback()));
    }
    
    @FunctionalInterface
    public interface GetPathCallback {
        @Nullable java.lang.String run(org.gtk.gio.File file);

        @ApiStatus.Internal default Addressable upcall(MemoryAddress file) {
            var RESULT = run((org.gtk.gio.File) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(file)), org.gtk.gio.File.fromAddress).marshal(file, Ownership.NONE));
            return RESULT == null ? MemoryAddress.NULL.address() : (Marshal.stringToAddress.marshal(RESULT, null)).address();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(GetPathCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_path}
     * @param getPath The new value of the field {@code get_path}
     */
    public void setGetPath(GetPathCallback getPath) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("get_path"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getPath == null ? MemoryAddress.NULL : getPath.toCallback()));
    }
    
    @FunctionalInterface
    public interface GetUriCallback {
        java.lang.String run(org.gtk.gio.File file);

        @ApiStatus.Internal default Addressable upcall(MemoryAddress file) {
            var RESULT = run((org.gtk.gio.File) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(file)), org.gtk.gio.File.fromAddress).marshal(file, Ownership.NONE));
            return RESULT == null ? MemoryAddress.NULL.address() : (Marshal.stringToAddress.marshal(RESULT, null)).address();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(GetUriCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_uri}
     * @param getUri The new value of the field {@code get_uri}
     */
    public void setGetUri(GetUriCallback getUri) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("get_uri"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getUri == null ? MemoryAddress.NULL : getUri.toCallback()));
    }
    
    @FunctionalInterface
    public interface GetParseNameCallback {
        java.lang.String run(org.gtk.gio.File file);

        @ApiStatus.Internal default Addressable upcall(MemoryAddress file) {
            var RESULT = run((org.gtk.gio.File) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(file)), org.gtk.gio.File.fromAddress).marshal(file, Ownership.NONE));
            return RESULT == null ? MemoryAddress.NULL.address() : (Marshal.stringToAddress.marshal(RESULT, null)).address();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(GetParseNameCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_parse_name}
     * @param getParseName The new value of the field {@code get_parse_name}
     */
    public void setGetParseName(GetParseNameCallback getParseName) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("get_parse_name"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getParseName == null ? MemoryAddress.NULL : getParseName.toCallback()));
    }
    
    @FunctionalInterface
    public interface GetParentCallback {
        @Nullable org.gtk.gio.File run(org.gtk.gio.File file);

        @ApiStatus.Internal default Addressable upcall(MemoryAddress file) {
            var RESULT = run((org.gtk.gio.File) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(file)), org.gtk.gio.File.fromAddress).marshal(file, Ownership.NONE));
            return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(GetParentCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_parent}
     * @param getParent The new value of the field {@code get_parent}
     */
    public void setGetParent(GetParentCallback getParent) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("get_parent"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getParent == null ? MemoryAddress.NULL : getParent.toCallback()));
    }
    
    @FunctionalInterface
    public interface PrefixMatchesCallback {
        boolean run(org.gtk.gio.File prefix, org.gtk.gio.File file);

        @ApiStatus.Internal default int upcall(MemoryAddress prefix, MemoryAddress file) {
            var RESULT = run((org.gtk.gio.File) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(prefix)), org.gtk.gio.File.fromAddress).marshal(prefix, Ownership.NONE), (org.gtk.gio.File) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(file)), org.gtk.gio.File.fromAddress).marshal(file, Ownership.NONE));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(PrefixMatchesCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code prefix_matches}
     * @param prefixMatches The new value of the field {@code prefix_matches}
     */
    public void setPrefixMatches(PrefixMatchesCallback prefixMatches) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("prefix_matches"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (prefixMatches == null ? MemoryAddress.NULL : prefixMatches.toCallback()));
    }
    
    @FunctionalInterface
    public interface GetRelativePathCallback {
        @Nullable java.lang.String run(org.gtk.gio.File parent, org.gtk.gio.File descendant);

        @ApiStatus.Internal default Addressable upcall(MemoryAddress parent, MemoryAddress descendant) {
            var RESULT = run((org.gtk.gio.File) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(parent)), org.gtk.gio.File.fromAddress).marshal(parent, Ownership.NONE), (org.gtk.gio.File) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(descendant)), org.gtk.gio.File.fromAddress).marshal(descendant, Ownership.NONE));
            return RESULT == null ? MemoryAddress.NULL.address() : (Marshal.stringToAddress.marshal(RESULT, null)).address();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(GetRelativePathCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_relative_path}
     * @param getRelativePath The new value of the field {@code get_relative_path}
     */
    public void setGetRelativePath(GetRelativePathCallback getRelativePath) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("get_relative_path"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getRelativePath == null ? MemoryAddress.NULL : getRelativePath.toCallback()));
    }
    
    @FunctionalInterface
    public interface ResolveRelativePathCallback {
        org.gtk.gio.File run(org.gtk.gio.File file, java.lang.String relativePath);

        @ApiStatus.Internal default Addressable upcall(MemoryAddress file, MemoryAddress relativePath) {
            var RESULT = run((org.gtk.gio.File) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(file)), org.gtk.gio.File.fromAddress).marshal(file, Ownership.NONE), Marshal.addressToString.marshal(relativePath, null));
            return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(ResolveRelativePathCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code resolve_relative_path}
     * @param resolveRelativePath The new value of the field {@code resolve_relative_path}
     */
    public void setResolveRelativePath(ResolveRelativePathCallback resolveRelativePath) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("resolve_relative_path"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (resolveRelativePath == null ? MemoryAddress.NULL : resolveRelativePath.toCallback()));
    }
    
    @FunctionalInterface
    public interface GetChildForDisplayNameCallback {
        org.gtk.gio.File run(org.gtk.gio.File file, java.lang.String displayName);

        @ApiStatus.Internal default Addressable upcall(MemoryAddress file, MemoryAddress displayName) {
            var RESULT = run((org.gtk.gio.File) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(file)), org.gtk.gio.File.fromAddress).marshal(file, Ownership.NONE), Marshal.addressToString.marshal(displayName, null));
            return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(GetChildForDisplayNameCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_child_for_display_name}
     * @param getChildForDisplayName The new value of the field {@code get_child_for_display_name}
     */
    public void setGetChildForDisplayName(GetChildForDisplayNameCallback getChildForDisplayName) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("get_child_for_display_name"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getChildForDisplayName == null ? MemoryAddress.NULL : getChildForDisplayName.toCallback()));
    }
    
    @FunctionalInterface
    public interface EnumerateChildrenCallback {
        org.gtk.gio.FileEnumerator run(org.gtk.gio.File file, java.lang.String attributes, org.gtk.gio.FileQueryInfoFlags flags, @Nullable org.gtk.gio.Cancellable cancellable);

        @ApiStatus.Internal default Addressable upcall(MemoryAddress file, MemoryAddress attributes, int flags, MemoryAddress cancellable) {
            var RESULT = run((org.gtk.gio.File) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(file)), org.gtk.gio.File.fromAddress).marshal(file, Ownership.NONE), Marshal.addressToString.marshal(attributes, null), new org.gtk.gio.FileQueryInfoFlags(flags), (org.gtk.gio.Cancellable) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(cancellable)), org.gtk.gio.Cancellable.fromAddress).marshal(cancellable, Ownership.NONE));
            return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(EnumerateChildrenCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code enumerate_children}
     * @param enumerateChildren The new value of the field {@code enumerate_children}
     */
    public void setEnumerateChildren(EnumerateChildrenCallback enumerateChildren) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("enumerate_children"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (enumerateChildren == null ? MemoryAddress.NULL : enumerateChildren.toCallback()));
    }
    
    @FunctionalInterface
    public interface EnumerateChildrenAsyncCallback {
        void run(org.gtk.gio.File file, java.lang.String attributes, org.gtk.gio.FileQueryInfoFlags flags, int ioPriority, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.AsyncReadyCallback callback);

        @ApiStatus.Internal default void upcall(MemoryAddress file, MemoryAddress attributes, int flags, int ioPriority, MemoryAddress cancellable, MemoryAddress callback, MemoryAddress userData) {
            run((org.gtk.gio.File) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(file)), org.gtk.gio.File.fromAddress).marshal(file, Ownership.NONE), Marshal.addressToString.marshal(attributes, null), new org.gtk.gio.FileQueryInfoFlags(flags), ioPriority, (org.gtk.gio.Cancellable) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(cancellable)), org.gtk.gio.Cancellable.fromAddress).marshal(cancellable, Ownership.NONE), null /* Unsupported parameter type */);
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(EnumerateChildrenAsyncCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code enumerate_children_async}
     * @param enumerateChildrenAsync The new value of the field {@code enumerate_children_async}
     */
    public void setEnumerateChildrenAsync(EnumerateChildrenAsyncCallback enumerateChildrenAsync) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("enumerate_children_async"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (enumerateChildrenAsync == null ? MemoryAddress.NULL : enumerateChildrenAsync.toCallback()));
    }
    
    @FunctionalInterface
    public interface EnumerateChildrenFinishCallback {
        org.gtk.gio.FileEnumerator run(org.gtk.gio.File file, org.gtk.gio.AsyncResult res);

        @ApiStatus.Internal default Addressable upcall(MemoryAddress file, MemoryAddress res) {
            var RESULT = run((org.gtk.gio.File) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(file)), org.gtk.gio.File.fromAddress).marshal(file, Ownership.NONE), (org.gtk.gio.AsyncResult) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(res)), org.gtk.gio.AsyncResult.fromAddress).marshal(res, Ownership.NONE));
            return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(EnumerateChildrenFinishCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code enumerate_children_finish}
     * @param enumerateChildrenFinish The new value of the field {@code enumerate_children_finish}
     */
    public void setEnumerateChildrenFinish(EnumerateChildrenFinishCallback enumerateChildrenFinish) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("enumerate_children_finish"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (enumerateChildrenFinish == null ? MemoryAddress.NULL : enumerateChildrenFinish.toCallback()));
    }
    
    @FunctionalInterface
    public interface QueryInfoCallback {
        org.gtk.gio.FileInfo run(org.gtk.gio.File file, java.lang.String attributes, org.gtk.gio.FileQueryInfoFlags flags, @Nullable org.gtk.gio.Cancellable cancellable);

        @ApiStatus.Internal default Addressable upcall(MemoryAddress file, MemoryAddress attributes, int flags, MemoryAddress cancellable) {
            var RESULT = run((org.gtk.gio.File) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(file)), org.gtk.gio.File.fromAddress).marshal(file, Ownership.NONE), Marshal.addressToString.marshal(attributes, null), new org.gtk.gio.FileQueryInfoFlags(flags), (org.gtk.gio.Cancellable) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(cancellable)), org.gtk.gio.Cancellable.fromAddress).marshal(cancellable, Ownership.NONE));
            return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(QueryInfoCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code query_info}
     * @param queryInfo The new value of the field {@code query_info}
     */
    public void setQueryInfo(QueryInfoCallback queryInfo) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("query_info"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (queryInfo == null ? MemoryAddress.NULL : queryInfo.toCallback()));
    }
    
    @FunctionalInterface
    public interface QueryInfoAsyncCallback {
        void run(org.gtk.gio.File file, java.lang.String attributes, org.gtk.gio.FileQueryInfoFlags flags, int ioPriority, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.AsyncReadyCallback callback);

        @ApiStatus.Internal default void upcall(MemoryAddress file, MemoryAddress attributes, int flags, int ioPriority, MemoryAddress cancellable, MemoryAddress callback, MemoryAddress userData) {
            run((org.gtk.gio.File) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(file)), org.gtk.gio.File.fromAddress).marshal(file, Ownership.NONE), Marshal.addressToString.marshal(attributes, null), new org.gtk.gio.FileQueryInfoFlags(flags), ioPriority, (org.gtk.gio.Cancellable) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(cancellable)), org.gtk.gio.Cancellable.fromAddress).marshal(cancellable, Ownership.NONE), null /* Unsupported parameter type */);
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(QueryInfoAsyncCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code query_info_async}
     * @param queryInfoAsync The new value of the field {@code query_info_async}
     */
    public void setQueryInfoAsync(QueryInfoAsyncCallback queryInfoAsync) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("query_info_async"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (queryInfoAsync == null ? MemoryAddress.NULL : queryInfoAsync.toCallback()));
    }
    
    @FunctionalInterface
    public interface QueryInfoFinishCallback {
        org.gtk.gio.FileInfo run(org.gtk.gio.File file, org.gtk.gio.AsyncResult res);

        @ApiStatus.Internal default Addressable upcall(MemoryAddress file, MemoryAddress res) {
            var RESULT = run((org.gtk.gio.File) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(file)), org.gtk.gio.File.fromAddress).marshal(file, Ownership.NONE), (org.gtk.gio.AsyncResult) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(res)), org.gtk.gio.AsyncResult.fromAddress).marshal(res, Ownership.NONE));
            return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(QueryInfoFinishCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code query_info_finish}
     * @param queryInfoFinish The new value of the field {@code query_info_finish}
     */
    public void setQueryInfoFinish(QueryInfoFinishCallback queryInfoFinish) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("query_info_finish"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (queryInfoFinish == null ? MemoryAddress.NULL : queryInfoFinish.toCallback()));
    }
    
    @FunctionalInterface
    public interface QueryFilesystemInfoCallback {
        org.gtk.gio.FileInfo run(org.gtk.gio.File file, java.lang.String attributes, @Nullable org.gtk.gio.Cancellable cancellable);

        @ApiStatus.Internal default Addressable upcall(MemoryAddress file, MemoryAddress attributes, MemoryAddress cancellable) {
            var RESULT = run((org.gtk.gio.File) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(file)), org.gtk.gio.File.fromAddress).marshal(file, Ownership.NONE), Marshal.addressToString.marshal(attributes, null), (org.gtk.gio.Cancellable) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(cancellable)), org.gtk.gio.Cancellable.fromAddress).marshal(cancellable, Ownership.NONE));
            return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(QueryFilesystemInfoCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code query_filesystem_info}
     * @param queryFilesystemInfo The new value of the field {@code query_filesystem_info}
     */
    public void setQueryFilesystemInfo(QueryFilesystemInfoCallback queryFilesystemInfo) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("query_filesystem_info"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (queryFilesystemInfo == null ? MemoryAddress.NULL : queryFilesystemInfo.toCallback()));
    }
    
    @FunctionalInterface
    public interface QueryFilesystemInfoAsyncCallback {
        void run(org.gtk.gio.File file, java.lang.String attributes, int ioPriority, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.AsyncReadyCallback callback);

        @ApiStatus.Internal default void upcall(MemoryAddress file, MemoryAddress attributes, int ioPriority, MemoryAddress cancellable, MemoryAddress callback, MemoryAddress userData) {
            run((org.gtk.gio.File) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(file)), org.gtk.gio.File.fromAddress).marshal(file, Ownership.NONE), Marshal.addressToString.marshal(attributes, null), ioPriority, (org.gtk.gio.Cancellable) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(cancellable)), org.gtk.gio.Cancellable.fromAddress).marshal(cancellable, Ownership.NONE), null /* Unsupported parameter type */);
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(QueryFilesystemInfoAsyncCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code query_filesystem_info_async}
     * @param queryFilesystemInfoAsync The new value of the field {@code query_filesystem_info_async}
     */
    public void setQueryFilesystemInfoAsync(QueryFilesystemInfoAsyncCallback queryFilesystemInfoAsync) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("query_filesystem_info_async"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (queryFilesystemInfoAsync == null ? MemoryAddress.NULL : queryFilesystemInfoAsync.toCallback()));
    }
    
    @FunctionalInterface
    public interface QueryFilesystemInfoFinishCallback {
        org.gtk.gio.FileInfo run(org.gtk.gio.File file, org.gtk.gio.AsyncResult res);

        @ApiStatus.Internal default Addressable upcall(MemoryAddress file, MemoryAddress res) {
            var RESULT = run((org.gtk.gio.File) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(file)), org.gtk.gio.File.fromAddress).marshal(file, Ownership.NONE), (org.gtk.gio.AsyncResult) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(res)), org.gtk.gio.AsyncResult.fromAddress).marshal(res, Ownership.NONE));
            return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(QueryFilesystemInfoFinishCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code query_filesystem_info_finish}
     * @param queryFilesystemInfoFinish The new value of the field {@code query_filesystem_info_finish}
     */
    public void setQueryFilesystemInfoFinish(QueryFilesystemInfoFinishCallback queryFilesystemInfoFinish) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("query_filesystem_info_finish"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (queryFilesystemInfoFinish == null ? MemoryAddress.NULL : queryFilesystemInfoFinish.toCallback()));
    }
    
    @FunctionalInterface
    public interface FindEnclosingMountCallback {
        org.gtk.gio.Mount run(org.gtk.gio.File file, @Nullable org.gtk.gio.Cancellable cancellable);

        @ApiStatus.Internal default Addressable upcall(MemoryAddress file, MemoryAddress cancellable) {
            var RESULT = run((org.gtk.gio.File) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(file)), org.gtk.gio.File.fromAddress).marshal(file, Ownership.NONE), (org.gtk.gio.Cancellable) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(cancellable)), org.gtk.gio.Cancellable.fromAddress).marshal(cancellable, Ownership.NONE));
            return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(FindEnclosingMountCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code find_enclosing_mount}
     * @param findEnclosingMount The new value of the field {@code find_enclosing_mount}
     */
    public void setFindEnclosingMount(FindEnclosingMountCallback findEnclosingMount) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("find_enclosing_mount"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (findEnclosingMount == null ? MemoryAddress.NULL : findEnclosingMount.toCallback()));
    }
    
    @FunctionalInterface
    public interface FindEnclosingMountAsyncCallback {
        void run(org.gtk.gio.File file, int ioPriority, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.AsyncReadyCallback callback);

        @ApiStatus.Internal default void upcall(MemoryAddress file, int ioPriority, MemoryAddress cancellable, MemoryAddress callback, MemoryAddress userData) {
            run((org.gtk.gio.File) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(file)), org.gtk.gio.File.fromAddress).marshal(file, Ownership.NONE), ioPriority, (org.gtk.gio.Cancellable) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(cancellable)), org.gtk.gio.Cancellable.fromAddress).marshal(cancellable, Ownership.NONE), null /* Unsupported parameter type */);
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(FindEnclosingMountAsyncCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code find_enclosing_mount_async}
     * @param findEnclosingMountAsync The new value of the field {@code find_enclosing_mount_async}
     */
    public void setFindEnclosingMountAsync(FindEnclosingMountAsyncCallback findEnclosingMountAsync) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("find_enclosing_mount_async"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (findEnclosingMountAsync == null ? MemoryAddress.NULL : findEnclosingMountAsync.toCallback()));
    }
    
    @FunctionalInterface
    public interface FindEnclosingMountFinishCallback {
        org.gtk.gio.Mount run(org.gtk.gio.File file, org.gtk.gio.AsyncResult res);

        @ApiStatus.Internal default Addressable upcall(MemoryAddress file, MemoryAddress res) {
            var RESULT = run((org.gtk.gio.File) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(file)), org.gtk.gio.File.fromAddress).marshal(file, Ownership.NONE), (org.gtk.gio.AsyncResult) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(res)), org.gtk.gio.AsyncResult.fromAddress).marshal(res, Ownership.NONE));
            return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(FindEnclosingMountFinishCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code find_enclosing_mount_finish}
     * @param findEnclosingMountFinish The new value of the field {@code find_enclosing_mount_finish}
     */
    public void setFindEnclosingMountFinish(FindEnclosingMountFinishCallback findEnclosingMountFinish) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("find_enclosing_mount_finish"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (findEnclosingMountFinish == null ? MemoryAddress.NULL : findEnclosingMountFinish.toCallback()));
    }
    
    @FunctionalInterface
    public interface SetDisplayNameCallback {
        org.gtk.gio.File run(org.gtk.gio.File file, java.lang.String displayName, @Nullable org.gtk.gio.Cancellable cancellable);

        @ApiStatus.Internal default Addressable upcall(MemoryAddress file, MemoryAddress displayName, MemoryAddress cancellable) {
            var RESULT = run((org.gtk.gio.File) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(file)), org.gtk.gio.File.fromAddress).marshal(file, Ownership.NONE), Marshal.addressToString.marshal(displayName, null), (org.gtk.gio.Cancellable) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(cancellable)), org.gtk.gio.Cancellable.fromAddress).marshal(cancellable, Ownership.NONE));
            return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(SetDisplayNameCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code set_display_name}
     * @param setDisplayName The new value of the field {@code set_display_name}
     */
    public void setSetDisplayName(SetDisplayNameCallback setDisplayName) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("set_display_name"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (setDisplayName == null ? MemoryAddress.NULL : setDisplayName.toCallback()));
    }
    
    @FunctionalInterface
    public interface SetDisplayNameAsyncCallback {
        void run(org.gtk.gio.File file, java.lang.String displayName, int ioPriority, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.AsyncReadyCallback callback);

        @ApiStatus.Internal default void upcall(MemoryAddress file, MemoryAddress displayName, int ioPriority, MemoryAddress cancellable, MemoryAddress callback, MemoryAddress userData) {
            run((org.gtk.gio.File) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(file)), org.gtk.gio.File.fromAddress).marshal(file, Ownership.NONE), Marshal.addressToString.marshal(displayName, null), ioPriority, (org.gtk.gio.Cancellable) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(cancellable)), org.gtk.gio.Cancellable.fromAddress).marshal(cancellable, Ownership.NONE), null /* Unsupported parameter type */);
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(SetDisplayNameAsyncCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code set_display_name_async}
     * @param setDisplayNameAsync The new value of the field {@code set_display_name_async}
     */
    public void setSetDisplayNameAsync(SetDisplayNameAsyncCallback setDisplayNameAsync) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("set_display_name_async"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (setDisplayNameAsync == null ? MemoryAddress.NULL : setDisplayNameAsync.toCallback()));
    }
    
    @FunctionalInterface
    public interface SetDisplayNameFinishCallback {
        org.gtk.gio.File run(org.gtk.gio.File file, org.gtk.gio.AsyncResult res);

        @ApiStatus.Internal default Addressable upcall(MemoryAddress file, MemoryAddress res) {
            var RESULT = run((org.gtk.gio.File) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(file)), org.gtk.gio.File.fromAddress).marshal(file, Ownership.NONE), (org.gtk.gio.AsyncResult) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(res)), org.gtk.gio.AsyncResult.fromAddress).marshal(res, Ownership.NONE));
            return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(SetDisplayNameFinishCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code set_display_name_finish}
     * @param setDisplayNameFinish The new value of the field {@code set_display_name_finish}
     */
    public void setSetDisplayNameFinish(SetDisplayNameFinishCallback setDisplayNameFinish) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("set_display_name_finish"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (setDisplayNameFinish == null ? MemoryAddress.NULL : setDisplayNameFinish.toCallback()));
    }
    
    @FunctionalInterface
    public interface QuerySettableAttributesCallback {
        org.gtk.gio.FileAttributeInfoList run(org.gtk.gio.File file, @Nullable org.gtk.gio.Cancellable cancellable);

        @ApiStatus.Internal default Addressable upcall(MemoryAddress file, MemoryAddress cancellable) {
            var RESULT = run((org.gtk.gio.File) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(file)), org.gtk.gio.File.fromAddress).marshal(file, Ownership.NONE), (org.gtk.gio.Cancellable) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(cancellable)), org.gtk.gio.Cancellable.fromAddress).marshal(cancellable, Ownership.NONE));
            return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(QuerySettableAttributesCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code query_settable_attributes}
     * @param querySettableAttributes The new value of the field {@code query_settable_attributes}
     */
    public void setQuerySettableAttributes(QuerySettableAttributesCallback querySettableAttributes) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("query_settable_attributes"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (querySettableAttributes == null ? MemoryAddress.NULL : querySettableAttributes.toCallback()));
    }
    
    @FunctionalInterface
    public interface QuerySettableAttributesAsyncCallback {
        void run();

        @ApiStatus.Internal default void upcall() {
            run();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid();
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(QuerySettableAttributesAsyncCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code _query_settable_attributes_async}
     * @param QuerySettableAttributesAsync The new value of the field {@code _query_settable_attributes_async}
     */
    public void setQuerySettableAttributesAsync(QuerySettableAttributesAsyncCallback QuerySettableAttributesAsync) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("_query_settable_attributes_async"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (QuerySettableAttributesAsync == null ? MemoryAddress.NULL : QuerySettableAttributesAsync.toCallback()));
    }
    
    @FunctionalInterface
    public interface QuerySettableAttributesFinishCallback {
        void run();

        @ApiStatus.Internal default void upcall() {
            run();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid();
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(QuerySettableAttributesFinishCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code _query_settable_attributes_finish}
     * @param QuerySettableAttributesFinish The new value of the field {@code _query_settable_attributes_finish}
     */
    public void setQuerySettableAttributesFinish(QuerySettableAttributesFinishCallback QuerySettableAttributesFinish) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("_query_settable_attributes_finish"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (QuerySettableAttributesFinish == null ? MemoryAddress.NULL : QuerySettableAttributesFinish.toCallback()));
    }
    
    @FunctionalInterface
    public interface QueryWritableNamespacesCallback {
        org.gtk.gio.FileAttributeInfoList run(org.gtk.gio.File file, @Nullable org.gtk.gio.Cancellable cancellable);

        @ApiStatus.Internal default Addressable upcall(MemoryAddress file, MemoryAddress cancellable) {
            var RESULT = run((org.gtk.gio.File) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(file)), org.gtk.gio.File.fromAddress).marshal(file, Ownership.NONE), (org.gtk.gio.Cancellable) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(cancellable)), org.gtk.gio.Cancellable.fromAddress).marshal(cancellable, Ownership.NONE));
            return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(QueryWritableNamespacesCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code query_writable_namespaces}
     * @param queryWritableNamespaces The new value of the field {@code query_writable_namespaces}
     */
    public void setQueryWritableNamespaces(QueryWritableNamespacesCallback queryWritableNamespaces) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("query_writable_namespaces"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (queryWritableNamespaces == null ? MemoryAddress.NULL : queryWritableNamespaces.toCallback()));
    }
    
    @FunctionalInterface
    public interface QueryWritableNamespacesAsyncCallback {
        void run();

        @ApiStatus.Internal default void upcall() {
            run();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid();
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(QueryWritableNamespacesAsyncCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code _query_writable_namespaces_async}
     * @param QueryWritableNamespacesAsync The new value of the field {@code _query_writable_namespaces_async}
     */
    public void setQueryWritableNamespacesAsync(QueryWritableNamespacesAsyncCallback QueryWritableNamespacesAsync) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("_query_writable_namespaces_async"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (QueryWritableNamespacesAsync == null ? MemoryAddress.NULL : QueryWritableNamespacesAsync.toCallback()));
    }
    
    @FunctionalInterface
    public interface QueryWritableNamespacesFinishCallback {
        void run();

        @ApiStatus.Internal default void upcall() {
            run();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid();
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(QueryWritableNamespacesFinishCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code _query_writable_namespaces_finish}
     * @param QueryWritableNamespacesFinish The new value of the field {@code _query_writable_namespaces_finish}
     */
    public void setQueryWritableNamespacesFinish(QueryWritableNamespacesFinishCallback QueryWritableNamespacesFinish) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("_query_writable_namespaces_finish"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (QueryWritableNamespacesFinish == null ? MemoryAddress.NULL : QueryWritableNamespacesFinish.toCallback()));
    }
    
    @FunctionalInterface
    public interface SetAttributeCallback {
        boolean run(org.gtk.gio.File file, java.lang.String attribute, org.gtk.gio.FileAttributeType type, @Nullable java.lang.foreign.MemoryAddress valueP, org.gtk.gio.FileQueryInfoFlags flags, @Nullable org.gtk.gio.Cancellable cancellable);

        @ApiStatus.Internal default int upcall(MemoryAddress file, MemoryAddress attribute, int type, MemoryAddress valueP, int flags, MemoryAddress cancellable) {
            var RESULT = run((org.gtk.gio.File) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(file)), org.gtk.gio.File.fromAddress).marshal(file, Ownership.NONE), Marshal.addressToString.marshal(attribute, null), org.gtk.gio.FileAttributeType.of(type), valueP, new org.gtk.gio.FileQueryInfoFlags(flags), (org.gtk.gio.Cancellable) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(cancellable)), org.gtk.gio.Cancellable.fromAddress).marshal(cancellable, Ownership.NONE));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(SetAttributeCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code set_attribute}
     * @param setAttribute The new value of the field {@code set_attribute}
     */
    public void setSetAttribute(SetAttributeCallback setAttribute) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("set_attribute"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (setAttribute == null ? MemoryAddress.NULL : setAttribute.toCallback()));
    }
    
    @FunctionalInterface
    public interface SetAttributesFromInfoCallback {
        boolean run(org.gtk.gio.File file, org.gtk.gio.FileInfo info, org.gtk.gio.FileQueryInfoFlags flags, @Nullable org.gtk.gio.Cancellable cancellable);

        @ApiStatus.Internal default int upcall(MemoryAddress file, MemoryAddress info, int flags, MemoryAddress cancellable) {
            var RESULT = run((org.gtk.gio.File) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(file)), org.gtk.gio.File.fromAddress).marshal(file, Ownership.NONE), (org.gtk.gio.FileInfo) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(info)), org.gtk.gio.FileInfo.fromAddress).marshal(info, Ownership.NONE), new org.gtk.gio.FileQueryInfoFlags(flags), (org.gtk.gio.Cancellable) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(cancellable)), org.gtk.gio.Cancellable.fromAddress).marshal(cancellable, Ownership.NONE));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(SetAttributesFromInfoCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code set_attributes_from_info}
     * @param setAttributesFromInfo The new value of the field {@code set_attributes_from_info}
     */
    public void setSetAttributesFromInfo(SetAttributesFromInfoCallback setAttributesFromInfo) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("set_attributes_from_info"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (setAttributesFromInfo == null ? MemoryAddress.NULL : setAttributesFromInfo.toCallback()));
    }
    
    @FunctionalInterface
    public interface SetAttributesAsyncCallback {
        void run(org.gtk.gio.File file, org.gtk.gio.FileInfo info, org.gtk.gio.FileQueryInfoFlags flags, int ioPriority, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.AsyncReadyCallback callback);

        @ApiStatus.Internal default void upcall(MemoryAddress file, MemoryAddress info, int flags, int ioPriority, MemoryAddress cancellable, MemoryAddress callback, MemoryAddress userData) {
            run((org.gtk.gio.File) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(file)), org.gtk.gio.File.fromAddress).marshal(file, Ownership.NONE), (org.gtk.gio.FileInfo) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(info)), org.gtk.gio.FileInfo.fromAddress).marshal(info, Ownership.NONE), new org.gtk.gio.FileQueryInfoFlags(flags), ioPriority, (org.gtk.gio.Cancellable) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(cancellable)), org.gtk.gio.Cancellable.fromAddress).marshal(cancellable, Ownership.NONE), null /* Unsupported parameter type */);
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(SetAttributesAsyncCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code set_attributes_async}
     * @param setAttributesAsync The new value of the field {@code set_attributes_async}
     */
    public void setSetAttributesAsync(SetAttributesAsyncCallback setAttributesAsync) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("set_attributes_async"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (setAttributesAsync == null ? MemoryAddress.NULL : setAttributesAsync.toCallback()));
    }
    
    @FunctionalInterface
    public interface SetAttributesFinishCallback {
        boolean run(org.gtk.gio.File file, org.gtk.gio.AsyncResult result, Out<org.gtk.gio.FileInfo> info);

        @ApiStatus.Internal default int upcall(MemoryAddress file, MemoryAddress result, MemoryAddress info) {
            Out<org.gtk.gio.FileInfo> infoOUT = new Out<>((org.gtk.gio.FileInfo) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(info)), org.gtk.gio.FileInfo.fromAddress).marshal(info, Ownership.FULL));
            var RESULT = run((org.gtk.gio.File) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(file)), org.gtk.gio.File.fromAddress).marshal(file, Ownership.NONE), (org.gtk.gio.AsyncResult) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(result)), org.gtk.gio.AsyncResult.fromAddress).marshal(result, Ownership.NONE), infoOUT);
            info.set(Interop.valueLayout.ADDRESS, 0, infoOUT.get().handle());
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(SetAttributesFinishCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code set_attributes_finish}
     * @param setAttributesFinish The new value of the field {@code set_attributes_finish}
     */
    public void setSetAttributesFinish(SetAttributesFinishCallback setAttributesFinish) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("set_attributes_finish"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (setAttributesFinish == null ? MemoryAddress.NULL : setAttributesFinish.toCallback()));
    }
    
    @FunctionalInterface
    public interface ReadFnCallback {
        org.gtk.gio.FileInputStream run(org.gtk.gio.File file, @Nullable org.gtk.gio.Cancellable cancellable);

        @ApiStatus.Internal default Addressable upcall(MemoryAddress file, MemoryAddress cancellable) {
            var RESULT = run((org.gtk.gio.File) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(file)), org.gtk.gio.File.fromAddress).marshal(file, Ownership.NONE), (org.gtk.gio.Cancellable) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(cancellable)), org.gtk.gio.Cancellable.fromAddress).marshal(cancellable, Ownership.NONE));
            return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(ReadFnCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code read_fn}
     * @param readFn The new value of the field {@code read_fn}
     */
    public void setReadFn(ReadFnCallback readFn) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("read_fn"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (readFn == null ? MemoryAddress.NULL : readFn.toCallback()));
    }
    
    @FunctionalInterface
    public interface ReadAsyncCallback {
        void run(org.gtk.gio.File file, int ioPriority, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.AsyncReadyCallback callback);

        @ApiStatus.Internal default void upcall(MemoryAddress file, int ioPriority, MemoryAddress cancellable, MemoryAddress callback, MemoryAddress userData) {
            run((org.gtk.gio.File) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(file)), org.gtk.gio.File.fromAddress).marshal(file, Ownership.NONE), ioPriority, (org.gtk.gio.Cancellable) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(cancellable)), org.gtk.gio.Cancellable.fromAddress).marshal(cancellable, Ownership.NONE), null /* Unsupported parameter type */);
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(ReadAsyncCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code read_async}
     * @param readAsync The new value of the field {@code read_async}
     */
    public void setReadAsync(ReadAsyncCallback readAsync) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("read_async"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (readAsync == null ? MemoryAddress.NULL : readAsync.toCallback()));
    }
    
    @FunctionalInterface
    public interface ReadFinishCallback {
        org.gtk.gio.FileInputStream run(org.gtk.gio.File file, org.gtk.gio.AsyncResult res);

        @ApiStatus.Internal default Addressable upcall(MemoryAddress file, MemoryAddress res) {
            var RESULT = run((org.gtk.gio.File) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(file)), org.gtk.gio.File.fromAddress).marshal(file, Ownership.NONE), (org.gtk.gio.AsyncResult) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(res)), org.gtk.gio.AsyncResult.fromAddress).marshal(res, Ownership.NONE));
            return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(ReadFinishCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code read_finish}
     * @param readFinish The new value of the field {@code read_finish}
     */
    public void setReadFinish(ReadFinishCallback readFinish) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("read_finish"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (readFinish == null ? MemoryAddress.NULL : readFinish.toCallback()));
    }
    
    @FunctionalInterface
    public interface AppendToCallback {
        org.gtk.gio.FileOutputStream run(org.gtk.gio.File file, org.gtk.gio.FileCreateFlags flags, @Nullable org.gtk.gio.Cancellable cancellable);

        @ApiStatus.Internal default Addressable upcall(MemoryAddress file, int flags, MemoryAddress cancellable) {
            var RESULT = run((org.gtk.gio.File) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(file)), org.gtk.gio.File.fromAddress).marshal(file, Ownership.NONE), new org.gtk.gio.FileCreateFlags(flags), (org.gtk.gio.Cancellable) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(cancellable)), org.gtk.gio.Cancellable.fromAddress).marshal(cancellable, Ownership.NONE));
            return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(AppendToCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code append_to}
     * @param appendTo The new value of the field {@code append_to}
     */
    public void setAppendTo(AppendToCallback appendTo) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("append_to"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (appendTo == null ? MemoryAddress.NULL : appendTo.toCallback()));
    }
    
    @FunctionalInterface
    public interface AppendToAsyncCallback {
        void run(org.gtk.gio.File file, org.gtk.gio.FileCreateFlags flags, int ioPriority, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.AsyncReadyCallback callback);

        @ApiStatus.Internal default void upcall(MemoryAddress file, int flags, int ioPriority, MemoryAddress cancellable, MemoryAddress callback, MemoryAddress userData) {
            run((org.gtk.gio.File) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(file)), org.gtk.gio.File.fromAddress).marshal(file, Ownership.NONE), new org.gtk.gio.FileCreateFlags(flags), ioPriority, (org.gtk.gio.Cancellable) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(cancellable)), org.gtk.gio.Cancellable.fromAddress).marshal(cancellable, Ownership.NONE), null /* Unsupported parameter type */);
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(AppendToAsyncCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code append_to_async}
     * @param appendToAsync The new value of the field {@code append_to_async}
     */
    public void setAppendToAsync(AppendToAsyncCallback appendToAsync) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("append_to_async"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (appendToAsync == null ? MemoryAddress.NULL : appendToAsync.toCallback()));
    }
    
    @FunctionalInterface
    public interface AppendToFinishCallback {
        org.gtk.gio.FileOutputStream run(org.gtk.gio.File file, org.gtk.gio.AsyncResult res);

        @ApiStatus.Internal default Addressable upcall(MemoryAddress file, MemoryAddress res) {
            var RESULT = run((org.gtk.gio.File) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(file)), org.gtk.gio.File.fromAddress).marshal(file, Ownership.NONE), (org.gtk.gio.AsyncResult) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(res)), org.gtk.gio.AsyncResult.fromAddress).marshal(res, Ownership.NONE));
            return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(AppendToFinishCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code append_to_finish}
     * @param appendToFinish The new value of the field {@code append_to_finish}
     */
    public void setAppendToFinish(AppendToFinishCallback appendToFinish) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("append_to_finish"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (appendToFinish == null ? MemoryAddress.NULL : appendToFinish.toCallback()));
    }
    
    @FunctionalInterface
    public interface CreateCallback {
        org.gtk.gio.FileOutputStream run(org.gtk.gio.File file, org.gtk.gio.FileCreateFlags flags, @Nullable org.gtk.gio.Cancellable cancellable);

        @ApiStatus.Internal default Addressable upcall(MemoryAddress file, int flags, MemoryAddress cancellable) {
            var RESULT = run((org.gtk.gio.File) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(file)), org.gtk.gio.File.fromAddress).marshal(file, Ownership.NONE), new org.gtk.gio.FileCreateFlags(flags), (org.gtk.gio.Cancellable) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(cancellable)), org.gtk.gio.Cancellable.fromAddress).marshal(cancellable, Ownership.NONE));
            return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(CreateCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code create}
     * @param create The new value of the field {@code create}
     */
    public void setCreate(CreateCallback create) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("create"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (create == null ? MemoryAddress.NULL : create.toCallback()));
    }
    
    @FunctionalInterface
    public interface CreateAsyncCallback {
        void run(org.gtk.gio.File file, org.gtk.gio.FileCreateFlags flags, int ioPriority, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.AsyncReadyCallback callback);

        @ApiStatus.Internal default void upcall(MemoryAddress file, int flags, int ioPriority, MemoryAddress cancellable, MemoryAddress callback, MemoryAddress userData) {
            run((org.gtk.gio.File) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(file)), org.gtk.gio.File.fromAddress).marshal(file, Ownership.NONE), new org.gtk.gio.FileCreateFlags(flags), ioPriority, (org.gtk.gio.Cancellable) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(cancellable)), org.gtk.gio.Cancellable.fromAddress).marshal(cancellable, Ownership.NONE), null /* Unsupported parameter type */);
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(CreateAsyncCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code create_async}
     * @param createAsync The new value of the field {@code create_async}
     */
    public void setCreateAsync(CreateAsyncCallback createAsync) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("create_async"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (createAsync == null ? MemoryAddress.NULL : createAsync.toCallback()));
    }
    
    @FunctionalInterface
    public interface CreateFinishCallback {
        org.gtk.gio.FileOutputStream run(org.gtk.gio.File file, org.gtk.gio.AsyncResult res);

        @ApiStatus.Internal default Addressable upcall(MemoryAddress file, MemoryAddress res) {
            var RESULT = run((org.gtk.gio.File) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(file)), org.gtk.gio.File.fromAddress).marshal(file, Ownership.NONE), (org.gtk.gio.AsyncResult) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(res)), org.gtk.gio.AsyncResult.fromAddress).marshal(res, Ownership.NONE));
            return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(CreateFinishCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code create_finish}
     * @param createFinish The new value of the field {@code create_finish}
     */
    public void setCreateFinish(CreateFinishCallback createFinish) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("create_finish"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (createFinish == null ? MemoryAddress.NULL : createFinish.toCallback()));
    }
    
    @FunctionalInterface
    public interface ReplaceCallback {
        org.gtk.gio.FileOutputStream run(org.gtk.gio.File file, @Nullable java.lang.String etag, boolean makeBackup, org.gtk.gio.FileCreateFlags flags, @Nullable org.gtk.gio.Cancellable cancellable);

        @ApiStatus.Internal default Addressable upcall(MemoryAddress file, MemoryAddress etag, int makeBackup, int flags, MemoryAddress cancellable) {
            var RESULT = run((org.gtk.gio.File) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(file)), org.gtk.gio.File.fromAddress).marshal(file, Ownership.NONE), Marshal.addressToString.marshal(etag, null), Marshal.integerToBoolean.marshal(makeBackup, null).booleanValue(), new org.gtk.gio.FileCreateFlags(flags), (org.gtk.gio.Cancellable) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(cancellable)), org.gtk.gio.Cancellable.fromAddress).marshal(cancellable, Ownership.NONE));
            return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(ReplaceCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code replace}
     * @param replace The new value of the field {@code replace}
     */
    public void setReplace(ReplaceCallback replace) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("replace"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (replace == null ? MemoryAddress.NULL : replace.toCallback()));
    }
    
    @FunctionalInterface
    public interface ReplaceAsyncCallback {
        void run(org.gtk.gio.File file, @Nullable java.lang.String etag, boolean makeBackup, org.gtk.gio.FileCreateFlags flags, int ioPriority, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.AsyncReadyCallback callback);

        @ApiStatus.Internal default void upcall(MemoryAddress file, MemoryAddress etag, int makeBackup, int flags, int ioPriority, MemoryAddress cancellable, MemoryAddress callback, MemoryAddress userData) {
            run((org.gtk.gio.File) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(file)), org.gtk.gio.File.fromAddress).marshal(file, Ownership.NONE), Marshal.addressToString.marshal(etag, null), Marshal.integerToBoolean.marshal(makeBackup, null).booleanValue(), new org.gtk.gio.FileCreateFlags(flags), ioPriority, (org.gtk.gio.Cancellable) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(cancellable)), org.gtk.gio.Cancellable.fromAddress).marshal(cancellable, Ownership.NONE), null /* Unsupported parameter type */);
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(ReplaceAsyncCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code replace_async}
     * @param replaceAsync The new value of the field {@code replace_async}
     */
    public void setReplaceAsync(ReplaceAsyncCallback replaceAsync) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("replace_async"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (replaceAsync == null ? MemoryAddress.NULL : replaceAsync.toCallback()));
    }
    
    @FunctionalInterface
    public interface ReplaceFinishCallback {
        org.gtk.gio.FileOutputStream run(org.gtk.gio.File file, org.gtk.gio.AsyncResult res);

        @ApiStatus.Internal default Addressable upcall(MemoryAddress file, MemoryAddress res) {
            var RESULT = run((org.gtk.gio.File) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(file)), org.gtk.gio.File.fromAddress).marshal(file, Ownership.NONE), (org.gtk.gio.AsyncResult) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(res)), org.gtk.gio.AsyncResult.fromAddress).marshal(res, Ownership.NONE));
            return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(ReplaceFinishCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code replace_finish}
     * @param replaceFinish The new value of the field {@code replace_finish}
     */
    public void setReplaceFinish(ReplaceFinishCallback replaceFinish) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("replace_finish"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (replaceFinish == null ? MemoryAddress.NULL : replaceFinish.toCallback()));
    }
    
    @FunctionalInterface
    public interface DeleteFileCallback {
        boolean run(org.gtk.gio.File file, @Nullable org.gtk.gio.Cancellable cancellable);

        @ApiStatus.Internal default int upcall(MemoryAddress file, MemoryAddress cancellable) {
            var RESULT = run((org.gtk.gio.File) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(file)), org.gtk.gio.File.fromAddress).marshal(file, Ownership.NONE), (org.gtk.gio.Cancellable) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(cancellable)), org.gtk.gio.Cancellable.fromAddress).marshal(cancellable, Ownership.NONE));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(DeleteFileCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code delete_file}
     * @param deleteFile The new value of the field {@code delete_file}
     */
    public void setDeleteFile(DeleteFileCallback deleteFile) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("delete_file"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (deleteFile == null ? MemoryAddress.NULL : deleteFile.toCallback()));
    }
    
    @FunctionalInterface
    public interface DeleteFileAsyncCallback {
        void run(org.gtk.gio.File file, int ioPriority, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.AsyncReadyCallback callback);

        @ApiStatus.Internal default void upcall(MemoryAddress file, int ioPriority, MemoryAddress cancellable, MemoryAddress callback, MemoryAddress userData) {
            run((org.gtk.gio.File) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(file)), org.gtk.gio.File.fromAddress).marshal(file, Ownership.NONE), ioPriority, (org.gtk.gio.Cancellable) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(cancellable)), org.gtk.gio.Cancellable.fromAddress).marshal(cancellable, Ownership.NONE), null /* Unsupported parameter type */);
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(DeleteFileAsyncCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code delete_file_async}
     * @param deleteFileAsync The new value of the field {@code delete_file_async}
     */
    public void setDeleteFileAsync(DeleteFileAsyncCallback deleteFileAsync) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("delete_file_async"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (deleteFileAsync == null ? MemoryAddress.NULL : deleteFileAsync.toCallback()));
    }
    
    @FunctionalInterface
    public interface DeleteFileFinishCallback {
        boolean run(org.gtk.gio.File file, org.gtk.gio.AsyncResult result);

        @ApiStatus.Internal default int upcall(MemoryAddress file, MemoryAddress result) {
            var RESULT = run((org.gtk.gio.File) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(file)), org.gtk.gio.File.fromAddress).marshal(file, Ownership.NONE), (org.gtk.gio.AsyncResult) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(result)), org.gtk.gio.AsyncResult.fromAddress).marshal(result, Ownership.NONE));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(DeleteFileFinishCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code delete_file_finish}
     * @param deleteFileFinish The new value of the field {@code delete_file_finish}
     */
    public void setDeleteFileFinish(DeleteFileFinishCallback deleteFileFinish) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("delete_file_finish"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (deleteFileFinish == null ? MemoryAddress.NULL : deleteFileFinish.toCallback()));
    }
    
    @FunctionalInterface
    public interface TrashCallback {
        boolean run(org.gtk.gio.File file, @Nullable org.gtk.gio.Cancellable cancellable);

        @ApiStatus.Internal default int upcall(MemoryAddress file, MemoryAddress cancellable) {
            var RESULT = run((org.gtk.gio.File) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(file)), org.gtk.gio.File.fromAddress).marshal(file, Ownership.NONE), (org.gtk.gio.Cancellable) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(cancellable)), org.gtk.gio.Cancellable.fromAddress).marshal(cancellable, Ownership.NONE));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(TrashCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code trash}
     * @param trash The new value of the field {@code trash}
     */
    public void setTrash(TrashCallback trash) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("trash"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (trash == null ? MemoryAddress.NULL : trash.toCallback()));
    }
    
    @FunctionalInterface
    public interface TrashAsyncCallback {
        void run(org.gtk.gio.File file, int ioPriority, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.AsyncReadyCallback callback);

        @ApiStatus.Internal default void upcall(MemoryAddress file, int ioPriority, MemoryAddress cancellable, MemoryAddress callback, MemoryAddress userData) {
            run((org.gtk.gio.File) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(file)), org.gtk.gio.File.fromAddress).marshal(file, Ownership.NONE), ioPriority, (org.gtk.gio.Cancellable) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(cancellable)), org.gtk.gio.Cancellable.fromAddress).marshal(cancellable, Ownership.NONE), null /* Unsupported parameter type */);
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(TrashAsyncCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code trash_async}
     * @param trashAsync The new value of the field {@code trash_async}
     */
    public void setTrashAsync(TrashAsyncCallback trashAsync) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("trash_async"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (trashAsync == null ? MemoryAddress.NULL : trashAsync.toCallback()));
    }
    
    @FunctionalInterface
    public interface TrashFinishCallback {
        boolean run(org.gtk.gio.File file, org.gtk.gio.AsyncResult result);

        @ApiStatus.Internal default int upcall(MemoryAddress file, MemoryAddress result) {
            var RESULT = run((org.gtk.gio.File) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(file)), org.gtk.gio.File.fromAddress).marshal(file, Ownership.NONE), (org.gtk.gio.AsyncResult) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(result)), org.gtk.gio.AsyncResult.fromAddress).marshal(result, Ownership.NONE));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(TrashFinishCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code trash_finish}
     * @param trashFinish The new value of the field {@code trash_finish}
     */
    public void setTrashFinish(TrashFinishCallback trashFinish) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("trash_finish"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (trashFinish == null ? MemoryAddress.NULL : trashFinish.toCallback()));
    }
    
    @FunctionalInterface
    public interface MakeDirectoryCallback {
        boolean run(org.gtk.gio.File file, @Nullable org.gtk.gio.Cancellable cancellable);

        @ApiStatus.Internal default int upcall(MemoryAddress file, MemoryAddress cancellable) {
            var RESULT = run((org.gtk.gio.File) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(file)), org.gtk.gio.File.fromAddress).marshal(file, Ownership.NONE), (org.gtk.gio.Cancellable) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(cancellable)), org.gtk.gio.Cancellable.fromAddress).marshal(cancellable, Ownership.NONE));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MakeDirectoryCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code make_directory}
     * @param makeDirectory The new value of the field {@code make_directory}
     */
    public void setMakeDirectory(MakeDirectoryCallback makeDirectory) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("make_directory"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (makeDirectory == null ? MemoryAddress.NULL : makeDirectory.toCallback()));
    }
    
    @FunctionalInterface
    public interface MakeDirectoryAsyncCallback {
        void run(org.gtk.gio.File file, int ioPriority, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.AsyncReadyCallback callback);

        @ApiStatus.Internal default void upcall(MemoryAddress file, int ioPriority, MemoryAddress cancellable, MemoryAddress callback, MemoryAddress userData) {
            run((org.gtk.gio.File) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(file)), org.gtk.gio.File.fromAddress).marshal(file, Ownership.NONE), ioPriority, (org.gtk.gio.Cancellable) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(cancellable)), org.gtk.gio.Cancellable.fromAddress).marshal(cancellable, Ownership.NONE), null /* Unsupported parameter type */);
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MakeDirectoryAsyncCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code make_directory_async}
     * @param makeDirectoryAsync The new value of the field {@code make_directory_async}
     */
    public void setMakeDirectoryAsync(MakeDirectoryAsyncCallback makeDirectoryAsync) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("make_directory_async"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (makeDirectoryAsync == null ? MemoryAddress.NULL : makeDirectoryAsync.toCallback()));
    }
    
    @FunctionalInterface
    public interface MakeDirectoryFinishCallback {
        boolean run(org.gtk.gio.File file, org.gtk.gio.AsyncResult result);

        @ApiStatus.Internal default int upcall(MemoryAddress file, MemoryAddress result) {
            var RESULT = run((org.gtk.gio.File) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(file)), org.gtk.gio.File.fromAddress).marshal(file, Ownership.NONE), (org.gtk.gio.AsyncResult) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(result)), org.gtk.gio.AsyncResult.fromAddress).marshal(result, Ownership.NONE));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MakeDirectoryFinishCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code make_directory_finish}
     * @param makeDirectoryFinish The new value of the field {@code make_directory_finish}
     */
    public void setMakeDirectoryFinish(MakeDirectoryFinishCallback makeDirectoryFinish) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("make_directory_finish"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (makeDirectoryFinish == null ? MemoryAddress.NULL : makeDirectoryFinish.toCallback()));
    }
    
    @FunctionalInterface
    public interface MakeSymbolicLinkCallback {
        boolean run(org.gtk.gio.File file, java.lang.String symlinkValue, @Nullable org.gtk.gio.Cancellable cancellable);

        @ApiStatus.Internal default int upcall(MemoryAddress file, MemoryAddress symlinkValue, MemoryAddress cancellable) {
            var RESULT = run((org.gtk.gio.File) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(file)), org.gtk.gio.File.fromAddress).marshal(file, Ownership.NONE), Marshal.addressToString.marshal(symlinkValue, null), (org.gtk.gio.Cancellable) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(cancellable)), org.gtk.gio.Cancellable.fromAddress).marshal(cancellable, Ownership.NONE));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MakeSymbolicLinkCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code make_symbolic_link}
     * @param makeSymbolicLink The new value of the field {@code make_symbolic_link}
     */
    public void setMakeSymbolicLink(MakeSymbolicLinkCallback makeSymbolicLink) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("make_symbolic_link"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (makeSymbolicLink == null ? MemoryAddress.NULL : makeSymbolicLink.toCallback()));
    }
    
    @FunctionalInterface
    public interface MakeSymbolicLinkAsyncCallback {
        void run(org.gtk.gio.File file, java.lang.String symlinkValue, int ioPriority, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.AsyncReadyCallback callback);

        @ApiStatus.Internal default void upcall(MemoryAddress file, MemoryAddress symlinkValue, int ioPriority, MemoryAddress cancellable, MemoryAddress callback, MemoryAddress userData) {
            run((org.gtk.gio.File) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(file)), org.gtk.gio.File.fromAddress).marshal(file, Ownership.NONE), Marshal.addressToString.marshal(symlinkValue, null), ioPriority, (org.gtk.gio.Cancellable) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(cancellable)), org.gtk.gio.Cancellable.fromAddress).marshal(cancellable, Ownership.NONE), null /* Unsupported parameter type */);
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MakeSymbolicLinkAsyncCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code make_symbolic_link_async}
     * @param makeSymbolicLinkAsync The new value of the field {@code make_symbolic_link_async}
     */
    public void setMakeSymbolicLinkAsync(MakeSymbolicLinkAsyncCallback makeSymbolicLinkAsync) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("make_symbolic_link_async"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (makeSymbolicLinkAsync == null ? MemoryAddress.NULL : makeSymbolicLinkAsync.toCallback()));
    }
    
    @FunctionalInterface
    public interface MakeSymbolicLinkFinishCallback {
        boolean run(org.gtk.gio.File file, org.gtk.gio.AsyncResult result);

        @ApiStatus.Internal default int upcall(MemoryAddress file, MemoryAddress result) {
            var RESULT = run((org.gtk.gio.File) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(file)), org.gtk.gio.File.fromAddress).marshal(file, Ownership.NONE), (org.gtk.gio.AsyncResult) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(result)), org.gtk.gio.AsyncResult.fromAddress).marshal(result, Ownership.NONE));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MakeSymbolicLinkFinishCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code make_symbolic_link_finish}
     * @param makeSymbolicLinkFinish The new value of the field {@code make_symbolic_link_finish}
     */
    public void setMakeSymbolicLinkFinish(MakeSymbolicLinkFinishCallback makeSymbolicLinkFinish) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("make_symbolic_link_finish"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (makeSymbolicLinkFinish == null ? MemoryAddress.NULL : makeSymbolicLinkFinish.toCallback()));
    }
    
    @FunctionalInterface
    public interface CopyCallback {
        boolean run(org.gtk.gio.File source, org.gtk.gio.File destination, org.gtk.gio.FileCopyFlags flags, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.FileProgressCallback progressCallback);

        @ApiStatus.Internal default int upcall(MemoryAddress source, MemoryAddress destination, int flags, MemoryAddress cancellable, MemoryAddress progressCallback, MemoryAddress progressCallbackData) {
            var RESULT = run((org.gtk.gio.File) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(source)), org.gtk.gio.File.fromAddress).marshal(source, Ownership.NONE), (org.gtk.gio.File) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(destination)), org.gtk.gio.File.fromAddress).marshal(destination, Ownership.NONE), new org.gtk.gio.FileCopyFlags(flags), (org.gtk.gio.Cancellable) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(cancellable)), org.gtk.gio.Cancellable.fromAddress).marshal(cancellable, Ownership.NONE), null /* Unsupported parameter type */);
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(CopyCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code copy}
     * @param copy The new value of the field {@code copy}
     */
    public void setCopy(CopyCallback copy) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("copy"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (copy == null ? MemoryAddress.NULL : copy.toCallback()));
    }
    
    @FunctionalInterface
    public interface CopyAsyncCallback {
        void run(org.gtk.gio.File source, org.gtk.gio.File destination, org.gtk.gio.FileCopyFlags flags, int ioPriority, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.FileProgressCallback progressCallback, @Nullable org.gtk.gio.AsyncReadyCallback callback);

        @ApiStatus.Internal default void upcall(MemoryAddress source, MemoryAddress destination, int flags, int ioPriority, MemoryAddress cancellable, MemoryAddress progressCallback, MemoryAddress progressCallbackData, MemoryAddress callback, MemoryAddress userData) {
            run((org.gtk.gio.File) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(source)), org.gtk.gio.File.fromAddress).marshal(source, Ownership.NONE), (org.gtk.gio.File) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(destination)), org.gtk.gio.File.fromAddress).marshal(destination, Ownership.NONE), new org.gtk.gio.FileCopyFlags(flags), ioPriority, (org.gtk.gio.Cancellable) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(cancellable)), org.gtk.gio.Cancellable.fromAddress).marshal(cancellable, Ownership.NONE), null /* Unsupported parameter type */, null /* Unsupported parameter type */);
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(CopyAsyncCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code copy_async}
     * @param copyAsync The new value of the field {@code copy_async}
     */
    public void setCopyAsync(CopyAsyncCallback copyAsync) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("copy_async"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (copyAsync == null ? MemoryAddress.NULL : copyAsync.toCallback()));
    }
    
    @FunctionalInterface
    public interface CopyFinishCallback {
        boolean run(org.gtk.gio.File file, org.gtk.gio.AsyncResult res);

        @ApiStatus.Internal default int upcall(MemoryAddress file, MemoryAddress res) {
            var RESULT = run((org.gtk.gio.File) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(file)), org.gtk.gio.File.fromAddress).marshal(file, Ownership.NONE), (org.gtk.gio.AsyncResult) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(res)), org.gtk.gio.AsyncResult.fromAddress).marshal(res, Ownership.NONE));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(CopyFinishCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code copy_finish}
     * @param copyFinish The new value of the field {@code copy_finish}
     */
    public void setCopyFinish(CopyFinishCallback copyFinish) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("copy_finish"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (copyFinish == null ? MemoryAddress.NULL : copyFinish.toCallback()));
    }
    
    @FunctionalInterface
    public interface MoveCallback {
        boolean run(org.gtk.gio.File source, org.gtk.gio.File destination, org.gtk.gio.FileCopyFlags flags, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.FileProgressCallback progressCallback);

        @ApiStatus.Internal default int upcall(MemoryAddress source, MemoryAddress destination, int flags, MemoryAddress cancellable, MemoryAddress progressCallback, MemoryAddress progressCallbackData) {
            var RESULT = run((org.gtk.gio.File) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(source)), org.gtk.gio.File.fromAddress).marshal(source, Ownership.NONE), (org.gtk.gio.File) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(destination)), org.gtk.gio.File.fromAddress).marshal(destination, Ownership.NONE), new org.gtk.gio.FileCopyFlags(flags), (org.gtk.gio.Cancellable) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(cancellable)), org.gtk.gio.Cancellable.fromAddress).marshal(cancellable, Ownership.NONE), null /* Unsupported parameter type */);
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MoveCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code move}
     * @param move The new value of the field {@code move}
     */
    public void setMove(MoveCallback move) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("move"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (move == null ? MemoryAddress.NULL : move.toCallback()));
    }
    
    @FunctionalInterface
    public interface MoveAsyncCallback {
        void run(org.gtk.gio.File source, org.gtk.gio.File destination, org.gtk.gio.FileCopyFlags flags, int ioPriority, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.FileProgressCallback progressCallback, @Nullable org.gtk.gio.AsyncReadyCallback callback);

        @ApiStatus.Internal default void upcall(MemoryAddress source, MemoryAddress destination, int flags, int ioPriority, MemoryAddress cancellable, MemoryAddress progressCallback, MemoryAddress progressCallbackData, MemoryAddress callback, MemoryAddress userData) {
            run((org.gtk.gio.File) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(source)), org.gtk.gio.File.fromAddress).marshal(source, Ownership.NONE), (org.gtk.gio.File) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(destination)), org.gtk.gio.File.fromAddress).marshal(destination, Ownership.NONE), new org.gtk.gio.FileCopyFlags(flags), ioPriority, (org.gtk.gio.Cancellable) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(cancellable)), org.gtk.gio.Cancellable.fromAddress).marshal(cancellable, Ownership.NONE), null /* Unsupported parameter type */, null /* Unsupported parameter type */);
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MoveAsyncCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code move_async}
     * @param moveAsync The new value of the field {@code move_async}
     */
    public void setMoveAsync(MoveAsyncCallback moveAsync) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("move_async"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (moveAsync == null ? MemoryAddress.NULL : moveAsync.toCallback()));
    }
    
    @FunctionalInterface
    public interface MoveFinishCallback {
        boolean run(org.gtk.gio.File file, org.gtk.gio.AsyncResult result);

        @ApiStatus.Internal default int upcall(MemoryAddress file, MemoryAddress result) {
            var RESULT = run((org.gtk.gio.File) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(file)), org.gtk.gio.File.fromAddress).marshal(file, Ownership.NONE), (org.gtk.gio.AsyncResult) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(result)), org.gtk.gio.AsyncResult.fromAddress).marshal(result, Ownership.NONE));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MoveFinishCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code move_finish}
     * @param moveFinish The new value of the field {@code move_finish}
     */
    public void setMoveFinish(MoveFinishCallback moveFinish) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("move_finish"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (moveFinish == null ? MemoryAddress.NULL : moveFinish.toCallback()));
    }
    
    @FunctionalInterface
    public interface MountMountableCallback {
        void run(org.gtk.gio.File file, org.gtk.gio.MountMountFlags flags, @Nullable org.gtk.gio.MountOperation mountOperation, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.AsyncReadyCallback callback);

        @ApiStatus.Internal default void upcall(MemoryAddress file, int flags, MemoryAddress mountOperation, MemoryAddress cancellable, MemoryAddress callback, MemoryAddress userData) {
            run((org.gtk.gio.File) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(file)), org.gtk.gio.File.fromAddress).marshal(file, Ownership.NONE), new org.gtk.gio.MountMountFlags(flags), (org.gtk.gio.MountOperation) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(mountOperation)), org.gtk.gio.MountOperation.fromAddress).marshal(mountOperation, Ownership.NONE), (org.gtk.gio.Cancellable) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(cancellable)), org.gtk.gio.Cancellable.fromAddress).marshal(cancellable, Ownership.NONE), null /* Unsupported parameter type */);
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MountMountableCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code mount_mountable}
     * @param mountMountable The new value of the field {@code mount_mountable}
     */
    public void setMountMountable(MountMountableCallback mountMountable) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("mount_mountable"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (mountMountable == null ? MemoryAddress.NULL : mountMountable.toCallback()));
    }
    
    @FunctionalInterface
    public interface MountMountableFinishCallback {
        org.gtk.gio.File run(org.gtk.gio.File file, org.gtk.gio.AsyncResult result);

        @ApiStatus.Internal default Addressable upcall(MemoryAddress file, MemoryAddress result) {
            var RESULT = run((org.gtk.gio.File) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(file)), org.gtk.gio.File.fromAddress).marshal(file, Ownership.NONE), (org.gtk.gio.AsyncResult) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(result)), org.gtk.gio.AsyncResult.fromAddress).marshal(result, Ownership.NONE));
            return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MountMountableFinishCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code mount_mountable_finish}
     * @param mountMountableFinish The new value of the field {@code mount_mountable_finish}
     */
    public void setMountMountableFinish(MountMountableFinishCallback mountMountableFinish) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("mount_mountable_finish"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (mountMountableFinish == null ? MemoryAddress.NULL : mountMountableFinish.toCallback()));
    }
    
    @FunctionalInterface
    public interface UnmountMountableCallback {
        void run(org.gtk.gio.File file, org.gtk.gio.MountUnmountFlags flags, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.AsyncReadyCallback callback);

        @ApiStatus.Internal default void upcall(MemoryAddress file, int flags, MemoryAddress cancellable, MemoryAddress callback, MemoryAddress userData) {
            run((org.gtk.gio.File) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(file)), org.gtk.gio.File.fromAddress).marshal(file, Ownership.NONE), new org.gtk.gio.MountUnmountFlags(flags), (org.gtk.gio.Cancellable) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(cancellable)), org.gtk.gio.Cancellable.fromAddress).marshal(cancellable, Ownership.NONE), null /* Unsupported parameter type */);
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(UnmountMountableCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code unmount_mountable}
     * @param unmountMountable The new value of the field {@code unmount_mountable}
     */
    public void setUnmountMountable(UnmountMountableCallback unmountMountable) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("unmount_mountable"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (unmountMountable == null ? MemoryAddress.NULL : unmountMountable.toCallback()));
    }
    
    @FunctionalInterface
    public interface UnmountMountableFinishCallback {
        boolean run(org.gtk.gio.File file, org.gtk.gio.AsyncResult result);

        @ApiStatus.Internal default int upcall(MemoryAddress file, MemoryAddress result) {
            var RESULT = run((org.gtk.gio.File) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(file)), org.gtk.gio.File.fromAddress).marshal(file, Ownership.NONE), (org.gtk.gio.AsyncResult) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(result)), org.gtk.gio.AsyncResult.fromAddress).marshal(result, Ownership.NONE));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(UnmountMountableFinishCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code unmount_mountable_finish}
     * @param unmountMountableFinish The new value of the field {@code unmount_mountable_finish}
     */
    public void setUnmountMountableFinish(UnmountMountableFinishCallback unmountMountableFinish) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("unmount_mountable_finish"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (unmountMountableFinish == null ? MemoryAddress.NULL : unmountMountableFinish.toCallback()));
    }
    
    @FunctionalInterface
    public interface EjectMountableCallback {
        void run(org.gtk.gio.File file, org.gtk.gio.MountUnmountFlags flags, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.AsyncReadyCallback callback);

        @ApiStatus.Internal default void upcall(MemoryAddress file, int flags, MemoryAddress cancellable, MemoryAddress callback, MemoryAddress userData) {
            run((org.gtk.gio.File) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(file)), org.gtk.gio.File.fromAddress).marshal(file, Ownership.NONE), new org.gtk.gio.MountUnmountFlags(flags), (org.gtk.gio.Cancellable) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(cancellable)), org.gtk.gio.Cancellable.fromAddress).marshal(cancellable, Ownership.NONE), null /* Unsupported parameter type */);
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(EjectMountableCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code eject_mountable}
     * @param ejectMountable The new value of the field {@code eject_mountable}
     */
    public void setEjectMountable(EjectMountableCallback ejectMountable) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("eject_mountable"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (ejectMountable == null ? MemoryAddress.NULL : ejectMountable.toCallback()));
    }
    
    @FunctionalInterface
    public interface EjectMountableFinishCallback {
        boolean run(org.gtk.gio.File file, org.gtk.gio.AsyncResult result);

        @ApiStatus.Internal default int upcall(MemoryAddress file, MemoryAddress result) {
            var RESULT = run((org.gtk.gio.File) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(file)), org.gtk.gio.File.fromAddress).marshal(file, Ownership.NONE), (org.gtk.gio.AsyncResult) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(result)), org.gtk.gio.AsyncResult.fromAddress).marshal(result, Ownership.NONE));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(EjectMountableFinishCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code eject_mountable_finish}
     * @param ejectMountableFinish The new value of the field {@code eject_mountable_finish}
     */
    public void setEjectMountableFinish(EjectMountableFinishCallback ejectMountableFinish) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("eject_mountable_finish"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (ejectMountableFinish == null ? MemoryAddress.NULL : ejectMountableFinish.toCallback()));
    }
    
    @FunctionalInterface
    public interface MountEnclosingVolumeCallback {
        void run(org.gtk.gio.File location, org.gtk.gio.MountMountFlags flags, @Nullable org.gtk.gio.MountOperation mountOperation, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.AsyncReadyCallback callback);

        @ApiStatus.Internal default void upcall(MemoryAddress location, int flags, MemoryAddress mountOperation, MemoryAddress cancellable, MemoryAddress callback, MemoryAddress userData) {
            run((org.gtk.gio.File) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(location)), org.gtk.gio.File.fromAddress).marshal(location, Ownership.NONE), new org.gtk.gio.MountMountFlags(flags), (org.gtk.gio.MountOperation) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(mountOperation)), org.gtk.gio.MountOperation.fromAddress).marshal(mountOperation, Ownership.NONE), (org.gtk.gio.Cancellable) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(cancellable)), org.gtk.gio.Cancellable.fromAddress).marshal(cancellable, Ownership.NONE), null /* Unsupported parameter type */);
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MountEnclosingVolumeCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code mount_enclosing_volume}
     * @param mountEnclosingVolume The new value of the field {@code mount_enclosing_volume}
     */
    public void setMountEnclosingVolume(MountEnclosingVolumeCallback mountEnclosingVolume) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("mount_enclosing_volume"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (mountEnclosingVolume == null ? MemoryAddress.NULL : mountEnclosingVolume.toCallback()));
    }
    
    @FunctionalInterface
    public interface MountEnclosingVolumeFinishCallback {
        boolean run(org.gtk.gio.File location, org.gtk.gio.AsyncResult result);

        @ApiStatus.Internal default int upcall(MemoryAddress location, MemoryAddress result) {
            var RESULT = run((org.gtk.gio.File) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(location)), org.gtk.gio.File.fromAddress).marshal(location, Ownership.NONE), (org.gtk.gio.AsyncResult) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(result)), org.gtk.gio.AsyncResult.fromAddress).marshal(result, Ownership.NONE));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MountEnclosingVolumeFinishCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code mount_enclosing_volume_finish}
     * @param mountEnclosingVolumeFinish The new value of the field {@code mount_enclosing_volume_finish}
     */
    public void setMountEnclosingVolumeFinish(MountEnclosingVolumeFinishCallback mountEnclosingVolumeFinish) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("mount_enclosing_volume_finish"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (mountEnclosingVolumeFinish == null ? MemoryAddress.NULL : mountEnclosingVolumeFinish.toCallback()));
    }
    
    @FunctionalInterface
    public interface MonitorDirCallback {
        org.gtk.gio.FileMonitor run(org.gtk.gio.File file, org.gtk.gio.FileMonitorFlags flags, @Nullable org.gtk.gio.Cancellable cancellable);

        @ApiStatus.Internal default Addressable upcall(MemoryAddress file, int flags, MemoryAddress cancellable) {
            var RESULT = run((org.gtk.gio.File) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(file)), org.gtk.gio.File.fromAddress).marshal(file, Ownership.NONE), new org.gtk.gio.FileMonitorFlags(flags), (org.gtk.gio.Cancellable) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(cancellable)), org.gtk.gio.Cancellable.fromAddress).marshal(cancellable, Ownership.NONE));
            return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MonitorDirCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code monitor_dir}
     * @param monitorDir The new value of the field {@code monitor_dir}
     */
    public void setMonitorDir(MonitorDirCallback monitorDir) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("monitor_dir"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (monitorDir == null ? MemoryAddress.NULL : monitorDir.toCallback()));
    }
    
    @FunctionalInterface
    public interface MonitorFileCallback {
        org.gtk.gio.FileMonitor run(org.gtk.gio.File file, org.gtk.gio.FileMonitorFlags flags, @Nullable org.gtk.gio.Cancellable cancellable);

        @ApiStatus.Internal default Addressable upcall(MemoryAddress file, int flags, MemoryAddress cancellable) {
            var RESULT = run((org.gtk.gio.File) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(file)), org.gtk.gio.File.fromAddress).marshal(file, Ownership.NONE), new org.gtk.gio.FileMonitorFlags(flags), (org.gtk.gio.Cancellable) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(cancellable)), org.gtk.gio.Cancellable.fromAddress).marshal(cancellable, Ownership.NONE));
            return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MonitorFileCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code monitor_file}
     * @param monitorFile The new value of the field {@code monitor_file}
     */
    public void setMonitorFile(MonitorFileCallback monitorFile) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("monitor_file"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (monitorFile == null ? MemoryAddress.NULL : monitorFile.toCallback()));
    }
    
    @FunctionalInterface
    public interface OpenReadwriteCallback {
        org.gtk.gio.FileIOStream run(org.gtk.gio.File file, @Nullable org.gtk.gio.Cancellable cancellable);

        @ApiStatus.Internal default Addressable upcall(MemoryAddress file, MemoryAddress cancellable) {
            var RESULT = run((org.gtk.gio.File) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(file)), org.gtk.gio.File.fromAddress).marshal(file, Ownership.NONE), (org.gtk.gio.Cancellable) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(cancellable)), org.gtk.gio.Cancellable.fromAddress).marshal(cancellable, Ownership.NONE));
            return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(OpenReadwriteCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code open_readwrite}
     * @param openReadwrite The new value of the field {@code open_readwrite}
     */
    public void setOpenReadwrite(OpenReadwriteCallback openReadwrite) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("open_readwrite"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (openReadwrite == null ? MemoryAddress.NULL : openReadwrite.toCallback()));
    }
    
    @FunctionalInterface
    public interface OpenReadwriteAsyncCallback {
        void run(org.gtk.gio.File file, int ioPriority, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.AsyncReadyCallback callback);

        @ApiStatus.Internal default void upcall(MemoryAddress file, int ioPriority, MemoryAddress cancellable, MemoryAddress callback, MemoryAddress userData) {
            run((org.gtk.gio.File) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(file)), org.gtk.gio.File.fromAddress).marshal(file, Ownership.NONE), ioPriority, (org.gtk.gio.Cancellable) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(cancellable)), org.gtk.gio.Cancellable.fromAddress).marshal(cancellable, Ownership.NONE), null /* Unsupported parameter type */);
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(OpenReadwriteAsyncCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code open_readwrite_async}
     * @param openReadwriteAsync The new value of the field {@code open_readwrite_async}
     */
    public void setOpenReadwriteAsync(OpenReadwriteAsyncCallback openReadwriteAsync) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("open_readwrite_async"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (openReadwriteAsync == null ? MemoryAddress.NULL : openReadwriteAsync.toCallback()));
    }
    
    @FunctionalInterface
    public interface OpenReadwriteFinishCallback {
        org.gtk.gio.FileIOStream run(org.gtk.gio.File file, org.gtk.gio.AsyncResult res);

        @ApiStatus.Internal default Addressable upcall(MemoryAddress file, MemoryAddress res) {
            var RESULT = run((org.gtk.gio.File) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(file)), org.gtk.gio.File.fromAddress).marshal(file, Ownership.NONE), (org.gtk.gio.AsyncResult) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(res)), org.gtk.gio.AsyncResult.fromAddress).marshal(res, Ownership.NONE));
            return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(OpenReadwriteFinishCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code open_readwrite_finish}
     * @param openReadwriteFinish The new value of the field {@code open_readwrite_finish}
     */
    public void setOpenReadwriteFinish(OpenReadwriteFinishCallback openReadwriteFinish) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("open_readwrite_finish"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (openReadwriteFinish == null ? MemoryAddress.NULL : openReadwriteFinish.toCallback()));
    }
    
    @FunctionalInterface
    public interface CreateReadwriteCallback {
        org.gtk.gio.FileIOStream run(org.gtk.gio.File file, org.gtk.gio.FileCreateFlags flags, @Nullable org.gtk.gio.Cancellable cancellable);

        @ApiStatus.Internal default Addressable upcall(MemoryAddress file, int flags, MemoryAddress cancellable) {
            var RESULT = run((org.gtk.gio.File) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(file)), org.gtk.gio.File.fromAddress).marshal(file, Ownership.NONE), new org.gtk.gio.FileCreateFlags(flags), (org.gtk.gio.Cancellable) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(cancellable)), org.gtk.gio.Cancellable.fromAddress).marshal(cancellable, Ownership.NONE));
            return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(CreateReadwriteCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code create_readwrite}
     * @param createReadwrite The new value of the field {@code create_readwrite}
     */
    public void setCreateReadwrite(CreateReadwriteCallback createReadwrite) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("create_readwrite"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (createReadwrite == null ? MemoryAddress.NULL : createReadwrite.toCallback()));
    }
    
    @FunctionalInterface
    public interface CreateReadwriteAsyncCallback {
        void run(org.gtk.gio.File file, org.gtk.gio.FileCreateFlags flags, int ioPriority, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.AsyncReadyCallback callback);

        @ApiStatus.Internal default void upcall(MemoryAddress file, int flags, int ioPriority, MemoryAddress cancellable, MemoryAddress callback, MemoryAddress userData) {
            run((org.gtk.gio.File) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(file)), org.gtk.gio.File.fromAddress).marshal(file, Ownership.NONE), new org.gtk.gio.FileCreateFlags(flags), ioPriority, (org.gtk.gio.Cancellable) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(cancellable)), org.gtk.gio.Cancellable.fromAddress).marshal(cancellable, Ownership.NONE), null /* Unsupported parameter type */);
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(CreateReadwriteAsyncCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code create_readwrite_async}
     * @param createReadwriteAsync The new value of the field {@code create_readwrite_async}
     */
    public void setCreateReadwriteAsync(CreateReadwriteAsyncCallback createReadwriteAsync) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("create_readwrite_async"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (createReadwriteAsync == null ? MemoryAddress.NULL : createReadwriteAsync.toCallback()));
    }
    
    @FunctionalInterface
    public interface CreateReadwriteFinishCallback {
        org.gtk.gio.FileIOStream run(org.gtk.gio.File file, org.gtk.gio.AsyncResult res);

        @ApiStatus.Internal default Addressable upcall(MemoryAddress file, MemoryAddress res) {
            var RESULT = run((org.gtk.gio.File) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(file)), org.gtk.gio.File.fromAddress).marshal(file, Ownership.NONE), (org.gtk.gio.AsyncResult) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(res)), org.gtk.gio.AsyncResult.fromAddress).marshal(res, Ownership.NONE));
            return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(CreateReadwriteFinishCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code create_readwrite_finish}
     * @param createReadwriteFinish The new value of the field {@code create_readwrite_finish}
     */
    public void setCreateReadwriteFinish(CreateReadwriteFinishCallback createReadwriteFinish) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("create_readwrite_finish"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (createReadwriteFinish == null ? MemoryAddress.NULL : createReadwriteFinish.toCallback()));
    }
    
    @FunctionalInterface
    public interface ReplaceReadwriteCallback {
        org.gtk.gio.FileIOStream run(org.gtk.gio.File file, @Nullable java.lang.String etag, boolean makeBackup, org.gtk.gio.FileCreateFlags flags, @Nullable org.gtk.gio.Cancellable cancellable);

        @ApiStatus.Internal default Addressable upcall(MemoryAddress file, MemoryAddress etag, int makeBackup, int flags, MemoryAddress cancellable) {
            var RESULT = run((org.gtk.gio.File) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(file)), org.gtk.gio.File.fromAddress).marshal(file, Ownership.NONE), Marshal.addressToString.marshal(etag, null), Marshal.integerToBoolean.marshal(makeBackup, null).booleanValue(), new org.gtk.gio.FileCreateFlags(flags), (org.gtk.gio.Cancellable) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(cancellable)), org.gtk.gio.Cancellable.fromAddress).marshal(cancellable, Ownership.NONE));
            return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(ReplaceReadwriteCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code replace_readwrite}
     * @param replaceReadwrite The new value of the field {@code replace_readwrite}
     */
    public void setReplaceReadwrite(ReplaceReadwriteCallback replaceReadwrite) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("replace_readwrite"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (replaceReadwrite == null ? MemoryAddress.NULL : replaceReadwrite.toCallback()));
    }
    
    @FunctionalInterface
    public interface ReplaceReadwriteAsyncCallback {
        void run(org.gtk.gio.File file, @Nullable java.lang.String etag, boolean makeBackup, org.gtk.gio.FileCreateFlags flags, int ioPriority, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.AsyncReadyCallback callback);

        @ApiStatus.Internal default void upcall(MemoryAddress file, MemoryAddress etag, int makeBackup, int flags, int ioPriority, MemoryAddress cancellable, MemoryAddress callback, MemoryAddress userData) {
            run((org.gtk.gio.File) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(file)), org.gtk.gio.File.fromAddress).marshal(file, Ownership.NONE), Marshal.addressToString.marshal(etag, null), Marshal.integerToBoolean.marshal(makeBackup, null).booleanValue(), new org.gtk.gio.FileCreateFlags(flags), ioPriority, (org.gtk.gio.Cancellable) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(cancellable)), org.gtk.gio.Cancellable.fromAddress).marshal(cancellable, Ownership.NONE), null /* Unsupported parameter type */);
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(ReplaceReadwriteAsyncCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code replace_readwrite_async}
     * @param replaceReadwriteAsync The new value of the field {@code replace_readwrite_async}
     */
    public void setReplaceReadwriteAsync(ReplaceReadwriteAsyncCallback replaceReadwriteAsync) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("replace_readwrite_async"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (replaceReadwriteAsync == null ? MemoryAddress.NULL : replaceReadwriteAsync.toCallback()));
    }
    
    @FunctionalInterface
    public interface ReplaceReadwriteFinishCallback {
        org.gtk.gio.FileIOStream run(org.gtk.gio.File file, org.gtk.gio.AsyncResult res);

        @ApiStatus.Internal default Addressable upcall(MemoryAddress file, MemoryAddress res) {
            var RESULT = run((org.gtk.gio.File) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(file)), org.gtk.gio.File.fromAddress).marshal(file, Ownership.NONE), (org.gtk.gio.AsyncResult) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(res)), org.gtk.gio.AsyncResult.fromAddress).marshal(res, Ownership.NONE));
            return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(ReplaceReadwriteFinishCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code replace_readwrite_finish}
     * @param replaceReadwriteFinish The new value of the field {@code replace_readwrite_finish}
     */
    public void setReplaceReadwriteFinish(ReplaceReadwriteFinishCallback replaceReadwriteFinish) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("replace_readwrite_finish"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (replaceReadwriteFinish == null ? MemoryAddress.NULL : replaceReadwriteFinish.toCallback()));
    }
    
    @FunctionalInterface
    public interface StartMountableCallback {
        void run(org.gtk.gio.File file, org.gtk.gio.DriveStartFlags flags, @Nullable org.gtk.gio.MountOperation startOperation, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.AsyncReadyCallback callback);

        @ApiStatus.Internal default void upcall(MemoryAddress file, int flags, MemoryAddress startOperation, MemoryAddress cancellable, MemoryAddress callback, MemoryAddress userData) {
            run((org.gtk.gio.File) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(file)), org.gtk.gio.File.fromAddress).marshal(file, Ownership.NONE), new org.gtk.gio.DriveStartFlags(flags), (org.gtk.gio.MountOperation) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(startOperation)), org.gtk.gio.MountOperation.fromAddress).marshal(startOperation, Ownership.NONE), (org.gtk.gio.Cancellable) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(cancellable)), org.gtk.gio.Cancellable.fromAddress).marshal(cancellable, Ownership.NONE), null /* Unsupported parameter type */);
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(StartMountableCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code start_mountable}
     * @param startMountable The new value of the field {@code start_mountable}
     */
    public void setStartMountable(StartMountableCallback startMountable) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("start_mountable"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (startMountable == null ? MemoryAddress.NULL : startMountable.toCallback()));
    }
    
    @FunctionalInterface
    public interface StartMountableFinishCallback {
        boolean run(org.gtk.gio.File file, org.gtk.gio.AsyncResult result);

        @ApiStatus.Internal default int upcall(MemoryAddress file, MemoryAddress result) {
            var RESULT = run((org.gtk.gio.File) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(file)), org.gtk.gio.File.fromAddress).marshal(file, Ownership.NONE), (org.gtk.gio.AsyncResult) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(result)), org.gtk.gio.AsyncResult.fromAddress).marshal(result, Ownership.NONE));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(StartMountableFinishCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code start_mountable_finish}
     * @param startMountableFinish The new value of the field {@code start_mountable_finish}
     */
    public void setStartMountableFinish(StartMountableFinishCallback startMountableFinish) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("start_mountable_finish"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (startMountableFinish == null ? MemoryAddress.NULL : startMountableFinish.toCallback()));
    }
    
    @FunctionalInterface
    public interface StopMountableCallback {
        void run(org.gtk.gio.File file, org.gtk.gio.MountUnmountFlags flags, @Nullable org.gtk.gio.MountOperation mountOperation, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.AsyncReadyCallback callback);

        @ApiStatus.Internal default void upcall(MemoryAddress file, int flags, MemoryAddress mountOperation, MemoryAddress cancellable, MemoryAddress callback, MemoryAddress userData) {
            run((org.gtk.gio.File) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(file)), org.gtk.gio.File.fromAddress).marshal(file, Ownership.NONE), new org.gtk.gio.MountUnmountFlags(flags), (org.gtk.gio.MountOperation) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(mountOperation)), org.gtk.gio.MountOperation.fromAddress).marshal(mountOperation, Ownership.NONE), (org.gtk.gio.Cancellable) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(cancellable)), org.gtk.gio.Cancellable.fromAddress).marshal(cancellable, Ownership.NONE), null /* Unsupported parameter type */);
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(StopMountableCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code stop_mountable}
     * @param stopMountable The new value of the field {@code stop_mountable}
     */
    public void setStopMountable(StopMountableCallback stopMountable) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("stop_mountable"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (stopMountable == null ? MemoryAddress.NULL : stopMountable.toCallback()));
    }
    
    @FunctionalInterface
    public interface StopMountableFinishCallback {
        boolean run(org.gtk.gio.File file, org.gtk.gio.AsyncResult result);

        @ApiStatus.Internal default int upcall(MemoryAddress file, MemoryAddress result) {
            var RESULT = run((org.gtk.gio.File) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(file)), org.gtk.gio.File.fromAddress).marshal(file, Ownership.NONE), (org.gtk.gio.AsyncResult) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(result)), org.gtk.gio.AsyncResult.fromAddress).marshal(result, Ownership.NONE));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(StopMountableFinishCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code stop_mountable_finish}
     * @param stopMountableFinish The new value of the field {@code stop_mountable_finish}
     */
    public void setStopMountableFinish(StopMountableFinishCallback stopMountableFinish) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("stop_mountable_finish"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (stopMountableFinish == null ? MemoryAddress.NULL : stopMountableFinish.toCallback()));
    }
    
    /**
     * Get the value of the field {@code supports_thread_contexts}
     * @return The value of the field {@code supports_thread_contexts}
     */
    public boolean getSupportsThreadContexts() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("supports_thread_contexts"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Change the value of the field {@code supports_thread_contexts}
     * @param supportsThreadContexts The new value of the field {@code supports_thread_contexts}
     */
    public void setSupportsThreadContexts(boolean supportsThreadContexts) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("supports_thread_contexts"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), Marshal.booleanToInteger.marshal(supportsThreadContexts, null).intValue());
    }
    
    @FunctionalInterface
    public interface UnmountMountableWithOperationCallback {
        void run(org.gtk.gio.File file, org.gtk.gio.MountUnmountFlags flags, @Nullable org.gtk.gio.MountOperation mountOperation, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.AsyncReadyCallback callback);

        @ApiStatus.Internal default void upcall(MemoryAddress file, int flags, MemoryAddress mountOperation, MemoryAddress cancellable, MemoryAddress callback, MemoryAddress userData) {
            run((org.gtk.gio.File) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(file)), org.gtk.gio.File.fromAddress).marshal(file, Ownership.NONE), new org.gtk.gio.MountUnmountFlags(flags), (org.gtk.gio.MountOperation) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(mountOperation)), org.gtk.gio.MountOperation.fromAddress).marshal(mountOperation, Ownership.NONE), (org.gtk.gio.Cancellable) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(cancellable)), org.gtk.gio.Cancellable.fromAddress).marshal(cancellable, Ownership.NONE), null /* Unsupported parameter type */);
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(UnmountMountableWithOperationCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code unmount_mountable_with_operation}
     * @param unmountMountableWithOperation The new value of the field {@code unmount_mountable_with_operation}
     */
    public void setUnmountMountableWithOperation(UnmountMountableWithOperationCallback unmountMountableWithOperation) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("unmount_mountable_with_operation"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (unmountMountableWithOperation == null ? MemoryAddress.NULL : unmountMountableWithOperation.toCallback()));
    }
    
    @FunctionalInterface
    public interface UnmountMountableWithOperationFinishCallback {
        boolean run(org.gtk.gio.File file, org.gtk.gio.AsyncResult result);

        @ApiStatus.Internal default int upcall(MemoryAddress file, MemoryAddress result) {
            var RESULT = run((org.gtk.gio.File) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(file)), org.gtk.gio.File.fromAddress).marshal(file, Ownership.NONE), (org.gtk.gio.AsyncResult) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(result)), org.gtk.gio.AsyncResult.fromAddress).marshal(result, Ownership.NONE));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(UnmountMountableWithOperationFinishCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code unmount_mountable_with_operation_finish}
     * @param unmountMountableWithOperationFinish The new value of the field {@code unmount_mountable_with_operation_finish}
     */
    public void setUnmountMountableWithOperationFinish(UnmountMountableWithOperationFinishCallback unmountMountableWithOperationFinish) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("unmount_mountable_with_operation_finish"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (unmountMountableWithOperationFinish == null ? MemoryAddress.NULL : unmountMountableWithOperationFinish.toCallback()));
    }
    
    @FunctionalInterface
    public interface EjectMountableWithOperationCallback {
        void run(org.gtk.gio.File file, org.gtk.gio.MountUnmountFlags flags, @Nullable org.gtk.gio.MountOperation mountOperation, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.AsyncReadyCallback callback);

        @ApiStatus.Internal default void upcall(MemoryAddress file, int flags, MemoryAddress mountOperation, MemoryAddress cancellable, MemoryAddress callback, MemoryAddress userData) {
            run((org.gtk.gio.File) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(file)), org.gtk.gio.File.fromAddress).marshal(file, Ownership.NONE), new org.gtk.gio.MountUnmountFlags(flags), (org.gtk.gio.MountOperation) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(mountOperation)), org.gtk.gio.MountOperation.fromAddress).marshal(mountOperation, Ownership.NONE), (org.gtk.gio.Cancellable) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(cancellable)), org.gtk.gio.Cancellable.fromAddress).marshal(cancellable, Ownership.NONE), null /* Unsupported parameter type */);
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(EjectMountableWithOperationCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code eject_mountable_with_operation}
     * @param ejectMountableWithOperation The new value of the field {@code eject_mountable_with_operation}
     */
    public void setEjectMountableWithOperation(EjectMountableWithOperationCallback ejectMountableWithOperation) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("eject_mountable_with_operation"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (ejectMountableWithOperation == null ? MemoryAddress.NULL : ejectMountableWithOperation.toCallback()));
    }
    
    @FunctionalInterface
    public interface EjectMountableWithOperationFinishCallback {
        boolean run(org.gtk.gio.File file, org.gtk.gio.AsyncResult result);

        @ApiStatus.Internal default int upcall(MemoryAddress file, MemoryAddress result) {
            var RESULT = run((org.gtk.gio.File) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(file)), org.gtk.gio.File.fromAddress).marshal(file, Ownership.NONE), (org.gtk.gio.AsyncResult) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(result)), org.gtk.gio.AsyncResult.fromAddress).marshal(result, Ownership.NONE));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(EjectMountableWithOperationFinishCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code eject_mountable_with_operation_finish}
     * @param ejectMountableWithOperationFinish The new value of the field {@code eject_mountable_with_operation_finish}
     */
    public void setEjectMountableWithOperationFinish(EjectMountableWithOperationFinishCallback ejectMountableWithOperationFinish) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("eject_mountable_with_operation_finish"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (ejectMountableWithOperationFinish == null ? MemoryAddress.NULL : ejectMountableWithOperationFinish.toCallback()));
    }
    
    @FunctionalInterface
    public interface PollMountableCallback {
        void run(org.gtk.gio.File file, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.AsyncReadyCallback callback);

        @ApiStatus.Internal default void upcall(MemoryAddress file, MemoryAddress cancellable, MemoryAddress callback, MemoryAddress userData) {
            run((org.gtk.gio.File) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(file)), org.gtk.gio.File.fromAddress).marshal(file, Ownership.NONE), (org.gtk.gio.Cancellable) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(cancellable)), org.gtk.gio.Cancellable.fromAddress).marshal(cancellable, Ownership.NONE), null /* Unsupported parameter type */);
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(PollMountableCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code poll_mountable}
     * @param pollMountable The new value of the field {@code poll_mountable}
     */
    public void setPollMountable(PollMountableCallback pollMountable) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("poll_mountable"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (pollMountable == null ? MemoryAddress.NULL : pollMountable.toCallback()));
    }
    
    @FunctionalInterface
    public interface PollMountableFinishCallback {
        boolean run(org.gtk.gio.File file, org.gtk.gio.AsyncResult result);

        @ApiStatus.Internal default int upcall(MemoryAddress file, MemoryAddress result) {
            var RESULT = run((org.gtk.gio.File) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(file)), org.gtk.gio.File.fromAddress).marshal(file, Ownership.NONE), (org.gtk.gio.AsyncResult) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(result)), org.gtk.gio.AsyncResult.fromAddress).marshal(result, Ownership.NONE));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(PollMountableFinishCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code poll_mountable_finish}
     * @param pollMountableFinish The new value of the field {@code poll_mountable_finish}
     */
    public void setPollMountableFinish(PollMountableFinishCallback pollMountableFinish) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("poll_mountable_finish"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (pollMountableFinish == null ? MemoryAddress.NULL : pollMountableFinish.toCallback()));
    }
    
    @FunctionalInterface
    public interface MeasureDiskUsageCallback {
        boolean run(org.gtk.gio.File file, org.gtk.gio.FileMeasureFlags flags, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.FileMeasureProgressCallback progressCallback, Out<Long> diskUsage, Out<Long> numDirs, Out<Long> numFiles);

        @ApiStatus.Internal default int upcall(MemoryAddress file, int flags, MemoryAddress cancellable, MemoryAddress progressCallback, MemoryAddress progressData, MemoryAddress diskUsage, MemoryAddress numDirs, MemoryAddress numFiles) {
            Out<Long> diskUsageOUT = new Out<>(diskUsage.get(Interop.valueLayout.C_LONG, 0));
            Out<Long> numDirsOUT = new Out<>(numDirs.get(Interop.valueLayout.C_LONG, 0));
            Out<Long> numFilesOUT = new Out<>(numFiles.get(Interop.valueLayout.C_LONG, 0));
            var RESULT = run((org.gtk.gio.File) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(file)), org.gtk.gio.File.fromAddress).marshal(file, Ownership.NONE), new org.gtk.gio.FileMeasureFlags(flags), (org.gtk.gio.Cancellable) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(cancellable)), org.gtk.gio.Cancellable.fromAddress).marshal(cancellable, Ownership.NONE), null /* Unsupported parameter type */, diskUsageOUT, numDirsOUT, numFilesOUT);
            diskUsage.set(Interop.valueLayout.C_LONG, 0, diskUsageOUT.get());
            numDirs.set(Interop.valueLayout.C_LONG, 0, numDirsOUT.get());
            numFiles.set(Interop.valueLayout.C_LONG, 0, numFilesOUT.get());
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MeasureDiskUsageCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code measure_disk_usage}
     * @param measureDiskUsage The new value of the field {@code measure_disk_usage}
     */
    public void setMeasureDiskUsage(MeasureDiskUsageCallback measureDiskUsage) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("measure_disk_usage"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (measureDiskUsage == null ? MemoryAddress.NULL : measureDiskUsage.toCallback()));
    }
    
    @FunctionalInterface
    public interface MeasureDiskUsageAsyncCallback {
        void run(org.gtk.gio.File file, org.gtk.gio.FileMeasureFlags flags, int ioPriority, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.FileMeasureProgressCallback progressCallback, @Nullable org.gtk.gio.AsyncReadyCallback callback);

        @ApiStatus.Internal default void upcall(MemoryAddress file, int flags, int ioPriority, MemoryAddress cancellable, MemoryAddress progressCallback, MemoryAddress progressData, MemoryAddress callback, MemoryAddress userData) {
            run((org.gtk.gio.File) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(file)), org.gtk.gio.File.fromAddress).marshal(file, Ownership.NONE), new org.gtk.gio.FileMeasureFlags(flags), ioPriority, (org.gtk.gio.Cancellable) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(cancellable)), org.gtk.gio.Cancellable.fromAddress).marshal(cancellable, Ownership.NONE), null /* Unsupported parameter type */, null /* Unsupported parameter type */);
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MeasureDiskUsageAsyncCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code measure_disk_usage_async}
     * @param measureDiskUsageAsync The new value of the field {@code measure_disk_usage_async}
     */
    public void setMeasureDiskUsageAsync(MeasureDiskUsageAsyncCallback measureDiskUsageAsync) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("measure_disk_usage_async"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (measureDiskUsageAsync == null ? MemoryAddress.NULL : measureDiskUsageAsync.toCallback()));
    }
    
    @FunctionalInterface
    public interface MeasureDiskUsageFinishCallback {
        boolean run(org.gtk.gio.File file, org.gtk.gio.AsyncResult result, Out<Long> diskUsage, Out<Long> numDirs, Out<Long> numFiles);

        @ApiStatus.Internal default int upcall(MemoryAddress file, MemoryAddress result, MemoryAddress diskUsage, MemoryAddress numDirs, MemoryAddress numFiles) {
            Out<Long> diskUsageOUT = new Out<>(diskUsage.get(Interop.valueLayout.C_LONG, 0));
            Out<Long> numDirsOUT = new Out<>(numDirs.get(Interop.valueLayout.C_LONG, 0));
            Out<Long> numFilesOUT = new Out<>(numFiles.get(Interop.valueLayout.C_LONG, 0));
            var RESULT = run((org.gtk.gio.File) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(file)), org.gtk.gio.File.fromAddress).marshal(file, Ownership.NONE), (org.gtk.gio.AsyncResult) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(result)), org.gtk.gio.AsyncResult.fromAddress).marshal(result, Ownership.NONE), diskUsageOUT, numDirsOUT, numFilesOUT);
            diskUsage.set(Interop.valueLayout.C_LONG, 0, diskUsageOUT.get());
            numDirs.set(Interop.valueLayout.C_LONG, 0, numDirsOUT.get());
            numFiles.set(Interop.valueLayout.C_LONG, 0, numFilesOUT.get());
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MeasureDiskUsageFinishCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code measure_disk_usage_finish}
     * @param measureDiskUsageFinish The new value of the field {@code measure_disk_usage_finish}
     */
    public void setMeasureDiskUsageFinish(MeasureDiskUsageFinishCallback measureDiskUsageFinish) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("measure_disk_usage_finish"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (measureDiskUsageFinish == null ? MemoryAddress.NULL : measureDiskUsageFinish.toCallback()));
    }
    
    /**
     * Create a FileIface proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected FileIface(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, FileIface> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new FileIface(input, ownership);
    
    /**
     * A {@link FileIface.Builder} object constructs a {@link FileIface} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link FileIface.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final FileIface struct;
        
        private Builder() {
            struct = FileIface.allocate();
        }
        
         /**
         * Finish building the {@link FileIface} struct.
         * @return A new instance of {@code FileIface} with the fields 
         *         that were set in the Builder object.
         */
        public FileIface build() {
            return struct;
        }
        
        /**
         * The parent interface.
         * @param gIface The value for the {@code gIface} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setGIface(org.gtk.gobject.TypeInterface gIface) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("g_iface"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (gIface == null ? MemoryAddress.NULL : gIface.handle()));
            return this;
        }
        
        public Builder setDup(DupCallback dup) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("dup"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (dup == null ? MemoryAddress.NULL : dup.toCallback()));
            return this;
        }
        
        public Builder setHash(HashCallback hash) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("hash"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (hash == null ? MemoryAddress.NULL : hash.toCallback()));
            return this;
        }
        
        public Builder setEqual(EqualCallback equal) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("equal"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (equal == null ? MemoryAddress.NULL : equal.toCallback()));
            return this;
        }
        
        public Builder setIsNative(IsNativeCallback isNative) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("is_native"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (isNative == null ? MemoryAddress.NULL : isNative.toCallback()));
            return this;
        }
        
        public Builder setHasUriScheme(HasUriSchemeCallback hasUriScheme) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("has_uri_scheme"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (hasUriScheme == null ? MemoryAddress.NULL : hasUriScheme.toCallback()));
            return this;
        }
        
        public Builder setGetUriScheme(GetUriSchemeCallback getUriScheme) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_uri_scheme"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getUriScheme == null ? MemoryAddress.NULL : getUriScheme.toCallback()));
            return this;
        }
        
        public Builder setGetBasename(GetBasenameCallback getBasename) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_basename"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getBasename == null ? MemoryAddress.NULL : getBasename.toCallback()));
            return this;
        }
        
        public Builder setGetPath(GetPathCallback getPath) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_path"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getPath == null ? MemoryAddress.NULL : getPath.toCallback()));
            return this;
        }
        
        public Builder setGetUri(GetUriCallback getUri) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_uri"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getUri == null ? MemoryAddress.NULL : getUri.toCallback()));
            return this;
        }
        
        public Builder setGetParseName(GetParseNameCallback getParseName) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_parse_name"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getParseName == null ? MemoryAddress.NULL : getParseName.toCallback()));
            return this;
        }
        
        public Builder setGetParent(GetParentCallback getParent) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_parent"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getParent == null ? MemoryAddress.NULL : getParent.toCallback()));
            return this;
        }
        
        public Builder setPrefixMatches(PrefixMatchesCallback prefixMatches) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("prefix_matches"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (prefixMatches == null ? MemoryAddress.NULL : prefixMatches.toCallback()));
            return this;
        }
        
        public Builder setGetRelativePath(GetRelativePathCallback getRelativePath) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_relative_path"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getRelativePath == null ? MemoryAddress.NULL : getRelativePath.toCallback()));
            return this;
        }
        
        public Builder setResolveRelativePath(ResolveRelativePathCallback resolveRelativePath) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("resolve_relative_path"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (resolveRelativePath == null ? MemoryAddress.NULL : resolveRelativePath.toCallback()));
            return this;
        }
        
        public Builder setGetChildForDisplayName(GetChildForDisplayNameCallback getChildForDisplayName) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_child_for_display_name"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getChildForDisplayName == null ? MemoryAddress.NULL : getChildForDisplayName.toCallback()));
            return this;
        }
        
        public Builder setEnumerateChildren(EnumerateChildrenCallback enumerateChildren) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("enumerate_children"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (enumerateChildren == null ? MemoryAddress.NULL : enumerateChildren.toCallback()));
            return this;
        }
        
        public Builder setEnumerateChildrenAsync(EnumerateChildrenAsyncCallback enumerateChildrenAsync) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("enumerate_children_async"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (enumerateChildrenAsync == null ? MemoryAddress.NULL : enumerateChildrenAsync.toCallback()));
            return this;
        }
        
        public Builder setEnumerateChildrenFinish(EnumerateChildrenFinishCallback enumerateChildrenFinish) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("enumerate_children_finish"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (enumerateChildrenFinish == null ? MemoryAddress.NULL : enumerateChildrenFinish.toCallback()));
            return this;
        }
        
        public Builder setQueryInfo(QueryInfoCallback queryInfo) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("query_info"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (queryInfo == null ? MemoryAddress.NULL : queryInfo.toCallback()));
            return this;
        }
        
        public Builder setQueryInfoAsync(QueryInfoAsyncCallback queryInfoAsync) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("query_info_async"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (queryInfoAsync == null ? MemoryAddress.NULL : queryInfoAsync.toCallback()));
            return this;
        }
        
        public Builder setQueryInfoFinish(QueryInfoFinishCallback queryInfoFinish) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("query_info_finish"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (queryInfoFinish == null ? MemoryAddress.NULL : queryInfoFinish.toCallback()));
            return this;
        }
        
        public Builder setQueryFilesystemInfo(QueryFilesystemInfoCallback queryFilesystemInfo) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("query_filesystem_info"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (queryFilesystemInfo == null ? MemoryAddress.NULL : queryFilesystemInfo.toCallback()));
            return this;
        }
        
        public Builder setQueryFilesystemInfoAsync(QueryFilesystemInfoAsyncCallback queryFilesystemInfoAsync) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("query_filesystem_info_async"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (queryFilesystemInfoAsync == null ? MemoryAddress.NULL : queryFilesystemInfoAsync.toCallback()));
            return this;
        }
        
        public Builder setQueryFilesystemInfoFinish(QueryFilesystemInfoFinishCallback queryFilesystemInfoFinish) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("query_filesystem_info_finish"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (queryFilesystemInfoFinish == null ? MemoryAddress.NULL : queryFilesystemInfoFinish.toCallback()));
            return this;
        }
        
        public Builder setFindEnclosingMount(FindEnclosingMountCallback findEnclosingMount) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("find_enclosing_mount"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (findEnclosingMount == null ? MemoryAddress.NULL : findEnclosingMount.toCallback()));
            return this;
        }
        
        public Builder setFindEnclosingMountAsync(FindEnclosingMountAsyncCallback findEnclosingMountAsync) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("find_enclosing_mount_async"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (findEnclosingMountAsync == null ? MemoryAddress.NULL : findEnclosingMountAsync.toCallback()));
            return this;
        }
        
        public Builder setFindEnclosingMountFinish(FindEnclosingMountFinishCallback findEnclosingMountFinish) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("find_enclosing_mount_finish"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (findEnclosingMountFinish == null ? MemoryAddress.NULL : findEnclosingMountFinish.toCallback()));
            return this;
        }
        
        public Builder setSetDisplayName(SetDisplayNameCallback setDisplayName) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("set_display_name"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (setDisplayName == null ? MemoryAddress.NULL : setDisplayName.toCallback()));
            return this;
        }
        
        public Builder setSetDisplayNameAsync(SetDisplayNameAsyncCallback setDisplayNameAsync) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("set_display_name_async"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (setDisplayNameAsync == null ? MemoryAddress.NULL : setDisplayNameAsync.toCallback()));
            return this;
        }
        
        public Builder setSetDisplayNameFinish(SetDisplayNameFinishCallback setDisplayNameFinish) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("set_display_name_finish"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (setDisplayNameFinish == null ? MemoryAddress.NULL : setDisplayNameFinish.toCallback()));
            return this;
        }
        
        public Builder setQuerySettableAttributes(QuerySettableAttributesCallback querySettableAttributes) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("query_settable_attributes"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (querySettableAttributes == null ? MemoryAddress.NULL : querySettableAttributes.toCallback()));
            return this;
        }
        
        public Builder setQuerySettableAttributesAsync(QuerySettableAttributesAsyncCallback QuerySettableAttributesAsync) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("_query_settable_attributes_async"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (QuerySettableAttributesAsync == null ? MemoryAddress.NULL : QuerySettableAttributesAsync.toCallback()));
            return this;
        }
        
        public Builder setQuerySettableAttributesFinish(QuerySettableAttributesFinishCallback QuerySettableAttributesFinish) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("_query_settable_attributes_finish"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (QuerySettableAttributesFinish == null ? MemoryAddress.NULL : QuerySettableAttributesFinish.toCallback()));
            return this;
        }
        
        public Builder setQueryWritableNamespaces(QueryWritableNamespacesCallback queryWritableNamespaces) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("query_writable_namespaces"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (queryWritableNamespaces == null ? MemoryAddress.NULL : queryWritableNamespaces.toCallback()));
            return this;
        }
        
        public Builder setQueryWritableNamespacesAsync(QueryWritableNamespacesAsyncCallback QueryWritableNamespacesAsync) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("_query_writable_namespaces_async"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (QueryWritableNamespacesAsync == null ? MemoryAddress.NULL : QueryWritableNamespacesAsync.toCallback()));
            return this;
        }
        
        public Builder setQueryWritableNamespacesFinish(QueryWritableNamespacesFinishCallback QueryWritableNamespacesFinish) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("_query_writable_namespaces_finish"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (QueryWritableNamespacesFinish == null ? MemoryAddress.NULL : QueryWritableNamespacesFinish.toCallback()));
            return this;
        }
        
        public Builder setSetAttribute(SetAttributeCallback setAttribute) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("set_attribute"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (setAttribute == null ? MemoryAddress.NULL : setAttribute.toCallback()));
            return this;
        }
        
        public Builder setSetAttributesFromInfo(SetAttributesFromInfoCallback setAttributesFromInfo) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("set_attributes_from_info"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (setAttributesFromInfo == null ? MemoryAddress.NULL : setAttributesFromInfo.toCallback()));
            return this;
        }
        
        public Builder setSetAttributesAsync(SetAttributesAsyncCallback setAttributesAsync) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("set_attributes_async"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (setAttributesAsync == null ? MemoryAddress.NULL : setAttributesAsync.toCallback()));
            return this;
        }
        
        public Builder setSetAttributesFinish(SetAttributesFinishCallback setAttributesFinish) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("set_attributes_finish"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (setAttributesFinish == null ? MemoryAddress.NULL : setAttributesFinish.toCallback()));
            return this;
        }
        
        public Builder setReadFn(ReadFnCallback readFn) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("read_fn"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (readFn == null ? MemoryAddress.NULL : readFn.toCallback()));
            return this;
        }
        
        public Builder setReadAsync(ReadAsyncCallback readAsync) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("read_async"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (readAsync == null ? MemoryAddress.NULL : readAsync.toCallback()));
            return this;
        }
        
        public Builder setReadFinish(ReadFinishCallback readFinish) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("read_finish"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (readFinish == null ? MemoryAddress.NULL : readFinish.toCallback()));
            return this;
        }
        
        public Builder setAppendTo(AppendToCallback appendTo) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("append_to"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (appendTo == null ? MemoryAddress.NULL : appendTo.toCallback()));
            return this;
        }
        
        public Builder setAppendToAsync(AppendToAsyncCallback appendToAsync) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("append_to_async"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (appendToAsync == null ? MemoryAddress.NULL : appendToAsync.toCallback()));
            return this;
        }
        
        public Builder setAppendToFinish(AppendToFinishCallback appendToFinish) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("append_to_finish"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (appendToFinish == null ? MemoryAddress.NULL : appendToFinish.toCallback()));
            return this;
        }
        
        public Builder setCreate(CreateCallback create) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("create"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (create == null ? MemoryAddress.NULL : create.toCallback()));
            return this;
        }
        
        public Builder setCreateAsync(CreateAsyncCallback createAsync) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("create_async"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (createAsync == null ? MemoryAddress.NULL : createAsync.toCallback()));
            return this;
        }
        
        public Builder setCreateFinish(CreateFinishCallback createFinish) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("create_finish"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (createFinish == null ? MemoryAddress.NULL : createFinish.toCallback()));
            return this;
        }
        
        public Builder setReplace(ReplaceCallback replace) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("replace"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (replace == null ? MemoryAddress.NULL : replace.toCallback()));
            return this;
        }
        
        public Builder setReplaceAsync(ReplaceAsyncCallback replaceAsync) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("replace_async"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (replaceAsync == null ? MemoryAddress.NULL : replaceAsync.toCallback()));
            return this;
        }
        
        public Builder setReplaceFinish(ReplaceFinishCallback replaceFinish) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("replace_finish"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (replaceFinish == null ? MemoryAddress.NULL : replaceFinish.toCallback()));
            return this;
        }
        
        public Builder setDeleteFile(DeleteFileCallback deleteFile) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("delete_file"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (deleteFile == null ? MemoryAddress.NULL : deleteFile.toCallback()));
            return this;
        }
        
        public Builder setDeleteFileAsync(DeleteFileAsyncCallback deleteFileAsync) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("delete_file_async"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (deleteFileAsync == null ? MemoryAddress.NULL : deleteFileAsync.toCallback()));
            return this;
        }
        
        public Builder setDeleteFileFinish(DeleteFileFinishCallback deleteFileFinish) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("delete_file_finish"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (deleteFileFinish == null ? MemoryAddress.NULL : deleteFileFinish.toCallback()));
            return this;
        }
        
        public Builder setTrash(TrashCallback trash) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("trash"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (trash == null ? MemoryAddress.NULL : trash.toCallback()));
            return this;
        }
        
        public Builder setTrashAsync(TrashAsyncCallback trashAsync) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("trash_async"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (trashAsync == null ? MemoryAddress.NULL : trashAsync.toCallback()));
            return this;
        }
        
        public Builder setTrashFinish(TrashFinishCallback trashFinish) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("trash_finish"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (trashFinish == null ? MemoryAddress.NULL : trashFinish.toCallback()));
            return this;
        }
        
        public Builder setMakeDirectory(MakeDirectoryCallback makeDirectory) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("make_directory"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (makeDirectory == null ? MemoryAddress.NULL : makeDirectory.toCallback()));
            return this;
        }
        
        public Builder setMakeDirectoryAsync(MakeDirectoryAsyncCallback makeDirectoryAsync) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("make_directory_async"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (makeDirectoryAsync == null ? MemoryAddress.NULL : makeDirectoryAsync.toCallback()));
            return this;
        }
        
        public Builder setMakeDirectoryFinish(MakeDirectoryFinishCallback makeDirectoryFinish) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("make_directory_finish"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (makeDirectoryFinish == null ? MemoryAddress.NULL : makeDirectoryFinish.toCallback()));
            return this;
        }
        
        public Builder setMakeSymbolicLink(MakeSymbolicLinkCallback makeSymbolicLink) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("make_symbolic_link"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (makeSymbolicLink == null ? MemoryAddress.NULL : makeSymbolicLink.toCallback()));
            return this;
        }
        
        public Builder setMakeSymbolicLinkAsync(MakeSymbolicLinkAsyncCallback makeSymbolicLinkAsync) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("make_symbolic_link_async"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (makeSymbolicLinkAsync == null ? MemoryAddress.NULL : makeSymbolicLinkAsync.toCallback()));
            return this;
        }
        
        public Builder setMakeSymbolicLinkFinish(MakeSymbolicLinkFinishCallback makeSymbolicLinkFinish) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("make_symbolic_link_finish"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (makeSymbolicLinkFinish == null ? MemoryAddress.NULL : makeSymbolicLinkFinish.toCallback()));
            return this;
        }
        
        public Builder setCopy(CopyCallback copy) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("copy"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (copy == null ? MemoryAddress.NULL : copy.toCallback()));
            return this;
        }
        
        public Builder setCopyAsync(CopyAsyncCallback copyAsync) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("copy_async"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (copyAsync == null ? MemoryAddress.NULL : copyAsync.toCallback()));
            return this;
        }
        
        public Builder setCopyFinish(CopyFinishCallback copyFinish) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("copy_finish"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (copyFinish == null ? MemoryAddress.NULL : copyFinish.toCallback()));
            return this;
        }
        
        public Builder setMove(MoveCallback move) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("move"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (move == null ? MemoryAddress.NULL : move.toCallback()));
            return this;
        }
        
        public Builder setMoveAsync(MoveAsyncCallback moveAsync) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("move_async"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (moveAsync == null ? MemoryAddress.NULL : moveAsync.toCallback()));
            return this;
        }
        
        public Builder setMoveFinish(MoveFinishCallback moveFinish) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("move_finish"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (moveFinish == null ? MemoryAddress.NULL : moveFinish.toCallback()));
            return this;
        }
        
        public Builder setMountMountable(MountMountableCallback mountMountable) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("mount_mountable"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (mountMountable == null ? MemoryAddress.NULL : mountMountable.toCallback()));
            return this;
        }
        
        public Builder setMountMountableFinish(MountMountableFinishCallback mountMountableFinish) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("mount_mountable_finish"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (mountMountableFinish == null ? MemoryAddress.NULL : mountMountableFinish.toCallback()));
            return this;
        }
        
        public Builder setUnmountMountable(UnmountMountableCallback unmountMountable) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("unmount_mountable"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (unmountMountable == null ? MemoryAddress.NULL : unmountMountable.toCallback()));
            return this;
        }
        
        public Builder setUnmountMountableFinish(UnmountMountableFinishCallback unmountMountableFinish) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("unmount_mountable_finish"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (unmountMountableFinish == null ? MemoryAddress.NULL : unmountMountableFinish.toCallback()));
            return this;
        }
        
        public Builder setEjectMountable(EjectMountableCallback ejectMountable) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("eject_mountable"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (ejectMountable == null ? MemoryAddress.NULL : ejectMountable.toCallback()));
            return this;
        }
        
        public Builder setEjectMountableFinish(EjectMountableFinishCallback ejectMountableFinish) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("eject_mountable_finish"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (ejectMountableFinish == null ? MemoryAddress.NULL : ejectMountableFinish.toCallback()));
            return this;
        }
        
        public Builder setMountEnclosingVolume(MountEnclosingVolumeCallback mountEnclosingVolume) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("mount_enclosing_volume"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (mountEnclosingVolume == null ? MemoryAddress.NULL : mountEnclosingVolume.toCallback()));
            return this;
        }
        
        public Builder setMountEnclosingVolumeFinish(MountEnclosingVolumeFinishCallback mountEnclosingVolumeFinish) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("mount_enclosing_volume_finish"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (mountEnclosingVolumeFinish == null ? MemoryAddress.NULL : mountEnclosingVolumeFinish.toCallback()));
            return this;
        }
        
        public Builder setMonitorDir(MonitorDirCallback monitorDir) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("monitor_dir"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (monitorDir == null ? MemoryAddress.NULL : monitorDir.toCallback()));
            return this;
        }
        
        public Builder setMonitorFile(MonitorFileCallback monitorFile) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("monitor_file"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (monitorFile == null ? MemoryAddress.NULL : monitorFile.toCallback()));
            return this;
        }
        
        public Builder setOpenReadwrite(OpenReadwriteCallback openReadwrite) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("open_readwrite"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (openReadwrite == null ? MemoryAddress.NULL : openReadwrite.toCallback()));
            return this;
        }
        
        public Builder setOpenReadwriteAsync(OpenReadwriteAsyncCallback openReadwriteAsync) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("open_readwrite_async"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (openReadwriteAsync == null ? MemoryAddress.NULL : openReadwriteAsync.toCallback()));
            return this;
        }
        
        public Builder setOpenReadwriteFinish(OpenReadwriteFinishCallback openReadwriteFinish) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("open_readwrite_finish"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (openReadwriteFinish == null ? MemoryAddress.NULL : openReadwriteFinish.toCallback()));
            return this;
        }
        
        public Builder setCreateReadwrite(CreateReadwriteCallback createReadwrite) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("create_readwrite"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (createReadwrite == null ? MemoryAddress.NULL : createReadwrite.toCallback()));
            return this;
        }
        
        public Builder setCreateReadwriteAsync(CreateReadwriteAsyncCallback createReadwriteAsync) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("create_readwrite_async"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (createReadwriteAsync == null ? MemoryAddress.NULL : createReadwriteAsync.toCallback()));
            return this;
        }
        
        public Builder setCreateReadwriteFinish(CreateReadwriteFinishCallback createReadwriteFinish) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("create_readwrite_finish"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (createReadwriteFinish == null ? MemoryAddress.NULL : createReadwriteFinish.toCallback()));
            return this;
        }
        
        public Builder setReplaceReadwrite(ReplaceReadwriteCallback replaceReadwrite) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("replace_readwrite"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (replaceReadwrite == null ? MemoryAddress.NULL : replaceReadwrite.toCallback()));
            return this;
        }
        
        public Builder setReplaceReadwriteAsync(ReplaceReadwriteAsyncCallback replaceReadwriteAsync) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("replace_readwrite_async"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (replaceReadwriteAsync == null ? MemoryAddress.NULL : replaceReadwriteAsync.toCallback()));
            return this;
        }
        
        public Builder setReplaceReadwriteFinish(ReplaceReadwriteFinishCallback replaceReadwriteFinish) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("replace_readwrite_finish"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (replaceReadwriteFinish == null ? MemoryAddress.NULL : replaceReadwriteFinish.toCallback()));
            return this;
        }
        
        public Builder setStartMountable(StartMountableCallback startMountable) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("start_mountable"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (startMountable == null ? MemoryAddress.NULL : startMountable.toCallback()));
            return this;
        }
        
        public Builder setStartMountableFinish(StartMountableFinishCallback startMountableFinish) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("start_mountable_finish"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (startMountableFinish == null ? MemoryAddress.NULL : startMountableFinish.toCallback()));
            return this;
        }
        
        public Builder setStopMountable(StopMountableCallback stopMountable) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("stop_mountable"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (stopMountable == null ? MemoryAddress.NULL : stopMountable.toCallback()));
            return this;
        }
        
        public Builder setStopMountableFinish(StopMountableFinishCallback stopMountableFinish) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("stop_mountable_finish"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (stopMountableFinish == null ? MemoryAddress.NULL : stopMountableFinish.toCallback()));
            return this;
        }
        
        /**
         * a boolean that indicates whether the {@link File} implementation supports thread-default contexts. Since 2.22.
         * @param supportsThreadContexts The value for the {@code supportsThreadContexts} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setSupportsThreadContexts(boolean supportsThreadContexts) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("supports_thread_contexts"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), Marshal.booleanToInteger.marshal(supportsThreadContexts, null).intValue());
            return this;
        }
        
        public Builder setUnmountMountableWithOperation(UnmountMountableWithOperationCallback unmountMountableWithOperation) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("unmount_mountable_with_operation"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (unmountMountableWithOperation == null ? MemoryAddress.NULL : unmountMountableWithOperation.toCallback()));
            return this;
        }
        
        public Builder setUnmountMountableWithOperationFinish(UnmountMountableWithOperationFinishCallback unmountMountableWithOperationFinish) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("unmount_mountable_with_operation_finish"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (unmountMountableWithOperationFinish == null ? MemoryAddress.NULL : unmountMountableWithOperationFinish.toCallback()));
            return this;
        }
        
        public Builder setEjectMountableWithOperation(EjectMountableWithOperationCallback ejectMountableWithOperation) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("eject_mountable_with_operation"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (ejectMountableWithOperation == null ? MemoryAddress.NULL : ejectMountableWithOperation.toCallback()));
            return this;
        }
        
        public Builder setEjectMountableWithOperationFinish(EjectMountableWithOperationFinishCallback ejectMountableWithOperationFinish) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("eject_mountable_with_operation_finish"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (ejectMountableWithOperationFinish == null ? MemoryAddress.NULL : ejectMountableWithOperationFinish.toCallback()));
            return this;
        }
        
        public Builder setPollMountable(PollMountableCallback pollMountable) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("poll_mountable"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (pollMountable == null ? MemoryAddress.NULL : pollMountable.toCallback()));
            return this;
        }
        
        public Builder setPollMountableFinish(PollMountableFinishCallback pollMountableFinish) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("poll_mountable_finish"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (pollMountableFinish == null ? MemoryAddress.NULL : pollMountableFinish.toCallback()));
            return this;
        }
        
        public Builder setMeasureDiskUsage(MeasureDiskUsageCallback measureDiskUsage) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("measure_disk_usage"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (measureDiskUsage == null ? MemoryAddress.NULL : measureDiskUsage.toCallback()));
            return this;
        }
        
        public Builder setMeasureDiskUsageAsync(MeasureDiskUsageAsyncCallback measureDiskUsageAsync) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("measure_disk_usage_async"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (measureDiskUsageAsync == null ? MemoryAddress.NULL : measureDiskUsageAsync.toCallback()));
            return this;
        }
        
        public Builder setMeasureDiskUsageFinish(MeasureDiskUsageFinishCallback measureDiskUsageFinish) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("measure_disk_usage_finish"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (measureDiskUsageFinish == null ? MemoryAddress.NULL : measureDiskUsageFinish.toCallback()));
            return this;
        }
    }
}
