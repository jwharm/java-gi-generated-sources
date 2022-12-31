package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The virtual function table for {@link ProxyResolver}.
 */
public class ProxyResolverInterface extends Struct {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GProxyResolverInterface";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gtk.gobject.TypeInterface.getMemoryLayout().withName("g_iface"),
            Interop.valueLayout.ADDRESS.withName("is_supported"),
            Interop.valueLayout.ADDRESS.withName("lookup"),
            Interop.valueLayout.ADDRESS.withName("lookup_async"),
            Interop.valueLayout.ADDRESS.withName("lookup_finish")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link ProxyResolverInterface}
     * @return A new, uninitialized @{link ProxyResolverInterface}
     */
    public static ProxyResolverInterface allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        ProxyResolverInterface newInstance = new ProxyResolverInterface(segment.address(), Ownership.NONE);
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
    public interface IsSupportedCallback {
        boolean run(org.gtk.gio.ProxyResolver resolver);

        @ApiStatus.Internal default int upcall(MemoryAddress resolver) {
            var RESULT = run((org.gtk.gio.ProxyResolver) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(resolver)), org.gtk.gio.ProxyResolver.fromAddress).marshal(resolver, Ownership.NONE));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(IsSupportedCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code is_supported}
     * @param isSupported The new value of the field {@code is_supported}
     */
    public void setIsSupported(IsSupportedCallback isSupported) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("is_supported"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (isSupported == null ? MemoryAddress.NULL : isSupported.toCallback()));
    }
    
    @FunctionalInterface
    public interface LookupCallback {
        java.lang.String[] run(org.gtk.gio.ProxyResolver resolver, java.lang.String uri, @Nullable org.gtk.gio.Cancellable cancellable);

        @ApiStatus.Internal default void upcall(MemoryAddress resolver, MemoryAddress uri, MemoryAddress cancellable) {
            run((org.gtk.gio.ProxyResolver) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(resolver)), org.gtk.gio.ProxyResolver.fromAddress).marshal(resolver, Ownership.NONE), Marshal.addressToString.marshal(uri, null), (org.gtk.gio.Cancellable) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(cancellable)), org.gtk.gio.Cancellable.fromAddress).marshal(cancellable, Ownership.NONE));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(LookupCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code lookup}
     * @param lookup The new value of the field {@code lookup}
     */
    public void setLookup(LookupCallback lookup) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("lookup"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (lookup == null ? MemoryAddress.NULL : lookup.toCallback()));
    }
    
    @FunctionalInterface
    public interface LookupAsyncCallback {
        void run(org.gtk.gio.ProxyResolver resolver, java.lang.String uri, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.AsyncReadyCallback callback);

        @ApiStatus.Internal default void upcall(MemoryAddress resolver, MemoryAddress uri, MemoryAddress cancellable, MemoryAddress callback, MemoryAddress userData) {
            run((org.gtk.gio.ProxyResolver) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(resolver)), org.gtk.gio.ProxyResolver.fromAddress).marshal(resolver, Ownership.NONE), Marshal.addressToString.marshal(uri, null), (org.gtk.gio.Cancellable) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(cancellable)), org.gtk.gio.Cancellable.fromAddress).marshal(cancellable, Ownership.NONE), null /* Unsupported parameter type */);
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(LookupAsyncCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code lookup_async}
     * @param lookupAsync The new value of the field {@code lookup_async}
     */
    public void setLookupAsync(LookupAsyncCallback lookupAsync) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("lookup_async"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (lookupAsync == null ? MemoryAddress.NULL : lookupAsync.toCallback()));
    }
    
    @FunctionalInterface
    public interface LookupFinishCallback {
        java.lang.String[] run(org.gtk.gio.ProxyResolver resolver, org.gtk.gio.AsyncResult result);

        @ApiStatus.Internal default void upcall(MemoryAddress resolver, MemoryAddress result) {
            run((org.gtk.gio.ProxyResolver) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(resolver)), org.gtk.gio.ProxyResolver.fromAddress).marshal(resolver, Ownership.NONE), (org.gtk.gio.AsyncResult) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(result)), org.gtk.gio.AsyncResult.fromAddress).marshal(result, Ownership.NONE));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(LookupFinishCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code lookup_finish}
     * @param lookupFinish The new value of the field {@code lookup_finish}
     */
    public void setLookupFinish(LookupFinishCallback lookupFinish) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("lookup_finish"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (lookupFinish == null ? MemoryAddress.NULL : lookupFinish.toCallback()));
    }
    
    /**
     * Create a ProxyResolverInterface proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected ProxyResolverInterface(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, ProxyResolverInterface> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new ProxyResolverInterface(input, ownership);
    
    /**
     * A {@link ProxyResolverInterface.Builder} object constructs a {@link ProxyResolverInterface} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link ProxyResolverInterface.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final ProxyResolverInterface struct;
        
        private Builder() {
            struct = ProxyResolverInterface.allocate();
        }
        
         /**
         * Finish building the {@link ProxyResolverInterface} struct.
         * @return A new instance of {@code ProxyResolverInterface} with the fields 
         *         that were set in the Builder object.
         */
        public ProxyResolverInterface build() {
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
        
        public Builder setIsSupported(IsSupportedCallback isSupported) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("is_supported"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (isSupported == null ? MemoryAddress.NULL : isSupported.toCallback()));
            return this;
        }
        
        public Builder setLookup(LookupCallback lookup) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("lookup"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (lookup == null ? MemoryAddress.NULL : lookup.toCallback()));
            return this;
        }
        
        public Builder setLookupAsync(LookupAsyncCallback lookupAsync) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("lookup_async"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (lookupAsync == null ? MemoryAddress.NULL : lookupAsync.toCallback()));
            return this;
        }
        
        public Builder setLookupFinish(LookupFinishCallback lookupFinish) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("lookup_finish"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (lookupFinish == null ? MemoryAddress.NULL : lookupFinish.toCallback()));
            return this;
        }
    }
}
