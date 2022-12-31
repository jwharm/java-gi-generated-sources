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
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        SocketAddressEnumeratorClass newInstance = new SocketAddressEnumeratorClass(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    @FunctionalInterface
    public interface NextCallback {
        @Nullable org.gtk.gio.SocketAddress run(org.gtk.gio.SocketAddressEnumerator enumerator, @Nullable org.gtk.gio.Cancellable cancellable);

        @ApiStatus.Internal default Addressable upcall(MemoryAddress enumerator, MemoryAddress cancellable) {
            var RESULT = run((org.gtk.gio.SocketAddressEnumerator) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(enumerator)), org.gtk.gio.SocketAddressEnumerator.fromAddress).marshal(enumerator, Ownership.NONE), (org.gtk.gio.Cancellable) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(cancellable)), org.gtk.gio.Cancellable.fromAddress).marshal(cancellable, Ownership.NONE));
            return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(NextCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code next}
     * @param next The new value of the field {@code next}
     */
    public void setNext(NextCallback next) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("next"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (next == null ? MemoryAddress.NULL : next.toCallback()));
    }
    
    @FunctionalInterface
    public interface NextAsyncCallback {
        void run(org.gtk.gio.SocketAddressEnumerator enumerator, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.AsyncReadyCallback callback);

        @ApiStatus.Internal default void upcall(MemoryAddress enumerator, MemoryAddress cancellable, MemoryAddress callback, MemoryAddress userData) {
            run((org.gtk.gio.SocketAddressEnumerator) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(enumerator)), org.gtk.gio.SocketAddressEnumerator.fromAddress).marshal(enumerator, Ownership.NONE), (org.gtk.gio.Cancellable) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(cancellable)), org.gtk.gio.Cancellable.fromAddress).marshal(cancellable, Ownership.NONE), null /* Unsupported parameter type */);
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(NextAsyncCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code next_async}
     * @param nextAsync The new value of the field {@code next_async}
     */
    public void setNextAsync(NextAsyncCallback nextAsync) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("next_async"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (nextAsync == null ? MemoryAddress.NULL : nextAsync.toCallback()));
    }
    
    @FunctionalInterface
    public interface NextFinishCallback {
        @Nullable org.gtk.gio.SocketAddress run(org.gtk.gio.SocketAddressEnumerator enumerator, org.gtk.gio.AsyncResult result);

        @ApiStatus.Internal default Addressable upcall(MemoryAddress enumerator, MemoryAddress result) {
            var RESULT = run((org.gtk.gio.SocketAddressEnumerator) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(enumerator)), org.gtk.gio.SocketAddressEnumerator.fromAddress).marshal(enumerator, Ownership.NONE), (org.gtk.gio.AsyncResult) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(result)), org.gtk.gio.AsyncResult.fromAddress).marshal(result, Ownership.NONE));
            return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(NextFinishCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code next_finish}
     * @param nextFinish The new value of the field {@code next_finish}
     */
    public void setNextFinish(NextFinishCallback nextFinish) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("next_finish"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (nextFinish == null ? MemoryAddress.NULL : nextFinish.toCallback()));
    }
    
    /**
     * Create a SocketAddressEnumeratorClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected SocketAddressEnumeratorClass(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, SocketAddressEnumeratorClass> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new SocketAddressEnumeratorClass(input, ownership);
    
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
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
            return this;
        }
        
        public Builder setNext(NextCallback next) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("next"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (next == null ? MemoryAddress.NULL : next.toCallback()));
            return this;
        }
        
        public Builder setNextAsync(NextAsyncCallback nextAsync) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("next_async"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (nextAsync == null ? MemoryAddress.NULL : nextAsync.toCallback()));
            return this;
        }
        
        public Builder setNextFinish(NextFinishCallback nextFinish) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("next_finish"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (nextFinish == null ? MemoryAddress.NULL : nextFinish.toCallback()));
            return this;
        }
    }
}
