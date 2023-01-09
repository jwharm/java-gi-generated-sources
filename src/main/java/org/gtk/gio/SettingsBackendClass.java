package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Class structure for {@link SettingsBackend}.
 */
public class SettingsBackendClass extends Struct {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GSettingsBackendClass";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gtk.gobject.ObjectClass.getMemoryLayout().withName("parent_class"),
            Interop.valueLayout.ADDRESS.withName("read"),
            Interop.valueLayout.ADDRESS.withName("get_writable"),
            Interop.valueLayout.ADDRESS.withName("write"),
            Interop.valueLayout.ADDRESS.withName("write_tree"),
            Interop.valueLayout.ADDRESS.withName("reset"),
            Interop.valueLayout.ADDRESS.withName("subscribe"),
            Interop.valueLayout.ADDRESS.withName("unsubscribe"),
            Interop.valueLayout.ADDRESS.withName("sync"),
            Interop.valueLayout.ADDRESS.withName("get_permission"),
            Interop.valueLayout.ADDRESS.withName("read_user_value"),
            MemoryLayout.sequenceLayout(23, Interop.valueLayout.ADDRESS).withName("padding")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link SettingsBackendClass}
     * @return A new, uninitialized @{link SettingsBackendClass}
     */
    public static SettingsBackendClass allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        SettingsBackendClass newInstance = new SettingsBackendClass(segment.address());
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
     * Functional interface declaration of the {@code ReadCallback} callback.
     */
    @FunctionalInterface
    public interface ReadCallback {
    
        org.gtk.glib.Variant run(org.gtk.gio.SettingsBackend backend, java.lang.String key, org.gtk.glib.VariantType expectedType, boolean defaultValue);
        
        @ApiStatus.Internal default Addressable upcall(MemoryAddress backend, MemoryAddress key, MemoryAddress expectedType, int defaultValue) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                var RESULT = run((org.gtk.gio.SettingsBackend) Interop.register(backend, org.gtk.gio.SettingsBackend.fromAddress).marshal(backend, null), Marshal.addressToString.marshal(key, null), org.gtk.glib.VariantType.fromAddress.marshal(expectedType, null), Marshal.integerToBoolean.marshal(defaultValue, null).booleanValue());
                RESULT.yieldOwnership();
                return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
            }
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), ReadCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code read}
     * @param read The new value of the field {@code read}
     */
    public void setRead(ReadCallback read) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("read"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (read == null ? MemoryAddress.NULL : read.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code GetWritableCallback} callback.
     */
    @FunctionalInterface
    public interface GetWritableCallback {
    
        boolean run(org.gtk.gio.SettingsBackend backend, java.lang.String key);
        
        @ApiStatus.Internal default int upcall(MemoryAddress backend, MemoryAddress key) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                var RESULT = run((org.gtk.gio.SettingsBackend) Interop.register(backend, org.gtk.gio.SettingsBackend.fromAddress).marshal(backend, null), Marshal.addressToString.marshal(key, null));
                return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
            }
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), GetWritableCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_writable}
     * @param getWritable The new value of the field {@code get_writable}
     */
    public void setGetWritable(GetWritableCallback getWritable) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_writable"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getWritable == null ? MemoryAddress.NULL : getWritable.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code WriteCallback} callback.
     */
    @FunctionalInterface
    public interface WriteCallback {
    
        boolean run(org.gtk.gio.SettingsBackend backend, java.lang.String key, org.gtk.glib.Variant value, @Nullable java.lang.foreign.MemoryAddress originTag);
        
        @ApiStatus.Internal default int upcall(MemoryAddress backend, MemoryAddress key, MemoryAddress value, MemoryAddress originTag) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                var RESULT = run((org.gtk.gio.SettingsBackend) Interop.register(backend, org.gtk.gio.SettingsBackend.fromAddress).marshal(backend, null), Marshal.addressToString.marshal(key, null), org.gtk.glib.Variant.fromAddress.marshal(value, null), originTag);
                return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
            }
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), WriteCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code write}
     * @param write The new value of the field {@code write}
     */
    public void setWrite(WriteCallback write) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("write"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (write == null ? MemoryAddress.NULL : write.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code WriteTreeCallback} callback.
     */
    @FunctionalInterface
    public interface WriteTreeCallback {
    
        boolean run(org.gtk.gio.SettingsBackend backend, org.gtk.glib.Tree tree, @Nullable java.lang.foreign.MemoryAddress originTag);
        
        @ApiStatus.Internal default int upcall(MemoryAddress backend, MemoryAddress tree, MemoryAddress originTag) {
            var RESULT = run((org.gtk.gio.SettingsBackend) Interop.register(backend, org.gtk.gio.SettingsBackend.fromAddress).marshal(backend, null), org.gtk.glib.Tree.fromAddress.marshal(tree, null), originTag);
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), WriteTreeCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code write_tree}
     * @param writeTree The new value of the field {@code write_tree}
     */
    public void setWriteTree(WriteTreeCallback writeTree) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("write_tree"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (writeTree == null ? MemoryAddress.NULL : writeTree.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code ResetCallback} callback.
     */
    @FunctionalInterface
    public interface ResetCallback {
    
        void run(org.gtk.gio.SettingsBackend backend, java.lang.String key, @Nullable java.lang.foreign.MemoryAddress originTag);
        
        @ApiStatus.Internal default void upcall(MemoryAddress backend, MemoryAddress key, MemoryAddress originTag) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                run((org.gtk.gio.SettingsBackend) Interop.register(backend, org.gtk.gio.SettingsBackend.fromAddress).marshal(backend, null), Marshal.addressToString.marshal(key, null), originTag);
            }
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), ResetCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code reset}
     * @param reset The new value of the field {@code reset}
     */
    public void setReset(ResetCallback reset) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("reset"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (reset == null ? MemoryAddress.NULL : reset.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code SubscribeCallback} callback.
     */
    @FunctionalInterface
    public interface SubscribeCallback {
    
        void run(org.gtk.gio.SettingsBackend backend, java.lang.String name);
        
        @ApiStatus.Internal default void upcall(MemoryAddress backend, MemoryAddress name) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                run((org.gtk.gio.SettingsBackend) Interop.register(backend, org.gtk.gio.SettingsBackend.fromAddress).marshal(backend, null), Marshal.addressToString.marshal(name, null));
            }
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), SubscribeCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code subscribe}
     * @param subscribe The new value of the field {@code subscribe}
     */
    public void setSubscribe(SubscribeCallback subscribe) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("subscribe"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (subscribe == null ? MemoryAddress.NULL : subscribe.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code UnsubscribeCallback} callback.
     */
    @FunctionalInterface
    public interface UnsubscribeCallback {
    
        void run(org.gtk.gio.SettingsBackend backend, java.lang.String name);
        
        @ApiStatus.Internal default void upcall(MemoryAddress backend, MemoryAddress name) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                run((org.gtk.gio.SettingsBackend) Interop.register(backend, org.gtk.gio.SettingsBackend.fromAddress).marshal(backend, null), Marshal.addressToString.marshal(name, null));
            }
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), UnsubscribeCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code unsubscribe}
     * @param unsubscribe The new value of the field {@code unsubscribe}
     */
    public void setUnsubscribe(UnsubscribeCallback unsubscribe) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("unsubscribe"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (unsubscribe == null ? MemoryAddress.NULL : unsubscribe.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code SyncCallback} callback.
     */
    @FunctionalInterface
    public interface SyncCallback {
    
        void run(org.gtk.gio.SettingsBackend backend);
        
        @ApiStatus.Internal default void upcall(MemoryAddress backend) {
            run((org.gtk.gio.SettingsBackend) Interop.register(backend, org.gtk.gio.SettingsBackend.fromAddress).marshal(backend, null));
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), SyncCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code sync}
     * @param sync The new value of the field {@code sync}
     */
    public void setSync(SyncCallback sync) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("sync"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (sync == null ? MemoryAddress.NULL : sync.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code GetPermissionCallback} callback.
     */
    @FunctionalInterface
    public interface GetPermissionCallback {
    
        org.gtk.gio.Permission run(org.gtk.gio.SettingsBackend backend, java.lang.String path);
        
        @ApiStatus.Internal default Addressable upcall(MemoryAddress backend, MemoryAddress path) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                var RESULT = run((org.gtk.gio.SettingsBackend) Interop.register(backend, org.gtk.gio.SettingsBackend.fromAddress).marshal(backend, null), Marshal.addressToString.marshal(path, null));
                return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
            }
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), GetPermissionCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_permission}
     * @param getPermission The new value of the field {@code get_permission}
     */
    public void setGetPermission(GetPermissionCallback getPermission) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_permission"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getPermission == null ? MemoryAddress.NULL : getPermission.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code ReadUserValueCallback} callback.
     */
    @FunctionalInterface
    public interface ReadUserValueCallback {
    
        org.gtk.glib.Variant run(org.gtk.gio.SettingsBackend backend, java.lang.String key, org.gtk.glib.VariantType expectedType);
        
        @ApiStatus.Internal default Addressable upcall(MemoryAddress backend, MemoryAddress key, MemoryAddress expectedType) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                var RESULT = run((org.gtk.gio.SettingsBackend) Interop.register(backend, org.gtk.gio.SettingsBackend.fromAddress).marshal(backend, null), Marshal.addressToString.marshal(key, null), org.gtk.glib.VariantType.fromAddress.marshal(expectedType, null));
                RESULT.yieldOwnership();
                return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
            }
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), ReadUserValueCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code read_user_value}
     * @param readUserValue The new value of the field {@code read_user_value}
     */
    public void setReadUserValue(ReadUserValueCallback readUserValue) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("read_user_value"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (readUserValue == null ? MemoryAddress.NULL : readUserValue.toCallback()));
        }
    }
    
    /**
     * Create a SettingsBackendClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected SettingsBackendClass(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, SettingsBackendClass> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new SettingsBackendClass(input);
    
    /**
     * A {@link SettingsBackendClass.Builder} object constructs a {@link SettingsBackendClass} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link SettingsBackendClass.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final SettingsBackendClass struct;
        
        private Builder() {
            struct = SettingsBackendClass.allocate();
        }
        
        /**
         * Finish building the {@link SettingsBackendClass} struct.
         * @return A new instance of {@code SettingsBackendClass} with the fields 
         *         that were set in the Builder object.
         */
        public SettingsBackendClass build() {
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
        
        public Builder setRead(ReadCallback read) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("read"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (read == null ? MemoryAddress.NULL : read.toCallback()));
                return this;
            }
        }
        
        public Builder setGetWritable(GetWritableCallback getWritable) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("get_writable"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getWritable == null ? MemoryAddress.NULL : getWritable.toCallback()));
                return this;
            }
        }
        
        public Builder setWrite(WriteCallback write) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("write"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (write == null ? MemoryAddress.NULL : write.toCallback()));
                return this;
            }
        }
        
        public Builder setWriteTree(WriteTreeCallback writeTree) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("write_tree"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (writeTree == null ? MemoryAddress.NULL : writeTree.toCallback()));
                return this;
            }
        }
        
        public Builder setReset(ResetCallback reset) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("reset"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (reset == null ? MemoryAddress.NULL : reset.toCallback()));
                return this;
            }
        }
        
        public Builder setSubscribe(SubscribeCallback subscribe) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("subscribe"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (subscribe == null ? MemoryAddress.NULL : subscribe.toCallback()));
                return this;
            }
        }
        
        public Builder setUnsubscribe(UnsubscribeCallback unsubscribe) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("unsubscribe"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (unsubscribe == null ? MemoryAddress.NULL : unsubscribe.toCallback()));
                return this;
            }
        }
        
        public Builder setSync(SyncCallback sync) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("sync"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (sync == null ? MemoryAddress.NULL : sync.toCallback()));
                return this;
            }
        }
        
        public Builder setGetPermission(GetPermissionCallback getPermission) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("get_permission"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getPermission == null ? MemoryAddress.NULL : getPermission.toCallback()));
                return this;
            }
        }
        
        public Builder setReadUserValue(ReadUserValueCallback readUserValue) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("read_user_value"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (readUserValue == null ? MemoryAddress.NULL : readUserValue.toCallback()));
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
