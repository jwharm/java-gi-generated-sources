package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Acts as a lightweight registry for possible valid file attributes.
 * The registry stores Key-Value pair formats as {@code GFileAttributeInfos}.
 */
public class FileAttributeInfoList extends io.github.jwharm.javagi.ResourceBase {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GFileAttributeInfoList";
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        Interop.valueLayout.ADDRESS.withName("infos"),
        ValueLayout.JAVA_INT.withName("n_infos")
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
    
    public static FileAttributeInfoList allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        FileAttributeInfoList newInstance = new FileAttributeInfoList(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code infos}
     * @return The value of the field {@code infos}
     */
    public org.gtk.gio.FileAttributeInfo infos$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("infos"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new org.gtk.gio.FileAttributeInfo(RESULT, Ownership.UNKNOWN);
    }
    
    /**
     * Change the value of the field {@code infos}
     * @param infos The new value of the field {@code infos}
     */
    public void infos$set(org.gtk.gio.FileAttributeInfo infos) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("infos"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), infos.handle());
    }
    
    /**
     * Get the value of the field {@code n_infos}
     * @return The value of the field {@code n_infos}
     */
    public int n_infos$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("n_infos"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code n_infos}
     * @param n_infos The new value of the field {@code n_infos}
     */
    public void n_infos$set(int n_infos) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("n_infos"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), n_infos);
    }
    
    /**
     * Create a FileAttributeInfoList proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public FileAttributeInfoList(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    private static Addressable constructNew() {
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_file_attribute_info_list_new.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new file attribute info list.
     */
    public FileAttributeInfoList() {
        super(constructNew(), Ownership.FULL);
    }
    
    /**
     * Adds a new attribute with {@code name} to the {@code list}, setting
     * its {@code type} and {@code flags}.
     * @param name the name of the attribute to add.
     * @param type the {@link FileAttributeType} for the attribute.
     * @param flags {@link FileAttributeInfoFlags} for the attribute.
     */
    public void add(@NotNull java.lang.String name, @NotNull org.gtk.gio.FileAttributeType type, @NotNull org.gtk.gio.FileAttributeInfoFlags flags) {
        java.util.Objects.requireNonNull(name, "Parameter 'name' must not be null");
        java.util.Objects.requireNonNull(type, "Parameter 'type' must not be null");
        java.util.Objects.requireNonNull(flags, "Parameter 'flags' must not be null");
        try {
            DowncallHandles.g_file_attribute_info_list_add.invokeExact(
                    handle(),
                    Interop.allocateNativeString(name),
                    type.getValue(),
                    flags.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Makes a duplicate of a file attribute info list.
     * @return a copy of the given {@code list}.
     */
    public @NotNull org.gtk.gio.FileAttributeInfoList dup() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_file_attribute_info_list_dup.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gio.FileAttributeInfoList(RESULT, Ownership.FULL);
    }
    
    /**
     * Gets the file attribute with the name {@code name} from {@code list}.
     * @param name the name of the attribute to look up.
     * @return a {@link FileAttributeInfo} for the {@code name}, or {@code null} if an
     * attribute isn't found.
     */
    public @NotNull org.gtk.gio.FileAttributeInfo lookup(@NotNull java.lang.String name) {
        java.util.Objects.requireNonNull(name, "Parameter 'name' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_file_attribute_info_list_lookup.invokeExact(
                    handle(),
                    Interop.allocateNativeString(name));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gio.FileAttributeInfo(RESULT, Ownership.NONE);
    }
    
    /**
     * References a file attribute info list.
     * @return {@link FileAttributeInfoList} or {@code null} on error.
     */
    public @NotNull org.gtk.gio.FileAttributeInfoList ref() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_file_attribute_info_list_ref.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gio.FileAttributeInfoList(RESULT, Ownership.FULL);
    }
    
    /**
     * Removes a reference from the given {@code list}. If the reference count
     * falls to zero, the {@code list} is deleted.
     */
    public void unref() {
        try {
            DowncallHandles.g_file_attribute_info_list_unref.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_file_attribute_info_list_new = Interop.downcallHandle(
            "g_file_attribute_info_list_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_file_attribute_info_list_add = Interop.downcallHandle(
            "g_file_attribute_info_list_add",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT),
            false
        );
        
        private static final MethodHandle g_file_attribute_info_list_dup = Interop.downcallHandle(
            "g_file_attribute_info_list_dup",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_file_attribute_info_list_lookup = Interop.downcallHandle(
            "g_file_attribute_info_list_lookup",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_file_attribute_info_list_ref = Interop.downcallHandle(
            "g_file_attribute_info_list_ref",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_file_attribute_info_list_unref = Interop.downcallHandle(
            "g_file_attribute_info_list_unref",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS),
            false
        );
    }
}
