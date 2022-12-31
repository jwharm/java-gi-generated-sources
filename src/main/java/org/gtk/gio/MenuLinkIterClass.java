package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class MenuLinkIterClass extends Struct {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GMenuLinkIterClass";
    
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
     * Allocate a new {@link MenuLinkIterClass}
     * @return A new, uninitialized @{link MenuLinkIterClass}
     */
    public static MenuLinkIterClass allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        MenuLinkIterClass newInstance = new MenuLinkIterClass(segment.address(), Ownership.NONE);
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
    public interface GetNextCallback {
        boolean run(org.gtk.gio.MenuLinkIter iter, @Nullable Out<java.lang.String> outLink, @Nullable Out<org.gtk.gio.MenuModel> value);

        @ApiStatus.Internal default int upcall(MemoryAddress iter, MemoryAddress outLink, MemoryAddress value) {
            Out<java.lang.String> outLinkOUT = new Out<>(Marshal.addressToString.marshal(outLink, null));
            Out<org.gtk.gio.MenuModel> valueOUT = new Out<>((org.gtk.gio.MenuModel) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(value)), org.gtk.gio.MenuModel.fromAddress).marshal(value, Ownership.FULL));
            var RESULT = run((org.gtk.gio.MenuLinkIter) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(iter)), org.gtk.gio.MenuLinkIter.fromAddress).marshal(iter, Ownership.NONE), outLinkOUT, valueOUT);
            outLink.set(Interop.valueLayout.ADDRESS, 0, Marshal.stringToAddress.marshal(outLinkOUT.get(), null));
            value.set(Interop.valueLayout.ADDRESS, 0, valueOUT.get().handle());
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(GetNextCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_next}
     * @param getNext The new value of the field {@code get_next}
     */
    public void setGetNext(GetNextCallback getNext) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("get_next"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getNext == null ? MemoryAddress.NULL : getNext.toCallback()));
    }
    
    /**
     * Create a MenuLinkIterClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected MenuLinkIterClass(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, MenuLinkIterClass> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new MenuLinkIterClass(input, ownership);
    
    /**
     * A {@link MenuLinkIterClass.Builder} object constructs a {@link MenuLinkIterClass} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link MenuLinkIterClass.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final MenuLinkIterClass struct;
        
        private Builder() {
            struct = MenuLinkIterClass.allocate();
        }
        
         /**
         * Finish building the {@link MenuLinkIterClass} struct.
         * @return A new instance of {@code MenuLinkIterClass} with the fields 
         *         that were set in the Builder object.
         */
        public MenuLinkIterClass build() {
            return struct;
        }
        
        public Builder setParentClass(org.gtk.gobject.ObjectClass parentClass) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
            return this;
        }
        
        public Builder setGetNext(GetNextCallback getNext) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_next"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getNext == null ? MemoryAddress.NULL : getNext.toCallback()));
            return this;
        }
    }
}
