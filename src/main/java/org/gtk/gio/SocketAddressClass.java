package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class SocketAddressClass extends Struct {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GSocketAddressClass";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gtk.gobject.ObjectClass.getMemoryLayout().withName("parent_class"),
            Interop.valueLayout.ADDRESS.withName("get_family"),
            Interop.valueLayout.ADDRESS.withName("get_native_size"),
            Interop.valueLayout.ADDRESS.withName("to_native")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link SocketAddressClass}
     * @return A new, uninitialized @{link SocketAddressClass}
     */
    public static SocketAddressClass allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        SocketAddressClass newInstance = new SocketAddressClass(segment.address(), Ownership.NONE);
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
    public interface GetFamilyCallback {
        org.gtk.gio.SocketFamily run(org.gtk.gio.SocketAddress address);

        @ApiStatus.Internal default int upcall(MemoryAddress address) {
            var RESULT = run((org.gtk.gio.SocketAddress) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(address)), org.gtk.gio.SocketAddress.fromAddress).marshal(address, Ownership.NONE));
            return RESULT.getValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(GetFamilyCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_family}
     * @param getFamily The new value of the field {@code get_family}
     */
    public void setGetFamily(GetFamilyCallback getFamily) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("get_family"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getFamily == null ? MemoryAddress.NULL : getFamily.toCallback()));
    }
    
    @FunctionalInterface
    public interface GetNativeSizeCallback {
        long run(org.gtk.gio.SocketAddress address);

        @ApiStatus.Internal default long upcall(MemoryAddress address) {
            var RESULT = run((org.gtk.gio.SocketAddress) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(address)), org.gtk.gio.SocketAddress.fromAddress).marshal(address, Ownership.NONE));
            return RESULT;
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(GetNativeSizeCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_native_size}
     * @param getNativeSize The new value of the field {@code get_native_size}
     */
    public void setGetNativeSize(GetNativeSizeCallback getNativeSize) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("get_native_size"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getNativeSize == null ? MemoryAddress.NULL : getNativeSize.toCallback()));
    }
    
    @FunctionalInterface
    public interface ToNativeCallback {
        boolean run(org.gtk.gio.SocketAddress address, @Nullable java.lang.foreign.MemoryAddress dest, long destlen);

        @ApiStatus.Internal default int upcall(MemoryAddress address, MemoryAddress dest, long destlen) {
            var RESULT = run((org.gtk.gio.SocketAddress) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(address)), org.gtk.gio.SocketAddress.fromAddress).marshal(address, Ownership.NONE), dest, destlen);
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(ToNativeCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code to_native}
     * @param toNative The new value of the field {@code to_native}
     */
    public void setToNative(ToNativeCallback toNative) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("to_native"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (toNative == null ? MemoryAddress.NULL : toNative.toCallback()));
    }
    
    /**
     * Create a SocketAddressClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected SocketAddressClass(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, SocketAddressClass> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new SocketAddressClass(input, ownership);
    
    /**
     * A {@link SocketAddressClass.Builder} object constructs a {@link SocketAddressClass} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link SocketAddressClass.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final SocketAddressClass struct;
        
        private Builder() {
            struct = SocketAddressClass.allocate();
        }
        
         /**
         * Finish building the {@link SocketAddressClass} struct.
         * @return A new instance of {@code SocketAddressClass} with the fields 
         *         that were set in the Builder object.
         */
        public SocketAddressClass build() {
            return struct;
        }
        
        public Builder setParentClass(org.gtk.gobject.ObjectClass parentClass) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
            return this;
        }
        
        public Builder setGetFamily(GetFamilyCallback getFamily) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_family"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getFamily == null ? MemoryAddress.NULL : getFamily.toCallback()));
            return this;
        }
        
        public Builder setGetNativeSize(GetNativeSizeCallback getNativeSize) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_native_size"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getNativeSize == null ? MemoryAddress.NULL : getNativeSize.toCallback()));
            return this;
        }
        
        public Builder setToNative(ToNativeCallback toNative) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("to_native"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (toNative == null ? MemoryAddress.NULL : toNative.toCallback()));
            return this;
        }
    }
}
