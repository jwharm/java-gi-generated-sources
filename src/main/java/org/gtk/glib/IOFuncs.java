package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A table of functions used to handle different types of {@link IOChannel}
 * in a generic way.
 */
public class IOFuncs extends Struct {
    
    static {
        GLib.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GIOFuncs";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            Interop.valueLayout.ADDRESS.withName("io_read"),
            Interop.valueLayout.ADDRESS.withName("io_write"),
            Interop.valueLayout.ADDRESS.withName("io_seek"),
            Interop.valueLayout.ADDRESS.withName("io_close"),
            Interop.valueLayout.ADDRESS.withName("io_create_watch"),
            Interop.valueLayout.ADDRESS.withName("io_free"),
            Interop.valueLayout.ADDRESS.withName("io_set_flags"),
            Interop.valueLayout.ADDRESS.withName("io_get_flags")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link IOFuncs}
     * @return A new, uninitialized @{link IOFuncs}
     */
    public static IOFuncs allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        IOFuncs newInstance = new IOFuncs(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Functional interface declaration of the {@code IoReadCallback} callback.
     */
    @FunctionalInterface
    public interface IoReadCallback {
    
        org.gtk.glib.IOStatus run(org.gtk.glib.IOChannel channel, java.lang.String buf, long count, PointerLong bytesRead);
        
        @ApiStatus.Internal default int upcall(MemoryAddress channel, MemoryAddress buf, long count, MemoryAddress bytesRead) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                var RESULT = run(org.gtk.glib.IOChannel.fromAddress.marshal(channel, null), Marshal.addressToString.marshal(buf, null), count, new PointerLong(bytesRead));
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
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), IoReadCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code io_read}
     * @param ioRead The new value of the field {@code io_read}
     */
    public void setIoRead(IoReadCallback ioRead) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("io_read"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (ioRead == null ? MemoryAddress.NULL : ioRead.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code IoWriteCallback} callback.
     */
    @FunctionalInterface
    public interface IoWriteCallback {
    
        org.gtk.glib.IOStatus run(org.gtk.glib.IOChannel channel, java.lang.String buf, long count, PointerLong bytesWritten);
        
        @ApiStatus.Internal default int upcall(MemoryAddress channel, MemoryAddress buf, long count, MemoryAddress bytesWritten) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                var RESULT = run(org.gtk.glib.IOChannel.fromAddress.marshal(channel, null), Marshal.addressToString.marshal(buf, null), count, new PointerLong(bytesWritten));
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
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), IoWriteCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code io_write}
     * @param ioWrite The new value of the field {@code io_write}
     */
    public void setIoWrite(IoWriteCallback ioWrite) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("io_write"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (ioWrite == null ? MemoryAddress.NULL : ioWrite.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code IoSeekCallback} callback.
     */
    @FunctionalInterface
    public interface IoSeekCallback {
    
        org.gtk.glib.IOStatus run(org.gtk.glib.IOChannel channel, long offset, org.gtk.glib.SeekType type);
        
        @ApiStatus.Internal default int upcall(MemoryAddress channel, long offset, int type) {
            var RESULT = run(org.gtk.glib.IOChannel.fromAddress.marshal(channel, null), offset, org.gtk.glib.SeekType.of(type));
            return RESULT.getValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.C_INT);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), IoSeekCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code io_seek}
     * @param ioSeek The new value of the field {@code io_seek}
     */
    public void setIoSeek(IoSeekCallback ioSeek) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("io_seek"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (ioSeek == null ? MemoryAddress.NULL : ioSeek.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code IoCloseCallback} callback.
     */
    @FunctionalInterface
    public interface IoCloseCallback {
    
        org.gtk.glib.IOStatus run(org.gtk.glib.IOChannel channel);
        
        @ApiStatus.Internal default int upcall(MemoryAddress channel) {
            var RESULT = run(org.gtk.glib.IOChannel.fromAddress.marshal(channel, null));
            return RESULT.getValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), IoCloseCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code io_close}
     * @param ioClose The new value of the field {@code io_close}
     */
    public void setIoClose(IoCloseCallback ioClose) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("io_close"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (ioClose == null ? MemoryAddress.NULL : ioClose.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code IoCreateWatchCallback} callback.
     */
    @FunctionalInterface
    public interface IoCreateWatchCallback {
    
        org.gtk.glib.Source run(org.gtk.glib.IOChannel channel, org.gtk.glib.IOCondition condition);
        
        @ApiStatus.Internal default Addressable upcall(MemoryAddress channel, int condition) {
            var RESULT = run(org.gtk.glib.IOChannel.fromAddress.marshal(channel, null), new org.gtk.glib.IOCondition(condition));
            RESULT.yieldOwnership();
            return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), IoCreateWatchCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code io_create_watch}
     * @param ioCreateWatch The new value of the field {@code io_create_watch}
     */
    public void setIoCreateWatch(IoCreateWatchCallback ioCreateWatch) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("io_create_watch"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (ioCreateWatch == null ? MemoryAddress.NULL : ioCreateWatch.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code IoFreeCallback} callback.
     */
    @FunctionalInterface
    public interface IoFreeCallback {
    
        void run(org.gtk.glib.IOChannel channel);
        
        @ApiStatus.Internal default void upcall(MemoryAddress channel) {
            run(org.gtk.glib.IOChannel.fromAddress.marshal(channel, null));
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), IoFreeCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code io_free}
     * @param ioFree The new value of the field {@code io_free}
     */
    public void setIoFree(IoFreeCallback ioFree) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("io_free"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (ioFree == null ? MemoryAddress.NULL : ioFree.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code IoSetFlagsCallback} callback.
     */
    @FunctionalInterface
    public interface IoSetFlagsCallback {
    
        org.gtk.glib.IOStatus run(org.gtk.glib.IOChannel channel, org.gtk.glib.IOFlags flags);
        
        @ApiStatus.Internal default int upcall(MemoryAddress channel, int flags) {
            var RESULT = run(org.gtk.glib.IOChannel.fromAddress.marshal(channel, null), new org.gtk.glib.IOFlags(flags));
            return RESULT.getValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), IoSetFlagsCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code io_set_flags}
     * @param ioSetFlags The new value of the field {@code io_set_flags}
     */
    public void setIoSetFlags(IoSetFlagsCallback ioSetFlags) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("io_set_flags"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (ioSetFlags == null ? MemoryAddress.NULL : ioSetFlags.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code IoGetFlagsCallback} callback.
     */
    @FunctionalInterface
    public interface IoGetFlagsCallback {
    
        org.gtk.glib.IOFlags run(org.gtk.glib.IOChannel channel);
        
        @ApiStatus.Internal default int upcall(MemoryAddress channel) {
            var RESULT = run(org.gtk.glib.IOChannel.fromAddress.marshal(channel, null));
            return RESULT.getValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), IoGetFlagsCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code io_get_flags}
     * @param ioGetFlags The new value of the field {@code io_get_flags}
     */
    public void setIoGetFlags(IoGetFlagsCallback ioGetFlags) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("io_get_flags"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (ioGetFlags == null ? MemoryAddress.NULL : ioGetFlags.toCallback()));
        }
    }
    
    /**
     * Create a IOFuncs proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected IOFuncs(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, IOFuncs> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new IOFuncs(input);
    
    /**
     * A {@link IOFuncs.Builder} object constructs a {@link IOFuncs} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link IOFuncs.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final IOFuncs struct;
        
        private Builder() {
            struct = IOFuncs.allocate();
        }
        
        /**
         * Finish building the {@link IOFuncs} struct.
         * @return A new instance of {@code IOFuncs} with the fields 
         *         that were set in the Builder object.
         */
        public IOFuncs build() {
            return struct;
        }
        
        public Builder setIoRead(IoReadCallback ioRead) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("io_read"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (ioRead == null ? MemoryAddress.NULL : ioRead.toCallback()));
                return this;
            }
        }
        
        public Builder setIoWrite(IoWriteCallback ioWrite) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("io_write"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (ioWrite == null ? MemoryAddress.NULL : ioWrite.toCallback()));
                return this;
            }
        }
        
        public Builder setIoSeek(IoSeekCallback ioSeek) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("io_seek"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (ioSeek == null ? MemoryAddress.NULL : ioSeek.toCallback()));
                return this;
            }
        }
        
        public Builder setIoClose(IoCloseCallback ioClose) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("io_close"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (ioClose == null ? MemoryAddress.NULL : ioClose.toCallback()));
                return this;
            }
        }
        
        public Builder setIoCreateWatch(IoCreateWatchCallback ioCreateWatch) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("io_create_watch"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (ioCreateWatch == null ? MemoryAddress.NULL : ioCreateWatch.toCallback()));
                return this;
            }
        }
        
        public Builder setIoFree(IoFreeCallback ioFree) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("io_free"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (ioFree == null ? MemoryAddress.NULL : ioFree.toCallback()));
                return this;
            }
        }
        
        public Builder setIoSetFlags(IoSetFlagsCallback ioSetFlags) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("io_set_flags"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (ioSetFlags == null ? MemoryAddress.NULL : ioSetFlags.toCallback()));
                return this;
            }
        }
        
        public Builder setIoGetFlags(IoGetFlagsCallback ioGetFlags) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("io_get_flags"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (ioGetFlags == null ? MemoryAddress.NULL : ioGetFlags.toCallback()));
                return this;
            }
        }
    }
}
