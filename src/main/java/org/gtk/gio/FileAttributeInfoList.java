package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Acts as a lightweight registry for possible valid file attributes.
 * The registry stores Key-Value pair formats as {@code GFileAttributeInfos}.
 */
public class FileAttributeInfoList extends Struct {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GFileAttributeInfoList";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            Interop.valueLayout.ADDRESS.withName("infos"),
            Interop.valueLayout.C_INT.withName("n_infos")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link FileAttributeInfoList}
     * @return A new, uninitialized @{link FileAttributeInfoList}
     */
    public static FileAttributeInfoList allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        FileAttributeInfoList newInstance = new FileAttributeInfoList(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code infos}
     * @return The value of the field {@code infos}
     */
    public org.gtk.gio.FileAttributeInfo getInfos() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (MemoryAddress) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("infos"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return org.gtk.gio.FileAttributeInfo.fromAddress.marshal(RESULT, null);
        }
    }
    
    /**
     * Change the value of the field {@code infos}
     * @param infos The new value of the field {@code infos}
     */
    public void setInfos(org.gtk.gio.FileAttributeInfo infos) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("infos"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (infos == null ? MemoryAddress.NULL : infos.handle()));
        }
    }
    
    /**
     * Get the value of the field {@code n_infos}
     * @return The value of the field {@code n_infos}
     */
    public int getNInfos() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (int) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("n_infos"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return RESULT;
        }
    }
    
    /**
     * Change the value of the field {@code n_infos}
     * @param nInfos The new value of the field {@code n_infos}
     */
    public void setNInfos(int nInfos) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("n_infos"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), nInfos);
        }
    }
    
    /**
     * Create a FileAttributeInfoList proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected FileAttributeInfoList(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, FileAttributeInfoList> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new FileAttributeInfoList(input);
    
    private static MemoryAddress constructNew() {
        MemoryAddress RESULT;
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
        super(constructNew());
        this.takeOwnership();
    }
    
    /**
     * Adds a new attribute with {@code name} to the {@code list}, setting
     * its {@code type} and {@code flags}.
     * @param name the name of the attribute to add.
     * @param type the {@link FileAttributeType} for the attribute.
     * @param flags {@link FileAttributeInfoFlags} for the attribute.
     */
    public void add(java.lang.String name, org.gtk.gio.FileAttributeType type, org.gtk.gio.FileAttributeInfoFlags flags) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.g_file_attribute_info_list_add.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(name, SCOPE),
                        type.getValue(),
                        flags.getValue());
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
        }
    }
    
    /**
     * Makes a duplicate of a file attribute info list.
     * @return a copy of the given {@code list}.
     */
    public org.gtk.gio.FileAttributeInfoList dup() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_file_attribute_info_list_dup.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = org.gtk.gio.FileAttributeInfoList.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * Gets the file attribute with the name {@code name} from {@code list}.
     * @param name the name of the attribute to look up.
     * @return a {@link FileAttributeInfo} for the {@code name}, or {@code null} if an
     * attribute isn't found.
     */
    public org.gtk.gio.FileAttributeInfo lookup(java.lang.String name) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.g_file_attribute_info_list_lookup.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(name, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return org.gtk.gio.FileAttributeInfo.fromAddress.marshal(RESULT, null);
        }
    }
    
    /**
     * References a file attribute info list.
     * @return {@link FileAttributeInfoList} or {@code null} on error.
     */
    public org.gtk.gio.FileAttributeInfoList ref() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_file_attribute_info_list_ref.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = org.gtk.gio.FileAttributeInfoList.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * Removes a reference from the given {@code list}. If the reference count
     * falls to zero, the {@code list} is deleted.
     */
    public void unref() {
        try {
            DowncallHandles.g_file_attribute_info_list_unref.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_file_attribute_info_list_new = Interop.downcallHandle(
                "g_file_attribute_info_list_new",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_file_attribute_info_list_add = Interop.downcallHandle(
                "g_file_attribute_info_list_add",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle g_file_attribute_info_list_dup = Interop.downcallHandle(
                "g_file_attribute_info_list_dup",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_file_attribute_info_list_lookup = Interop.downcallHandle(
                "g_file_attribute_info_list_lookup",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_file_attribute_info_list_ref = Interop.downcallHandle(
                "g_file_attribute_info_list_ref",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_file_attribute_info_list_unref = Interop.downcallHandle(
                "g_file_attribute_info_list_unref",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
                false
        );
    }
    
    /**
     * A {@link FileAttributeInfoList.Builder} object constructs a {@link FileAttributeInfoList} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link FileAttributeInfoList.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final FileAttributeInfoList struct;
        
        private Builder() {
            struct = FileAttributeInfoList.allocate();
        }
        
        /**
         * Finish building the {@link FileAttributeInfoList} struct.
         * @return A new instance of {@code FileAttributeInfoList} with the fields 
         *         that were set in the Builder object.
         */
        public FileAttributeInfoList build() {
            return struct;
        }
        
        /**
         * an array of {@code GFileAttributeInfos}.
         * @param infos The value for the {@code infos} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setInfos(org.gtk.gio.FileAttributeInfo infos) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("infos"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (infos == null ? MemoryAddress.NULL : infos.handle()));
                return this;
            }
        }
        
        /**
         * the number of values in the array.
         * @param nInfos The value for the {@code nInfos} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setNInfos(int nInfos) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("n_infos"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), nInfos);
                return this;
            }
        }
    }
}
