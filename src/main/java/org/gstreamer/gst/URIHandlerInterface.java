package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Any {@link Element} using this interface should implement these methods.
 */
public class URIHandlerInterface extends Struct {
    
    static {
        Gst.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstURIHandlerInterface";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gtk.gobject.TypeInterface.getMemoryLayout().withName("parent"),
            Interop.valueLayout.ADDRESS.withName("get_type"),
            Interop.valueLayout.ADDRESS.withName("get_protocols"),
            Interop.valueLayout.ADDRESS.withName("get_uri"),
            Interop.valueLayout.ADDRESS.withName("set_uri")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link URIHandlerInterface}
     * @return A new, uninitialized @{link URIHandlerInterface}
     */
    public static URIHandlerInterface allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        URIHandlerInterface newInstance = new URIHandlerInterface(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code parent}
     * @return The value of the field {@code parent}
     */
    public org.gtk.gobject.TypeInterface getParent() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent"));
        return org.gtk.gobject.TypeInterface.fromAddress.marshal(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Change the value of the field {@code parent}
     * @param parent The new value of the field {@code parent}
     */
    public void setParent(org.gtk.gobject.TypeInterface parent) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("parent"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parent == null ? MemoryAddress.NULL : parent.handle()));
    }
    
    @FunctionalInterface
    public interface GetTypeCallback {
        org.gstreamer.gst.URIType run(org.gtk.glib.Type type);

        @ApiStatus.Internal default int upcall(long type) {
            var RESULT = run(new org.gtk.glib.Type(type));
            return RESULT.getValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.C_LONG);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(GetTypeCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_type}
     * @param getType The new value of the field {@code get_type}
     */
    public void setGetType(GetTypeCallback getType) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("get_type"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getType == null ? MemoryAddress.NULL : getType.toCallback()));
    }
    
    @FunctionalInterface
    public interface GetProtocolsCallback {
        java.lang.String[] run(org.gtk.glib.Type type);

        @ApiStatus.Internal default void upcall(long type) {
            run(new org.gtk.glib.Type(type));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.C_LONG);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(GetProtocolsCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_protocols}
     * @param getProtocols The new value of the field {@code get_protocols}
     */
    public void setGetProtocols(GetProtocolsCallback getProtocols) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("get_protocols"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getProtocols == null ? MemoryAddress.NULL : getProtocols.toCallback()));
    }
    
    @FunctionalInterface
    public interface GetUriCallback {
        @Nullable java.lang.String run(org.gstreamer.gst.URIHandler handler);

        @ApiStatus.Internal default Addressable upcall(MemoryAddress handler) {
            var RESULT = run((org.gstreamer.gst.URIHandler) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(handler)), org.gstreamer.gst.URIHandler.fromAddress).marshal(handler, Ownership.NONE));
            return RESULT == null ? MemoryAddress.NULL.address() : (Marshal.stringToAddress.marshal(RESULT, null)).address();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(GetUriCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_uri}
     * @param getUri The new value of the field {@code get_uri}
     */
    public void setGetUri(GetUriCallback getUri) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("get_uri"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getUri == null ? MemoryAddress.NULL : getUri.toCallback()));
    }
    
    @FunctionalInterface
    public interface SetUriCallback {
        boolean run(org.gstreamer.gst.URIHandler handler, java.lang.String uri);

        @ApiStatus.Internal default int upcall(MemoryAddress handler, MemoryAddress uri) {
            var RESULT = run((org.gstreamer.gst.URIHandler) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(handler)), org.gstreamer.gst.URIHandler.fromAddress).marshal(handler, Ownership.NONE), Marshal.addressToString.marshal(uri, null));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(SetUriCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code set_uri}
     * @param setUri The new value of the field {@code set_uri}
     */
    public void setSetUri(SetUriCallback setUri) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("set_uri"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (setUri == null ? MemoryAddress.NULL : setUri.toCallback()));
    }
    
    /**
     * Create a URIHandlerInterface proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected URIHandlerInterface(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, URIHandlerInterface> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new URIHandlerInterface(input, ownership);
    
    /**
     * A {@link URIHandlerInterface.Builder} object constructs a {@link URIHandlerInterface} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link URIHandlerInterface.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final URIHandlerInterface struct;
        
        private Builder() {
            struct = URIHandlerInterface.allocate();
        }
        
         /**
         * Finish building the {@link URIHandlerInterface} struct.
         * @return A new instance of {@code URIHandlerInterface} with the fields 
         *         that were set in the Builder object.
         */
        public URIHandlerInterface build() {
            return struct;
        }
        
        /**
         * The parent interface type
         * @param parent The value for the {@code parent} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setParent(org.gtk.gobject.TypeInterface parent) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parent"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parent == null ? MemoryAddress.NULL : parent.handle()));
            return this;
        }
        
        public Builder setGetType(GetTypeCallback getType) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_type"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getType == null ? MemoryAddress.NULL : getType.toCallback()));
            return this;
        }
        
        public Builder setGetProtocols(GetProtocolsCallback getProtocols) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_protocols"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getProtocols == null ? MemoryAddress.NULL : getProtocols.toCallback()));
            return this;
        }
        
        public Builder setGetUri(GetUriCallback getUri) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_uri"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getUri == null ? MemoryAddress.NULL : getUri.toCallback()));
            return this;
        }
        
        public Builder setSetUri(SetUriCallback setUri) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("set_uri"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (setUri == null ? MemoryAddress.NULL : setUri.toCallback()));
            return this;
        }
    }
}
