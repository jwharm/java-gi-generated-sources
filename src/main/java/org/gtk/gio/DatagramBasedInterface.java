package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Provides an interface for socket-like objects which have datagram semantics,
 * following the Berkeley sockets API. The interface methods are thin wrappers
 * around the corresponding virtual methods, and no pre-processing of inputs is
 * implemented — so implementations of this API must handle all functionality
 * documented in the interface methods.
 * @version 2.48
 */
public class DatagramBasedInterface extends Struct {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GDatagramBasedInterface";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gtk.gobject.TypeInterface.getMemoryLayout().withName("g_iface"),
            Interop.valueLayout.ADDRESS.withName("receive_messages"),
            Interop.valueLayout.ADDRESS.withName("send_messages"),
            Interop.valueLayout.ADDRESS.withName("create_source"),
            Interop.valueLayout.ADDRESS.withName("condition_check"),
            Interop.valueLayout.ADDRESS.withName("condition_wait")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link DatagramBasedInterface}
     * @return A new, uninitialized @{link DatagramBasedInterface}
     */
    public static DatagramBasedInterface allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        DatagramBasedInterface newInstance = new DatagramBasedInterface(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code g_iface}
     * @return The value of the field {@code g_iface}
     */
    public org.gtk.gobject.TypeInterface getGIface() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("g_iface"));
        return org.gtk.gobject.TypeInterface.fromAddress.marshal(((MemoryAddress) handle()).addOffset(OFFSET), null);
    }
    
    /**
     * Change the value of the field {@code g_iface}
     * @param gIface The new value of the field {@code g_iface}
     */
    public void setGIface(org.gtk.gobject.TypeInterface gIface) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("g_iface"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (gIface == null ? MemoryAddress.NULL : gIface.handle()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code ReceiveMessagesCallback} callback.
     */
    @FunctionalInterface
    public interface ReceiveMessagesCallback {
    
        int run(org.gtk.gio.DatagramBased datagramBased, org.gtk.gio.InputMessage[] messages, int numMessages, int flags, long timeout, @Nullable org.gtk.gio.Cancellable cancellable);
        
        @ApiStatus.Internal default int upcall(MemoryAddress datagramBased, MemoryAddress messages, int numMessages, int flags, long timeout, MemoryAddress cancellable) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                var RESULT = run((org.gtk.gio.DatagramBased) Interop.register(datagramBased, org.gtk.gio.DatagramBased.fromAddress).marshal(datagramBased, null), new PointerProxy<org.gtk.gio.InputMessage>(messages, org.gtk.gio.InputMessage.fromAddress).toArray((int) numMessages, org.gtk.gio.InputMessage.class), numMessages, flags, timeout, (org.gtk.gio.Cancellable) Interop.register(cancellable, org.gtk.gio.Cancellable.fromAddress).marshal(cancellable, null));
                return RESULT;
            }
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), ReceiveMessagesCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code receive_messages}
     * @param receiveMessages The new value of the field {@code receive_messages}
     */
    public void setReceiveMessages(ReceiveMessagesCallback receiveMessages) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("receive_messages"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (receiveMessages == null ? MemoryAddress.NULL : receiveMessages.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code SendMessagesCallback} callback.
     */
    @FunctionalInterface
    public interface SendMessagesCallback {
    
        int run(org.gtk.gio.DatagramBased datagramBased, org.gtk.gio.OutputMessage[] messages, int numMessages, int flags, long timeout, @Nullable org.gtk.gio.Cancellable cancellable);
        
        @ApiStatus.Internal default int upcall(MemoryAddress datagramBased, MemoryAddress messages, int numMessages, int flags, long timeout, MemoryAddress cancellable) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                var RESULT = run((org.gtk.gio.DatagramBased) Interop.register(datagramBased, org.gtk.gio.DatagramBased.fromAddress).marshal(datagramBased, null), new PointerProxy<org.gtk.gio.OutputMessage>(messages, org.gtk.gio.OutputMessage.fromAddress).toArray((int) numMessages, org.gtk.gio.OutputMessage.class), numMessages, flags, timeout, (org.gtk.gio.Cancellable) Interop.register(cancellable, org.gtk.gio.Cancellable.fromAddress).marshal(cancellable, null));
                return RESULT;
            }
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), SendMessagesCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code send_messages}
     * @param sendMessages The new value of the field {@code send_messages}
     */
    public void setSendMessages(SendMessagesCallback sendMessages) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("send_messages"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (sendMessages == null ? MemoryAddress.NULL : sendMessages.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code CreateSourceCallback} callback.
     */
    @FunctionalInterface
    public interface CreateSourceCallback {
    
        org.gtk.glib.Source run(org.gtk.gio.DatagramBased datagramBased, org.gtk.glib.IOCondition condition, @Nullable org.gtk.gio.Cancellable cancellable);
        
        @ApiStatus.Internal default Addressable upcall(MemoryAddress datagramBased, int condition, MemoryAddress cancellable) {
            var RESULT = run((org.gtk.gio.DatagramBased) Interop.register(datagramBased, org.gtk.gio.DatagramBased.fromAddress).marshal(datagramBased, null), new org.gtk.glib.IOCondition(condition), (org.gtk.gio.Cancellable) Interop.register(cancellable, org.gtk.gio.Cancellable.fromAddress).marshal(cancellable, null));
            RESULT.yieldOwnership();
            return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), CreateSourceCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code create_source}
     * @param createSource The new value of the field {@code create_source}
     */
    public void setCreateSource(CreateSourceCallback createSource) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("create_source"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (createSource == null ? MemoryAddress.NULL : createSource.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code ConditionCheckCallback} callback.
     */
    @FunctionalInterface
    public interface ConditionCheckCallback {
    
        org.gtk.glib.IOCondition run(org.gtk.gio.DatagramBased datagramBased, org.gtk.glib.IOCondition condition);
        
        @ApiStatus.Internal default int upcall(MemoryAddress datagramBased, int condition) {
            var RESULT = run((org.gtk.gio.DatagramBased) Interop.register(datagramBased, org.gtk.gio.DatagramBased.fromAddress).marshal(datagramBased, null), new org.gtk.glib.IOCondition(condition));
            return RESULT.getValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), ConditionCheckCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code condition_check}
     * @param conditionCheck The new value of the field {@code condition_check}
     */
    public void setConditionCheck(ConditionCheckCallback conditionCheck) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("condition_check"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (conditionCheck == null ? MemoryAddress.NULL : conditionCheck.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code ConditionWaitCallback} callback.
     */
    @FunctionalInterface
    public interface ConditionWaitCallback {
    
        boolean run(org.gtk.gio.DatagramBased datagramBased, org.gtk.glib.IOCondition condition, long timeout, @Nullable org.gtk.gio.Cancellable cancellable);
        
        @ApiStatus.Internal default int upcall(MemoryAddress datagramBased, int condition, long timeout, MemoryAddress cancellable) {
            var RESULT = run((org.gtk.gio.DatagramBased) Interop.register(datagramBased, org.gtk.gio.DatagramBased.fromAddress).marshal(datagramBased, null), new org.gtk.glib.IOCondition(condition), timeout, (org.gtk.gio.Cancellable) Interop.register(cancellable, org.gtk.gio.Cancellable.fromAddress).marshal(cancellable, null));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), ConditionWaitCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code condition_wait}
     * @param conditionWait The new value of the field {@code condition_wait}
     */
    public void setConditionWait(ConditionWaitCallback conditionWait) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("condition_wait"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (conditionWait == null ? MemoryAddress.NULL : conditionWait.toCallback()));
        }
    }
    
    /**
     * Create a DatagramBasedInterface proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected DatagramBasedInterface(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, DatagramBasedInterface> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new DatagramBasedInterface(input);
    
    /**
     * A {@link DatagramBasedInterface.Builder} object constructs a {@link DatagramBasedInterface} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link DatagramBasedInterface.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final DatagramBasedInterface struct;
        
        private Builder() {
            struct = DatagramBasedInterface.allocate();
        }
        
        /**
         * Finish building the {@link DatagramBasedInterface} struct.
         * @return A new instance of {@code DatagramBasedInterface} with the fields 
         *         that were set in the Builder object.
         */
        public DatagramBasedInterface build() {
            return struct;
        }
        
        /**
         * The parent interface.
         * @param gIface The value for the {@code gIface} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setGIface(org.gtk.gobject.TypeInterface gIface) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("g_iface"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (gIface == null ? MemoryAddress.NULL : gIface.handle()));
                return this;
            }
        }
        
        public Builder setReceiveMessages(ReceiveMessagesCallback receiveMessages) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("receive_messages"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (receiveMessages == null ? MemoryAddress.NULL : receiveMessages.toCallback()));
                return this;
            }
        }
        
        public Builder setSendMessages(SendMessagesCallback sendMessages) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("send_messages"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (sendMessages == null ? MemoryAddress.NULL : sendMessages.toCallback()));
                return this;
            }
        }
        
        public Builder setCreateSource(CreateSourceCallback createSource) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("create_source"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (createSource == null ? MemoryAddress.NULL : createSource.toCallback()));
                return this;
            }
        }
        
        public Builder setConditionCheck(ConditionCheckCallback conditionCheck) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("condition_check"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (conditionCheck == null ? MemoryAddress.NULL : conditionCheck.toCallback()));
                return this;
            }
        }
        
        public Builder setConditionWait(ConditionWaitCallback conditionWait) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("condition_wait"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (conditionWait == null ? MemoryAddress.NULL : conditionWait.toCallback()));
                return this;
            }
        }
    }
}
