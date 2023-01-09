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
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        DBusProxyClass newInstance = new DBusProxyClass(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Functional interface declaration of the {@code GPropertiesChangedCallback} callback.
     */
    @FunctionalInterface
    public interface GPropertiesChangedCallback {
    
        void run(org.gtk.gio.DBusProxy proxy, org.gtk.glib.Variant changedProperties, java.lang.String invalidatedProperties);
        
        @ApiStatus.Internal default void upcall(MemoryAddress proxy, MemoryAddress changedProperties, MemoryAddress invalidatedProperties) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                run((org.gtk.gio.DBusProxy) Interop.register(proxy, org.gtk.gio.DBusProxy.fromAddress).marshal(proxy, null), org.gtk.glib.Variant.fromAddress.marshal(changedProperties, null), Marshal.addressToString.marshal(invalidatedProperties, null));
            }
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), GPropertiesChangedCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code g_properties_changed}
     * @param gPropertiesChanged The new value of the field {@code g_properties_changed}
     */
    public void setGPropertiesChanged(GPropertiesChangedCallback gPropertiesChanged) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("g_properties_changed"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (gPropertiesChanged == null ? MemoryAddress.NULL : gPropertiesChanged.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code GSignalCallback} callback.
     */
    @FunctionalInterface
    public interface GSignalCallback {
    
        void run(org.gtk.gio.DBusProxy proxy, java.lang.String senderName, java.lang.String signalName, org.gtk.glib.Variant parameters);
        
        @ApiStatus.Internal default void upcall(MemoryAddress proxy, MemoryAddress senderName, MemoryAddress signalName, MemoryAddress parameters) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                run((org.gtk.gio.DBusProxy) Interop.register(proxy, org.gtk.gio.DBusProxy.fromAddress).marshal(proxy, null), Marshal.addressToString.marshal(senderName, null), Marshal.addressToString.marshal(signalName, null), org.gtk.glib.Variant.fromAddress.marshal(parameters, null));
            }
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), GSignalCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code g_signal}
     * @param gSignal The new value of the field {@code g_signal}
     */
    public void setGSignal(GSignalCallback gSignal) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("g_signal"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (gSignal == null ? MemoryAddress.NULL : gSignal.toCallback()));
        }
    }
    
    /**
     * Create a DBusProxyClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected DBusProxyClass(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, DBusProxyClass> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new DBusProxyClass(input);
    
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
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
                return this;
            }
        }
        
        public Builder setGPropertiesChanged(GPropertiesChangedCallback gPropertiesChanged) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("g_properties_changed"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (gPropertiesChanged == null ? MemoryAddress.NULL : gPropertiesChanged.toCallback()));
                return this;
            }
        }
        
        public Builder setGSignal(GSignalCallback gSignal) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("g_signal"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (gSignal == null ? MemoryAddress.NULL : gSignal.toCallback()));
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
