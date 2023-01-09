package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class MenuAttributeIterClass extends Struct {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GMenuAttributeIterClass";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gtk.gobject.ObjectClass.getMemoryLayout().withName("parent_class"),
            Interop.valueLayout.ADDRESS.withName("get_next")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link MenuAttributeIterClass}
     * @return A new, uninitialized @{link MenuAttributeIterClass}
     */
    public static MenuAttributeIterClass allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        MenuAttributeIterClass newInstance = new MenuAttributeIterClass(segment.address());
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
     * Functional interface declaration of the {@code GetNextCallback} callback.
     */
    @FunctionalInterface
    public interface GetNextCallback {
    
        boolean run(org.gtk.gio.MenuAttributeIter iter, @Nullable Out<java.lang.String> outName, @Nullable Out<org.gtk.glib.Variant> value);
        
        @ApiStatus.Internal default int upcall(MemoryAddress iter, MemoryAddress outName, MemoryAddress value) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                Out<java.lang.String> outNameOUT = new Out<>(Marshal.addressToString.marshal(outName, null));
                Out<org.gtk.glib.Variant> valueOUT = new Out<>(org.gtk.glib.Variant.fromAddress.marshal(value, null));
                var RESULT = run((org.gtk.gio.MenuAttributeIter) Interop.register(iter, org.gtk.gio.MenuAttributeIter.fromAddress).marshal(iter, null), outNameOUT, valueOUT);
                outName.set(Interop.valueLayout.ADDRESS, 0, Marshal.stringToAddress.marshal(outNameOUT.get(), SCOPE));
                value.set(Interop.valueLayout.ADDRESS, 0, valueOUT.get().handle());
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
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), GetNextCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_next}
     * @param getNext The new value of the field {@code get_next}
     */
    public void setGetNext(GetNextCallback getNext) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_next"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getNext == null ? MemoryAddress.NULL : getNext.toCallback()));
        }
    }
    
    /**
     * Create a MenuAttributeIterClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected MenuAttributeIterClass(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, MenuAttributeIterClass> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new MenuAttributeIterClass(input);
    
    /**
     * A {@link MenuAttributeIterClass.Builder} object constructs a {@link MenuAttributeIterClass} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link MenuAttributeIterClass.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final MenuAttributeIterClass struct;
        
        private Builder() {
            struct = MenuAttributeIterClass.allocate();
        }
        
        /**
         * Finish building the {@link MenuAttributeIterClass} struct.
         * @return A new instance of {@code MenuAttributeIterClass} with the fields 
         *         that were set in the Builder object.
         */
        public MenuAttributeIterClass build() {
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
        
        public Builder setGetNext(GetNextCallback getNext) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("get_next"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getNext == null ? MemoryAddress.NULL : getNext.toCallback()));
                return this;
            }
        }
    }
}
