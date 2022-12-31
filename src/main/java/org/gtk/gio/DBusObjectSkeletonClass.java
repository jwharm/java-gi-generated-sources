package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Class structure for {@link DBusObjectSkeleton}.
 * @version 2.30
 */
public class DBusObjectSkeletonClass extends Struct {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GDBusObjectSkeletonClass";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gtk.gobject.ObjectClass.getMemoryLayout().withName("parent_class"),
            Interop.valueLayout.ADDRESS.withName("authorize_method"),
            MemoryLayout.sequenceLayout(8, Interop.valueLayout.ADDRESS).withName("padding")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link DBusObjectSkeletonClass}
     * @return A new, uninitialized @{link DBusObjectSkeletonClass}
     */
    public static DBusObjectSkeletonClass allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        DBusObjectSkeletonClass newInstance = new DBusObjectSkeletonClass(segment.address(), Ownership.NONE);
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
    public interface AuthorizeMethodCallback {
        boolean run(org.gtk.gio.DBusObjectSkeleton object, org.gtk.gio.DBusInterfaceSkeleton interface_, org.gtk.gio.DBusMethodInvocation invocation);

        @ApiStatus.Internal default int upcall(MemoryAddress object, MemoryAddress interface_, MemoryAddress invocation) {
            var RESULT = run((org.gtk.gio.DBusObjectSkeleton) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(object)), org.gtk.gio.DBusObjectSkeleton.fromAddress).marshal(object, Ownership.NONE), (org.gtk.gio.DBusInterfaceSkeleton) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(interface_)), org.gtk.gio.DBusInterfaceSkeleton.fromAddress).marshal(interface_, Ownership.NONE), (org.gtk.gio.DBusMethodInvocation) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(invocation)), org.gtk.gio.DBusMethodInvocation.fromAddress).marshal(invocation, Ownership.NONE));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(AuthorizeMethodCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code authorize_method}
     * @param authorizeMethod The new value of the field {@code authorize_method}
     */
    public void setAuthorizeMethod(AuthorizeMethodCallback authorizeMethod) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("authorize_method"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (authorizeMethod == null ? MemoryAddress.NULL : authorizeMethod.toCallback()));
    }
    
    /**
     * Create a DBusObjectSkeletonClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected DBusObjectSkeletonClass(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, DBusObjectSkeletonClass> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new DBusObjectSkeletonClass(input, ownership);
    
    /**
     * A {@link DBusObjectSkeletonClass.Builder} object constructs a {@link DBusObjectSkeletonClass} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link DBusObjectSkeletonClass.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final DBusObjectSkeletonClass struct;
        
        private Builder() {
            struct = DBusObjectSkeletonClass.allocate();
        }
        
         /**
         * Finish building the {@link DBusObjectSkeletonClass} struct.
         * @return A new instance of {@code DBusObjectSkeletonClass} with the fields 
         *         that were set in the Builder object.
         */
        public DBusObjectSkeletonClass build() {
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
        
        public Builder setAuthorizeMethod(AuthorizeMethodCallback authorizeMethod) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("authorize_method"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (authorizeMethod == null ? MemoryAddress.NULL : authorizeMethod.toCallback()));
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
