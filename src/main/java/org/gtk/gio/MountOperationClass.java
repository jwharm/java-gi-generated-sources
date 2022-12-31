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
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        MountOperationClass newInstance = new MountOperationClass(segment.address(), Ownership.NONE);
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
    public interface AskPasswordCallback {
        void run(org.gtk.gio.MountOperation op, java.lang.String message, java.lang.String defaultUser, java.lang.String defaultDomain, org.gtk.gio.AskPasswordFlags flags);

        @ApiStatus.Internal default void upcall(MemoryAddress op, MemoryAddress message, MemoryAddress defaultUser, MemoryAddress defaultDomain, int flags) {
            run((org.gtk.gio.MountOperation) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(op)), org.gtk.gio.MountOperation.fromAddress).marshal(op, Ownership.NONE), Marshal.addressToString.marshal(message, null), Marshal.addressToString.marshal(defaultUser, null), Marshal.addressToString.marshal(defaultDomain, null), new org.gtk.gio.AskPasswordFlags(flags));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(AskPasswordCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code ask_password}
     * @param askPassword The new value of the field {@code ask_password}
     */
    public void setAskPassword(AskPasswordCallback askPassword) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("ask_password"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (askPassword == null ? MemoryAddress.NULL : askPassword.toCallback()));
    }
    
    @FunctionalInterface
    public interface AskQuestionCallback {
        void run(org.gtk.gio.MountOperation op, java.lang.String message, PointerString choices);

        @ApiStatus.Internal default void upcall(MemoryAddress op, MemoryAddress message, MemoryAddress choices) {
            run((org.gtk.gio.MountOperation) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(op)), org.gtk.gio.MountOperation.fromAddress).marshal(op, Ownership.NONE), Marshal.addressToString.marshal(message, null), new PointerString(choices));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(AskQuestionCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code ask_question}
     * @param askQuestion The new value of the field {@code ask_question}
     */
    public void setAskQuestion(AskQuestionCallback askQuestion) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("ask_question"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (askQuestion == null ? MemoryAddress.NULL : askQuestion.toCallback()));
    }
    
    @FunctionalInterface
    public interface ReplyCallback {
        void run(org.gtk.gio.MountOperation op, org.gtk.gio.MountOperationResult result);

        @ApiStatus.Internal default void upcall(MemoryAddress op, int result) {
            run((org.gtk.gio.MountOperation) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(op)), org.gtk.gio.MountOperation.fromAddress).marshal(op, Ownership.NONE), org.gtk.gio.MountOperationResult.of(result));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(ReplyCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code reply}
     * @param reply The new value of the field {@code reply}
     */
    public void setReply(ReplyCallback reply) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("reply"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (reply == null ? MemoryAddress.NULL : reply.toCallback()));
    }
    
    @FunctionalInterface
    public interface AbortedCallback {
        void run(org.gtk.gio.MountOperation op);

        @ApiStatus.Internal default void upcall(MemoryAddress op) {
            run((org.gtk.gio.MountOperation) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(op)), org.gtk.gio.MountOperation.fromAddress).marshal(op, Ownership.NONE));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(AbortedCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code aborted}
     * @param aborted The new value of the field {@code aborted}
     */
    public void setAborted(AbortedCallback aborted) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("aborted"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (aborted == null ? MemoryAddress.NULL : aborted.toCallback()));
    }
    
    @FunctionalInterface
    public interface ShowProcessesCallback {
        void run(org.gtk.gio.MountOperation op, java.lang.String message, PointerInteger processes, PointerString choices);

        @ApiStatus.Internal default void upcall(MemoryAddress op, MemoryAddress message, MemoryAddress processes, MemoryAddress choices) {
            run((org.gtk.gio.MountOperation) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(op)), org.gtk.gio.MountOperation.fromAddress).marshal(op, Ownership.NONE), Marshal.addressToString.marshal(message, null), new PointerInteger(processes), new PointerString(choices));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(ShowProcessesCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code show_processes}
     * @param showProcesses The new value of the field {@code show_processes}
     */
    public void setShowProcesses(ShowProcessesCallback showProcesses) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("show_processes"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (showProcesses == null ? MemoryAddress.NULL : showProcesses.toCallback()));
    }
    
    @FunctionalInterface
    public interface ShowUnmountProgressCallback {
        void run(org.gtk.gio.MountOperation op, java.lang.String message, long timeLeft, long bytesLeft);

        @ApiStatus.Internal default void upcall(MemoryAddress op, MemoryAddress message, long timeLeft, long bytesLeft) {
            run((org.gtk.gio.MountOperation) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(op)), org.gtk.gio.MountOperation.fromAddress).marshal(op, Ownership.NONE), Marshal.addressToString.marshal(message, null), timeLeft, bytesLeft);
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.C_LONG);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(ShowUnmountProgressCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code show_unmount_progress}
     * @param showUnmountProgress The new value of the field {@code show_unmount_progress}
     */
    public void setShowUnmountProgress(ShowUnmountProgressCallback showUnmountProgress) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("show_unmount_progress"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (showUnmountProgress == null ? MemoryAddress.NULL : showUnmountProgress.toCallback()));
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
    
    @FunctionalInterface
    public interface GReserved9Callback {
        void run();

        @ApiStatus.Internal default void upcall() {
            run();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid();
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(GReserved9Callback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code _g_reserved9}
     * @param GReserved9 The new value of the field {@code _g_reserved9}
     */
    public void setGReserved9(GReserved9Callback GReserved9) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("_g_reserved9"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (GReserved9 == null ? MemoryAddress.NULL : GReserved9.toCallback()));
    }
    
    /**
     * Create a MountOperationClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected MountOperationClass(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, MountOperationClass> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new MountOperationClass(input, ownership);
    
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
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
            return this;
        }
        
        public Builder setAskPassword(AskPasswordCallback askPassword) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("ask_password"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (askPassword == null ? MemoryAddress.NULL : askPassword.toCallback()));
            return this;
        }
        
        public Builder setAskQuestion(AskQuestionCallback askQuestion) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("ask_question"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (askQuestion == null ? MemoryAddress.NULL : askQuestion.toCallback()));
            return this;
        }
        
        public Builder setReply(ReplyCallback reply) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("reply"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (reply == null ? MemoryAddress.NULL : reply.toCallback()));
            return this;
        }
        
        public Builder setAborted(AbortedCallback aborted) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("aborted"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (aborted == null ? MemoryAddress.NULL : aborted.toCallback()));
            return this;
        }
        
        public Builder setShowProcesses(ShowProcessesCallback showProcesses) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("show_processes"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (showProcesses == null ? MemoryAddress.NULL : showProcesses.toCallback()));
            return this;
        }
        
        public Builder setShowUnmountProgress(ShowUnmountProgressCallback showUnmountProgress) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("show_unmount_progress"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (showUnmountProgress == null ? MemoryAddress.NULL : showUnmountProgress.toCallback()));
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
        
        public Builder setGReserved8(GReserved8Callback GReserved8) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("_g_reserved8"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (GReserved8 == null ? MemoryAddress.NULL : GReserved8.toCallback()));
            return this;
        }
        
        public Builder setGReserved9(GReserved9Callback GReserved9) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("_g_reserved9"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (GReserved9 == null ? MemoryAddress.NULL : GReserved9.toCallback()));
            return this;
        }
    }
}
