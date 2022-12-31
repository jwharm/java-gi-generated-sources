package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Class structure for {@link DBusInterfaceSkeleton}.
 * @version 2.30
 */
public class DBusInterfaceSkeletonClass extends Struct {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GDBusInterfaceSkeletonClass";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gtk.gobject.ObjectClass.getMemoryLayout().withName("parent_class"),
            Interop.valueLayout.ADDRESS.withName("get_info"),
            Interop.valueLayout.ADDRESS.withName("get_vtable"),
            Interop.valueLayout.ADDRESS.withName("get_properties"),
            Interop.valueLayout.ADDRESS.withName("flush"),
            MemoryLayout.sequenceLayout(8, Interop.valueLayout.ADDRESS).withName("vfunc_padding"),
            Interop.valueLayout.ADDRESS.withName("g_authorize_method"),
            MemoryLayout.sequenceLayout(8, Interop.valueLayout.ADDRESS).withName("signal_padding")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link DBusInterfaceSkeletonClass}
     * @return A new, uninitialized @{link DBusInterfaceSkeletonClass}
     */
    public static DBusInterfaceSkeletonClass allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        DBusInterfaceSkeletonClass newInstance = new DBusInterfaceSkeletonClass(segment.address(), Ownership.NONE);
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
    public interface GetInfoCallback {
        org.gtk.gio.DBusInterfaceInfo run(org.gtk.gio.DBusInterfaceSkeleton interface_);

        @ApiStatus.Internal default Addressable upcall(MemoryAddress interface_) {
            var RESULT = run((org.gtk.gio.DBusInterfaceSkeleton) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(interface_)), org.gtk.gio.DBusInterfaceSkeleton.fromAddress).marshal(interface_, Ownership.NONE));
            return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(GetInfoCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_info}
     * @param getInfo The new value of the field {@code get_info}
     */
    public void setGetInfo(GetInfoCallback getInfo) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("get_info"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getInfo == null ? MemoryAddress.NULL : getInfo.toCallback()));
    }
    
    @FunctionalInterface
    public interface GetVtableCallback {
        org.gtk.gio.DBusInterfaceVTable run(org.gtk.gio.DBusInterfaceSkeleton interface_);

        @ApiStatus.Internal default Addressable upcall(MemoryAddress interface_) {
            var RESULT = run((org.gtk.gio.DBusInterfaceSkeleton) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(interface_)), org.gtk.gio.DBusInterfaceSkeleton.fromAddress).marshal(interface_, Ownership.NONE));
            return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(GetVtableCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_vtable}
     * @param getVtable The new value of the field {@code get_vtable}
     */
    public void setGetVtable(GetVtableCallback getVtable) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("get_vtable"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getVtable == null ? MemoryAddress.NULL : getVtable.toCallback()));
    }
    
    @FunctionalInterface
    public interface GetPropertiesCallback {
        org.gtk.glib.Variant run(org.gtk.gio.DBusInterfaceSkeleton interface_);

        @ApiStatus.Internal default Addressable upcall(MemoryAddress interface_) {
            var RESULT = run((org.gtk.gio.DBusInterfaceSkeleton) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(interface_)), org.gtk.gio.DBusInterfaceSkeleton.fromAddress).marshal(interface_, Ownership.NONE));
            return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(GetPropertiesCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_properties}
     * @param getProperties The new value of the field {@code get_properties}
     */
    public void setGetProperties(GetPropertiesCallback getProperties) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("get_properties"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getProperties == null ? MemoryAddress.NULL : getProperties.toCallback()));
    }
    
    @FunctionalInterface
    public interface FlushCallback {
        void run(org.gtk.gio.DBusInterfaceSkeleton interface_);

        @ApiStatus.Internal default void upcall(MemoryAddress interface_) {
            run((org.gtk.gio.DBusInterfaceSkeleton) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(interface_)), org.gtk.gio.DBusInterfaceSkeleton.fromAddress).marshal(interface_, Ownership.NONE));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(FlushCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code flush}
     * @param flush The new value of the field {@code flush}
     */
    public void setFlush(FlushCallback flush) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("flush"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (flush == null ? MemoryAddress.NULL : flush.toCallback()));
    }
    
    @FunctionalInterface
    public interface GAuthorizeMethodCallback {
        boolean run(org.gtk.gio.DBusInterfaceSkeleton interface_, org.gtk.gio.DBusMethodInvocation invocation);

        @ApiStatus.Internal default int upcall(MemoryAddress interface_, MemoryAddress invocation) {
            var RESULT = run((org.gtk.gio.DBusInterfaceSkeleton) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(interface_)), org.gtk.gio.DBusInterfaceSkeleton.fromAddress).marshal(interface_, Ownership.NONE), (org.gtk.gio.DBusMethodInvocation) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(invocation)), org.gtk.gio.DBusMethodInvocation.fromAddress).marshal(invocation, Ownership.NONE));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(GAuthorizeMethodCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code g_authorize_method}
     * @param gAuthorizeMethod The new value of the field {@code g_authorize_method}
     */
    public void setGAuthorizeMethod(GAuthorizeMethodCallback gAuthorizeMethod) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("g_authorize_method"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (gAuthorizeMethod == null ? MemoryAddress.NULL : gAuthorizeMethod.toCallback()));
    }
    
    /**
     * Create a DBusInterfaceSkeletonClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected DBusInterfaceSkeletonClass(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, DBusInterfaceSkeletonClass> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new DBusInterfaceSkeletonClass(input, ownership);
    
    /**
     * A {@link DBusInterfaceSkeletonClass.Builder} object constructs a {@link DBusInterfaceSkeletonClass} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link DBusInterfaceSkeletonClass.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final DBusInterfaceSkeletonClass struct;
        
        private Builder() {
            struct = DBusInterfaceSkeletonClass.allocate();
        }
        
         /**
         * Finish building the {@link DBusInterfaceSkeletonClass} struct.
         * @return A new instance of {@code DBusInterfaceSkeletonClass} with the fields 
         *         that were set in the Builder object.
         */
        public DBusInterfaceSkeletonClass build() {
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
        
        public Builder setGetInfo(GetInfoCallback getInfo) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_info"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getInfo == null ? MemoryAddress.NULL : getInfo.toCallback()));
            return this;
        }
        
        public Builder setGetVtable(GetVtableCallback getVtable) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_vtable"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getVtable == null ? MemoryAddress.NULL : getVtable.toCallback()));
            return this;
        }
        
        public Builder setGetProperties(GetPropertiesCallback getProperties) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_properties"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getProperties == null ? MemoryAddress.NULL : getProperties.toCallback()));
            return this;
        }
        
        public Builder setFlush(FlushCallback flush) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("flush"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (flush == null ? MemoryAddress.NULL : flush.toCallback()));
            return this;
        }
        
        public Builder setVfuncPadding(java.lang.foreign.MemoryAddress[] vfuncPadding) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("vfunc_padding"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (vfuncPadding == null ? MemoryAddress.NULL : Interop.allocateNativeArray(vfuncPadding, false)));
            return this;
        }
        
        public Builder setGAuthorizeMethod(GAuthorizeMethodCallback gAuthorizeMethod) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("g_authorize_method"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (gAuthorizeMethod == null ? MemoryAddress.NULL : gAuthorizeMethod.toCallback()));
            return this;
        }
        
        public Builder setSignalPadding(java.lang.foreign.MemoryAddress[] signalPadding) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("signal_padding"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (signalPadding == null ? MemoryAddress.NULL : Interop.allocateNativeArray(signalPadding, false)));
            return this;
        }
    }
}
