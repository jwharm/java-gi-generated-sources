package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The virtual function table for {@link DebugControllerDBus}.
 * @version 2.72
 */
public class DebugControllerDBusClass extends Struct {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GDebugControllerDBusClass";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gtk.gobject.ObjectClass.getMemoryLayout().withName("parent_class"),
            Interop.valueLayout.ADDRESS.withName("authorize"),
            MemoryLayout.sequenceLayout(12, Interop.valueLayout.ADDRESS).withName("padding")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link DebugControllerDBusClass}
     * @return A new, uninitialized @{link DebugControllerDBusClass}
     */
    public static DebugControllerDBusClass allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        DebugControllerDBusClass newInstance = new DebugControllerDBusClass(segment.address(), Ownership.NONE);
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
    public interface AuthorizeCallback {
        boolean run(org.gtk.gio.DebugControllerDBus controller, org.gtk.gio.DBusMethodInvocation invocation);

        @ApiStatus.Internal default int upcall(MemoryAddress controller, MemoryAddress invocation) {
            var RESULT = run((org.gtk.gio.DebugControllerDBus) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(controller)), org.gtk.gio.DebugControllerDBus.fromAddress).marshal(controller, Ownership.NONE), (org.gtk.gio.DBusMethodInvocation) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(invocation)), org.gtk.gio.DBusMethodInvocation.fromAddress).marshal(invocation, Ownership.NONE));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(AuthorizeCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code authorize}
     * @param authorize The new value of the field {@code authorize}
     */
    public void setAuthorize(AuthorizeCallback authorize) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("authorize"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (authorize == null ? MemoryAddress.NULL : authorize.toCallback()));
    }
    
    /**
     * Create a DebugControllerDBusClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected DebugControllerDBusClass(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, DebugControllerDBusClass> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new DebugControllerDBusClass(input, ownership);
    
    /**
     * A {@link DebugControllerDBusClass.Builder} object constructs a {@link DebugControllerDBusClass} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link DebugControllerDBusClass.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final DebugControllerDBusClass struct;
        
        private Builder() {
            struct = DebugControllerDBusClass.allocate();
        }
        
         /**
         * Finish building the {@link DebugControllerDBusClass} struct.
         * @return A new instance of {@code DebugControllerDBusClass} with the fields 
         *         that were set in the Builder object.
         */
        public DebugControllerDBusClass build() {
            return struct;
        }
        
        /**
         * The parent class.
         * @param parentClass The value for the {@code parentClass} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setParentClass(org.gtk.gobject.ObjectClass parentClass) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
            return this;
        }
        
        public Builder setAuthorize(AuthorizeCallback authorize) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("authorize"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (authorize == null ? MemoryAddress.NULL : authorize.toCallback()));
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
