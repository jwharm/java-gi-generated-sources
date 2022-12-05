package org.gstreamer.tag;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The {@link TagDemuxClass} structure.  See documentation at beginning of section
 * for details about what subclasses need to override and do.
 */
public class TagDemuxClass extends Struct {
    
    static {
        GstTag.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstTagDemuxClass";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gstreamer.gst.ElementClass.getMemoryLayout().withName("parent_class"),
        Interop.valueLayout.C_INT.withName("min_start_size"),
        Interop.valueLayout.C_INT.withName("min_end_size"),
        Interop.valueLayout.ADDRESS.withName("identify_tag"),
        Interop.valueLayout.ADDRESS.withName("parse_tag"),
        Interop.valueLayout.ADDRESS.withName("merge_tags"),
        MemoryLayout.sequenceLayout(4, Interop.valueLayout.ADDRESS).withName("reserved")
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
     * Allocate a new {@link TagDemuxClass}
     * @return A new, uninitialized @{link TagDemuxClass}
     */
    public static TagDemuxClass allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        TagDemuxClass newInstance = new TagDemuxClass(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code parent_class}
     * @return The value of the field {@code parent_class}
     */
    public org.gstreamer.gst.ElementClass parentClass$get() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent_class"));
        return new org.gstreamer.gst.ElementClass(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Get the value of the field {@code min_start_size}
     * @return The value of the field {@code min_start_size}
     */
    public int minStartSize$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("min_start_size"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code min_start_size}
     * @param minStartSize The new value of the field {@code min_start_size}
     */
    public void minStartSize$set(int minStartSize) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("min_start_size"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), minStartSize);
    }
    
    /**
     * Get the value of the field {@code min_end_size}
     * @return The value of the field {@code min_end_size}
     */
    public int minEndSize$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("min_end_size"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code min_end_size}
     * @param minEndSize The new value of the field {@code min_end_size}
     */
    public void minEndSize$set(int minEndSize) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("min_end_size"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), minEndSize);
    }
    
    /**
     * Create a TagDemuxClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public TagDemuxClass(Addressable address, Ownership ownership) {
        super(address, ownership);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private TagDemuxClass struct;
        
         /**
         * A {@link TagDemuxClass.Build} object constructs a {@link TagDemuxClass} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = TagDemuxClass.allocate();
        }
        
         /**
         * Finish building the {@link TagDemuxClass} struct.
         * @return A new instance of {@code TagDemuxClass} with the fields 
         *         that were set in the Build object.
         */
        public TagDemuxClass construct() {
            return struct;
        }
        
        /**
         * the parent class.
         * @param parentClass The value for the {@code parentClass} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setParentClass(org.gstreamer.gst.ElementClass parentClass) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
            return this;
        }
        
        /**
         * minimum size required to identify a tag at the start and
         * determine its total size. Set to 0 if not interested in start tags.
         * Subclasses should set this in their class_init function.
         * @param minStartSize The value for the {@code minStartSize} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setMinStartSize(int minStartSize) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("min_start_size"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), minStartSize);
            return this;
        }
        
        /**
         * minimum size required to identify a tag at the end and
         * determine its total size. Set to 0 if not interested in end tags.
         * Subclasses should set this in their class_init function.
         * @param minEndSize The value for the {@code minEndSize} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setMinEndSize(int minEndSize) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("min_end_size"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), minEndSize);
            return this;
        }
        
        public Build setIdentifyTag(java.lang.foreign.MemoryAddress identifyTag) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("identify_tag"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (identifyTag == null ? MemoryAddress.NULL : identifyTag));
            return this;
        }
        
        public Build setParseTag(java.lang.foreign.MemoryAddress parseTag) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parse_tag"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parseTag == null ? MemoryAddress.NULL : parseTag));
            return this;
        }
        
        public Build setMergeTags(java.lang.foreign.MemoryAddress mergeTags) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("merge_tags"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (mergeTags == null ? MemoryAddress.NULL : mergeTags));
            return this;
        }
        
        public Build setReserved(java.lang.foreign.MemoryAddress[] reserved) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("reserved"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (reserved == null ? MemoryAddress.NULL : Interop.allocateNativeArray(reserved, false)));
            return this;
        }
    }
}
