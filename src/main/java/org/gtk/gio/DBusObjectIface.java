package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Base object type for D-Bus objects.
 * @version 2.30
 */
public class DBusObjectIface extends Struct {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GDBusObjectIface";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gtk.gobject.TypeInterface.getMemoryLayout().withName("parent_iface"),
            Interop.valueLayout.ADDRESS.withName("get_object_path"),
            Interop.valueLayout.ADDRESS.withName("get_interfaces"),
            Interop.valueLayout.ADDRESS.withName("get_interface"),
            Interop.valueLayout.ADDRESS.withName("interface_added"),
            Interop.valueLayout.ADDRESS.withName("interface_removed")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link DBusObjectIface}
     * @return A new, uninitialized @{link DBusObjectIface}
     */
    public static DBusObjectIface allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        DBusObjectIface newInstance = new DBusObjectIface(segment.address(), Ownership.NONE);
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
    public interface GetObjectPathCallback {
        java.lang.String run(org.gtk.gio.DBusObject object);

        @ApiStatus.Internal default Addressable upcall(MemoryAddress object) {
            var RESULT = run((org.gtk.gio.DBusObject) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(object)), org.gtk.gio.DBusObject.fromAddress).marshal(object, Ownership.NONE));
            return RESULT == null ? MemoryAddress.NULL.address() : (Marshal.stringToAddress.marshal(RESULT, null)).address();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(GetObjectPathCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_object_path}
     * @param getObjectPath The new value of the field {@code get_object_path}
     */
    public void setGetObjectPath(GetObjectPathCallback getObjectPath) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("get_object_path"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getObjectPath == null ? MemoryAddress.NULL : getObjectPath.toCallback()));
    }
    
    @FunctionalInterface
    public interface GetInterfacesCallback {
        org.gtk.glib.List run(org.gtk.gio.DBusObject object);

        @ApiStatus.Internal default Addressable upcall(MemoryAddress object) {
            var RESULT = run((org.gtk.gio.DBusObject) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(object)), org.gtk.gio.DBusObject.fromAddress).marshal(object, Ownership.NONE));
            return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(GetInterfacesCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_interfaces}
     * @param getInterfaces The new value of the field {@code get_interfaces}
     */
    public void setGetInterfaces(GetInterfacesCallback getInterfaces) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("get_interfaces"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getInterfaces == null ? MemoryAddress.NULL : getInterfaces.toCallback()));
    }
    
    @FunctionalInterface
    public interface GetInterfaceCallback {
        @Nullable org.gtk.gio.DBusInterface run(org.gtk.gio.DBusObject object, java.lang.String interfaceName);

        @ApiStatus.Internal default Addressable upcall(MemoryAddress object, MemoryAddress interfaceName) {
            var RESULT = run((org.gtk.gio.DBusObject) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(object)), org.gtk.gio.DBusObject.fromAddress).marshal(object, Ownership.NONE), Marshal.addressToString.marshal(interfaceName, null));
            return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(GetInterfaceCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_interface}
     * @param getInterface The new value of the field {@code get_interface}
     */
    public void setGetInterface(GetInterfaceCallback getInterface) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("get_interface"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getInterface == null ? MemoryAddress.NULL : getInterface.toCallback()));
    }
    
    @FunctionalInterface
    public interface InterfaceAddedCallback {
        void run(org.gtk.gio.DBusObject object, org.gtk.gio.DBusInterface interface_);

        @ApiStatus.Internal default void upcall(MemoryAddress object, MemoryAddress interface_) {
            run((org.gtk.gio.DBusObject) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(object)), org.gtk.gio.DBusObject.fromAddress).marshal(object, Ownership.NONE), (org.gtk.gio.DBusInterface) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(interface_)), org.gtk.gio.DBusInterface.fromAddress).marshal(interface_, Ownership.NONE));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(InterfaceAddedCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code interface_added}
     * @param interfaceAdded The new value of the field {@code interface_added}
     */
    public void setInterfaceAdded(InterfaceAddedCallback interfaceAdded) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("interface_added"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (interfaceAdded == null ? MemoryAddress.NULL : interfaceAdded.toCallback()));
    }
    
    @FunctionalInterface
    public interface InterfaceRemovedCallback {
        void run(org.gtk.gio.DBusObject object, org.gtk.gio.DBusInterface interface_);

        @ApiStatus.Internal default void upcall(MemoryAddress object, MemoryAddress interface_) {
            run((org.gtk.gio.DBusObject) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(object)), org.gtk.gio.DBusObject.fromAddress).marshal(object, Ownership.NONE), (org.gtk.gio.DBusInterface) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(interface_)), org.gtk.gio.DBusInterface.fromAddress).marshal(interface_, Ownership.NONE));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(InterfaceRemovedCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code interface_removed}
     * @param interfaceRemoved The new value of the field {@code interface_removed}
     */
    public void setInterfaceRemoved(InterfaceRemovedCallback interfaceRemoved) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("interface_removed"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (interfaceRemoved == null ? MemoryAddress.NULL : interfaceRemoved.toCallback()));
    }
    
    /**
     * Create a DBusObjectIface proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected DBusObjectIface(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, DBusObjectIface> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new DBusObjectIface(input, ownership);
    
    /**
     * A {@link DBusObjectIface.Builder} object constructs a {@link DBusObjectIface} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link DBusObjectIface.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final DBusObjectIface struct;
        
        private Builder() {
            struct = DBusObjectIface.allocate();
        }
        
         /**
         * Finish building the {@link DBusObjectIface} struct.
         * @return A new instance of {@code DBusObjectIface} with the fields 
         *         that were set in the Builder object.
         */
        public DBusObjectIface build() {
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
        
        public Builder setGetObjectPath(GetObjectPathCallback getObjectPath) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_object_path"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getObjectPath == null ? MemoryAddress.NULL : getObjectPath.toCallback()));
            return this;
        }
        
        public Builder setGetInterfaces(GetInterfacesCallback getInterfaces) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_interfaces"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getInterfaces == null ? MemoryAddress.NULL : getInterfaces.toCallback()));
            return this;
        }
        
        public Builder setGetInterface(GetInterfaceCallback getInterface) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_interface"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getInterface == null ? MemoryAddress.NULL : getInterface.toCallback()));
            return this;
        }
        
        public Builder setInterfaceAdded(InterfaceAddedCallback interfaceAdded) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("interface_added"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (interfaceAdded == null ? MemoryAddress.NULL : interfaceAdded.toCallback()));
            return this;
        }
        
        public Builder setInterfaceRemoved(InterfaceRemovedCallback interfaceRemoved) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("interface_removed"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (interfaceRemoved == null ? MemoryAddress.NULL : interfaceRemoved.toCallback()));
            return this;
        }
    }
}
