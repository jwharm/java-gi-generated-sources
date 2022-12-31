package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Base type for D-Bus interfaces.
 * @version 2.30
 */
public class DBusInterfaceIface extends Struct {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GDBusInterfaceIface";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gtk.gobject.TypeInterface.getMemoryLayout().withName("parent_iface"),
            Interop.valueLayout.ADDRESS.withName("get_info"),
            Interop.valueLayout.ADDRESS.withName("get_object"),
            Interop.valueLayout.ADDRESS.withName("set_object"),
            Interop.valueLayout.ADDRESS.withName("dup_object")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link DBusInterfaceIface}
     * @return A new, uninitialized @{link DBusInterfaceIface}
     */
    public static DBusInterfaceIface allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        DBusInterfaceIface newInstance = new DBusInterfaceIface(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code parent_iface}
     * @return The value of the field {@code parent_iface}
     */
    public org.gtk.gobject.TypeInterface getParentIface() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent_iface"));
        return org.gtk.gobject.TypeInterface.fromAddress.marshal(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Change the value of the field {@code parent_iface}
     * @param parentIface The new value of the field {@code parent_iface}
     */
    public void setParentIface(org.gtk.gobject.TypeInterface parentIface) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("parent_iface"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parentIface == null ? MemoryAddress.NULL : parentIface.handle()));
    }
    
    @FunctionalInterface
    public interface GetInfoCallback {
        org.gtk.gio.DBusInterfaceInfo run(org.gtk.gio.DBusInterface interface_);

        @ApiStatus.Internal default Addressable upcall(MemoryAddress interface_) {
            var RESULT = run((org.gtk.gio.DBusInterface) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(interface_)), org.gtk.gio.DBusInterface.fromAddress).marshal(interface_, Ownership.NONE));
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
    public interface GetObjectCallback {
        @Nullable org.gtk.gio.DBusObject run(org.gtk.gio.DBusInterface interface_);

        @ApiStatus.Internal default Addressable upcall(MemoryAddress interface_) {
            var RESULT = run((org.gtk.gio.DBusInterface) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(interface_)), org.gtk.gio.DBusInterface.fromAddress).marshal(interface_, Ownership.NONE));
            return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(GetObjectCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_object}
     * @param getObject The new value of the field {@code get_object}
     */
    public void setGetObject(GetObjectCallback getObject) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("get_object"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getObject == null ? MemoryAddress.NULL : getObject.toCallback()));
    }
    
    @FunctionalInterface
    public interface SetObjectCallback {
        void run(org.gtk.gio.DBusInterface interface_, @Nullable org.gtk.gio.DBusObject object);

        @ApiStatus.Internal default void upcall(MemoryAddress interface_, MemoryAddress object) {
            run((org.gtk.gio.DBusInterface) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(interface_)), org.gtk.gio.DBusInterface.fromAddress).marshal(interface_, Ownership.NONE), (org.gtk.gio.DBusObject) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(object)), org.gtk.gio.DBusObject.fromAddress).marshal(object, Ownership.NONE));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(SetObjectCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code set_object}
     * @param setObject The new value of the field {@code set_object}
     */
    public void setSetObject(SetObjectCallback setObject) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("set_object"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (setObject == null ? MemoryAddress.NULL : setObject.toCallback()));
    }
    
    @FunctionalInterface
    public interface DupObjectCallback {
        @Nullable org.gtk.gio.DBusObject run(org.gtk.gio.DBusInterface interface_);

        @ApiStatus.Internal default Addressable upcall(MemoryAddress interface_) {
            var RESULT = run((org.gtk.gio.DBusInterface) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(interface_)), org.gtk.gio.DBusInterface.fromAddress).marshal(interface_, Ownership.NONE));
            return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(DupObjectCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code dup_object}
     * @param dupObject The new value of the field {@code dup_object}
     */
    public void setDupObject(DupObjectCallback dupObject) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("dup_object"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (dupObject == null ? MemoryAddress.NULL : dupObject.toCallback()));
    }
    
    /**
     * Create a DBusInterfaceIface proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected DBusInterfaceIface(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, DBusInterfaceIface> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new DBusInterfaceIface(input, ownership);
    
    /**
     * A {@link DBusInterfaceIface.Builder} object constructs a {@link DBusInterfaceIface} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link DBusInterfaceIface.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final DBusInterfaceIface struct;
        
        private Builder() {
            struct = DBusInterfaceIface.allocate();
        }
        
         /**
         * Finish building the {@link DBusInterfaceIface} struct.
         * @return A new instance of {@code DBusInterfaceIface} with the fields 
         *         that were set in the Builder object.
         */
        public DBusInterfaceIface build() {
            return struct;
        }
        
        /**
         * The parent interface.
         * @param parentIface The value for the {@code parentIface} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setParentIface(org.gtk.gobject.TypeInterface parentIface) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parent_iface"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parentIface == null ? MemoryAddress.NULL : parentIface.handle()));
            return this;
        }
        
        public Builder setGetInfo(GetInfoCallback getInfo) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_info"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getInfo == null ? MemoryAddress.NULL : getInfo.toCallback()));
            return this;
        }
        
        public Builder setGetObject(GetObjectCallback getObject) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_object"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getObject == null ? MemoryAddress.NULL : getObject.toCallback()));
            return this;
        }
        
        public Builder setSetObject(SetObjectCallback setObject) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("set_object"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (setObject == null ? MemoryAddress.NULL : setObject.toCallback()));
            return this;
        }
        
        public Builder setDupObject(DupObjectCallback dupObject) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("dup_object"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (dupObject == null ? MemoryAddress.NULL : dupObject.toCallback()));
            return this;
        }
    }
}
