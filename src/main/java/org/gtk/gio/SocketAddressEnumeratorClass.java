package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Class structure for {@link SocketAddressEnumerator}.
 */
public class SocketAddressEnumeratorClass extends Struct {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GSocketAddressEnumeratorClass";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gtk.gobject.ObjectClass.getMemoryLayout().withName("parent_class"),
            Interop.valueLayout.ADDRESS.withName("next"),
            Interop.valueLayout.ADDRESS.withName("next_async"),
            Interop.valueLayout.ADDRESS.withName("next_finish")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link SocketAddressEnumeratorClass}
     * @return A new, uninitialized @{link SocketAddressEnumeratorClass}
     */
    public static SocketAddressEnumeratorClass allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        SocketAddressEnumeratorClass newInstance = new SocketAddressEnumeratorClass(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Functional interface declaration of the {@code NextCallback} callback.
     */
    @FunctionalInterface
    public interface NextCallback {
    
        @Nullable org.gtk.gio.SocketAddress run(org.gtk.gio.SocketAddressEnumerator enumerator, @Nullable org.gtk.gio.Cancellable cancellable);
        
        @ApiStatus.Internal default Addressable upcall(MemoryAddress enumerator, MemoryAddress cancellable) {
            var RESULT = run((org.gtk.gio.SocketAddressEnumerator) Interop.register(enumerator, org.gtk.gio.SocketAddressEnumerator.fromAddress).marshal(enumerator, null), (org.gtk.gio.Cancellable) Interop.register(cancellable, org.gtk.gio.Cancellable.fromAddress).marshal(cancellable, null));
            RESULT.yieldOwnership();
            return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), NextCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code next}
     * @param next The new value of the field {@code next}
     */
    public void setNext(NextCallback next) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("next"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (next == null ? MemoryAddress.NULL : next.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code NextAsyncCallback} callback.
     */
    @FunctionalInterface
    public interface NextAsyncCallback {
    
        void run(org.gtk.gio.SocketAddressEnumerator enumerator, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.AsyncReadyCallback callback);
        
        @ApiStatus.Internal default void upcall(MemoryAddress enumerator, MemoryAddress cancellable, MemoryAddress callback, MemoryAddress userData) {
            run((org.gtk.gio.SocketAddressEnumerator) Interop.register(enumerator, org.gtk.gio.SocketAddressEnumerator.fromAddress).marshal(enumerator, null), (org.gtk.gio.Cancellable) Interop.register(cancellable, org.gtk.gio.Cancellable.fromAddress).marshal(cancellable, null), null /* Unsupported parameter type */);
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), NextAsyncCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code next_async}
     * @param nextAsync The new value of the field {@code next_async}
     */
    public void setNextAsync(NextAsyncCallback nextAsync) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("next_async"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (nextAsync == null ? MemoryAddress.NULL : nextAsync.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code NextFinishCallback} callback.
     */
    @FunctionalInterface
    public interface NextFinishCallback {
    
        @Nullable org.gtk.gio.SocketAddress run(org.gtk.gio.SocketAddressEnumerator enumerator, org.gtk.gio.AsyncResult result);
        
        @ApiStatus.Internal default Addressable upcall(MemoryAddress enumerator, MemoryAddress result) {
            var RESULT = run((org.gtk.gio.SocketAddressEnumerator) Interop.register(enumerator, org.gtk.gio.SocketAddressEnumerator.fromAddress).marshal(enumerator, null), (org.gtk.gio.AsyncResult) Interop.register(result, org.gtk.gio.AsyncResult.fromAddress).marshal(result, null));
            RESULT.yieldOwnership();
            return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), NextFinishCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code next_finish}
     * @param nextFinish The new value of the field {@code next_finish}
     */
    public void setNextFinish(NextFinishCallback nextFinish) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("next_finish"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (nextFinish == null ? MemoryAddress.NULL : nextFinish.toCallback()));
        }
    }
    
    /**
     * Create a SocketAddressEnumeratorClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected SocketAddressEnumeratorClass(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, SocketAddressEnumeratorClass> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new SocketAddressEnumeratorClass(input);
    
    /**
     * A {@link SocketAddressEnumeratorClass.Builder} object constructs a {@link SocketAddressEnumeratorClass} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link SocketAddressEnumeratorClass.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final SocketAddressEnumeratorClass struct;
        
        private Builder() {
            struct = SocketAddressEnumeratorClass.allocate();
        }
        
        /**
         * Finish building the {@link SocketAddressEnumeratorClass} struct.
         * @return A new instance of {@code SocketAddressEnumeratorClass} with the fields 
         *         that were set in the Builder object.
         */
        public SocketAddressEnumeratorClass build() {
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
        
        public Builder setNext(NextCallback next) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("next"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (next == null ? MemoryAddress.NULL : next.toCallback()));
                return this;
            }
        }
        
        public Builder setNextAsync(NextAsyncCallback nextAsync) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("next_async"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (nextAsync == null ? MemoryAddress.NULL : nextAsync.toCallback()));
                return this;
            }
        }
        
        public Builder setNextFinish(NextFinishCallback nextFinish) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("next_finish"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (nextFinish == null ? MemoryAddress.NULL : nextFinish.toCallback()));
                return this;
            }
        }
    }
}
