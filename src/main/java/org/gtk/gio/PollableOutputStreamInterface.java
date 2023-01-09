package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The interface for pollable output streams.
 * <p>
 * The default implementation of {@code can_poll} always returns {@code true}.
 * <p>
 * The default implementation of {@code write_nonblocking} calls
 * g_pollable_output_stream_is_writable(), and then calls
 * g_output_stream_write() if it returns {@code true}. This means you only
 * need to override it if it is possible that your {@code is_writable}
 * implementation may return {@code true} when the stream is not actually
 * writable.
 * <p>
 * The default implementation of {@code writev_nonblocking} calls
 * g_pollable_output_stream_write_nonblocking() for each vector, and converts
 * its return value and error (if set) to a {@link PollableReturn}. You should
 * override this where possible to avoid having to allocate a {@link org.gtk.glib.Error} to return
 * {@link IOErrorEnum#WOULD_BLOCK}.
 * @version 2.28
 */
public class PollableOutputStreamInterface extends Struct {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GPollableOutputStreamInterface";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gtk.gobject.TypeInterface.getMemoryLayout().withName("g_iface"),
            Interop.valueLayout.ADDRESS.withName("can_poll"),
            Interop.valueLayout.ADDRESS.withName("is_writable"),
            Interop.valueLayout.ADDRESS.withName("create_source"),
            Interop.valueLayout.ADDRESS.withName("write_nonblocking"),
            Interop.valueLayout.ADDRESS.withName("writev_nonblocking")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link PollableOutputStreamInterface}
     * @return A new, uninitialized @{link PollableOutputStreamInterface}
     */
    public static PollableOutputStreamInterface allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        PollableOutputStreamInterface newInstance = new PollableOutputStreamInterface(segment.address());
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
     * Functional interface declaration of the {@code CanPollCallback} callback.
     */
    @FunctionalInterface
    public interface CanPollCallback {
    
        boolean run(org.gtk.gio.PollableOutputStream stream);
        
        @ApiStatus.Internal default int upcall(MemoryAddress stream) {
            var RESULT = run((org.gtk.gio.PollableOutputStream) Interop.register(stream, org.gtk.gio.PollableOutputStream.fromAddress).marshal(stream, null));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), CanPollCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code can_poll}
     * @param canPoll The new value of the field {@code can_poll}
     */
    public void setCanPoll(CanPollCallback canPoll) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("can_poll"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (canPoll == null ? MemoryAddress.NULL : canPoll.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code IsWritableCallback} callback.
     */
    @FunctionalInterface
    public interface IsWritableCallback {
    
        boolean run(org.gtk.gio.PollableOutputStream stream);
        
        @ApiStatus.Internal default int upcall(MemoryAddress stream) {
            var RESULT = run((org.gtk.gio.PollableOutputStream) Interop.register(stream, org.gtk.gio.PollableOutputStream.fromAddress).marshal(stream, null));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), IsWritableCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code is_writable}
     * @param isWritable The new value of the field {@code is_writable}
     */
    public void setIsWritable(IsWritableCallback isWritable) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("is_writable"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (isWritable == null ? MemoryAddress.NULL : isWritable.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code CreateSourceCallback} callback.
     */
    @FunctionalInterface
    public interface CreateSourceCallback {
    
        org.gtk.glib.Source run(org.gtk.gio.PollableOutputStream stream, @Nullable org.gtk.gio.Cancellable cancellable);
        
        @ApiStatus.Internal default Addressable upcall(MemoryAddress stream, MemoryAddress cancellable) {
            var RESULT = run((org.gtk.gio.PollableOutputStream) Interop.register(stream, org.gtk.gio.PollableOutputStream.fromAddress).marshal(stream, null), (org.gtk.gio.Cancellable) Interop.register(cancellable, org.gtk.gio.Cancellable.fromAddress).marshal(cancellable, null));
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
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), CreateSourceCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code create_source}
     * @param createSource The new value of the field {@code create_source}
     */
    public void setCreateSource(CreateSourceCallback createSource) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("create_source"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (createSource == null ? MemoryAddress.NULL : createSource.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code WriteNonblockingCallback} callback.
     */
    @FunctionalInterface
    public interface WriteNonblockingCallback {
    
        long run(org.gtk.gio.PollableOutputStream stream, byte[] buffer, long count);
        
        @ApiStatus.Internal default long upcall(MemoryAddress stream, MemoryAddress buffer, long count) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                var RESULT = run((org.gtk.gio.PollableOutputStream) Interop.register(stream, org.gtk.gio.PollableOutputStream.fromAddress).marshal(stream, null), MemorySegment.ofAddress(buffer, count, SCOPE).toArray(Interop.valueLayout.C_BYTE), count);
                return RESULT;
            }
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), WriteNonblockingCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code write_nonblocking}
     * @param writeNonblocking The new value of the field {@code write_nonblocking}
     */
    public void setWriteNonblocking(WriteNonblockingCallback writeNonblocking) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("write_nonblocking"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (writeNonblocking == null ? MemoryAddress.NULL : writeNonblocking.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code WritevNonblockingCallback} callback.
     */
    @FunctionalInterface
    public interface WritevNonblockingCallback {
    
        org.gtk.gio.PollableReturn run(org.gtk.gio.PollableOutputStream stream, org.gtk.gio.OutputVector[] vectors, long nVectors, Out<Long> bytesWritten);
        
        @ApiStatus.Internal default int upcall(MemoryAddress stream, MemoryAddress vectors, long nVectors, MemoryAddress bytesWritten) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                Out<Long> bytesWrittenOUT = new Out<>(bytesWritten.get(Interop.valueLayout.C_LONG, 0));
                var RESULT = run((org.gtk.gio.PollableOutputStream) Interop.register(stream, org.gtk.gio.PollableOutputStream.fromAddress).marshal(stream, null), new PointerProxy<org.gtk.gio.OutputVector>(vectors, org.gtk.gio.OutputVector.fromAddress).toArray((int) nVectors, org.gtk.gio.OutputVector.class), nVectors, bytesWrittenOUT);
                bytesWritten.set(Interop.valueLayout.C_LONG, 0, bytesWrittenOUT.get());
                return RESULT.getValue();
            }
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), WritevNonblockingCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code writev_nonblocking}
     * @param writevNonblocking The new value of the field {@code writev_nonblocking}
     */
    public void setWritevNonblocking(WritevNonblockingCallback writevNonblocking) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("writev_nonblocking"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (writevNonblocking == null ? MemoryAddress.NULL : writevNonblocking.toCallback()));
        }
    }
    
    /**
     * Create a PollableOutputStreamInterface proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected PollableOutputStreamInterface(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, PollableOutputStreamInterface> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new PollableOutputStreamInterface(input);
    
    /**
     * A {@link PollableOutputStreamInterface.Builder} object constructs a {@link PollableOutputStreamInterface} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link PollableOutputStreamInterface.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final PollableOutputStreamInterface struct;
        
        private Builder() {
            struct = PollableOutputStreamInterface.allocate();
        }
        
        /**
         * Finish building the {@link PollableOutputStreamInterface} struct.
         * @return A new instance of {@code PollableOutputStreamInterface} with the fields 
         *         that were set in the Builder object.
         */
        public PollableOutputStreamInterface build() {
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
        
        public Builder setCanPoll(CanPollCallback canPoll) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("can_poll"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (canPoll == null ? MemoryAddress.NULL : canPoll.toCallback()));
                return this;
            }
        }
        
        public Builder setIsWritable(IsWritableCallback isWritable) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("is_writable"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (isWritable == null ? MemoryAddress.NULL : isWritable.toCallback()));
                return this;
            }
        }
        
        public Builder setCreateSource(CreateSourceCallback createSource) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("create_source"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (createSource == null ? MemoryAddress.NULL : createSource.toCallback()));
                return this;
            }
        }
        
        public Builder setWriteNonblocking(WriteNonblockingCallback writeNonblocking) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("write_nonblocking"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (writeNonblocking == null ? MemoryAddress.NULL : writeNonblocking.toCallback()));
                return this;
            }
        }
        
        public Builder setWritevNonblocking(WritevNonblockingCallback writevNonblocking) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("writev_nonblocking"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (writevNonblocking == null ? MemoryAddress.NULL : writevNonblocking.toCallback()));
                return this;
            }
        }
    }
}
