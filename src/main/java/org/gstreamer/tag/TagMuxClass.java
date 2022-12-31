package org.gstreamer.tag;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The {@link TagMuxClass} structure. Subclasses need to override at least one
 * of the two render vfuncs.
 */
public class TagMuxClass extends Struct {
    
    static {
        GstTag.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstTagMuxClass";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gstreamer.gst.ElementClass.getMemoryLayout().withName("parent_class"),
            Interop.valueLayout.ADDRESS.withName("render_start_tag"),
            Interop.valueLayout.ADDRESS.withName("render_end_tag"),
            MemoryLayout.sequenceLayout(4, Interop.valueLayout.ADDRESS).withName("_gst_reserved")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link TagMuxClass}
     * @return A new, uninitialized @{link TagMuxClass}
     */
    public static TagMuxClass allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        TagMuxClass newInstance = new TagMuxClass(segment.address(), Ownership.NONE);
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
    
    @FunctionalInterface
    public interface RenderStartTagCallback {
        org.gstreamer.gst.Buffer run(org.gstreamer.tag.TagMux mux, org.gstreamer.gst.TagList tagList);

        @ApiStatus.Internal default Addressable upcall(MemoryAddress mux, MemoryAddress tagList) {
            var RESULT = run((org.gstreamer.tag.TagMux) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(mux)), org.gstreamer.tag.TagMux.fromAddress).marshal(mux, Ownership.NONE), org.gstreamer.gst.TagList.fromAddress.marshal(tagList, Ownership.NONE));
            return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(RenderStartTagCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code render_start_tag}
     * @param renderStartTag The new value of the field {@code render_start_tag}
     */
    public void setRenderStartTag(RenderStartTagCallback renderStartTag) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("render_start_tag"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (renderStartTag == null ? MemoryAddress.NULL : renderStartTag.toCallback()));
    }
    
    @FunctionalInterface
    public interface RenderEndTagCallback {
        org.gstreamer.gst.Buffer run(org.gstreamer.tag.TagMux mux, org.gstreamer.gst.TagList tagList);

        @ApiStatus.Internal default Addressable upcall(MemoryAddress mux, MemoryAddress tagList) {
            var RESULT = run((org.gstreamer.tag.TagMux) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(mux)), org.gstreamer.tag.TagMux.fromAddress).marshal(mux, Ownership.NONE), org.gstreamer.gst.TagList.fromAddress.marshal(tagList, Ownership.NONE));
            return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(RenderEndTagCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code render_end_tag}
     * @param renderEndTag The new value of the field {@code render_end_tag}
     */
    public void setRenderEndTag(RenderEndTagCallback renderEndTag) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("render_end_tag"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (renderEndTag == null ? MemoryAddress.NULL : renderEndTag.toCallback()));
    }
    
    /**
     * Create a TagMuxClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected TagMuxClass(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, TagMuxClass> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new TagMuxClass(input, ownership);
    
    /**
     * A {@link TagMuxClass.Builder} object constructs a {@link TagMuxClass} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link TagMuxClass.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final TagMuxClass struct;
        
        private Builder() {
            struct = TagMuxClass.allocate();
        }
        
         /**
         * Finish building the {@link TagMuxClass} struct.
         * @return A new instance of {@code TagMuxClass} with the fields 
         *         that were set in the Builder object.
         */
        public TagMuxClass build() {
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
        
        public Builder setRenderStartTag(RenderStartTagCallback renderStartTag) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("render_start_tag"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (renderStartTag == null ? MemoryAddress.NULL : renderStartTag.toCallback()));
            return this;
        }
        
        public Builder setRenderEndTag(RenderEndTagCallback renderEndTag) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("render_end_tag"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (renderEndTag == null ? MemoryAddress.NULL : renderEndTag.toCallback()));
            return this;
        }
        
        public Builder setGstReserved(java.lang.foreign.MemoryAddress[] GstReserved) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("_gst_reserved"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (GstReserved == null ? MemoryAddress.NULL : Interop.allocateNativeArray(GstReserved, false)));
            return this;
        }
    }
}
