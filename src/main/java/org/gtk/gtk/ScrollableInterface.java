package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class ScrollableInterface extends Struct {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkScrollableInterface";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gtk.gobject.TypeInterface.getMemoryLayout().withName("base_iface"),
            Interop.valueLayout.ADDRESS.withName("get_border")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link ScrollableInterface}
     * @return A new, uninitialized @{link ScrollableInterface}
     */
    public static ScrollableInterface allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        ScrollableInterface newInstance = new ScrollableInterface(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code base_iface}
     * @return The value of the field {@code base_iface}
     */
    public org.gtk.gobject.TypeInterface getBaseIface() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("base_iface"));
        return org.gtk.gobject.TypeInterface.fromAddress.marshal(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Change the value of the field {@code base_iface}
     * @param baseIface The new value of the field {@code base_iface}
     */
    public void setBaseIface(org.gtk.gobject.TypeInterface baseIface) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("base_iface"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (baseIface == null ? MemoryAddress.NULL : baseIface.handle()));
    }
    
    @FunctionalInterface
    public interface GetBorderCallback {
        boolean run(org.gtk.gtk.Scrollable scrollable, org.gtk.gtk.Border border);

        @ApiStatus.Internal default int upcall(MemoryAddress scrollable, MemoryAddress border) {
            var RESULT = run((org.gtk.gtk.Scrollable) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(scrollable)), org.gtk.gtk.Scrollable.fromAddress).marshal(scrollable, Ownership.NONE), org.gtk.gtk.Border.fromAddress.marshal(border, Ownership.NONE));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(GetBorderCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_border}
     * @param getBorder The new value of the field {@code get_border}
     */
    public void setGetBorder(GetBorderCallback getBorder) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("get_border"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getBorder == null ? MemoryAddress.NULL : getBorder.toCallback()));
    }
    
    /**
     * Create a ScrollableInterface proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected ScrollableInterface(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, ScrollableInterface> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new ScrollableInterface(input, ownership);
    
    /**
     * A {@link ScrollableInterface.Builder} object constructs a {@link ScrollableInterface} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link ScrollableInterface.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final ScrollableInterface struct;
        
        private Builder() {
            struct = ScrollableInterface.allocate();
        }
        
         /**
         * Finish building the {@link ScrollableInterface} struct.
         * @return A new instance of {@code ScrollableInterface} with the fields 
         *         that were set in the Builder object.
         */
        public ScrollableInterface build() {
            return struct;
        }
        
        public Builder setBaseIface(org.gtk.gobject.TypeInterface baseIface) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("base_iface"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (baseIface == null ? MemoryAddress.NULL : baseIface.handle()));
            return this;
        }
        
        public Builder setGetBorder(GetBorderCallback getBorder) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_border"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getBorder == null ? MemoryAddress.NULL : getBorder.toCallback()));
            return this;
        }
    }
}
