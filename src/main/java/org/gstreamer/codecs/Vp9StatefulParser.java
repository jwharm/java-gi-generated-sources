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
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
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
     * Allocate a new {@link Vp9StatefulParser}
     * @return A new, uninitialized @{link Vp9StatefulParser}
     */
    public static Vp9StatefulParser allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        Vp9StatefulParser newInstance = new Vp9StatefulParser(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a Vp9StatefulParser proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public Vp9StatefulParser(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Frees {@code parser}.
     */
    public void free() {
        try {
            DowncallHandles.gst_vp9_stateful_parser_free.invokeExact(
                    handle());
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
    public @NotNull java.lang.foreign.MemoryAddress parseCompressedFrameHeader(@NotNull org.gstreamer.codecs.Vp9FrameHeader header, PointerByte data, long size) {
        java.util.Objects.requireNonNull(header, "Parameter 'header' must not be null");
        java.util.Objects.requireNonNull(data, "Parameter 'data' must not be null");
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
    public @NotNull java.lang.foreign.MemoryAddress parseUncompressedFrameHeader(@NotNull org.gstreamer.codecs.Vp9FrameHeader header, PointerByte data, long size) {
        java.util.Objects.requireNonNull(header, "Parameter 'header' must not be null");
        java.util.Objects.requireNonNull(data, "Parameter 'data' must not be null");
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
    public static @NotNull org.gstreamer.codecs.Vp9StatefulParser new_() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_vp9_stateful_parser_new.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.codecs.Vp9StatefulParser(RESULT, Ownership.UNKNOWN);
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
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private Vp9StatefulParser struct;
        
         /**
         * A {@link Vp9StatefulParser.Build} object constructs a {@link Vp9StatefulParser} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = Vp9StatefulParser.allocate();
        }
        
         /**
         * Finish building the {@link Vp9StatefulParser} struct.
         * @return A new instance of {@code Vp9StatefulParser} with the fields 
         *         that were set in the Build object.
         */
        public Vp9StatefulParser construct() {
            return struct;
        }
        
        public Build setBitDepth(byte bitDepth) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("bit_depth"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), bitDepth);
            return this;
        }
        
        public Build setSubsamplingX(byte subsamplingX) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("subsampling_x"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), subsamplingX);
            return this;
        }
        
        public Build setSubsamplingY(byte subsamplingY) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("subsampling_y"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), subsamplingY);
            return this;
        }
        
        public Build setColorSpace(byte colorSpace) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("color_space"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), colorSpace);
            return this;
        }
        
        public Build setColorRange(byte colorRange) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("color_range"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), colorRange);
            return this;
        }
        
        public Build setMiCols(int miCols) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("mi_cols"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), miCols);
            return this;
        }
        
        public Build setMiRows(int miRows) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("mi_rows"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), miRows);
            return this;
        }
        
        public Build setSb64Cols(int sb64Cols) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("sb64_cols"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), sb64Cols);
            return this;
        }
        
        public Build setSb64Rows(int sb64Rows) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("sb64_rows"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), sb64Rows);
            return this;
        }
        
        public Build setLoopFilterParams(org.gstreamer.codecs.Vp9LoopFilterParams loopFilterParams) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("loop_filter_params"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (loopFilterParams == null ? MemoryAddress.NULL : loopFilterParams.handle()));
            return this;
        }
        
        public Build setSegmentationParams(org.gstreamer.codecs.Vp9SegmentationParams segmentationParams) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("segmentation_params"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (segmentationParams == null ? MemoryAddress.NULL : segmentationParams.handle()));
            return this;
        }
        
        public Build setReference(java.lang.foreign.MemoryAddress[] reference) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("reference"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (reference == null ? MemoryAddress.NULL : Interop.allocateNativeArray(reference, false)));
            return this;
        }
    }
}
