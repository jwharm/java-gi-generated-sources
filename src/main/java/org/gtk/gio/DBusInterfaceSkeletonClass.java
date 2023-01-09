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
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        DBusInterfaceSkeletonClass newInstance = new DBusInterfaceSkeletonClass(segment.address());
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
     * Functional interface declaration of the {@code GetInfoCallback} callback.
     */
    @FunctionalInterface
    public interface GetInfoCallback {
    
        org.gtk.gio.DBusInterfaceInfo run(org.gtk.gio.DBusInterfaceSkeleton interface_);
        
        @ApiStatus.Internal default Addressable upcall(MemoryAddress interface_) {
            var RESULT = run((org.gtk.gio.DBusInterfaceSkeleton) Interop.register(interface_, org.gtk.gio.DBusInterfaceSkeleton.fromAddress).marshal(interface_, null));
            return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), GetInfoCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_info}
     * @param getInfo The new value of the field {@code get_info}
     */
    public void setGetInfo(GetInfoCallback getInfo) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_info"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getInfo == null ? MemoryAddress.NULL : getInfo.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code GetVtableCallback} callback.
     */
    @FunctionalInterface
    public interface GetVtableCallback {
    
        org.gtk.gio.DBusInterfaceVTable run(org.gtk.gio.DBusInterfaceSkeleton interface_);
        
        @ApiStatus.Internal default Addressable upcall(MemoryAddress interface_) {
            var RESULT = run((org.gtk.gio.DBusInterfaceSkeleton) Interop.register(interface_, org.gtk.gio.DBusInterfaceSkeleton.fromAddress).marshal(interface_, null));
            return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), GetVtableCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_vtable}
     * @param getVtable The new value of the field {@code get_vtable}
     */
    public void setGetVtable(GetVtableCallback getVtable) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_vtable"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getVtable == null ? MemoryAddress.NULL : getVtable.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code GetPropertiesCallback} callback.
     */
    @FunctionalInterface
    public interface GetPropertiesCallback {
    
        org.gtk.glib.Variant run(org.gtk.gio.DBusInterfaceSkeleton interface_);
        
        @ApiStatus.Internal default Addressable upcall(MemoryAddress interface_) {
            var RESULT = run((org.gtk.gio.DBusInterfaceSkeleton) Interop.register(interface_, org.gtk.gio.DBusInterfaceSkeleton.fromAddress).marshal(interface_, null));
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
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), GetPropertiesCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_properties}
     * @param getProperties The new value of the field {@code get_properties}
     */
    public void setGetProperties(GetPropertiesCallback getProperties) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_properties"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getProperties == null ? MemoryAddress.NULL : getProperties.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code FlushCallback} callback.
     */
    @FunctionalInterface
    public interface FlushCallback {
    
        void run(org.gtk.gio.DBusInterfaceSkeleton interface_);
        
        @ApiStatus.Internal default void upcall(MemoryAddress interface_) {
            run((org.gtk.gio.DBusInterfaceSkeleton) Interop.register(interface_, org.gtk.gio.DBusInterfaceSkeleton.fromAddress).marshal(interface_, null));
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), FlushCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code flush}
     * @param flush The new value of the field {@code flush}
     */
    public void setFlush(FlushCallback flush) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("flush"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (flush == null ? MemoryAddress.NULL : flush.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code GAuthorizeMethodCallback} callback.
     */
    @FunctionalInterface
    public interface GAuthorizeMethodCallback {
    
        boolean run(org.gtk.gio.DBusInterfaceSkeleton interface_, org.gtk.gio.DBusMethodInvocation invocation);
        
        @ApiStatus.Internal default int upcall(MemoryAddress interface_, MemoryAddress invocation) {
            var RESULT = run((org.gtk.gio.DBusInterfaceSkeleton) Interop.register(interface_, org.gtk.gio.DBusInterfaceSkeleton.fromAddress).marshal(interface_, null), (org.gtk.gio.DBusMethodInvocation) Interop.register(invocation, org.gtk.gio.DBusMethodInvocation.fromAddress).marshal(invocation, null));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), GAuthorizeMethodCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code g_authorize_method}
     * @param gAuthorizeMethod The new value of the field {@code g_authorize_method}
     */
    public void setGAuthorizeMethod(GAuthorizeMethodCallback gAuthorizeMethod) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("g_authorize_method"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (gAuthorizeMethod == null ? MemoryAddress.NULL : gAuthorizeMethod.toCallback()));
        }
    }
    
    /**
     * Create a DBusInterfaceSkeletonClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected DBusInterfaceSkeletonClass(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, DBusInterfaceSkeletonClass> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new DBusInterfaceSkeletonClass(input);
    
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
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
                return this;
            }
        }
        
        public Builder setGetInfo(GetInfoCallback getInfo) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("get_info"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getInfo == null ? MemoryAddress.NULL : getInfo.toCallback()));
                return this;
            }
        }
        
        public Builder setGetVtable(GetVtableCallback getVtable) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("get_vtable"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getVtable == null ? MemoryAddress.NULL : getVtable.toCallback()));
                return this;
            }
        }
        
        public Builder setGetProperties(GetPropertiesCallback getProperties) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("get_properties"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getProperties == null ? MemoryAddress.NULL : getProperties.toCallback()));
                return this;
            }
        }
        
        public Builder setFlush(FlushCallback flush) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("flush"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (flush == null ? MemoryAddress.NULL : flush.toCallback()));
                return this;
            }
        }
        
        public Builder setVfuncPadding(java.lang.foreign.MemoryAddress[] vfuncPadding) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("vfunc_padding"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (vfuncPadding == null ? MemoryAddress.NULL : Interop.allocateNativeArray(vfuncPadding, false, SCOPE)));
                return this;
            }
        }
        
        public Builder setGAuthorizeMethod(GAuthorizeMethodCallback gAuthorizeMethod) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("g_authorize_method"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (gAuthorizeMethod == null ? MemoryAddress.NULL : gAuthorizeMethod.toCallback()));
                return this;
            }
        }
        
        public Builder setSignalPadding(java.lang.foreign.MemoryAddress[] signalPadding) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("signal_padding"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (signalPadding == null ? MemoryAddress.NULL : Interop.allocateNativeArray(signalPadding, false, SCOPE)));
                return this;
            }
        }
    }
}
