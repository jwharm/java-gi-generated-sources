package org.gstreamer.codecs;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * This object is used to parse VP9 bitstream header.
 * @version 1.20
 */
public class Vp9StatefulParser extends Struct {
    
    static {
        GstCodecs.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstVp9StatefulParser";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            Interop.valueLayout.C_BYTE.withName("bit_depth"),
            Interop.valueLayout.C_BYTE.withName("subsampling_x"),
            Interop.valueLayout.C_BYTE.withName("subsampling_y"),
            Interop.valueLayout.C_BYTE.withName("color_space"),
            Interop.valueLayout.C_BYTE.withName("color_range"),
            MemoryLayout.paddingLayout(24),
            Interop.valueLayout.C_INT.withName("mi_cols"),
            Interop.valueLayout.C_INT.withName("mi_rows"),
            Interop.valueLayout.C_INT.withName("sb64_cols"),
            Interop.valueLayout.C_INT.withName("sb64_rows"),
            org.gstreamer.codecs.Vp9LoopFilterParams.getMemoryLayout().withName("loop_filter_params"),
            org.gstreamer.codecs.Vp9SegmentationParams.getMemoryLayout().withName("segmentation_params"),
            MemoryLayout.sequenceLayout(8, Interop.valueLayout.ADDRESS).withName("reference")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link Vp9StatefulParser}
     * @return A new, uninitialized @{link Vp9StatefulParser}
     */
    public static Vp9StatefulParser allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        Vp9StatefulParser newInstance = new Vp9StatefulParser(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code reference}
     * @return The value of the field {@code reference}
     */
    public java.lang.foreign.MemoryAddress[] getReference() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (MemoryAddress) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("reference"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return Interop.getAddressArrayFrom(RESULT, 8);
        }
    }
    
    /**
     * Change the value of the field {@code reference}
     * @param reference The new value of the field {@code reference}
     */
    public void setReference(java.lang.foreign.MemoryAddress[] reference) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("reference"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (reference == null ? MemoryAddress.NULL : Interop.allocateNativeArray(reference, false, SCOPE)));
        }
    }
    
    /**
     * Create a Vp9StatefulParser proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected Vp9StatefulParser(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, Vp9StatefulParser> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new Vp9StatefulParser(input);
    
    /**
     * Frees {@code parser}.
     */
    public void free() {
        try {
            DowncallHandles.gst_vp9_stateful_parser_free.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Parses the compressed information in the VP9 bitstream contained in {@code data},
     * and fills in {@code header} with the parsed values.
     * The {@code size} argument represent the whole frame size.
     * @param header The {@link Vp9FrameHeader} to fill
     * @param data The data to parse
     * @param size The size of the {@code data} to parse
     * @return a {@code GstVp9ParserResult}
     */
    public java.lang.foreign.MemoryAddress parseCompressedFrameHeader(org.gstreamer.codecs.Vp9FrameHeader header, PointerByte data, long size) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_vp9_stateful_parser_parse_compressed_frame_header.invokeExact(
                    handle(),
                    header.handle(),
                    data.handle(),
                    size);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Parses the VP9 bitstream contained in {@code data}, and fills in {@code header}
     * with the information. The {@code size} argument represent the whole frame size.
     * @param header The {@link Vp9FrameHeader} to fill
     * @param data The data to parse
     * @param size The size of the {@code data} to parse
     * @return a {@code GstVp9ParserResult}
     */
    public java.lang.foreign.MemoryAddress parseUncompressedFrameHeader(org.gstreamer.codecs.Vp9FrameHeader header, PointerByte data, long size) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_vp9_stateful_parser_parse_uncompressed_frame_header.invokeExact(
                    handle(),
                    header.handle(),
                    data.handle(),
                    size);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@link Vp9StatefulParser}. It should be freed with
     * gst_vp9_stateful_parser_free() after use.
     * @return a new {@link Vp9StatefulParser}
     */
    public static org.gstreamer.codecs.Vp9StatefulParser new_() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_vp9_stateful_parser_new.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.codecs.Vp9StatefulParser.fromAddress.marshal(RESULT, null);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_vp9_stateful_parser_free = Interop.downcallHandle(
                "gst_vp9_stateful_parser_free",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_vp9_stateful_parser_parse_compressed_frame_header = Interop.downcallHandle(
                "gst_vp9_stateful_parser_parse_compressed_frame_header",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
                false
        );
        
        private static final MethodHandle gst_vp9_stateful_parser_parse_uncompressed_frame_header = Interop.downcallHandle(
                "gst_vp9_stateful_parser_parse_uncompressed_frame_header",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
                false
        );
        
        private static final MethodHandle gst_vp9_stateful_parser_new = Interop.downcallHandle(
                "gst_vp9_stateful_parser_new",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
                false
        );
    }
    
    /**
     * A {@link Vp9StatefulParser.Builder} object constructs a {@link Vp9StatefulParser} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link Vp9StatefulParser.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final Vp9StatefulParser struct;
        
        private Builder() {
            struct = Vp9StatefulParser.allocate();
        }
        
        /**
         * Finish building the {@link Vp9StatefulParser} struct.
         * @return A new instance of {@code Vp9StatefulParser} with the fields 
         *         that were set in the Builder object.
         */
        public Vp9StatefulParser build() {
            return struct;
        }
        
        public Builder setBitDepth(byte bitDepth) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("bit_depth"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), bitDepth);
                return this;
            }
        }
        
        public Builder setSubsamplingX(byte subsamplingX) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("subsampling_x"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), subsamplingX);
                return this;
            }
        }
        
        public Builder setSubsamplingY(byte subsamplingY) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("subsampling_y"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), subsamplingY);
                return this;
            }
        }
        
        public Builder setColorSpace(byte colorSpace) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("color_space"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), colorSpace);
                return this;
            }
        }
        
        public Builder setColorRange(byte colorRange) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("color_range"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), colorRange);
                return this;
            }
        }
        
        public Builder setMiCols(int miCols) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("mi_cols"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), miCols);
                return this;
            }
        }
        
        public Builder setMiRows(int miRows) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("mi_rows"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), miRows);
                return this;
            }
        }
        
        public Builder setSb64Cols(int sb64Cols) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("sb64_cols"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), sb64Cols);
                return this;
            }
        }
        
        public Builder setSb64Rows(int sb64Rows) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("sb64_rows"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), sb64Rows);
                return this;
            }
        }
        
        public Builder setLoopFilterParams(org.gstreamer.codecs.Vp9LoopFilterParams loopFilterParams) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("loop_filter_params"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (loopFilterParams == null ? MemoryAddress.NULL : loopFilterParams.handle()));
                return this;
            }
        }
        
        public Builder setSegmentationParams(org.gstreamer.codecs.Vp9SegmentationParams segmentationParams) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("segmentation_params"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (segmentationParams == null ? MemoryAddress.NULL : segmentationParams.handle()));
                return this;
            }
        }
        
        public Builder setReference(java.lang.foreign.MemoryAddress[] reference) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("reference"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (reference == null ? MemoryAddress.NULL : Interop.allocateNativeArray(reference, false, SCOPE)));
                return this;
            }
        }
    }
}
