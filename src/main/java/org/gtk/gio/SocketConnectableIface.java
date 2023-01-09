package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Provides an interface for returning a {@link SocketAddressEnumerator}
 * and {@link ProxyAddressEnumerator}
 */
public class SocketConnectableIface extends Struct {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GSocketConnectableIface";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gtk.gobject.TypeInterface.getMemoryLayout().withName("g_iface"),
            Interop.valueLayout.ADDRESS.withName("enumerate"),
            Interop.valueLayout.ADDRESS.withName("proxy_enumerate"),
            Interop.valueLayout.ADDRESS.withName("to_string")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link SocketConnectableIface}
     * @return A new, uninitialized @{link SocketConnectableIface}
     */
    public static SocketConnectableIface allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        SocketConnectableIface newInstance = new SocketConnectableIface(segment.address());
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
     * Functional interface declaration of the {@code EnumerateCallback} callback.
     */
    @FunctionalInterface
    public interface EnumerateCallback {
    
        org.gtk.gio.SocketAddressEnumerator run(org.gtk.gio.SocketConnectable connectable);
        
        @ApiStatus.Internal default Addressable upcall(MemoryAddress connectable) {
            var RESULT = run((org.gtk.gio.SocketConnectable) Interop.register(connectable, org.gtk.gio.SocketConnectable.fromAddress).marshal(connectable, null));
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
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), EnumerateCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code enumerate}
     * @param enumerate The new value of the field {@code enumerate}
     */
    public void setEnumerate(EnumerateCallback enumerate) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("enumerate"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (enumerate == null ? MemoryAddress.NULL : enumerate.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code ProxyEnumerateCallback} callback.
     */
    @FunctionalInterface
    public interface ProxyEnumerateCallback {
    
        org.gtk.gio.SocketAddressEnumerator run(org.gtk.gio.SocketConnectable connectable);
        
        @ApiStatus.Internal default Addressable upcall(MemoryAddress connectable) {
            var RESULT = run((org.gtk.gio.SocketConnectable) Interop.register(connectable, org.gtk.gio.SocketConnectable.fromAddress).marshal(connectable, null));
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
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), ProxyEnumerateCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code proxy_enumerate}
     * @param proxyEnumerate The new value of the field {@code proxy_enumerate}
     */
    public void setProxyEnumerate(ProxyEnumerateCallback proxyEnumerate) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("proxy_enumerate"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (proxyEnumerate == null ? MemoryAddress.NULL : proxyEnumerate.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code ToStringCallback} callback.
     */
    @FunctionalInterface
    public interface ToStringCallback {
    
        java.lang.String run(org.gtk.gio.SocketConnectable connectable);
        
        @ApiStatus.Internal default Addressable upcall(MemoryAddress connectable) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                var RESULT = run((org.gtk.gio.SocketConnectable) Interop.register(connectable, org.gtk.gio.SocketConnectable.fromAddress).marshal(connectable, null));
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
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), ToStringCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code to_string}
     * @param toString The new value of the field {@code to_string}
     */
    public void setToString(ToStringCallback toString) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("to_string"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (toString == null ? MemoryAddress.NULL : toString.toCallback()));
        }
    }
    
    /**
     * Create a SocketConnectableIface proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected SocketConnectableIface(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, SocketConnectableIface> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new SocketConnectableIface(input);
    
    /**
     * A {@link SocketConnectableIface.Builder} object constructs a {@link SocketConnectableIface} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link SocketConnectableIface.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final SocketConnectableIface struct;
        
        private Builder() {
            struct = SocketConnectableIface.allocate();
        }
        
        /**
         * Finish building the {@link SocketConnectableIface} struct.
         * @return A new instance of {@code SocketConnectableIface} with the fields 
         *         that were set in the Builder object.
         */
        public SocketConnectableIface build() {
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
        
        public Builder setEnumerate(EnumerateCallback enumerate) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("enumerate"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (enumerate == null ? MemoryAddress.NULL : enumerate.toCallback()));
                return this;
            }
        }
        
        public Builder setProxyEnumerate(ProxyEnumerateCallback proxyEnumerate) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("proxy_enumerate"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (proxyEnumerate == null ? MemoryAddress.NULL : proxyEnumerate.toCallback()));
                return this;
            }
        }
        
        public Builder setToString(ToStringCallback toString) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("to_string"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (toString == null ? MemoryAddress.NULL : toString.toCallback()));
                return this;
            }
        }
    }
}
