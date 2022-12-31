package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Provides an interface for asynchronous initializing object such that
 * initialization may fail.
 * @version 2.22
 */
public class AsyncInitableIface extends Struct {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GAsyncInitableIface";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gtk.gobject.TypeInterface.getMemoryLayout().withName("g_iface"),
            Interop.valueLayout.ADDRESS.withName("init_async"),
            Interop.valueLayout.ADDRESS.withName("init_finish")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link AsyncInitableIface}
     * @return A new, uninitialized @{link AsyncInitableIface}
     */
    public static AsyncInitableIface allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        AsyncInitableIface newInstance = new AsyncInitableIface(segment.address(), Ownership.NONE);
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
    public interface InitAsyncCallback {
        void run(org.gtk.gio.AsyncInitable initable, int ioPriority, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.AsyncReadyCallback callback);

        @ApiStatus.Internal default void upcall(MemoryAddress initable, int ioPriority, MemoryAddress cancellable, MemoryAddress callback, MemoryAddress userData) {
            run((org.gtk.gio.AsyncInitable) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(initable)), org.gtk.gio.AsyncInitable.fromAddress).marshal(initable, Ownership.NONE), ioPriority, (org.gtk.gio.Cancellable) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(cancellable)), org.gtk.gio.Cancellable.fromAddress).marshal(cancellable, Ownership.NONE), null /* Unsupported parameter type */);
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(InitAsyncCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code init_async}
     * @param initAsync The new value of the field {@code init_async}
     */
    public void setInitAsync(InitAsyncCallback initAsync) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("init_async"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (initAsync == null ? MemoryAddress.NULL : initAsync.toCallback()));
    }
    
    @FunctionalInterface
    public interface InitFinishCallback {
        boolean run(org.gtk.gio.AsyncInitable initable, org.gtk.gio.AsyncResult res);

        @ApiStatus.Internal default int upcall(MemoryAddress initable, MemoryAddress res) {
            var RESULT = run((org.gtk.gio.AsyncInitable) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(initable)), org.gtk.gio.AsyncInitable.fromAddress).marshal(initable, Ownership.NONE), (org.gtk.gio.AsyncResult) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(res)), org.gtk.gio.AsyncResult.fromAddress).marshal(res, Ownership.NONE));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(InitFinishCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code init_finish}
     * @param initFinish The new value of the field {@code init_finish}
     */
    public void setInitFinish(InitFinishCallback initFinish) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("init_finish"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (initFinish == null ? MemoryAddress.NULL : initFinish.toCallback()));
    }
    
    /**
     * Create a AsyncInitableIface proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected AsyncInitableIface(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, AsyncInitableIface> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new AsyncInitableIface(input, ownership);
    
    /**
     * A {@link AsyncInitableIface.Builder} object constructs a {@link AsyncInitableIface} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link AsyncInitableIface.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final AsyncInitableIface struct;
        
        private Builder() {
            struct = AsyncInitableIface.allocate();
        }
        
         /**
         * Finish building the {@link AsyncInitableIface} struct.
         * @return A new instance of {@code AsyncInitableIface} with the fields 
         *         that were set in the Builder object.
         */
        public AsyncInitableIface build() {
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
        
        public Builder setInitAsync(InitAsyncCallback initAsync) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("init_async"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (initAsync == null ? MemoryAddress.NULL : initAsync.toCallback()));
            return this;
        }
        
        public Builder setInitFinish(InitFinishCallback initFinish) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("init_finish"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (initFinish == null ? MemoryAddress.NULL : initFinish.toCallback()));
            return this;
        }
    }
}
