package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class MountOperationClass extends Struct {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GMountOperationClass";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gtk.gobject.ObjectClass.getMemoryLayout().withName("parent_class"),
            Interop.valueLayout.ADDRESS.withName("ask_password"),
            Interop.valueLayout.ADDRESS.withName("ask_question"),
            Interop.valueLayout.ADDRESS.withName("reply"),
            Interop.valueLayout.ADDRESS.withName("aborted"),
            Interop.valueLayout.ADDRESS.withName("show_processes"),
            Interop.valueLayout.ADDRESS.withName("show_unmount_progress"),
            Interop.valueLayout.ADDRESS.withName("_g_reserved1"),
            Interop.valueLayout.ADDRESS.withName("_g_reserved2"),
            Interop.valueLayout.ADDRESS.withName("_g_reserved3"),
            Interop.valueLayout.ADDRESS.withName("_g_reserved4"),
            Interop.valueLayout.ADDRESS.withName("_g_reserved5"),
            Interop.valueLayout.ADDRESS.withName("_g_reserved6"),
            Interop.valueLayout.ADDRESS.withName("_g_reserved7"),
            Interop.valueLayout.ADDRESS.withName("_g_reserved8"),
            Interop.valueLayout.ADDRESS.withName("_g_reserved9")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link MountOperationClass}
     * @return A new, uninitialized @{link MountOperationClass}
     */
    public static MountOperationClass allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        MountOperationClass newInstance = new MountOperationClass(segment.address());
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
     * Functional interface declaration of the {@code AskPasswordCallback} callback.
     */
    @FunctionalInterface
    public interface AskPasswordCallback {
    
        void run(org.gtk.gio.MountOperation op, java.lang.String message, java.lang.String defaultUser, java.lang.String defaultDomain, org.gtk.gio.AskPasswordFlags flags);
        
        @ApiStatus.Internal default void upcall(MemoryAddress op, MemoryAddress message, MemoryAddress defaultUser, MemoryAddress defaultDomain, int flags) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                run((org.gtk.gio.MountOperation) Interop.register(op, org.gtk.gio.MountOperation.fromAddress).marshal(op, null), Marshal.addressToString.marshal(message, null), Marshal.addressToString.marshal(defaultUser, null), Marshal.addressToString.marshal(defaultDomain, null), new org.gtk.gio.AskPasswordFlags(flags));
            }
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), AskPasswordCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code ask_password}
     * @param askPassword The new value of the field {@code ask_password}
     */
    public void setAskPassword(AskPasswordCallback askPassword) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("ask_password"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (askPassword == null ? MemoryAddress.NULL : askPassword.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code AskQuestionCallback} callback.
     */
    @FunctionalInterface
    public interface AskQuestionCallback {
    
        void run(org.gtk.gio.MountOperation op, java.lang.String message, PointerString choices);
        
        @ApiStatus.Internal default void upcall(MemoryAddress op, MemoryAddress message, MemoryAddress choices) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                run((org.gtk.gio.MountOperation) Interop.register(op, org.gtk.gio.MountOperation.fromAddress).marshal(op, null), Marshal.addressToString.marshal(message, null), new PointerString(choices));
            }
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), AskQuestionCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code ask_question}
     * @param askQuestion The new value of the field {@code ask_question}
     */
    public void setAskQuestion(AskQuestionCallback askQuestion) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("ask_question"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (askQuestion == null ? MemoryAddress.NULL : askQuestion.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code ReplyCallback} callback.
     */
    @FunctionalInterface
    public interface ReplyCallback {
    
        void run(org.gtk.gio.MountOperation op, org.gtk.gio.MountOperationResult result);
        
        @ApiStatus.Internal default void upcall(MemoryAddress op, int result) {
            run((org.gtk.gio.MountOperation) Interop.register(op, org.gtk.gio.MountOperation.fromAddress).marshal(op, null), org.gtk.gio.MountOperationResult.of(result));
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), ReplyCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code reply}
     * @param reply The new value of the field {@code reply}
     */
    public void setReply(ReplyCallback reply) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("reply"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (reply == null ? MemoryAddress.NULL : reply.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code AbortedCallback} callback.
     */
    @FunctionalInterface
    public interface AbortedCallback {
    
        void run(org.gtk.gio.MountOperation op);
        
        @ApiStatus.Internal default void upcall(MemoryAddress op) {
            run((org.gtk.gio.MountOperation) Interop.register(op, org.gtk.gio.MountOperation.fromAddress).marshal(op, null));
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), AbortedCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code aborted}
     * @param aborted The new value of the field {@code aborted}
     */
    public void setAborted(AbortedCallback aborted) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("aborted"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (aborted == null ? MemoryAddress.NULL : aborted.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code ShowProcessesCallback} callback.
     */
    @FunctionalInterface
    public interface ShowProcessesCallback {
    
        void run(org.gtk.gio.MountOperation op, java.lang.String message, PointerInteger processes, PointerString choices);
        
        @ApiStatus.Internal default void upcall(MemoryAddress op, MemoryAddress message, MemoryAddress processes, MemoryAddress choices) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                run((org.gtk.gio.MountOperation) Interop.register(op, org.gtk.gio.MountOperation.fromAddress).marshal(op, null), Marshal.addressToString.marshal(message, null), new PointerInteger(processes), new PointerString(choices));
            }
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), ShowProcessesCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code show_processes}
     * @param showProcesses The new value of the field {@code show_processes}
     */
    public void setShowProcesses(ShowProcessesCallback showProcesses) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("show_processes"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (showProcesses == null ? MemoryAddress.NULL : showProcesses.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code ShowUnmountProgressCallback} callback.
     */
    @FunctionalInterface
    public interface ShowUnmountProgressCallback {
    
        void run(org.gtk.gio.MountOperation op, java.lang.String message, long timeLeft, long bytesLeft);
        
        @ApiStatus.Internal default void upcall(MemoryAddress op, MemoryAddress message, long timeLeft, long bytesLeft) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                run((org.gtk.gio.MountOperation) Interop.register(op, org.gtk.gio.MountOperation.fromAddress).marshal(op, null), Marshal.addressToString.marshal(message, null), timeLeft, bytesLeft);
            }
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.C_LONG);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), ShowUnmountProgressCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code show_unmount_progress}
     * @param showUnmountProgress The new value of the field {@code show_unmount_progress}
     */
    public void setShowUnmountProgress(ShowUnmountProgressCallback showUnmountProgress) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("show_unmount_progress"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (showUnmountProgress == null ? MemoryAddress.NULL : showUnmountProgress.toCallback()));
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
     * Functional interface declaration of the {@code GReserved6Callback} callback.
     */
    @FunctionalInterface
    public interface GReserved6Callback {
    
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
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), GReserved6Callback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code _g_reserved6}
     * @param GReserved6 The new value of the field {@code _g_reserved6}
     */
    public void setGReserved6(GReserved6Callback GReserved6) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("_g_reserved6"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (GReserved6 == null ? MemoryAddress.NULL : GReserved6.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code GReserved7Callback} callback.
     */
    @FunctionalInterface
    public interface GReserved7Callback {
    
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
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), GReserved7Callback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code _g_reserved7}
     * @param GReserved7 The new value of the field {@code _g_reserved7}
     */
    public void setGReserved7(GReserved7Callback GReserved7) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("_g_reserved7"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (GReserved7 == null ? MemoryAddress.NULL : GReserved7.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code GReserved8Callback} callback.
     */
    @FunctionalInterface
    public interface GReserved8Callback {
    
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
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), GReserved8Callback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code _g_reserved8}
     * @param GReserved8 The new value of the field {@code _g_reserved8}
     */
    public void setGReserved8(GReserved8Callback GReserved8) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("_g_reserved8"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (GReserved8 == null ? MemoryAddress.NULL : GReserved8.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code GReserved9Callback} callback.
     */
    @FunctionalInterface
    public interface GReserved9Callback {
    
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
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), GReserved9Callback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code _g_reserved9}
     * @param GReserved9 The new value of the field {@code _g_reserved9}
     */
    public void setGReserved9(GReserved9Callback GReserved9) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("_g_reserved9"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (GReserved9 == null ? MemoryAddress.NULL : GReserved9.toCallback()));
        }
    }
    
    /**
     * Create a MountOperationClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected MountOperationClass(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, MountOperationClass> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new MountOperationClass(input);
    
    /**
     * A {@link MountOperationClass.Builder} object constructs a {@link MountOperationClass} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link MountOperationClass.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final MountOperationClass struct;
        
        private Builder() {
            struct = MountOperationClass.allocate();
        }
        
        /**
         * Finish building the {@link MountOperationClass} struct.
         * @return A new instance of {@code MountOperationClass} with the fields 
         *         that were set in the Builder object.
         */
        public MountOperationClass build() {
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
        
        public Builder setAskPassword(AskPasswordCallback askPassword) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("ask_password"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (askPassword == null ? MemoryAddress.NULL : askPassword.toCallback()));
                return this;
            }
        }
        
        public Builder setAskQuestion(AskQuestionCallback askQuestion) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("ask_question"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (askQuestion == null ? MemoryAddress.NULL : askQuestion.toCallback()));
                return this;
            }
        }
        
        public Builder setReply(ReplyCallback reply) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("reply"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (reply == null ? MemoryAddress.NULL : reply.toCallback()));
                return this;
            }
        }
        
        public Builder setAborted(AbortedCallback aborted) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("aborted"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (aborted == null ? MemoryAddress.NULL : aborted.toCallback()));
                return this;
            }
        }
        
        public Builder setShowProcesses(ShowProcessesCallback showProcesses) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("show_processes"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (showProcesses == null ? MemoryAddress.NULL : showProcesses.toCallback()));
                return this;
            }
        }
        
        public Builder setShowUnmountProgress(ShowUnmountProgressCallback showUnmountProgress) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("show_unmount_progress"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (showUnmountProgress == null ? MemoryAddress.NULL : showUnmountProgress.toCallback()));
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
        
        public Builder setGReserved6(GReserved6Callback GReserved6) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("_g_reserved6"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (GReserved6 == null ? MemoryAddress.NULL : GReserved6.toCallback()));
                return this;
            }
        }
        
        public Builder setGReserved7(GReserved7Callback GReserved7) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("_g_reserved7"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (GReserved7 == null ? MemoryAddress.NULL : GReserved7.toCallback()));
                return this;
            }
        }
        
        public Builder setGReserved8(GReserved8Callback GReserved8) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("_g_reserved8"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (GReserved8 == null ? MemoryAddress.NULL : GReserved8.toCallback()));
                return this;
            }
        }
        
        public Builder setGReserved9(GReserved9Callback GReserved9) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("_g_reserved9"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (GReserved9 == null ? MemoryAddress.NULL : GReserved9.toCallback()));
                return this;
            }
        }
    }
}
