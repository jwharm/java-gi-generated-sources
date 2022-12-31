package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class FileEnumeratorClass extends Struct {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GFileEnumeratorClass";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gtk.gobject.ObjectClass.getMemoryLayout().withName("parent_class"),
            Interop.valueLayout.ADDRESS.withName("next_file"),
            Interop.valueLayout.ADDRESS.withName("close_fn"),
            Interop.valueLayout.ADDRESS.withName("next_files_async"),
            Interop.valueLayout.ADDRESS.withName("next_files_finish"),
            Interop.valueLayout.ADDRESS.withName("close_async"),
            Interop.valueLayout.ADDRESS.withName("close_finish"),
            Interop.valueLayout.ADDRESS.withName("_g_reserved1"),
            Interop.valueLayout.ADDRESS.withName("_g_reserved2"),
            Interop.valueLayout.ADDRESS.withName("_g_reserved3"),
            Interop.valueLayout.ADDRESS.withName("_g_reserved4"),
            Interop.valueLayout.ADDRESS.withName("_g_reserved5"),
            Interop.valueLayout.ADDRESS.withName("_g_reserved6"),
            Interop.valueLayout.ADDRESS.withName("_g_reserved7")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link FileEnumeratorClass}
     * @return A new, uninitialized @{link FileEnumeratorClass}
     */
    public static FileEnumeratorClass allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        FileEnumeratorClass newInstance = new FileEnumeratorClass(segment.address(), Ownership.NONE);
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
    public interface NextFileCallback {
        @Nullable org.gtk.gio.FileInfo run(org.gtk.gio.FileEnumerator enumerator, @Nullable org.gtk.gio.Cancellable cancellable);

        @ApiStatus.Internal default Addressable upcall(MemoryAddress enumerator, MemoryAddress cancellable) {
            var RESULT = run((org.gtk.gio.FileEnumerator) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(enumerator)), org.gtk.gio.FileEnumerator.fromAddress).marshal(enumerator, Ownership.NONE), (org.gtk.gio.Cancellable) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(cancellable)), org.gtk.gio.Cancellable.fromAddress).marshal(cancellable, Ownership.NONE));
            return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(NextFileCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code next_file}
     * @param nextFile The new value of the field {@code next_file}
     */
    public void setNextFile(NextFileCallback nextFile) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("next_file"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (nextFile == null ? MemoryAddress.NULL : nextFile.toCallback()));
    }
    
    @FunctionalInterface
    public interface CloseFnCallback {
        boolean run(org.gtk.gio.FileEnumerator enumerator, @Nullable org.gtk.gio.Cancellable cancellable);

        @ApiStatus.Internal default int upcall(MemoryAddress enumerator, MemoryAddress cancellable) {
            var RESULT = run((org.gtk.gio.FileEnumerator) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(enumerator)), org.gtk.gio.FileEnumerator.fromAddress).marshal(enumerator, Ownership.NONE), (org.gtk.gio.Cancellable) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(cancellable)), org.gtk.gio.Cancellable.fromAddress).marshal(cancellable, Ownership.NONE));
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
    public interface NextFilesAsyncCallback {
        void run(org.gtk.gio.FileEnumerator enumerator, int numFiles, int ioPriority, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.AsyncReadyCallback callback);

        @ApiStatus.Internal default void upcall(MemoryAddress enumerator, int numFiles, int ioPriority, MemoryAddress cancellable, MemoryAddress callback, MemoryAddress userData) {
            run((org.gtk.gio.FileEnumerator) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(enumerator)), org.gtk.gio.FileEnumerator.fromAddress).marshal(enumerator, Ownership.NONE), numFiles, ioPriority, (org.gtk.gio.Cancellable) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(cancellable)), org.gtk.gio.Cancellable.fromAddress).marshal(cancellable, Ownership.NONE), null /* Unsupported parameter type */);
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(NextFilesAsyncCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code next_files_async}
     * @param nextFilesAsync The new value of the field {@code next_files_async}
     */
    public void setNextFilesAsync(NextFilesAsyncCallback nextFilesAsync) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("next_files_async"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (nextFilesAsync == null ? MemoryAddress.NULL : nextFilesAsync.toCallback()));
    }
    
    @FunctionalInterface
    public interface NextFilesFinishCallback {
        org.gtk.glib.List run(org.gtk.gio.FileEnumerator enumerator, org.gtk.gio.AsyncResult result);

        @ApiStatus.Internal default Addressable upcall(MemoryAddress enumerator, MemoryAddress result) {
            var RESULT = run((org.gtk.gio.FileEnumerator) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(enumerator)), org.gtk.gio.FileEnumerator.fromAddress).marshal(enumerator, Ownership.NONE), (org.gtk.gio.AsyncResult) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(result)), org.gtk.gio.AsyncResult.fromAddress).marshal(result, Ownership.NONE));
            return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(NextFilesFinishCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code next_files_finish}
     * @param nextFilesFinish The new value of the field {@code next_files_finish}
     */
    public void setNextFilesFinish(NextFilesFinishCallback nextFilesFinish) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("next_files_finish"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (nextFilesFinish == null ? MemoryAddress.NULL : nextFilesFinish.toCallback()));
    }
    
    @FunctionalInterface
    public interface CloseAsyncCallback {
        void run(org.gtk.gio.FileEnumerator enumerator, int ioPriority, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.AsyncReadyCallback callback);

        @ApiStatus.Internal default void upcall(MemoryAddress enumerator, int ioPriority, MemoryAddress cancellable, MemoryAddress callback, MemoryAddress userData) {
            run((org.gtk.gio.FileEnumerator) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(enumerator)), org.gtk.gio.FileEnumerator.fromAddress).marshal(enumerator, Ownership.NONE), ioPriority, (org.gtk.gio.Cancellable) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(cancellable)), org.gtk.gio.Cancellable.fromAddress).marshal(cancellable, Ownership.NONE), null /* Unsupported parameter type */);
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
        boolean run(org.gtk.gio.FileEnumerator enumerator, org.gtk.gio.AsyncResult result);

        @ApiStatus.Internal default int upcall(MemoryAddress enumerator, MemoryAddress result) {
            var RESULT = run((org.gtk.gio.FileEnumerator) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(enumerator)), org.gtk.gio.FileEnumerator.fromAddress).marshal(enumerator, Ownership.NONE), (org.gtk.gio.AsyncResult) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(result)), org.gtk.gio.AsyncResult.fromAddress).marshal(result, Ownership.NONE));
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
    public interface GReserved1Callback {
        void run();

        @ApiStatus.Internal default void upcall() {
            run();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid();
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(GReserved1Callback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code _g_reserved1}
     * @param GReserved1 The new value of the field {@code _g_reserved1}
     */
    public void setGReserved1(GReserved1Callback GReserved1) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("_g_reserved1"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (GReserved1 == null ? MemoryAddress.NULL : GReserved1.toCallback()));
    }
    
    @FunctionalInterface
    public interface GReserved2Callback {
        void run();

        @ApiStatus.Internal default void upcall() {
            run();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid();
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(GReserved2Callback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code _g_reserved2}
     * @param GReserved2 The new value of the field {@code _g_reserved2}
     */
    public void setGReserved2(GReserved2Callback GReserved2) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("_g_reserved2"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (GReserved2 == null ? MemoryAddress.NULL : GReserved2.toCallback()));
    }
    
    @FunctionalInterface
    public interface GReserved3Callback {
        void run();

        @ApiStatus.Internal default void upcall() {
            run();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid();
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(GReserved3Callback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code _g_reserved3}
     * @param GReserved3 The new value of the field {@code _g_reserved3}
     */
    public void setGReserved3(GReserved3Callback GReserved3) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("_g_reserved3"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (GReserved3 == null ? MemoryAddress.NULL : GReserved3.toCallback()));
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
    
    /**
     * Create a FileEnumeratorClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected FileEnumeratorClass(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, FileEnumeratorClass> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new FileEnumeratorClass(input, ownership);
    
    /**
     * A {@link FileEnumeratorClass.Builder} object constructs a {@link FileEnumeratorClass} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link FileEnumeratorClass.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final FileEnumeratorClass struct;
        
        private Builder() {
            struct = FileEnumeratorClass.allocate();
        }
        
         /**
         * Finish building the {@link FileEnumeratorClass} struct.
         * @return A new instance of {@code FileEnumeratorClass} with the fields 
         *         that were set in the Builder object.
         */
        public FileEnumeratorClass build() {
            return struct;
        }
        
        public Builder setParentClass(org.gtk.gobject.ObjectClass parentClass) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
            return this;
        }
        
        public Builder setNextFile(NextFileCallback nextFile) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("next_file"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (nextFile == null ? MemoryAddress.NULL : nextFile.toCallback()));
            return this;
        }
        
        public Builder setCloseFn(CloseFnCallback closeFn) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("close_fn"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (closeFn == null ? MemoryAddress.NULL : closeFn.toCallback()));
            return this;
        }
        
        public Builder setNextFilesAsync(NextFilesAsyncCallback nextFilesAsync) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("next_files_async"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (nextFilesAsync == null ? MemoryAddress.NULL : nextFilesAsync.toCallback()));
            return this;
        }
        
        public Builder setNextFilesFinish(NextFilesFinishCallback nextFilesFinish) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("next_files_finish"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (nextFilesFinish == null ? MemoryAddress.NULL : nextFilesFinish.toCallback()));
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
        
        public Builder setGReserved1(GReserved1Callback GReserved1) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("_g_reserved1"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (GReserved1 == null ? MemoryAddress.NULL : GReserved1.toCallback()));
            return this;
        }
        
        public Builder setGReserved2(GReserved2Callback GReserved2) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("_g_reserved2"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (GReserved2 == null ? MemoryAddress.NULL : GReserved2.toCallback()));
            return this;
        }
        
        public Builder setGReserved3(GReserved3Callback GReserved3) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("_g_reserved3"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (GReserved3 == null ? MemoryAddress.NULL : GReserved3.toCallback()));
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
    }
}
