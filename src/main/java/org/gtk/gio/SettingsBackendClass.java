package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Class structure for {@link SettingsBackend}.
 */
public class SettingsBackendClass extends Struct {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GSettingsBackendClass";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gobject.ObjectClass.getMemoryLayout().withName("parent_class"),
        Interop.valueLayout.ADDRESS.withName("read"),
        Interop.valueLayout.ADDRESS.withName("get_writable"),
        Interop.valueLayout.ADDRESS.withName("write"),
        Interop.valueLayout.ADDRESS.withName("write_tree"),
        Interop.valueLayout.ADDRESS.withName("reset"),
        Interop.valueLayout.ADDRESS.withName("subscribe"),
        Interop.valueLayout.ADDRESS.withName("unsubscribe"),
        Interop.valueLayout.ADDRESS.withName("sync"),
        Interop.valueLayout.ADDRESS.withName("get_permission"),
        Interop.valueLayout.ADDRESS.withName("read_user_value"),
        MemoryLayout.sequenceLayout(23, Interop.valueLayout.ADDRESS).withName("padding")
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
     * Allocate a new {@link SettingsBackendClass}
     * @return A new, uninitialized @{link SettingsBackendClass}
     */
    public static SettingsBackendClass allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        SettingsBackendClass newInstance = new SettingsBackendClass(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code parent_class}
     * @return The value of the field {@code parent_class}
     */
    public org.gtk.gobject.ObjectClass parent_class$get() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent_class"));
        return new org.gtk.gobject.ObjectClass(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Create a SettingsBackendClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public SettingsBackendClass(Addressable address, Ownership ownership) {
        super(address, ownership);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private SettingsBackendClass struct;
        
         /**
         * A {@link SettingsBackendClass.Build} object constructs a {@link SettingsBackendClass} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = SettingsBackendClass.allocate();
        }
        
         /**
         * Finish building the {@link SettingsBackendClass} struct.
         * @return A new instance of {@code SettingsBackendClass} with the fields 
         *         that were set in the Build object.
         */
        public SettingsBackendClass construct() {
            return struct;
        }
        
        public Build setParentClass(org.gtk.gobject.ObjectClass parent_class) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parent_class == null ? MemoryAddress.NULL : parent_class.handle()));
            return this;
        }
        
        public Build setRead(java.lang.foreign.MemoryAddress read) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("read"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (read == null ? MemoryAddress.NULL : read));
            return this;
        }
        
        public Build setGetWritable(java.lang.foreign.MemoryAddress get_writable) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_writable"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (get_writable == null ? MemoryAddress.NULL : get_writable));
            return this;
        }
        
        public Build setWrite(java.lang.foreign.MemoryAddress write) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("write"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (write == null ? MemoryAddress.NULL : write));
            return this;
        }
        
        public Build setWriteTree(java.lang.foreign.MemoryAddress write_tree) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("write_tree"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (write_tree == null ? MemoryAddress.NULL : write_tree));
            return this;
        }
        
        public Build setReset(java.lang.foreign.MemoryAddress reset) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("reset"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (reset == null ? MemoryAddress.NULL : reset));
            return this;
        }
        
        public Build setSubscribe(java.lang.foreign.MemoryAddress subscribe) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("subscribe"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (subscribe == null ? MemoryAddress.NULL : subscribe));
            return this;
        }
        
        public Build setUnsubscribe(java.lang.foreign.MemoryAddress unsubscribe) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("unsubscribe"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (unsubscribe == null ? MemoryAddress.NULL : unsubscribe));
            return this;
        }
        
        public Build setSync(java.lang.foreign.MemoryAddress sync) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("sync"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (sync == null ? MemoryAddress.NULL : sync));
            return this;
        }
        
        public Build setGetPermission(java.lang.foreign.MemoryAddress get_permission) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_permission"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (get_permission == null ? MemoryAddress.NULL : get_permission));
            return this;
        }
        
        public Build setReadUserValue(java.lang.foreign.MemoryAddress read_user_value) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("read_user_value"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (read_user_value == null ? MemoryAddress.NULL : read_user_value));
            return this;
        }
        
        public Build setPadding(java.lang.foreign.MemoryAddress[] padding) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("padding"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (padding == null ? MemoryAddress.NULL : Interop.allocateNativeArray(padding, false)));
            return this;
        }
    }
}
