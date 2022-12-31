package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Class structure for {@link DBusObjectManagerClient}.
 * @version 2.30
 */
public class DBusObjectManagerClientClass extends Struct {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GDBusObjectManagerClientClass";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gtk.gobject.ObjectClass.getMemoryLayout().withName("parent_class"),
            Interop.valueLayout.ADDRESS.withName("interface_proxy_signal"),
            Interop.valueLayout.ADDRESS.withName("interface_proxy_properties_changed"),
            MemoryLayout.sequenceLayout(8, Interop.valueLayout.ADDRESS).withName("padding")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link DBusObjectManagerClientClass}
     * @return A new, uninitialized @{link DBusObjectManagerClientClass}
     */
    public static DBusObjectManagerClientClass allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        DBusObjectManagerClientClass newInstance = new DBusObjectManagerClientClass(segment.address(), Ownership.NONE);
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
    public interface InterfaceProxySignalCallback {
        void run(org.gtk.gio.DBusObjectManagerClient manager, org.gtk.gio.DBusObjectProxy objectProxy, org.gtk.gio.DBusProxy interfaceProxy, java.lang.String senderName, java.lang.String signalName, org.gtk.glib.Variant parameters);

        @ApiStatus.Internal default void upcall(MemoryAddress manager, MemoryAddress objectProxy, MemoryAddress interfaceProxy, MemoryAddress senderName, MemoryAddress signalName, MemoryAddress parameters) {
            run((org.gtk.gio.DBusObjectManagerClient) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(manager)), org.gtk.gio.DBusObjectManagerClient.fromAddress).marshal(manager, Ownership.NONE), (org.gtk.gio.DBusObjectProxy) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(objectProxy)), org.gtk.gio.DBusObjectProxy.fromAddress).marshal(objectProxy, Ownership.NONE), (org.gtk.gio.DBusProxy) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(interfaceProxy)), org.gtk.gio.DBusProxy.fromAddress).marshal(interfaceProxy, Ownership.NONE), Marshal.addressToString.marshal(senderName, null), Marshal.addressToString.marshal(signalName, null), org.gtk.glib.Variant.fromAddress.marshal(parameters, Ownership.NONE));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(InterfaceProxySignalCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code interface_proxy_signal}
     * @param interfaceProxySignal The new value of the field {@code interface_proxy_signal}
     */
    public void setInterfaceProxySignal(InterfaceProxySignalCallback interfaceProxySignal) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("interface_proxy_signal"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (interfaceProxySignal == null ? MemoryAddress.NULL : interfaceProxySignal.toCallback()));
    }
    
    @FunctionalInterface
    public interface InterfaceProxyPropertiesChangedCallback {
        void run(org.gtk.gio.DBusObjectManagerClient manager, org.gtk.gio.DBusObjectProxy objectProxy, org.gtk.gio.DBusProxy interfaceProxy, org.gtk.glib.Variant changedProperties, java.lang.String invalidatedProperties);

        @ApiStatus.Internal default void upcall(MemoryAddress manager, MemoryAddress objectProxy, MemoryAddress interfaceProxy, MemoryAddress changedProperties, MemoryAddress invalidatedProperties) {
            run((org.gtk.gio.DBusObjectManagerClient) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(manager)), org.gtk.gio.DBusObjectManagerClient.fromAddress).marshal(manager, Ownership.NONE), (org.gtk.gio.DBusObjectProxy) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(objectProxy)), org.gtk.gio.DBusObjectProxy.fromAddress).marshal(objectProxy, Ownership.NONE), (org.gtk.gio.DBusProxy) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(interfaceProxy)), org.gtk.gio.DBusProxy.fromAddress).marshal(interfaceProxy, Ownership.NONE), org.gtk.glib.Variant.fromAddress.marshal(changedProperties, Ownership.NONE), Marshal.addressToString.marshal(invalidatedProperties, null));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(InterfaceProxyPropertiesChangedCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code interface_proxy_properties_changed}
     * @param interfaceProxyPropertiesChanged The new value of the field {@code interface_proxy_properties_changed}
     */
    public void setInterfaceProxyPropertiesChanged(InterfaceProxyPropertiesChangedCallback interfaceProxyPropertiesChanged) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("interface_proxy_properties_changed"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (interfaceProxyPropertiesChanged == null ? MemoryAddress.NULL : interfaceProxyPropertiesChanged.toCallback()));
    }
    
    /**
     * Create a DBusObjectManagerClientClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected DBusObjectManagerClientClass(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, DBusObjectManagerClientClass> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new DBusObjectManagerClientClass(input, ownership);
    
    /**
     * A {@link DBusObjectManagerClientClass.Builder} object constructs a {@link DBusObjectManagerClientClass} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link DBusObjectManagerClientClass.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final DBusObjectManagerClientClass struct;
        
        private Builder() {
            struct = DBusObjectManagerClientClass.allocate();
        }
        
         /**
         * Finish building the {@link DBusObjectManagerClientClass} struct.
         * @return A new instance of {@code DBusObjectManagerClientClass} with the fields 
         *         that were set in the Builder object.
         */
        public DBusObjectManagerClientClass build() {
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
        
        public Builder setInterfaceProxySignal(InterfaceProxySignalCallback interfaceProxySignal) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("interface_proxy_signal"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (interfaceProxySignal == null ? MemoryAddress.NULL : interfaceProxySignal.toCallback()));
            return this;
        }
        
        public Builder setInterfaceProxyPropertiesChanged(InterfaceProxyPropertiesChangedCallback interfaceProxyPropertiesChanged) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("interface_proxy_properties_changed"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (interfaceProxyPropertiesChanged == null ? MemoryAddress.NULL : interfaceProxyPropertiesChanged.toCallback()));
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
