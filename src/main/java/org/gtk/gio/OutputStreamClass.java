package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class OutputStreamClass extends Struct {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GOutputStreamClass";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gtk.gobject.ObjectClass.getMemoryLayout().withName("parent_class"),
            Interop.valueLayout.ADDRESS.withName("write_fn"),
            Interop.valueLayout.ADDRESS.withName("splice"),
            Interop.valueLayout.ADDRESS.withName("flush"),
            Interop.valueLayout.ADDRESS.withName("close_fn"),
            Interop.valueLayout.ADDRESS.withName("write_async"),
            Interop.valueLayout.ADDRESS.withName("write_finish"),
            Interop.valueLayout.ADDRESS.withName("splice_async"),
            Interop.valueLayout.ADDRESS.withName("splice_finish"),
            Interop.valueLayout.ADDRESS.withName("flush_async"),
            Interop.valueLayout.ADDRESS.withName("flush_finish"),
            Interop.valueLayout.ADDRESS.withName("close_async"),
            Interop.valueLayout.ADDRESS.withName("close_finish"),
            Interop.valueLayout.ADDRESS.withName("writev_fn"),
            Interop.valueLayout.ADDRESS.withName("writev_async"),
            Interop.valueLayout.ADDRESS.withName("writev_finish"),
            Interop.valueLayout.ADDRESS.withName("_g_reserved4"),
            Interop.valueLayout.ADDRESS.withName("_g_reserved5"),
            Interop.valueLayout.ADDRESS.withName("_g_reserved6"),
            Interop.valueLayout.ADDRESS.withName("_g_reserved7"),
            Interop.valueLayout.ADDRESS.withName("_g_reserved8")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link OutputStreamClass}
     * @return A new, uninitialized @{link OutputStreamClass}
     */
    public static OutputStreamClass allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        OutputStreamClass newInstance = new OutputStreamClass(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code parent_class}
     * @return The value of the field {@code parent_class}
     */
    public org.gtk.gobject.ObjectClass getParentClass() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent_class"));
        return org.gtk.gobject.ObjectClass.fromAddress.marshal(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Change the value of the field {@code parent_class}
     * @param parentClass The new value of the field {@code parent_class}
     */
    public void setParentClass(org.gtk.gobject.ObjectClass parentClass) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
    }
    
    @FunctionalInterface
    public interface WriteFnCallback {
        long run(org.gtk.gio.OutputStream stream, byte[] buffer, long count, @Nullable org.gtk.gio.Cancellable cancellable);

        @ApiStatus.Internal default long upcall(MemoryAddress stream, MemoryAddress buffer, long count, MemoryAddress cancellable) {
            var RESULT = run((org.gtk.gio.OutputStream) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(stream)), org.gtk.gio.OutputStream.fromAddress).marshal(stream, Ownership.NONE), MemorySegment.ofAddress(buffer, count, Interop.getScope()).toArray(Interop.valueLayout.C_BYTE), count, (org.gtk.gio.Cancellable) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(cancellable)), org.gtk.gio.Cancellable.fromAddress).marshal(cancellable, Ownership.NONE));
            return RESULT;
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(WriteFnCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code write_fn}
     * @param writeFn The new value of the field {@code write_fn}
     */
    public void setWriteFn(WriteFnCallback writeFn) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("write_fn"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (writeFn == null ? MemoryAddress.NULL : writeFn.toCallback()));
    }
    
    @FunctionalInterface
    public interface SpliceCallback {
        long run(org.gtk.gio.OutputStream stream, org.gtk.gio.InputStream source, org.gtk.gio.OutputStreamSpliceFlags flags, @Nullable org.gtk.gio.Cancellable cancellable);

        @ApiStatus.Internal default long upcall(MemoryAddress stream, MemoryAddress source, int flags, MemoryAddress cancellable) {
            var RESULT = run((org.gtk.gio.OutputStream) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(stream)), org.gtk.gio.OutputStream.fromAddress).marshal(stream, Ownership.NONE), (org.gtk.gio.InputStream) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(source)), org.gtk.gio.InputStream.fromAddress).marshal(source, Ownership.NONE), new org.gtk.gio.OutputStreamSpliceFlags(flags), (org.gtk.gio.Cancellable) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(cancellable)), org.gtk.gio.Cancellable.fromAddress).marshal(cancellable, Ownership.NONE));
            return RESULT;
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(SpliceCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code splice}
     * @param splice The new value of the field {@code splice}
     */
    public void setSplice(SpliceCallback splice) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("splice"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (splice == null ? MemoryAddress.NULL : splice.toCallback()));
    }
    
    @FunctionalInterface
    public interface FlushCallback {
        boolean run(org.gtk.gio.OutputStream stream, @Nullable org.gtk.gio.Cancellable cancellable);

        @ApiStatus.Internal default int upcall(MemoryAddress stream, MemoryAddress cancellable) {
            var RESULT = run((org.gtk.gio.OutputStream) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(stream)), org.gtk.gio.OutputStream.fromAddress).marshal(stream, Ownership.NONE), (org.gtk.gio.Cancellable) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(cancellable)), org.gtk.gio.Cancellable.fromAddress).marshal(cancellable, Ownership.NONE));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(FlushCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code flush}
     * @param flush The new value of the field {@code flush}
     */
    public void setFlush(FlushCallback flush) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("flush"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (flush == null ? MemoryAddress.NULL : flush.toCallback()));
    }
    
    @FunctionalInterface
    public interface CloseFnCallback {
        boolean run(org.gtk.gio.OutputStream stream, @Nullable org.gtk.gio.Cancellable cancellable);

        @ApiStatus.Internal default int upcall(MemoryAddress stream, MemoryAddress cancellable) {
            var RESULT = run((org.gtk.gio.OutputStream) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(stream)), org.gtk.gio.OutputStream.fromAddress).marshal(stream, Ownership.NONE), (org.gtk.gio.Cancellable) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(cancellable)), org.gtk.gio.Cancellable.fromAddress).marshal(cancellable, Ownership.NONE));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(CloseFnCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code close_fn}
     * @param closeFn The new value of the field {@code close_fn}
     */
    public void setCloseFn(CloseFnCallback closeFn) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("close_fn"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (closeFn == null ? MemoryAddress.NULL : closeFn.toCallback()));
    }
    
    @FunctionalInterface
    public interface WriteAsyncCallback {
        void run(org.gtk.gio.OutputStream stream, byte[] buffer, long count, int ioPriority, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.AsyncReadyCallback callback);

        @ApiStatus.Internal default void upcall(MemoryAddress stream, MemoryAddress buffer, long count, int ioPriority, MemoryAddress cancellable, MemoryAddress callback, MemoryAddress userData) {
            run((org.gtk.gio.OutputStream) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(stream)), org.gtk.gio.OutputStream.fromAddress).marshal(stream, Ownership.NONE), MemorySegment.ofAddress(buffer, count, Interop.getScope()).toArray(Interop.valueLayout.C_BYTE), count, ioPriority, (org.gtk.gio.Cancellable) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(cancellable)), org.gtk.gio.Cancellable.fromAddress).marshal(cancellable, Ownership.NONE), null /* Unsupported parameter type */);
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(WriteAsyncCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code write_async}
     * @param writeAsync The new value of the field {@code write_async}
     */
    public void setWriteAsync(WriteAsyncCallback writeAsync) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("write_async"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (writeAsync == null ? MemoryAddress.NULL : writeAsync.toCallback()));
    }
    
    @FunctionalInterface
    public interface WriteFinishCallback {
        long run(org.gtk.gio.OutputStream stream, org.gtk.gio.AsyncResult result);

        @ApiStatus.Internal default long upcall(MemoryAddress stream, MemoryAddress result) {
            var RESULT = run((org.gtk.gio.OutputStream) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(stream)), org.gtk.gio.OutputStream.fromAddress).marshal(stream, Ownership.NONE), (org.gtk.gio.AsyncResult) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(result)), org.gtk.gio.AsyncResult.fromAddress).marshal(result, Ownership.NONE));
            return RESULT;
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(WriteFinishCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code write_finish}
     * @param writeFinish The new value of the field {@code write_finish}
     */
    public void setWriteFinish(WriteFinishCallback writeFinish) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("write_finish"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (writeFinish == null ? MemoryAddress.NULL : writeFinish.toCallback()));
    }
    
    @FunctionalInterface
    public interface SpliceAsyncCallback {
        void run(org.gtk.gio.OutputStream stream, org.gtk.gio.InputStream source, org.gtk.gio.OutputStreamSpliceFlags flags, int ioPriority, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.AsyncReadyCallback callback);

        @ApiStatus.Internal default void upcall(MemoryAddress stream, MemoryAddress source, int flags, int ioPriority, MemoryAddress cancellable, MemoryAddress callback, MemoryAddress userData) {
            run((org.gtk.gio.OutputStream) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(stream)), org.gtk.gio.OutputStream.fromAddress).marshal(stream, Ownership.NONE), (org.gtk.gio.InputStream) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(source)), org.gtk.gio.InputStream.fromAddress).marshal(source, Ownership.NONE), new org.gtk.gio.OutputStreamSpliceFlags(flags), ioPriority, (org.gtk.gio.Cancellable) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(cancellable)), org.gtk.gio.Cancellable.fromAddress).marshal(cancellable, Ownership.NONE), null /* Unsupported parameter type */);
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(SpliceAsyncCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code splice_async}
     * @param spliceAsync The new value of the field {@code splice_async}
     */
    public void setSpliceAsync(SpliceAsyncCallback spliceAsync) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("splice_async"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (spliceAsync == null ? MemoryAddress.NULL : spliceAsync.toCallback()));
    }
    
    @FunctionalInterface
    public interface SpliceFinishCallback {
        long run(org.gtk.gio.OutputStream stream, org.gtk.gio.AsyncResult result);

        @ApiStatus.Internal default long upcall(MemoryAddress stream, MemoryAddress result) {
            var RESULT = run((org.gtk.gio.OutputStream) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(stream)), org.gtk.gio.OutputStream.fromAddress).marshal(stream, Ownership.NONE), (org.gtk.gio.AsyncResult) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(result)), org.gtk.gio.AsyncResult.fromAddress).marshal(result, Ownership.NONE));
            return RESULT;
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(SpliceFinishCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code splice_finish}
     * @param spliceFinish The new value of the field {@code splice_finish}
     */
    public void setSpliceFinish(SpliceFinishCallback spliceFinish) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("splice_finish"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (spliceFinish == null ? MemoryAddress.NULL : spliceFinish.toCallback()));
    }
    
    @FunctionalInterface
    public interface FlushAsyncCallback {
        void run(org.gtk.gio.OutputStream stream, int ioPriority, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.AsyncReadyCallback callback);

        @ApiStatus.Internal default void upcall(MemoryAddress stream, int ioPriority, MemoryAddress cancellable, MemoryAddress callback, MemoryAddress userData) {
            run((org.gtk.gio.OutputStream) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(stream)), org.gtk.gio.OutputStream.fromAddress).marshal(stream, Ownership.NONE), ioPriority, (org.gtk.gio.Cancellable) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(cancellable)), org.gtk.gio.Cancellable.fromAddress).marshal(cancellable, Ownership.NONE), null /* Unsupported parameter type */);
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(FlushAsyncCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code flush_async}
     * @param flushAsync The new value of the field {@code flush_async}
     */
    public void setFlushAsync(FlushAsyncCallback flushAsync) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("flush_async"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (flushAsync == null ? MemoryAddress.NULL : flushAsync.toCallback()));
    }
    
    @FunctionalInterface
    public interface FlushFinishCallback {
        boolean run(org.gtk.gio.OutputStream stream, org.gtk.gio.AsyncResult result);

        @ApiStatus.Internal default int upcall(MemoryAddress stream, MemoryAddress result) {
            var RESULT = run((org.gtk.gio.OutputStream) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(stream)), org.gtk.gio.OutputStream.fromAddress).marshal(stream, Ownership.NONE), (org.gtk.gio.AsyncResult) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(result)), org.gtk.gio.AsyncResult.fromAddress).marshal(result, Ownership.NONE));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(FlushFinishCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code flush_finish}
     * @param flushFinish The new value of the field {@code flush_finish}
     */
    public void setFlushFinish(FlushFinishCallback flushFinish) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("flush_finish"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (flushFinish == null ? MemoryAddress.NULL : flushFinish.toCallback()));
    }
    
    @FunctionalInterface
    public interface CloseAsyncCallback {
        void run(org.gtk.gio.OutputStream stream, int ioPriority, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.AsyncReadyCallback callback);

        @ApiStatus.Internal default void upcall(MemoryAddress stream, int ioPriority, MemoryAddress cancellable, MemoryAddress callback, MemoryAddress userData) {
            run((org.gtk.gio.OutputStream) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(stream)), org.gtk.gio.OutputStream.fromAddress).marshal(stream, Ownership.NONE), ioPriority, (org.gtk.gio.Cancellable) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(cancellable)), org.gtk.gio.Cancellable.fromAddress).marshal(cancellable, Ownership.NONE), null /* Unsupported parameter type */);
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(CloseAsyncCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code close_async}
     * @param closeAsync The new value of the field {@code close_async}
     */
    public void setCloseAsync(CloseAsyncCallback closeAsync) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("close_async"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (closeAsync == null ? MemoryAddress.NULL : closeAsync.toCallback()));
    }
    
    @FunctionalInterface
    public interface CloseFinishCallback {
        boolean run(org.gtk.gio.OutputStream stream, org.gtk.gio.AsyncResult result);

        @ApiStatus.Internal default int upcall(MemoryAddress stream, MemoryAddress result) {
            var RESULT = run((org.gtk.gio.OutputStream) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(stream)), org.gtk.gio.OutputStream.fromAddress).marshal(stream, Ownership.NONE), (org.gtk.gio.AsyncResult) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(result)), org.gtk.gio.AsyncResult.fromAddress).marshal(result, Ownership.NONE));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(CloseFinishCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code close_finish}
     * @param closeFinish The new value of the field {@code close_finish}
     */
    public void setCloseFinish(CloseFinishCallback closeFinish) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("close_finish"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (closeFinish == null ? MemoryAddress.NULL : closeFinish.toCallback()));
    }
    
    @FunctionalInterface
    public interface WritevFnCallback {
        boolean run(org.gtk.gio.OutputStream stream, org.gtk.gio.OutputVector[] vectors, long nVectors, Out<Long> bytesWritten, @Nullable org.gtk.gio.Cancellable cancellable);

        @ApiStatus.Internal default int upcall(MemoryAddress stream, MemoryAddress vectors, long nVectors, MemoryAddress bytesWritten, MemoryAddress cancellable) {
            Out<Long> bytesWrittenOUT = new Out<>(bytesWritten.get(Interop.valueLayout.C_LONG, 0));
            var RESULT = run((org.gtk.gio.OutputStream) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(stream)), org.gtk.gio.OutputStream.fromAddress).marshal(stream, Ownership.NONE), new PointerProxy<org.gtk.gio.OutputVector>(vectors, org.gtk.gio.OutputVector.fromAddress).toArray((int) nVectors, org.gtk.gio.OutputVector.class), nVectors, bytesWrittenOUT, (org.gtk.gio.Cancellable) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(cancellable)), org.gtk.gio.Cancellable.fromAddress).marshal(cancellable, Ownership.NONE));
            bytesWritten.set(Interop.valueLayout.C_LONG, 0, bytesWrittenOUT.get());
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(WritevFnCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code writev_fn}
     * @param writevFn The new value of the field {@code writev_fn}
     */
    public void setWritevFn(WritevFnCallback writevFn) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("writev_fn"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (writevFn == null ? MemoryAddress.NULL : writevFn.toCallback()));
    }
    
    @FunctionalInterface
    public interface WritevAsyncCallback {
        void run(org.gtk.gio.OutputStream stream, org.gtk.gio.OutputVector[] vectors, long nVectors, int ioPriority, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.AsyncReadyCallback callback);

        @ApiStatus.Internal default void upcall(MemoryAddress stream, MemoryAddress vectors, long nVectors, int ioPriority, MemoryAddress cancellable, MemoryAddress callback, MemoryAddress userData) {
            run((org.gtk.gio.OutputStream) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(stream)), org.gtk.gio.OutputStream.fromAddress).marshal(stream, Ownership.NONE), new PointerProxy<org.gtk.gio.OutputVector>(vectors, org.gtk.gio.OutputVector.fromAddress).toArray((int) nVectors, org.gtk.gio.OutputVector.class), nVectors, ioPriority, (org.gtk.gio.Cancellable) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(cancellable)), org.gtk.gio.Cancellable.fromAddress).marshal(cancellable, Ownership.NONE), null /* Unsupported parameter type */);
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(WritevAsyncCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code writev_async}
     * @param writevAsync The new value of the field {@code writev_async}
     */
    public void setWritevAsync(WritevAsyncCallback writevAsync) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("writev_async"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (writevAsync == null ? MemoryAddress.NULL : writevAsync.toCallback()));
    }
    
    @FunctionalInterface
    public interface WritevFinishCallback {
        boolean run(org.gtk.gio.OutputStream stream, org.gtk.gio.AsyncResult result, Out<Long> bytesWritten);

        @ApiStatus.Internal default int upcall(MemoryAddress stream, MemoryAddress result, MemoryAddress bytesWritten) {
            Out<Long> bytesWrittenOUT = new Out<>(bytesWritten.get(Interop.valueLayout.C_LONG, 0));
            var RESULT = run((org.gtk.gio.OutputStream) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(stream)), org.gtk.gio.OutputStream.fromAddress).marshal(stream, Ownership.NONE), (org.gtk.gio.AsyncResult) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(result)), org.gtk.gio.AsyncResult.fromAddress).marshal(result, Ownership.NONE), bytesWrittenOUT);
            bytesWritten.set(Interop.valueLayout.C_LONG, 0, bytesWrittenOUT.get());
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(WritevFinishCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code writev_finish}
     * @param writevFinish The new value of the field {@code writev_finish}
     */
    public void setWritevFinish(WritevFinishCallback writevFinish) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("writev_finish"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (writevFinish == null ? MemoryAddress.NULL : writevFinish.toCallback()));
    }
    
    @FunctionalInterface
    public interface GReserved4Callback {
        void run();

        @ApiStatus.Internal default void upcall() {
            run();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid();
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(GReserved4Callback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code _g_reserved4}
     * @param GReserved4 The new value of the field {@code _g_reserved4}
     */
    public void setGReserved4(GReserved4Callback GReserved4) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("_g_reserved4"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (GReserved4 == null ? MemoryAddress.NULL : GReserved4.toCallback()));
    }
    
    @FunctionalInterface
    public interface GReserved5Callback {
        void run();

        @ApiStatus.Internal default void upcall() {
            run();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid();
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(GReserved5Callback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code _g_reserved5}
     * @param GReserved5 The new value of the field {@code _g_reserved5}
     */
    public void setGReserved5(GReserved5Callback GReserved5) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("_g_reserved5"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (GReserved5 == null ? MemoryAddress.NULL : GReserved5.toCallback()));
    }
    
    @FunctionalInterface
    public interface GReserved6Callback {
        void run();

        @ApiStatus.Internal default void upcall() {
            run();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid();
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(GReserved6Callback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code _g_reserved6}
     * @param GReserved6 The new value of the field {@code _g_reserved6}
     */
    public void setGReserved6(GReserved6Callback GReserved6) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("_g_reserved6"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (GReserved6 == null ? MemoryAddress.NULL : GReserved6.toCallback()));
    }
    
    @FunctionalInterface
    public interface GReserved7Callback {
        void run();

        @ApiStatus.Internal default void upcall() {
            run();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid();
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(GReserved7Callback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code _g_reserved7}
     * @param GReserved7 The new value of the field {@code _g_reserved7}
     */
    public void setGReserved7(GReserved7Callback GReserved7) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("_g_reserved7"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (GReserved7 == null ? MemoryAddress.NULL : GReserved7.toCallback()));
    }
    
    @FunctionalInterface
    public interface GReserved8Callback {
        void run();

        @ApiStatus.Internal default void upcall() {
            run();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid();
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(GReserved8Callback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code _g_reserved8}
     * @param GReserved8 The new value of the field {@code _g_reserved8}
     */
    public void setGReserved8(GReserved8Callback GReserved8) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("_g_reserved8"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (GReserved8 == null ? MemoryAddress.NULL : GReserved8.toCallback()));
    }
    
    /**
     * Create a OutputStreamClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected OutputStreamClass(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, OutputStreamClass> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new OutputStreamClass(input, ownership);
    
    /**
     * A {@link OutputStreamClass.Builder} object constructs a {@link OutputStreamClass} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link OutputStreamClass.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final OutputStreamClass struct;
        
        private Builder() {
            struct = OutputStreamClass.allocate();
        }
        
         /**
         * Finish building the {@link OutputStreamClass} struct.
         * @return A new instance of {@code OutputStreamClass} with the fields 
         *         that were set in the Builder object.
         */
        public OutputStreamClass build() {
            return struct;
        }
        
        public Builder setParentClass(org.gtk.gobject.ObjectClass parentClass) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
            return this;
        }
        
        public Builder setWriteFn(WriteFnCallback writeFn) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("write_fn"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (writeFn == null ? MemoryAddress.NULL : writeFn.toCallback()));
            return this;
        }
        
        public Builder setSplice(SpliceCallback splice) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("splice"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (splice == null ? MemoryAddress.NULL : splice.toCallback()));
            return this;
        }
        
        public Builder setFlush(FlushCallback flush) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("flush"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (flush == null ? MemoryAddress.NULL : flush.toCallback()));
            return this;
        }
        
        public Builder setCloseFn(CloseFnCallback closeFn) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("close_fn"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (closeFn == null ? MemoryAddress.NULL : closeFn.toCallback()));
            return this;
        }
        
        public Builder setWriteAsync(WriteAsyncCallback writeAsync) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("write_async"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (writeAsync == null ? MemoryAddress.NULL : writeAsync.toCallback()));
            return this;
        }
        
        public Builder setWriteFinish(WriteFinishCallback writeFinish) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("write_finish"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (writeFinish == null ? MemoryAddress.NULL : writeFinish.toCallback()));
            return this;
        }
        
        public Builder setSpliceAsync(SpliceAsyncCallback spliceAsync) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("splice_async"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (spliceAsync == null ? MemoryAddress.NULL : spliceAsync.toCallback()));
            return this;
        }
        
        public Builder setSpliceFinish(SpliceFinishCallback spliceFinish) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("splice_finish"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (spliceFinish == null ? MemoryAddress.NULL : spliceFinish.toCallback()));
            return this;
        }
        
        public Builder setFlushAsync(FlushAsyncCallback flushAsync) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("flush_async"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (flushAsync == null ? MemoryAddress.NULL : flushAsync.toCallback()));
            return this;
        }
        
        public Builder setFlushFinish(FlushFinishCallback flushFinish) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("flush_finish"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (flushFinish == null ? MemoryAddress.NULL : flushFinish.toCallback()));
            return this;
        }
        
        public Builder setCloseAsync(CloseAsyncCallback closeAsync) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("close_async"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (closeAsync == null ? MemoryAddress.NULL : closeAsync.toCallback()));
            return this;
        }
        
        public Builder setCloseFinish(CloseFinishCallback closeFinish) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("close_finish"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (closeFinish == null ? MemoryAddress.NULL : closeFinish.toCallback()));
            return this;
        }
        
        public Builder setWritevFn(WritevFnCallback writevFn) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("writev_fn"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (writevFn == null ? MemoryAddress.NULL : writevFn.toCallback()));
            return this;
        }
        
        public Builder setWritevAsync(WritevAsyncCallback writevAsync) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("writev_async"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (writevAsync == null ? MemoryAddress.NULL : writevAsync.toCallback()));
            return this;
        }
        
        public Builder setWritevFinish(WritevFinishCallback writevFinish) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("writev_finish"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (writevFinish == null ? MemoryAddress.NULL : writevFinish.toCallback()));
            return this;
        }
        
        public Builder setGReserved4(GReserved4Callback GReserved4) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("_g_reserved4"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (GReserved4 == null ? MemoryAddress.NULL : GReserved4.toCallback()));
            return this;
        }
        
        public Builder setGReserved5(GReserved5Callback GReserved5) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("_g_reserved5"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (GReserved5 == null ? MemoryAddress.NULL : GReserved5.toCallback()));
            return this;
        }
        
        public Builder setGReserved6(GReserved6Callback GReserved6) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("_g_reserved6"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (GReserved6 == null ? MemoryAddress.NULL : GReserved6.toCallback()));
            return this;
        }
        
        public Builder setGReserved7(GReserved7Callback GReserved7) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("_g_reserved7"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (GReserved7 == null ? MemoryAddress.NULL : GReserved7.toCallback()));
            return this;
        }
        
        public Builder setGReserved8(GReserved8Callback GReserved8) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("_g_reserved8"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (GReserved8 == null ? MemoryAddress.NULL : GReserved8.toCallback()));
            return this;
        }
    }
}
