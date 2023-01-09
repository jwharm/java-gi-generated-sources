package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Class structure for {@link TlsPassword}.
 */
public class TlsPasswordClass extends Struct {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GTlsPasswordClass";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gtk.gobject.ObjectClass.getMemoryLayout().withName("parent_class"),
            Interop.valueLayout.ADDRESS.withName("get_value"),
            Interop.valueLayout.ADDRESS.withName("set_value"),
            Interop.valueLayout.ADDRESS.withName("get_default_warning"),
            MemoryLayout.sequenceLayout(4, Interop.valueLayout.ADDRESS).withName("padding")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link TlsPasswordClass}
     * @return A new, uninitialized @{link TlsPasswordClass}
     */
    public static TlsPasswordClass allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        TlsPasswordClass newInstance = new TlsPasswordClass(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code parent_class}
     * @return The value of the field {@code parent_class}
     */
    public org.gtk.gobject.ObjectClass getParentClass() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent_class"));
        return org.gtk.gobject.ObjectClass.fromAddress.marshal(((MemoryAddress) handle()).addOffset(OFFSET), null);
    }
    
    /**
     * Change the value of the field {@code parent_class}
     * @param parentClass The new value of the field {@code parent_class}
     */
    public void setParentClass(org.gtk.gobject.ObjectClass parentClass) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code GetValueCallback} callback.
     */
    @FunctionalInterface
    public interface GetValueCallback {
    
        byte[] run(org.gtk.gio.TlsPassword password, Out<Long> length);
        
        @ApiStatus.Internal default void upcall(MemoryAddress password, MemoryAddress length) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                Out<Long> lengthOUT = new Out<>(length.get(Interop.valueLayout.C_LONG, 0));
                run((org.gtk.gio.TlsPassword) Interop.register(password, org.gtk.gio.TlsPassword.fromAddress).marshal(password, null), lengthOUT);
                length.set(Interop.valueLayout.C_LONG, 0, lengthOUT.get());
            }
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), GetValueCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_value}
     * @param getValue The new value of the field {@code get_value}
     */
    public void setGetValue(GetValueCallback getValue) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_value"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getValue == null ? MemoryAddress.NULL : getValue.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code SetValueCallback} callback.
     */
    @FunctionalInterface
    public interface SetValueCallback {
    
        void run(org.gtk.gio.TlsPassword password, byte[] value, long length, @Nullable org.gtk.glib.DestroyNotify destroy);
        
        @ApiStatus.Internal default void upcall(MemoryAddress password, MemoryAddress value, long length, MemoryAddress destroy) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                run((org.gtk.gio.TlsPassword) Interop.register(password, org.gtk.gio.TlsPassword.fromAddress).marshal(password, null), MemorySegment.ofAddress(value, length, SCOPE).toArray(Interop.valueLayout.C_BYTE), length, null /* Unsupported parameter type */);
            }
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), SetValueCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code set_value}
     * @param setValue The new value of the field {@code set_value}
     */
    public void setSetValue(SetValueCallback setValue) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("set_value"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (setValue == null ? MemoryAddress.NULL : setValue.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code GetDefaultWarningCallback} callback.
     */
    @FunctionalInterface
    public interface GetDefaultWarningCallback {
    
        java.lang.String run(org.gtk.gio.TlsPassword password);
        
        @ApiStatus.Internal default Addressable upcall(MemoryAddress password) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                var RESULT = run((org.gtk.gio.TlsPassword) Interop.register(password, org.gtk.gio.TlsPassword.fromAddress).marshal(password, null));
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
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), GetDefaultWarningCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_default_warning}
     * @param getDefaultWarning The new value of the field {@code get_default_warning}
     */
    public void setGetDefaultWarning(GetDefaultWarningCallback getDefaultWarning) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_default_warning"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getDefaultWarning == null ? MemoryAddress.NULL : getDefaultWarning.toCallback()));
        }
    }
    
    /**
     * Create a TlsPasswordClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected TlsPasswordClass(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, TlsPasswordClass> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new TlsPasswordClass(input);
    
    /**
     * A {@link TlsPasswordClass.Builder} object constructs a {@link TlsPasswordClass} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link TlsPasswordClass.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final TlsPasswordClass struct;
        
        private Builder() {
            struct = TlsPasswordClass.allocate();
        }
        
        /**
         * Finish building the {@link TlsPasswordClass} struct.
         * @return A new instance of {@code TlsPasswordClass} with the fields 
         *         that were set in the Builder object.
         */
        public TlsPasswordClass build() {
            return struct;
        }
        
        public Builder setParentClass(org.gtk.gobject.ObjectClass parentClass) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
                return this;
            }
        }
        
        public Builder setGetValue(GetValueCallback getValue) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("get_value"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getValue == null ? MemoryAddress.NULL : getValue.toCallback()));
                return this;
            }
        }
        
        public Builder setSetValue(SetValueCallback setValue) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("set_value"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (setValue == null ? MemoryAddress.NULL : setValue.toCallback()));
                return this;
            }
        }
        
        public Builder setGetDefaultWarning(GetDefaultWarningCallback getDefaultWarning) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("get_default_warning"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getDefaultWarning == null ? MemoryAddress.NULL : getDefaultWarning.toCallback()));
                return this;
            }
        }
        
        public Builder setPadding(java.lang.foreign.MemoryAddress[] padding) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("padding"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (padding == null ? MemoryAddress.NULL : Interop.allocateNativeArray(padding, false, SCOPE)));
                return this;
            }
        }
    }
}
