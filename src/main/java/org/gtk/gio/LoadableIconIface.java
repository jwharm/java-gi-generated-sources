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
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        LoadableIconIface newInstance = new LoadableIconIface(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code g_iface}
     * @return The value of the field {@code g_iface}
     */
    public org.gtk.gobject.TypeInterface getGIface() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("g_iface"));
        return org.gtk.gobject.TypeInterface.fromAddress.marshal(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Change the value of the field {@code g_iface}
     * @param gIface The new value of the field {@code g_iface}
     */
    public void setGIface(org.gtk.gobject.TypeInterface gIface) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("g_iface"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (gIface == null ? MemoryAddress.NULL : gIface.handle()));
    }
    
    @FunctionalInterface
    public interface LoadCallback {
        org.gtk.gio.InputStream run(org.gtk.gio.LoadableIcon icon, int size, @Nullable Out<java.lang.String> type, @Nullable org.gtk.gio.Cancellable cancellable);

        @ApiStatus.Internal default Addressable upcall(MemoryAddress icon, int size, MemoryAddress type, MemoryAddress cancellable) {
            Out<java.lang.String> typeOUT = new Out<>(Marshal.addressToString.marshal(type, null));
            var RESULT = run((org.gtk.gio.LoadableIcon) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(icon)), org.gtk.gio.LoadableIcon.fromAddress).marshal(icon, Ownership.NONE), size, typeOUT, (org.gtk.gio.Cancellable) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(cancellable)), org.gtk.gio.Cancellable.fromAddress).marshal(cancellable, Ownership.NONE));
            type.set(Interop.valueLayout.ADDRESS, 0, Marshal.stringToAddress.marshal(typeOUT.get(), null));
            return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(LoadCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code load}
     * @param load The new value of the field {@code load}
     */
    public void setLoad(LoadCallback load) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("load"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (load == null ? MemoryAddress.NULL : load.toCallback()));
    }
    
    @FunctionalInterface
    public interface LoadAsyncCallback {
        void run(org.gtk.gio.LoadableIcon icon, int size, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.AsyncReadyCallback callback);

        @ApiStatus.Internal default void upcall(MemoryAddress icon, int size, MemoryAddress cancellable, MemoryAddress callback, MemoryAddress userData) {
            run((org.gtk.gio.LoadableIcon) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(icon)), org.gtk.gio.LoadableIcon.fromAddress).marshal(icon, Ownership.NONE), size, (org.gtk.gio.Cancellable) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(cancellable)), org.gtk.gio.Cancellable.fromAddress).marshal(cancellable, Ownership.NONE), null /* Unsupported parameter type */);
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(LoadAsyncCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code load_async}
     * @param loadAsync The new value of the field {@code load_async}
     */
    public void setLoadAsync(LoadAsyncCallback loadAsync) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("load_async"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (loadAsync == null ? MemoryAddress.NULL : loadAsync.toCallback()));
    }
    
    @FunctionalInterface
    public interface LoadFinishCallback {
        org.gtk.gio.InputStream run(org.gtk.gio.LoadableIcon icon, org.gtk.gio.AsyncResult res, @Nullable Out<java.lang.String> type);

        @ApiStatus.Internal default Addressable upcall(MemoryAddress icon, MemoryAddress res, MemoryAddress type) {
            Out<java.lang.String> typeOUT = new Out<>(Marshal.addressToString.marshal(type, null));
            var RESULT = run((org.gtk.gio.LoadableIcon) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(icon)), org.gtk.gio.LoadableIcon.fromAddress).marshal(icon, Ownership.NONE), (org.gtk.gio.AsyncResult) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(res)), org.gtk.gio.AsyncResult.fromAddress).marshal(res, Ownership.NONE), typeOUT);
            type.set(Interop.valueLayout.ADDRESS, 0, Marshal.stringToAddress.marshal(typeOUT.get(), null));
            return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(LoadFinishCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code load_finish}
     * @param loadFinish The new value of the field {@code load_finish}
     */
    public void setLoadFinish(LoadFinishCallback loadFinish) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("load_finish"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (loadFinish == null ? MemoryAddress.NULL : loadFinish.toCallback()));
    }
    
    /**
     * Create a LoadableIconIface proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected LoadableIconIface(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, LoadableIconIface> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new LoadableIconIface(input, ownership);
    
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
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("g_iface"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (gIface == null ? MemoryAddress.NULL : gIface.handle()));
            return this;
        }
        
        public Builder setLoad(LoadCallback load) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("load"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (load == null ? MemoryAddress.NULL : load.toCallback()));
            return this;
        }
        
        public Builder setLoadAsync(LoadAsyncCallback loadAsync) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("load_async"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (loadAsync == null ? MemoryAddress.NULL : loadAsync.toCallback()));
            return this;
        }
        
        public Builder setLoadFinish(LoadFinishCallback loadFinish) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("load_finish"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (loadFinish == null ? MemoryAddress.NULL : loadFinish.toCallback()));
            return this;
        }
    }
}
