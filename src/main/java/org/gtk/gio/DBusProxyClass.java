package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Class structure for {@link DBusProxy}.
 * @version 2.26
 */
public class DBusProxyClass extends Struct {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GDBusProxyClass";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gtk.gobject.ObjectClass.getMemoryLayout().withName("parent_class"),
            Interop.valueLayout.ADDRESS.withName("g_properties_changed"),
            Interop.valueLayout.ADDRESS.withName("g_signal"),
            MemoryLayout.sequenceLayout(32, Interop.valueLayout.ADDRESS).withName("padding")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link DBusProxyClass}
     * @return A new, uninitialized @{link DBusProxyClass}
     */
    public static DBusProxyClass allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        DBusProxyClass newInstance = new DBusProxyClass(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    @FunctionalInterface
    public interface GPropertiesChangedCallback {
        void run(org.gtk.gio.DBusProxy proxy, org.gtk.glib.Variant changedProperties, java.lang.String invalidatedProperties);

        @ApiStatus.Internal default void upcall(MemoryAddress proxy, MemoryAddress changedProperties, MemoryAddress invalidatedProperties) {
            run((org.gtk.gio.DBusProxy) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(proxy)), org.gtk.gio.DBusProxy.fromAddress).marshal(proxy, Ownership.NONE), org.gtk.glib.Variant.fromAddress.marshal(changedProperties, Ownership.NONE), Marshal.addressToString.marshal(invalidatedProperties, null));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(GPropertiesChangedCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code g_properties_changed}
     * @param gPropertiesChanged The new value of the field {@code g_properties_changed}
     */
    public void setGPropertiesChanged(GPropertiesChangedCallback gPropertiesChanged) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("g_properties_changed"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (gPropertiesChanged == null ? MemoryAddress.NULL : gPropertiesChanged.toCallback()));
    }
    
    @FunctionalInterface
    public interface GSignalCallback {
        void run(org.gtk.gio.DBusProxy proxy, java.lang.String senderName, java.lang.String signalName, org.gtk.glib.Variant parameters);

        @ApiStatus.Internal default void upcall(MemoryAddress proxy, MemoryAddress senderName, MemoryAddress signalName, MemoryAddress parameters) {
            run((org.gtk.gio.DBusProxy) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(proxy)), org.gtk.gio.DBusProxy.fromAddress).marshal(proxy, Ownership.NONE), Marshal.addressToString.marshal(senderName, null), Marshal.addressToString.marshal(signalName, null), org.gtk.glib.Variant.fromAddress.marshal(parameters, Ownership.NONE));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(GSignalCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code g_signal}
     * @param gSignal The new value of the field {@code g_signal}
     */
    public void setGSignal(GSignalCallback gSignal) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("g_signal"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (gSignal == null ? MemoryAddress.NULL : gSignal.toCallback()));
    }
    
    /**
     * Create a DBusProxyClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected DBusProxyClass(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, DBusProxyClass> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new DBusProxyClass(input, ownership);
    
    /**
     * A {@link DBusProxyClass.Builder} object constructs a {@link DBusProxyClass} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link DBusProxyClass.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final DBusProxyClass struct;
        
        private Builder() {
            struct = DBusProxyClass.allocate();
        }
        
         /**
         * Finish building the {@link DBusProxyClass} struct.
         * @return A new instance of {@code DBusProxyClass} with the fields 
         *         that were set in the Builder object.
         */
        public DBusProxyClass build() {
            return struct;
        }
        
        public Builder setParentClass(org.gtk.gobject.ObjectClass parentClass) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
            return this;
        }
        
        public Builder setGPropertiesChanged(GPropertiesChangedCallback gPropertiesChanged) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("g_properties_changed"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (gPropertiesChanged == null ? MemoryAddress.NULL : gPropertiesChanged.toCallback()));
            return this;
        }
        
        public Builder setGSignal(GSignalCallback gSignal) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("g_signal"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (gSignal == null ? MemoryAddress.NULL : gSignal.toCallback()));
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
