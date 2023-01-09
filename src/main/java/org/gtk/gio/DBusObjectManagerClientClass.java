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
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        DBusObjectManagerClientClass newInstance = new DBusObjectManagerClientClass(segment.address());
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
     * Functional interface declaration of the {@code InterfaceProxySignalCallback} callback.
     */
    @FunctionalInterface
    public interface InterfaceProxySignalCallback {
    
        void run(org.gtk.gio.DBusObjectManagerClient manager, org.gtk.gio.DBusObjectProxy objectProxy, org.gtk.gio.DBusProxy interfaceProxy, java.lang.String senderName, java.lang.String signalName, org.gtk.glib.Variant parameters);
        
        @ApiStatus.Internal default void upcall(MemoryAddress manager, MemoryAddress objectProxy, MemoryAddress interfaceProxy, MemoryAddress senderName, MemoryAddress signalName, MemoryAddress parameters) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                run((org.gtk.gio.DBusObjectManagerClient) Interop.register(manager, org.gtk.gio.DBusObjectManagerClient.fromAddress).marshal(manager, null), (org.gtk.gio.DBusObjectProxy) Interop.register(objectProxy, org.gtk.gio.DBusObjectProxy.fromAddress).marshal(objectProxy, null), (org.gtk.gio.DBusProxy) Interop.register(interfaceProxy, org.gtk.gio.DBusProxy.fromAddress).marshal(interfaceProxy, null), Marshal.addressToString.marshal(senderName, null), Marshal.addressToString.marshal(signalName, null), org.gtk.glib.Variant.fromAddress.marshal(parameters, null));
            }
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), InterfaceProxySignalCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code interface_proxy_signal}
     * @param interfaceProxySignal The new value of the field {@code interface_proxy_signal}
     */
    public void setInterfaceProxySignal(InterfaceProxySignalCallback interfaceProxySignal) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("interface_proxy_signal"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (interfaceProxySignal == null ? MemoryAddress.NULL : interfaceProxySignal.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code InterfaceProxyPropertiesChangedCallback} callback.
     */
    @FunctionalInterface
    public interface InterfaceProxyPropertiesChangedCallback {
    
        void run(org.gtk.gio.DBusObjectManagerClient manager, org.gtk.gio.DBusObjectProxy objectProxy, org.gtk.gio.DBusProxy interfaceProxy, org.gtk.glib.Variant changedProperties, java.lang.String invalidatedProperties);
        
        @ApiStatus.Internal default void upcall(MemoryAddress manager, MemoryAddress objectProxy, MemoryAddress interfaceProxy, MemoryAddress changedProperties, MemoryAddress invalidatedProperties) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                run((org.gtk.gio.DBusObjectManagerClient) Interop.register(manager, org.gtk.gio.DBusObjectManagerClient.fromAddress).marshal(manager, null), (org.gtk.gio.DBusObjectProxy) Interop.register(objectProxy, org.gtk.gio.DBusObjectProxy.fromAddress).marshal(objectProxy, null), (org.gtk.gio.DBusProxy) Interop.register(interfaceProxy, org.gtk.gio.DBusProxy.fromAddress).marshal(interfaceProxy, null), org.gtk.glib.Variant.fromAddress.marshal(changedProperties, null), Marshal.addressToString.marshal(invalidatedProperties, null));
            }
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), InterfaceProxyPropertiesChangedCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code interface_proxy_properties_changed}
     * @param interfaceProxyPropertiesChanged The new value of the field {@code interface_proxy_properties_changed}
     */
    public void setInterfaceProxyPropertiesChanged(InterfaceProxyPropertiesChangedCallback interfaceProxyPropertiesChanged) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("interface_proxy_properties_changed"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (interfaceProxyPropertiesChanged == null ? MemoryAddress.NULL : interfaceProxyPropertiesChanged.toCallback()));
        }
    }
    
    /**
     * Create a DBusObjectManagerClientClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected DBusObjectManagerClientClass(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, DBusObjectManagerClientClass> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new DBusObjectManagerClientClass(input);
    
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
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
                return this;
            }
        }
        
        public Builder setInterfaceProxySignal(InterfaceProxySignalCallback interfaceProxySignal) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("interface_proxy_signal"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (interfaceProxySignal == null ? MemoryAddress.NULL : interfaceProxySignal.toCallback()));
                return this;
            }
        }
        
        public Builder setInterfaceProxyPropertiesChanged(InterfaceProxyPropertiesChangedCallback interfaceProxyPropertiesChanged) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("interface_proxy_properties_changed"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (interfaceProxyPropertiesChanged == null ? MemoryAddress.NULL : interfaceProxyPropertiesChanged.toCallback()));
                return this;
            }
        }
        
        public Builder setPadding(java.lang.foreign.MemoryAddress[] padding) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("padding"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (padding == null ? MemoryAddress.NULL : Interop.allocateNativeArray(padding, false, SCOPE)));
                return this;
            }
        }
    }
}
