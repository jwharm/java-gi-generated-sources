package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The interface for pollable input streams.
 * <p>
 * The default implementation of {@code can_poll} always returns {@code true}.
 * <p>
 * The default implementation of {@code read_nonblocking} calls
 * g_pollable_input_stream_is_readable(), and then calls
 * g_input_stream_read() if it returns {@code true}. This means you only need
 * to override it if it is possible that your {@code is_readable}
 * implementation may return {@code true} when the stream is not actually
 * readable.
 * @version 2.28
 */
public class PollableInputStreamInterface extends Struct {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GPollableInputStreamInterface";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gtk.gobject.TypeInterface.getMemoryLayout().withName("g_iface"),
            Interop.valueLayout.ADDRESS.withName("can_poll"),
            Interop.valueLayout.ADDRESS.withName("is_readable"),
            Interop.valueLayout.ADDRESS.withName("create_source"),
            Interop.valueLayout.ADDRESS.withName("read_nonblocking")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link PollableInputStreamInterface}
     * @return A new, uninitialized @{link PollableInputStreamInterface}
     */
    public static PollableInputStreamInterface allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        PollableInputStreamInterface newInstance = new PollableInputStreamInterface(segment.address());
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
    
        boolean run(org.gtk.gio.PollableInputStream stream);
        
        @ApiStatus.Internal default int upcall(MemoryAddress stream) {
            var RESULT = run((org.gtk.gio.PollableInputStream) Interop.register(stream, org.gtk.gio.PollableInputStream.fromAddress).marshal(stream, null));
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
     * Functional interface declaration of the {@code IsReadableCallback} callback.
     */
    @FunctionalInterface
    public interface IsReadableCallback {
    
        boolean run(org.gtk.gio.PollableInputStream stream);
        
        @ApiStatus.Internal default int upcall(MemoryAddress stream) {
            var RESULT = run((org.gtk.gio.PollableInputStream) Interop.register(stream, org.gtk.gio.PollableInputStream.fromAddress).marshal(stream, null));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), IsReadableCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code is_readable}
     * @param isReadable The new value of the field {@code is_readable}
     */
    public void setIsReadable(IsReadableCallback isReadable) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("is_readable"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (isReadable == null ? MemoryAddress.NULL : isReadable.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code CreateSourceCallback} callback.
     */
    @FunctionalInterface
    public interface CreateSourceCallback {
    
        org.gtk.glib.Source run(org.gtk.gio.PollableInputStream stream, @Nullable org.gtk.gio.Cancellable cancellable);
        
        @ApiStatus.Internal default Addressable upcall(MemoryAddress stream, MemoryAddress cancellable) {
            var RESULT = run((org.gtk.gio.PollableInputStream) Interop.register(stream, org.gtk.gio.PollableInputStream.fromAddress).marshal(stream, null), (org.gtk.gio.Cancellable) Interop.register(cancellable, org.gtk.gio.Cancellable.fromAddress).marshal(cancellable, null));
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
     * Functional interface declaration of the {@code ReadNonblockingCallback} callback.
     */
    @FunctionalInterface
    public interface ReadNonblockingCallback {
    
        long run(org.gtk.gio.PollableInputStream stream, Out<byte[]> buffer, long count);
        
        @ApiStatus.Internal default long upcall(MemoryAddress stream, MemoryAddress buffer, long count) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                Out<byte[]> bufferOUT = new Out<>(MemorySegment.ofAddress(buffer, count, SCOPE).toArray(Interop.valueLayout.C_BYTE));
                var RESULT = run((org.gtk.gio.PollableInputStream) Interop.register(stream, org.gtk.gio.PollableInputStream.fromAddress).marshal(stream, null), bufferOUT, count);
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
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), ReadNonblockingCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code read_nonblocking}
     * @param readNonblocking The new value of the field {@code read_nonblocking}
     */
    public void setReadNonblocking(ReadNonblockingCallback readNonblocking) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("read_nonblocking"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (readNonblocking == null ? MemoryAddress.NULL : readNonblocking.toCallback()));
        }
    }
    
    /**
     * Create a PollableInputStreamInterface proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected PollableInputStreamInterface(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, PollableInputStreamInterface> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new PollableInputStreamInterface(input);
    
    /**
     * A {@link PollableInputStreamInterface.Builder} object constructs a {@link PollableInputStreamInterface} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link PollableInputStreamInterface.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final PollableInputStreamInterface struct;
        
        private Builder() {
            struct = PollableInputStreamInterface.allocate();
        }
        
        /**
         * Finish building the {@link PollableInputStreamInterface} struct.
         * @return A new instance of {@code PollableInputStreamInterface} with the fields 
         *         that were set in the Builder object.
         */
        public PollableInputStreamInterface build() {
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
        
        public Builder setIsReadable(IsReadableCallback isReadable) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("is_readable"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (isReadable == null ? MemoryAddress.NULL : isReadable.toCallback()));
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
        
        public Builder setReadNonblocking(ReadNonblockingCallback readNonblocking) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("read_nonblocking"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (readNonblocking == null ? MemoryAddress.NULL : readNonblocking.toCallback()));
                return this;
            }
        }
    }
}
