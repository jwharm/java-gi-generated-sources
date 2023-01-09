package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * GIconIface is used to implement GIcon types for various
 * different systems. See {@link ThemedIcon} and {@link LoadableIcon} for
 * examples of how to implement this interface.
 */
public class IconIface extends Struct {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GIconIface";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gtk.gobject.TypeInterface.getMemoryLayout().withName("g_iface"),
            Interop.valueLayout.ADDRESS.withName("hash"),
            Interop.valueLayout.ADDRESS.withName("equal"),
            Interop.valueLayout.ADDRESS.withName("to_tokens"),
            Interop.valueLayout.ADDRESS.withName("from_tokens"),
            Interop.valueLayout.ADDRESS.withName("serialize")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link IconIface}
     * @return A new, uninitialized @{link IconIface}
     */
    public static IconIface allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        IconIface newInstance = new IconIface(segment.address());
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
     * Functional interface declaration of the {@code HashCallback} callback.
     */
    @FunctionalInterface
    public interface HashCallback {
    
        int run(org.gtk.gio.Icon icon);
        
        @ApiStatus.Internal default int upcall(MemoryAddress icon) {
            var RESULT = run((org.gtk.gio.Icon) Interop.register(icon, org.gtk.gio.Icon.fromAddress).marshal(icon, null));
            return RESULT;
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), HashCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code hash}
     * @param hash The new value of the field {@code hash}
     */
    public void setHash(HashCallback hash) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("hash"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (hash == null ? MemoryAddress.NULL : hash.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code EqualCallback} callback.
     */
    @FunctionalInterface
    public interface EqualCallback {
    
        boolean run(@Nullable org.gtk.gio.Icon icon1, @Nullable org.gtk.gio.Icon icon2);
        
        @ApiStatus.Internal default int upcall(MemoryAddress icon1, MemoryAddress icon2) {
            var RESULT = run((org.gtk.gio.Icon) Interop.register(icon1, org.gtk.gio.Icon.fromAddress).marshal(icon1, null), (org.gtk.gio.Icon) Interop.register(icon2, org.gtk.gio.Icon.fromAddress).marshal(icon2, null));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), EqualCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code equal}
     * @param equal The new value of the field {@code equal}
     */
    public void setEqual(EqualCallback equal) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("equal"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (equal == null ? MemoryAddress.NULL : equal.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code ToTokensCallback} callback.
     */
    @FunctionalInterface
    public interface ToTokensCallback {
    
        boolean run(org.gtk.gio.Icon icon, PointerAddress tokens, PointerInteger outVersion);
        
        @ApiStatus.Internal default int upcall(MemoryAddress icon, MemoryAddress tokens, MemoryAddress outVersion) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                var RESULT = run((org.gtk.gio.Icon) Interop.register(icon, org.gtk.gio.Icon.fromAddress).marshal(icon, null), new PointerAddress(tokens), new PointerInteger(outVersion));
                return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
            }
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), ToTokensCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code to_tokens}
     * @param toTokens The new value of the field {@code to_tokens}
     */
    public void setToTokens(ToTokensCallback toTokens) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("to_tokens"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (toTokens == null ? MemoryAddress.NULL : toTokens.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code FromTokensCallback} callback.
     */
    @FunctionalInterface
    public interface FromTokensCallback {
    
        org.gtk.gio.Icon run(PointerString tokens, int numTokens, int version);
        
        @ApiStatus.Internal default Addressable upcall(MemoryAddress tokens, int numTokens, int version) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                var RESULT = run(new PointerString(tokens), numTokens, version);
                return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
            }
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), FromTokensCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code from_tokens}
     * @param fromTokens The new value of the field {@code from_tokens}
     */
    public void setFromTokens(FromTokensCallback fromTokens) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("from_tokens"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (fromTokens == null ? MemoryAddress.NULL : fromTokens.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code SerializeCallback} callback.
     */
    @FunctionalInterface
    public interface SerializeCallback {
    
        @Nullable org.gtk.glib.Variant run(org.gtk.gio.Icon icon);
        
        @ApiStatus.Internal default Addressable upcall(MemoryAddress icon) {
            var RESULT = run((org.gtk.gio.Icon) Interop.register(icon, org.gtk.gio.Icon.fromAddress).marshal(icon, null));
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
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), SerializeCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code serialize}
     * @param serialize The new value of the field {@code serialize}
     */
    public void setSerialize(SerializeCallback serialize) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("serialize"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (serialize == null ? MemoryAddress.NULL : serialize.toCallback()));
        }
    }
    
    /**
     * Create a IconIface proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected IconIface(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, IconIface> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new IconIface(input);
    
    /**
     * A {@link IconIface.Builder} object constructs a {@link IconIface} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link IconIface.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final IconIface struct;
        
        private Builder() {
            struct = IconIface.allocate();
        }
        
        /**
         * Finish building the {@link IconIface} struct.
         * @return A new instance of {@code IconIface} with the fields 
         *         that were set in the Builder object.
         */
        public IconIface build() {
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
        
        public Builder setHash(HashCallback hash) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("hash"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (hash == null ? MemoryAddress.NULL : hash.toCallback()));
                return this;
            }
        }
        
        public Builder setEqual(EqualCallback equal) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("equal"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (equal == null ? MemoryAddress.NULL : equal.toCallback()));
                return this;
            }
        }
        
        public Builder setToTokens(ToTokensCallback toTokens) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("to_tokens"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (toTokens == null ? MemoryAddress.NULL : toTokens.toCallback()));
                return this;
            }
        }
        
        public Builder setFromTokens(FromTokensCallback fromTokens) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("from_tokens"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (fromTokens == null ? MemoryAddress.NULL : fromTokens.toCallback()));
                return this;
            }
        }
        
        public Builder setSerialize(SerializeCallback serialize) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("serialize"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (serialize == null ? MemoryAddress.NULL : serialize.toCallback()));
                return this;
            }
        }
    }
}
