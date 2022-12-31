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
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        IOFuncs newInstance = new IOFuncs(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    @FunctionalInterface
    public interface IoReadCallback {
        org.gtk.glib.IOStatus run(org.gtk.glib.IOChannel channel, java.lang.String buf, long count, PointerLong bytesRead);

        @ApiStatus.Internal default int upcall(MemoryAddress channel, MemoryAddress buf, long count, MemoryAddress bytesRead) {
            var RESULT = run(org.gtk.glib.IOChannel.fromAddress.marshal(channel, Ownership.NONE), Marshal.addressToString.marshal(buf, null), count, new PointerLong(bytesRead));
            return RESULT.getValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(IoReadCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code io_read}
     * @param ioRead The new value of the field {@code io_read}
     */
    public void setIoRead(IoReadCallback ioRead) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("io_read"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (ioRead == null ? MemoryAddress.NULL : ioRead.toCallback()));
    }
    
    @FunctionalInterface
    public interface IoWriteCallback {
        org.gtk.glib.IOStatus run(org.gtk.glib.IOChannel channel, java.lang.String buf, long count, PointerLong bytesWritten);

        @ApiStatus.Internal default int upcall(MemoryAddress channel, MemoryAddress buf, long count, MemoryAddress bytesWritten) {
            var RESULT = run(org.gtk.glib.IOChannel.fromAddress.marshal(channel, Ownership.NONE), Marshal.addressToString.marshal(buf, null), count, new PointerLong(bytesWritten));
            return RESULT.getValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(IoWriteCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code io_write}
     * @param ioWrite The new value of the field {@code io_write}
     */
    public void setIoWrite(IoWriteCallback ioWrite) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("io_write"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (ioWrite == null ? MemoryAddress.NULL : ioWrite.toCallback()));
    }
    
    @FunctionalInterface
    public interface IoSeekCallback {
        org.gtk.glib.IOStatus run(org.gtk.glib.IOChannel channel, long offset, org.gtk.glib.SeekType type);

        @ApiStatus.Internal default int upcall(MemoryAddress channel, long offset, int type) {
            var RESULT = run(org.gtk.glib.IOChannel.fromAddress.marshal(channel, Ownership.NONE), offset, org.gtk.glib.SeekType.of(type));
            return RESULT.getValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.C_INT);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(IoSeekCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code io_seek}
     * @param ioSeek The new value of the field {@code io_seek}
     */
    public void setIoSeek(IoSeekCallback ioSeek) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("io_seek"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (ioSeek == null ? MemoryAddress.NULL : ioSeek.toCallback()));
    }
    
    @FunctionalInterface
    public interface IoCloseCallback {
        org.gtk.glib.IOStatus run(org.gtk.glib.IOChannel channel);

        @ApiStatus.Internal default int upcall(MemoryAddress channel) {
            var RESULT = run(org.gtk.glib.IOChannel.fromAddress.marshal(channel, Ownership.NONE));
            return RESULT.getValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(IoCloseCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code io_close}
     * @param ioClose The new value of the field {@code io_close}
     */
    public void setIoClose(IoCloseCallback ioClose) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("io_close"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (ioClose == null ? MemoryAddress.NULL : ioClose.toCallback()));
    }
    
    @FunctionalInterface
    public interface IoCreateWatchCallback {
        org.gtk.glib.Source run(org.gtk.glib.IOChannel channel, org.gtk.glib.IOCondition condition);

        @ApiStatus.Internal default Addressable upcall(MemoryAddress channel, int condition) {
            var RESULT = run(org.gtk.glib.IOChannel.fromAddress.marshal(channel, Ownership.NONE), new org.gtk.glib.IOCondition(condition));
            return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(IoCreateWatchCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code io_create_watch}
     * @param ioCreateWatch The new value of the field {@code io_create_watch}
     */
    public void setIoCreateWatch(IoCreateWatchCallback ioCreateWatch) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("io_create_watch"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (ioCreateWatch == null ? MemoryAddress.NULL : ioCreateWatch.toCallback()));
    }
    
    @FunctionalInterface
    public interface IoFreeCallback {
        void run(org.gtk.glib.IOChannel channel);

        @ApiStatus.Internal default void upcall(MemoryAddress channel) {
            run(org.gtk.glib.IOChannel.fromAddress.marshal(channel, Ownership.NONE));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(IoFreeCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code io_free}
     * @param ioFree The new value of the field {@code io_free}
     */
    public void setIoFree(IoFreeCallback ioFree) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("io_free"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (ioFree == null ? MemoryAddress.NULL : ioFree.toCallback()));
    }
    
    @FunctionalInterface
    public interface IoSetFlagsCallback {
        org.gtk.glib.IOStatus run(org.gtk.glib.IOChannel channel, org.gtk.glib.IOFlags flags);

        @ApiStatus.Internal default int upcall(MemoryAddress channel, int flags) {
            var RESULT = run(org.gtk.glib.IOChannel.fromAddress.marshal(channel, Ownership.NONE), new org.gtk.glib.IOFlags(flags));
            return RESULT.getValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(IoSetFlagsCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code io_set_flags}
     * @param ioSetFlags The new value of the field {@code io_set_flags}
     */
    public void setIoSetFlags(IoSetFlagsCallback ioSetFlags) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("io_set_flags"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (ioSetFlags == null ? MemoryAddress.NULL : ioSetFlags.toCallback()));
    }
    
    @FunctionalInterface
    public interface IoGetFlagsCallback {
        org.gtk.glib.IOFlags run(org.gtk.glib.IOChannel channel);

        @ApiStatus.Internal default int upcall(MemoryAddress channel) {
            var RESULT = run(org.gtk.glib.IOChannel.fromAddress.marshal(channel, Ownership.NONE));
            return RESULT.getValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(IoGetFlagsCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code io_get_flags}
     * @param ioGetFlags The new value of the field {@code io_get_flags}
     */
    public void setIoGetFlags(IoGetFlagsCallback ioGetFlags) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("io_get_flags"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (ioGetFlags == null ? MemoryAddress.NULL : ioGetFlags.toCallback()));
    }
    
    /**
     * Create a IOFuncs proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected IOFuncs(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, IOFuncs> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new IOFuncs(input, ownership);
    
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
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("io_read"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (ioRead == null ? MemoryAddress.NULL : ioRead.toCallback()));
            return this;
        }
        
        public Builder setIoWrite(IoWriteCallback ioWrite) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("io_write"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (ioWrite == null ? MemoryAddress.NULL : ioWrite.toCallback()));
            return this;
        }
        
        public Builder setIoSeek(IoSeekCallback ioSeek) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("io_seek"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (ioSeek == null ? MemoryAddress.NULL : ioSeek.toCallback()));
            return this;
        }
        
        public Builder setIoClose(IoCloseCallback ioClose) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("io_close"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (ioClose == null ? MemoryAddress.NULL : ioClose.toCallback()));
            return this;
        }
        
        public Builder setIoCreateWatch(IoCreateWatchCallback ioCreateWatch) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("io_create_watch"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (ioCreateWatch == null ? MemoryAddress.NULL : ioCreateWatch.toCallback()));
            return this;
        }
        
        public Builder setIoFree(IoFreeCallback ioFree) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("io_free"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (ioFree == null ? MemoryAddress.NULL : ioFree.toCallback()));
            return this;
        }
        
        public Builder setIoSetFlags(IoSetFlagsCallback ioSetFlags) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("io_set_flags"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (ioSetFlags == null ? MemoryAddress.NULL : ioSetFlags.toCallback()));
            return this;
        }
        
        public Builder setIoGetFlags(IoGetFlagsCallback ioGetFlags) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("io_get_flags"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (ioGetFlags == null ? MemoryAddress.NULL : ioGetFlags.toCallback()));
            return this;
        }
    }
}
