package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class FileIOStreamClass extends Struct {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GFileIOStreamClass";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gtk.gio.IOStreamClass.getMemoryLayout().withName("parent_class"),
            Interop.valueLayout.ADDRESS.withName("tell"),
            Interop.valueLayout.ADDRESS.withName("can_seek"),
            Interop.valueLayout.ADDRESS.withName("seek"),
            Interop.valueLayout.ADDRESS.withName("can_truncate"),
            Interop.valueLayout.ADDRESS.withName("truncate_fn"),
            Interop.valueLayout.ADDRESS.withName("query_info"),
            Interop.valueLayout.ADDRESS.withName("query_info_async"),
            Interop.valueLayout.ADDRESS.withName("query_info_finish"),
            Interop.valueLayout.ADDRESS.withName("get_etag"),
            Interop.valueLayout.ADDRESS.withName("_g_reserved1"),
            Interop.valueLayout.ADDRESS.withName("_g_reserved2"),
            Interop.valueLayout.ADDRESS.withName("_g_reserved3"),
            Interop.valueLayout.ADDRESS.withName("_g_reserved4"),
            Interop.valueLayout.ADDRESS.withName("_g_reserved5")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link FileIOStreamClass}
     * @return A new, uninitialized @{link FileIOStreamClass}
     */
    public static FileIOStreamClass allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        FileIOStreamClass newInstance = new FileIOStreamClass(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code parent_class}
     * @return The value of the field {@code parent_class}
     */
    public org.gtk.gio.IOStreamClass getParentClass() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent_class"));
        return org.gtk.gio.IOStreamClass.fromAddress.marshal(((MemoryAddress) handle()).addOffset(OFFSET), null);
    }
    
    /**
     * Change the value of the field {@code parent_class}
     * @param parentClass The new value of the field {@code parent_class}
     */
    public void setParentClass(org.gtk.gio.IOStreamClass parentClass) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code TellCallback} callback.
     */
    @FunctionalInterface
    public interface TellCallback {
    
        long run(org.gtk.gio.FileIOStream stream);
        
        @ApiStatus.Internal default long upcall(MemoryAddress stream) {
            var RESULT = run((org.gtk.gio.FileIOStream) Interop.register(stream, org.gtk.gio.FileIOStream.fromAddress).marshal(stream, null));
            return RESULT;
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), TellCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code tell}
     * @param tell The new value of the field {@code tell}
     */
    public void setTell(TellCallback tell) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("tell"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (tell == null ? MemoryAddress.NULL : tell.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code CanSeekCallback} callback.
     */
    @FunctionalInterface
    public interface CanSeekCallback {
    
        boolean run(org.gtk.gio.FileIOStream stream);
        
        @ApiStatus.Internal default int upcall(MemoryAddress stream) {
            var RESULT = run((org.gtk.gio.FileIOStream) Interop.register(stream, org.gtk.gio.FileIOStream.fromAddress).marshal(stream, null));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), CanSeekCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code can_seek}
     * @param canSeek The new value of the field {@code can_seek}
     */
    public void setCanSeek(CanSeekCallback canSeek) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("can_seek"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (canSeek == null ? MemoryAddress.NULL : canSeek.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code SeekCallback} callback.
     */
    @FunctionalInterface
    public interface SeekCallback {
    
        boolean run(org.gtk.gio.FileIOStream stream, long offset, org.gtk.glib.SeekType type, @Nullable org.gtk.gio.Cancellable cancellable);
        
        @ApiStatus.Internal default int upcall(MemoryAddress stream, long offset, int type, MemoryAddress cancellable) {
            var RESULT = run((org.gtk.gio.FileIOStream) Interop.register(stream, org.gtk.gio.FileIOStream.fromAddress).marshal(stream, null), offset, org.gtk.glib.SeekType.of(type), (org.gtk.gio.Cancellable) Interop.register(cancellable, org.gtk.gio.Cancellable.fromAddress).marshal(cancellable, null));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), SeekCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code seek}
     * @param seek The new value of the field {@code seek}
     */
    public void setSeek(SeekCallback seek) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("seek"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (seek == null ? MemoryAddress.NULL : seek.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code CanTruncateCallback} callback.
     */
    @FunctionalInterface
    public interface CanTruncateCallback {
    
        boolean run(org.gtk.gio.FileIOStream stream);
        
        @ApiStatus.Internal default int upcall(MemoryAddress stream) {
            var RESULT = run((org.gtk.gio.FileIOStream) Interop.register(stream, org.gtk.gio.FileIOStream.fromAddress).marshal(stream, null));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), CanTruncateCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code can_truncate}
     * @param canTruncate The new value of the field {@code can_truncate}
     */
    public void setCanTruncate(CanTruncateCallback canTruncate) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("can_truncate"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (canTruncate == null ? MemoryAddress.NULL : canTruncate.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code TruncateFnCallback} callback.
     */
    @FunctionalInterface
    public interface TruncateFnCallback {
    
        boolean run(org.gtk.gio.FileIOStream stream, long size, @Nullable org.gtk.gio.Cancellable cancellable);
        
        @ApiStatus.Internal default int upcall(MemoryAddress stream, long size, MemoryAddress cancellable) {
            var RESULT = run((org.gtk.gio.FileIOStream) Interop.register(stream, org.gtk.gio.FileIOStream.fromAddress).marshal(stream, null), size, (org.gtk.gio.Cancellable) Interop.register(cancellable, org.gtk.gio.Cancellable.fromAddress).marshal(cancellable, null));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), TruncateFnCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code truncate_fn}
     * @param truncateFn The new value of the field {@code truncate_fn}
     */
    public void setTruncateFn(TruncateFnCallback truncateFn) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("truncate_fn"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (truncateFn == null ? MemoryAddress.NULL : truncateFn.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code QueryInfoCallback} callback.
     */
    @FunctionalInterface
    public interface QueryInfoCallback {
    
        org.gtk.gio.FileInfo run(org.gtk.gio.FileIOStream stream, java.lang.String attributes, @Nullable org.gtk.gio.Cancellable cancellable);
        
        @ApiStatus.Internal default Addressable upcall(MemoryAddress stream, MemoryAddress attributes, MemoryAddress cancellable) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                var RESULT = run((org.gtk.gio.FileIOStream) Interop.register(stream, org.gtk.gio.FileIOStream.fromAddress).marshal(stream, null), Marshal.addressToString.marshal(attributes, null), (org.gtk.gio.Cancellable) Interop.register(cancellable, org.gtk.gio.Cancellable.fromAddress).marshal(cancellable, null));
                RESULT.yieldOwnership();
                return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
            }
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), QueryInfoCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code query_info}
     * @param queryInfo The new value of the field {@code query_info}
     */
    public void setQueryInfo(QueryInfoCallback queryInfo) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("query_info"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (queryInfo == null ? MemoryAddress.NULL : queryInfo.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code QueryInfoAsyncCallback} callback.
     */
    @FunctionalInterface
    public interface QueryInfoAsyncCallback {
    
        void run(org.gtk.gio.FileIOStream stream, java.lang.String attributes, int ioPriority, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.AsyncReadyCallback callback);
        
        @ApiStatus.Internal default void upcall(MemoryAddress stream, MemoryAddress attributes, int ioPriority, MemoryAddress cancellable, MemoryAddress callback, MemoryAddress userData) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                run((org.gtk.gio.FileIOStream) Interop.register(stream, org.gtk.gio.FileIOStream.fromAddress).marshal(stream, null), Marshal.addressToString.marshal(attributes, null), ioPriority, (org.gtk.gio.Cancellable) Interop.register(cancellable, org.gtk.gio.Cancellable.fromAddress).marshal(cancellable, null), null /* Unsupported parameter type */);
            }
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), QueryInfoAsyncCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code query_info_async}
     * @param queryInfoAsync The new value of the field {@code query_info_async}
     */
    public void setQueryInfoAsync(QueryInfoAsyncCallback queryInfoAsync) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("query_info_async"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (queryInfoAsync == null ? MemoryAddress.NULL : queryInfoAsync.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code QueryInfoFinishCallback} callback.
     */
    @FunctionalInterface
    public interface QueryInfoFinishCallback {
    
        org.gtk.gio.FileInfo run(org.gtk.gio.FileIOStream stream, org.gtk.gio.AsyncResult result);
        
        @ApiStatus.Internal default Addressable upcall(MemoryAddress stream, MemoryAddress result) {
            var RESULT = run((org.gtk.gio.FileIOStream) Interop.register(stream, org.gtk.gio.FileIOStream.fromAddress).marshal(stream, null), (org.gtk.gio.AsyncResult) Interop.register(result, org.gtk.gio.AsyncResult.fromAddress).marshal(result, null));
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
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), QueryInfoFinishCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code query_info_finish}
     * @param queryInfoFinish The new value of the field {@code query_info_finish}
     */
    public void setQueryInfoFinish(QueryInfoFinishCallback queryInfoFinish) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("query_info_finish"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (queryInfoFinish == null ? MemoryAddress.NULL : queryInfoFinish.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code GetEtagCallback} callback.
     */
    @FunctionalInterface
    public interface GetEtagCallback {
    
        @Nullable java.lang.String run(org.gtk.gio.FileIOStream stream);
        
        @ApiStatus.Internal default Addressable upcall(MemoryAddress stream) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                var RESULT = run((org.gtk.gio.FileIOStream) Interop.register(stream, org.gtk.gio.FileIOStream.fromAddress).marshal(stream, null));
                return RESULT == null ? MemoryAddress.NULL.address() : (Marshal.stringToAddress.marshal(RESULT, SCOPE)).address();
            }
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), GetEtagCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_etag}
     * @param getEtag The new value of the field {@code get_etag}
     */
    public void setGetEtag(GetEtagCallback getEtag) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_etag"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getEtag == null ? MemoryAddress.NULL : getEtag.toCallback()));
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
     * Create a FileIOStreamClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected FileIOStreamClass(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, FileIOStreamClass> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new FileIOStreamClass(input);
    
    /**
     * A {@link FileIOStreamClass.Builder} object constructs a {@link FileIOStreamClass} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link FileIOStreamClass.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final FileIOStreamClass struct;
        
        private Builder() {
            struct = FileIOStreamClass.allocate();
        }
        
        /**
         * Finish building the {@link FileIOStreamClass} struct.
         * @return A new instance of {@code FileIOStreamClass} with the fields 
         *         that were set in the Builder object.
         */
        public FileIOStreamClass build() {
            return struct;
        }
        
        public Builder setParentClass(org.gtk.gio.IOStreamClass parentClass) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
                return this;
            }
        }
        
        public Builder setTell(TellCallback tell) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("tell"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (tell == null ? MemoryAddress.NULL : tell.toCallback()));
                return this;
            }
        }
        
        public Builder setCanSeek(CanSeekCallback canSeek) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("can_seek"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (canSeek == null ? MemoryAddress.NULL : canSeek.toCallback()));
                return this;
            }
        }
        
        public Builder setSeek(SeekCallback seek) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("seek"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (seek == null ? MemoryAddress.NULL : seek.toCallback()));
                return this;
            }
        }
        
        public Builder setCanTruncate(CanTruncateCallback canTruncate) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("can_truncate"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (canTruncate == null ? MemoryAddress.NULL : canTruncate.toCallback()));
                return this;
            }
        }
        
        public Builder setTruncateFn(TruncateFnCallback truncateFn) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("truncate_fn"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (truncateFn == null ? MemoryAddress.NULL : truncateFn.toCallback()));
                return this;
            }
        }
        
        public Builder setQueryInfo(QueryInfoCallback queryInfo) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("query_info"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (queryInfo == null ? MemoryAddress.NULL : queryInfo.toCallback()));
                return this;
            }
        }
        
        public Builder setQueryInfoAsync(QueryInfoAsyncCallback queryInfoAsync) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("query_info_async"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (queryInfoAsync == null ? MemoryAddress.NULL : queryInfoAsync.toCallback()));
                return this;
            }
        }
        
        public Builder setQueryInfoFinish(QueryInfoFinishCallback queryInfoFinish) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("query_info_finish"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (queryInfoFinish == null ? MemoryAddress.NULL : queryInfoFinish.toCallback()));
                return this;
            }
        }
        
        public Builder setGetEtag(GetEtagCallback getEtag) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("get_etag"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getEtag == null ? MemoryAddress.NULL : getEtag.toCallback()));
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
