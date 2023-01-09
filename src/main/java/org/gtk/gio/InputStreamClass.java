package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class InputStreamClass extends Struct {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GInputStreamClass";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gtk.gobject.ObjectClass.getMemoryLayout().withName("parent_class"),
            Interop.valueLayout.ADDRESS.withName("read_fn"),
            Interop.valueLayout.ADDRESS.withName("skip"),
            Interop.valueLayout.ADDRESS.withName("close_fn"),
            Interop.valueLayout.ADDRESS.withName("read_async"),
            Interop.valueLayout.ADDRESS.withName("read_finish"),
            Interop.valueLayout.ADDRESS.withName("skip_async"),
            Interop.valueLayout.ADDRESS.withName("skip_finish"),
            Interop.valueLayout.ADDRESS.withName("close_async"),
            Interop.valueLayout.ADDRESS.withName("close_finish"),
            Interop.valueLayout.ADDRESS.withName("_g_reserved1"),
            Interop.valueLayout.ADDRESS.withName("_g_reserved2"),
            Interop.valueLayout.ADDRESS.withName("_g_reserved3"),
            Interop.valueLayout.ADDRESS.withName("_g_reserved4"),
            Interop.valueLayout.ADDRESS.withName("_g_reserved5")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link InputStreamClass}
     * @return A new, uninitialized @{link InputStreamClass}
     */
    public static InputStreamClass allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        InputStreamClass newInstance = new InputStreamClass(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code parent_class}
     * @return The value of the field {@code parent_class}
     */
    public org.gtk.gobject.ObjectClass getParentClass() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent_class"));
        return org.gtk.gobject.ObjectClass.fromAddress.marshal(((MemoryAddress) handle()).addOffset(OFFSET), null);
    }
    
    /**
     * Change the value of the field {@code parent_class}
     * @param parentClass The new value of the field {@code parent_class}
     */
    public void setParentClass(org.gtk.gobject.ObjectClass parentClass) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code ReadFnCallback} callback.
     */
    @FunctionalInterface
    public interface ReadFnCallback {
    
        long run(org.gtk.gio.InputStream stream, @Nullable java.lang.foreign.MemoryAddress buffer, long count, @Nullable org.gtk.gio.Cancellable cancellable);
        
        @ApiStatus.Internal default long upcall(MemoryAddress stream, MemoryAddress buffer, long count, MemoryAddress cancellable) {
            var RESULT = run((org.gtk.gio.InputStream) Interop.register(stream, org.gtk.gio.InputStream.fromAddress).marshal(stream, null), buffer, count, (org.gtk.gio.Cancellable) Interop.register(cancellable, org.gtk.gio.Cancellable.fromAddress).marshal(cancellable, null));
            return RESULT;
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), ReadFnCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code read_fn}
     * @param readFn The new value of the field {@code read_fn}
     */
    public void setReadFn(ReadFnCallback readFn) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("read_fn"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (readFn == null ? MemoryAddress.NULL : readFn.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code SkipCallback} callback.
     */
    @FunctionalInterface
    public interface SkipCallback {
    
        long run(org.gtk.gio.InputStream stream, long count, @Nullable org.gtk.gio.Cancellable cancellable);
        
        @ApiStatus.Internal default long upcall(MemoryAddress stream, long count, MemoryAddress cancellable) {
            var RESULT = run((org.gtk.gio.InputStream) Interop.register(stream, org.gtk.gio.InputStream.fromAddress).marshal(stream, null), count, (org.gtk.gio.Cancellable) Interop.register(cancellable, org.gtk.gio.Cancellable.fromAddress).marshal(cancellable, null));
            return RESULT;
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), SkipCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code skip}
     * @param skip The new value of the field {@code skip}
     */
    public void setSkip(SkipCallback skip) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("skip"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (skip == null ? MemoryAddress.NULL : skip.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code CloseFnCallback} callback.
     */
    @FunctionalInterface
    public interface CloseFnCallback {
    
        boolean run(org.gtk.gio.InputStream stream, @Nullable org.gtk.gio.Cancellable cancellable);
        
        @ApiStatus.Internal default int upcall(MemoryAddress stream, MemoryAddress cancellable) {
            var RESULT = run((org.gtk.gio.InputStream) Interop.register(stream, org.gtk.gio.InputStream.fromAddress).marshal(stream, null), (org.gtk.gio.Cancellable) Interop.register(cancellable, org.gtk.gio.Cancellable.fromAddress).marshal(cancellable, null));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), CloseFnCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code close_fn}
     * @param closeFn The new value of the field {@code close_fn}
     */
    public void setCloseFn(CloseFnCallback closeFn) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("close_fn"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (closeFn == null ? MemoryAddress.NULL : closeFn.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code ReadAsyncCallback} callback.
     */
    @FunctionalInterface
    public interface ReadAsyncCallback {
    
        void run(org.gtk.gio.InputStream stream, Out<byte[]> buffer, long count, int ioPriority, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.AsyncReadyCallback callback);
        
        @ApiStatus.Internal default void upcall(MemoryAddress stream, MemoryAddress buffer, long count, int ioPriority, MemoryAddress cancellable, MemoryAddress callback, MemoryAddress userData) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                Out<byte[]> bufferOUT = new Out<>(MemorySegment.ofAddress(buffer, count, SCOPE).toArray(Interop.valueLayout.C_BYTE));
                run((org.gtk.gio.InputStream) Interop.register(stream, org.gtk.gio.InputStream.fromAddress).marshal(stream, null), bufferOUT, count, ioPriority, (org.gtk.gio.Cancellable) Interop.register(cancellable, org.gtk.gio.Cancellable.fromAddress).marshal(cancellable, null), null /* Unsupported parameter type */);
            }
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), ReadAsyncCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code read_async}
     * @param readAsync The new value of the field {@code read_async}
     */
    public void setReadAsync(ReadAsyncCallback readAsync) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("read_async"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (readAsync == null ? MemoryAddress.NULL : readAsync.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code ReadFinishCallback} callback.
     */
    @FunctionalInterface
    public interface ReadFinishCallback {
    
        long run(org.gtk.gio.InputStream stream, org.gtk.gio.AsyncResult result);
        
        @ApiStatus.Internal default long upcall(MemoryAddress stream, MemoryAddress result) {
            var RESULT = run((org.gtk.gio.InputStream) Interop.register(stream, org.gtk.gio.InputStream.fromAddress).marshal(stream, null), (org.gtk.gio.AsyncResult) Interop.register(result, org.gtk.gio.AsyncResult.fromAddress).marshal(result, null));
            return RESULT;
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), ReadFinishCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code read_finish}
     * @param readFinish The new value of the field {@code read_finish}
     */
    public void setReadFinish(ReadFinishCallback readFinish) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("read_finish"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (readFinish == null ? MemoryAddress.NULL : readFinish.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code SkipAsyncCallback} callback.
     */
    @FunctionalInterface
    public interface SkipAsyncCallback {
    
        void run(org.gtk.gio.InputStream stream, long count, int ioPriority, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.AsyncReadyCallback callback);
        
        @ApiStatus.Internal default void upcall(MemoryAddress stream, long count, int ioPriority, MemoryAddress cancellable, MemoryAddress callback, MemoryAddress userData) {
            run((org.gtk.gio.InputStream) Interop.register(stream, org.gtk.gio.InputStream.fromAddress).marshal(stream, null), count, ioPriority, (org.gtk.gio.Cancellable) Interop.register(cancellable, org.gtk.gio.Cancellable.fromAddress).marshal(cancellable, null), null /* Unsupported parameter type */);
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), SkipAsyncCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code skip_async}
     * @param skipAsync The new value of the field {@code skip_async}
     */
    public void setSkipAsync(SkipAsyncCallback skipAsync) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("skip_async"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (skipAsync == null ? MemoryAddress.NULL : skipAsync.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code SkipFinishCallback} callback.
     */
    @FunctionalInterface
    public interface SkipFinishCallback {
    
        long run(org.gtk.gio.InputStream stream, org.gtk.gio.AsyncResult result);
        
        @ApiStatus.Internal default long upcall(MemoryAddress stream, MemoryAddress result) {
            var RESULT = run((org.gtk.gio.InputStream) Interop.register(stream, org.gtk.gio.InputStream.fromAddress).marshal(stream, null), (org.gtk.gio.AsyncResult) Interop.register(result, org.gtk.gio.AsyncResult.fromAddress).marshal(result, null));
            return RESULT;
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), SkipFinishCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code skip_finish}
     * @param skipFinish The new value of the field {@code skip_finish}
     */
    public void setSkipFinish(SkipFinishCallback skipFinish) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("skip_finish"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (skipFinish == null ? MemoryAddress.NULL : skipFinish.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code CloseAsyncCallback} callback.
     */
    @FunctionalInterface
    public interface CloseAsyncCallback {
    
        void run(org.gtk.gio.InputStream stream, int ioPriority, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.AsyncReadyCallback callback);
        
        @ApiStatus.Internal default void upcall(MemoryAddress stream, int ioPriority, MemoryAddress cancellable, MemoryAddress callback, MemoryAddress userData) {
            run((org.gtk.gio.InputStream) Interop.register(stream, org.gtk.gio.InputStream.fromAddress).marshal(stream, null), ioPriority, (org.gtk.gio.Cancellable) Interop.register(cancellable, org.gtk.gio.Cancellable.fromAddress).marshal(cancellable, null), null /* Unsupported parameter type */);
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), CloseAsyncCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code close_async}
     * @param closeAsync The new value of the field {@code close_async}
     */
    public void setCloseAsync(CloseAsyncCallback closeAsync) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("close_async"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (closeAsync == null ? MemoryAddress.NULL : closeAsync.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code CloseFinishCallback} callback.
     */
    @FunctionalInterface
    public interface CloseFinishCallback {
    
        boolean run(org.gtk.gio.InputStream stream, org.gtk.gio.AsyncResult result);
        
        @ApiStatus.Internal default int upcall(MemoryAddress stream, MemoryAddress result) {
            var RESULT = run((org.gtk.gio.InputStream) Interop.register(stream, org.gtk.gio.InputStream.fromAddress).marshal(stream, null), (org.gtk.gio.AsyncResult) Interop.register(result, org.gtk.gio.AsyncResult.fromAddress).marshal(result, null));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), CloseFinishCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code close_finish}
     * @param closeFinish The new value of the field {@code close_finish}
     */
    public void setCloseFinish(CloseFinishCallback closeFinish) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("close_finish"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (closeFinish == null ? MemoryAddress.NULL : closeFinish.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code GReserved1Callback} callback.
     */
    @FunctionalInterface
    public interface GReserved1Callback {
    
        void run();
        
        @ApiStatus.Internal default void upcall() {
            run();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid();
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), GReserved1Callback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code _g_reserved1}
     * @param GReserved1 The new value of the field {@code _g_reserved1}
     */
    public void setGReserved1(GReserved1Callback GReserved1) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("_g_reserved1"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (GReserved1 == null ? MemoryAddress.NULL : GReserved1.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code GReserved2Callback} callback.
     */
    @FunctionalInterface
    public interface GReserved2Callback {
    
        void run();
        
        @ApiStatus.Internal default void upcall() {
            run();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid();
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), GReserved2Callback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code _g_reserved2}
     * @param GReserved2 The new value of the field {@code _g_reserved2}
     */
    public void setGReserved2(GReserved2Callback GReserved2) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("_g_reserved2"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (GReserved2 == null ? MemoryAddress.NULL : GReserved2.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code GReserved3Callback} callback.
     */
    @FunctionalInterface
    public interface GReserved3Callback {
    
        void run();
        
        @ApiStatus.Internal default void upcall() {
            run();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid();
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), GReserved3Callback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code _g_reserved3}
     * @param GReserved3 The new value of the field {@code _g_reserved3}
     */
    public void setGReserved3(GReserved3Callback GReserved3) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("_g_reserved3"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (GReserved3 == null ? MemoryAddress.NULL : GReserved3.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code GReserved4Callback} callback.
     */
    @FunctionalInterface
    public interface GReserved4Callback {
    
        void run();
        
        @ApiStatus.Internal default void upcall() {
            run();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid();
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), GReserved4Callback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code _g_reserved4}
     * @param GReserved4 The new value of the field {@code _g_reserved4}
     */
    public void setGReserved4(GReserved4Callback GReserved4) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("_g_reserved4"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (GReserved4 == null ? MemoryAddress.NULL : GReserved4.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code GReserved5Callback} callback.
     */
    @FunctionalInterface
    public interface GReserved5Callback {
    
        void run();
        
        @ApiStatus.Internal default void upcall() {
            run();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid();
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), GReserved5Callback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code _g_reserved5}
     * @param GReserved5 The new value of the field {@code _g_reserved5}
     */
    public void setGReserved5(GReserved5Callback GReserved5) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("_g_reserved5"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (GReserved5 == null ? MemoryAddress.NULL : GReserved5.toCallback()));
        }
    }
    
    /**
     * Create a InputStreamClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected InputStreamClass(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, InputStreamClass> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new InputStreamClass(input);
    
    /**
     * A {@link InputStreamClass.Builder} object constructs a {@link InputStreamClass} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link InputStreamClass.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final InputStreamClass struct;
        
        private Builder() {
            struct = InputStreamClass.allocate();
        }
        
        /**
         * Finish building the {@link InputStreamClass} struct.
         * @return A new instance of {@code InputStreamClass} with the fields 
         *         that were set in the Builder object.
         */
        public InputStreamClass build() {
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
        
        public Builder setReadFn(ReadFnCallback readFn) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("read_fn"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (readFn == null ? MemoryAddress.NULL : readFn.toCallback()));
                return this;
            }
        }
        
        public Builder setSkip(SkipCallback skip) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("skip"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (skip == null ? MemoryAddress.NULL : skip.toCallback()));
                return this;
            }
        }
        
        public Builder setCloseFn(CloseFnCallback closeFn) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("close_fn"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (closeFn == null ? MemoryAddress.NULL : closeFn.toCallback()));
                return this;
            }
        }
        
        public Builder setReadAsync(ReadAsyncCallback readAsync) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("read_async"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (readAsync == null ? MemoryAddress.NULL : readAsync.toCallback()));
                return this;
            }
        }
        
        public Builder setReadFinish(ReadFinishCallback readFinish) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("read_finish"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (readFinish == null ? MemoryAddress.NULL : readFinish.toCallback()));
                return this;
            }
        }
        
        public Builder setSkipAsync(SkipAsyncCallback skipAsync) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("skip_async"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (skipAsync == null ? MemoryAddress.NULL : skipAsync.toCallback()));
                return this;
            }
        }
        
        public Builder setSkipFinish(SkipFinishCallback skipFinish) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("skip_finish"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (skipFinish == null ? MemoryAddress.NULL : skipFinish.toCallback()));
                return this;
            }
        }
        
        public Builder setCloseAsync(CloseAsyncCallback closeAsync) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("close_async"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (closeAsync == null ? MemoryAddress.NULL : closeAsync.toCallback()));
                return this;
            }
        }
        
        public Builder setCloseFinish(CloseFinishCallback closeFinish) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("close_finish"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (closeFinish == null ? MemoryAddress.NULL : closeFinish.toCallback()));
                return this;
            }
        }
        
        public Builder setGReserved1(GReserved1Callback GReserved1) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("_g_reserved1"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (GReserved1 == null ? MemoryAddress.NULL : GReserved1.toCallback()));
                return this;
            }
        }
        
        public Builder setGReserved2(GReserved2Callback GReserved2) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("_g_reserved2"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (GReserved2 == null ? MemoryAddress.NULL : GReserved2.toCallback()));
                return this;
            }
        }
        
        public Builder setGReserved3(GReserved3Callback GReserved3) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("_g_reserved3"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (GReserved3 == null ? MemoryAddress.NULL : GReserved3.toCallback()));
                return this;
            }
        }
        
        public Builder setGReserved4(GReserved4Callback GReserved4) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("_g_reserved4"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (GReserved4 == null ? MemoryAddress.NULL : GReserved4.toCallback()));
                return this;
            }
        }
        
        public Builder setGReserved5(GReserved5Callback GReserved5) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("_g_reserved5"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (GReserved5 == null ? MemoryAddress.NULL : GReserved5.toCallback()));
                return this;
            }
        }
    }
}
