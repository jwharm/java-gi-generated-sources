package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * An interface for file descriptor based io objects.
 */
public class FileDescriptorBasedIface extends Struct {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GFileDescriptorBasedIface";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gtk.gobject.TypeInterface.getMemoryLayout().withName("g_iface"),
            Interop.valueLayout.ADDRESS.withName("get_fd")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link FileDescriptorBasedIface}
     * @return A new, uninitialized @{link FileDescriptorBasedIface}
     */
    public static FileDescriptorBasedIface allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        FileDescriptorBasedIface newInstance = new FileDescriptorBasedIface(segment.address(), Ownership.NONE);
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
    public interface GetFdCallback {
        int run(org.gtk.gio.FileDescriptorBased fdBased);

        @ApiStatus.Internal default int upcall(MemoryAddress fdBased) {
            var RESULT = run((org.gtk.gio.FileDescriptorBased) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(fdBased)), org.gtk.gio.FileDescriptorBased.fromAddress).marshal(fdBased, Ownership.NONE));
            return RESULT;
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(GetFdCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_fd}
     * @param getFd The new value of the field {@code get_fd}
     */
    public void setGetFd(GetFdCallback getFd) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("get_fd"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getFd == null ? MemoryAddress.NULL : getFd.toCallback()));
    }
    
    /**
     * Create a FileDescriptorBasedIface proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected FileDescriptorBasedIface(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, FileDescriptorBasedIface> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new FileDescriptorBasedIface(input, ownership);
    
    /**
     * A {@link FileDescriptorBasedIface.Builder} object constructs a {@link FileDescriptorBasedIface} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link FileDescriptorBasedIface.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final FileDescriptorBasedIface struct;
        
        private Builder() {
            struct = FileDescriptorBasedIface.allocate();
        }
        
         /**
         * Finish building the {@link FileDescriptorBasedIface} struct.
         * @return A new instance of {@code FileDescriptorBasedIface} with the fields 
         *         that were set in the Builder object.
         */
        public FileDescriptorBasedIface build() {
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
        
        public Builder setGetFd(GetFdCallback getFd) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_fd"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getFd == null ? MemoryAddress.NULL : getFd.toCallback()));
            return this;
        }
    }
}
