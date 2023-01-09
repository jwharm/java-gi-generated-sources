package org.gstreamer.tag;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class TagXmpWriterInterface extends Struct {
    
    static {
        GstTag.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstTagXmpWriterInterface";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gtk.gobject.TypeInterface.getMemoryLayout().withName("parent")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link TagXmpWriterInterface}
     * @return A new, uninitialized @{link TagXmpWriterInterface}
     */
    public static TagXmpWriterInterface allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        TagXmpWriterInterface newInstance = new TagXmpWriterInterface(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code parent}
     * @return The value of the field {@code parent}
     */
    public org.gtk.gobject.TypeInterface getParent() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent"));
        return org.gtk.gobject.TypeInterface.fromAddress.marshal(((MemoryAddress) handle()).addOffset(OFFSET), null);
    }
    
    /**
     * Change the value of the field {@code parent}
     * @param parent The new value of the field {@code parent}
     */
    public void setParent(org.gtk.gobject.TypeInterface parent) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parent"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (parent == null ? MemoryAddress.NULL : parent.handle()));
        }
    }
    
    /**
     * Create a TagXmpWriterInterface proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected TagXmpWriterInterface(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, TagXmpWriterInterface> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new TagXmpWriterInterface(input);
    
    /**
     * A {@link TagXmpWriterInterface.Builder} object constructs a {@link TagXmpWriterInterface} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link TagXmpWriterInterface.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final TagXmpWriterInterface struct;
        
        private Builder() {
            struct = TagXmpWriterInterface.allocate();
        }
        
        /**
         * Finish building the {@link TagXmpWriterInterface} struct.
         * @return A new instance of {@code TagXmpWriterInterface} with the fields 
         *         that were set in the Builder object.
         */
        public TagXmpWriterInterface build() {
            return struct;
        }
        
        public Builder setParent(org.gtk.gobject.TypeInterface parent) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("parent"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (parent == null ? MemoryAddress.NULL : parent.handle()));
                return this;
            }
        }
    }
}
