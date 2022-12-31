package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class InetAddressClass extends Struct {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GInetAddressClass";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gtk.gobject.ObjectClass.getMemoryLayout().withName("parent_class"),
            Interop.valueLayout.ADDRESS.withName("to_string"),
            Interop.valueLayout.ADDRESS.withName("to_bytes")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link InetAddressClass}
     * @return A new, uninitialized @{link InetAddressClass}
     */
    public static InetAddressClass allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        InetAddressClass newInstance = new InetAddressClass(segment.address(), Ownership.NONE);
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
    public interface ToStringCallback {
        java.lang.String run(org.gtk.gio.InetAddress address);

        @ApiStatus.Internal default Addressable upcall(MemoryAddress address) {
            var RESULT = run((org.gtk.gio.InetAddress) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(address)), org.gtk.gio.InetAddress.fromAddress).marshal(address, Ownership.NONE));
            return RESULT == null ? MemoryAddress.NULL.address() : (Marshal.stringToAddress.marshal(RESULT, null)).address();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(ToStringCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code to_string}
     * @param toString The new value of the field {@code to_string}
     */
    public void setToString(ToStringCallback toString) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("to_string"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (toString == null ? MemoryAddress.NULL : toString.toCallback()));
    }
    
    @FunctionalInterface
    public interface ToBytesCallback {
        PointerByte run(org.gtk.gio.InetAddress address);

        @ApiStatus.Internal default Addressable upcall(MemoryAddress address) {
            var RESULT = run((org.gtk.gio.InetAddress) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(address)), org.gtk.gio.InetAddress.fromAddress).marshal(address, Ownership.NONE));
            return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(ToBytesCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code to_bytes}
     * @param toBytes The new value of the field {@code to_bytes}
     */
    public void setToBytes(ToBytesCallback toBytes) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("to_bytes"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (toBytes == null ? MemoryAddress.NULL : toBytes.toCallback()));
    }
    
    /**
     * Create a InetAddressClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected InetAddressClass(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, InetAddressClass> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new InetAddressClass(input, ownership);
    
    /**
     * A {@link InetAddressClass.Builder} object constructs a {@link InetAddressClass} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link InetAddressClass.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final InetAddressClass struct;
        
        private Builder() {
            struct = InetAddressClass.allocate();
        }
        
         /**
         * Finish building the {@link InetAddressClass} struct.
         * @return A new instance of {@code InetAddressClass} with the fields 
         *         that were set in the Builder object.
         */
        public InetAddressClass build() {
            return struct;
        }
        
        public Builder setParentClass(org.gtk.gobject.ObjectClass parentClass) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
            return this;
        }
        
        public Builder setToString(ToStringCallback toString) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("to_string"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (toString == null ? MemoryAddress.NULL : toString.toCallback()));
            return this;
        }
        
        public Builder setToBytes(ToBytesCallback toBytes) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("to_bytes"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (toBytes == null ? MemoryAddress.NULL : toBytes.toCallback()));
            return this;
        }
    }
}
