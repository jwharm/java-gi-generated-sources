package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The class for {@link TlsInteraction}. Derived classes implement the various
 * virtual interaction methods to handle TLS interactions.
 * <p>
 * Derived classes can choose to implement whichever interactions methods they'd
 * like to support by overriding those virtual methods in their class
 * initialization function. If a derived class implements an async method,
 * it must also implement the corresponding finish method.
 * <p>
 * The synchronous interaction methods should implement to display modal dialogs,
 * and the asynchronous methods to display modeless dialogs.
 * <p>
 * If the user cancels an interaction, then the result should be
 * {@link TlsInteractionResult#FAILED} and the error should be set with a domain of
 * {@code G_IO_ERROR} and code of {@link IOErrorEnum#CANCELLED}.
 * @version 2.30
 */
public class TlsInteractionClass extends Struct {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GTlsInteractionClass";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gtk.gobject.ObjectClass.getMemoryLayout().withName("parent_class"),
            Interop.valueLayout.ADDRESS.withName("ask_password"),
            Interop.valueLayout.ADDRESS.withName("ask_password_async"),
            Interop.valueLayout.ADDRESS.withName("ask_password_finish"),
            Interop.valueLayout.ADDRESS.withName("request_certificate"),
            Interop.valueLayout.ADDRESS.withName("request_certificate_async"),
            Interop.valueLayout.ADDRESS.withName("request_certificate_finish"),
            MemoryLayout.sequenceLayout(21, Interop.valueLayout.ADDRESS).withName("padding")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link TlsInteractionClass}
     * @return A new, uninitialized @{link TlsInteractionClass}
     */
    public static TlsInteractionClass allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        TlsInteractionClass newInstance = new TlsInteractionClass(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Functional interface declaration of the {@code AskPasswordCallback} callback.
     */
    @FunctionalInterface
    public interface AskPasswordCallback {
    
        org.gtk.gio.TlsInteractionResult run(org.gtk.gio.TlsInteraction interaction, org.gtk.gio.TlsPassword password, @Nullable org.gtk.gio.Cancellable cancellable);
        
        @ApiStatus.Internal default int upcall(MemoryAddress interaction, MemoryAddress password, MemoryAddress cancellable) {
            var RESULT = run((org.gtk.gio.TlsInteraction) Interop.register(interaction, org.gtk.gio.TlsInteraction.fromAddress).marshal(interaction, null), (org.gtk.gio.TlsPassword) Interop.register(password, org.gtk.gio.TlsPassword.fromAddress).marshal(password, null), (org.gtk.gio.Cancellable) Interop.register(cancellable, org.gtk.gio.Cancellable.fromAddress).marshal(cancellable, null));
            return RESULT.getValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
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
     * Functional interface declaration of the {@code AskPasswordAsyncCallback} callback.
     */
    @FunctionalInterface
    public interface AskPasswordAsyncCallback {
    
        void run(org.gtk.gio.TlsInteraction interaction, org.gtk.gio.TlsPassword password, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.AsyncReadyCallback callback);
        
        @ApiStatus.Internal default void upcall(MemoryAddress interaction, MemoryAddress password, MemoryAddress cancellable, MemoryAddress callback, MemoryAddress userData) {
            run((org.gtk.gio.TlsInteraction) Interop.register(interaction, org.gtk.gio.TlsInteraction.fromAddress).marshal(interaction, null), (org.gtk.gio.TlsPassword) Interop.register(password, org.gtk.gio.TlsPassword.fromAddress).marshal(password, null), (org.gtk.gio.Cancellable) Interop.register(cancellable, org.gtk.gio.Cancellable.fromAddress).marshal(cancellable, null), null /* Unsupported parameter type */);
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), AskPasswordAsyncCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code ask_password_async}
     * @param askPasswordAsync The new value of the field {@code ask_password_async}
     */
    public void setAskPasswordAsync(AskPasswordAsyncCallback askPasswordAsync) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("ask_password_async"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (askPasswordAsync == null ? MemoryAddress.NULL : askPasswordAsync.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code AskPasswordFinishCallback} callback.
     */
    @FunctionalInterface
    public interface AskPasswordFinishCallback {
    
        org.gtk.gio.TlsInteractionResult run(org.gtk.gio.TlsInteraction interaction, org.gtk.gio.AsyncResult result);
        
        @ApiStatus.Internal default int upcall(MemoryAddress interaction, MemoryAddress result) {
            var RESULT = run((org.gtk.gio.TlsInteraction) Interop.register(interaction, org.gtk.gio.TlsInteraction.fromAddress).marshal(interaction, null), (org.gtk.gio.AsyncResult) Interop.register(result, org.gtk.gio.AsyncResult.fromAddress).marshal(result, null));
            return RESULT.getValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), AskPasswordFinishCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code ask_password_finish}
     * @param askPasswordFinish The new value of the field {@code ask_password_finish}
     */
    public void setAskPasswordFinish(AskPasswordFinishCallback askPasswordFinish) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("ask_password_finish"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (askPasswordFinish == null ? MemoryAddress.NULL : askPasswordFinish.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code RequestCertificateCallback} callback.
     */
    @FunctionalInterface
    public interface RequestCertificateCallback {
    
        org.gtk.gio.TlsInteractionResult run(org.gtk.gio.TlsInteraction interaction, org.gtk.gio.TlsConnection connection, org.gtk.gio.TlsCertificateRequestFlags flags, @Nullable org.gtk.gio.Cancellable cancellable);
        
        @ApiStatus.Internal default int upcall(MemoryAddress interaction, MemoryAddress connection, int flags, MemoryAddress cancellable) {
            var RESULT = run((org.gtk.gio.TlsInteraction) Interop.register(interaction, org.gtk.gio.TlsInteraction.fromAddress).marshal(interaction, null), (org.gtk.gio.TlsConnection) Interop.register(connection, org.gtk.gio.TlsConnection.fromAddress).marshal(connection, null), org.gtk.gio.TlsCertificateRequestFlags.of(flags), (org.gtk.gio.Cancellable) Interop.register(cancellable, org.gtk.gio.Cancellable.fromAddress).marshal(cancellable, null));
            return RESULT.getValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), RequestCertificateCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code request_certificate}
     * @param requestCertificate The new value of the field {@code request_certificate}
     */
    public void setRequestCertificate(RequestCertificateCallback requestCertificate) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("request_certificate"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (requestCertificate == null ? MemoryAddress.NULL : requestCertificate.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code RequestCertificateAsyncCallback} callback.
     */
    @FunctionalInterface
    public interface RequestCertificateAsyncCallback {
    
        void run(org.gtk.gio.TlsInteraction interaction, org.gtk.gio.TlsConnection connection, org.gtk.gio.TlsCertificateRequestFlags flags, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.AsyncReadyCallback callback);
        
        @ApiStatus.Internal default void upcall(MemoryAddress interaction, MemoryAddress connection, int flags, MemoryAddress cancellable, MemoryAddress callback, MemoryAddress userData) {
            run((org.gtk.gio.TlsInteraction) Interop.register(interaction, org.gtk.gio.TlsInteraction.fromAddress).marshal(interaction, null), (org.gtk.gio.TlsConnection) Interop.register(connection, org.gtk.gio.TlsConnection.fromAddress).marshal(connection, null), org.gtk.gio.TlsCertificateRequestFlags.of(flags), (org.gtk.gio.Cancellable) Interop.register(cancellable, org.gtk.gio.Cancellable.fromAddress).marshal(cancellable, null), null /* Unsupported parameter type */);
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), RequestCertificateAsyncCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code request_certificate_async}
     * @param requestCertificateAsync The new value of the field {@code request_certificate_async}
     */
    public void setRequestCertificateAsync(RequestCertificateAsyncCallback requestCertificateAsync) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("request_certificate_async"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (requestCertificateAsync == null ? MemoryAddress.NULL : requestCertificateAsync.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code RequestCertificateFinishCallback} callback.
     */
    @FunctionalInterface
    public interface RequestCertificateFinishCallback {
    
        org.gtk.gio.TlsInteractionResult run(org.gtk.gio.TlsInteraction interaction, org.gtk.gio.AsyncResult result);
        
        @ApiStatus.Internal default int upcall(MemoryAddress interaction, MemoryAddress result) {
            var RESULT = run((org.gtk.gio.TlsInteraction) Interop.register(interaction, org.gtk.gio.TlsInteraction.fromAddress).marshal(interaction, null), (org.gtk.gio.AsyncResult) Interop.register(result, org.gtk.gio.AsyncResult.fromAddress).marshal(result, null));
            return RESULT.getValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), RequestCertificateFinishCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code request_certificate_finish}
     * @param requestCertificateFinish The new value of the field {@code request_certificate_finish}
     */
    public void setRequestCertificateFinish(RequestCertificateFinishCallback requestCertificateFinish) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("request_certificate_finish"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (requestCertificateFinish == null ? MemoryAddress.NULL : requestCertificateFinish.toCallback()));
        }
    }
    
    /**
     * Create a TlsInteractionClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected TlsInteractionClass(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, TlsInteractionClass> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new TlsInteractionClass(input);
    
    /**
     * A {@link TlsInteractionClass.Builder} object constructs a {@link TlsInteractionClass} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link TlsInteractionClass.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final TlsInteractionClass struct;
        
        private Builder() {
            struct = TlsInteractionClass.allocate();
        }
        
        /**
         * Finish building the {@link TlsInteractionClass} struct.
         * @return A new instance of {@code TlsInteractionClass} with the fields 
         *         that were set in the Builder object.
         */
        public TlsInteractionClass build() {
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
        
        public Builder setAskPasswordAsync(AskPasswordAsyncCallback askPasswordAsync) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("ask_password_async"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (askPasswordAsync == null ? MemoryAddress.NULL : askPasswordAsync.toCallback()));
                return this;
            }
        }
        
        public Builder setAskPasswordFinish(AskPasswordFinishCallback askPasswordFinish) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("ask_password_finish"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (askPasswordFinish == null ? MemoryAddress.NULL : askPasswordFinish.toCallback()));
                return this;
            }
        }
        
        public Builder setRequestCertificate(RequestCertificateCallback requestCertificate) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("request_certificate"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (requestCertificate == null ? MemoryAddress.NULL : requestCertificate.toCallback()));
                return this;
            }
        }
        
        public Builder setRequestCertificateAsync(RequestCertificateAsyncCallback requestCertificateAsync) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("request_certificate_async"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (requestCertificateAsync == null ? MemoryAddress.NULL : requestCertificateAsync.toCallback()));
                return this;
            }
        }
        
        public Builder setRequestCertificateFinish(RequestCertificateFinishCallback requestCertificateFinish) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("request_certificate_finish"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (requestCertificateFinish == null ? MemoryAddress.NULL : requestCertificateFinish.toCallback()));
                return this;
            }
        }
        
        public Builder setPadding(java.lang.foreign.MemoryAddress[] padding) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("padding"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (padding == null ? MemoryAddress.NULL : Interop.allocateNativeArray(padding, false, SCOPE)));
                return this;
            }
        }
    }
}
