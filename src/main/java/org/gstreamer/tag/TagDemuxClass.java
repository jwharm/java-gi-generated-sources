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
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gstreamer.gst.ElementClass.getMemoryLayout().withName("parent_class"),
            Interop.valueLayout.C_INT.withName("min_start_size"),
            Interop.valueLayout.C_INT.withName("min_end_size"),
            Interop.valueLayout.ADDRESS.withName("identify_tag"),
            Interop.valueLayout.ADDRESS.withName("parse_tag"),
            Interop.valueLayout.ADDRESS.withName("merge_tags"),
            MemoryLayout.sequenceLayout(4, Interop.valueLayout.ADDRESS).withName("reserved")
        ).withName(C_TYPE_NAME);
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
    public org.gstreamer.gst.ElementClass getParentClass() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent_class"));
        return org.gstreamer.gst.ElementClass.fromAddress.marshal(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Change the value of the field {@code parent_class}
     * @param parentClass The new value of the field {@code parent_class}
     */
    public void setParentClass(org.gstreamer.gst.ElementClass parentClass) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
    }
    
    /**
     * Get the value of the field {@code min_start_size}
     * @return The value of the field {@code min_start_size}
     */
    public int getMinStartSize() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("min_start_size"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code min_start_size}
     * @param minStartSize The new value of the field {@code min_start_size}
     */
    public void setMinStartSize(int minStartSize) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("min_start_size"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), minStartSize);
    }
    
    /**
     * Get the value of the field {@code min_end_size}
     * @return The value of the field {@code min_end_size}
     */
    public int getMinEndSize() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("min_end_size"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code min_end_size}
     * @param minEndSize The new value of the field {@code min_end_size}
     */
    public void setMinEndSize(int minEndSize) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("min_end_size"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), minEndSize);
    }
    
    @FunctionalInterface
    public interface IdentifyTagCallback {
        boolean run(org.gstreamer.tag.TagDemux demux, org.gstreamer.gst.Buffer buffer, boolean startTag, PointerInteger tagSize);

        @ApiStatus.Internal default int upcall(MemoryAddress demux, MemoryAddress buffer, int startTag, MemoryAddress tagSize) {
            var RESULT = run((org.gstreamer.tag.TagDemux) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(demux)), org.gstreamer.tag.TagDemux.fromAddress).marshal(demux, Ownership.NONE), org.gstreamer.gst.Buffer.fromAddress.marshal(buffer, Ownership.NONE), Marshal.integerToBoolean.marshal(startTag, null).booleanValue(), new PointerInteger(tagSize));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(IdentifyTagCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code identify_tag}
     * @param identifyTag The new value of the field {@code identify_tag}
     */
    public void setIdentifyTag(IdentifyTagCallback identifyTag) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("identify_tag"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (identifyTag == null ? MemoryAddress.NULL : identifyTag.toCallback()));
    }
    
    @FunctionalInterface
    public interface ParseTagCallback {
        org.gstreamer.tag.TagDemuxResult run(org.gstreamer.tag.TagDemux demux, org.gstreamer.gst.Buffer buffer, boolean startTag, PointerInteger tagSize, PointerProxy<org.gstreamer.gst.TagList> tags);

        @ApiStatus.Internal default int upcall(MemoryAddress demux, MemoryAddress buffer, int startTag, MemoryAddress tagSize, MemoryAddress tags) {
            var RESULT = run((org.gstreamer.tag.TagDemux) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(demux)), org.gstreamer.tag.TagDemux.fromAddress).marshal(demux, Ownership.NONE), org.gstreamer.gst.Buffer.fromAddress.marshal(buffer, Ownership.NONE), Marshal.integerToBoolean.marshal(startTag, null).booleanValue(), new PointerInteger(tagSize), new PointerProxy<org.gstreamer.gst.TagList>(tags, org.gstreamer.gst.TagList.fromAddress));
            return RESULT.getValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(ParseTagCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code parse_tag}
     * @param parseTag The new value of the field {@code parse_tag}
     */
    public void setParseTag(ParseTagCallback parseTag) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("parse_tag"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parseTag == null ? MemoryAddress.NULL : parseTag.toCallback()));
    }
    
    @FunctionalInterface
    public interface MergeTagsCallback {
        org.gstreamer.gst.TagList run(org.gstreamer.tag.TagDemux demux, org.gstreamer.gst.TagList startTags, org.gstreamer.gst.TagList endTags);

        @ApiStatus.Internal default Addressable upcall(MemoryAddress demux, MemoryAddress startTags, MemoryAddress endTags) {
            var RESULT = run((org.gstreamer.tag.TagDemux) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(demux)), org.gstreamer.tag.TagDemux.fromAddress).marshal(demux, Ownership.NONE), org.gstreamer.gst.TagList.fromAddress.marshal(startTags, Ownership.NONE), org.gstreamer.gst.TagList.fromAddress.marshal(endTags, Ownership.NONE));
            return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MergeTagsCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code merge_tags}
     * @param mergeTags The new value of the field {@code merge_tags}
     */
    public void setMergeTags(MergeTagsCallback mergeTags) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("merge_tags"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (mergeTags == null ? MemoryAddress.NULL : mergeTags.toCallback()));
    }
    
    /**
     * Create a TagDemuxClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected TagDemuxClass(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, TagDemuxClass> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new TagDemuxClass(input, ownership);
    
    /**
     * A {@link TagDemuxClass.Builder} object constructs a {@link TagDemuxClass} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link TagDemuxClass.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final TagDemuxClass struct;
        
        private Builder() {
            struct = TagDemuxClass.allocate();
        }
        
         /**
         * Finish building the {@link TagDemuxClass} struct.
         * @return A new instance of {@code TagDemuxClass} with the fields 
         *         that were set in the Builder object.
         */
        public TagDemuxClass build() {
            return struct;
        }
        
        /**
         * the parent class.
         * @param parentClass The value for the {@code parentClass} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setParentClass(org.gstreamer.gst.ElementClass parentClass) {
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
        public Builder setMinStartSize(int minStartSize) {
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
        public Builder setMinEndSize(int minEndSize) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("min_end_size"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), minEndSize);
            return this;
        }
        
        public Builder setIdentifyTag(IdentifyTagCallback identifyTag) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("identify_tag"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (identifyTag == null ? MemoryAddress.NULL : identifyTag.toCallback()));
            return this;
        }
        
        public Builder setParseTag(ParseTagCallback parseTag) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parse_tag"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parseTag == null ? MemoryAddress.NULL : parseTag.toCallback()));
            return this;
        }
        
        public Builder setMergeTags(MergeTagsCallback mergeTags) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("merge_tags"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (mergeTags == null ? MemoryAddress.NULL : mergeTags.toCallback()));
            return this;
        }
        
        public Builder setReserved(java.lang.foreign.MemoryAddress[] reserved) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("reserved"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (reserved == null ? MemoryAddress.NULL : Interop.allocateNativeArray(reserved, false)));
            return this;
        }
    }
}
