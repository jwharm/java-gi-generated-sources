package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class VfsClass extends Struct {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GVfsClass";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gtk.gobject.ObjectClass.getMemoryLayout().withName("parent_class"),
            Interop.valueLayout.ADDRESS.withName("is_active"),
            Interop.valueLayout.ADDRESS.withName("get_file_for_path"),
            Interop.valueLayout.ADDRESS.withName("get_file_for_uri"),
            Interop.valueLayout.ADDRESS.withName("get_supported_uri_schemes"),
            Interop.valueLayout.ADDRESS.withName("parse_name"),
            Interop.valueLayout.ADDRESS.withName("local_file_add_info"),
            Interop.valueLayout.ADDRESS.withName("add_writable_namespaces"),
            Interop.valueLayout.ADDRESS.withName("local_file_set_attributes"),
            Interop.valueLayout.ADDRESS.withName("local_file_removed"),
            Interop.valueLayout.ADDRESS.withName("local_file_moved"),
            Interop.valueLayout.ADDRESS.withName("deserialize_icon"),
            Interop.valueLayout.ADDRESS.withName("_g_reserved1"),
            Interop.valueLayout.ADDRESS.withName("_g_reserved2"),
            Interop.valueLayout.ADDRESS.withName("_g_reserved3"),
            Interop.valueLayout.ADDRESS.withName("_g_reserved4"),
            Interop.valueLayout.ADDRESS.withName("_g_reserved5"),
            Interop.valueLayout.ADDRESS.withName("_g_reserved6")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link VfsClass}
     * @return A new, uninitialized @{link VfsClass}
     */
    public static VfsClass allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        VfsClass newInstance = new VfsClass(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code parent_class}
     * @return The value of the field {@code parent_class}
     */
    public org.gtk.gobject.ObjectClass getParentClass() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent_class"));
        return org.gtk.gobject.ObjectClass.fromAddress.marshal(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Change the value of the field {@code parent_class}
     * @param parentClass The new value of the field {@code parent_class}
     */
    public void setParentClass(org.gtk.gobject.ObjectClass parentClass) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
    }
    
    @FunctionalInterface
    public interface IsActiveCallback {
        boolean run(org.gtk.gio.Vfs vfs);

        @ApiStatus.Internal default int upcall(MemoryAddress vfs) {
            var RESULT = run((org.gtk.gio.Vfs) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(vfs)), org.gtk.gio.Vfs.fromAddress).marshal(vfs, Ownership.NONE));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(IsActiveCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code is_active}
     * @param isActive The new value of the field {@code is_active}
     */
    public void setIsActive(IsActiveCallback isActive) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("is_active"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (isActive == null ? MemoryAddress.NULL : isActive.toCallback()));
    }
    
    @FunctionalInterface
    public interface GetFileForPathCallback {
        org.gtk.gio.File run(org.gtk.gio.Vfs vfs, java.lang.String path);

        @ApiStatus.Internal default Addressable upcall(MemoryAddress vfs, MemoryAddress path) {
            var RESULT = run((org.gtk.gio.Vfs) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(vfs)), org.gtk.gio.Vfs.fromAddress).marshal(vfs, Ownership.NONE), Marshal.addressToString.marshal(path, null));
            return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(GetFileForPathCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_file_for_path}
     * @param getFileForPath The new value of the field {@code get_file_for_path}
     */
    public void setGetFileForPath(GetFileForPathCallback getFileForPath) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("get_file_for_path"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getFileForPath == null ? MemoryAddress.NULL : getFileForPath.toCallback()));
    }
    
    @FunctionalInterface
    public interface GetFileForUriCallback {
        org.gtk.gio.File run(org.gtk.gio.Vfs vfs, java.lang.String uri);

        @ApiStatus.Internal default Addressable upcall(MemoryAddress vfs, MemoryAddress uri) {
            var RESULT = run((org.gtk.gio.Vfs) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(vfs)), org.gtk.gio.Vfs.fromAddress).marshal(vfs, Ownership.NONE), Marshal.addressToString.marshal(uri, null));
            return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(GetFileForUriCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_file_for_uri}
     * @param getFileForUri The new value of the field {@code get_file_for_uri}
     */
    public void setGetFileForUri(GetFileForUriCallback getFileForUri) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("get_file_for_uri"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getFileForUri == null ? MemoryAddress.NULL : getFileForUri.toCallback()));
    }
    
    @FunctionalInterface
    public interface GetSupportedUriSchemesCallback {
        java.lang.String[] run(org.gtk.gio.Vfs vfs);

        @ApiStatus.Internal default void upcall(MemoryAddress vfs) {
            run((org.gtk.gio.Vfs) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(vfs)), org.gtk.gio.Vfs.fromAddress).marshal(vfs, Ownership.NONE));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(GetSupportedUriSchemesCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_supported_uri_schemes}
     * @param getSupportedUriSchemes The new value of the field {@code get_supported_uri_schemes}
     */
    public void setGetSupportedUriSchemes(GetSupportedUriSchemesCallback getSupportedUriSchemes) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("get_supported_uri_schemes"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getSupportedUriSchemes == null ? MemoryAddress.NULL : getSupportedUriSchemes.toCallback()));
    }
    
    @FunctionalInterface
    public interface ParseNameCallback {
        org.gtk.gio.File run(org.gtk.gio.Vfs vfs, java.lang.String parseName);

        @ApiStatus.Internal default Addressable upcall(MemoryAddress vfs, MemoryAddress parseName) {
            var RESULT = run((org.gtk.gio.Vfs) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(vfs)), org.gtk.gio.Vfs.fromAddress).marshal(vfs, Ownership.NONE), Marshal.addressToString.marshal(parseName, null));
            return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(ParseNameCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code parse_name}
     * @param parseName The new value of the field {@code parse_name}
     */
    public void setParseName(ParseNameCallback parseName) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("parse_name"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parseName == null ? MemoryAddress.NULL : parseName.toCallback()));
    }
    
    @FunctionalInterface
    public interface LocalFileAddInfoCallback {
        void run(org.gtk.gio.Vfs vfs, java.lang.String filename, long device, org.gtk.gio.FileAttributeMatcher attributeMatcher, org.gtk.gio.FileInfo info, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable java.lang.foreign.MemoryAddress extraData, org.gtk.glib.DestroyNotify freeExtraData);

        @ApiStatus.Internal default void upcall(MemoryAddress vfs, MemoryAddress filename, long device, MemoryAddress attributeMatcher, MemoryAddress info, MemoryAddress cancellable, MemoryAddress extraData, MemoryAddress freeExtraData) {
            run((org.gtk.gio.Vfs) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(vfs)), org.gtk.gio.Vfs.fromAddress).marshal(vfs, Ownership.NONE), Marshal.addressToString.marshal(filename, null), device, org.gtk.gio.FileAttributeMatcher.fromAddress.marshal(attributeMatcher, Ownership.NONE), (org.gtk.gio.FileInfo) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(info)), org.gtk.gio.FileInfo.fromAddress).marshal(info, Ownership.NONE), (org.gtk.gio.Cancellable) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(cancellable)), org.gtk.gio.Cancellable.fromAddress).marshal(cancellable, Ownership.NONE), extraData, null /* Unsupported parameter type */);
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(LocalFileAddInfoCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code local_file_add_info}
     * @param localFileAddInfo The new value of the field {@code local_file_add_info}
     */
    public void setLocalFileAddInfo(LocalFileAddInfoCallback localFileAddInfo) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("local_file_add_info"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (localFileAddInfo == null ? MemoryAddress.NULL : localFileAddInfo.toCallback()));
    }
    
    @FunctionalInterface
    public interface AddWritableNamespacesCallback {
        void run(org.gtk.gio.Vfs vfs, org.gtk.gio.FileAttributeInfoList list);

        @ApiStatus.Internal default void upcall(MemoryAddress vfs, MemoryAddress list) {
            run((org.gtk.gio.Vfs) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(vfs)), org.gtk.gio.Vfs.fromAddress).marshal(vfs, Ownership.NONE), org.gtk.gio.FileAttributeInfoList.fromAddress.marshal(list, Ownership.NONE));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(AddWritableNamespacesCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code add_writable_namespaces}
     * @param addWritableNamespaces The new value of the field {@code add_writable_namespaces}
     */
    public void setAddWritableNamespaces(AddWritableNamespacesCallback addWritableNamespaces) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("add_writable_namespaces"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (addWritableNamespaces == null ? MemoryAddress.NULL : addWritableNamespaces.toCallback()));
    }
    
    @FunctionalInterface
    public interface LocalFileSetAttributesCallback {
        boolean run(org.gtk.gio.Vfs vfs, java.lang.String filename, org.gtk.gio.FileInfo info, org.gtk.gio.FileQueryInfoFlags flags, @Nullable org.gtk.gio.Cancellable cancellable);

        @ApiStatus.Internal default int upcall(MemoryAddress vfs, MemoryAddress filename, MemoryAddress info, int flags, MemoryAddress cancellable) {
            var RESULT = run((org.gtk.gio.Vfs) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(vfs)), org.gtk.gio.Vfs.fromAddress).marshal(vfs, Ownership.NONE), Marshal.addressToString.marshal(filename, null), (org.gtk.gio.FileInfo) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(info)), org.gtk.gio.FileInfo.fromAddress).marshal(info, Ownership.NONE), new org.gtk.gio.FileQueryInfoFlags(flags), (org.gtk.gio.Cancellable) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(cancellable)), org.gtk.gio.Cancellable.fromAddress).marshal(cancellable, Ownership.NONE));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(LocalFileSetAttributesCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code local_file_set_attributes}
     * @param localFileSetAttributes The new value of the field {@code local_file_set_attributes}
     */
    public void setLocalFileSetAttributes(LocalFileSetAttributesCallback localFileSetAttributes) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("local_file_set_attributes"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (localFileSetAttributes == null ? MemoryAddress.NULL : localFileSetAttributes.toCallback()));
    }
    
    @FunctionalInterface
    public interface LocalFileRemovedCallback {
        void run(org.gtk.gio.Vfs vfs, java.lang.String filename);

        @ApiStatus.Internal default void upcall(MemoryAddress vfs, MemoryAddress filename) {
            run((org.gtk.gio.Vfs) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(vfs)), org.gtk.gio.Vfs.fromAddress).marshal(vfs, Ownership.NONE), Marshal.addressToString.marshal(filename, null));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(LocalFileRemovedCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code local_file_removed}
     * @param localFileRemoved The new value of the field {@code local_file_removed}
     */
    public void setLocalFileRemoved(LocalFileRemovedCallback localFileRemoved) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("local_file_removed"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (localFileRemoved == null ? MemoryAddress.NULL : localFileRemoved.toCallback()));
    }
    
    @FunctionalInterface
    public interface LocalFileMovedCallback {
        void run(org.gtk.gio.Vfs vfs, java.lang.String source, java.lang.String dest);

        @ApiStatus.Internal default void upcall(MemoryAddress vfs, MemoryAddress source, MemoryAddress dest) {
            run((org.gtk.gio.Vfs) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(vfs)), org.gtk.gio.Vfs.fromAddress).marshal(vfs, Ownership.NONE), Marshal.addressToString.marshal(source, null), Marshal.addressToString.marshal(dest, null));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(LocalFileMovedCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code local_file_moved}
     * @param localFileMoved The new value of the field {@code local_file_moved}
     */
    public void setLocalFileMoved(LocalFileMovedCallback localFileMoved) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("local_file_moved"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (localFileMoved == null ? MemoryAddress.NULL : localFileMoved.toCallback()));
    }
    
    @FunctionalInterface
    public interface DeserializeIconCallback {
        org.gtk.gio.Icon run(org.gtk.gio.Vfs vfs, org.gtk.glib.Variant value);

        @ApiStatus.Internal default Addressable upcall(MemoryAddress vfs, MemoryAddress value) {
            var RESULT = run((org.gtk.gio.Vfs) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(vfs)), org.gtk.gio.Vfs.fromAddress).marshal(vfs, Ownership.NONE), org.gtk.glib.Variant.fromAddress.marshal(value, Ownership.NONE));
            return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(DeserializeIconCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code deserialize_icon}
     * @param deserializeIcon The new value of the field {@code deserialize_icon}
     */
    public void setDeserializeIcon(DeserializeIconCallback deserializeIcon) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("deserialize_icon"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (deserializeIcon == null ? MemoryAddress.NULL : deserializeIcon.toCallback()));
    }
    
    @FunctionalInterface
    public interface GReserved1Callback {
        void run();

        @ApiStatus.Internal default void upcall() {
            run();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid();
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(GReserved1Callback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code _g_reserved1}
     * @param GReserved1 The new value of the field {@code _g_reserved1}
     */
    public void setGReserved1(GReserved1Callback GReserved1) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("_g_reserved1"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (GReserved1 == null ? MemoryAddress.NULL : GReserved1.toCallback()));
    }
    
    @FunctionalInterface
    public interface GReserved2Callback {
        void run();

        @ApiStatus.Internal default void upcall() {
            run();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid();
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(GReserved2Callback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code _g_reserved2}
     * @param GReserved2 The new value of the field {@code _g_reserved2}
     */
    public void setGReserved2(GReserved2Callback GReserved2) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("_g_reserved2"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (GReserved2 == null ? MemoryAddress.NULL : GReserved2.toCallback()));
    }
    
    @FunctionalInterface
    public interface GReserved3Callback {
        void run();

        @ApiStatus.Internal default void upcall() {
            run();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid();
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(GReserved3Callback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code _g_reserved3}
     * @param GReserved3 The new value of the field {@code _g_reserved3}
     */
    public void setGReserved3(GReserved3Callback GReserved3) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("_g_reserved3"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (GReserved3 == null ? MemoryAddress.NULL : GReserved3.toCallback()));
    }
    
    @FunctionalInterface
    public interface GReserved4Callback {
        void run();

        @ApiStatus.Internal default void upcall() {
            run();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid();
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(GReserved4Callback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code _g_reserved4}
     * @param GReserved4 The new value of the field {@code _g_reserved4}
     */
    public void setGReserved4(GReserved4Callback GReserved4) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("_g_reserved4"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (GReserved4 == null ? MemoryAddress.NULL : GReserved4.toCallback()));
    }
    
    @FunctionalInterface
    public interface GReserved5Callback {
        void run();

        @ApiStatus.Internal default void upcall() {
            run();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid();
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(GReserved5Callback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code _g_reserved5}
     * @param GReserved5 The new value of the field {@code _g_reserved5}
     */
    public void setGReserved5(GReserved5Callback GReserved5) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("_g_reserved5"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (GReserved5 == null ? MemoryAddress.NULL : GReserved5.toCallback()));
    }
    
    @FunctionalInterface
    public interface GReserved6Callback {
        void run();

        @ApiStatus.Internal default void upcall() {
            run();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid();
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(GReserved6Callback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code _g_reserved6}
     * @param GReserved6 The new value of the field {@code _g_reserved6}
     */
    public void setGReserved6(GReserved6Callback GReserved6) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("_g_reserved6"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (GReserved6 == null ? MemoryAddress.NULL : GReserved6.toCallback()));
    }
    
    /**
     * Create a VfsClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected VfsClass(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, VfsClass> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new VfsClass(input, ownership);
    
    /**
     * A {@link VfsClass.Builder} object constructs a {@link VfsClass} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link VfsClass.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final VfsClass struct;
        
        private Builder() {
            struct = VfsClass.allocate();
        }
        
         /**
         * Finish building the {@link VfsClass} struct.
         * @return A new instance of {@code VfsClass} with the fields 
         *         that were set in the Builder object.
         */
        public VfsClass build() {
            return struct;
        }
        
        public Builder setParentClass(org.gtk.gobject.ObjectClass parentClass) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
            return this;
        }
        
        public Builder setIsActive(IsActiveCallback isActive) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("is_active"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (isActive == null ? MemoryAddress.NULL : isActive.toCallback()));
            return this;
        }
        
        public Builder setGetFileForPath(GetFileForPathCallback getFileForPath) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_file_for_path"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getFileForPath == null ? MemoryAddress.NULL : getFileForPath.toCallback()));
            return this;
        }
        
        public Builder setGetFileForUri(GetFileForUriCallback getFileForUri) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_file_for_uri"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getFileForUri == null ? MemoryAddress.NULL : getFileForUri.toCallback()));
            return this;
        }
        
        public Builder setGetSupportedUriSchemes(GetSupportedUriSchemesCallback getSupportedUriSchemes) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_supported_uri_schemes"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getSupportedUriSchemes == null ? MemoryAddress.NULL : getSupportedUriSchemes.toCallback()));
            return this;
        }
        
        public Builder setParseName(ParseNameCallback parseName) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parse_name"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parseName == null ? MemoryAddress.NULL : parseName.toCallback()));
            return this;
        }
        
        public Builder setLocalFileAddInfo(LocalFileAddInfoCallback localFileAddInfo) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("local_file_add_info"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (localFileAddInfo == null ? MemoryAddress.NULL : localFileAddInfo.toCallback()));
            return this;
        }
        
        public Builder setAddWritableNamespaces(AddWritableNamespacesCallback addWritableNamespaces) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("add_writable_namespaces"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (addWritableNamespaces == null ? MemoryAddress.NULL : addWritableNamespaces.toCallback()));
            return this;
        }
        
        public Builder setLocalFileSetAttributes(LocalFileSetAttributesCallback localFileSetAttributes) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("local_file_set_attributes"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (localFileSetAttributes == null ? MemoryAddress.NULL : localFileSetAttributes.toCallback()));
            return this;
        }
        
        public Builder setLocalFileRemoved(LocalFileRemovedCallback localFileRemoved) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("local_file_removed"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (localFileRemoved == null ? MemoryAddress.NULL : localFileRemoved.toCallback()));
            return this;
        }
        
        public Builder setLocalFileMoved(LocalFileMovedCallback localFileMoved) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("local_file_moved"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (localFileMoved == null ? MemoryAddress.NULL : localFileMoved.toCallback()));
            return this;
        }
        
        public Builder setDeserializeIcon(DeserializeIconCallback deserializeIcon) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("deserialize_icon"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (deserializeIcon == null ? MemoryAddress.NULL : deserializeIcon.toCallback()));
            return this;
        }
        
        public Builder setGReserved1(GReserved1Callback GReserved1) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("_g_reserved1"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (GReserved1 == null ? MemoryAddress.NULL : GReserved1.toCallback()));
            return this;
        }
        
        public Builder setGReserved2(GReserved2Callback GReserved2) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("_g_reserved2"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (GReserved2 == null ? MemoryAddress.NULL : GReserved2.toCallback()));
            return this;
        }
        
        public Builder setGReserved3(GReserved3Callback GReserved3) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("_g_reserved3"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (GReserved3 == null ? MemoryAddress.NULL : GReserved3.toCallback()));
            return this;
        }
        
        public Builder setGReserved4(GReserved4Callback GReserved4) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("_g_reserved4"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (GReserved4 == null ? MemoryAddress.NULL : GReserved4.toCallback()));
            return this;
        }
        
        public Builder setGReserved5(GReserved5Callback GReserved5) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("_g_reserved5"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (GReserved5 == null ? MemoryAddress.NULL : GReserved5.toCallback()));
            return this;
        }
        
        public Builder setGReserved6(GReserved6Callback GReserved6) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("_g_reserved6"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (GReserved6 == null ? MemoryAddress.NULL : GReserved6.toCallback()));
            return this;
        }
    }
}
