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
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        IconIface newInstance = new IconIface(segment.address(), Ownership.NONE);
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
    public interface HashCallback {
        int run(org.gtk.gio.Icon icon);

        @ApiStatus.Internal default int upcall(MemoryAddress icon) {
            var RESULT = run((org.gtk.gio.Icon) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(icon)), org.gtk.gio.Icon.fromAddress).marshal(icon, Ownership.NONE));
            return RESULT;
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(HashCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code hash}
     * @param hash The new value of the field {@code hash}
     */
    public void setHash(HashCallback hash) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("hash"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (hash == null ? MemoryAddress.NULL : hash.toCallback()));
    }
    
    @FunctionalInterface
    public interface EqualCallback {
        boolean run(@Nullable org.gtk.gio.Icon icon1, @Nullable org.gtk.gio.Icon icon2);

        @ApiStatus.Internal default int upcall(MemoryAddress icon1, MemoryAddress icon2) {
            var RESULT = run((org.gtk.gio.Icon) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(icon1)), org.gtk.gio.Icon.fromAddress).marshal(icon1, Ownership.NONE), (org.gtk.gio.Icon) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(icon2)), org.gtk.gio.Icon.fromAddress).marshal(icon2, Ownership.NONE));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(EqualCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code equal}
     * @param equal The new value of the field {@code equal}
     */
    public void setEqual(EqualCallback equal) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("equal"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (equal == null ? MemoryAddress.NULL : equal.toCallback()));
    }
    
    @FunctionalInterface
    public interface ToTokensCallback {
        boolean run(org.gtk.gio.Icon icon, PointerAddress tokens, PointerInteger outVersion);

        @ApiStatus.Internal default int upcall(MemoryAddress icon, MemoryAddress tokens, MemoryAddress outVersion) {
            var RESULT = run((org.gtk.gio.Icon) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(icon)), org.gtk.gio.Icon.fromAddress).marshal(icon, Ownership.NONE), new PointerAddress(tokens), new PointerInteger(outVersion));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(ToTokensCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code to_tokens}
     * @param toTokens The new value of the field {@code to_tokens}
     */
    public void setToTokens(ToTokensCallback toTokens) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("to_tokens"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (toTokens == null ? MemoryAddress.NULL : toTokens.toCallback()));
    }
    
    @FunctionalInterface
    public interface FromTokensCallback {
        org.gtk.gio.Icon run(PointerString tokens, int numTokens, int version);

        @ApiStatus.Internal default Addressable upcall(MemoryAddress tokens, int numTokens, int version) {
            var RESULT = run(new PointerString(tokens), numTokens, version);
            return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(FromTokensCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code from_tokens}
     * @param fromTokens The new value of the field {@code from_tokens}
     */
    public void setFromTokens(FromTokensCallback fromTokens) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("from_tokens"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (fromTokens == null ? MemoryAddress.NULL : fromTokens.toCallback()));
    }
    
    @FunctionalInterface
    public interface SerializeCallback {
        @Nullable org.gtk.glib.Variant run(org.gtk.gio.Icon icon);

        @ApiStatus.Internal default Addressable upcall(MemoryAddress icon) {
            var RESULT = run((org.gtk.gio.Icon) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(icon)), org.gtk.gio.Icon.fromAddress).marshal(icon, Ownership.NONE));
            return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(SerializeCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code serialize}
     * @param serialize The new value of the field {@code serialize}
     */
    public void setSerialize(SerializeCallback serialize) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("serialize"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (serialize == null ? MemoryAddress.NULL : serialize.toCallback()));
    }
    
    /**
     * Create a IconIface proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected IconIface(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, IconIface> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new IconIface(input, ownership);
    
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
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("g_iface"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (gIface == null ? MemoryAddress.NULL : gIface.handle()));
            return this;
        }
        
        public Builder setHash(HashCallback hash) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("hash"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (hash == null ? MemoryAddress.NULL : hash.toCallback()));
            return this;
        }
        
        public Builder setEqual(EqualCallback equal) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("equal"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (equal == null ? MemoryAddress.NULL : equal.toCallback()));
            return this;
        }
        
        public Builder setToTokens(ToTokensCallback toTokens) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("to_tokens"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (toTokens == null ? MemoryAddress.NULL : toTokens.toCallback()));
            return this;
        }
        
        public Builder setFromTokens(FromTokensCallback fromTokens) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("from_tokens"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (fromTokens == null ? MemoryAddress.NULL : fromTokens.toCallback()));
            return this;
        }
        
        public Builder setSerialize(SerializeCallback serialize) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("serialize"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (serialize == null ? MemoryAddress.NULL : serialize.toCallback()));
            return this;
        }
    }
}
