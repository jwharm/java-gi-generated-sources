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
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        TlsInteractionClass newInstance = new TlsInteractionClass(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    @FunctionalInterface
    public interface AskPasswordCallback {
        org.gtk.gio.TlsInteractionResult run(org.gtk.gio.TlsInteraction interaction, org.gtk.gio.TlsPassword password, @Nullable org.gtk.gio.Cancellable cancellable);

        @ApiStatus.Internal default int upcall(MemoryAddress interaction, MemoryAddress password, MemoryAddress cancellable) {
            var RESULT = run((org.gtk.gio.TlsInteraction) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(interaction)), org.gtk.gio.TlsInteraction.fromAddress).marshal(interaction, Ownership.NONE), (org.gtk.gio.TlsPassword) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(password)), org.gtk.gio.TlsPassword.fromAddress).marshal(password, Ownership.NONE), (org.gtk.gio.Cancellable) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(cancellable)), org.gtk.gio.Cancellable.fromAddress).marshal(cancellable, Ownership.NONE));
            return RESULT.getValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
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
    public interface AskPasswordAsyncCallback {
        void run(org.gtk.gio.TlsInteraction interaction, org.gtk.gio.TlsPassword password, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.AsyncReadyCallback callback);

        @ApiStatus.Internal default void upcall(MemoryAddress interaction, MemoryAddress password, MemoryAddress cancellable, MemoryAddress callback, MemoryAddress userData) {
            run((org.gtk.gio.TlsInteraction) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(interaction)), org.gtk.gio.TlsInteraction.fromAddress).marshal(interaction, Ownership.NONE), (org.gtk.gio.TlsPassword) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(password)), org.gtk.gio.TlsPassword.fromAddress).marshal(password, Ownership.NONE), (org.gtk.gio.Cancellable) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(cancellable)), org.gtk.gio.Cancellable.fromAddress).marshal(cancellable, Ownership.NONE), null /* Unsupported parameter type */);
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(AskPasswordAsyncCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code ask_password_async}
     * @param askPasswordAsync The new value of the field {@code ask_password_async}
     */
    public void setAskPasswordAsync(AskPasswordAsyncCallback askPasswordAsync) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("ask_password_async"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (askPasswordAsync == null ? MemoryAddress.NULL : askPasswordAsync.toCallback()));
    }
    
    @FunctionalInterface
    public interface AskPasswordFinishCallback {
        org.gtk.gio.TlsInteractionResult run(org.gtk.gio.TlsInteraction interaction, org.gtk.gio.AsyncResult result);

        @ApiStatus.Internal default int upcall(MemoryAddress interaction, MemoryAddress result) {
            var RESULT = run((org.gtk.gio.TlsInteraction) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(interaction)), org.gtk.gio.TlsInteraction.fromAddress).marshal(interaction, Ownership.NONE), (org.gtk.gio.AsyncResult) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(result)), org.gtk.gio.AsyncResult.fromAddress).marshal(result, Ownership.NONE));
            return RESULT.getValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(AskPasswordFinishCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code ask_password_finish}
     * @param askPasswordFinish The new value of the field {@code ask_password_finish}
     */
    public void setAskPasswordFinish(AskPasswordFinishCallback askPasswordFinish) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("ask_password_finish"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (askPasswordFinish == null ? MemoryAddress.NULL : askPasswordFinish.toCallback()));
    }
    
    @FunctionalInterface
    public interface RequestCertificateCallback {
        org.gtk.gio.TlsInteractionResult run(org.gtk.gio.TlsInteraction interaction, org.gtk.gio.TlsConnection connection, org.gtk.gio.TlsCertificateRequestFlags flags, @Nullable org.gtk.gio.Cancellable cancellable);

        @ApiStatus.Internal default int upcall(MemoryAddress interaction, MemoryAddress connection, int flags, MemoryAddress cancellable) {
            var RESULT = run((org.gtk.gio.TlsInteraction) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(interaction)), org.gtk.gio.TlsInteraction.fromAddress).marshal(interaction, Ownership.NONE), (org.gtk.gio.TlsConnection) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(connection)), org.gtk.gio.TlsConnection.fromAddress).marshal(connection, Ownership.NONE), org.gtk.gio.TlsCertificateRequestFlags.of(flags), (org.gtk.gio.Cancellable) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(cancellable)), org.gtk.gio.Cancellable.fromAddress).marshal(cancellable, Ownership.NONE));
            return RESULT.getValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(RequestCertificateCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code request_certificate}
     * @param requestCertificate The new value of the field {@code request_certificate}
     */
    public void setRequestCertificate(RequestCertificateCallback requestCertificate) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("request_certificate"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (requestCertificate == null ? MemoryAddress.NULL : requestCertificate.toCallback()));
    }
    
    @FunctionalInterface
    public interface RequestCertificateAsyncCallback {
        void run(org.gtk.gio.TlsInteraction interaction, org.gtk.gio.TlsConnection connection, org.gtk.gio.TlsCertificateRequestFlags flags, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.AsyncReadyCallback callback);

        @ApiStatus.Internal default void upcall(MemoryAddress interaction, MemoryAddress connection, int flags, MemoryAddress cancellable, MemoryAddress callback, MemoryAddress userData) {
            run((org.gtk.gio.TlsInteraction) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(interaction)), org.gtk.gio.TlsInteraction.fromAddress).marshal(interaction, Ownership.NONE), (org.gtk.gio.TlsConnection) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(connection)), org.gtk.gio.TlsConnection.fromAddress).marshal(connection, Ownership.NONE), org.gtk.gio.TlsCertificateRequestFlags.of(flags), (org.gtk.gio.Cancellable) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(cancellable)), org.gtk.gio.Cancellable.fromAddress).marshal(cancellable, Ownership.NONE), null /* Unsupported parameter type */);
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(RequestCertificateAsyncCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code request_certificate_async}
     * @param requestCertificateAsync The new value of the field {@code request_certificate_async}
     */
    public void setRequestCertificateAsync(RequestCertificateAsyncCallback requestCertificateAsync) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("request_certificate_async"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (requestCertificateAsync == null ? MemoryAddress.NULL : requestCertificateAsync.toCallback()));
    }
    
    @FunctionalInterface
    public interface RequestCertificateFinishCallback {
        org.gtk.gio.TlsInteractionResult run(org.gtk.gio.TlsInteraction interaction, org.gtk.gio.AsyncResult result);

        @ApiStatus.Internal default int upcall(MemoryAddress interaction, MemoryAddress result) {
            var RESULT = run((org.gtk.gio.TlsInteraction) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(interaction)), org.gtk.gio.TlsInteraction.fromAddress).marshal(interaction, Ownership.NONE), (org.gtk.gio.AsyncResult) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(result)), org.gtk.gio.AsyncResult.fromAddress).marshal(result, Ownership.NONE));
            return RESULT.getValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(RequestCertificateFinishCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code request_certificate_finish}
     * @param requestCertificateFinish The new value of the field {@code request_certificate_finish}
     */
    public void setRequestCertificateFinish(RequestCertificateFinishCallback requestCertificateFinish) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("request_certificate_finish"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (requestCertificateFinish == null ? MemoryAddress.NULL : requestCertificateFinish.toCallback()));
    }
    
    /**
     * Create a TlsInteractionClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected TlsInteractionClass(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, TlsInteractionClass> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new TlsInteractionClass(input, ownership);
    
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
        
        public Builder setAskPasswordAsync(AskPasswordAsyncCallback askPasswordAsync) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("ask_password_async"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (askPasswordAsync == null ? MemoryAddress.NULL : askPasswordAsync.toCallback()));
            return this;
        }
        
        public Builder setAskPasswordFinish(AskPasswordFinishCallback askPasswordFinish) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("ask_password_finish"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (askPasswordFinish == null ? MemoryAddress.NULL : askPasswordFinish.toCallback()));
            return this;
        }
        
        public Builder setRequestCertificate(RequestCertificateCallback requestCertificate) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("request_certificate"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (requestCertificate == null ? MemoryAddress.NULL : requestCertificate.toCallback()));
            return this;
        }
        
        public Builder setRequestCertificateAsync(RequestCertificateAsyncCallback requestCertificateAsync) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("request_certificate_async"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (requestCertificateAsync == null ? MemoryAddress.NULL : requestCertificateAsync.toCallback()));
            return this;
        }
        
        public Builder setRequestCertificateFinish(RequestCertificateFinishCallback requestCertificateFinish) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("request_certificate_finish"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (requestCertificateFinish == null ? MemoryAddress.NULL : requestCertificateFinish.toCallback()));
            return this;
        }
        
        public Builder setPadding(java.lang.foreign.MemoryAddress[] padding) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("padding"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (padding == null ? MemoryAddress.NULL : Interop.allocateNativeArray(padding, false)));
            return this;
        }
    }
}
