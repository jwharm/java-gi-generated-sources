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
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        DatagramBasedInterface newInstance = new DatagramBasedInterface(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code g_iface}
     * @return The value of the field {@code g_iface}
     */
    public org.gtk.gobject.TypeInterface getGIface() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("g_iface"));
        return org.gtk.gobject.TypeInterface.fromAddress.marshal(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Change the value of the field {@code g_iface}
     * @param gIface The new value of the field {@code g_iface}
     */
    public void setGIface(org.gtk.gobject.TypeInterface gIface) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("g_iface"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (gIface == null ? MemoryAddress.NULL : gIface.handle()));
    }
    
    @FunctionalInterface
    public interface ReceiveMessagesCallback {
        int run(org.gtk.gio.DatagramBased datagramBased, org.gtk.gio.InputMessage[] messages, int numMessages, int flags, long timeout, @Nullable org.gtk.gio.Cancellable cancellable);

        @ApiStatus.Internal default int upcall(MemoryAddress datagramBased, MemoryAddress messages, int numMessages, int flags, long timeout, MemoryAddress cancellable) {
            var RESULT = run((org.gtk.gio.DatagramBased) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(datagramBased)), org.gtk.gio.DatagramBased.fromAddress).marshal(datagramBased, Ownership.NONE), new PointerProxy<org.gtk.gio.InputMessage>(messages, org.gtk.gio.InputMessage.fromAddress).toArray((int) numMessages, org.gtk.gio.InputMessage.class), numMessages, flags, timeout, (org.gtk.gio.Cancellable) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(cancellable)), org.gtk.gio.Cancellable.fromAddress).marshal(cancellable, Ownership.NONE));
            return RESULT;
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(ReceiveMessagesCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code receive_messages}
     * @param receiveMessages The new value of the field {@code receive_messages}
     */
    public void setReceiveMessages(ReceiveMessagesCallback receiveMessages) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("receive_messages"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (receiveMessages == null ? MemoryAddress.NULL : receiveMessages.toCallback()));
    }
    
    @FunctionalInterface
    public interface SendMessagesCallback {
        int run(org.gtk.gio.DatagramBased datagramBased, org.gtk.gio.OutputMessage[] messages, int numMessages, int flags, long timeout, @Nullable org.gtk.gio.Cancellable cancellable);

        @ApiStatus.Internal default int upcall(MemoryAddress datagramBased, MemoryAddress messages, int numMessages, int flags, long timeout, MemoryAddress cancellable) {
            var RESULT = run((org.gtk.gio.DatagramBased) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(datagramBased)), org.gtk.gio.DatagramBased.fromAddress).marshal(datagramBased, Ownership.NONE), new PointerProxy<org.gtk.gio.OutputMessage>(messages, org.gtk.gio.OutputMessage.fromAddress).toArray((int) numMessages, org.gtk.gio.OutputMessage.class), numMessages, flags, timeout, (org.gtk.gio.Cancellable) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(cancellable)), org.gtk.gio.Cancellable.fromAddress).marshal(cancellable, Ownership.NONE));
            return RESULT;
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(SendMessagesCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code send_messages}
     * @param sendMessages The new value of the field {@code send_messages}
     */
    public void setSendMessages(SendMessagesCallback sendMessages) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("send_messages"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (sendMessages == null ? MemoryAddress.NULL : sendMessages.toCallback()));
    }
    
    @FunctionalInterface
    public interface CreateSourceCallback {
        org.gtk.glib.Source run(org.gtk.gio.DatagramBased datagramBased, org.gtk.glib.IOCondition condition, @Nullable org.gtk.gio.Cancellable cancellable);

        @ApiStatus.Internal default Addressable upcall(MemoryAddress datagramBased, int condition, MemoryAddress cancellable) {
            var RESULT = run((org.gtk.gio.DatagramBased) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(datagramBased)), org.gtk.gio.DatagramBased.fromAddress).marshal(datagramBased, Ownership.NONE), new org.gtk.glib.IOCondition(condition), (org.gtk.gio.Cancellable) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(cancellable)), org.gtk.gio.Cancellable.fromAddress).marshal(cancellable, Ownership.NONE));
            return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(CreateSourceCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code create_source}
     * @param createSource The new value of the field {@code create_source}
     */
    public void setCreateSource(CreateSourceCallback createSource) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("create_source"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (createSource == null ? MemoryAddress.NULL : createSource.toCallback()));
    }
    
    @FunctionalInterface
    public interface ConditionCheckCallback {
        org.gtk.glib.IOCondition run(org.gtk.gio.DatagramBased datagramBased, org.gtk.glib.IOCondition condition);

        @ApiStatus.Internal default int upcall(MemoryAddress datagramBased, int condition) {
            var RESULT = run((org.gtk.gio.DatagramBased) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(datagramBased)), org.gtk.gio.DatagramBased.fromAddress).marshal(datagramBased, Ownership.NONE), new org.gtk.glib.IOCondition(condition));
            return RESULT.getValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(ConditionCheckCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code condition_check}
     * @param conditionCheck The new value of the field {@code condition_check}
     */
    public void setConditionCheck(ConditionCheckCallback conditionCheck) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("condition_check"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (conditionCheck == null ? MemoryAddress.NULL : conditionCheck.toCallback()));
    }
    
    @FunctionalInterface
    public interface ConditionWaitCallback {
        boolean run(org.gtk.gio.DatagramBased datagramBased, org.gtk.glib.IOCondition condition, long timeout, @Nullable org.gtk.gio.Cancellable cancellable);

        @ApiStatus.Internal default int upcall(MemoryAddress datagramBased, int condition, long timeout, MemoryAddress cancellable) {
            var RESULT = run((org.gtk.gio.DatagramBased) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(datagramBased)), org.gtk.gio.DatagramBased.fromAddress).marshal(datagramBased, Ownership.NONE), new org.gtk.glib.IOCondition(condition), timeout, (org.gtk.gio.Cancellable) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(cancellable)), org.gtk.gio.Cancellable.fromAddress).marshal(cancellable, Ownership.NONE));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(ConditionWaitCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code condition_wait}
     * @param conditionWait The new value of the field {@code condition_wait}
     */
    public void setConditionWait(ConditionWaitCallback conditionWait) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("condition_wait"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (conditionWait == null ? MemoryAddress.NULL : conditionWait.toCallback()));
    }
    
    /**
     * Create a DatagramBasedInterface proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected DatagramBasedInterface(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, DatagramBasedInterface> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new DatagramBasedInterface(input, ownership);
    
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
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("g_iface"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (gIface == null ? MemoryAddress.NULL : gIface.handle()));
            return this;
        }
        
        public Builder setReceiveMessages(ReceiveMessagesCallback receiveMessages) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("receive_messages"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (receiveMessages == null ? MemoryAddress.NULL : receiveMessages.toCallback()));
            return this;
        }
        
        public Builder setSendMessages(SendMessagesCallback sendMessages) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("send_messages"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (sendMessages == null ? MemoryAddress.NULL : sendMessages.toCallback()));
            return this;
        }
        
        public Builder setCreateSource(CreateSourceCallback createSource) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("create_source"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (createSource == null ? MemoryAddress.NULL : createSource.toCallback()));
            return this;
        }
        
        public Builder setConditionCheck(ConditionCheckCallback conditionCheck) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("condition_check"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (conditionCheck == null ? MemoryAddress.NULL : conditionCheck.toCallback()));
            return this;
        }
        
        public Builder setConditionWait(ConditionWaitCallback conditionWait) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("condition_wait"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (conditionWait == null ? MemoryAddress.NULL : conditionWait.toCallback()));
            return this;
        }
    }
}
