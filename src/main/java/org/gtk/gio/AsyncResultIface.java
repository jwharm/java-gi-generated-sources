package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Interface definition for {@link AsyncResult}.
 */
public class AsyncResultIface extends Struct {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GAsyncResultIface";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gobject.TypeInterface.getMemoryLayout().withName("g_iface"),
        Interop.valueLayout.ADDRESS.withName("get_user_data"),
        Interop.valueLayout.ADDRESS.withName("get_source_object"),
        Interop.valueLayout.ADDRESS.withName("is_tagged")
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
     * Allocate a new {@link AsyncResultIface}
     * @return A new, uninitialized @{link AsyncResultIface}
     */
    public static AsyncResultIface allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        AsyncResultIface newInstance = new AsyncResultIface(segment.address(), Ownership.NONE);
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
     * Create a AsyncResultIface proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public AsyncResultIface(Addressable address, Ownership ownership) {
        super(address, ownership);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private AsyncResultIface struct;
        
         /**
         * A {@link AsyncResultIface.Build} object constructs a {@link AsyncResultIface} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = AsyncResultIface.allocate();
        }
        
         /**
         * Finish building the {@link AsyncResultIface} struct.
         * @return A new instance of {@code AsyncResultIface} with the fields 
         *         that were set in the Build object.
         */
        public AsyncResultIface construct() {
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
        
        public Build setGetUserData(java.lang.foreign.MemoryAddress getUserData) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_user_data"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getUserData == null ? MemoryAddress.NULL : getUserData));
            return this;
        }
        
        public Build setGetSourceObject(java.lang.foreign.MemoryAddress getSourceObject) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_source_object"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getSourceObject == null ? MemoryAddress.NULL : getSourceObject));
            return this;
        }
        
        public Build setIsTagged(java.lang.foreign.MemoryAddress isTagged) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("is_tagged"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (isTagged == null ? MemoryAddress.NULL : isTagged));
            return this;
        }
    }
}
