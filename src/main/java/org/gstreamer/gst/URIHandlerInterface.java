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
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gobject.TypeInterface.getMemoryLayout().withName("parent"),
        Interop.valueLayout.ADDRESS.withName("get_type"),
        Interop.valueLayout.ADDRESS.withName("get_protocols"),
        Interop.valueLayout.ADDRESS.withName("get_uri"),
        Interop.valueLayout.ADDRESS.withName("set_uri")
    ).withName(C_TYPE_NAME);
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
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
    public org.gtk.gobject.TypeInterface parent$get() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent"));
        return new org.gtk.gobject.TypeInterface(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Create a URIHandlerInterface proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public URIHandlerInterface(Addressable address, Ownership ownership) {
        super(address, ownership);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private URIHandlerInterface struct;
        
         /**
         * A {@link URIHandlerInterface.Build} object constructs a {@link URIHandlerInterface} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = URIHandlerInterface.allocate();
        }
        
         /**
         * Finish building the {@link URIHandlerInterface} struct.
         * @return A new instance of {@code URIHandlerInterface} with the fields 
         *         that were set in the Build object.
         */
        public URIHandlerInterface construct() {
            return struct;
        }
        
        /**
         * The parent interface type
         * @param parent The value for the {@code parent} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setParent(org.gtk.gobject.TypeInterface parent) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parent"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parent == null ? MemoryAddress.NULL : parent.handle()));
            return this;
        }
        
        public Build setGetType(java.lang.foreign.MemoryAddress getType) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_type"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getType == null ? MemoryAddress.NULL : getType));
            return this;
        }
        
        public Build setGetProtocols(java.lang.foreign.MemoryAddress getProtocols) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_protocols"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getProtocols == null ? MemoryAddress.NULL : getProtocols));
            return this;
        }
        
        public Build setGetUri(java.lang.foreign.MemoryAddress getUri) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_uri"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getUri == null ? MemoryAddress.NULL : getUri));
            return this;
        }
        
        public Build setSetUri(java.lang.foreign.MemoryAddress setUri) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("set_uri"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (setUri == null ? MemoryAddress.NULL : setUri));
            return this;
        }
    }
}
