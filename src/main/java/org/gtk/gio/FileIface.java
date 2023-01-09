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
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        FileIface newInstance = new FileIface(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code g_iface}
     * @return The value of the field {@code g_iface}
     */
    public org.gtk.gobject.TypeInterface getGIface() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("g_iface"));
        return org.gtk.gobject.TypeInterface.fromAddress.marshal(((MemoryAddress) handle()).addOffset(OFFSET), null);
    }
    
    /**
     * Change the value of the field {@code g_iface}
     * @param gIface The new value of the field {@code g_iface}
     */
    public void setGIface(org.gtk.gobject.TypeInterface gIface) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("g_iface"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (gIface == null ? MemoryAddress.NULL : gIface.handle()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code DupCallback} callback.
     */
    @FunctionalInterface
    public interface DupCallback {
    
        org.gtk.gio.File run(org.gtk.gio.File file);
        
        @ApiStatus.Internal default Addressable upcall(MemoryAddress file) {
            var RESULT = run((org.gtk.gio.File) Interop.register(file, org.gtk.gio.File.fromAddress).marshal(file, null));
            RESULT.yieldOwnership();
            return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), DupCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code dup}
     * @param dup The new value of the field {@code dup}
     */
    public void setDup(DupCallback dup) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("dup"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (dup == null ? MemoryAddress.NULL : dup.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code HashCallback} callback.
     */
    @FunctionalInterface
    public interface HashCallback {
    
        int run(org.gtk.gio.File file);
        
        @ApiStatus.Internal default int upcall(MemoryAddress file) {
            var RESULT = run((org.gtk.gio.File) Interop.register(file, org.gtk.gio.File.fromAddress).marshal(file, null));
            return RESULT;
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), HashCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code hash}
     * @param hash The new value of the field {@code hash}
     */
    public void setHash(HashCallback hash) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("hash"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (hash == null ? MemoryAddress.NULL : hash.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code EqualCallback} callback.
     */
    @FunctionalInterface
    public interface EqualCallback {
    
        boolean run(org.gtk.gio.File file1, org.gtk.gio.File file2);
        
        @ApiStatus.Internal default int upcall(MemoryAddress file1, MemoryAddress file2) {
            var RESULT = run((org.gtk.gio.File) Interop.register(file1, org.gtk.gio.File.fromAddress).marshal(file1, null), (org.gtk.gio.File) Interop.register(file2, org.gtk.gio.File.fromAddress).marshal(file2, null));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), EqualCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code equal}
     * @param equal The new value of the field {@code equal}
     */
    public void setEqual(EqualCallback equal) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("equal"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (equal == null ? MemoryAddress.NULL : equal.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code IsNativeCallback} callback.
     */
    @FunctionalInterface
    public interface IsNativeCallback {
    
        boolean run(org.gtk.gio.File file);
        
        @ApiStatus.Internal default int upcall(MemoryAddress file) {
            var RESULT = run((org.gtk.gio.File) Interop.register(file, org.gtk.gio.File.fromAddress).marshal(file, null));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), IsNativeCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code is_native}
     * @param isNative The new value of the field {@code is_native}
     */
    public void setIsNative(IsNativeCallback isNative) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("is_native"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (isNative == null ? MemoryAddress.NULL : isNative.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code HasUriSchemeCallback} callback.
     */
    @FunctionalInterface
    public interface HasUriSchemeCallback {
    
        boolean run(org.gtk.gio.File file, java.lang.String uriScheme);
        
        @ApiStatus.Internal default int upcall(MemoryAddress file, MemoryAddress uriScheme) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                var RESULT = run((org.gtk.gio.File) Interop.register(file, org.gtk.gio.File.fromAddress).marshal(file, null), Marshal.addressToString.marshal(uriScheme, null));
                return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
            }
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), HasUriSchemeCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code has_uri_scheme}
     * @param hasUriScheme The new value of the field {@code has_uri_scheme}
     */
    public void setHasUriScheme(HasUriSchemeCallback hasUriScheme) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("has_uri_scheme"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (hasUriScheme == null ? MemoryAddress.NULL : hasUriScheme.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code GetUriSchemeCallback} callback.
     */
    @FunctionalInterface
    public interface GetUriSchemeCallback {
    
        @Nullable java.lang.String run(org.gtk.gio.File file);
        
        @ApiStatus.Internal default Addressable upcall(MemoryAddress file) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                var RESULT = run((org.gtk.gio.File) Interop.register(file, org.gtk.gio.File.fromAddress).marshal(file, null));
                return RESULT == null ? MemoryAddress.NULL.address() : (Marshal.stringToAddress.marshal(RESULT, SCOPE)).address();
            }
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), GetUriSchemeCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_uri_scheme}
     * @param getUriScheme The new value of the field {@code get_uri_scheme}
     */
    public void setGetUriScheme(GetUriSchemeCallback getUriScheme) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_uri_scheme"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getUriScheme == null ? MemoryAddress.NULL : getUriScheme.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code GetBasenameCallback} callback.
     */
    @FunctionalInterface
    public interface GetBasenameCallback {
    
        @Nullable java.lang.String run(org.gtk.gio.File file);
        
        @ApiStatus.Internal default Addressable upcall(MemoryAddress file) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                var RESULT = run((org.gtk.gio.File) Interop.register(file, org.gtk.gio.File.fromAddress).marshal(file, null));
                return RESULT == null ? MemoryAddress.NULL.address() : (Marshal.stringToAddress.marshal(RESULT, SCOPE)).address();
            }
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), GetBasenameCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_basename}
     * @param getBasename The new value of the field {@code get_basename}
     */
    public void setGetBasename(GetBasenameCallback getBasename) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_basename"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getBasename == null ? MemoryAddress.NULL : getBasename.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code GetPathCallback} callback.
     */
    @FunctionalInterface
    public interface GetPathCallback {
    
        @Nullable java.lang.String run(org.gtk.gio.File file);
        
        @ApiStatus.Internal default Addressable upcall(MemoryAddress file) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                var RESULT = run((org.gtk.gio.File) Interop.register(file, org.gtk.gio.File.fromAddress).marshal(file, null));
                return RESULT == null ? MemoryAddress.NULL.address() : (Marshal.stringToAddress.marshal(RESULT, SCOPE)).address();
            }
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), GetPathCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_path}
     * @param getPath The new value of the field {@code get_path}
     */
    public void setGetPath(GetPathCallback getPath) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_path"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getPath == null ? MemoryAddress.NULL : getPath.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code GetUriCallback} callback.
     */
    @FunctionalInterface
    public interface GetUriCallback {
    
        java.lang.String run(org.gtk.gio.File file);
        
        @ApiStatus.Internal default Addressable upcall(MemoryAddress file) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                var RESULT = run((org.gtk.gio.File) Interop.register(file, org.gtk.gio.File.fromAddress).marshal(file, null));
                return RESULT == null ? MemoryAddress.NULL.address() : (Marshal.stringToAddress.marshal(RESULT, SCOPE)).address();
            }
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), GetUriCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_uri}
     * @param getUri The new value of the field {@code get_uri}
     */
    public void setGetUri(GetUriCallback getUri) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_uri"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getUri == null ? MemoryAddress.NULL : getUri.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code GetParseNameCallback} callback.
     */
    @FunctionalInterface
    public interface GetParseNameCallback {
    
        java.lang.String run(org.gtk.gio.File file);
        
        @ApiStatus.Internal default Addressable upcall(MemoryAddress file) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                var RESULT = run((org.gtk.gio.File) Interop.register(file, org.gtk.gio.File.fromAddress).marshal(file, null));
                return RESULT == null ? MemoryAddress.NULL.address() : (Marshal.stringToAddress.marshal(RESULT, SCOPE)).address();
            }
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), GetParseNameCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_parse_name}
     * @param getParseName The new value of the field {@code get_parse_name}
     */
    public void setGetParseName(GetParseNameCallback getParseName) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_parse_name"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getParseName == null ? MemoryAddress.NULL : getParseName.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code GetParentCallback} callback.
     */
    @FunctionalInterface
    public interface GetParentCallback {
    
        @Nullable org.gtk.gio.File run(org.gtk.gio.File file);
        
        @ApiStatus.Internal default Addressable upcall(MemoryAddress file) {
            var RESULT = run((org.gtk.gio.File) Interop.register(file, org.gtk.gio.File.fromAddress).marshal(file, null));
            RESULT.yieldOwnership();
            return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), GetParentCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_parent}
     * @param getParent The new value of the field {@code get_parent}
     */
    public void setGetParent(GetParentCallback getParent) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_parent"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getParent == null ? MemoryAddress.NULL : getParent.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code PrefixMatchesCallback} callback.
     */
    @FunctionalInterface
    public interface PrefixMatchesCallback {
    
        boolean run(org.gtk.gio.File prefix, org.gtk.gio.File file);
        
        @ApiStatus.Internal default int upcall(MemoryAddress prefix, MemoryAddress file) {
            var RESULT = run((org.gtk.gio.File) Interop.register(prefix, org.gtk.gio.File.fromAddress).marshal(prefix, null), (org.gtk.gio.File) Interop.register(file, org.gtk.gio.File.fromAddress).marshal(file, null));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), PrefixMatchesCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code prefix_matches}
     * @param prefixMatches The new value of the field {@code prefix_matches}
     */
    public void setPrefixMatches(PrefixMatchesCallback prefixMatches) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("prefix_matches"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (prefixMatches == null ? MemoryAddress.NULL : prefixMatches.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code GetRelativePathCallback} callback.
     */
    @FunctionalInterface
    public interface GetRelativePathCallback {
    
        @Nullable java.lang.String run(org.gtk.gio.File parent, org.gtk.gio.File descendant);
        
        @ApiStatus.Internal default Addressable upcall(MemoryAddress parent, MemoryAddress descendant) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                var RESULT = run((org.gtk.gio.File) Interop.register(parent, org.gtk.gio.File.fromAddress).marshal(parent, null), (org.gtk.gio.File) Interop.register(descendant, org.gtk.gio.File.fromAddress).marshal(descendant, null));
                return RESULT == null ? MemoryAddress.NULL.address() : (Marshal.stringToAddress.marshal(RESULT, SCOPE)).address();
            }
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), GetRelativePathCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_relative_path}
     * @param getRelativePath The new value of the field {@code get_relative_path}
     */
    public void setGetRelativePath(GetRelativePathCallback getRelativePath) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_relative_path"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getRelativePath == null ? MemoryAddress.NULL : getRelativePath.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code ResolveRelativePathCallback} callback.
     */
    @FunctionalInterface
    public interface ResolveRelativePathCallback {
    
        org.gtk.gio.File run(org.gtk.gio.File file, java.lang.String relativePath);
        
        @ApiStatus.Internal default Addressable upcall(MemoryAddress file, MemoryAddress relativePath) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                var RESULT = run((org.gtk.gio.File) Interop.register(file, org.gtk.gio.File.fromAddress).marshal(file, null), Marshal.addressToString.marshal(relativePath, null));
                RESULT.yieldOwnership();
                return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
            }
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), ResolveRelativePathCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code resolve_relative_path}
     * @param resolveRelativePath The new value of the field {@code resolve_relative_path}
     */
    public void setResolveRelativePath(ResolveRelativePathCallback resolveRelativePath) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("resolve_relative_path"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (resolveRelativePath == null ? MemoryAddress.NULL : resolveRelativePath.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code GetChildForDisplayNameCallback} callback.
     */
    @FunctionalInterface
    public interface GetChildForDisplayNameCallback {
    
        org.gtk.gio.File run(org.gtk.gio.File file, java.lang.String displayName);
        
        @ApiStatus.Internal default Addressable upcall(MemoryAddress file, MemoryAddress displayName) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                var RESULT = run((org.gtk.gio.File) Interop.register(file, org.gtk.gio.File.fromAddress).marshal(file, null), Marshal.addressToString.marshal(displayName, null));
                RESULT.yieldOwnership();
                return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
            }
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), GetChildForDisplayNameCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_child_for_display_name}
     * @param getChildForDisplayName The new value of the field {@code get_child_for_display_name}
     */
    public void setGetChildForDisplayName(GetChildForDisplayNameCallback getChildForDisplayName) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_child_for_display_name"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getChildForDisplayName == null ? MemoryAddress.NULL : getChildForDisplayName.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code EnumerateChildrenCallback} callback.
     */
    @FunctionalInterface
    public interface EnumerateChildrenCallback {
    
        org.gtk.gio.FileEnumerator run(org.gtk.gio.File file, java.lang.String attributes, org.gtk.gio.FileQueryInfoFlags flags, @Nullable org.gtk.gio.Cancellable cancellable);
        
        @ApiStatus.Internal default Addressable upcall(MemoryAddress file, MemoryAddress attributes, int flags, MemoryAddress cancellable) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                var RESULT = run((org.gtk.gio.File) Interop.register(file, org.gtk.gio.File.fromAddress).marshal(file, null), Marshal.addressToString.marshal(attributes, null), new org.gtk.gio.FileQueryInfoFlags(flags), (org.gtk.gio.Cancellable) Interop.register(cancellable, org.gtk.gio.Cancellable.fromAddress).marshal(cancellable, null));
                RESULT.yieldOwnership();
                return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
            }
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), EnumerateChildrenCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code enumerate_children}
     * @param enumerateChildren The new value of the field {@code enumerate_children}
     */
    public void setEnumerateChildren(EnumerateChildrenCallback enumerateChildren) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("enumerate_children"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (enumerateChildren == null ? MemoryAddress.NULL : enumerateChildren.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code EnumerateChildrenAsyncCallback} callback.
     */
    @FunctionalInterface
    public interface EnumerateChildrenAsyncCallback {
    
        void run(org.gtk.gio.File file, java.lang.String attributes, org.gtk.gio.FileQueryInfoFlags flags, int ioPriority, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.AsyncReadyCallback callback);
        
        @ApiStatus.Internal default void upcall(MemoryAddress file, MemoryAddress attributes, int flags, int ioPriority, MemoryAddress cancellable, MemoryAddress callback, MemoryAddress userData) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                run((org.gtk.gio.File) Interop.register(file, org.gtk.gio.File.fromAddress).marshal(file, null), Marshal.addressToString.marshal(attributes, null), new org.gtk.gio.FileQueryInfoFlags(flags), ioPriority, (org.gtk.gio.Cancellable) Interop.register(cancellable, org.gtk.gio.Cancellable.fromAddress).marshal(cancellable, null), null /* Unsupported parameter type */);
            }
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), EnumerateChildrenAsyncCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code enumerate_children_async}
     * @param enumerateChildrenAsync The new value of the field {@code enumerate_children_async}
     */
    public void setEnumerateChildrenAsync(EnumerateChildrenAsyncCallback enumerateChildrenAsync) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("enumerate_children_async"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (enumerateChildrenAsync == null ? MemoryAddress.NULL : enumerateChildrenAsync.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code EnumerateChildrenFinishCallback} callback.
     */
    @FunctionalInterface
    public interface EnumerateChildrenFinishCallback {
    
        org.gtk.gio.FileEnumerator run(org.gtk.gio.File file, org.gtk.gio.AsyncResult res);
        
        @ApiStatus.Internal default Addressable upcall(MemoryAddress file, MemoryAddress res) {
            var RESULT = run((org.gtk.gio.File) Interop.register(file, org.gtk.gio.File.fromAddress).marshal(file, null), (org.gtk.gio.AsyncResult) Interop.register(res, org.gtk.gio.AsyncResult.fromAddress).marshal(res, null));
            RESULT.yieldOwnership();
            return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), EnumerateChildrenFinishCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code enumerate_children_finish}
     * @param enumerateChildrenFinish The new value of the field {@code enumerate_children_finish}
     */
    public void setEnumerateChildrenFinish(EnumerateChildrenFinishCallback enumerateChildrenFinish) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("enumerate_children_finish"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (enumerateChildrenFinish == null ? MemoryAddress.NULL : enumerateChildrenFinish.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code QueryInfoCallback} callback.
     */
    @FunctionalInterface
    public interface QueryInfoCallback {
    
        org.gtk.gio.FileInfo run(org.gtk.gio.File file, java.lang.String attributes, org.gtk.gio.FileQueryInfoFlags flags, @Nullable org.gtk.gio.Cancellable cancellable);
        
        @ApiStatus.Internal default Addressable upcall(MemoryAddress file, MemoryAddress attributes, int flags, MemoryAddress cancellable) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                var RESULT = run((org.gtk.gio.File) Interop.register(file, org.gtk.gio.File.fromAddress).marshal(file, null), Marshal.addressToString.marshal(attributes, null), new org.gtk.gio.FileQueryInfoFlags(flags), (org.gtk.gio.Cancellable) Interop.register(cancellable, org.gtk.gio.Cancellable.fromAddress).marshal(cancellable, null));
                RESULT.yieldOwnership();
                return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
            }
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), QueryInfoCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code query_info}
     * @param queryInfo The new value of the field {@code query_info}
     */
    public void setQueryInfo(QueryInfoCallback queryInfo) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("query_info"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (queryInfo == null ? MemoryAddress.NULL : queryInfo.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code QueryInfoAsyncCallback} callback.
     */
    @FunctionalInterface
    public interface QueryInfoAsyncCallback {
    
        void run(org.gtk.gio.File file, java.lang.String attributes, org.gtk.gio.FileQueryInfoFlags flags, int ioPriority, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.AsyncReadyCallback callback);
        
        @ApiStatus.Internal default void upcall(MemoryAddress file, MemoryAddress attributes, int flags, int ioPriority, MemoryAddress cancellable, MemoryAddress callback, MemoryAddress userData) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                run((org.gtk.gio.File) Interop.register(file, org.gtk.gio.File.fromAddress).marshal(file, null), Marshal.addressToString.marshal(attributes, null), new org.gtk.gio.FileQueryInfoFlags(flags), ioPriority, (org.gtk.gio.Cancellable) Interop.register(cancellable, org.gtk.gio.Cancellable.fromAddress).marshal(cancellable, null), null /* Unsupported parameter type */);
            }
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), QueryInfoAsyncCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code query_info_async}
     * @param queryInfoAsync The new value of the field {@code query_info_async}
     */
    public void setQueryInfoAsync(QueryInfoAsyncCallback queryInfoAsync) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("query_info_async"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (queryInfoAsync == null ? MemoryAddress.NULL : queryInfoAsync.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code QueryInfoFinishCallback} callback.
     */
    @FunctionalInterface
    public interface QueryInfoFinishCallback {
    
        org.gtk.gio.FileInfo run(org.gtk.gio.File file, org.gtk.gio.AsyncResult res);
        
        @ApiStatus.Internal default Addressable upcall(MemoryAddress file, MemoryAddress res) {
            var RESULT = run((org.gtk.gio.File) Interop.register(file, org.gtk.gio.File.fromAddress).marshal(file, null), (org.gtk.gio.AsyncResult) Interop.register(res, org.gtk.gio.AsyncResult.fromAddress).marshal(res, null));
            RESULT.yieldOwnership();
            return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), QueryInfoFinishCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code query_info_finish}
     * @param queryInfoFinish The new value of the field {@code query_info_finish}
     */
    public void setQueryInfoFinish(QueryInfoFinishCallback queryInfoFinish) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("query_info_finish"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (queryInfoFinish == null ? MemoryAddress.NULL : queryInfoFinish.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code QueryFilesystemInfoCallback} callback.
     */
    @FunctionalInterface
    public interface QueryFilesystemInfoCallback {
    
        org.gtk.gio.FileInfo run(org.gtk.gio.File file, java.lang.String attributes, @Nullable org.gtk.gio.Cancellable cancellable);
        
        @ApiStatus.Internal default Addressable upcall(MemoryAddress file, MemoryAddress attributes, MemoryAddress cancellable) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                var RESULT = run((org.gtk.gio.File) Interop.register(file, org.gtk.gio.File.fromAddress).marshal(file, null), Marshal.addressToString.marshal(attributes, null), (org.gtk.gio.Cancellable) Interop.register(cancellable, org.gtk.gio.Cancellable.fromAddress).marshal(cancellable, null));
                RESULT.yieldOwnership();
                return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
            }
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), QueryFilesystemInfoCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code query_filesystem_info}
     * @param queryFilesystemInfo The new value of the field {@code query_filesystem_info}
     */
    public void setQueryFilesystemInfo(QueryFilesystemInfoCallback queryFilesystemInfo) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("query_filesystem_info"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (queryFilesystemInfo == null ? MemoryAddress.NULL : queryFilesystemInfo.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code QueryFilesystemInfoAsyncCallback} callback.
     */
    @FunctionalInterface
    public interface QueryFilesystemInfoAsyncCallback {
    
        void run(org.gtk.gio.File file, java.lang.String attributes, int ioPriority, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.AsyncReadyCallback callback);
        
        @ApiStatus.Internal default void upcall(MemoryAddress file, MemoryAddress attributes, int ioPriority, MemoryAddress cancellable, MemoryAddress callback, MemoryAddress userData) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                run((org.gtk.gio.File) Interop.register(file, org.gtk.gio.File.fromAddress).marshal(file, null), Marshal.addressToString.marshal(attributes, null), ioPriority, (org.gtk.gio.Cancellable) Interop.register(cancellable, org.gtk.gio.Cancellable.fromAddress).marshal(cancellable, null), null /* Unsupported parameter type */);
            }
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), QueryFilesystemInfoAsyncCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code query_filesystem_info_async}
     * @param queryFilesystemInfoAsync The new value of the field {@code query_filesystem_info_async}
     */
    public void setQueryFilesystemInfoAsync(QueryFilesystemInfoAsyncCallback queryFilesystemInfoAsync) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("query_filesystem_info_async"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (queryFilesystemInfoAsync == null ? MemoryAddress.NULL : queryFilesystemInfoAsync.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code QueryFilesystemInfoFinishCallback} callback.
     */
    @FunctionalInterface
    public interface QueryFilesystemInfoFinishCallback {
    
        org.gtk.gio.FileInfo run(org.gtk.gio.File file, org.gtk.gio.AsyncResult res);
        
        @ApiStatus.Internal default Addressable upcall(MemoryAddress file, MemoryAddress res) {
            var RESULT = run((org.gtk.gio.File) Interop.register(file, org.gtk.gio.File.fromAddress).marshal(file, null), (org.gtk.gio.AsyncResult) Interop.register(res, org.gtk.gio.AsyncResult.fromAddress).marshal(res, null));
            RESULT.yieldOwnership();
            return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), QueryFilesystemInfoFinishCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code query_filesystem_info_finish}
     * @param queryFilesystemInfoFinish The new value of the field {@code query_filesystem_info_finish}
     */
    public void setQueryFilesystemInfoFinish(QueryFilesystemInfoFinishCallback queryFilesystemInfoFinish) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("query_filesystem_info_finish"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (queryFilesystemInfoFinish == null ? MemoryAddress.NULL : queryFilesystemInfoFinish.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code FindEnclosingMountCallback} callback.
     */
    @FunctionalInterface
    public interface FindEnclosingMountCallback {
    
        org.gtk.gio.Mount run(org.gtk.gio.File file, @Nullable org.gtk.gio.Cancellable cancellable);
        
        @ApiStatus.Internal default Addressable upcall(MemoryAddress file, MemoryAddress cancellable) {
            var RESULT = run((org.gtk.gio.File) Interop.register(file, org.gtk.gio.File.fromAddress).marshal(file, null), (org.gtk.gio.Cancellable) Interop.register(cancellable, org.gtk.gio.Cancellable.fromAddress).marshal(cancellable, null));
            RESULT.yieldOwnership();
            return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), FindEnclosingMountCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code find_enclosing_mount}
     * @param findEnclosingMount The new value of the field {@code find_enclosing_mount}
     */
    public void setFindEnclosingMount(FindEnclosingMountCallback findEnclosingMount) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("find_enclosing_mount"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (findEnclosingMount == null ? MemoryAddress.NULL : findEnclosingMount.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code FindEnclosingMountAsyncCallback} callback.
     */
    @FunctionalInterface
    public interface FindEnclosingMountAsyncCallback {
    
        void run(org.gtk.gio.File file, int ioPriority, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.AsyncReadyCallback callback);
        
        @ApiStatus.Internal default void upcall(MemoryAddress file, int ioPriority, MemoryAddress cancellable, MemoryAddress callback, MemoryAddress userData) {
            run((org.gtk.gio.File) Interop.register(file, org.gtk.gio.File.fromAddress).marshal(file, null), ioPriority, (org.gtk.gio.Cancellable) Interop.register(cancellable, org.gtk.gio.Cancellable.fromAddress).marshal(cancellable, null), null /* Unsupported parameter type */);
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), FindEnclosingMountAsyncCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code find_enclosing_mount_async}
     * @param findEnclosingMountAsync The new value of the field {@code find_enclosing_mount_async}
     */
    public void setFindEnclosingMountAsync(FindEnclosingMountAsyncCallback findEnclosingMountAsync) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("find_enclosing_mount_async"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (findEnclosingMountAsync == null ? MemoryAddress.NULL : findEnclosingMountAsync.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code FindEnclosingMountFinishCallback} callback.
     */
    @FunctionalInterface
    public interface FindEnclosingMountFinishCallback {
    
        org.gtk.gio.Mount run(org.gtk.gio.File file, org.gtk.gio.AsyncResult res);
        
        @ApiStatus.Internal default Addressable upcall(MemoryAddress file, MemoryAddress res) {
            var RESULT = run((org.gtk.gio.File) Interop.register(file, org.gtk.gio.File.fromAddress).marshal(file, null), (org.gtk.gio.AsyncResult) Interop.register(res, org.gtk.gio.AsyncResult.fromAddress).marshal(res, null));
            RESULT.yieldOwnership();
            return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), FindEnclosingMountFinishCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code find_enclosing_mount_finish}
     * @param findEnclosingMountFinish The new value of the field {@code find_enclosing_mount_finish}
     */
    public void setFindEnclosingMountFinish(FindEnclosingMountFinishCallback findEnclosingMountFinish) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("find_enclosing_mount_finish"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (findEnclosingMountFinish == null ? MemoryAddress.NULL : findEnclosingMountFinish.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code SetDisplayNameCallback} callback.
     */
    @FunctionalInterface
    public interface SetDisplayNameCallback {
    
        org.gtk.gio.File run(org.gtk.gio.File file, java.lang.String displayName, @Nullable org.gtk.gio.Cancellable cancellable);
        
        @ApiStatus.Internal default Addressable upcall(MemoryAddress file, MemoryAddress displayName, MemoryAddress cancellable) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                var RESULT = run((org.gtk.gio.File) Interop.register(file, org.gtk.gio.File.fromAddress).marshal(file, null), Marshal.addressToString.marshal(displayName, null), (org.gtk.gio.Cancellable) Interop.register(cancellable, org.gtk.gio.Cancellable.fromAddress).marshal(cancellable, null));
                RESULT.yieldOwnership();
                return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
            }
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), SetDisplayNameCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code set_display_name}
     * @param setDisplayName The new value of the field {@code set_display_name}
     */
    public void setSetDisplayName(SetDisplayNameCallback setDisplayName) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("set_display_name"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (setDisplayName == null ? MemoryAddress.NULL : setDisplayName.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code SetDisplayNameAsyncCallback} callback.
     */
    @FunctionalInterface
    public interface SetDisplayNameAsyncCallback {
    
        void run(org.gtk.gio.File file, java.lang.String displayName, int ioPriority, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.AsyncReadyCallback callback);
        
        @ApiStatus.Internal default void upcall(MemoryAddress file, MemoryAddress displayName, int ioPriority, MemoryAddress cancellable, MemoryAddress callback, MemoryAddress userData) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                run((org.gtk.gio.File) Interop.register(file, org.gtk.gio.File.fromAddress).marshal(file, null), Marshal.addressToString.marshal(displayName, null), ioPriority, (org.gtk.gio.Cancellable) Interop.register(cancellable, org.gtk.gio.Cancellable.fromAddress).marshal(cancellable, null), null /* Unsupported parameter type */);
            }
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), SetDisplayNameAsyncCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code set_display_name_async}
     * @param setDisplayNameAsync The new value of the field {@code set_display_name_async}
     */
    public void setSetDisplayNameAsync(SetDisplayNameAsyncCallback setDisplayNameAsync) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("set_display_name_async"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (setDisplayNameAsync == null ? MemoryAddress.NULL : setDisplayNameAsync.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code SetDisplayNameFinishCallback} callback.
     */
    @FunctionalInterface
    public interface SetDisplayNameFinishCallback {
    
        org.gtk.gio.File run(org.gtk.gio.File file, org.gtk.gio.AsyncResult res);
        
        @ApiStatus.Internal default Addressable upcall(MemoryAddress file, MemoryAddress res) {
            var RESULT = run((org.gtk.gio.File) Interop.register(file, org.gtk.gio.File.fromAddress).marshal(file, null), (org.gtk.gio.AsyncResult) Interop.register(res, org.gtk.gio.AsyncResult.fromAddress).marshal(res, null));
            RESULT.yieldOwnership();
            return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), SetDisplayNameFinishCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code set_display_name_finish}
     * @param setDisplayNameFinish The new value of the field {@code set_display_name_finish}
     */
    public void setSetDisplayNameFinish(SetDisplayNameFinishCallback setDisplayNameFinish) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("set_display_name_finish"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (setDisplayNameFinish == null ? MemoryAddress.NULL : setDisplayNameFinish.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code QuerySettableAttributesCallback} callback.
     */
    @FunctionalInterface
    public interface QuerySettableAttributesCallback {
    
        org.gtk.gio.FileAttributeInfoList run(org.gtk.gio.File file, @Nullable org.gtk.gio.Cancellable cancellable);
        
        @ApiStatus.Internal default Addressable upcall(MemoryAddress file, MemoryAddress cancellable) {
            var RESULT = run((org.gtk.gio.File) Interop.register(file, org.gtk.gio.File.fromAddress).marshal(file, null), (org.gtk.gio.Cancellable) Interop.register(cancellable, org.gtk.gio.Cancellable.fromAddress).marshal(cancellable, null));
            RESULT.yieldOwnership();
            return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), QuerySettableAttributesCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code query_settable_attributes}
     * @param querySettableAttributes The new value of the field {@code query_settable_attributes}
     */
    public void setQuerySettableAttributes(QuerySettableAttributesCallback querySettableAttributes) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("query_settable_attributes"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (querySettableAttributes == null ? MemoryAddress.NULL : querySettableAttributes.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code QuerySettableAttributesAsyncCallback} callback.
     */
    @FunctionalInterface
    public interface QuerySettableAttributesAsyncCallback {
    
        void run();
        
        @ApiStatus.Internal default void upcall() {
            run();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid();
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), QuerySettableAttributesAsyncCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code _query_settable_attributes_async}
     * @param QuerySettableAttributesAsync The new value of the field {@code _query_settable_attributes_async}
     */
    public void setQuerySettableAttributesAsync(QuerySettableAttributesAsyncCallback QuerySettableAttributesAsync) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("_query_settable_attributes_async"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (QuerySettableAttributesAsync == null ? MemoryAddress.NULL : QuerySettableAttributesAsync.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code QuerySettableAttributesFinishCallback} callback.
     */
    @FunctionalInterface
    public interface QuerySettableAttributesFinishCallback {
    
        void run();
        
        @ApiStatus.Internal default void upcall() {
            run();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid();
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), QuerySettableAttributesFinishCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code _query_settable_attributes_finish}
     * @param QuerySettableAttributesFinish The new value of the field {@code _query_settable_attributes_finish}
     */
    public void setQuerySettableAttributesFinish(QuerySettableAttributesFinishCallback QuerySettableAttributesFinish) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("_query_settable_attributes_finish"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (QuerySettableAttributesFinish == null ? MemoryAddress.NULL : QuerySettableAttributesFinish.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code QueryWritableNamespacesCallback} callback.
     */
    @FunctionalInterface
    public interface QueryWritableNamespacesCallback {
    
        org.gtk.gio.FileAttributeInfoList run(org.gtk.gio.File file, @Nullable org.gtk.gio.Cancellable cancellable);
        
        @ApiStatus.Internal default Addressable upcall(MemoryAddress file, MemoryAddress cancellable) {
            var RESULT = run((org.gtk.gio.File) Interop.register(file, org.gtk.gio.File.fromAddress).marshal(file, null), (org.gtk.gio.Cancellable) Interop.register(cancellable, org.gtk.gio.Cancellable.fromAddress).marshal(cancellable, null));
            RESULT.yieldOwnership();
            return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), QueryWritableNamespacesCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code query_writable_namespaces}
     * @param queryWritableNamespaces The new value of the field {@code query_writable_namespaces}
     */
    public void setQueryWritableNamespaces(QueryWritableNamespacesCallback queryWritableNamespaces) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("query_writable_namespaces"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (queryWritableNamespaces == null ? MemoryAddress.NULL : queryWritableNamespaces.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code QueryWritableNamespacesAsyncCallback} callback.
     */
    @FunctionalInterface
    public interface QueryWritableNamespacesAsyncCallback {
    
        void run();
        
        @ApiStatus.Internal default void upcall() {
            run();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid();
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), QueryWritableNamespacesAsyncCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code _query_writable_namespaces_async}
     * @param QueryWritableNamespacesAsync The new value of the field {@code _query_writable_namespaces_async}
     */
    public void setQueryWritableNamespacesAsync(QueryWritableNamespacesAsyncCallback QueryWritableNamespacesAsync) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("_query_writable_namespaces_async"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (QueryWritableNamespacesAsync == null ? MemoryAddress.NULL : QueryWritableNamespacesAsync.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code QueryWritableNamespacesFinishCallback} callback.
     */
    @FunctionalInterface
    public interface QueryWritableNamespacesFinishCallback {
    
        void run();
        
        @ApiStatus.Internal default void upcall() {
            run();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid();
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), QueryWritableNamespacesFinishCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code _query_writable_namespaces_finish}
     * @param QueryWritableNamespacesFinish The new value of the field {@code _query_writable_namespaces_finish}
     */
    public void setQueryWritableNamespacesFinish(QueryWritableNamespacesFinishCallback QueryWritableNamespacesFinish) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("_query_writable_namespaces_finish"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (QueryWritableNamespacesFinish == null ? MemoryAddress.NULL : QueryWritableNamespacesFinish.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code SetAttributeCallback} callback.
     */
    @FunctionalInterface
    public interface SetAttributeCallback {
    
        boolean run(org.gtk.gio.File file, java.lang.String attribute, org.gtk.gio.FileAttributeType type, @Nullable java.lang.foreign.MemoryAddress valueP, org.gtk.gio.FileQueryInfoFlags flags, @Nullable org.gtk.gio.Cancellable cancellable);
        
        @ApiStatus.Internal default int upcall(MemoryAddress file, MemoryAddress attribute, int type, MemoryAddress valueP, int flags, MemoryAddress cancellable) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                var RESULT = run((org.gtk.gio.File) Interop.register(file, org.gtk.gio.File.fromAddress).marshal(file, null), Marshal.addressToString.marshal(attribute, null), org.gtk.gio.FileAttributeType.of(type), valueP, new org.gtk.gio.FileQueryInfoFlags(flags), (org.gtk.gio.Cancellable) Interop.register(cancellable, org.gtk.gio.Cancellable.fromAddress).marshal(cancellable, null));
                return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
            }
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), SetAttributeCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code set_attribute}
     * @param setAttribute The new value of the field {@code set_attribute}
     */
    public void setSetAttribute(SetAttributeCallback setAttribute) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("set_attribute"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (setAttribute == null ? MemoryAddress.NULL : setAttribute.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code SetAttributesFromInfoCallback} callback.
     */
    @FunctionalInterface
    public interface SetAttributesFromInfoCallback {
    
        boolean run(org.gtk.gio.File file, org.gtk.gio.FileInfo info, org.gtk.gio.FileQueryInfoFlags flags, @Nullable org.gtk.gio.Cancellable cancellable);
        
        @ApiStatus.Internal default int upcall(MemoryAddress file, MemoryAddress info, int flags, MemoryAddress cancellable) {
            var RESULT = run((org.gtk.gio.File) Interop.register(file, org.gtk.gio.File.fromAddress).marshal(file, null), (org.gtk.gio.FileInfo) Interop.register(info, org.gtk.gio.FileInfo.fromAddress).marshal(info, null), new org.gtk.gio.FileQueryInfoFlags(flags), (org.gtk.gio.Cancellable) Interop.register(cancellable, org.gtk.gio.Cancellable.fromAddress).marshal(cancellable, null));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), SetAttributesFromInfoCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code set_attributes_from_info}
     * @param setAttributesFromInfo The new value of the field {@code set_attributes_from_info}
     */
    public void setSetAttributesFromInfo(SetAttributesFromInfoCallback setAttributesFromInfo) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("set_attributes_from_info"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (setAttributesFromInfo == null ? MemoryAddress.NULL : setAttributesFromInfo.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code SetAttributesAsyncCallback} callback.
     */
    @FunctionalInterface
    public interface SetAttributesAsyncCallback {
    
        void run(org.gtk.gio.File file, org.gtk.gio.FileInfo info, org.gtk.gio.FileQueryInfoFlags flags, int ioPriority, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.AsyncReadyCallback callback);
        
        @ApiStatus.Internal default void upcall(MemoryAddress file, MemoryAddress info, int flags, int ioPriority, MemoryAddress cancellable, MemoryAddress callback, MemoryAddress userData) {
            run((org.gtk.gio.File) Interop.register(file, org.gtk.gio.File.fromAddress).marshal(file, null), (org.gtk.gio.FileInfo) Interop.register(info, org.gtk.gio.FileInfo.fromAddress).marshal(info, null), new org.gtk.gio.FileQueryInfoFlags(flags), ioPriority, (org.gtk.gio.Cancellable) Interop.register(cancellable, org.gtk.gio.Cancellable.fromAddress).marshal(cancellable, null), null /* Unsupported parameter type */);
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), SetAttributesAsyncCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code set_attributes_async}
     * @param setAttributesAsync The new value of the field {@code set_attributes_async}
     */
    public void setSetAttributesAsync(SetAttributesAsyncCallback setAttributesAsync) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("set_attributes_async"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (setAttributesAsync == null ? MemoryAddress.NULL : setAttributesAsync.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code SetAttributesFinishCallback} callback.
     */
    @FunctionalInterface
    public interface SetAttributesFinishCallback {
    
        boolean run(org.gtk.gio.File file, org.gtk.gio.AsyncResult result, Out<org.gtk.gio.FileInfo> info);
        
        @ApiStatus.Internal default int upcall(MemoryAddress file, MemoryAddress result, MemoryAddress info) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                Out<org.gtk.gio.FileInfo> infoOUT = new Out<>((org.gtk.gio.FileInfo) Interop.register(info, org.gtk.gio.FileInfo.fromAddress).marshal(info, null));
                var RESULT = run((org.gtk.gio.File) Interop.register(file, org.gtk.gio.File.fromAddress).marshal(file, null), (org.gtk.gio.AsyncResult) Interop.register(result, org.gtk.gio.AsyncResult.fromAddress).marshal(result, null), infoOUT);
                info.set(Interop.valueLayout.ADDRESS, 0, infoOUT.get().handle());
                return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
            }
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), SetAttributesFinishCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code set_attributes_finish}
     * @param setAttributesFinish The new value of the field {@code set_attributes_finish}
     */
    public void setSetAttributesFinish(SetAttributesFinishCallback setAttributesFinish) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("set_attributes_finish"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (setAttributesFinish == null ? MemoryAddress.NULL : setAttributesFinish.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code ReadFnCallback} callback.
     */
    @FunctionalInterface
    public interface ReadFnCallback {
    
        org.gtk.gio.FileInputStream run(org.gtk.gio.File file, @Nullable org.gtk.gio.Cancellable cancellable);
        
        @ApiStatus.Internal default Addressable upcall(MemoryAddress file, MemoryAddress cancellable) {
            var RESULT = run((org.gtk.gio.File) Interop.register(file, org.gtk.gio.File.fromAddress).marshal(file, null), (org.gtk.gio.Cancellable) Interop.register(cancellable, org.gtk.gio.Cancellable.fromAddress).marshal(cancellable, null));
            RESULT.yieldOwnership();
            return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), ReadFnCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code read_fn}
     * @param readFn The new value of the field {@code read_fn}
     */
    public void setReadFn(ReadFnCallback readFn) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("read_fn"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (readFn == null ? MemoryAddress.NULL : readFn.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code ReadAsyncCallback} callback.
     */
    @FunctionalInterface
    public interface ReadAsyncCallback {
    
        void run(org.gtk.gio.File file, int ioPriority, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.AsyncReadyCallback callback);
        
        @ApiStatus.Internal default void upcall(MemoryAddress file, int ioPriority, MemoryAddress cancellable, MemoryAddress callback, MemoryAddress userData) {
            run((org.gtk.gio.File) Interop.register(file, org.gtk.gio.File.fromAddress).marshal(file, null), ioPriority, (org.gtk.gio.Cancellable) Interop.register(cancellable, org.gtk.gio.Cancellable.fromAddress).marshal(cancellable, null), null /* Unsupported parameter type */);
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), ReadAsyncCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code read_async}
     * @param readAsync The new value of the field {@code read_async}
     */
    public void setReadAsync(ReadAsyncCallback readAsync) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("read_async"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (readAsync == null ? MemoryAddress.NULL : readAsync.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code ReadFinishCallback} callback.
     */
    @FunctionalInterface
    public interface ReadFinishCallback {
    
        org.gtk.gio.FileInputStream run(org.gtk.gio.File file, org.gtk.gio.AsyncResult res);
        
        @ApiStatus.Internal default Addressable upcall(MemoryAddress file, MemoryAddress res) {
            var RESULT = run((org.gtk.gio.File) Interop.register(file, org.gtk.gio.File.fromAddress).marshal(file, null), (org.gtk.gio.AsyncResult) Interop.register(res, org.gtk.gio.AsyncResult.fromAddress).marshal(res, null));
            RESULT.yieldOwnership();
            return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), ReadFinishCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code read_finish}
     * @param readFinish The new value of the field {@code read_finish}
     */
    public void setReadFinish(ReadFinishCallback readFinish) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("read_finish"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (readFinish == null ? MemoryAddress.NULL : readFinish.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code AppendToCallback} callback.
     */
    @FunctionalInterface
    public interface AppendToCallback {
    
        org.gtk.gio.FileOutputStream run(org.gtk.gio.File file, org.gtk.gio.FileCreateFlags flags, @Nullable org.gtk.gio.Cancellable cancellable);
        
        @ApiStatus.Internal default Addressable upcall(MemoryAddress file, int flags, MemoryAddress cancellable) {
            var RESULT = run((org.gtk.gio.File) Interop.register(file, org.gtk.gio.File.fromAddress).marshal(file, null), new org.gtk.gio.FileCreateFlags(flags), (org.gtk.gio.Cancellable) Interop.register(cancellable, org.gtk.gio.Cancellable.fromAddress).marshal(cancellable, null));
            RESULT.yieldOwnership();
            return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), AppendToCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code append_to}
     * @param appendTo The new value of the field {@code append_to}
     */
    public void setAppendTo(AppendToCallback appendTo) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("append_to"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (appendTo == null ? MemoryAddress.NULL : appendTo.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code AppendToAsyncCallback} callback.
     */
    @FunctionalInterface
    public interface AppendToAsyncCallback {
    
        void run(org.gtk.gio.File file, org.gtk.gio.FileCreateFlags flags, int ioPriority, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.AsyncReadyCallback callback);
        
        @ApiStatus.Internal default void upcall(MemoryAddress file, int flags, int ioPriority, MemoryAddress cancellable, MemoryAddress callback, MemoryAddress userData) {
            run((org.gtk.gio.File) Interop.register(file, org.gtk.gio.File.fromAddress).marshal(file, null), new org.gtk.gio.FileCreateFlags(flags), ioPriority, (org.gtk.gio.Cancellable) Interop.register(cancellable, org.gtk.gio.Cancellable.fromAddress).marshal(cancellable, null), null /* Unsupported parameter type */);
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), AppendToAsyncCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code append_to_async}
     * @param appendToAsync The new value of the field {@code append_to_async}
     */
    public void setAppendToAsync(AppendToAsyncCallback appendToAsync) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("append_to_async"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (appendToAsync == null ? MemoryAddress.NULL : appendToAsync.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code AppendToFinishCallback} callback.
     */
    @FunctionalInterface
    public interface AppendToFinishCallback {
    
        org.gtk.gio.FileOutputStream run(org.gtk.gio.File file, org.gtk.gio.AsyncResult res);
        
        @ApiStatus.Internal default Addressable upcall(MemoryAddress file, MemoryAddress res) {
            var RESULT = run((org.gtk.gio.File) Interop.register(file, org.gtk.gio.File.fromAddress).marshal(file, null), (org.gtk.gio.AsyncResult) Interop.register(res, org.gtk.gio.AsyncResult.fromAddress).marshal(res, null));
            RESULT.yieldOwnership();
            return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), AppendToFinishCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code append_to_finish}
     * @param appendToFinish The new value of the field {@code append_to_finish}
     */
    public void setAppendToFinish(AppendToFinishCallback appendToFinish) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("append_to_finish"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (appendToFinish == null ? MemoryAddress.NULL : appendToFinish.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code CreateCallback} callback.
     */
    @FunctionalInterface
    public interface CreateCallback {
    
        org.gtk.gio.FileOutputStream run(org.gtk.gio.File file, org.gtk.gio.FileCreateFlags flags, @Nullable org.gtk.gio.Cancellable cancellable);
        
        @ApiStatus.Internal default Addressable upcall(MemoryAddress file, int flags, MemoryAddress cancellable) {
            var RESULT = run((org.gtk.gio.File) Interop.register(file, org.gtk.gio.File.fromAddress).marshal(file, null), new org.gtk.gio.FileCreateFlags(flags), (org.gtk.gio.Cancellable) Interop.register(cancellable, org.gtk.gio.Cancellable.fromAddress).marshal(cancellable, null));
            RESULT.yieldOwnership();
            return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), CreateCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code create}
     * @param create The new value of the field {@code create}
     */
    public void setCreate(CreateCallback create) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("create"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (create == null ? MemoryAddress.NULL : create.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code CreateAsyncCallback} callback.
     */
    @FunctionalInterface
    public interface CreateAsyncCallback {
    
        void run(org.gtk.gio.File file, org.gtk.gio.FileCreateFlags flags, int ioPriority, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.AsyncReadyCallback callback);
        
        @ApiStatus.Internal default void upcall(MemoryAddress file, int flags, int ioPriority, MemoryAddress cancellable, MemoryAddress callback, MemoryAddress userData) {
            run((org.gtk.gio.File) Interop.register(file, org.gtk.gio.File.fromAddress).marshal(file, null), new org.gtk.gio.FileCreateFlags(flags), ioPriority, (org.gtk.gio.Cancellable) Interop.register(cancellable, org.gtk.gio.Cancellable.fromAddress).marshal(cancellable, null), null /* Unsupported parameter type */);
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), CreateAsyncCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code create_async}
     * @param createAsync The new value of the field {@code create_async}
     */
    public void setCreateAsync(CreateAsyncCallback createAsync) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("create_async"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (createAsync == null ? MemoryAddress.NULL : createAsync.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code CreateFinishCallback} callback.
     */
    @FunctionalInterface
    public interface CreateFinishCallback {
    
        org.gtk.gio.FileOutputStream run(org.gtk.gio.File file, org.gtk.gio.AsyncResult res);
        
        @ApiStatus.Internal default Addressable upcall(MemoryAddress file, MemoryAddress res) {
            var RESULT = run((org.gtk.gio.File) Interop.register(file, org.gtk.gio.File.fromAddress).marshal(file, null), (org.gtk.gio.AsyncResult) Interop.register(res, org.gtk.gio.AsyncResult.fromAddress).marshal(res, null));
            RESULT.yieldOwnership();
            return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), CreateFinishCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code create_finish}
     * @param createFinish The new value of the field {@code create_finish}
     */
    public void setCreateFinish(CreateFinishCallback createFinish) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("create_finish"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (createFinish == null ? MemoryAddress.NULL : createFinish.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code ReplaceCallback} callback.
     */
    @FunctionalInterface
    public interface ReplaceCallback {
    
        org.gtk.gio.FileOutputStream run(org.gtk.gio.File file, @Nullable java.lang.String etag, boolean makeBackup, org.gtk.gio.FileCreateFlags flags, @Nullable org.gtk.gio.Cancellable cancellable);
        
        @ApiStatus.Internal default Addressable upcall(MemoryAddress file, MemoryAddress etag, int makeBackup, int flags, MemoryAddress cancellable) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                var RESULT = run((org.gtk.gio.File) Interop.register(file, org.gtk.gio.File.fromAddress).marshal(file, null), Marshal.addressToString.marshal(etag, null), Marshal.integerToBoolean.marshal(makeBackup, null).booleanValue(), new org.gtk.gio.FileCreateFlags(flags), (org.gtk.gio.Cancellable) Interop.register(cancellable, org.gtk.gio.Cancellable.fromAddress).marshal(cancellable, null));
                RESULT.yieldOwnership();
                return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
            }
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), ReplaceCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code replace}
     * @param replace The new value of the field {@code replace}
     */
    public void setReplace(ReplaceCallback replace) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("replace"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (replace == null ? MemoryAddress.NULL : replace.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code ReplaceAsyncCallback} callback.
     */
    @FunctionalInterface
    public interface ReplaceAsyncCallback {
    
        void run(org.gtk.gio.File file, @Nullable java.lang.String etag, boolean makeBackup, org.gtk.gio.FileCreateFlags flags, int ioPriority, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.AsyncReadyCallback callback);
        
        @ApiStatus.Internal default void upcall(MemoryAddress file, MemoryAddress etag, int makeBackup, int flags, int ioPriority, MemoryAddress cancellable, MemoryAddress callback, MemoryAddress userData) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                run((org.gtk.gio.File) Interop.register(file, org.gtk.gio.File.fromAddress).marshal(file, null), Marshal.addressToString.marshal(etag, null), Marshal.integerToBoolean.marshal(makeBackup, null).booleanValue(), new org.gtk.gio.FileCreateFlags(flags), ioPriority, (org.gtk.gio.Cancellable) Interop.register(cancellable, org.gtk.gio.Cancellable.fromAddress).marshal(cancellable, null), null /* Unsupported parameter type */);
            }
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), ReplaceAsyncCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code replace_async}
     * @param replaceAsync The new value of the field {@code replace_async}
     */
    public void setReplaceAsync(ReplaceAsyncCallback replaceAsync) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("replace_async"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (replaceAsync == null ? MemoryAddress.NULL : replaceAsync.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code ReplaceFinishCallback} callback.
     */
    @FunctionalInterface
    public interface ReplaceFinishCallback {
    
        org.gtk.gio.FileOutputStream run(org.gtk.gio.File file, org.gtk.gio.AsyncResult res);
        
        @ApiStatus.Internal default Addressable upcall(MemoryAddress file, MemoryAddress res) {
            var RESULT = run((org.gtk.gio.File) Interop.register(file, org.gtk.gio.File.fromAddress).marshal(file, null), (org.gtk.gio.AsyncResult) Interop.register(res, org.gtk.gio.AsyncResult.fromAddress).marshal(res, null));
            RESULT.yieldOwnership();
            return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), ReplaceFinishCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code replace_finish}
     * @param replaceFinish The new value of the field {@code replace_finish}
     */
    public void setReplaceFinish(ReplaceFinishCallback replaceFinish) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("replace_finish"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (replaceFinish == null ? MemoryAddress.NULL : replaceFinish.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code DeleteFileCallback} callback.
     */
    @FunctionalInterface
    public interface DeleteFileCallback {
    
        boolean run(org.gtk.gio.File file, @Nullable org.gtk.gio.Cancellable cancellable);
        
        @ApiStatus.Internal default int upcall(MemoryAddress file, MemoryAddress cancellable) {
            var RESULT = run((org.gtk.gio.File) Interop.register(file, org.gtk.gio.File.fromAddress).marshal(file, null), (org.gtk.gio.Cancellable) Interop.register(cancellable, org.gtk.gio.Cancellable.fromAddress).marshal(cancellable, null));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), DeleteFileCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code delete_file}
     * @param deleteFile The new value of the field {@code delete_file}
     */
    public void setDeleteFile(DeleteFileCallback deleteFile) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("delete_file"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (deleteFile == null ? MemoryAddress.NULL : deleteFile.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code DeleteFileAsyncCallback} callback.
     */
    @FunctionalInterface
    public interface DeleteFileAsyncCallback {
    
        void run(org.gtk.gio.File file, int ioPriority, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.AsyncReadyCallback callback);
        
        @ApiStatus.Internal default void upcall(MemoryAddress file, int ioPriority, MemoryAddress cancellable, MemoryAddress callback, MemoryAddress userData) {
            run((org.gtk.gio.File) Interop.register(file, org.gtk.gio.File.fromAddress).marshal(file, null), ioPriority, (org.gtk.gio.Cancellable) Interop.register(cancellable, org.gtk.gio.Cancellable.fromAddress).marshal(cancellable, null), null /* Unsupported parameter type */);
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), DeleteFileAsyncCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code delete_file_async}
     * @param deleteFileAsync The new value of the field {@code delete_file_async}
     */
    public void setDeleteFileAsync(DeleteFileAsyncCallback deleteFileAsync) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("delete_file_async"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (deleteFileAsync == null ? MemoryAddress.NULL : deleteFileAsync.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code DeleteFileFinishCallback} callback.
     */
    @FunctionalInterface
    public interface DeleteFileFinishCallback {
    
        boolean run(org.gtk.gio.File file, org.gtk.gio.AsyncResult result);
        
        @ApiStatus.Internal default int upcall(MemoryAddress file, MemoryAddress result) {
            var RESULT = run((org.gtk.gio.File) Interop.register(file, org.gtk.gio.File.fromAddress).marshal(file, null), (org.gtk.gio.AsyncResult) Interop.register(result, org.gtk.gio.AsyncResult.fromAddress).marshal(result, null));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), DeleteFileFinishCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code delete_file_finish}
     * @param deleteFileFinish The new value of the field {@code delete_file_finish}
     */
    public void setDeleteFileFinish(DeleteFileFinishCallback deleteFileFinish) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("delete_file_finish"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (deleteFileFinish == null ? MemoryAddress.NULL : deleteFileFinish.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code TrashCallback} callback.
     */
    @FunctionalInterface
    public interface TrashCallback {
    
        boolean run(org.gtk.gio.File file, @Nullable org.gtk.gio.Cancellable cancellable);
        
        @ApiStatus.Internal default int upcall(MemoryAddress file, MemoryAddress cancellable) {
            var RESULT = run((org.gtk.gio.File) Interop.register(file, org.gtk.gio.File.fromAddress).marshal(file, null), (org.gtk.gio.Cancellable) Interop.register(cancellable, org.gtk.gio.Cancellable.fromAddress).marshal(cancellable, null));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), TrashCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code trash}
     * @param trash The new value of the field {@code trash}
     */
    public void setTrash(TrashCallback trash) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("trash"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (trash == null ? MemoryAddress.NULL : trash.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code TrashAsyncCallback} callback.
     */
    @FunctionalInterface
    public interface TrashAsyncCallback {
    
        void run(org.gtk.gio.File file, int ioPriority, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.AsyncReadyCallback callback);
        
        @ApiStatus.Internal default void upcall(MemoryAddress file, int ioPriority, MemoryAddress cancellable, MemoryAddress callback, MemoryAddress userData) {
            run((org.gtk.gio.File) Interop.register(file, org.gtk.gio.File.fromAddress).marshal(file, null), ioPriority, (org.gtk.gio.Cancellable) Interop.register(cancellable, org.gtk.gio.Cancellable.fromAddress).marshal(cancellable, null), null /* Unsupported parameter type */);
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), TrashAsyncCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code trash_async}
     * @param trashAsync The new value of the field {@code trash_async}
     */
    public void setTrashAsync(TrashAsyncCallback trashAsync) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("trash_async"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (trashAsync == null ? MemoryAddress.NULL : trashAsync.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code TrashFinishCallback} callback.
     */
    @FunctionalInterface
    public interface TrashFinishCallback {
    
        boolean run(org.gtk.gio.File file, org.gtk.gio.AsyncResult result);
        
        @ApiStatus.Internal default int upcall(MemoryAddress file, MemoryAddress result) {
            var RESULT = run((org.gtk.gio.File) Interop.register(file, org.gtk.gio.File.fromAddress).marshal(file, null), (org.gtk.gio.AsyncResult) Interop.register(result, org.gtk.gio.AsyncResult.fromAddress).marshal(result, null));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), TrashFinishCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code trash_finish}
     * @param trashFinish The new value of the field {@code trash_finish}
     */
    public void setTrashFinish(TrashFinishCallback trashFinish) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("trash_finish"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (trashFinish == null ? MemoryAddress.NULL : trashFinish.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code MakeDirectoryCallback} callback.
     */
    @FunctionalInterface
    public interface MakeDirectoryCallback {
    
        boolean run(org.gtk.gio.File file, @Nullable org.gtk.gio.Cancellable cancellable);
        
        @ApiStatus.Internal default int upcall(MemoryAddress file, MemoryAddress cancellable) {
            var RESULT = run((org.gtk.gio.File) Interop.register(file, org.gtk.gio.File.fromAddress).marshal(file, null), (org.gtk.gio.Cancellable) Interop.register(cancellable, org.gtk.gio.Cancellable.fromAddress).marshal(cancellable, null));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), MakeDirectoryCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code make_directory}
     * @param makeDirectory The new value of the field {@code make_directory}
     */
    public void setMakeDirectory(MakeDirectoryCallback makeDirectory) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("make_directory"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (makeDirectory == null ? MemoryAddress.NULL : makeDirectory.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code MakeDirectoryAsyncCallback} callback.
     */
    @FunctionalInterface
    public interface MakeDirectoryAsyncCallback {
    
        void run(org.gtk.gio.File file, int ioPriority, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.AsyncReadyCallback callback);
        
        @ApiStatus.Internal default void upcall(MemoryAddress file, int ioPriority, MemoryAddress cancellable, MemoryAddress callback, MemoryAddress userData) {
            run((org.gtk.gio.File) Interop.register(file, org.gtk.gio.File.fromAddress).marshal(file, null), ioPriority, (org.gtk.gio.Cancellable) Interop.register(cancellable, org.gtk.gio.Cancellable.fromAddress).marshal(cancellable, null), null /* Unsupported parameter type */);
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), MakeDirectoryAsyncCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code make_directory_async}
     * @param makeDirectoryAsync The new value of the field {@code make_directory_async}
     */
    public void setMakeDirectoryAsync(MakeDirectoryAsyncCallback makeDirectoryAsync) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("make_directory_async"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (makeDirectoryAsync == null ? MemoryAddress.NULL : makeDirectoryAsync.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code MakeDirectoryFinishCallback} callback.
     */
    @FunctionalInterface
    public interface MakeDirectoryFinishCallback {
    
        boolean run(org.gtk.gio.File file, org.gtk.gio.AsyncResult result);
        
        @ApiStatus.Internal default int upcall(MemoryAddress file, MemoryAddress result) {
            var RESULT = run((org.gtk.gio.File) Interop.register(file, org.gtk.gio.File.fromAddress).marshal(file, null), (org.gtk.gio.AsyncResult) Interop.register(result, org.gtk.gio.AsyncResult.fromAddress).marshal(result, null));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), MakeDirectoryFinishCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code make_directory_finish}
     * @param makeDirectoryFinish The new value of the field {@code make_directory_finish}
     */
    public void setMakeDirectoryFinish(MakeDirectoryFinishCallback makeDirectoryFinish) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("make_directory_finish"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (makeDirectoryFinish == null ? MemoryAddress.NULL : makeDirectoryFinish.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code MakeSymbolicLinkCallback} callback.
     */
    @FunctionalInterface
    public interface MakeSymbolicLinkCallback {
    
        boolean run(org.gtk.gio.File file, java.lang.String symlinkValue, @Nullable org.gtk.gio.Cancellable cancellable);
        
        @ApiStatus.Internal default int upcall(MemoryAddress file, MemoryAddress symlinkValue, MemoryAddress cancellable) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                var RESULT = run((org.gtk.gio.File) Interop.register(file, org.gtk.gio.File.fromAddress).marshal(file, null), Marshal.addressToString.marshal(symlinkValue, null), (org.gtk.gio.Cancellable) Interop.register(cancellable, org.gtk.gio.Cancellable.fromAddress).marshal(cancellable, null));
                return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
            }
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), MakeSymbolicLinkCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code make_symbolic_link}
     * @param makeSymbolicLink The new value of the field {@code make_symbolic_link}
     */
    public void setMakeSymbolicLink(MakeSymbolicLinkCallback makeSymbolicLink) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("make_symbolic_link"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (makeSymbolicLink == null ? MemoryAddress.NULL : makeSymbolicLink.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code MakeSymbolicLinkAsyncCallback} callback.
     */
    @FunctionalInterface
    public interface MakeSymbolicLinkAsyncCallback {
    
        void run(org.gtk.gio.File file, java.lang.String symlinkValue, int ioPriority, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.AsyncReadyCallback callback);
        
        @ApiStatus.Internal default void upcall(MemoryAddress file, MemoryAddress symlinkValue, int ioPriority, MemoryAddress cancellable, MemoryAddress callback, MemoryAddress userData) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                run((org.gtk.gio.File) Interop.register(file, org.gtk.gio.File.fromAddress).marshal(file, null), Marshal.addressToString.marshal(symlinkValue, null), ioPriority, (org.gtk.gio.Cancellable) Interop.register(cancellable, org.gtk.gio.Cancellable.fromAddress).marshal(cancellable, null), null /* Unsupported parameter type */);
            }
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), MakeSymbolicLinkAsyncCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code make_symbolic_link_async}
     * @param makeSymbolicLinkAsync The new value of the field {@code make_symbolic_link_async}
     */
    public void setMakeSymbolicLinkAsync(MakeSymbolicLinkAsyncCallback makeSymbolicLinkAsync) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("make_symbolic_link_async"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (makeSymbolicLinkAsync == null ? MemoryAddress.NULL : makeSymbolicLinkAsync.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code MakeSymbolicLinkFinishCallback} callback.
     */
    @FunctionalInterface
    public interface MakeSymbolicLinkFinishCallback {
    
        boolean run(org.gtk.gio.File file, org.gtk.gio.AsyncResult result);
        
        @ApiStatus.Internal default int upcall(MemoryAddress file, MemoryAddress result) {
            var RESULT = run((org.gtk.gio.File) Interop.register(file, org.gtk.gio.File.fromAddress).marshal(file, null), (org.gtk.gio.AsyncResult) Interop.register(result, org.gtk.gio.AsyncResult.fromAddress).marshal(result, null));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), MakeSymbolicLinkFinishCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code make_symbolic_link_finish}
     * @param makeSymbolicLinkFinish The new value of the field {@code make_symbolic_link_finish}
     */
    public void setMakeSymbolicLinkFinish(MakeSymbolicLinkFinishCallback makeSymbolicLinkFinish) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("make_symbolic_link_finish"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (makeSymbolicLinkFinish == null ? MemoryAddress.NULL : makeSymbolicLinkFinish.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code CopyCallback} callback.
     */
    @FunctionalInterface
    public interface CopyCallback {
    
        boolean run(org.gtk.gio.File source, org.gtk.gio.File destination, org.gtk.gio.FileCopyFlags flags, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.FileProgressCallback progressCallback);
        
        @ApiStatus.Internal default int upcall(MemoryAddress source, MemoryAddress destination, int flags, MemoryAddress cancellable, MemoryAddress progressCallback, MemoryAddress progressCallbackData) {
            var RESULT = run((org.gtk.gio.File) Interop.register(source, org.gtk.gio.File.fromAddress).marshal(source, null), (org.gtk.gio.File) Interop.register(destination, org.gtk.gio.File.fromAddress).marshal(destination, null), new org.gtk.gio.FileCopyFlags(flags), (org.gtk.gio.Cancellable) Interop.register(cancellable, org.gtk.gio.Cancellable.fromAddress).marshal(cancellable, null), null /* Unsupported parameter type */);
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), CopyCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code copy}
     * @param copy The new value of the field {@code copy}
     */
    public void setCopy(CopyCallback copy) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("copy"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (copy == null ? MemoryAddress.NULL : copy.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code CopyAsyncCallback} callback.
     */
    @FunctionalInterface
    public interface CopyAsyncCallback {
    
        void run(org.gtk.gio.File source, org.gtk.gio.File destination, org.gtk.gio.FileCopyFlags flags, int ioPriority, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.FileProgressCallback progressCallback, @Nullable org.gtk.gio.AsyncReadyCallback callback);
        
        @ApiStatus.Internal default void upcall(MemoryAddress source, MemoryAddress destination, int flags, int ioPriority, MemoryAddress cancellable, MemoryAddress progressCallback, MemoryAddress progressCallbackData, MemoryAddress callback, MemoryAddress userData) {
            run((org.gtk.gio.File) Interop.register(source, org.gtk.gio.File.fromAddress).marshal(source, null), (org.gtk.gio.File) Interop.register(destination, org.gtk.gio.File.fromAddress).marshal(destination, null), new org.gtk.gio.FileCopyFlags(flags), ioPriority, (org.gtk.gio.Cancellable) Interop.register(cancellable, org.gtk.gio.Cancellable.fromAddress).marshal(cancellable, null), null /* Unsupported parameter type */, null /* Unsupported parameter type */);
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), CopyAsyncCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code copy_async}
     * @param copyAsync The new value of the field {@code copy_async}
     */
    public void setCopyAsync(CopyAsyncCallback copyAsync) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("copy_async"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (copyAsync == null ? MemoryAddress.NULL : copyAsync.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code CopyFinishCallback} callback.
     */
    @FunctionalInterface
    public interface CopyFinishCallback {
    
        boolean run(org.gtk.gio.File file, org.gtk.gio.AsyncResult res);
        
        @ApiStatus.Internal default int upcall(MemoryAddress file, MemoryAddress res) {
            var RESULT = run((org.gtk.gio.File) Interop.register(file, org.gtk.gio.File.fromAddress).marshal(file, null), (org.gtk.gio.AsyncResult) Interop.register(res, org.gtk.gio.AsyncResult.fromAddress).marshal(res, null));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), CopyFinishCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code copy_finish}
     * @param copyFinish The new value of the field {@code copy_finish}
     */
    public void setCopyFinish(CopyFinishCallback copyFinish) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("copy_finish"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (copyFinish == null ? MemoryAddress.NULL : copyFinish.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code MoveCallback} callback.
     */
    @FunctionalInterface
    public interface MoveCallback {
    
        boolean run(org.gtk.gio.File source, org.gtk.gio.File destination, org.gtk.gio.FileCopyFlags flags, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.FileProgressCallback progressCallback);
        
        @ApiStatus.Internal default int upcall(MemoryAddress source, MemoryAddress destination, int flags, MemoryAddress cancellable, MemoryAddress progressCallback, MemoryAddress progressCallbackData) {
            var RESULT = run((org.gtk.gio.File) Interop.register(source, org.gtk.gio.File.fromAddress).marshal(source, null), (org.gtk.gio.File) Interop.register(destination, org.gtk.gio.File.fromAddress).marshal(destination, null), new org.gtk.gio.FileCopyFlags(flags), (org.gtk.gio.Cancellable) Interop.register(cancellable, org.gtk.gio.Cancellable.fromAddress).marshal(cancellable, null), null /* Unsupported parameter type */);
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), MoveCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code move}
     * @param move The new value of the field {@code move}
     */
    public void setMove(MoveCallback move) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("move"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (move == null ? MemoryAddress.NULL : move.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code MoveAsyncCallback} callback.
     */
    @FunctionalInterface
    public interface MoveAsyncCallback {
    
        void run(org.gtk.gio.File source, org.gtk.gio.File destination, org.gtk.gio.FileCopyFlags flags, int ioPriority, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.FileProgressCallback progressCallback, @Nullable org.gtk.gio.AsyncReadyCallback callback);
        
        @ApiStatus.Internal default void upcall(MemoryAddress source, MemoryAddress destination, int flags, int ioPriority, MemoryAddress cancellable, MemoryAddress progressCallback, MemoryAddress progressCallbackData, MemoryAddress callback, MemoryAddress userData) {
            run((org.gtk.gio.File) Interop.register(source, org.gtk.gio.File.fromAddress).marshal(source, null), (org.gtk.gio.File) Interop.register(destination, org.gtk.gio.File.fromAddress).marshal(destination, null), new org.gtk.gio.FileCopyFlags(flags), ioPriority, (org.gtk.gio.Cancellable) Interop.register(cancellable, org.gtk.gio.Cancellable.fromAddress).marshal(cancellable, null), null /* Unsupported parameter type */, null /* Unsupported parameter type */);
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), MoveAsyncCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code move_async}
     * @param moveAsync The new value of the field {@code move_async}
     */
    public void setMoveAsync(MoveAsyncCallback moveAsync) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("move_async"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (moveAsync == null ? MemoryAddress.NULL : moveAsync.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code MoveFinishCallback} callback.
     */
    @FunctionalInterface
    public interface MoveFinishCallback {
    
        boolean run(org.gtk.gio.File file, org.gtk.gio.AsyncResult result);
        
        @ApiStatus.Internal default int upcall(MemoryAddress file, MemoryAddress result) {
            var RESULT = run((org.gtk.gio.File) Interop.register(file, org.gtk.gio.File.fromAddress).marshal(file, null), (org.gtk.gio.AsyncResult) Interop.register(result, org.gtk.gio.AsyncResult.fromAddress).marshal(result, null));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), MoveFinishCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code move_finish}
     * @param moveFinish The new value of the field {@code move_finish}
     */
    public void setMoveFinish(MoveFinishCallback moveFinish) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("move_finish"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (moveFinish == null ? MemoryAddress.NULL : moveFinish.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code MountMountableCallback} callback.
     */
    @FunctionalInterface
    public interface MountMountableCallback {
    
        void run(org.gtk.gio.File file, org.gtk.gio.MountMountFlags flags, @Nullable org.gtk.gio.MountOperation mountOperation, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.AsyncReadyCallback callback);
        
        @ApiStatus.Internal default void upcall(MemoryAddress file, int flags, MemoryAddress mountOperation, MemoryAddress cancellable, MemoryAddress callback, MemoryAddress userData) {
            run((org.gtk.gio.File) Interop.register(file, org.gtk.gio.File.fromAddress).marshal(file, null), new org.gtk.gio.MountMountFlags(flags), (org.gtk.gio.MountOperation) Interop.register(mountOperation, org.gtk.gio.MountOperation.fromAddress).marshal(mountOperation, null), (org.gtk.gio.Cancellable) Interop.register(cancellable, org.gtk.gio.Cancellable.fromAddress).marshal(cancellable, null), null /* Unsupported parameter type */);
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), MountMountableCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code mount_mountable}
     * @param mountMountable The new value of the field {@code mount_mountable}
     */
    public void setMountMountable(MountMountableCallback mountMountable) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("mount_mountable"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (mountMountable == null ? MemoryAddress.NULL : mountMountable.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code MountMountableFinishCallback} callback.
     */
    @FunctionalInterface
    public interface MountMountableFinishCallback {
    
        org.gtk.gio.File run(org.gtk.gio.File file, org.gtk.gio.AsyncResult result);
        
        @ApiStatus.Internal default Addressable upcall(MemoryAddress file, MemoryAddress result) {
            var RESULT = run((org.gtk.gio.File) Interop.register(file, org.gtk.gio.File.fromAddress).marshal(file, null), (org.gtk.gio.AsyncResult) Interop.register(result, org.gtk.gio.AsyncResult.fromAddress).marshal(result, null));
            RESULT.yieldOwnership();
            return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), MountMountableFinishCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code mount_mountable_finish}
     * @param mountMountableFinish The new value of the field {@code mount_mountable_finish}
     */
    public void setMountMountableFinish(MountMountableFinishCallback mountMountableFinish) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("mount_mountable_finish"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (mountMountableFinish == null ? MemoryAddress.NULL : mountMountableFinish.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code UnmountMountableCallback} callback.
     */
    @FunctionalInterface
    public interface UnmountMountableCallback {
    
        void run(org.gtk.gio.File file, org.gtk.gio.MountUnmountFlags flags, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.AsyncReadyCallback callback);
        
        @ApiStatus.Internal default void upcall(MemoryAddress file, int flags, MemoryAddress cancellable, MemoryAddress callback, MemoryAddress userData) {
            run((org.gtk.gio.File) Interop.register(file, org.gtk.gio.File.fromAddress).marshal(file, null), new org.gtk.gio.MountUnmountFlags(flags), (org.gtk.gio.Cancellable) Interop.register(cancellable, org.gtk.gio.Cancellable.fromAddress).marshal(cancellable, null), null /* Unsupported parameter type */);
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), UnmountMountableCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code unmount_mountable}
     * @param unmountMountable The new value of the field {@code unmount_mountable}
     */
    public void setUnmountMountable(UnmountMountableCallback unmountMountable) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("unmount_mountable"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (unmountMountable == null ? MemoryAddress.NULL : unmountMountable.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code UnmountMountableFinishCallback} callback.
     */
    @FunctionalInterface
    public interface UnmountMountableFinishCallback {
    
        boolean run(org.gtk.gio.File file, org.gtk.gio.AsyncResult result);
        
        @ApiStatus.Internal default int upcall(MemoryAddress file, MemoryAddress result) {
            var RESULT = run((org.gtk.gio.File) Interop.register(file, org.gtk.gio.File.fromAddress).marshal(file, null), (org.gtk.gio.AsyncResult) Interop.register(result, org.gtk.gio.AsyncResult.fromAddress).marshal(result, null));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), UnmountMountableFinishCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code unmount_mountable_finish}
     * @param unmountMountableFinish The new value of the field {@code unmount_mountable_finish}
     */
    public void setUnmountMountableFinish(UnmountMountableFinishCallback unmountMountableFinish) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("unmount_mountable_finish"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (unmountMountableFinish == null ? MemoryAddress.NULL : unmountMountableFinish.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code EjectMountableCallback} callback.
     */
    @FunctionalInterface
    public interface EjectMountableCallback {
    
        void run(org.gtk.gio.File file, org.gtk.gio.MountUnmountFlags flags, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.AsyncReadyCallback callback);
        
        @ApiStatus.Internal default void upcall(MemoryAddress file, int flags, MemoryAddress cancellable, MemoryAddress callback, MemoryAddress userData) {
            run((org.gtk.gio.File) Interop.register(file, org.gtk.gio.File.fromAddress).marshal(file, null), new org.gtk.gio.MountUnmountFlags(flags), (org.gtk.gio.Cancellable) Interop.register(cancellable, org.gtk.gio.Cancellable.fromAddress).marshal(cancellable, null), null /* Unsupported parameter type */);
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), EjectMountableCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code eject_mountable}
     * @param ejectMountable The new value of the field {@code eject_mountable}
     */
    public void setEjectMountable(EjectMountableCallback ejectMountable) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("eject_mountable"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (ejectMountable == null ? MemoryAddress.NULL : ejectMountable.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code EjectMountableFinishCallback} callback.
     */
    @FunctionalInterface
    public interface EjectMountableFinishCallback {
    
        boolean run(org.gtk.gio.File file, org.gtk.gio.AsyncResult result);
        
        @ApiStatus.Internal default int upcall(MemoryAddress file, MemoryAddress result) {
            var RESULT = run((org.gtk.gio.File) Interop.register(file, org.gtk.gio.File.fromAddress).marshal(file, null), (org.gtk.gio.AsyncResult) Interop.register(result, org.gtk.gio.AsyncResult.fromAddress).marshal(result, null));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), EjectMountableFinishCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code eject_mountable_finish}
     * @param ejectMountableFinish The new value of the field {@code eject_mountable_finish}
     */
    public void setEjectMountableFinish(EjectMountableFinishCallback ejectMountableFinish) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("eject_mountable_finish"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (ejectMountableFinish == null ? MemoryAddress.NULL : ejectMountableFinish.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code MountEnclosingVolumeCallback} callback.
     */
    @FunctionalInterface
    public interface MountEnclosingVolumeCallback {
    
        void run(org.gtk.gio.File location, org.gtk.gio.MountMountFlags flags, @Nullable org.gtk.gio.MountOperation mountOperation, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.AsyncReadyCallback callback);
        
        @ApiStatus.Internal default void upcall(MemoryAddress location, int flags, MemoryAddress mountOperation, MemoryAddress cancellable, MemoryAddress callback, MemoryAddress userData) {
            run((org.gtk.gio.File) Interop.register(location, org.gtk.gio.File.fromAddress).marshal(location, null), new org.gtk.gio.MountMountFlags(flags), (org.gtk.gio.MountOperation) Interop.register(mountOperation, org.gtk.gio.MountOperation.fromAddress).marshal(mountOperation, null), (org.gtk.gio.Cancellable) Interop.register(cancellable, org.gtk.gio.Cancellable.fromAddress).marshal(cancellable, null), null /* Unsupported parameter type */);
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), MountEnclosingVolumeCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code mount_enclosing_volume}
     * @param mountEnclosingVolume The new value of the field {@code mount_enclosing_volume}
     */
    public void setMountEnclosingVolume(MountEnclosingVolumeCallback mountEnclosingVolume) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("mount_enclosing_volume"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (mountEnclosingVolume == null ? MemoryAddress.NULL : mountEnclosingVolume.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code MountEnclosingVolumeFinishCallback} callback.
     */
    @FunctionalInterface
    public interface MountEnclosingVolumeFinishCallback {
    
        boolean run(org.gtk.gio.File location, org.gtk.gio.AsyncResult result);
        
        @ApiStatus.Internal default int upcall(MemoryAddress location, MemoryAddress result) {
            var RESULT = run((org.gtk.gio.File) Interop.register(location, org.gtk.gio.File.fromAddress).marshal(location, null), (org.gtk.gio.AsyncResult) Interop.register(result, org.gtk.gio.AsyncResult.fromAddress).marshal(result, null));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), MountEnclosingVolumeFinishCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code mount_enclosing_volume_finish}
     * @param mountEnclosingVolumeFinish The new value of the field {@code mount_enclosing_volume_finish}
     */
    public void setMountEnclosingVolumeFinish(MountEnclosingVolumeFinishCallback mountEnclosingVolumeFinish) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("mount_enclosing_volume_finish"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (mountEnclosingVolumeFinish == null ? MemoryAddress.NULL : mountEnclosingVolumeFinish.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code MonitorDirCallback} callback.
     */
    @FunctionalInterface
    public interface MonitorDirCallback {
    
        org.gtk.gio.FileMonitor run(org.gtk.gio.File file, org.gtk.gio.FileMonitorFlags flags, @Nullable org.gtk.gio.Cancellable cancellable);
        
        @ApiStatus.Internal default Addressable upcall(MemoryAddress file, int flags, MemoryAddress cancellable) {
            var RESULT = run((org.gtk.gio.File) Interop.register(file, org.gtk.gio.File.fromAddress).marshal(file, null), new org.gtk.gio.FileMonitorFlags(flags), (org.gtk.gio.Cancellable) Interop.register(cancellable, org.gtk.gio.Cancellable.fromAddress).marshal(cancellable, null));
            RESULT.yieldOwnership();
            return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), MonitorDirCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code monitor_dir}
     * @param monitorDir The new value of the field {@code monitor_dir}
     */
    public void setMonitorDir(MonitorDirCallback monitorDir) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("monitor_dir"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (monitorDir == null ? MemoryAddress.NULL : monitorDir.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code MonitorFileCallback} callback.
     */
    @FunctionalInterface
    public interface MonitorFileCallback {
    
        org.gtk.gio.FileMonitor run(org.gtk.gio.File file, org.gtk.gio.FileMonitorFlags flags, @Nullable org.gtk.gio.Cancellable cancellable);
        
        @ApiStatus.Internal default Addressable upcall(MemoryAddress file, int flags, MemoryAddress cancellable) {
            var RESULT = run((org.gtk.gio.File) Interop.register(file, org.gtk.gio.File.fromAddress).marshal(file, null), new org.gtk.gio.FileMonitorFlags(flags), (org.gtk.gio.Cancellable) Interop.register(cancellable, org.gtk.gio.Cancellable.fromAddress).marshal(cancellable, null));
            RESULT.yieldOwnership();
            return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), MonitorFileCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code monitor_file}
     * @param monitorFile The new value of the field {@code monitor_file}
     */
    public void setMonitorFile(MonitorFileCallback monitorFile) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("monitor_file"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (monitorFile == null ? MemoryAddress.NULL : monitorFile.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code OpenReadwriteCallback} callback.
     */
    @FunctionalInterface
    public interface OpenReadwriteCallback {
    
        org.gtk.gio.FileIOStream run(org.gtk.gio.File file, @Nullable org.gtk.gio.Cancellable cancellable);
        
        @ApiStatus.Internal default Addressable upcall(MemoryAddress file, MemoryAddress cancellable) {
            var RESULT = run((org.gtk.gio.File) Interop.register(file, org.gtk.gio.File.fromAddress).marshal(file, null), (org.gtk.gio.Cancellable) Interop.register(cancellable, org.gtk.gio.Cancellable.fromAddress).marshal(cancellable, null));
            RESULT.yieldOwnership();
            return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), OpenReadwriteCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code open_readwrite}
     * @param openReadwrite The new value of the field {@code open_readwrite}
     */
    public void setOpenReadwrite(OpenReadwriteCallback openReadwrite) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("open_readwrite"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (openReadwrite == null ? MemoryAddress.NULL : openReadwrite.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code OpenReadwriteAsyncCallback} callback.
     */
    @FunctionalInterface
    public interface OpenReadwriteAsyncCallback {
    
        void run(org.gtk.gio.File file, int ioPriority, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.AsyncReadyCallback callback);
        
        @ApiStatus.Internal default void upcall(MemoryAddress file, int ioPriority, MemoryAddress cancellable, MemoryAddress callback, MemoryAddress userData) {
            run((org.gtk.gio.File) Interop.register(file, org.gtk.gio.File.fromAddress).marshal(file, null), ioPriority, (org.gtk.gio.Cancellable) Interop.register(cancellable, org.gtk.gio.Cancellable.fromAddress).marshal(cancellable, null), null /* Unsupported parameter type */);
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), OpenReadwriteAsyncCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code open_readwrite_async}
     * @param openReadwriteAsync The new value of the field {@code open_readwrite_async}
     */
    public void setOpenReadwriteAsync(OpenReadwriteAsyncCallback openReadwriteAsync) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("open_readwrite_async"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (openReadwriteAsync == null ? MemoryAddress.NULL : openReadwriteAsync.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code OpenReadwriteFinishCallback} callback.
     */
    @FunctionalInterface
    public interface OpenReadwriteFinishCallback {
    
        org.gtk.gio.FileIOStream run(org.gtk.gio.File file, org.gtk.gio.AsyncResult res);
        
        @ApiStatus.Internal default Addressable upcall(MemoryAddress file, MemoryAddress res) {
            var RESULT = run((org.gtk.gio.File) Interop.register(file, org.gtk.gio.File.fromAddress).marshal(file, null), (org.gtk.gio.AsyncResult) Interop.register(res, org.gtk.gio.AsyncResult.fromAddress).marshal(res, null));
            RESULT.yieldOwnership();
            return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), OpenReadwriteFinishCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code open_readwrite_finish}
     * @param openReadwriteFinish The new value of the field {@code open_readwrite_finish}
     */
    public void setOpenReadwriteFinish(OpenReadwriteFinishCallback openReadwriteFinish) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("open_readwrite_finish"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (openReadwriteFinish == null ? MemoryAddress.NULL : openReadwriteFinish.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code CreateReadwriteCallback} callback.
     */
    @FunctionalInterface
    public interface CreateReadwriteCallback {
    
        org.gtk.gio.FileIOStream run(org.gtk.gio.File file, org.gtk.gio.FileCreateFlags flags, @Nullable org.gtk.gio.Cancellable cancellable);
        
        @ApiStatus.Internal default Addressable upcall(MemoryAddress file, int flags, MemoryAddress cancellable) {
            var RESULT = run((org.gtk.gio.File) Interop.register(file, org.gtk.gio.File.fromAddress).marshal(file, null), new org.gtk.gio.FileCreateFlags(flags), (org.gtk.gio.Cancellable) Interop.register(cancellable, org.gtk.gio.Cancellable.fromAddress).marshal(cancellable, null));
            RESULT.yieldOwnership();
            return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), CreateReadwriteCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code create_readwrite}
     * @param createReadwrite The new value of the field {@code create_readwrite}
     */
    public void setCreateReadwrite(CreateReadwriteCallback createReadwrite) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("create_readwrite"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (createReadwrite == null ? MemoryAddress.NULL : createReadwrite.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code CreateReadwriteAsyncCallback} callback.
     */
    @FunctionalInterface
    public interface CreateReadwriteAsyncCallback {
    
        void run(org.gtk.gio.File file, org.gtk.gio.FileCreateFlags flags, int ioPriority, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.AsyncReadyCallback callback);
        
        @ApiStatus.Internal default void upcall(MemoryAddress file, int flags, int ioPriority, MemoryAddress cancellable, MemoryAddress callback, MemoryAddress userData) {
            run((org.gtk.gio.File) Interop.register(file, org.gtk.gio.File.fromAddress).marshal(file, null), new org.gtk.gio.FileCreateFlags(flags), ioPriority, (org.gtk.gio.Cancellable) Interop.register(cancellable, org.gtk.gio.Cancellable.fromAddress).marshal(cancellable, null), null /* Unsupported parameter type */);
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), CreateReadwriteAsyncCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code create_readwrite_async}
     * @param createReadwriteAsync The new value of the field {@code create_readwrite_async}
     */
    public void setCreateReadwriteAsync(CreateReadwriteAsyncCallback createReadwriteAsync) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("create_readwrite_async"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (createReadwriteAsync == null ? MemoryAddress.NULL : createReadwriteAsync.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code CreateReadwriteFinishCallback} callback.
     */
    @FunctionalInterface
    public interface CreateReadwriteFinishCallback {
    
        org.gtk.gio.FileIOStream run(org.gtk.gio.File file, org.gtk.gio.AsyncResult res);
        
        @ApiStatus.Internal default Addressable upcall(MemoryAddress file, MemoryAddress res) {
            var RESULT = run((org.gtk.gio.File) Interop.register(file, org.gtk.gio.File.fromAddress).marshal(file, null), (org.gtk.gio.AsyncResult) Interop.register(res, org.gtk.gio.AsyncResult.fromAddress).marshal(res, null));
            RESULT.yieldOwnership();
            return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), CreateReadwriteFinishCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code create_readwrite_finish}
     * @param createReadwriteFinish The new value of the field {@code create_readwrite_finish}
     */
    public void setCreateReadwriteFinish(CreateReadwriteFinishCallback createReadwriteFinish) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("create_readwrite_finish"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (createReadwriteFinish == null ? MemoryAddress.NULL : createReadwriteFinish.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code ReplaceReadwriteCallback} callback.
     */
    @FunctionalInterface
    public interface ReplaceReadwriteCallback {
    
        org.gtk.gio.FileIOStream run(org.gtk.gio.File file, @Nullable java.lang.String etag, boolean makeBackup, org.gtk.gio.FileCreateFlags flags, @Nullable org.gtk.gio.Cancellable cancellable);
        
        @ApiStatus.Internal default Addressable upcall(MemoryAddress file, MemoryAddress etag, int makeBackup, int flags, MemoryAddress cancellable) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                var RESULT = run((org.gtk.gio.File) Interop.register(file, org.gtk.gio.File.fromAddress).marshal(file, null), Marshal.addressToString.marshal(etag, null), Marshal.integerToBoolean.marshal(makeBackup, null).booleanValue(), new org.gtk.gio.FileCreateFlags(flags), (org.gtk.gio.Cancellable) Interop.register(cancellable, org.gtk.gio.Cancellable.fromAddress).marshal(cancellable, null));
                RESULT.yieldOwnership();
                return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
            }
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), ReplaceReadwriteCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code replace_readwrite}
     * @param replaceReadwrite The new value of the field {@code replace_readwrite}
     */
    public void setReplaceReadwrite(ReplaceReadwriteCallback replaceReadwrite) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("replace_readwrite"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (replaceReadwrite == null ? MemoryAddress.NULL : replaceReadwrite.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code ReplaceReadwriteAsyncCallback} callback.
     */
    @FunctionalInterface
    public interface ReplaceReadwriteAsyncCallback {
    
        void run(org.gtk.gio.File file, @Nullable java.lang.String etag, boolean makeBackup, org.gtk.gio.FileCreateFlags flags, int ioPriority, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.AsyncReadyCallback callback);
        
        @ApiStatus.Internal default void upcall(MemoryAddress file, MemoryAddress etag, int makeBackup, int flags, int ioPriority, MemoryAddress cancellable, MemoryAddress callback, MemoryAddress userData) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                run((org.gtk.gio.File) Interop.register(file, org.gtk.gio.File.fromAddress).marshal(file, null), Marshal.addressToString.marshal(etag, null), Marshal.integerToBoolean.marshal(makeBackup, null).booleanValue(), new org.gtk.gio.FileCreateFlags(flags), ioPriority, (org.gtk.gio.Cancellable) Interop.register(cancellable, org.gtk.gio.Cancellable.fromAddress).marshal(cancellable, null), null /* Unsupported parameter type */);
            }
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), ReplaceReadwriteAsyncCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code replace_readwrite_async}
     * @param replaceReadwriteAsync The new value of the field {@code replace_readwrite_async}
     */
    public void setReplaceReadwriteAsync(ReplaceReadwriteAsyncCallback replaceReadwriteAsync) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("replace_readwrite_async"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (replaceReadwriteAsync == null ? MemoryAddress.NULL : replaceReadwriteAsync.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code ReplaceReadwriteFinishCallback} callback.
     */
    @FunctionalInterface
    public interface ReplaceReadwriteFinishCallback {
    
        org.gtk.gio.FileIOStream run(org.gtk.gio.File file, org.gtk.gio.AsyncResult res);
        
        @ApiStatus.Internal default Addressable upcall(MemoryAddress file, MemoryAddress res) {
            var RESULT = run((org.gtk.gio.File) Interop.register(file, org.gtk.gio.File.fromAddress).marshal(file, null), (org.gtk.gio.AsyncResult) Interop.register(res, org.gtk.gio.AsyncResult.fromAddress).marshal(res, null));
            RESULT.yieldOwnership();
            return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), ReplaceReadwriteFinishCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code replace_readwrite_finish}
     * @param replaceReadwriteFinish The new value of the field {@code replace_readwrite_finish}
     */
    public void setReplaceReadwriteFinish(ReplaceReadwriteFinishCallback replaceReadwriteFinish) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("replace_readwrite_finish"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (replaceReadwriteFinish == null ? MemoryAddress.NULL : replaceReadwriteFinish.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code StartMountableCallback} callback.
     */
    @FunctionalInterface
    public interface StartMountableCallback {
    
        void run(org.gtk.gio.File file, org.gtk.gio.DriveStartFlags flags, @Nullable org.gtk.gio.MountOperation startOperation, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.AsyncReadyCallback callback);
        
        @ApiStatus.Internal default void upcall(MemoryAddress file, int flags, MemoryAddress startOperation, MemoryAddress cancellable, MemoryAddress callback, MemoryAddress userData) {
            run((org.gtk.gio.File) Interop.register(file, org.gtk.gio.File.fromAddress).marshal(file, null), new org.gtk.gio.DriveStartFlags(flags), (org.gtk.gio.MountOperation) Interop.register(startOperation, org.gtk.gio.MountOperation.fromAddress).marshal(startOperation, null), (org.gtk.gio.Cancellable) Interop.register(cancellable, org.gtk.gio.Cancellable.fromAddress).marshal(cancellable, null), null /* Unsupported parameter type */);
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), StartMountableCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code start_mountable}
     * @param startMountable The new value of the field {@code start_mountable}
     */
    public void setStartMountable(StartMountableCallback startMountable) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("start_mountable"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (startMountable == null ? MemoryAddress.NULL : startMountable.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code StartMountableFinishCallback} callback.
     */
    @FunctionalInterface
    public interface StartMountableFinishCallback {
    
        boolean run(org.gtk.gio.File file, org.gtk.gio.AsyncResult result);
        
        @ApiStatus.Internal default int upcall(MemoryAddress file, MemoryAddress result) {
            var RESULT = run((org.gtk.gio.File) Interop.register(file, org.gtk.gio.File.fromAddress).marshal(file, null), (org.gtk.gio.AsyncResult) Interop.register(result, org.gtk.gio.AsyncResult.fromAddress).marshal(result, null));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), StartMountableFinishCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code start_mountable_finish}
     * @param startMountableFinish The new value of the field {@code start_mountable_finish}
     */
    public void setStartMountableFinish(StartMountableFinishCallback startMountableFinish) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("start_mountable_finish"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (startMountableFinish == null ? MemoryAddress.NULL : startMountableFinish.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code StopMountableCallback} callback.
     */
    @FunctionalInterface
    public interface StopMountableCallback {
    
        void run(org.gtk.gio.File file, org.gtk.gio.MountUnmountFlags flags, @Nullable org.gtk.gio.MountOperation mountOperation, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.AsyncReadyCallback callback);
        
        @ApiStatus.Internal default void upcall(MemoryAddress file, int flags, MemoryAddress mountOperation, MemoryAddress cancellable, MemoryAddress callback, MemoryAddress userData) {
            run((org.gtk.gio.File) Interop.register(file, org.gtk.gio.File.fromAddress).marshal(file, null), new org.gtk.gio.MountUnmountFlags(flags), (org.gtk.gio.MountOperation) Interop.register(mountOperation, org.gtk.gio.MountOperation.fromAddress).marshal(mountOperation, null), (org.gtk.gio.Cancellable) Interop.register(cancellable, org.gtk.gio.Cancellable.fromAddress).marshal(cancellable, null), null /* Unsupported parameter type */);
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), StopMountableCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code stop_mountable}
     * @param stopMountable The new value of the field {@code stop_mountable}
     */
    public void setStopMountable(StopMountableCallback stopMountable) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("stop_mountable"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (stopMountable == null ? MemoryAddress.NULL : stopMountable.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code StopMountableFinishCallback} callback.
     */
    @FunctionalInterface
    public interface StopMountableFinishCallback {
    
        boolean run(org.gtk.gio.File file, org.gtk.gio.AsyncResult result);
        
        @ApiStatus.Internal default int upcall(MemoryAddress file, MemoryAddress result) {
            var RESULT = run((org.gtk.gio.File) Interop.register(file, org.gtk.gio.File.fromAddress).marshal(file, null), (org.gtk.gio.AsyncResult) Interop.register(result, org.gtk.gio.AsyncResult.fromAddress).marshal(result, null));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), StopMountableFinishCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code stop_mountable_finish}
     * @param stopMountableFinish The new value of the field {@code stop_mountable_finish}
     */
    public void setStopMountableFinish(StopMountableFinishCallback stopMountableFinish) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("stop_mountable_finish"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (stopMountableFinish == null ? MemoryAddress.NULL : stopMountableFinish.toCallback()));
        }
    }
    
    /**
     * Get the value of the field {@code supports_thread_contexts}
     * @return The value of the field {@code supports_thread_contexts}
     */
    public boolean getSupportsThreadContexts() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (int) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("supports_thread_contexts"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
    }
    
    /**
     * Change the value of the field {@code supports_thread_contexts}
     * @param supportsThreadContexts The new value of the field {@code supports_thread_contexts}
     */
    public void setSupportsThreadContexts(boolean supportsThreadContexts) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("supports_thread_contexts"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), Marshal.booleanToInteger.marshal(supportsThreadContexts, null).intValue());
        }
    }
    
    /**
     * Functional interface declaration of the {@code UnmountMountableWithOperationCallback} callback.
     */
    @FunctionalInterface
    public interface UnmountMountableWithOperationCallback {
    
        void run(org.gtk.gio.File file, org.gtk.gio.MountUnmountFlags flags, @Nullable org.gtk.gio.MountOperation mountOperation, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.AsyncReadyCallback callback);
        
        @ApiStatus.Internal default void upcall(MemoryAddress file, int flags, MemoryAddress mountOperation, MemoryAddress cancellable, MemoryAddress callback, MemoryAddress userData) {
            run((org.gtk.gio.File) Interop.register(file, org.gtk.gio.File.fromAddress).marshal(file, null), new org.gtk.gio.MountUnmountFlags(flags), (org.gtk.gio.MountOperation) Interop.register(mountOperation, org.gtk.gio.MountOperation.fromAddress).marshal(mountOperation, null), (org.gtk.gio.Cancellable) Interop.register(cancellable, org.gtk.gio.Cancellable.fromAddress).marshal(cancellable, null), null /* Unsupported parameter type */);
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), UnmountMountableWithOperationCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code unmount_mountable_with_operation}
     * @param unmountMountableWithOperation The new value of the field {@code unmount_mountable_with_operation}
     */
    public void setUnmountMountableWithOperation(UnmountMountableWithOperationCallback unmountMountableWithOperation) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("unmount_mountable_with_operation"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (unmountMountableWithOperation == null ? MemoryAddress.NULL : unmountMountableWithOperation.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code UnmountMountableWithOperationFinishCallback} callback.
     */
    @FunctionalInterface
    public interface UnmountMountableWithOperationFinishCallback {
    
        boolean run(org.gtk.gio.File file, org.gtk.gio.AsyncResult result);
        
        @ApiStatus.Internal default int upcall(MemoryAddress file, MemoryAddress result) {
            var RESULT = run((org.gtk.gio.File) Interop.register(file, org.gtk.gio.File.fromAddress).marshal(file, null), (org.gtk.gio.AsyncResult) Interop.register(result, org.gtk.gio.AsyncResult.fromAddress).marshal(result, null));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), UnmountMountableWithOperationFinishCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code unmount_mountable_with_operation_finish}
     * @param unmountMountableWithOperationFinish The new value of the field {@code unmount_mountable_with_operation_finish}
     */
    public void setUnmountMountableWithOperationFinish(UnmountMountableWithOperationFinishCallback unmountMountableWithOperationFinish) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("unmount_mountable_with_operation_finish"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (unmountMountableWithOperationFinish == null ? MemoryAddress.NULL : unmountMountableWithOperationFinish.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code EjectMountableWithOperationCallback} callback.
     */
    @FunctionalInterface
    public interface EjectMountableWithOperationCallback {
    
        void run(org.gtk.gio.File file, org.gtk.gio.MountUnmountFlags flags, @Nullable org.gtk.gio.MountOperation mountOperation, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.AsyncReadyCallback callback);
        
        @ApiStatus.Internal default void upcall(MemoryAddress file, int flags, MemoryAddress mountOperation, MemoryAddress cancellable, MemoryAddress callback, MemoryAddress userData) {
            run((org.gtk.gio.File) Interop.register(file, org.gtk.gio.File.fromAddress).marshal(file, null), new org.gtk.gio.MountUnmountFlags(flags), (org.gtk.gio.MountOperation) Interop.register(mountOperation, org.gtk.gio.MountOperation.fromAddress).marshal(mountOperation, null), (org.gtk.gio.Cancellable) Interop.register(cancellable, org.gtk.gio.Cancellable.fromAddress).marshal(cancellable, null), null /* Unsupported parameter type */);
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), EjectMountableWithOperationCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code eject_mountable_with_operation}
     * @param ejectMountableWithOperation The new value of the field {@code eject_mountable_with_operation}
     */
    public void setEjectMountableWithOperation(EjectMountableWithOperationCallback ejectMountableWithOperation) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("eject_mountable_with_operation"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (ejectMountableWithOperation == null ? MemoryAddress.NULL : ejectMountableWithOperation.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code EjectMountableWithOperationFinishCallback} callback.
     */
    @FunctionalInterface
    public interface EjectMountableWithOperationFinishCallback {
    
        boolean run(org.gtk.gio.File file, org.gtk.gio.AsyncResult result);
        
        @ApiStatus.Internal default int upcall(MemoryAddress file, MemoryAddress result) {
            var RESULT = run((org.gtk.gio.File) Interop.register(file, org.gtk.gio.File.fromAddress).marshal(file, null), (org.gtk.gio.AsyncResult) Interop.register(result, org.gtk.gio.AsyncResult.fromAddress).marshal(result, null));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), EjectMountableWithOperationFinishCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code eject_mountable_with_operation_finish}
     * @param ejectMountableWithOperationFinish The new value of the field {@code eject_mountable_with_operation_finish}
     */
    public void setEjectMountableWithOperationFinish(EjectMountableWithOperationFinishCallback ejectMountableWithOperationFinish) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("eject_mountable_with_operation_finish"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (ejectMountableWithOperationFinish == null ? MemoryAddress.NULL : ejectMountableWithOperationFinish.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code PollMountableCallback} callback.
     */
    @FunctionalInterface
    public interface PollMountableCallback {
    
        void run(org.gtk.gio.File file, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.AsyncReadyCallback callback);
        
        @ApiStatus.Internal default void upcall(MemoryAddress file, MemoryAddress cancellable, MemoryAddress callback, MemoryAddress userData) {
            run((org.gtk.gio.File) Interop.register(file, org.gtk.gio.File.fromAddress).marshal(file, null), (org.gtk.gio.Cancellable) Interop.register(cancellable, org.gtk.gio.Cancellable.fromAddress).marshal(cancellable, null), null /* Unsupported parameter type */);
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), PollMountableCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code poll_mountable}
     * @param pollMountable The new value of the field {@code poll_mountable}
     */
    public void setPollMountable(PollMountableCallback pollMountable) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("poll_mountable"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (pollMountable == null ? MemoryAddress.NULL : pollMountable.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code PollMountableFinishCallback} callback.
     */
    @FunctionalInterface
    public interface PollMountableFinishCallback {
    
        boolean run(org.gtk.gio.File file, org.gtk.gio.AsyncResult result);
        
        @ApiStatus.Internal default int upcall(MemoryAddress file, MemoryAddress result) {
            var RESULT = run((org.gtk.gio.File) Interop.register(file, org.gtk.gio.File.fromAddress).marshal(file, null), (org.gtk.gio.AsyncResult) Interop.register(result, org.gtk.gio.AsyncResult.fromAddress).marshal(result, null));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), PollMountableFinishCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code poll_mountable_finish}
     * @param pollMountableFinish The new value of the field {@code poll_mountable_finish}
     */
    public void setPollMountableFinish(PollMountableFinishCallback pollMountableFinish) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("poll_mountable_finish"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (pollMountableFinish == null ? MemoryAddress.NULL : pollMountableFinish.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code MeasureDiskUsageCallback} callback.
     */
    @FunctionalInterface
    public interface MeasureDiskUsageCallback {
    
        boolean run(org.gtk.gio.File file, org.gtk.gio.FileMeasureFlags flags, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.FileMeasureProgressCallback progressCallback, Out<Long> diskUsage, Out<Long> numDirs, Out<Long> numFiles);
        
        @ApiStatus.Internal default int upcall(MemoryAddress file, int flags, MemoryAddress cancellable, MemoryAddress progressCallback, MemoryAddress progressData, MemoryAddress diskUsage, MemoryAddress numDirs, MemoryAddress numFiles) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                Out<Long> diskUsageOUT = new Out<>(diskUsage.get(Interop.valueLayout.C_LONG, 0));
                Out<Long> numDirsOUT = new Out<>(numDirs.get(Interop.valueLayout.C_LONG, 0));
                Out<Long> numFilesOUT = new Out<>(numFiles.get(Interop.valueLayout.C_LONG, 0));
                var RESULT = run((org.gtk.gio.File) Interop.register(file, org.gtk.gio.File.fromAddress).marshal(file, null), new org.gtk.gio.FileMeasureFlags(flags), (org.gtk.gio.Cancellable) Interop.register(cancellable, org.gtk.gio.Cancellable.fromAddress).marshal(cancellable, null), null /* Unsupported parameter type */, diskUsageOUT, numDirsOUT, numFilesOUT);
                diskUsage.set(Interop.valueLayout.C_LONG, 0, diskUsageOUT.get());
                numDirs.set(Interop.valueLayout.C_LONG, 0, numDirsOUT.get());
                numFiles.set(Interop.valueLayout.C_LONG, 0, numFilesOUT.get());
                return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
            }
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), MeasureDiskUsageCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code measure_disk_usage}
     * @param measureDiskUsage The new value of the field {@code measure_disk_usage}
     */
    public void setMeasureDiskUsage(MeasureDiskUsageCallback measureDiskUsage) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("measure_disk_usage"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (measureDiskUsage == null ? MemoryAddress.NULL : measureDiskUsage.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code MeasureDiskUsageAsyncCallback} callback.
     */
    @FunctionalInterface
    public interface MeasureDiskUsageAsyncCallback {
    
        void run(org.gtk.gio.File file, org.gtk.gio.FileMeasureFlags flags, int ioPriority, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.FileMeasureProgressCallback progressCallback, @Nullable org.gtk.gio.AsyncReadyCallback callback);
        
        @ApiStatus.Internal default void upcall(MemoryAddress file, int flags, int ioPriority, MemoryAddress cancellable, MemoryAddress progressCallback, MemoryAddress progressData, MemoryAddress callback, MemoryAddress userData) {
            run((org.gtk.gio.File) Interop.register(file, org.gtk.gio.File.fromAddress).marshal(file, null), new org.gtk.gio.FileMeasureFlags(flags), ioPriority, (org.gtk.gio.Cancellable) Interop.register(cancellable, org.gtk.gio.Cancellable.fromAddress).marshal(cancellable, null), null /* Unsupported parameter type */, null /* Unsupported parameter type */);
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), MeasureDiskUsageAsyncCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code measure_disk_usage_async}
     * @param measureDiskUsageAsync The new value of the field {@code measure_disk_usage_async}
     */
    public void setMeasureDiskUsageAsync(MeasureDiskUsageAsyncCallback measureDiskUsageAsync) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("measure_disk_usage_async"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (measureDiskUsageAsync == null ? MemoryAddress.NULL : measureDiskUsageAsync.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code MeasureDiskUsageFinishCallback} callback.
     */
    @FunctionalInterface
    public interface MeasureDiskUsageFinishCallback {
    
        boolean run(org.gtk.gio.File file, org.gtk.gio.AsyncResult result, Out<Long> diskUsage, Out<Long> numDirs, Out<Long> numFiles);
        
        @ApiStatus.Internal default int upcall(MemoryAddress file, MemoryAddress result, MemoryAddress diskUsage, MemoryAddress numDirs, MemoryAddress numFiles) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                Out<Long> diskUsageOUT = new Out<>(diskUsage.get(Interop.valueLayout.C_LONG, 0));
                Out<Long> numDirsOUT = new Out<>(numDirs.get(Interop.valueLayout.C_LONG, 0));
                Out<Long> numFilesOUT = new Out<>(numFiles.get(Interop.valueLayout.C_LONG, 0));
                var RESULT = run((org.gtk.gio.File) Interop.register(file, org.gtk.gio.File.fromAddress).marshal(file, null), (org.gtk.gio.AsyncResult) Interop.register(result, org.gtk.gio.AsyncResult.fromAddress).marshal(result, null), diskUsageOUT, numDirsOUT, numFilesOUT);
                diskUsage.set(Interop.valueLayout.C_LONG, 0, diskUsageOUT.get());
                numDirs.set(Interop.valueLayout.C_LONG, 0, numDirsOUT.get());
                numFiles.set(Interop.valueLayout.C_LONG, 0, numFilesOUT.get());
                return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
            }
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), MeasureDiskUsageFinishCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code measure_disk_usage_finish}
     * @param measureDiskUsageFinish The new value of the field {@code measure_disk_usage_finish}
     */
    public void setMeasureDiskUsageFinish(MeasureDiskUsageFinishCallback measureDiskUsageFinish) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("measure_disk_usage_finish"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (measureDiskUsageFinish == null ? MemoryAddress.NULL : measureDiskUsageFinish.toCallback()));
        }
    }
    
    /**
     * Create a FileIface proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected FileIface(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, FileIface> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new FileIface(input);
    
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
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("g_iface"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (gIface == null ? MemoryAddress.NULL : gIface.handle()));
                return this;
            }
        }
        
        public Builder setDup(DupCallback dup) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("dup"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (dup == null ? MemoryAddress.NULL : dup.toCallback()));
                return this;
            }
        }
        
        public Builder setHash(HashCallback hash) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("hash"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (hash == null ? MemoryAddress.NULL : hash.toCallback()));
                return this;
            }
        }
        
        public Builder setEqual(EqualCallback equal) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("equal"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (equal == null ? MemoryAddress.NULL : equal.toCallback()));
                return this;
            }
        }
        
        public Builder setIsNative(IsNativeCallback isNative) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("is_native"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (isNative == null ? MemoryAddress.NULL : isNative.toCallback()));
                return this;
            }
        }
        
        public Builder setHasUriScheme(HasUriSchemeCallback hasUriScheme) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("has_uri_scheme"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (hasUriScheme == null ? MemoryAddress.NULL : hasUriScheme.toCallback()));
                return this;
            }
        }
        
        public Builder setGetUriScheme(GetUriSchemeCallback getUriScheme) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("get_uri_scheme"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getUriScheme == null ? MemoryAddress.NULL : getUriScheme.toCallback()));
                return this;
            }
        }
        
        public Builder setGetBasename(GetBasenameCallback getBasename) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("get_basename"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getBasename == null ? MemoryAddress.NULL : getBasename.toCallback()));
                return this;
            }
        }
        
        public Builder setGetPath(GetPathCallback getPath) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("get_path"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getPath == null ? MemoryAddress.NULL : getPath.toCallback()));
                return this;
            }
        }
        
        public Builder setGetUri(GetUriCallback getUri) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("get_uri"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getUri == null ? MemoryAddress.NULL : getUri.toCallback()));
                return this;
            }
        }
        
        public Builder setGetParseName(GetParseNameCallback getParseName) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("get_parse_name"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getParseName == null ? MemoryAddress.NULL : getParseName.toCallback()));
                return this;
            }
        }
        
        public Builder setGetParent(GetParentCallback getParent) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("get_parent"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getParent == null ? MemoryAddress.NULL : getParent.toCallback()));
                return this;
            }
        }
        
        public Builder setPrefixMatches(PrefixMatchesCallback prefixMatches) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("prefix_matches"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (prefixMatches == null ? MemoryAddress.NULL : prefixMatches.toCallback()));
                return this;
            }
        }
        
        public Builder setGetRelativePath(GetRelativePathCallback getRelativePath) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("get_relative_path"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getRelativePath == null ? MemoryAddress.NULL : getRelativePath.toCallback()));
                return this;
            }
        }
        
        public Builder setResolveRelativePath(ResolveRelativePathCallback resolveRelativePath) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("resolve_relative_path"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (resolveRelativePath == null ? MemoryAddress.NULL : resolveRelativePath.toCallback()));
                return this;
            }
        }
        
        public Builder setGetChildForDisplayName(GetChildForDisplayNameCallback getChildForDisplayName) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("get_child_for_display_name"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getChildForDisplayName == null ? MemoryAddress.NULL : getChildForDisplayName.toCallback()));
                return this;
            }
        }
        
        public Builder setEnumerateChildren(EnumerateChildrenCallback enumerateChildren) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("enumerate_children"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (enumerateChildren == null ? MemoryAddress.NULL : enumerateChildren.toCallback()));
                return this;
            }
        }
        
        public Builder setEnumerateChildrenAsync(EnumerateChildrenAsyncCallback enumerateChildrenAsync) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("enumerate_children_async"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (enumerateChildrenAsync == null ? MemoryAddress.NULL : enumerateChildrenAsync.toCallback()));
                return this;
            }
        }
        
        public Builder setEnumerateChildrenFinish(EnumerateChildrenFinishCallback enumerateChildrenFinish) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("enumerate_children_finish"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (enumerateChildrenFinish == null ? MemoryAddress.NULL : enumerateChildrenFinish.toCallback()));
                return this;
            }
        }
        
        public Builder setQueryInfo(QueryInfoCallback queryInfo) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("query_info"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (queryInfo == null ? MemoryAddress.NULL : queryInfo.toCallback()));
                return this;
            }
        }
        
        public Builder setQueryInfoAsync(QueryInfoAsyncCallback queryInfoAsync) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("query_info_async"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (queryInfoAsync == null ? MemoryAddress.NULL : queryInfoAsync.toCallback()));
                return this;
            }
        }
        
        public Builder setQueryInfoFinish(QueryInfoFinishCallback queryInfoFinish) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("query_info_finish"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (queryInfoFinish == null ? MemoryAddress.NULL : queryInfoFinish.toCallback()));
                return this;
            }
        }
        
        public Builder setQueryFilesystemInfo(QueryFilesystemInfoCallback queryFilesystemInfo) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("query_filesystem_info"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (queryFilesystemInfo == null ? MemoryAddress.NULL : queryFilesystemInfo.toCallback()));
                return this;
            }
        }
        
        public Builder setQueryFilesystemInfoAsync(QueryFilesystemInfoAsyncCallback queryFilesystemInfoAsync) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("query_filesystem_info_async"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (queryFilesystemInfoAsync == null ? MemoryAddress.NULL : queryFilesystemInfoAsync.toCallback()));
                return this;
            }
        }
        
        public Builder setQueryFilesystemInfoFinish(QueryFilesystemInfoFinishCallback queryFilesystemInfoFinish) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("query_filesystem_info_finish"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (queryFilesystemInfoFinish == null ? MemoryAddress.NULL : queryFilesystemInfoFinish.toCallback()));
                return this;
            }
        }
        
        public Builder setFindEnclosingMount(FindEnclosingMountCallback findEnclosingMount) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("find_enclosing_mount"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (findEnclosingMount == null ? MemoryAddress.NULL : findEnclosingMount.toCallback()));
                return this;
            }
        }
        
        public Builder setFindEnclosingMountAsync(FindEnclosingMountAsyncCallback findEnclosingMountAsync) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("find_enclosing_mount_async"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (findEnclosingMountAsync == null ? MemoryAddress.NULL : findEnclosingMountAsync.toCallback()));
                return this;
            }
        }
        
        public Builder setFindEnclosingMountFinish(FindEnclosingMountFinishCallback findEnclosingMountFinish) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("find_enclosing_mount_finish"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (findEnclosingMountFinish == null ? MemoryAddress.NULL : findEnclosingMountFinish.toCallback()));
                return this;
            }
        }
        
        public Builder setSetDisplayName(SetDisplayNameCallback setDisplayName) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("set_display_name"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (setDisplayName == null ? MemoryAddress.NULL : setDisplayName.toCallback()));
                return this;
            }
        }
        
        public Builder setSetDisplayNameAsync(SetDisplayNameAsyncCallback setDisplayNameAsync) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("set_display_name_async"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (setDisplayNameAsync == null ? MemoryAddress.NULL : setDisplayNameAsync.toCallback()));
                return this;
            }
        }
        
        public Builder setSetDisplayNameFinish(SetDisplayNameFinishCallback setDisplayNameFinish) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("set_display_name_finish"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (setDisplayNameFinish == null ? MemoryAddress.NULL : setDisplayNameFinish.toCallback()));
                return this;
            }
        }
        
        public Builder setQuerySettableAttributes(QuerySettableAttributesCallback querySettableAttributes) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("query_settable_attributes"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (querySettableAttributes == null ? MemoryAddress.NULL : querySettableAttributes.toCallback()));
                return this;
            }
        }
        
        public Builder setQuerySettableAttributesAsync(QuerySettableAttributesAsyncCallback QuerySettableAttributesAsync) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("_query_settable_attributes_async"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (QuerySettableAttributesAsync == null ? MemoryAddress.NULL : QuerySettableAttributesAsync.toCallback()));
                return this;
            }
        }
        
        public Builder setQuerySettableAttributesFinish(QuerySettableAttributesFinishCallback QuerySettableAttributesFinish) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("_query_settable_attributes_finish"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (QuerySettableAttributesFinish == null ? MemoryAddress.NULL : QuerySettableAttributesFinish.toCallback()));
                return this;
            }
        }
        
        public Builder setQueryWritableNamespaces(QueryWritableNamespacesCallback queryWritableNamespaces) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("query_writable_namespaces"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (queryWritableNamespaces == null ? MemoryAddress.NULL : queryWritableNamespaces.toCallback()));
                return this;
            }
        }
        
        public Builder setQueryWritableNamespacesAsync(QueryWritableNamespacesAsyncCallback QueryWritableNamespacesAsync) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("_query_writable_namespaces_async"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (QueryWritableNamespacesAsync == null ? MemoryAddress.NULL : QueryWritableNamespacesAsync.toCallback()));
                return this;
            }
        }
        
        public Builder setQueryWritableNamespacesFinish(QueryWritableNamespacesFinishCallback QueryWritableNamespacesFinish) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("_query_writable_namespaces_finish"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (QueryWritableNamespacesFinish == null ? MemoryAddress.NULL : QueryWritableNamespacesFinish.toCallback()));
                return this;
            }
        }
        
        public Builder setSetAttribute(SetAttributeCallback setAttribute) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("set_attribute"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (setAttribute == null ? MemoryAddress.NULL : setAttribute.toCallback()));
                return this;
            }
        }
        
        public Builder setSetAttributesFromInfo(SetAttributesFromInfoCallback setAttributesFromInfo) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("set_attributes_from_info"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (setAttributesFromInfo == null ? MemoryAddress.NULL : setAttributesFromInfo.toCallback()));
                return this;
            }
        }
        
        public Builder setSetAttributesAsync(SetAttributesAsyncCallback setAttributesAsync) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("set_attributes_async"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (setAttributesAsync == null ? MemoryAddress.NULL : setAttributesAsync.toCallback()));
                return this;
            }
        }
        
        public Builder setSetAttributesFinish(SetAttributesFinishCallback setAttributesFinish) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("set_attributes_finish"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (setAttributesFinish == null ? MemoryAddress.NULL : setAttributesFinish.toCallback()));
                return this;
            }
        }
        
        public Builder setReadFn(ReadFnCallback readFn) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("read_fn"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (readFn == null ? MemoryAddress.NULL : readFn.toCallback()));
                return this;
            }
        }
        
        public Builder setReadAsync(ReadAsyncCallback readAsync) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("read_async"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (readAsync == null ? MemoryAddress.NULL : readAsync.toCallback()));
                return this;
            }
        }
        
        public Builder setReadFinish(ReadFinishCallback readFinish) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("read_finish"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (readFinish == null ? MemoryAddress.NULL : readFinish.toCallback()));
                return this;
            }
        }
        
        public Builder setAppendTo(AppendToCallback appendTo) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("append_to"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (appendTo == null ? MemoryAddress.NULL : appendTo.toCallback()));
                return this;
            }
        }
        
        public Builder setAppendToAsync(AppendToAsyncCallback appendToAsync) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("append_to_async"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (appendToAsync == null ? MemoryAddress.NULL : appendToAsync.toCallback()));
                return this;
            }
        }
        
        public Builder setAppendToFinish(AppendToFinishCallback appendToFinish) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("append_to_finish"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (appendToFinish == null ? MemoryAddress.NULL : appendToFinish.toCallback()));
                return this;
            }
        }
        
        public Builder setCreate(CreateCallback create) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("create"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (create == null ? MemoryAddress.NULL : create.toCallback()));
                return this;
            }
        }
        
        public Builder setCreateAsync(CreateAsyncCallback createAsync) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("create_async"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (createAsync == null ? MemoryAddress.NULL : createAsync.toCallback()));
                return this;
            }
        }
        
        public Builder setCreateFinish(CreateFinishCallback createFinish) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("create_finish"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (createFinish == null ? MemoryAddress.NULL : createFinish.toCallback()));
                return this;
            }
        }
        
        public Builder setReplace(ReplaceCallback replace) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("replace"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (replace == null ? MemoryAddress.NULL : replace.toCallback()));
                return this;
            }
        }
        
        public Builder setReplaceAsync(ReplaceAsyncCallback replaceAsync) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("replace_async"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (replaceAsync == null ? MemoryAddress.NULL : replaceAsync.toCallback()));
                return this;
            }
        }
        
        public Builder setReplaceFinish(ReplaceFinishCallback replaceFinish) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("replace_finish"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (replaceFinish == null ? MemoryAddress.NULL : replaceFinish.toCallback()));
                return this;
            }
        }
        
        public Builder setDeleteFile(DeleteFileCallback deleteFile) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("delete_file"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (deleteFile == null ? MemoryAddress.NULL : deleteFile.toCallback()));
                return this;
            }
        }
        
        public Builder setDeleteFileAsync(DeleteFileAsyncCallback deleteFileAsync) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("delete_file_async"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (deleteFileAsync == null ? MemoryAddress.NULL : deleteFileAsync.toCallback()));
                return this;
            }
        }
        
        public Builder setDeleteFileFinish(DeleteFileFinishCallback deleteFileFinish) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("delete_file_finish"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (deleteFileFinish == null ? MemoryAddress.NULL : deleteFileFinish.toCallback()));
                return this;
            }
        }
        
        public Builder setTrash(TrashCallback trash) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("trash"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (trash == null ? MemoryAddress.NULL : trash.toCallback()));
                return this;
            }
        }
        
        public Builder setTrashAsync(TrashAsyncCallback trashAsync) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("trash_async"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (trashAsync == null ? MemoryAddress.NULL : trashAsync.toCallback()));
                return this;
            }
        }
        
        public Builder setTrashFinish(TrashFinishCallback trashFinish) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("trash_finish"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (trashFinish == null ? MemoryAddress.NULL : trashFinish.toCallback()));
                return this;
            }
        }
        
        public Builder setMakeDirectory(MakeDirectoryCallback makeDirectory) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("make_directory"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (makeDirectory == null ? MemoryAddress.NULL : makeDirectory.toCallback()));
                return this;
            }
        }
        
        public Builder setMakeDirectoryAsync(MakeDirectoryAsyncCallback makeDirectoryAsync) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("make_directory_async"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (makeDirectoryAsync == null ? MemoryAddress.NULL : makeDirectoryAsync.toCallback()));
                return this;
            }
        }
        
        public Builder setMakeDirectoryFinish(MakeDirectoryFinishCallback makeDirectoryFinish) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("make_directory_finish"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (makeDirectoryFinish == null ? MemoryAddress.NULL : makeDirectoryFinish.toCallback()));
                return this;
            }
        }
        
        public Builder setMakeSymbolicLink(MakeSymbolicLinkCallback makeSymbolicLink) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("make_symbolic_link"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (makeSymbolicLink == null ? MemoryAddress.NULL : makeSymbolicLink.toCallback()));
                return this;
            }
        }
        
        public Builder setMakeSymbolicLinkAsync(MakeSymbolicLinkAsyncCallback makeSymbolicLinkAsync) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("make_symbolic_link_async"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (makeSymbolicLinkAsync == null ? MemoryAddress.NULL : makeSymbolicLinkAsync.toCallback()));
                return this;
            }
        }
        
        public Builder setMakeSymbolicLinkFinish(MakeSymbolicLinkFinishCallback makeSymbolicLinkFinish) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("make_symbolic_link_finish"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (makeSymbolicLinkFinish == null ? MemoryAddress.NULL : makeSymbolicLinkFinish.toCallback()));
                return this;
            }
        }
        
        public Builder setCopy(CopyCallback copy) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("copy"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (copy == null ? MemoryAddress.NULL : copy.toCallback()));
                return this;
            }
        }
        
        public Builder setCopyAsync(CopyAsyncCallback copyAsync) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("copy_async"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (copyAsync == null ? MemoryAddress.NULL : copyAsync.toCallback()));
                return this;
            }
        }
        
        public Builder setCopyFinish(CopyFinishCallback copyFinish) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("copy_finish"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (copyFinish == null ? MemoryAddress.NULL : copyFinish.toCallback()));
                return this;
            }
        }
        
        public Builder setMove(MoveCallback move) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("move"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (move == null ? MemoryAddress.NULL : move.toCallback()));
                return this;
            }
        }
        
        public Builder setMoveAsync(MoveAsyncCallback moveAsync) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("move_async"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (moveAsync == null ? MemoryAddress.NULL : moveAsync.toCallback()));
                return this;
            }
        }
        
        public Builder setMoveFinish(MoveFinishCallback moveFinish) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("move_finish"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (moveFinish == null ? MemoryAddress.NULL : moveFinish.toCallback()));
                return this;
            }
        }
        
        public Builder setMountMountable(MountMountableCallback mountMountable) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("mount_mountable"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (mountMountable == null ? MemoryAddress.NULL : mountMountable.toCallback()));
                return this;
            }
        }
        
        public Builder setMountMountableFinish(MountMountableFinishCallback mountMountableFinish) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("mount_mountable_finish"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (mountMountableFinish == null ? MemoryAddress.NULL : mountMountableFinish.toCallback()));
                return this;
            }
        }
        
        public Builder setUnmountMountable(UnmountMountableCallback unmountMountable) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("unmount_mountable"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (unmountMountable == null ? MemoryAddress.NULL : unmountMountable.toCallback()));
                return this;
            }
        }
        
        public Builder setUnmountMountableFinish(UnmountMountableFinishCallback unmountMountableFinish) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("unmount_mountable_finish"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (unmountMountableFinish == null ? MemoryAddress.NULL : unmountMountableFinish.toCallback()));
                return this;
            }
        }
        
        public Builder setEjectMountable(EjectMountableCallback ejectMountable) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("eject_mountable"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (ejectMountable == null ? MemoryAddress.NULL : ejectMountable.toCallback()));
                return this;
            }
        }
        
        public Builder setEjectMountableFinish(EjectMountableFinishCallback ejectMountableFinish) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("eject_mountable_finish"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (ejectMountableFinish == null ? MemoryAddress.NULL : ejectMountableFinish.toCallback()));
                return this;
            }
        }
        
        public Builder setMountEnclosingVolume(MountEnclosingVolumeCallback mountEnclosingVolume) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("mount_enclosing_volume"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (mountEnclosingVolume == null ? MemoryAddress.NULL : mountEnclosingVolume.toCallback()));
                return this;
            }
        }
        
        public Builder setMountEnclosingVolumeFinish(MountEnclosingVolumeFinishCallback mountEnclosingVolumeFinish) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("mount_enclosing_volume_finish"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (mountEnclosingVolumeFinish == null ? MemoryAddress.NULL : mountEnclosingVolumeFinish.toCallback()));
                return this;
            }
        }
        
        public Builder setMonitorDir(MonitorDirCallback monitorDir) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("monitor_dir"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (monitorDir == null ? MemoryAddress.NULL : monitorDir.toCallback()));
                return this;
            }
        }
        
        public Builder setMonitorFile(MonitorFileCallback monitorFile) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("monitor_file"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (monitorFile == null ? MemoryAddress.NULL : monitorFile.toCallback()));
                return this;
            }
        }
        
        public Builder setOpenReadwrite(OpenReadwriteCallback openReadwrite) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("open_readwrite"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (openReadwrite == null ? MemoryAddress.NULL : openReadwrite.toCallback()));
                return this;
            }
        }
        
        public Builder setOpenReadwriteAsync(OpenReadwriteAsyncCallback openReadwriteAsync) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("open_readwrite_async"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (openReadwriteAsync == null ? MemoryAddress.NULL : openReadwriteAsync.toCallback()));
                return this;
            }
        }
        
        public Builder setOpenReadwriteFinish(OpenReadwriteFinishCallback openReadwriteFinish) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("open_readwrite_finish"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (openReadwriteFinish == null ? MemoryAddress.NULL : openReadwriteFinish.toCallback()));
                return this;
            }
        }
        
        public Builder setCreateReadwrite(CreateReadwriteCallback createReadwrite) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("create_readwrite"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (createReadwrite == null ? MemoryAddress.NULL : createReadwrite.toCallback()));
                return this;
            }
        }
        
        public Builder setCreateReadwriteAsync(CreateReadwriteAsyncCallback createReadwriteAsync) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("create_readwrite_async"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (createReadwriteAsync == null ? MemoryAddress.NULL : createReadwriteAsync.toCallback()));
                return this;
            }
        }
        
        public Builder setCreateReadwriteFinish(CreateReadwriteFinishCallback createReadwriteFinish) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("create_readwrite_finish"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (createReadwriteFinish == null ? MemoryAddress.NULL : createReadwriteFinish.toCallback()));
                return this;
            }
        }
        
        public Builder setReplaceReadwrite(ReplaceReadwriteCallback replaceReadwrite) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("replace_readwrite"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (replaceReadwrite == null ? MemoryAddress.NULL : replaceReadwrite.toCallback()));
                return this;
            }
        }
        
        public Builder setReplaceReadwriteAsync(ReplaceReadwriteAsyncCallback replaceReadwriteAsync) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("replace_readwrite_async"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (replaceReadwriteAsync == null ? MemoryAddress.NULL : replaceReadwriteAsync.toCallback()));
                return this;
            }
        }
        
        public Builder setReplaceReadwriteFinish(ReplaceReadwriteFinishCallback replaceReadwriteFinish) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("replace_readwrite_finish"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (replaceReadwriteFinish == null ? MemoryAddress.NULL : replaceReadwriteFinish.toCallback()));
                return this;
            }
        }
        
        public Builder setStartMountable(StartMountableCallback startMountable) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("start_mountable"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (startMountable == null ? MemoryAddress.NULL : startMountable.toCallback()));
                return this;
            }
        }
        
        public Builder setStartMountableFinish(StartMountableFinishCallback startMountableFinish) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("start_mountable_finish"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (startMountableFinish == null ? MemoryAddress.NULL : startMountableFinish.toCallback()));
                return this;
            }
        }
        
        public Builder setStopMountable(StopMountableCallback stopMountable) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("stop_mountable"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (stopMountable == null ? MemoryAddress.NULL : stopMountable.toCallback()));
                return this;
            }
        }
        
        public Builder setStopMountableFinish(StopMountableFinishCallback stopMountableFinish) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("stop_mountable_finish"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (stopMountableFinish == null ? MemoryAddress.NULL : stopMountableFinish.toCallback()));
                return this;
            }
        }
        
        /**
         * a boolean that indicates whether the {@link File} implementation supports thread-default contexts. Since 2.22.
         * @param supportsThreadContexts The value for the {@code supportsThreadContexts} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setSupportsThreadContexts(boolean supportsThreadContexts) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("supports_thread_contexts"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), Marshal.booleanToInteger.marshal(supportsThreadContexts, null).intValue());
                return this;
            }
        }
        
        public Builder setUnmountMountableWithOperation(UnmountMountableWithOperationCallback unmountMountableWithOperation) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("unmount_mountable_with_operation"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (unmountMountableWithOperation == null ? MemoryAddress.NULL : unmountMountableWithOperation.toCallback()));
                return this;
            }
        }
        
        public Builder setUnmountMountableWithOperationFinish(UnmountMountableWithOperationFinishCallback unmountMountableWithOperationFinish) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("unmount_mountable_with_operation_finish"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (unmountMountableWithOperationFinish == null ? MemoryAddress.NULL : unmountMountableWithOperationFinish.toCallback()));
                return this;
            }
        }
        
        public Builder setEjectMountableWithOperation(EjectMountableWithOperationCallback ejectMountableWithOperation) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("eject_mountable_with_operation"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (ejectMountableWithOperation == null ? MemoryAddress.NULL : ejectMountableWithOperation.toCallback()));
                return this;
            }
        }
        
        public Builder setEjectMountableWithOperationFinish(EjectMountableWithOperationFinishCallback ejectMountableWithOperationFinish) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("eject_mountable_with_operation_finish"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (ejectMountableWithOperationFinish == null ? MemoryAddress.NULL : ejectMountableWithOperationFinish.toCallback()));
                return this;
            }
        }
        
        public Builder setPollMountable(PollMountableCallback pollMountable) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("poll_mountable"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (pollMountable == null ? MemoryAddress.NULL : pollMountable.toCallback()));
                return this;
            }
        }
        
        public Builder setPollMountableFinish(PollMountableFinishCallback pollMountableFinish) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("poll_mountable_finish"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (pollMountableFinish == null ? MemoryAddress.NULL : pollMountableFinish.toCallback()));
                return this;
            }
        }
        
        public Builder setMeasureDiskUsage(MeasureDiskUsageCallback measureDiskUsage) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("measure_disk_usage"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (measureDiskUsage == null ? MemoryAddress.NULL : measureDiskUsage.toCallback()));
                return this;
            }
        }
        
        public Builder setMeasureDiskUsageAsync(MeasureDiskUsageAsyncCallback measureDiskUsageAsync) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("measure_disk_usage_async"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (measureDiskUsageAsync == null ? MemoryAddress.NULL : measureDiskUsageAsync.toCallback()));
                return this;
            }
        }
        
        public Builder setMeasureDiskUsageFinish(MeasureDiskUsageFinishCallback measureDiskUsageFinish) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("measure_disk_usage_finish"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (measureDiskUsageFinish == null ? MemoryAddress.NULL : measureDiskUsageFinish.toCallback()));
                return this;
            }
        }
    }
}
