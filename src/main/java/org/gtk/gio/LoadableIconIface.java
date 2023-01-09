package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Interface for icons that can be loaded as a stream.
 */
public class LoadableIconIface extends Struct {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GLoadableIconIface";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gtk.gobject.TypeInterface.getMemoryLayout().withName("g_iface"),
            Interop.valueLayout.ADDRESS.withName("load"),
            Interop.valueLayout.ADDRESS.withName("load_async"),
            Interop.valueLayout.ADDRESS.withName("load_finish")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link LoadableIconIface}
     * @return A new, uninitialized @{link LoadableIconIface}
     */
    public static LoadableIconIface allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        LoadableIconIface newInstance = new LoadableIconIface(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code g_iface}
     * @return The value of the field {@code g_iface}
     */
    public org.gtk.gobject.TypeInterface getGIface() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("g_iface"));
        return org.gtk.gobject.TypeInterface.fromAddress.marshal(((MemoryAddress) handle()).addOffset(OFFSET), null);
    }
    
    /**
     * Change the value of the field {@code g_iface}
     * @param gIface The new value of the field {@code g_iface}
     */
    public void setGIface(org.gtk.gobject.TypeInterface gIface) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("g_iface"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (gIface == null ? MemoryAddress.NULL : gIface.handle()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code LoadCallback} callback.
     */
    @FunctionalInterface
    public interface LoadCallback {
    
        org.gtk.gio.InputStream run(org.gtk.gio.LoadableIcon icon, int size, @Nullable Out<java.lang.String> type, @Nullable org.gtk.gio.Cancellable cancellable);
        
        @ApiStatus.Internal default Addressable upcall(MemoryAddress icon, int size, MemoryAddress type, MemoryAddress cancellable) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                Out<java.lang.String> typeOUT = new Out<>(Marshal.addressToString.marshal(type, null));
                var RESULT = run((org.gtk.gio.LoadableIcon) Interop.register(icon, org.gtk.gio.LoadableIcon.fromAddress).marshal(icon, null), size, typeOUT, (org.gtk.gio.Cancellable) Interop.register(cancellable, org.gtk.gio.Cancellable.fromAddress).marshal(cancellable, null));
                type.set(Interop.valueLayout.ADDRESS, 0, Marshal.stringToAddress.marshal(typeOUT.get(), SCOPE));
                RESULT.yieldOwnership();
                return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
            }
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), LoadCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code load}
     * @param load The new value of the field {@code load}
     */
    public void setLoad(LoadCallback load) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("load"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (load == null ? MemoryAddress.NULL : load.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code LoadAsyncCallback} callback.
     */
    @FunctionalInterface
    public interface LoadAsyncCallback {
    
        void run(org.gtk.gio.LoadableIcon icon, int size, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.AsyncReadyCallback callback);
        
        @ApiStatus.Internal default void upcall(MemoryAddress icon, int size, MemoryAddress cancellable, MemoryAddress callback, MemoryAddress userData) {
            run((org.gtk.gio.LoadableIcon) Interop.register(icon, org.gtk.gio.LoadableIcon.fromAddress).marshal(icon, null), size, (org.gtk.gio.Cancellable) Interop.register(cancellable, org.gtk.gio.Cancellable.fromAddress).marshal(cancellable, null), null /* Unsupported parameter type */);
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), LoadAsyncCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code load_async}
     * @param loadAsync The new value of the field {@code load_async}
     */
    public void setLoadAsync(LoadAsyncCallback loadAsync) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("load_async"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (loadAsync == null ? MemoryAddress.NULL : loadAsync.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code LoadFinishCallback} callback.
     */
    @FunctionalInterface
    public interface LoadFinishCallback {
    
        org.gtk.gio.InputStream run(org.gtk.gio.LoadableIcon icon, org.gtk.gio.AsyncResult res, @Nullable Out<java.lang.String> type);
        
        @ApiStatus.Internal default Addressable upcall(MemoryAddress icon, MemoryAddress res, MemoryAddress type) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                Out<java.lang.String> typeOUT = new Out<>(Marshal.addressToString.marshal(type, null));
                var RESULT = run((org.gtk.gio.LoadableIcon) Interop.register(icon, org.gtk.gio.LoadableIcon.fromAddress).marshal(icon, null), (org.gtk.gio.AsyncResult) Interop.register(res, org.gtk.gio.AsyncResult.fromAddress).marshal(res, null), typeOUT);
                type.set(Interop.valueLayout.ADDRESS, 0, Marshal.stringToAddress.marshal(typeOUT.get(), SCOPE));
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
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), LoadFinishCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code load_finish}
     * @param loadFinish The new value of the field {@code load_finish}
     */
    public void setLoadFinish(LoadFinishCallback loadFinish) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("load_finish"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (loadFinish == null ? MemoryAddress.NULL : loadFinish.toCallback()));
        }
    }
    
    /**
     * Create a LoadableIconIface proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected LoadableIconIface(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, LoadableIconIface> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new LoadableIconIface(input);
    
    /**
     * A {@link LoadableIconIface.Builder} object constructs a {@link LoadableIconIface} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link LoadableIconIface.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final LoadableIconIface struct;
        
        private Builder() {
            struct = LoadableIconIface.allocate();
        }
        
        /**
         * Finish building the {@link LoadableIconIface} struct.
         * @return A new instance of {@code LoadableIconIface} with the fields 
         *         that were set in the Builder object.
         */
        public LoadableIconIface build() {
            return struct;
        }
        
        /**
         * The parent interface.
         * @param gIface The value for the {@code gIface} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setGIface(org.gtk.gobject.TypeInterface gIface) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("g_iface"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (gIface == null ? MemoryAddress.NULL : gIface.handle()));
                return this;
            }
        }
        
        public Builder setLoad(LoadCallback load) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("load"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (load == null ? MemoryAddress.NULL : load.toCallback()));
                return this;
            }
        }
        
        public Builder setLoadAsync(LoadAsyncCallback loadAsync) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("load_async"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (loadAsync == null ? MemoryAddress.NULL : loadAsync.toCallback()));
                return this;
            }
        }
        
        public Builder setLoadFinish(LoadFinishCallback loadFinish) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("load_finish"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (loadFinish == null ? MemoryAddress.NULL : loadFinish.toCallback()));
                return this;
            }
        }
    }
}
