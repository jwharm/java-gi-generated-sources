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
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        TlsPasswordClass newInstance = new TlsPasswordClass(segment.address(), Ownership.NONE);
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
    public interface GetValueCallback {
        byte[] run(org.gtk.gio.TlsPassword password, Out<Long> length);

        @ApiStatus.Internal default void upcall(MemoryAddress password, MemoryAddress length) {
            Out<Long> lengthOUT = new Out<>(length.get(Interop.valueLayout.C_LONG, 0));
            run((org.gtk.gio.TlsPassword) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(password)), org.gtk.gio.TlsPassword.fromAddress).marshal(password, Ownership.NONE), lengthOUT);
            length.set(Interop.valueLayout.C_LONG, 0, lengthOUT.get());
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(GetValueCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_value}
     * @param getValue The new value of the field {@code get_value}
     */
    public void setGetValue(GetValueCallback getValue) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("get_value"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getValue == null ? MemoryAddress.NULL : getValue.toCallback()));
    }
    
    @FunctionalInterface
    public interface SetValueCallback {
        void run(org.gtk.gio.TlsPassword password, byte[] value, long length, @Nullable org.gtk.glib.DestroyNotify destroy);

        @ApiStatus.Internal default void upcall(MemoryAddress password, MemoryAddress value, long length, MemoryAddress destroy) {
            run((org.gtk.gio.TlsPassword) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(password)), org.gtk.gio.TlsPassword.fromAddress).marshal(password, Ownership.NONE), MemorySegment.ofAddress(value, length, Interop.getScope()).toArray(Interop.valueLayout.C_BYTE), length, null /* Unsupported parameter type */);
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(SetValueCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code set_value}
     * @param setValue The new value of the field {@code set_value}
     */
    public void setSetValue(SetValueCallback setValue) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("set_value"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (setValue == null ? MemoryAddress.NULL : setValue.toCallback()));
    }
    
    @FunctionalInterface
    public interface GetDefaultWarningCallback {
        java.lang.String run(org.gtk.gio.TlsPassword password);

        @ApiStatus.Internal default Addressable upcall(MemoryAddress password) {
            var RESULT = run((org.gtk.gio.TlsPassword) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(password)), org.gtk.gio.TlsPassword.fromAddress).marshal(password, Ownership.NONE));
            return RESULT == null ? MemoryAddress.NULL.address() : (Marshal.stringToAddress.marshal(RESULT, null)).address();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(GetDefaultWarningCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_default_warning}
     * @param getDefaultWarning The new value of the field {@code get_default_warning}
     */
    public void setGetDefaultWarning(GetDefaultWarningCallback getDefaultWarning) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("get_default_warning"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getDefaultWarning == null ? MemoryAddress.NULL : getDefaultWarning.toCallback()));
    }
    
    /**
     * Create a TlsPasswordClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected TlsPasswordClass(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, TlsPasswordClass> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new TlsPasswordClass(input, ownership);
    
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
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
            return this;
        }
        
        public Builder setGetValue(GetValueCallback getValue) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_value"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getValue == null ? MemoryAddress.NULL : getValue.toCallback()));
            return this;
        }
        
        public Builder setSetValue(SetValueCallback setValue) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("set_value"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (setValue == null ? MemoryAddress.NULL : setValue.toCallback()));
            return this;
        }
        
        public Builder setGetDefaultWarning(GetDefaultWarningCallback getDefaultWarning) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_default_warning"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getDefaultWarning == null ? MemoryAddress.NULL : getDefaultWarning.toCallback()));
            return this;
        }
        
        public Builder setPadding(java.lang.foreign.MemoryAddress[] padding) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("padding"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (padding == null ? MemoryAddress.NULL : Interop.allocateNativeArray(padding, false)));
            return this;
        }
    }
}
