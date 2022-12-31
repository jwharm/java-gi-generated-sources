package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class SocketClientClass extends Struct {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GSocketClientClass";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gtk.gobject.ObjectClass.getMemoryLayout().withName("parent_class"),
            Interop.valueLayout.ADDRESS.withName("event"),
            Interop.valueLayout.ADDRESS.withName("_g_reserved1"),
            Interop.valueLayout.ADDRESS.withName("_g_reserved2"),
            Interop.valueLayout.ADDRESS.withName("_g_reserved3"),
            Interop.valueLayout.ADDRESS.withName("_g_reserved4")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link SocketClientClass}
     * @return A new, uninitialized @{link SocketClientClass}
     */
    public static SocketClientClass allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        SocketClientClass newInstance = new SocketClientClass(segment.address(), Ownership.NONE);
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
    public interface EventCallback {
        void run(org.gtk.gio.SocketClient client, org.gtk.gio.SocketClientEvent event, org.gtk.gio.SocketConnectable connectable, org.gtk.gio.IOStream connection);

        @ApiStatus.Internal default void upcall(MemoryAddress client, int event, MemoryAddress connectable, MemoryAddress connection) {
            run((org.gtk.gio.SocketClient) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(client)), org.gtk.gio.SocketClient.fromAddress).marshal(client, Ownership.NONE), org.gtk.gio.SocketClientEvent.of(event), (org.gtk.gio.SocketConnectable) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(connectable)), org.gtk.gio.SocketConnectable.fromAddress).marshal(connectable, Ownership.NONE), (org.gtk.gio.IOStream) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(connection)), org.gtk.gio.IOStream.fromAddress).marshal(connection, Ownership.NONE));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(EventCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code event}
     * @param event The new value of the field {@code event}
     */
    public void setEvent(EventCallback event) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("event"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (event == null ? MemoryAddress.NULL : event.toCallback()));
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
    
    /**
     * Create a SocketClientClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected SocketClientClass(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, SocketClientClass> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new SocketClientClass(input, ownership);
    
    /**
     * A {@link SocketClientClass.Builder} object constructs a {@link SocketClientClass} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link SocketClientClass.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final SocketClientClass struct;
        
        private Builder() {
            struct = SocketClientClass.allocate();
        }
        
         /**
         * Finish building the {@link SocketClientClass} struct.
         * @return A new instance of {@code SocketClientClass} with the fields 
         *         that were set in the Builder object.
         */
        public SocketClientClass build() {
            return struct;
        }
        
        public Builder setParentClass(org.gtk.gobject.ObjectClass parentClass) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
            return this;
        }
        
        public Builder setEvent(EventCallback event) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("event"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (event == null ? MemoryAddress.NULL : event.toCallback()));
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
    }
}
