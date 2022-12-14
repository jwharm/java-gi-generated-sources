package org.gstreamer.video;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Constants and functions that are declared in the global GstVideo namespace.
 */
public final class GstVideo {
    
    static {
        LibLoad.loadLibrary("gstvideo-1.0");
        registerTypes();
    }
    
    @ApiStatus.Internal public static void javagi$ensureInitialized() {}
    
public static final java.lang.String BUFFER_POOL_OPTION_VIDEO_AFFINE_TRANSFORMATION_META = "GstBufferPoolOptionVideoAffineTransformation";
    
/**
 * A bufferpool option to enable extra padding. When a bufferpool supports this
 * option, gst_buffer_pool_config_set_video_alignment() can be called.
 * <p>
 * When this option is enabled on the bufferpool,
 * {@code GST_BUFFER_POOL_OPTION_VIDEO_META} should also be enabled.
 */
public static final java.lang.String BUFFER_POOL_OPTION_VIDEO_ALIGNMENT = "GstBufferPoolOptionVideoAlignment";
    
/**
 * An option that can be activated on a bufferpool to request gl texture upload
 * meta on buffers from the pool.
 * <p>
 * When this option is enabled on the bufferpool,
 * {@code GST_BUFFER_POOL_OPTION_VIDEO_META} should also be enabled.
 */
public static final java.lang.String BUFFER_POOL_OPTION_VIDEO_GL_TEXTURE_UPLOAD_META = "GstBufferPoolOptionVideoGLTextureUploadMeta";
    
/**
 * An option that can be activated on bufferpool to request video metadata
 * on buffers from the pool.
 */
public static final java.lang.String BUFFER_POOL_OPTION_VIDEO_META = "GstBufferPoolOptionVideoMeta";
    
/**
 * Name of the caps feature indicating that the stream is interlaced.
 * <p>
 * Currently it is only used for video with 'interlace-mode=alternate'
 * to ensure backwards compatibility for this new mode.
 * In this mode each buffer carries a single field of interlaced video.
 * {@code GST_VIDEO_BUFFER_FLAG_TOP_FIELD} and {@code GST_VIDEO_BUFFER_FLAG_BOTTOM_FIELD}
 * indicate whether the buffer carries a top or bottom field. The order of
 * buffers/fields in the stream and the timestamps on the buffers indicate the
 * temporal order of the fields.
 * Top and bottom fields are expected to alternate in this mode.
 * The frame rate in the caps still signals the frame rate, so the notional field
 * rate will be twice the frame rate from the caps
 * (see {@code GST_VIDEO_INFO_FIELD_RATE_N}).
 */
public static final java.lang.String CAPS_FEATURE_FORMAT_INTERLACED = "format:Interlaced";
    
public static final java.lang.String CAPS_FEATURE_META_GST_VIDEO_AFFINE_TRANSFORMATION_META = "meta:GstVideoAffineTransformation";
    
public static final java.lang.String CAPS_FEATURE_META_GST_VIDEO_GL_TEXTURE_UPLOAD_META = "meta:GstVideoGLTextureUploadMeta";
    
public static final java.lang.String CAPS_FEATURE_META_GST_VIDEO_META = "meta:GstVideoMeta";
    
public static final java.lang.String CAPS_FEATURE_META_GST_VIDEO_OVERLAY_COMPOSITION = "meta:GstVideoOverlayComposition";
    
/**
 * This metadata stays relevant as long as video colorspace is unchanged.
 */
public static final java.lang.String META_TAG_VIDEO_COLORSPACE_STR = "colorspace";
    
/**
 * This metadata stays relevant as long as video orientation is unchanged.
 */
public static final java.lang.String META_TAG_VIDEO_ORIENTATION_STR = "orientation";
    
/**
 * This metadata stays relevant as long as video size is unchanged.
 */
public static final java.lang.String META_TAG_VIDEO_SIZE_STR = "size";
    
/**
 * This metadata is relevant for video streams.
 */
public static final java.lang.String META_TAG_VIDEO_STR = "video";
    
public static final java.lang.String VIDEO_COLORIMETRY_BT2020 = "bt2020";
    
public static final java.lang.String VIDEO_COLORIMETRY_BT2020_10 = "bt2020-10";
    
public static final java.lang.String VIDEO_COLORIMETRY_BT2100_HLG = "bt2100-hlg";
    
public static final java.lang.String VIDEO_COLORIMETRY_BT2100_PQ = "bt2100-pq";
    
public static final java.lang.String VIDEO_COLORIMETRY_BT601 = "bt601";
    
public static final java.lang.String VIDEO_COLORIMETRY_BT709 = "bt709";
    
public static final java.lang.String VIDEO_COLORIMETRY_SMPTE240M = "smpte240m";
    
public static final java.lang.String VIDEO_COLORIMETRY_SRGB = "sRGB";
    
public static final int VIDEO_COMP_A = 3;
    
public static final int VIDEO_COMP_B = 2;
    
public static final int VIDEO_COMP_G = 1;
    
public static final int VIDEO_COMP_INDEX = 0;
    
public static final int VIDEO_COMP_PALETTE = 1;
    
public static final int VIDEO_COMP_R = 0;
    
public static final int VIDEO_COMP_U = 1;
    
public static final int VIDEO_COMP_V = 2;
    
public static final int VIDEO_COMP_Y = 0;
    
/**
 * {@link VideoAlphaMode}, the alpha mode to use.
 * Default is {@code GST_VIDEO_ALPHA_MODE_COPY}.
 */
public static final java.lang.String VIDEO_CONVERTER_OPT_ALPHA_MODE = "GstVideoConverter.alpha-mode";
    
/**
 * {@code G_TYPE_DOUBLE}, the alpha color value to use.
 * Default to 1.0
 */
public static final java.lang.String VIDEO_CONVERTER_OPT_ALPHA_VALUE = "GstVideoConverter.alpha-value";
    
/**
 * {@code G_TYPE_BOOLEAN}, whether gst_video_converter_frame() will return immediately
 * without waiting for the conversion to complete.  A subsequent
 * gst_video_converter_frame_finish() must be performed to ensure completion of the
 * conversion before subsequent use.  Default {@code false}
 */
public static final java.lang.String VIDEO_CONVERTER_OPT_ASYNC_TASKS = "GstVideoConverter.async-tasks";
    
/**
 * {@code G_TYPE_UINT}, the border color to use if {@code GST_VIDEO_CONVERTER_OPT_FILL_BORDER}
 * is set to {@code true}. The color is in ARGB format.
 * Default 0xff000000
 */
public static final java.lang.String VIDEO_CONVERTER_OPT_BORDER_ARGB = "GstVideoConverter.border-argb";
    
/**
 * {@link VideoChromaMode}, set the chroma resample mode subsampled
 * formats. Default is {@code GST_VIDEO_CHROMA_MODE_FULL}.
 */
public static final java.lang.String VIDEO_CONVERTER_OPT_CHROMA_MODE = "GstVideoConverter.chroma-mode";
    
/**
 * {@link VideoChromaMethod}, The resampler method to use for
 * chroma resampling. Other options for the resampler can be used, see
 * the {@link VideoResampler}. Default is {@code GST_VIDEO_RESAMPLER_METHOD_LINEAR}
 */
public static final java.lang.String VIDEO_CONVERTER_OPT_CHROMA_RESAMPLER_METHOD = "GstVideoConverter.chroma-resampler-method";
    
/**
 * {@code G_TYPE_INT}, height in the destination frame, default destination height
 */
public static final java.lang.String VIDEO_CONVERTER_OPT_DEST_HEIGHT = "GstVideoConverter.dest-height";
    
/**
 * {@code G_TYPE_INT}, width in the destination frame, default destination width
 */
public static final java.lang.String VIDEO_CONVERTER_OPT_DEST_WIDTH = "GstVideoConverter.dest-width";
    
/**
 * {@code G_TYPE_INT}, x position in the destination frame, default 0
 */
public static final java.lang.String VIDEO_CONVERTER_OPT_DEST_X = "GstVideoConverter.dest-x";
    
/**
 * {@code G_TYPE_INT}, y position in the destination frame, default 0
 */
public static final java.lang.String VIDEO_CONVERTER_OPT_DEST_Y = "GstVideoConverter.dest-y";
    
/**
 * {@link VideoDitherMethod}, The dither method to use when
 * changing bit depth.
 * Default is {@code GST_VIDEO_DITHER_BAYER}.
 */
public static final java.lang.String VIDEO_CONVERTER_OPT_DITHER_METHOD = "GstVideoConverter.dither-method";
    
/**
 * {@code G_TYPE_UINT}, The quantization amount to dither to. Components will be
 * quantized to multiples of this value.
 * Default is 1
 */
public static final java.lang.String VIDEO_CONVERTER_OPT_DITHER_QUANTIZATION = "GstVideoConverter.dither-quantization";
    
/**
 * {@code G_TYPE_BOOLEAN}, if the destination rectangle does not fill the complete
 * destination image, render a border with
 * {@code GST_VIDEO_CONVERTER_OPT_BORDER_ARGB}. Otherwise the unusded pixels in the
 * destination are untouched. Default {@code true}.
 */
public static final java.lang.String VIDEO_CONVERTER_OPT_FILL_BORDER = "GstVideoConverter.fill-border";
    
/**
 * {@link VideoGammaMode}, set the gamma mode.
 * Default is {@code GST_VIDEO_GAMMA_MODE_NONE}.
 */
public static final java.lang.String VIDEO_CONVERTER_OPT_GAMMA_MODE = "GstVideoConverter.gamma-mode";
    
/**
 * {@link VideoMatrixMode}, set the color matrix conversion mode for
 * converting between Y'PbPr and non-linear RGB (R'G'B').
 * Default is {@code GST_VIDEO_MATRIX_MODE_FULL}.
 */
public static final java.lang.String VIDEO_CONVERTER_OPT_MATRIX_MODE = "GstVideoConverter.matrix-mode";
    
/**
 * {@link VideoPrimariesMode}, set the primaries conversion mode.
 * Default is {@code GST_VIDEO_PRIMARIES_MODE_NONE}.
 */
public static final java.lang.String VIDEO_CONVERTER_OPT_PRIMARIES_MODE = "GstVideoConverter.primaries-mode";
    
/**
 * {@link VideoResamplerMethod}, The resampler method to use for
 * resampling. Other options for the resampler can be used, see
 * the {@link VideoResampler}. Default is {@code GST_VIDEO_RESAMPLER_METHOD_CUBIC}
 */
public static final java.lang.String VIDEO_CONVERTER_OPT_RESAMPLER_METHOD = "GstVideoConverter.resampler-method";
    
/**
 * {@code G_TYPE_UINT}, The number of taps for the resampler.
 * Default is 0: let the resampler choose a good value.
 */
public static final java.lang.String VIDEO_CONVERTER_OPT_RESAMPLER_TAPS = "GstVideoConverter.resampler-taps";
    
/**
 * {@code G_TYPE_INT}, source height to convert, default source height
 */
public static final java.lang.String VIDEO_CONVERTER_OPT_SRC_HEIGHT = "GstVideoConverter.src-height";
    
/**
 * {@code G_TYPE_INT}, source width to convert, default source width
 */
public static final java.lang.String VIDEO_CONVERTER_OPT_SRC_WIDTH = "GstVideoConverter.src-width";
    
/**
 * {@code G_TYPE_INT}, source x position to start conversion, default 0
 */
public static final java.lang.String VIDEO_CONVERTER_OPT_SRC_X = "GstVideoConverter.src-x";
    
/**
 * {@code G_TYPE_INT}, source y position to start conversion, default 0
 */
public static final java.lang.String VIDEO_CONVERTER_OPT_SRC_Y = "GstVideoConverter.src-y";
    
/**
 * {@code G_TYPE_UINT}, maximum number of threads to use. Default 1, 0 for the number
 * of cores.
 */
public static final java.lang.String VIDEO_CONVERTER_OPT_THREADS = "GstVideoConverter.threads";
    
/**
 * Default maximum number of errors tolerated before signaling error.
 */
public static final int VIDEO_DECODER_MAX_ERRORS = 10;
    
/**
 * The name of the templates for the sink pad.
 */
public static final java.lang.String VIDEO_DECODER_SINK_NAME = "sink";
    
/**
 * The name of the templates for the source pad.
 */
public static final java.lang.String VIDEO_DECODER_SRC_NAME = "src";
    
/**
 * The name of the templates for the sink pad.
 */
public static final java.lang.String VIDEO_ENCODER_SINK_NAME = "sink";
    
/**
 * The name of the templates for the source pad.
 */
public static final java.lang.String VIDEO_ENCODER_SRC_NAME = "src";
    
/**
 * List of all video formats, for use in template caps strings.
 * <p>
 * Formats are sorted by decreasing "quality", using these criteria by priority:
 * <ul>
 * <li>number of components
 * <li>depth
 * <li>subsampling factor of the width
 * <li>subsampling factor of the height
 * <li>number of planes
 * <li>native endianness preferred
 * <li>pixel stride
 * <li>poffset
 * <li>prefer non-complex formats
 * <li>prefer YUV formats over RGB ones
 * <li>prefer I420 over YV12
 * <li>format name
 * </ul>
 */
public static final java.lang.String VIDEO_FORMATS_ALL = "{ ABGR64_BE, BGRA64_BE, AYUV64, ARGB64_BE, ARGB64, RGBA64_BE, ABGR64_LE, BGRA64_LE, ARGB64_LE, RGBA64_LE, GBRA_12BE, GBRA_12LE, Y412_BE, Y412_LE, A444_10BE, GBRA_10BE, A444_10LE, GBRA_10LE, A422_10BE, A422_10LE, A420_10BE, A420_10LE, Y410, RGB10A2_LE, BGR10A2_LE, GBRA, ABGR, VUYA, BGRA, AYUV, ARGB, RGBA, A420, AV12, Y444_16BE, Y444_16LE, v216, P016_BE, P016_LE, Y444_12BE, GBR_12BE, Y444_12LE, GBR_12LE, I422_12BE, I422_12LE, Y212_BE, Y212_LE, I420_12BE, I420_12LE, P012_BE, P012_LE, Y444_10BE, GBR_10BE, Y444_10LE, GBR_10LE, r210, I422_10BE, I422_10LE, NV16_10LE32, Y210, v210, UYVP, I420_10BE, I420_10LE, P010_10BE, P010_10LE, NV12_10LE32, NV12_10LE40, Y444, RGBP, GBR, BGRP, NV24, xBGR, BGRx, xRGB, RGBx, BGR, IYU2, v308, RGB, Y42B, NV61, NV16, VYUY, UYVY, YVYU, YUY2, I420, YV12, NV21, NV12, NV12_64Z32, NV12_4L4, NV12_32L32, Y41B, IYU1, YVU9, YUV9, RGB16, BGR16, RGB15, BGR15, RGB8P, GRAY16_BE, GRAY16_LE, GRAY10_LE32, GRAY8 }";
    
public static final java.lang.String VIDEO_FPS_RANGE = "(fraction) [ 0, max ]";
    
public static final int VIDEO_MAX_COMPONENTS = 4;
    
public static final int VIDEO_MAX_PLANES = 4;
    
/**
 * G_TYPE_DOUBLE, B parameter of the cubic filter. The B
 * parameter controls the bluriness. Values between 0.0 and
 * 2.0 are accepted. 1/3 is the default.
 * <p>
 * Below are some values of popular filters:
 *                    B       C
 * Hermite           0.0     0.0
 * Spline            1.0     0.0
 * Catmull-Rom       0.0     1/2
 * Mitchell          1/3     1/3
 * Robidoux          0.3782  0.3109
 * Robidoux
 *  Sharp            0.2620  0.3690
 * Robidoux
 *  Soft             0.6796  0.1602
 */
public static final java.lang.String VIDEO_RESAMPLER_OPT_CUBIC_B = "GstVideoResampler.cubic-b";
    
/**
 * G_TYPE_DOUBLE, C parameter of the cubic filter. The C
 * parameter controls the Keys alpha value. Values between 0.0 and
 * 2.0 are accepted. 1/3 is the default.
 * <p>
 * See {@code GST_VIDEO_RESAMPLER_OPT_CUBIC_B} for some more common values
 */
public static final java.lang.String VIDEO_RESAMPLER_OPT_CUBIC_C = "GstVideoResampler.cubic-c";
    
/**
 * G_TYPE_DOUBLE, specifies the size of filter envelope for
 * {@code GST_VIDEO_RESAMPLER_METHOD_LANCZOS}. values are clamped between
 * 1.0 and 5.0. 2.0 is the default.
 */
public static final java.lang.String VIDEO_RESAMPLER_OPT_ENVELOPE = "GstVideoResampler.envelope";
    
/**
 * G_TYPE_INT, limits the maximum number of taps to use.
 * 16 is the default.
 */
public static final java.lang.String VIDEO_RESAMPLER_OPT_MAX_TAPS = "GstVideoResampler.max-taps";
    
/**
 * G_TYPE_DOUBLE, specifies sharpening of the filter for
 * {@code GST_VIDEO_RESAMPLER_METHOD_LANCZOS}. values are clamped between
 * 0.0 and 1.0. 0.0 is the default.
 */
public static final java.lang.String VIDEO_RESAMPLER_OPT_SHARPEN = "GstVideoResampler.sharpen";
    
/**
 * G_TYPE_DOUBLE, specifies sharpness of the filter for
 * {@code GST_VIDEO_RESAMPLER_METHOD_LANCZOS}. values are clamped between
 * 0.5 and 1.5. 1.0 is the default.
 */
public static final java.lang.String VIDEO_RESAMPLER_OPT_SHARPNESS = "GstVideoResampler.sharpness";
    
/**
 * {@link VideoDitherMethod}, The dither method to use for propagating
 * quatization errors.
 */
public static final java.lang.String VIDEO_SCALER_OPT_DITHER_METHOD = "GstVideoScaler.dither-method";
    
public static final java.lang.String VIDEO_SIZE_RANGE = "(int) [ 1, max ]";
    
public static final int VIDEO_TILE_TYPE_MASK = 65535;
    
public static final int VIDEO_TILE_TYPE_SHIFT = 16;
    
public static final int VIDEO_TILE_X_TILES_MASK = 65535;
    
public static final int VIDEO_TILE_Y_TILES_SHIFT = 16;

/**
 * Attaches {@link VideoAFDMeta} metadata to {@code buffer} with the given
 * parameters.
 * @param buffer a {@link org.gstreamer.gst.Buffer}
 * @param field 0 for progressive or field 1 and 1 for field 2
 * @param spec {@link VideoAFDSpec} that applies to AFD value
 * @param afd {@link VideoAFDValue} AFD enumeration
 * @return the {@link VideoAFDMeta} on {@code buffer}.
 */
public static org.gstreamer.video.VideoAFDMeta bufferAddVideoAfdMeta(org.gstreamer.gst.Buffer buffer, byte field, org.gstreamer.video.VideoAFDSpec spec, org.gstreamer.video.VideoAFDValue afd) {
    MemoryAddress RESULT;
    try {
        RESULT = (MemoryAddress) DowncallHandles.gst_buffer_add_video_afd_meta.invokeExact(
                buffer.handle(),
                field,
                spec.getValue(),
                afd.getValue());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return org.gstreamer.video.VideoAFDMeta.fromAddress.marshal(RESULT, null);
}

/**
 * Attaches GstVideoAffineTransformationMeta metadata to {@code buffer} with
 * the given parameters.
 * @param buffer a {@link org.gstreamer.gst.Buffer}
 * @return the {@link VideoAffineTransformationMeta} on {@code buffer}.
 */
public static org.gstreamer.video.VideoAffineTransformationMeta bufferAddVideoAffineTransformationMeta(org.gstreamer.gst.Buffer buffer) {
    MemoryAddress RESULT;
    try {
        RESULT = (MemoryAddress) DowncallHandles.gst_buffer_add_video_affine_transformation_meta.invokeExact(buffer.handle());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return org.gstreamer.video.VideoAffineTransformationMeta.fromAddress.marshal(RESULT, null);
}

/**
 * Attaches {@link VideoBarMeta} metadata to {@code buffer} with the given
 * parameters.
 * @param buffer a {@link org.gstreamer.gst.Buffer}
 * @param field 0 for progressive or field 1 and 1 for field 2
 * @param isLetterbox if true then bar data specifies letterbox, otherwise pillarbox
 * @param barData1 If {@code is_letterbox} is true, then the value specifies the
 *      last line of a horizontal letterbox bar area at top of reconstructed frame.
 *      Otherwise, it specifies the last horizontal luminance sample of a vertical pillarbox
 *      bar area at the left side of the reconstructed frame
 * @param barData2 If {@code is_letterbox} is true, then the value specifies the
 *      first line of a horizontal letterbox bar area at bottom of reconstructed frame.
 *      Otherwise, it specifies the first horizontal
 *      luminance sample of a vertical pillarbox bar area at the right side of the reconstructed frame.
 * @return the {@link VideoBarMeta} on {@code buffer}.
 * <p>
 * See Table 6.11 Bar Data Syntax
 * <p>
 * https://www.atsc.org/wp-content/uploads/2015/03/a_53-Part-4-2009.pdf
 */
public static org.gstreamer.video.VideoBarMeta bufferAddVideoBarMeta(org.gstreamer.gst.Buffer buffer, byte field, boolean isLetterbox, int barData1, int barData2) {
    MemoryAddress RESULT;
    try {
        RESULT = (MemoryAddress) DowncallHandles.gst_buffer_add_video_bar_meta.invokeExact(
                buffer.handle(),
                field,
                Marshal.booleanToInteger.marshal(isLetterbox, null).intValue(),
                barData1,
                barData2);
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return org.gstreamer.video.VideoBarMeta.fromAddress.marshal(RESULT, null);
}

/**
 * Attaches {@link VideoCaptionMeta} metadata to {@code buffer} with the given
 * parameters.
 * @param buffer a {@link org.gstreamer.gst.Buffer}
 * @param captionType The type of Closed Caption to add
 * @param data The Closed Caption data
 * @param size The size of {@code data} in bytes
 * @return the {@link VideoCaptionMeta} on {@code buffer}.
 */
public static org.gstreamer.video.VideoCaptionMeta bufferAddVideoCaptionMeta(org.gstreamer.gst.Buffer buffer, org.gstreamer.video.VideoCaptionType captionType, byte[] data, long size) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_buffer_add_video_caption_meta.invokeExact(
                    buffer.handle(),
                    captionType.getValue(),
                    Interop.allocateNativeArray(data, false, SCOPE),
                    size);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.video.VideoCaptionMeta.fromAddress.marshal(RESULT, null);
    }
}

/**
 * Attaches a {@link VideoCodecAlphaMeta} metadata to {@code buffer} with
 * the given alpha buffer.
 * @param buffer a {@link org.gstreamer.gst.Buffer}
 * @param alphaBuffer a {@link org.gstreamer.gst.Buffer}
 * @return the {@link VideoCodecAlphaMeta} on {@code buffer}.
 */
public static org.gstreamer.video.VideoCodecAlphaMeta bufferAddVideoCodecAlphaMeta(org.gstreamer.gst.Buffer buffer, org.gstreamer.gst.Buffer alphaBuffer) {
    MemoryAddress RESULT;
    try {
        RESULT = (MemoryAddress) DowncallHandles.gst_buffer_add_video_codec_alpha_meta.invokeExact(
                buffer.handle(),
                alphaBuffer.handle());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    alphaBuffer.yieldOwnership();
    return org.gstreamer.video.VideoCodecAlphaMeta.fromAddress.marshal(RESULT, null);
}

/**
 * Attaches GstVideoGLTextureUploadMeta metadata to {@code buffer} with the given
 * parameters.
 * @param buffer a {@link org.gstreamer.gst.Buffer}
 * @param textureOrientation the {@link VideoGLTextureOrientation}
 * @param nTextures the number of textures
 * @param textureType array of {@link VideoGLTextureType}
 * @param upload the function to upload the buffer to a specific texture ID
 * @param userDataCopy function to copy {@code user_data}
 * @param userDataFree function to free {@code user_data}
 * @return the {@link VideoGLTextureUploadMeta} on {@code buffer}.
 */
public static org.gstreamer.video.VideoGLTextureUploadMeta bufferAddVideoGlTextureUploadMeta(org.gstreamer.gst.Buffer buffer, org.gstreamer.video.VideoGLTextureOrientation textureOrientation, int nTextures, PointerEnumeration<org.gstreamer.video.VideoGLTextureType> textureType, org.gstreamer.video.VideoGLTextureUpload upload, org.gtk.gobject.BoxedCopyFunc userDataCopy, org.gtk.gobject.BoxedFreeFunc userDataFree) {
    MemoryAddress RESULT;
    try {
        RESULT = (MemoryAddress) DowncallHandles.gst_buffer_add_video_gl_texture_upload_meta.invokeExact(
                buffer.handle(),
                textureOrientation.getValue(),
                nTextures,
                textureType.handle(),
                (Addressable) upload.toCallback(),
                (Addressable) MemoryAddress.NULL,
                (Addressable) userDataCopy.toCallback(),
                (Addressable) userDataFree.toCallback());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return org.gstreamer.video.VideoGLTextureUploadMeta.fromAddress.marshal(RESULT, null);
}

/**
 * Attaches GstVideoMeta metadata to {@code buffer} with the given parameters and the
 * default offsets and strides for {@code format} and {@code width} x {@code height}.
 * <p>
 * This function calculates the default offsets and strides and then calls
 * gst_buffer_add_video_meta_full() with them.
 * @param buffer a {@link org.gstreamer.gst.Buffer}
 * @param flags {@link VideoFrameFlags}
 * @param format a {@link VideoFormat}
 * @param width the width
 * @param height the height
 * @return the {@link VideoMeta} on {@code buffer}.
 */
public static org.gstreamer.video.VideoMeta bufferAddVideoMeta(org.gstreamer.gst.Buffer buffer, org.gstreamer.video.VideoFrameFlags flags, org.gstreamer.video.VideoFormat format, int width, int height) {
    MemoryAddress RESULT;
    try {
        RESULT = (MemoryAddress) DowncallHandles.gst_buffer_add_video_meta.invokeExact(
                buffer.handle(),
                flags.getValue(),
                format.getValue(),
                width,
                height);
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return org.gstreamer.video.VideoMeta.fromAddress.marshal(RESULT, null);
}

/**
 * Attaches GstVideoMeta metadata to {@code buffer} with the given parameters.
 * @param buffer a {@link org.gstreamer.gst.Buffer}
 * @param flags {@link VideoFrameFlags}
 * @param format a {@link VideoFormat}
 * @param width the width
 * @param height the height
 * @param nPlanes number of planes
 * @param offset offset of each plane
 * @param stride stride of each plane
 * @return the {@link VideoMeta} on {@code buffer}.
 */
public static org.gstreamer.video.VideoMeta bufferAddVideoMetaFull(org.gstreamer.gst.Buffer buffer, org.gstreamer.video.VideoFrameFlags flags, org.gstreamer.video.VideoFormat format, int width, int height, int nPlanes, long[] offset, int[] stride) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_buffer_add_video_meta_full.invokeExact(
                    buffer.handle(),
                    flags.getValue(),
                    format.getValue(),
                    width,
                    height,
                    nPlanes,
                    Interop.allocateNativeArray(offset, false, SCOPE),
                    Interop.allocateNativeArray(stride, false, SCOPE));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.video.VideoMeta.fromAddress.marshal(RESULT, null);
    }
}

/**
 * Sets an overlay composition on a buffer. The buffer will obtain its own
 * reference to the composition, meaning this function does not take ownership
 * of {@code comp}.
 * @param buf a {@link org.gstreamer.gst.Buffer}
 * @param comp a {@link VideoOverlayComposition}
 * @return a {@link VideoOverlayCompositionMeta}
 */
public static org.gstreamer.video.VideoOverlayCompositionMeta bufferAddVideoOverlayCompositionMeta(org.gstreamer.gst.Buffer buf, @Nullable org.gstreamer.video.VideoOverlayComposition comp) {
    MemoryAddress RESULT;
    try {
        RESULT = (MemoryAddress) DowncallHandles.gst_buffer_add_video_overlay_composition_meta.invokeExact(
                buf.handle(),
                (Addressable) (comp == null ? MemoryAddress.NULL : comp.handle()));
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return org.gstreamer.video.VideoOverlayCompositionMeta.fromAddress.marshal(RESULT, null);
}

/**
 * Attaches {@link VideoRegionOfInterestMeta} metadata to {@code buffer} with the given
 * parameters.
 * @param buffer a {@link org.gstreamer.gst.Buffer}
 * @param roiType Type of the region of interest (e.g. "face")
 * @param x X position
 * @param y Y position
 * @param w width
 * @param h height
 * @return the {@link VideoRegionOfInterestMeta} on {@code buffer}.
 */
public static org.gstreamer.video.VideoRegionOfInterestMeta bufferAddVideoRegionOfInterestMeta(org.gstreamer.gst.Buffer buffer, java.lang.String roiType, int x, int y, int w, int h) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_buffer_add_video_region_of_interest_meta.invokeExact(
                    buffer.handle(),
                    Marshal.stringToAddress.marshal(roiType, SCOPE),
                    x,
                    y,
                    w,
                    h);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.video.VideoRegionOfInterestMeta.fromAddress.marshal(RESULT, null);
    }
}

/**
 * Attaches {@link VideoRegionOfInterestMeta} metadata to {@code buffer} with the given
 * parameters.
 * @param buffer a {@link org.gstreamer.gst.Buffer}
 * @param roiType Type of the region of interest (e.g. "face")
 * @param x X position
 * @param y Y position
 * @param w width
 * @param h height
 * @return the {@link VideoRegionOfInterestMeta} on {@code buffer}.
 */
public static org.gstreamer.video.VideoRegionOfInterestMeta bufferAddVideoRegionOfInterestMetaId(org.gstreamer.gst.Buffer buffer, org.gtk.glib.Quark roiType, int x, int y, int w, int h) {
    MemoryAddress RESULT;
    try {
        RESULT = (MemoryAddress) DowncallHandles.gst_buffer_add_video_region_of_interest_meta_id.invokeExact(
                buffer.handle(),
                roiType.getValue().intValue(),
                x,
                y,
                w,
                h);
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return org.gstreamer.video.VideoRegionOfInterestMeta.fromAddress.marshal(RESULT, null);
}

/**
 * Attaches {@link VideoTimeCodeMeta} metadata to {@code buffer} with the given
 * parameters.
 * @param buffer a {@link org.gstreamer.gst.Buffer}
 * @param tc a {@link VideoTimeCode}
 * @return the {@link VideoTimeCodeMeta} on {@code buffer}, or
 * (since 1.16) {@code null} if the timecode was invalid.
 */
public static @Nullable org.gstreamer.video.VideoTimeCodeMeta bufferAddVideoTimeCodeMeta(org.gstreamer.gst.Buffer buffer, org.gstreamer.video.VideoTimeCode tc) {
    MemoryAddress RESULT;
    try {
        RESULT = (MemoryAddress) DowncallHandles.gst_buffer_add_video_time_code_meta.invokeExact(
                buffer.handle(),
                tc.handle());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return org.gstreamer.video.VideoTimeCodeMeta.fromAddress.marshal(RESULT, null);
}

/**
 * Attaches {@link VideoTimeCodeMeta} metadata to {@code buffer} with the given
 * parameters.
 * @param buffer a {@link org.gstreamer.gst.Buffer}
 * @param fpsN framerate numerator
 * @param fpsD framerate denominator
 * @param latestDailyJam a {@link org.gtk.glib.DateTime} for the latest daily jam
 * @param flags a {@link VideoTimeCodeFlags}
 * @param hours hours since the daily jam
 * @param minutes minutes since the daily jam
 * @param seconds seconds since the daily jam
 * @param frames frames since the daily jam
 * @param fieldCount fields since the daily jam
 * @return the {@link VideoTimeCodeMeta} on {@code buffer}, or
 * (since 1.16) {@code null} if the timecode was invalid.
 */
public static org.gstreamer.video.VideoTimeCodeMeta bufferAddVideoTimeCodeMetaFull(org.gstreamer.gst.Buffer buffer, int fpsN, int fpsD, org.gtk.glib.DateTime latestDailyJam, org.gstreamer.video.VideoTimeCodeFlags flags, int hours, int minutes, int seconds, int frames, int fieldCount) {
    MemoryAddress RESULT;
    try {
        RESULT = (MemoryAddress) DowncallHandles.gst_buffer_add_video_time_code_meta_full.invokeExact(
                buffer.handle(),
                fpsN,
                fpsD,
                latestDailyJam.handle(),
                flags.getValue(),
                hours,
                minutes,
                seconds,
                frames,
                fieldCount);
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return org.gstreamer.video.VideoTimeCodeMeta.fromAddress.marshal(RESULT, null);
}

/**
 * Find the {@link VideoMeta} on {@code buffer} with the lowest {@code id}.
 * <p>
 * Buffers can contain multiple {@link VideoMeta} metadata items when dealing with
 * multiview buffers.
 * @param buffer a {@link org.gstreamer.gst.Buffer}
 * @return the {@link VideoMeta} with lowest id (usually 0) or {@code null} when there
 * is no such metadata on {@code buffer}.
 */
public static org.gstreamer.video.VideoMeta bufferGetVideoMeta(org.gstreamer.gst.Buffer buffer) {
    MemoryAddress RESULT;
    try {
        RESULT = (MemoryAddress) DowncallHandles.gst_buffer_get_video_meta.invokeExact(buffer.handle());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return org.gstreamer.video.VideoMeta.fromAddress.marshal(RESULT, null);
}

/**
 * Find the {@link VideoMeta} on {@code buffer} with the given {@code id}.
 * <p>
 * Buffers can contain multiple {@link VideoMeta} metadata items when dealing with
 * multiview buffers.
 * @param buffer a {@link org.gstreamer.gst.Buffer}
 * @param id a metadata id
 * @return the {@link VideoMeta} with {@code id} or {@code null} when there is no such metadata
 * on {@code buffer}.
 */
public static org.gstreamer.video.VideoMeta bufferGetVideoMetaId(org.gstreamer.gst.Buffer buffer, int id) {
    MemoryAddress RESULT;
    try {
        RESULT = (MemoryAddress) DowncallHandles.gst_buffer_get_video_meta_id.invokeExact(
                buffer.handle(),
                id);
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return org.gstreamer.video.VideoMeta.fromAddress.marshal(RESULT, null);
}

/**
 * Find the {@link VideoRegionOfInterestMeta} on {@code buffer} with the given {@code id}.
 * <p>
 * Buffers can contain multiple {@link VideoRegionOfInterestMeta} metadata items if
 * multiple regions of interests are marked on a frame.
 * @param buffer a {@link org.gstreamer.gst.Buffer}
 * @param id a metadata id
 * @return the {@link VideoRegionOfInterestMeta} with {@code id} or {@code null} when there is
 * no such metadata on {@code buffer}.
 */
public static org.gstreamer.video.VideoRegionOfInterestMeta bufferGetVideoRegionOfInterestMetaId(org.gstreamer.gst.Buffer buffer, int id) {
    MemoryAddress RESULT;
    try {
        RESULT = (MemoryAddress) DowncallHandles.gst_buffer_get_video_region_of_interest_meta_id.invokeExact(
                buffer.handle(),
                id);
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return org.gstreamer.video.VideoRegionOfInterestMeta.fromAddress.marshal(RESULT, null);
}

/**
 * Get the video alignment from the bufferpool configuration {@code config} in
 * in {@code align}
 * @param config a {@link org.gstreamer.gst.Structure}
 * @param align a {@link VideoAlignment}
 * @return {@code true} if {@code config} could be parsed correctly.
 */
public static boolean bufferPoolConfigGetVideoAlignment(org.gstreamer.gst.Structure config, org.gstreamer.video.VideoAlignment align) {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.gst_buffer_pool_config_get_video_alignment.invokeExact(
                config.handle(),
                align.handle());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
}

/**
 * Set the video alignment in {@code align} to the bufferpool configuration
 * {@code config}
 * @param config a {@link org.gstreamer.gst.Structure}
 * @param align a {@link VideoAlignment}
 */
public static void bufferPoolConfigSetVideoAlignment(org.gstreamer.gst.Structure config, org.gstreamer.video.VideoAlignment align) {
    try {
        DowncallHandles.gst_buffer_pool_config_set_video_alignment.invokeExact(
                config.handle(),
                align.handle());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
}

/**
 * Convenience function to check if the given message is a
 * "prepare-window-handle" message from a {@link VideoOverlay}.
 * @param msg a {@link org.gstreamer.gst.Message}
 * @return whether {@code msg} is a "prepare-window-handle" message
 */
public static boolean isVideoOverlayPrepareWindowHandleMessage(org.gstreamer.gst.Message msg) {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.gst_is_video_overlay_prepare_window_handle_message.invokeExact(msg.handle());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
}

/**
 * Inspect a {@link org.gstreamer.gst.Event} and return the {@link NavigationEventType} of the event, or
 * {@code GST_NAVIGATION_EVENT_INVALID} if the event is not a {@link Navigation} event.
 * @param event A {@link org.gstreamer.gst.Event} to inspect.
 */
public static org.gstreamer.video.NavigationEventType navigationEventGetType(org.gstreamer.gst.Event event) {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.gst_navigation_event_get_type.invokeExact(event.handle());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return org.gstreamer.video.NavigationEventType.of(RESULT);
}

/**
 * Inspect a {@link Navigation} command event and retrieve the enum value of the
 * associated command.
 * @param event A {@link org.gstreamer.gst.Event} to inspect.
 * @param command Pointer to GstNavigationCommand to receive the
 *     type of the navigation event.
 * @return TRUE if the navigation command could be extracted, otherwise FALSE.
 */
public static boolean navigationEventParseCommand(org.gstreamer.gst.Event event, @Nullable Out<org.gstreamer.video.NavigationCommand> command) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemorySegment commandPOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_navigation_event_parse_command.invokeExact(
                    event.handle(),
                    (Addressable) (command == null ? MemoryAddress.NULL : (Addressable) commandPOINTER.address()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
                if (command != null) command.set(org.gstreamer.video.NavigationCommand.of(commandPOINTER.get(Interop.valueLayout.C_INT, 0)));
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
}

public static boolean navigationEventParseKeyEvent(org.gstreamer.gst.Event event, @Nullable Out<java.lang.String> key) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemorySegment keyPOINTER = SCOPE.allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_navigation_event_parse_key_event.invokeExact(
                    event.handle(),
                    (Addressable) (key == null ? MemoryAddress.NULL : (Addressable) keyPOINTER.address()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
                if (key != null) key.set(Marshal.addressToString.marshal(keyPOINTER.get(Interop.valueLayout.ADDRESS, 0), null));
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
}

/**
 * Retrieve the details of either a {@link Navigation} mouse button press event or
 * a mouse button release event. Determine which type the event is using
 * gst_navigation_event_get_type() to retrieve the {@link NavigationEventType}.
 * @param event A {@link org.gstreamer.gst.Event} to inspect.
 * @param button Pointer to a gint that will receive the button
 *     number associated with the event.
 * @param x Pointer to a gdouble to receive the x coordinate of the
 *     mouse button event.
 * @param y Pointer to a gdouble to receive the y coordinate of the
 *     mouse button event.
 * @return TRUE if the button number and both coordinates could be extracted,
 *     otherwise FALSE.
 */
public static boolean navigationEventParseMouseButtonEvent(org.gstreamer.gst.Event event, Out<Integer> button, Out<Double> x, Out<Double> y) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemorySegment buttonPOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
        MemorySegment xPOINTER = SCOPE.allocate(Interop.valueLayout.C_DOUBLE);
        MemorySegment yPOINTER = SCOPE.allocate(Interop.valueLayout.C_DOUBLE);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_navigation_event_parse_mouse_button_event.invokeExact(
                    event.handle(),
                    (Addressable) (button == null ? MemoryAddress.NULL : (Addressable) buttonPOINTER.address()),
                    (Addressable) (x == null ? MemoryAddress.NULL : (Addressable) xPOINTER.address()),
                    (Addressable) (y == null ? MemoryAddress.NULL : (Addressable) yPOINTER.address()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
                if (button != null) button.set(buttonPOINTER.get(Interop.valueLayout.C_INT, 0));
                if (x != null) x.set(xPOINTER.get(Interop.valueLayout.C_DOUBLE, 0));
                if (y != null) y.set(yPOINTER.get(Interop.valueLayout.C_DOUBLE, 0));
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
}

/**
 * Inspect a {@link Navigation} mouse movement event and extract the coordinates
 * of the event.
 * @param event A {@link org.gstreamer.gst.Event} to inspect.
 * @param x Pointer to a gdouble to receive the x coordinate of the
 *     mouse movement.
 * @param y Pointer to a gdouble to receive the y coordinate of the
 *     mouse movement.
 * @return TRUE if both coordinates could be extracted, otherwise FALSE.
 */
public static boolean navigationEventParseMouseMoveEvent(org.gstreamer.gst.Event event, Out<Double> x, Out<Double> y) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemorySegment xPOINTER = SCOPE.allocate(Interop.valueLayout.C_DOUBLE);
        MemorySegment yPOINTER = SCOPE.allocate(Interop.valueLayout.C_DOUBLE);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_navigation_event_parse_mouse_move_event.invokeExact(
                    event.handle(),
                    (Addressable) (x == null ? MemoryAddress.NULL : (Addressable) xPOINTER.address()),
                    (Addressable) (y == null ? MemoryAddress.NULL : (Addressable) yPOINTER.address()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
                if (x != null) x.set(xPOINTER.get(Interop.valueLayout.C_DOUBLE, 0));
                if (y != null) y.set(yPOINTER.get(Interop.valueLayout.C_DOUBLE, 0));
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
}

/**
 * Inspect a {@link Navigation} mouse scroll event and extract the coordinates
 * of the event.
 * @param event A {@link org.gstreamer.gst.Event} to inspect.
 * @param x Pointer to a gdouble to receive the x coordinate of the
 *     mouse movement.
 * @param y Pointer to a gdouble to receive the y coordinate of the
 *     mouse movement.
 * @param deltaX Pointer to a gdouble to receive the delta_x coordinate of the
 *     mouse movement.
 * @param deltaY Pointer to a gdouble to receive the delta_y coordinate of the
 *     mouse movement.
 * @return TRUE if all coordinates could be extracted, otherwise FALSE.
 */
public static boolean navigationEventParseMouseScrollEvent(org.gstreamer.gst.Event event, Out<Double> x, Out<Double> y, Out<Double> deltaX, Out<Double> deltaY) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemorySegment xPOINTER = SCOPE.allocate(Interop.valueLayout.C_DOUBLE);
        MemorySegment yPOINTER = SCOPE.allocate(Interop.valueLayout.C_DOUBLE);
        MemorySegment deltaXPOINTER = SCOPE.allocate(Interop.valueLayout.C_DOUBLE);
        MemorySegment deltaYPOINTER = SCOPE.allocate(Interop.valueLayout.C_DOUBLE);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_navigation_event_parse_mouse_scroll_event.invokeExact(
                    event.handle(),
                    (Addressable) (x == null ? MemoryAddress.NULL : (Addressable) xPOINTER.address()),
                    (Addressable) (y == null ? MemoryAddress.NULL : (Addressable) yPOINTER.address()),
                    (Addressable) (deltaX == null ? MemoryAddress.NULL : (Addressable) deltaXPOINTER.address()),
                    (Addressable) (deltaY == null ? MemoryAddress.NULL : (Addressable) deltaYPOINTER.address()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
                if (x != null) x.set(xPOINTER.get(Interop.valueLayout.C_DOUBLE, 0));
                if (y != null) y.set(yPOINTER.get(Interop.valueLayout.C_DOUBLE, 0));
                if (deltaX != null) deltaX.set(deltaXPOINTER.get(Interop.valueLayout.C_DOUBLE, 0));
                if (deltaY != null) deltaY.set(deltaYPOINTER.get(Interop.valueLayout.C_DOUBLE, 0));
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
}

/**
 * Check a bus message to see if it is a {@link Navigation} event, and return
 * the {@link NavigationMessageType} identifying the type of the message if so.
 * @param message A {@link org.gstreamer.gst.Message} to inspect.
 * @return The type of the {@link org.gstreamer.gst.Message}, or
 * {@code GST_NAVIGATION_MESSAGE_INVALID} if the message is not a {@link Navigation}
 * notification.
 */
public static org.gstreamer.video.NavigationMessageType navigationMessageGetType(org.gstreamer.gst.Message message) {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.gst_navigation_message_get_type.invokeExact(message.handle());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return org.gstreamer.video.NavigationMessageType.of(RESULT);
}

/**
 * Creates a new {@link Navigation} message with type
 * {@code GST_NAVIGATION_MESSAGE_ANGLES_CHANGED} for notifying an application
 * that the current angle, or current number of angles available in a
 * multiangle video has changed.
 * @param src A {@link org.gstreamer.gst.GstObject} to set as source of the new message.
 * @param curAngle The currently selected angle.
 * @param nAngles The number of viewing angles now available.
 * @return The new {@link org.gstreamer.gst.Message}.
 */
public static org.gstreamer.gst.Message navigationMessageNewAnglesChanged(org.gstreamer.gst.GstObject src, int curAngle, int nAngles) {
    MemoryAddress RESULT;
    try {
        RESULT = (MemoryAddress) DowncallHandles.gst_navigation_message_new_angles_changed.invokeExact(
                src.handle(),
                curAngle,
                nAngles);
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    var OBJECT = org.gstreamer.gst.Message.fromAddress.marshal(RESULT, null);
    OBJECT.takeOwnership();
    return OBJECT;
}

/**
 * Creates a new {@link Navigation} message with type
 * {@code GST_NAVIGATION_MESSAGE_COMMANDS_CHANGED}
 * @param src A {@link org.gstreamer.gst.GstObject} to set as source of the new message.
 * @return The new {@link org.gstreamer.gst.Message}.
 */
public static org.gstreamer.gst.Message navigationMessageNewCommandsChanged(org.gstreamer.gst.GstObject src) {
    MemoryAddress RESULT;
    try {
        RESULT = (MemoryAddress) DowncallHandles.gst_navigation_message_new_commands_changed.invokeExact(src.handle());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    var OBJECT = org.gstreamer.gst.Message.fromAddress.marshal(RESULT, null);
    OBJECT.takeOwnership();
    return OBJECT;
}

/**
 * Creates a new {@link Navigation} message with type
 * {@code GST_NAVIGATION_MESSAGE_EVENT}.
 * @param src A {@link org.gstreamer.gst.GstObject} to set as source of the new message.
 * @param event A navigation {@link org.gstreamer.gst.Event}
 * @return The new {@link org.gstreamer.gst.Message}.
 */
public static org.gstreamer.gst.Message navigationMessageNewEvent(org.gstreamer.gst.GstObject src, org.gstreamer.gst.Event event) {
    MemoryAddress RESULT;
    try {
        RESULT = (MemoryAddress) DowncallHandles.gst_navigation_message_new_event.invokeExact(
                src.handle(),
                event.handle());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    var OBJECT = org.gstreamer.gst.Message.fromAddress.marshal(RESULT, null);
    OBJECT.takeOwnership();
    return OBJECT;
}

/**
 * Creates a new {@link Navigation} message with type
 * {@code GST_NAVIGATION_MESSAGE_MOUSE_OVER}.
 * @param src A {@link org.gstreamer.gst.GstObject} to set as source of the new message.
 * @param active {@code true} if the mouse has entered a clickable area of the display.
 * {@code false} if it over a non-clickable area.
 * @return The new {@link org.gstreamer.gst.Message}.
 */
public static org.gstreamer.gst.Message navigationMessageNewMouseOver(org.gstreamer.gst.GstObject src, boolean active) {
    MemoryAddress RESULT;
    try {
        RESULT = (MemoryAddress) DowncallHandles.gst_navigation_message_new_mouse_over.invokeExact(
                src.handle(),
                Marshal.booleanToInteger.marshal(active, null).intValue());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    var OBJECT = org.gstreamer.gst.Message.fromAddress.marshal(RESULT, null);
    OBJECT.takeOwnership();
    return OBJECT;
}

/**
 * Parse a {@link Navigation} message of type GST_NAVIGATION_MESSAGE_ANGLES_CHANGED
 * and extract the {@code cur_angle} and {@code n_angles} parameters.
 * @param message A {@link org.gstreamer.gst.Message} to inspect.
 * @param curAngle A pointer to a {@code guint} to receive the new
 *     current angle number, or NULL
 * @param nAngles A pointer to a {@code guint} to receive the new angle
 *     count, or NULL.
 * @return {@code true} if the message could be successfully parsed. {@code false} if not.
 */
public static boolean navigationMessageParseAnglesChanged(org.gstreamer.gst.Message message, Out<Integer> curAngle, Out<Integer> nAngles) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemorySegment curAnglePOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
        MemorySegment nAnglesPOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_navigation_message_parse_angles_changed.invokeExact(
                    message.handle(),
                    (Addressable) (curAngle == null ? MemoryAddress.NULL : (Addressable) curAnglePOINTER.address()),
                    (Addressable) (nAngles == null ? MemoryAddress.NULL : (Addressable) nAnglesPOINTER.address()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
                if (curAngle != null) curAngle.set(curAnglePOINTER.get(Interop.valueLayout.C_INT, 0));
                if (nAngles != null) nAngles.set(nAnglesPOINTER.get(Interop.valueLayout.C_INT, 0));
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
}

/**
 * Parse a {@link Navigation} message of type {@code GST_NAVIGATION_MESSAGE_EVENT}
 * and extract contained {@link org.gstreamer.gst.Event}. The caller must unref the {@code event} when done
 * with it.
 * @param message A {@link org.gstreamer.gst.Message} to inspect.
 * @param event a pointer to a {@link org.gstreamer.gst.Event} to receive
 *     the contained navigation event.
 * @return {@code true} if the message could be successfully parsed. {@code false} if not.
 */
public static boolean navigationMessageParseEvent(org.gstreamer.gst.Message message, @Nullable Out<org.gstreamer.gst.Event> event) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemorySegment eventPOINTER = SCOPE.allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_navigation_message_parse_event.invokeExact(
                    message.handle(),
                    (Addressable) (event == null ? MemoryAddress.NULL : (Addressable) eventPOINTER.address()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
                if (event != null) event.set(org.gstreamer.gst.Event.fromAddress.marshal(eventPOINTER.get(Interop.valueLayout.ADDRESS, 0), null));
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
}

/**
 * Parse a {@link Navigation} message of type {@code GST_NAVIGATION_MESSAGE_MOUSE_OVER}
 * and extract the active/inactive flag. If the mouse over event is marked
 * active, it indicates that the mouse is over a clickable area.
 * @param message A {@link org.gstreamer.gst.Message} to inspect.
 * @param active A pointer to a gboolean to receive the
 *     active/inactive state, or NULL.
 * @return {@code true} if the message could be successfully parsed. {@code false} if not.
 */
public static boolean navigationMessageParseMouseOver(org.gstreamer.gst.Message message, Out<Boolean> active) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemorySegment activePOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_navigation_message_parse_mouse_over.invokeExact(
                    message.handle(),
                    (Addressable) (active == null ? MemoryAddress.NULL : (Addressable) activePOINTER.address()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
                if (active != null) active.set(activePOINTER.get(Interop.valueLayout.C_INT, 0) != 0);
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
}

/**
 * Inspect a {@link org.gstreamer.gst.Query} and return the {@link NavigationQueryType} associated with
 * it if it is a {@link Navigation} query.
 * @param query The query to inspect
 * @return The {@link NavigationQueryType} of the query, or
 * {@code GST_NAVIGATION_QUERY_INVALID}
 */
public static org.gstreamer.video.NavigationQueryType navigationQueryGetType(org.gstreamer.gst.Query query) {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.gst_navigation_query_get_type.invokeExact(query.handle());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return org.gstreamer.video.NavigationQueryType.of(RESULT);
}

/**
 * Create a new {@link Navigation} angles query. When executed, it will
 * query the pipeline for the set of currently available angles, which may be
 * greater than one in a multiangle video.
 * @return The new query.
 */
public static org.gstreamer.gst.Query navigationQueryNewAngles() {
    MemoryAddress RESULT;
    try {
        RESULT = (MemoryAddress) DowncallHandles.gst_navigation_query_new_angles.invokeExact();
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    var OBJECT = org.gstreamer.gst.Query.fromAddress.marshal(RESULT, null);
    OBJECT.takeOwnership();
    return OBJECT;
}

/**
 * Create a new {@link Navigation} commands query. When executed, it will
 * query the pipeline for the set of currently available commands.
 * @return The new query.
 */
public static org.gstreamer.gst.Query navigationQueryNewCommands() {
    MemoryAddress RESULT;
    try {
        RESULT = (MemoryAddress) DowncallHandles.gst_navigation_query_new_commands.invokeExact();
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    var OBJECT = org.gstreamer.gst.Query.fromAddress.marshal(RESULT, null);
    OBJECT.takeOwnership();
    return OBJECT;
}

/**
 * Parse the current angle number in the {@link Navigation} angles {@code query} into the
 * {@code guint} pointed to by the {@code cur_angle} variable, and the number of available
 * angles into the {@code guint} pointed to by the {@code n_angles} variable.
 * @param query a {@link org.gstreamer.gst.Query}
 * @param curAngle Pointer to a {@code guint} into which to store the
 *     currently selected angle value from the query, or NULL
 * @param nAngles Pointer to a {@code guint} into which to store the
 *     number of angles value from the query, or NULL
 * @return {@code true} if the query could be successfully parsed. {@code false} if not.
 */
public static boolean navigationQueryParseAngles(org.gstreamer.gst.Query query, Out<Integer> curAngle, Out<Integer> nAngles) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemorySegment curAnglePOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
        MemorySegment nAnglesPOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_navigation_query_parse_angles.invokeExact(
                    query.handle(),
                    (Addressable) (curAngle == null ? MemoryAddress.NULL : (Addressable) curAnglePOINTER.address()),
                    (Addressable) (nAngles == null ? MemoryAddress.NULL : (Addressable) nAnglesPOINTER.address()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
                if (curAngle != null) curAngle.set(curAnglePOINTER.get(Interop.valueLayout.C_INT, 0));
                if (nAngles != null) nAngles.set(nAnglesPOINTER.get(Interop.valueLayout.C_INT, 0));
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
}

/**
 * Parse the number of commands in the {@link Navigation} commands {@code query}.
 * @param query a {@link org.gstreamer.gst.Query}
 * @param nCmds the number of commands in this query.
 * @return {@code true} if the query could be successfully parsed. {@code false} if not.
 */
public static boolean navigationQueryParseCommandsLength(org.gstreamer.gst.Query query, Out<Integer> nCmds) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemorySegment nCmdsPOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_navigation_query_parse_commands_length.invokeExact(
                    query.handle(),
                    (Addressable) (nCmds == null ? MemoryAddress.NULL : (Addressable) nCmdsPOINTER.address()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
                if (nCmds != null) nCmds.set(nCmdsPOINTER.get(Interop.valueLayout.C_INT, 0));
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
}

/**
 * Parse the {@link Navigation} command query and retrieve the {@code nth} command from
 * it into {@code cmd}. If the list contains less elements than {@code nth}, {@code cmd} will be
 * set to {@code GST_NAVIGATION_COMMAND_INVALID}.
 * @param query a {@link org.gstreamer.gst.Query}
 * @param nth the nth command to retrieve.
 * @param cmd a pointer to store the nth command into.
 * @return {@code true} if the query could be successfully parsed. {@code false} if not.
 */
public static boolean navigationQueryParseCommandsNth(org.gstreamer.gst.Query query, int nth, @Nullable Out<org.gstreamer.video.NavigationCommand> cmd) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemorySegment cmdPOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_navigation_query_parse_commands_nth.invokeExact(
                    query.handle(),
                    nth,
                    (Addressable) (cmd == null ? MemoryAddress.NULL : (Addressable) cmdPOINTER.address()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
                if (cmd != null) cmd.set(org.gstreamer.video.NavigationCommand.of(cmdPOINTER.get(Interop.valueLayout.C_INT, 0)));
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
}

/**
 * Set the {@link Navigation} angles query result field in {@code query}.
 * @param query a {@link org.gstreamer.gst.Query}
 * @param curAngle the current viewing angle to set.
 * @param nAngles the number of viewing angles to set.
 */
public static void navigationQuerySetAngles(org.gstreamer.gst.Query query, int curAngle, int nAngles) {
    try {
        DowncallHandles.gst_navigation_query_set_angles.invokeExact(
                query.handle(),
                curAngle,
                nAngles);
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
}

/**
 * Set the {@link Navigation} command query result fields in {@code query}. The number
 * of commands passed must be equal to {@code n_commands}.
 * @param query a {@link org.gstreamer.gst.Query}
 * @param nCmds the number of commands to set.
 * @param cmds An array containing {@code n_cmds}
 *     {@code GstNavigationCommand} values.
 */
public static void navigationQuerySetCommandsv(org.gstreamer.gst.Query query, int nCmds, org.gstreamer.video.NavigationCommand[] cmds) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        try {
            DowncallHandles.gst_navigation_query_set_commandsv.invokeExact(
                    query.handle(),
                    nCmds,
                    Interop.allocateNativeArray(Enumeration.getValues(cmds), false, SCOPE));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
}

public static org.gtk.glib.Type videoAfdMetaApiGetType() {
    long RESULT;
    try {
        RESULT = (long) DowncallHandles.gst_video_afd_meta_api_get_type.invokeExact();
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return new org.gtk.glib.Type(RESULT);
}

public static org.gstreamer.gst.MetaInfo videoAfdMetaGetInfo() {
    MemoryAddress RESULT;
    try {
        RESULT = (MemoryAddress) DowncallHandles.gst_video_afd_meta_get_info.invokeExact();
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return org.gstreamer.gst.MetaInfo.fromAddress.marshal(RESULT, null);
}

public static org.gtk.glib.Type videoAffineTransformationMetaApiGetType() {
    long RESULT;
    try {
        RESULT = (long) DowncallHandles.gst_video_affine_transformation_meta_api_get_type.invokeExact();
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return new org.gtk.glib.Type(RESULT);
}

public static org.gstreamer.gst.MetaInfo videoAffineTransformationMetaGetInfo() {
    MemoryAddress RESULT;
    try {
        RESULT = (MemoryAddress) DowncallHandles.gst_video_affine_transformation_meta_get_info.invokeExact();
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return org.gstreamer.gst.MetaInfo.fromAddress.marshal(RESULT, null);
}

public static org.gtk.glib.Type videoBarMetaApiGetType() {
    long RESULT;
    try {
        RESULT = (long) DowncallHandles.gst_video_bar_meta_api_get_type.invokeExact();
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return new org.gtk.glib.Type(RESULT);
}

public static org.gstreamer.gst.MetaInfo videoBarMetaGetInfo() {
    MemoryAddress RESULT;
    try {
        RESULT = (MemoryAddress) DowncallHandles.gst_video_bar_meta_get_info.invokeExact();
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return org.gstreamer.gst.MetaInfo.fromAddress.marshal(RESULT, null);
}

/**
 * Lets you blend the {@code src} image into the {@code dest} image
 * @param dest The {@link VideoFrame} where to blend {@code src} in
 * @param src the {@link VideoFrame} that we want to blend into
 * @param x The x offset in pixel where the {@code src} image should be blended
 * @param y the y offset in pixel where the {@code src} image should be blended
 * @param globalAlpha the global_alpha each per-pixel alpha value is multiplied
 *                with
 */
public static boolean videoBlend(org.gstreamer.video.VideoFrame dest, org.gstreamer.video.VideoFrame src, int x, int y, float globalAlpha) {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.gst_video_blend.invokeExact(
                dest.handle(),
                src.handle(),
                x,
                y,
                globalAlpha);
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
}

/**
 * Scales a buffer containing RGBA (or AYUV) video. This is an internal
 * helper function which is used to scale subtitle overlays, and may be
 * deprecated in the near future. Use {@link VideoScaler} to scale video buffers
 * instead.
 * @param src the {@link VideoInfo} describing the video data in {@code src_buffer}
 * @param srcBuffer the source buffer containing video pixels to scale
 * @param destHeight the height in pixels to scale the video data in {@code src_buffer} to
 * @param destWidth the width in pixels to scale the video data in {@code src_buffer} to
 * @param dest pointer to a {@link VideoInfo} structure that will be filled in
 *     with the details for {@code dest_buffer}
 * @param destBuffer a pointer to a {@link org.gstreamer.gst.Buffer} variable, which will be
 *     set to a newly-allocated buffer containing the scaled pixels.
 */
public static void videoBlendScaleLinearRGBA(org.gstreamer.video.VideoInfo src, org.gstreamer.gst.Buffer srcBuffer, int destHeight, int destWidth, org.gstreamer.video.VideoInfo dest, Out<org.gstreamer.gst.Buffer> destBuffer) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemorySegment destBufferPOINTER = SCOPE.allocate(Interop.valueLayout.ADDRESS);
        try {
            DowncallHandles.gst_video_blend_scale_linear_RGBA.invokeExact(
                    src.handle(),
                    srcBuffer.handle(),
                    destHeight,
                    destWidth,
                    dest.handle(),
                    (Addressable) destBufferPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
                destBuffer.set(org.gstreamer.gst.Buffer.fromAddress.marshal(destBufferPOINTER.get(Interop.valueLayout.ADDRESS, 0), null));
    }
}

/**
 * Given the Pixel Aspect Ratio and size of an input video frame, and the
 * pixel aspect ratio of the intended display device, calculates the actual
 * display ratio the video will be rendered with.
 * @param darN Numerator of the calculated display_ratio
 * @param darD Denominator of the calculated display_ratio
 * @param videoWidth Width of the video frame in pixels
 * @param videoHeight Height of the video frame in pixels
 * @param videoParN Numerator of the pixel aspect ratio of the input video.
 * @param videoParD Denominator of the pixel aspect ratio of the input video.
 * @param displayParN Numerator of the pixel aspect ratio of the display device
 * @param displayParD Denominator of the pixel aspect ratio of the display device
 * @return A boolean indicating success and a calculated Display Ratio in the
 * dar_n and dar_d parameters.
 * The return value is FALSE in the case of integer overflow or other error.
 */
public static boolean videoCalculateDisplayRatio(Out<Integer> darN, Out<Integer> darD, int videoWidth, int videoHeight, int videoParN, int videoParD, int displayParN, int displayParD) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemorySegment darNPOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
        MemorySegment darDPOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_video_calculate_display_ratio.invokeExact(
                    (Addressable) darNPOINTER.address(),
                    (Addressable) darDPOINTER.address(),
                    videoWidth,
                    videoHeight,
                    videoParN,
                    videoParD,
                    displayParN,
                    displayParD);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
                darN.set(darNPOINTER.get(Interop.valueLayout.C_INT, 0));
                darD.set(darDPOINTER.get(Interop.valueLayout.C_INT, 0));
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
}

public static org.gtk.glib.Type videoCaptionMetaApiGetType() {
    long RESULT;
    try {
        RESULT = (long) DowncallHandles.gst_video_caption_meta_api_get_type.invokeExact();
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return new org.gtk.glib.Type(RESULT);
}

public static org.gstreamer.gst.MetaInfo videoCaptionMetaGetInfo() {
    MemoryAddress RESULT;
    try {
        RESULT = (MemoryAddress) DowncallHandles.gst_video_caption_meta_get_info.invokeExact();
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return org.gstreamer.gst.MetaInfo.fromAddress.marshal(RESULT, null);
}

/**
 * Parses fixed Closed Caption {@link org.gstreamer.gst.Caps} and returns the corresponding caption
 * type, or {@link VideoCaptionType#UNKNOWN}.
 * @param caps Fixed {@link org.gstreamer.gst.Caps} to parse
 * @return {@link VideoCaptionType}.
 */
public static org.gstreamer.video.VideoCaptionType videoCaptionTypeFromCaps(org.gstreamer.gst.Caps caps) {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.gst_video_caption_type_from_caps.invokeExact(caps.handle());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return org.gstreamer.video.VideoCaptionType.of(RESULT);
}

/**
 * Creates new caps corresponding to {@code type}.
 * @param type {@link VideoCaptionType}
 * @return new {@link org.gstreamer.gst.Caps}
 */
public static org.gstreamer.gst.Caps videoCaptionTypeToCaps(org.gstreamer.video.VideoCaptionType type) {
    MemoryAddress RESULT;
    try {
        RESULT = (MemoryAddress) DowncallHandles.gst_video_caption_type_to_caps.invokeExact(type.getValue());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    var OBJECT = org.gstreamer.gst.Caps.fromAddress.marshal(RESULT, null);
    OBJECT.takeOwnership();
    return OBJECT;
}

/**
 * Takes {@code src} rectangle and position it at the center of {@code dst} rectangle with or
 * without {@code scaling}. It handles clipping if the {@code src} rectangle is bigger than
 * the {@code dst} one and {@code scaling} is set to FALSE.
 * @param src a pointer to {@link VideoRectangle} describing the source area
 * @param dst a pointer to {@link VideoRectangle} describing the destination area
 * @param result a pointer to a {@link VideoRectangle} which will receive the result area
 * @param scaling a {@code gboolean} indicating if scaling should be applied or not
 */
public static void videoCenterRect(org.gstreamer.video.VideoRectangle src, org.gstreamer.video.VideoRectangle dst, org.gstreamer.video.VideoRectangle result, boolean scaling) {
    try {
        DowncallHandles.gst_video_center_rect.invokeExact(
                src.handle(),
                dst.handle(),
                result.handle(),
                Marshal.booleanToInteger.marshal(scaling, null).intValue());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
}

/**
 * Convert {@code s} to a {@link VideoChromaSite}
 * @param s a chromasite string
 * @return a {@link VideoChromaSite} or {@link VideoChromaSite#UNKNOWN} when {@code s} does
 * not contain a valid chroma description.
 * @deprecated Use gst_video_chroma_site_from_string() instead.
 */
@Deprecated
public static org.gstreamer.video.VideoChromaSite videoChromaFromString(java.lang.String s) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_video_chroma_from_string.invokeExact(Marshal.stringToAddress.marshal(s, SCOPE));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.video.VideoChromaSite(RESULT);
    }
}

/**
 * Perform resampling of {@code width} chroma pixels in {@code lines}.
 * @param resample a {@link VideoChromaResample}
 * @param lines pixel lines
 * @param width the number of pixels on one line
 */
public static void videoChromaResample(org.gstreamer.video.VideoChromaResample resample, @Nullable java.lang.foreign.MemoryAddress lines, int width) {
    try {
        DowncallHandles.gst_video_chroma_resample.invokeExact(
                resample.handle(),
                (Addressable) (lines == null ? MemoryAddress.NULL : (Addressable) lines),
                width);
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
}

/**
 * Create a new resampler object for the given parameters. When {@code h_factor} or
 * {@code v_factor} is &gt; 0, upsampling will be used, otherwise subsampling is
 * performed.
 * @param method a {@link VideoChromaMethod}
 * @param site a {@link VideoChromaSite}
 * @param flags {@link VideoChromaFlags}
 * @param format the {@link VideoFormat}
 * @param hFactor horizontal resampling factor
 * @param vFactor vertical resampling factor
 * @return a new {@link VideoChromaResample} that should be freed with
 *     gst_video_chroma_resample_free() after usage.
 */
public static org.gstreamer.video.VideoChromaResample videoChromaResampleNew(org.gstreamer.video.VideoChromaMethod method, org.gstreamer.video.VideoChromaSite site, org.gstreamer.video.VideoChromaFlags flags, org.gstreamer.video.VideoFormat format, int hFactor, int vFactor) {
    MemoryAddress RESULT;
    try {
        RESULT = (MemoryAddress) DowncallHandles.gst_video_chroma_resample_new.invokeExact(
                method.getValue(),
                site.getValue(),
                flags.getValue(),
                format.getValue(),
                hFactor,
                vFactor);
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return org.gstreamer.video.VideoChromaResample.fromAddress.marshal(RESULT, null);
}

/**
 * Convert {@code s} to a {@link VideoChromaSite}
 * @param s a chromasite string
 * @return a {@link VideoChromaSite} or {@link VideoChromaSite#UNKNOWN} when {@code s} does
 * not contain a valid chroma-site description.
 */
public static org.gstreamer.video.VideoChromaSite videoChromaSiteFromString(java.lang.String s) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_video_chroma_site_from_string.invokeExact(Marshal.stringToAddress.marshal(s, SCOPE));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.video.VideoChromaSite(RESULT);
    }
}

/**
 * Converts {@code site} to its string representation.
 * @param site a {@link VideoChromaSite}
 * @return a string representation of {@code site}
 *          or {@code null} if {@code site} contains undefined value or
 *          is equal to {@link VideoChromaSite#UNKNOWN}
 */
public static @Nullable java.lang.String videoChromaSiteToString(org.gstreamer.video.VideoChromaSite site) {
    MemoryAddress RESULT;
    try {
        RESULT = (MemoryAddress) DowncallHandles.gst_video_chroma_site_to_string.invokeExact(site.getValue());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return Marshal.addressToString.marshal(RESULT, null);
}

/**
 * Converts {@code site} to its string representation.
 * @param site a {@link VideoChromaSite}
 * @return a string describing {@code site}.
 * @deprecated Use gst_video_chroma_site_to_string() instead.
 */
@Deprecated
public static java.lang.String videoChromaToString(org.gstreamer.video.VideoChromaSite site) {
    MemoryAddress RESULT;
    try {
        RESULT = (MemoryAddress) DowncallHandles.gst_video_chroma_to_string.invokeExact(site.getValue());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return Marshal.addressToString.marshal(RESULT, null);
}

public static org.gtk.glib.Type videoCodecAlphaMetaApiGetType() {
    long RESULT;
    try {
        RESULT = (long) DowncallHandles.gst_video_codec_alpha_meta_api_get_type.invokeExact();
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return new org.gtk.glib.Type(RESULT);
}

public static org.gstreamer.gst.MetaInfo videoCodecAlphaMetaGetInfo() {
    MemoryAddress RESULT;
    try {
        RESULT = (MemoryAddress) DowncallHandles.gst_video_codec_alpha_meta_get_info.invokeExact();
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return org.gstreamer.gst.MetaInfo.fromAddress.marshal(RESULT, null);
}

/**
 * Converts the {@code value} to the {@link VideoColorMatrix}
 * The matrix coefficients (MatrixCoefficients) value is
 * defined by "ISO/IEC 23001-8 Section 7.3 Table 4"
 * and "ITU-T H.273 Table 4".
 * "H.264 Table E-5" and "H.265 Table E.5" share the identical values.
 * @param value a ITU-T H.273 matrix coefficients value
 * @return the matched {@link VideoColorMatrix}
 */
public static org.gstreamer.video.VideoColorMatrix videoColorMatrixFromIso(int value) {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.gst_video_color_matrix_from_iso.invokeExact(value);
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return org.gstreamer.video.VideoColorMatrix.of(RESULT);
}

/**
 * Get the coefficients used to convert between Y'PbPr and R'G'B' using {@code matrix}.
 * <p>
 * When:
 * <pre>{@code 
 *   0.0 <= [Y',R',G',B'] <= 1.0)
 *   (-0.5 <= [Pb,Pr] <= 0.5)
 * }</pre>
 * <p>
 * the general conversion is given by:
 * <pre>{@code 
 *   Y' = Kr*R' + (1-Kr-Kb)*G' + Kb*B'
 *   Pb = (B'-Y')/(2*(1-Kb))
 *   Pr = (R'-Y')/(2*(1-Kr))
 * }</pre>
 * <p>
 * and the other way around:
 * <pre>{@code 
 *   R' = Y' + Cr*2*(1-Kr)
 *   G' = Y' - Cb*2*(1-Kb)*Kb/(1-Kr-Kb) - Cr*2*(1-Kr)*Kr/(1-Kr-Kb)
 *   B' = Y' + Cb*2*(1-Kb)
 * }</pre>
 * @param matrix a {@link VideoColorMatrix}
 * @param Kr result red channel coefficient
 * @param Kb result blue channel coefficient
 * @return TRUE if {@code matrix} was a YUV color format and {@code Kr} and {@code Kb} contain valid
 *    values.
 */
public static boolean videoColorMatrixGetKrKb(org.gstreamer.video.VideoColorMatrix matrix, Out<Double> Kr, Out<Double> Kb) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemorySegment KrPOINTER = SCOPE.allocate(Interop.valueLayout.C_DOUBLE);
        MemorySegment KbPOINTER = SCOPE.allocate(Interop.valueLayout.C_DOUBLE);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_video_color_matrix_get_Kr_Kb.invokeExact(
                    matrix.getValue(),
                    (Addressable) KrPOINTER.address(),
                    (Addressable) KbPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
                Kr.set(KrPOINTER.get(Interop.valueLayout.C_DOUBLE, 0));
                Kb.set(KbPOINTER.get(Interop.valueLayout.C_DOUBLE, 0));
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
}

/**
 * Converts {@link VideoColorMatrix} to the "matrix coefficients"
 * (MatrixCoefficients) value defined by "ISO/IEC 23001-8 Section 7.3 Table 4"
 * and "ITU-T H.273 Table 4".
 * "H.264 Table E-5" and "H.265 Table E.5" share the identical values.
 * @param matrix a {@link VideoColorMatrix}
 * @return The value of ISO/IEC 23001-8 matrix coefficients.
 */
public static int videoColorMatrixToIso(org.gstreamer.video.VideoColorMatrix matrix) {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.gst_video_color_matrix_to_iso.invokeExact(matrix.getValue());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return RESULT;
}

/**
 * Converts the {@code value} to the {@link VideoColorPrimaries}
 * The colour primaries (ColourPrimaries) value is
 * defined by "ISO/IEC 23001-8 Section 7.1 Table 2" and "ITU-T H.273 Table 2".
 * "H.264 Table E-3" and "H.265 Table E.3" share the identical values.
 * @param value a ITU-T H.273 colour primaries value
 * @return the matched {@link VideoColorPrimaries}
 */
public static org.gstreamer.video.VideoColorPrimaries videoColorPrimariesFromIso(int value) {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.gst_video_color_primaries_from_iso.invokeExact(value);
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return org.gstreamer.video.VideoColorPrimaries.of(RESULT);
}

/**
 * Get information about the chromaticity coordinates of {@code primaries}.
 * @param primaries a {@link VideoColorPrimaries}
 * @return a {@link VideoColorPrimariesInfo} for {@code primaries}.
 */
public static org.gstreamer.video.VideoColorPrimariesInfo videoColorPrimariesGetInfo(org.gstreamer.video.VideoColorPrimaries primaries) {
    MemoryAddress RESULT;
    try {
        RESULT = (MemoryAddress) DowncallHandles.gst_video_color_primaries_get_info.invokeExact(primaries.getValue());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return org.gstreamer.video.VideoColorPrimariesInfo.fromAddress.marshal(RESULT, null);
}

/**
 * Converts {@link VideoColorPrimaries} to the "colour primaries" (ColourPrimaries)
 * value defined by "ISO/IEC 23001-8 Section 7.1 Table 2"
 * and "ITU-T H.273 Table 2".
 * "H.264 Table E-3" and "H.265 Table E.3" share the identical values.
 * @param primaries a {@link VideoColorPrimaries}
 * @return The value of ISO/IEC 23001-8 colour primaries.
 */
public static int videoColorPrimariesToIso(org.gstreamer.video.VideoColorPrimaries primaries) {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.gst_video_color_primaries_to_iso.invokeExact(primaries.getValue());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return RESULT;
}

/**
 * Compute the offset and scale values for each component of {@code info}. For each
 * component, (c[i] - offset[i]) / scale[i] will scale the component c[i] to the
 * range [0.0 .. 1.0].
 * <p>
 * The reverse operation (c[i] * scale[i]) + offset[i] can be used to convert
 * the component values in range [0.0 .. 1.0] back to their representation in
 * {@code info} and {@code range}.
 * @param range a {@link VideoColorRange}
 * @param info a {@link VideoFormatInfo}
 * @param offset output offsets
 * @param scale output scale
 */
public static void videoColorRangeOffsets(org.gstreamer.video.VideoColorRange range, org.gstreamer.video.VideoFormatInfo info, Out<int[]> offset, Out<int[]> scale) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemorySegment offsetPOINTER = SCOPE.allocate(Interop.valueLayout.ADDRESS);
        MemorySegment scalePOINTER = SCOPE.allocate(Interop.valueLayout.ADDRESS);
        try {
            DowncallHandles.gst_video_color_range_offsets.invokeExact(
                    range.getValue(),
                    info.handle(),
                    (Addressable) offsetPOINTER.address(),
                    (Addressable) scalePOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        offset.set(MemorySegment.ofAddress(offsetPOINTER.get(Interop.valueLayout.ADDRESS, 0), 4 * Interop.valueLayout.C_INT.byteSize(), SCOPE).toArray(Interop.valueLayout.C_INT));
        scale.set(MemorySegment.ofAddress(scalePOINTER.get(Interop.valueLayout.ADDRESS, 0), 4 * Interop.valueLayout.C_INT.byteSize(), SCOPE).toArray(Interop.valueLayout.C_INT));
    }
}

@Deprecated
public static double videoColorTransferDecode(org.gstreamer.video.VideoTransferFunction func, double val) {
    double RESULT;
    try {
        RESULT = (double) DowncallHandles.gst_video_color_transfer_decode.invokeExact(
                func.getValue(),
                val);
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return RESULT;
}

@Deprecated
public static double videoColorTransferEncode(org.gstreamer.video.VideoTransferFunction func, double val) {
    double RESULT;
    try {
        RESULT = (double) DowncallHandles.gst_video_color_transfer_encode.invokeExact(
                func.getValue(),
                val);
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return RESULT;
}

/**
 * Converts a raw video buffer into the specified output caps.
 * <p>
 * The output caps can be any raw video formats or any image formats (jpeg, png, ...).
 * <p>
 * The width, height and pixel-aspect-ratio can also be specified in the output caps.
 * @param sample a {@link org.gstreamer.gst.Sample}
 * @param toCaps the {@link org.gstreamer.gst.Caps} to convert to
 * @param timeout the maximum amount of time allowed for the processing.
 * @return The converted {@link org.gstreamer.gst.Sample}, or {@code null} if an error happened (in which case {@code err}
 * will point to the {@link org.gtk.glib.Error}).
 * @throws GErrorException See {@link org.gtk.glib.Error}
 */
public static org.gstreamer.gst.Sample videoConvertSample(org.gstreamer.gst.Sample sample, org.gstreamer.gst.Caps toCaps, org.gstreamer.gst.ClockTime timeout) throws io.github.jwharm.javagi.GErrorException {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_video_convert_sample.invokeExact(
                    sample.handle(),
                    toCaps.handle(),
                    timeout.getValue().longValue(),
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        var OBJECT = org.gstreamer.gst.Sample.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
}

/**
 * Converts a raw video buffer into the specified output caps.
 * <p>
 * The output caps can be any raw video formats or any image formats (jpeg, png, ...).
 * <p>
 * The width, height and pixel-aspect-ratio can also be specified in the output caps.
 * <p>
 * {@code callback} will be called after conversion, when an error occurred or if conversion didn't
 * finish after {@code timeout}. {@code callback} will always be called from the thread default
 * {@code GMainContext}, see g_main_context_get_thread_default(). If GLib before 2.22 is used,
 * this will always be the global default main context.
 * <p>
 * {@code destroy_notify} will be called after the callback was called and {@code user_data} is not needed
 * anymore.
 * @param sample a {@link org.gstreamer.gst.Sample}
 * @param toCaps the {@link org.gstreamer.gst.Caps} to convert to
 * @param timeout the maximum amount of time allowed for the processing.
 * @param callback {@code GstVideoConvertSampleCallback} that will be called after conversion.
 * @param destroyNotify {@code GDestroyNotify} to be called after {@code user_data} is not needed anymore
 */
public static void videoConvertSampleAsync(org.gstreamer.gst.Sample sample, org.gstreamer.gst.Caps toCaps, org.gstreamer.gst.ClockTime timeout, org.gstreamer.video.VideoConvertSampleCallback callback, org.gtk.glib.DestroyNotify destroyNotify) {
    try {
        DowncallHandles.gst_video_convert_sample_async.invokeExact(
                sample.handle(),
                toCaps.handle(),
                timeout.getValue().longValue(),
                (Addressable) callback.toCallback(),
                (Addressable) MemoryAddress.NULL,
                (Addressable) destroyNotify.toCallback());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
}

/**
 * Create a new converter object to convert between {@code in_info} and {@code out_info}
 * with {@code config}.
 * @param inInfo a {@link VideoInfo}
 * @param outInfo a {@link VideoInfo}
 * @param config a {@link org.gstreamer.gst.Structure} with configuration options
 * @return a {@link VideoConverter} or {@code null} if conversion is not possible.
 */
public static org.gstreamer.video.VideoConverter videoConverterNew(org.gstreamer.video.VideoInfo inInfo, org.gstreamer.video.VideoInfo outInfo, org.gstreamer.gst.Structure config) {
    MemoryAddress RESULT;
    try {
        RESULT = (MemoryAddress) DowncallHandles.gst_video_converter_new.invokeExact(
                inInfo.handle(),
                outInfo.handle(),
                config.handle());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    config.yieldOwnership();
    return org.gstreamer.video.VideoConverter.fromAddress.marshal(RESULT, null);
}

/**
 * Create a new converter object to convert between {@code in_info} and {@code out_info}
 * with {@code config}.
 * <p>
 * The optional {@code pool} can be used to spawn threads, this is useful when
 * creating new converters rapidly, for example when updating cropping.
 * @param inInfo a {@link VideoInfo}
 * @param outInfo a {@link VideoInfo}
 * @param config a {@link org.gstreamer.gst.Structure} with configuration options
 * @param pool a {@link org.gstreamer.gst.TaskPool} to spawn threads from
 * @return a {@link VideoConverter} or {@code null} if conversion is not possible.
 */
public static org.gstreamer.video.VideoConverter videoConverterNewWithPool(org.gstreamer.video.VideoInfo inInfo, org.gstreamer.video.VideoInfo outInfo, org.gstreamer.gst.Structure config, @Nullable org.gstreamer.gst.TaskPool pool) {
    MemoryAddress RESULT;
    try {
        RESULT = (MemoryAddress) DowncallHandles.gst_video_converter_new_with_pool.invokeExact(
                inInfo.handle(),
                outInfo.handle(),
                config.handle(),
                (Addressable) (pool == null ? MemoryAddress.NULL : pool.handle()));
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    config.yieldOwnership();
    return org.gstreamer.video.VideoConverter.fromAddress.marshal(RESULT, null);
}

public static org.gtk.glib.Type videoCropMetaApiGetType() {
    long RESULT;
    try {
        RESULT = (long) DowncallHandles.gst_video_crop_meta_api_get_type.invokeExact();
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return new org.gtk.glib.Type(RESULT);
}

public static org.gstreamer.gst.MetaInfo videoCropMetaGetInfo() {
    MemoryAddress RESULT;
    try {
        RESULT = (MemoryAddress) DowncallHandles.gst_video_crop_meta_get_info.invokeExact();
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return org.gstreamer.gst.MetaInfo.fromAddress.marshal(RESULT, null);
}

/**
 * Make a new dither object for dithering lines of {@code format} using the
 * algorithm described by {@code method}.
 * <p>
 * Each component will be quantized to a multiple of {@code quantizer}. Better
 * performance is achieved when {@code quantizer} is a power of 2.
 * <p>
 * {@code width} is the width of the lines that this ditherer will handle.
 * @param method a {@link VideoDitherMethod}
 * @param flags a {@link VideoDitherFlags}
 * @param format a {@link VideoFormat}
 * @param quantizer quantizer
 * @param width the width of the lines
 * @return a new {@link VideoDither}
 */
public static org.gstreamer.video.VideoDither videoDitherNew(org.gstreamer.video.VideoDitherMethod method, org.gstreamer.video.VideoDitherFlags flags, org.gstreamer.video.VideoFormat format, PointerInteger quantizer, int width) {
    MemoryAddress RESULT;
    try {
        RESULT = (MemoryAddress) DowncallHandles.gst_video_dither_new.invokeExact(
                method.getValue(),
                flags.getValue(),
                format.getValue(),
                quantizer.handle(),
                width);
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return org.gstreamer.video.VideoDither.fromAddress.marshal(RESULT, null);
}

/**
 * Checks if an event is a force key unit event. Returns true for both upstream
 * and downstream force key unit events.
 * @param event A {@link org.gstreamer.gst.Event} to check
 * @return {@code true} if the event is a valid force key unit event
 */
public static boolean videoEventIsForceKeyUnit(org.gstreamer.gst.Event event) {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.gst_video_event_is_force_key_unit.invokeExact(event.handle());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
}

/**
 * Creates a new downstream force key unit event. A downstream force key unit
 * event can be sent down the pipeline to request downstream elements to produce
 * a key unit. A downstream force key unit event must also be sent when handling
 * an upstream force key unit event to notify downstream that the latter has been
 * handled.
 * <p>
 * To parse an event created by gst_video_event_new_downstream_force_key_unit() use
 * gst_video_event_parse_downstream_force_key_unit().
 * @param timestamp the timestamp of the buffer that starts a new key unit
 * @param streamTime the stream_time of the buffer that starts a new key unit
 * @param runningTime the running_time of the buffer that starts a new key unit
 * @param allHeaders {@code true} to produce headers when starting a new key unit
 * @param count integer that can be used to number key units
 * @return The new GstEvent
 */
public static org.gstreamer.gst.Event videoEventNewDownstreamForceKeyUnit(org.gstreamer.gst.ClockTime timestamp, org.gstreamer.gst.ClockTime streamTime, org.gstreamer.gst.ClockTime runningTime, boolean allHeaders, int count) {
    MemoryAddress RESULT;
    try {
        RESULT = (MemoryAddress) DowncallHandles.gst_video_event_new_downstream_force_key_unit.invokeExact(
                timestamp.getValue().longValue(),
                streamTime.getValue().longValue(),
                runningTime.getValue().longValue(),
                Marshal.booleanToInteger.marshal(allHeaders, null).intValue(),
                count);
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    var OBJECT = org.gstreamer.gst.Event.fromAddress.marshal(RESULT, null);
    OBJECT.takeOwnership();
    return OBJECT;
}

/**
 * Creates a new Still Frame event. If {@code in_still} is {@code true}, then the event
 * represents the start of a still frame sequence. If it is {@code false}, then
 * the event ends a still frame sequence.
 * <p>
 * To parse an event created by gst_video_event_new_still_frame() use
 * gst_video_event_parse_still_frame().
 * @param inStill boolean value for the still-frame state of the event.
 * @return The new GstEvent
 */
public static org.gstreamer.gst.Event videoEventNewStillFrame(boolean inStill) {
    MemoryAddress RESULT;
    try {
        RESULT = (MemoryAddress) DowncallHandles.gst_video_event_new_still_frame.invokeExact(Marshal.booleanToInteger.marshal(inStill, null).intValue());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    var OBJECT = org.gstreamer.gst.Event.fromAddress.marshal(RESULT, null);
    OBJECT.takeOwnership();
    return OBJECT;
}

/**
 * Creates a new upstream force key unit event. An upstream force key unit event
 * can be sent to request upstream elements to produce a key unit.
 * <p>
 * {@code running_time} can be set to request a new key unit at a specific
 * running_time. If set to GST_CLOCK_TIME_NONE, upstream elements will produce a
 * new key unit as soon as possible.
 * <p>
 * To parse an event created by gst_video_event_new_downstream_force_key_unit() use
 * gst_video_event_parse_downstream_force_key_unit().
 * @param runningTime the running_time at which a new key unit should be produced
 * @param allHeaders {@code true} to produce headers when starting a new key unit
 * @param count integer that can be used to number key units
 * @return The new GstEvent
 */
public static org.gstreamer.gst.Event videoEventNewUpstreamForceKeyUnit(org.gstreamer.gst.ClockTime runningTime, boolean allHeaders, int count) {
    MemoryAddress RESULT;
    try {
        RESULT = (MemoryAddress) DowncallHandles.gst_video_event_new_upstream_force_key_unit.invokeExact(
                runningTime.getValue().longValue(),
                Marshal.booleanToInteger.marshal(allHeaders, null).intValue(),
                count);
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    var OBJECT = org.gstreamer.gst.Event.fromAddress.marshal(RESULT, null);
    OBJECT.takeOwnership();
    return OBJECT;
}

/**
 * Get timestamp, stream-time, running-time, all-headers and count in the force
 * key unit event. See gst_video_event_new_downstream_force_key_unit() for a
 * full description of the downstream force key unit event.
 * <p>
 * {@code running_time} will be adjusted for any pad offsets of pads it was passing through.
 * @param event A {@link org.gstreamer.gst.Event} to parse
 * @param timestamp A pointer to the timestamp in the event
 * @param streamTime A pointer to the stream-time in the event
 * @param runningTime A pointer to the running-time in the event
 * @param allHeaders A pointer to the all_headers flag in the event
 * @param count A pointer to the count field of the event
 * @return {@code true} if the event is a valid downstream force key unit event.
 */
public static boolean videoEventParseDownstreamForceKeyUnit(org.gstreamer.gst.Event event, org.gstreamer.gst.ClockTime timestamp, org.gstreamer.gst.ClockTime streamTime, org.gstreamer.gst.ClockTime runningTime, Out<Boolean> allHeaders, Out<Integer> count) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemorySegment timestampPOINTER = SCOPE.allocate(Interop.valueLayout.C_LONG);
        MemorySegment streamTimePOINTER = SCOPE.allocate(Interop.valueLayout.C_LONG);
        MemorySegment runningTimePOINTER = SCOPE.allocate(Interop.valueLayout.C_LONG);
        MemorySegment allHeadersPOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
        MemorySegment countPOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_video_event_parse_downstream_force_key_unit.invokeExact(
                    event.handle(),
                    (Addressable) timestampPOINTER.address(),
                    (Addressable) streamTimePOINTER.address(),
                    (Addressable) runningTimePOINTER.address(),
                    (Addressable) allHeadersPOINTER.address(),
                    (Addressable) countPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
                timestamp.setValue(timestampPOINTER.get(Interop.valueLayout.C_LONG, 0));
                streamTime.setValue(streamTimePOINTER.get(Interop.valueLayout.C_LONG, 0));
                runningTime.setValue(runningTimePOINTER.get(Interop.valueLayout.C_LONG, 0));
                allHeaders.set(allHeadersPOINTER.get(Interop.valueLayout.C_INT, 0) != 0);
                count.set(countPOINTER.get(Interop.valueLayout.C_INT, 0));
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
}

/**
 * Parse a {@link org.gstreamer.gst.Event}, identify if it is a Still Frame event, and
 * return the still-frame state from the event if it is.
 * If the event represents the start of a still frame, the in_still
 * variable will be set to TRUE, otherwise FALSE. It is OK to pass NULL for the
 * in_still variable order to just check whether the event is a valid still-frame
 * event.
 * <p>
 * Create a still frame event using gst_video_event_new_still_frame()
 * @param event A {@link org.gstreamer.gst.Event} to parse
 * @param inStill A boolean to receive the still-frame status from the event, or NULL
 * @return {@code true} if the event is a valid still-frame event. {@code false} if not
 */
public static boolean videoEventParseStillFrame(org.gstreamer.gst.Event event, Out<Boolean> inStill) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemorySegment inStillPOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_video_event_parse_still_frame.invokeExact(
                    event.handle(),
                    (Addressable) inStillPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
                inStill.set(inStillPOINTER.get(Interop.valueLayout.C_INT, 0) != 0);
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
}

/**
 * Get running-time, all-headers and count in the force key unit event. See
 * gst_video_event_new_upstream_force_key_unit() for a full description of the
 * upstream force key unit event.
 * <p>
 * Create an upstream force key unit event using  gst_video_event_new_upstream_force_key_unit()
 * <p>
 * {@code running_time} will be adjusted for any pad offsets of pads it was passing through.
 * @param event A {@link org.gstreamer.gst.Event} to parse
 * @param runningTime A pointer to the running_time in the event
 * @param allHeaders A pointer to the all_headers flag in the event
 * @param count A pointer to the count field in the event
 * @return {@code true} if the event is a valid upstream force-key-unit event. {@code false} if not
 */
public static boolean videoEventParseUpstreamForceKeyUnit(org.gstreamer.gst.Event event, org.gstreamer.gst.ClockTime runningTime, Out<Boolean> allHeaders, Out<Integer> count) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemorySegment runningTimePOINTER = SCOPE.allocate(Interop.valueLayout.C_LONG);
        MemorySegment allHeadersPOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
        MemorySegment countPOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_video_event_parse_upstream_force_key_unit.invokeExact(
                    event.handle(),
                    (Addressable) runningTimePOINTER.address(),
                    (Addressable) allHeadersPOINTER.address(),
                    (Addressable) countPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
                runningTime.setValue(runningTimePOINTER.get(Interop.valueLayout.C_LONG, 0));
                allHeaders.set(allHeadersPOINTER.get(Interop.valueLayout.C_INT, 0) != 0);
                count.set(countPOINTER.get(Interop.valueLayout.C_INT, 0));
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
}

/**
 * Convert {@code order} to a {@link VideoFieldOrder}
 * @param order a field order
 * @return the {@link VideoFieldOrder} of {@code order} or
 *    {@code GST_VIDEO_FIELD_ORDER_UNKNOWN} when {@code order} is not a valid
 *    string representation for a {@link VideoFieldOrder}.
 */
public static org.gstreamer.video.VideoFieldOrder videoFieldOrderFromString(java.lang.String order) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_video_field_order_from_string.invokeExact(Marshal.stringToAddress.marshal(order, SCOPE));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.video.VideoFieldOrder.of(RESULT);
    }
}

/**
 * Convert {@code order} to its string representation.
 * @param order a {@link VideoFieldOrder}
 * @return {@code order} as a string or NULL if {@code order} in invalid.
 */
public static java.lang.String videoFieldOrderToString(org.gstreamer.video.VideoFieldOrder order) {
    MemoryAddress RESULT;
    try {
        RESULT = (MemoryAddress) DowncallHandles.gst_video_field_order_to_string.invokeExact(order.getValue());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return Marshal.addressToString.marshal(RESULT, null);
}

/**
 * Converts a FOURCC value into the corresponding {@link VideoFormat}.
 * If the FOURCC cannot be represented by {@link VideoFormat},
 * {@code GST_VIDEO_FORMAT_UNKNOWN} is returned.
 * @param fourcc a FOURCC value representing raw YUV video
 * @return the {@link VideoFormat} describing the FOURCC value
 */
public static org.gstreamer.video.VideoFormat videoFormatFromFourcc(int fourcc) {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.gst_video_format_from_fourcc.invokeExact(fourcc);
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return org.gstreamer.video.VideoFormat.of(RESULT);
}

/**
 * Find the {@link VideoFormat} for the given parameters.
 * @param depth the amount of bits used for a pixel
 * @param bpp the amount of bits used to store a pixel. This value is bigger than
 *   {@code depth}
 * @param endianness the endianness of the masks, {@code G_LITTLE_ENDIAN} or {@code G_BIG_ENDIAN}
 * @param redMask the red mask
 * @param greenMask the green mask
 * @param blueMask the blue mask
 * @param alphaMask the alpha mask, or 0 if no alpha mask
 * @return a {@link VideoFormat} or GST_VIDEO_FORMAT_UNKNOWN when the parameters to
 * not specify a known format.
 */
public static org.gstreamer.video.VideoFormat videoFormatFromMasks(int depth, int bpp, int endianness, int redMask, int greenMask, int blueMask, int alphaMask) {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.gst_video_format_from_masks.invokeExact(
                depth,
                bpp,
                endianness,
                redMask,
                greenMask,
                blueMask,
                alphaMask);
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return org.gstreamer.video.VideoFormat.of(RESULT);
}

/**
 * Convert the {@code format} string to its {@link VideoFormat}.
 * @param format a format string
 * @return the {@link VideoFormat} for {@code format} or GST_VIDEO_FORMAT_UNKNOWN when the
 * string is not a known format.
 */
public static org.gstreamer.video.VideoFormat videoFormatFromString(java.lang.String format) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_video_format_from_string.invokeExact(Marshal.stringToAddress.marshal(format, SCOPE));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.video.VideoFormat.of(RESULT);
    }
}

/**
 * Get the {@link VideoFormatInfo} for {@code format}
 * @param format a {@link VideoFormat}
 * @return The {@link VideoFormatInfo} for {@code format}.
 */
public static org.gstreamer.video.VideoFormatInfo videoFormatGetInfo(org.gstreamer.video.VideoFormat format) {
    MemoryAddress RESULT;
    try {
        RESULT = (MemoryAddress) DowncallHandles.gst_video_format_get_info.invokeExact(format.getValue());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return org.gstreamer.video.VideoFormatInfo.fromAddress.marshal(RESULT, null);
}

/**
 * Get the default palette of {@code format}. This the palette used in the pack
 * function for paletted formats.
 * @param format a {@link VideoFormat}
 * @param size size of the palette in bytes
 * @return the default palette of {@code format} or {@code null} when
 * {@code format} does not have a palette.
 */
public static @Nullable java.lang.foreign.MemoryAddress videoFormatGetPalette(org.gstreamer.video.VideoFormat format, Out<Long> size) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemorySegment sizePOINTER = SCOPE.allocate(Interop.valueLayout.C_LONG);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_video_format_get_palette.invokeExact(
                    format.getValue(),
                    (Addressable) sizePOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
                size.set(sizePOINTER.get(Interop.valueLayout.C_LONG, 0));
        return RESULT;
    }
}

/**
 * Converts a {@link VideoFormat} value into the corresponding FOURCC.  Only
 * a few YUV formats have corresponding FOURCC values.  If {@code format} has
 * no corresponding FOURCC value, 0 is returned.
 * @param format a {@link VideoFormat} video format
 * @return the FOURCC corresponding to {@code format}
 */
public static int videoFormatToFourcc(org.gstreamer.video.VideoFormat format) {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.gst_video_format_to_fourcc.invokeExact(format.getValue());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return RESULT;
}

/**
 * Returns a string containing a descriptive name for
 * the {@link VideoFormat} if there is one, or NULL otherwise.
 * @param format a {@link VideoFormat} video format
 * @return the name corresponding to {@code format}
 */
public static java.lang.String videoFormatToString(org.gstreamer.video.VideoFormat format) {
    MemoryAddress RESULT;
    try {
        RESULT = (MemoryAddress) DowncallHandles.gst_video_format_to_string.invokeExact(format.getValue());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return Marshal.addressToString.marshal(RESULT, null);
}

/**
 * Return all the raw video formats supported by GStreamer.
 * @param len the number of elements in the returned array
 * @return an array of {@link VideoFormat}
 */
public static org.gstreamer.video.VideoFormat[] videoFormatsRaw(Out<Integer> len) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemorySegment lenPOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_video_formats_raw.invokeExact((Addressable) lenPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
                len.set(lenPOINTER.get(Interop.valueLayout.C_INT, 0));
        org.gstreamer.video.VideoFormat[] resultARRAY = new org.gstreamer.video.VideoFormat[len.get().intValue()];
        for (int I = 0; I < len.get().intValue(); I++) {
            var OBJ = RESULT.get(Interop.valueLayout.C_INT, I);
            resultARRAY[I] = org.gstreamer.video.VideoFormat.of(OBJ);
        }
        return resultARRAY;
    }
}

/**
 * Use {@code info} and {@code buffer} to fill in the values of {@code frame}. {@code frame} is usually
 * allocated on the stack, and you will pass the address to the {@link VideoFrame}
 * structure allocated on the stack; gst_video_frame_map() will then fill in
 * the structures with the various video-specific information you need to access
 * the pixels of the video buffer. You can then use accessor macros such as
 * GST_VIDEO_FRAME_COMP_DATA(), GST_VIDEO_FRAME_PLANE_DATA(),
 * GST_VIDEO_FRAME_COMP_STRIDE(), GST_VIDEO_FRAME_PLANE_STRIDE() etc.
 * to get to the pixels.
 * <pre>{@code <!-- language="C" -->
 *   GstVideoFrame vframe;
 *   ...
 *   // set RGB pixels to black one at a time
 *   if (gst_video_frame_map (&vframe, video_info, video_buffer, GST_MAP_WRITE)) {
 *     guint8 *pixels = GST_VIDEO_FRAME_PLANE_DATA (vframe, 0);
 *     guint stride = GST_VIDEO_FRAME_PLANE_STRIDE (vframe, 0);
 *     guint pixel_stride = GST_VIDEO_FRAME_COMP_PSTRIDE (vframe, 0);
 * 
 *     for (h = 0; h < height; ++h) {
 *       for (w = 0; w < width; ++w) {
 *         guint8 *pixel = pixels + h * stride + w * pixel_stride;
 * 
 *         memset (pixel, 0, pixel_stride);
 *       }
 *     }
 * 
 *     gst_video_frame_unmap (&vframe);
 *   }
 *   ...
 * }</pre>
 * <p>
 * All video planes of {@code buffer} will be mapped and the pointers will be set in
 * {@code frame}-&gt;data.
 * <p>
 * The purpose of this function is to make it easy for you to get to the video
 * pixels in a generic way, without you having to worry too much about details
 * such as whether the video data is allocated in one contiguous memory chunk
 * or multiple memory chunks (e.g. one for each plane); or if custom strides
 * and custom plane offsets are used or not (as signalled by GstVideoMeta on
 * each buffer). This function will just fill the {@link VideoFrame} structure
 * with the right values and if you use the accessor macros everything will
 * just work and you can access the data easily. It also maps the underlying
 * memory chunks for you.
 * @param frame pointer to {@link VideoFrame}
 * @param info a {@link VideoInfo}
 * @param buffer the buffer to map
 * @param flags {@link org.gstreamer.gst.MapFlags}
 * @return {@code true} on success.
 */
public static boolean videoFrameMap(org.gstreamer.video.VideoFrame frame, org.gstreamer.video.VideoInfo info, org.gstreamer.gst.Buffer buffer, org.gstreamer.gst.MapFlags flags) {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.gst_video_frame_map.invokeExact(
                frame.handle(),
                info.handle(),
                buffer.handle(),
                flags.getValue());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
}

/**
 * Use {@code info} and {@code buffer} to fill in the values of {@code frame} with the video frame
 * information of frame {@code id}.
 * <p>
 * When {@code id} is -1, the default frame is mapped. When {@code id} != -1, this function
 * will return {@code false} when there is no GstVideoMeta with that id.
 * <p>
 * All video planes of {@code buffer} will be mapped and the pointers will be set in
 * {@code frame}-&gt;data.
 * @param frame pointer to {@link VideoFrame}
 * @param info a {@link VideoInfo}
 * @param buffer the buffer to map
 * @param id the frame id to map
 * @param flags {@link org.gstreamer.gst.MapFlags}
 * @return {@code true} on success.
 */
public static boolean videoFrameMapId(org.gstreamer.video.VideoFrame frame, org.gstreamer.video.VideoInfo info, org.gstreamer.gst.Buffer buffer, int id, org.gstreamer.gst.MapFlags flags) {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.gst_video_frame_map_id.invokeExact(
                frame.handle(),
                info.handle(),
                buffer.handle(),
                id,
                flags.getValue());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
}

public static org.gtk.glib.Type videoGlTextureUploadMetaApiGetType() {
    long RESULT;
    try {
        RESULT = (long) DowncallHandles.gst_video_gl_texture_upload_meta_api_get_type.invokeExact();
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return new org.gtk.glib.Type(RESULT);
}

public static org.gstreamer.gst.MetaInfo videoGlTextureUploadMetaGetInfo() {
    MemoryAddress RESULT;
    try {
        RESULT = (MemoryAddress) DowncallHandles.gst_video_gl_texture_upload_meta_get_info.invokeExact();
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return org.gstreamer.gst.MetaInfo.fromAddress.marshal(RESULT, null);
}

/**
 * Given the nominal duration of one video frame,
 * this function will check some standard framerates for
 * a close match (within 0.1%) and return one if possible,
 * <p>
 * It will calculate an arbitrary framerate if no close
 * match was found, and return {@code false}.
 * <p>
 * It returns {@code false} if a duration of 0 is passed.
 * @param duration Nominal duration of one frame
 * @param destN Numerator of the calculated framerate
 * @param destD Denominator of the calculated framerate
 * @return {@code true} if a close "standard" framerate was
 * recognised, and {@code false} otherwise.
 */
public static boolean videoGuessFramerate(org.gstreamer.gst.ClockTime duration, Out<Integer> destN, Out<Integer> destD) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemorySegment destNPOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
        MemorySegment destDPOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_video_guess_framerate.invokeExact(
                    duration.getValue().longValue(),
                    (Addressable) (destN == null ? MemoryAddress.NULL : (Addressable) destNPOINTER.address()),
                    (Addressable) (destD == null ? MemoryAddress.NULL : (Addressable) destDPOINTER.address()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
                if (destN != null) destN.set(destNPOINTER.get(Interop.valueLayout.C_INT, 0));
                if (destD != null) destD.set(destDPOINTER.get(Interop.valueLayout.C_INT, 0));
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
}

/**
 * Parse {@code caps} and update {@code info}.
 * @param info {@link VideoInfo}
 * @param caps a {@link org.gstreamer.gst.Caps}
 * @return TRUE if {@code caps} could be parsed
 */
public static boolean videoInfoFromCaps(org.gstreamer.video.VideoInfo info, org.gstreamer.gst.Caps caps) {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.gst_video_info_from_caps.invokeExact(
                info.handle(),
                caps.handle());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
}

/**
 * Initialize {@code info} with default values.
 * @param info a {@link VideoInfo}
 */
public static void videoInfoInit(org.gstreamer.video.VideoInfo info) {
    try {
        DowncallHandles.gst_video_info_init.invokeExact(info.handle());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
}

/**
 * Convert {@code mode} to a {@link VideoInterlaceMode}
 * @param mode a mode
 * @return the {@link VideoInterlaceMode} of {@code mode} or
 *    {@code GST_VIDEO_INTERLACE_MODE_PROGRESSIVE} when {@code mode} is not a valid
 *    string representation for a {@link VideoInterlaceMode}.
 */
public static org.gstreamer.video.VideoInterlaceMode videoInterlaceModeFromString(java.lang.String mode) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_video_interlace_mode_from_string.invokeExact(Marshal.stringToAddress.marshal(mode, SCOPE));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.video.VideoInterlaceMode.of(RESULT);
    }
}

/**
 * Convert {@code mode} to its string representation.
 * @param mode a {@link VideoInterlaceMode}
 * @return {@code mode} as a string or NULL if {@code mode} in invalid.
 */
public static java.lang.String videoInterlaceModeToString(org.gstreamer.video.VideoInterlaceMode mode) {
    MemoryAddress RESULT;
    try {
        RESULT = (MemoryAddress) DowncallHandles.gst_video_interlace_mode_to_string.invokeExact(mode.getValue());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return Marshal.addressToString.marshal(RESULT, null);
}

/**
 * Return a generic raw video caps for formats defined in {@code formats}.
 * If {@code formats} is {@code null} returns a caps for all the supported raw video formats,
 * see gst_video_formats_raw().
 * @param formats an array of raw {@link VideoFormat}, or {@code null}
 * @param len the size of {@code formats}
 * @return a video {@code GstCaps}
 */
public static org.gstreamer.gst.Caps videoMakeRawCaps(@Nullable org.gstreamer.video.VideoFormat[] formats, int len) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_video_make_raw_caps.invokeExact(
                    (Addressable) (formats == null ? MemoryAddress.NULL : Interop.allocateNativeArray(Enumeration.getValues(formats), false, SCOPE)),
                    len);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = org.gstreamer.gst.Caps.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
}

/**
 * Return a generic raw video caps for formats defined in {@code formats} with features
 * {@code features}.
 * If {@code formats} is {@code null} returns a caps for all the supported video formats,
 * see gst_video_formats_raw().
 * @param formats an array of raw {@link VideoFormat}, or {@code null}
 * @param len the size of {@code formats}
 * @param features the {@link org.gstreamer.gst.CapsFeatures} to set on the caps
 * @return a video {@code GstCaps}
 */
public static org.gstreamer.gst.Caps videoMakeRawCapsWithFeatures(@Nullable org.gstreamer.video.VideoFormat[] formats, int len, @Nullable org.gstreamer.gst.CapsFeatures features) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_video_make_raw_caps_with_features.invokeExact(
                    (Addressable) (formats == null ? MemoryAddress.NULL : Interop.allocateNativeArray(Enumeration.getValues(formats), false, SCOPE)),
                    len,
                    (Addressable) (features == null ? MemoryAddress.NULL : features.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        features.yieldOwnership();
        var OBJECT = org.gstreamer.gst.Caps.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
}

/**
 * Extract {@link VideoMasteringDisplayInfo} from {@code mastering}
 * @param minfo a {@link VideoMasteringDisplayInfo}
 * @param mastering a {@link org.gstreamer.gst.Structure} representing {@link VideoMasteringDisplayInfo}
 * @return {@code true} if {@code minfo} was filled with {@code mastering}
 */
public static boolean videoMasteringDisplayInfoFromString(org.gstreamer.video.VideoMasteringDisplayInfo minfo, java.lang.String mastering) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_video_mastering_display_info_from_string.invokeExact(
                    minfo.handle(),
                    Marshal.stringToAddress.marshal(mastering, SCOPE));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
}

public static org.gtk.glib.Type videoMetaApiGetType() {
    long RESULT;
    try {
        RESULT = (long) DowncallHandles.gst_video_meta_api_get_type.invokeExact();
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return new org.gtk.glib.Type(RESULT);
}

public static org.gstreamer.gst.MetaInfo videoMetaGetInfo() {
    MemoryAddress RESULT;
    try {
        RESULT = (MemoryAddress) DowncallHandles.gst_video_meta_get_info.invokeExact();
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return org.gstreamer.gst.MetaInfo.fromAddress.marshal(RESULT, null);
}

/**
 * Get the {@link org.gtk.glib.Quark} for the "gst-video-scale" metadata transform operation.
 * @return a {@link org.gtk.glib.Quark}
 */
public static org.gtk.glib.Quark videoMetaTransformScaleGetQuark() {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.gst_video_meta_transform_scale_get_quark.invokeExact();
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return new org.gtk.glib.Quark(RESULT);
}

public static org.gtk.gobject.Value videoMultiviewGetDoubledHeightModes() {
    MemoryAddress RESULT;
    try {
        RESULT = (MemoryAddress) DowncallHandles.gst_video_multiview_get_doubled_height_modes.invokeExact();
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return org.gtk.gobject.Value.fromAddress.marshal(RESULT, null);
}

public static org.gtk.gobject.Value videoMultiviewGetDoubledSizeModes() {
    MemoryAddress RESULT;
    try {
        RESULT = (MemoryAddress) DowncallHandles.gst_video_multiview_get_doubled_size_modes.invokeExact();
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return org.gtk.gobject.Value.fromAddress.marshal(RESULT, null);
}

public static org.gtk.gobject.Value videoMultiviewGetDoubledWidthModes() {
    MemoryAddress RESULT;
    try {
        RESULT = (MemoryAddress) DowncallHandles.gst_video_multiview_get_doubled_width_modes.invokeExact();
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return org.gtk.gobject.Value.fromAddress.marshal(RESULT, null);
}

public static org.gtk.gobject.Value videoMultiviewGetMonoModes() {
    MemoryAddress RESULT;
    try {
        RESULT = (MemoryAddress) DowncallHandles.gst_video_multiview_get_mono_modes.invokeExact();
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return org.gtk.gobject.Value.fromAddress.marshal(RESULT, null);
}

public static org.gtk.gobject.Value videoMultiviewGetUnpackedModes() {
    MemoryAddress RESULT;
    try {
        RESULT = (MemoryAddress) DowncallHandles.gst_video_multiview_get_unpacked_modes.invokeExact();
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return org.gtk.gobject.Value.fromAddress.marshal(RESULT, null);
}

public static boolean videoMultiviewGuessHalfAspect(org.gstreamer.video.VideoMultiviewMode mvMode, int width, int height, int parN, int parD) {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.gst_video_multiview_guess_half_aspect.invokeExact(
                mvMode.getValue(),
                width,
                height,
                parN,
                parD);
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
}

public static org.gstreamer.video.VideoMultiviewMode videoMultiviewModeFromCapsString(java.lang.String capsMviewMode) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_video_multiview_mode_from_caps_string.invokeExact(Marshal.stringToAddress.marshal(capsMviewMode, SCOPE));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.video.VideoMultiviewMode.of(RESULT);
    }
}

public static java.lang.String videoMultiviewModeToCapsString(org.gstreamer.video.VideoMultiviewMode mviewMode) {
    MemoryAddress RESULT;
    try {
        RESULT = (MemoryAddress) DowncallHandles.gst_video_multiview_mode_to_caps_string.invokeExact(mviewMode.getValue());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return Marshal.addressToString.marshal(RESULT, null);
}

/**
 * Utility function that transforms the width/height/PAR
 * and multiview mode and flags of a {@link VideoInfo} into
 * the requested mode.
 * @param info A {@link VideoInfo} structure to operate on
 * @param outMviewMode A {@link VideoMultiviewMode} value
 * @param outMviewFlags A set of {@link VideoMultiviewFlags}
 */
public static void videoMultiviewVideoInfoChangeMode(org.gstreamer.video.VideoInfo info, org.gstreamer.video.VideoMultiviewMode outMviewMode, org.gstreamer.video.VideoMultiviewFlags outMviewFlags) {
    try {
        DowncallHandles.gst_video_multiview_video_info_change_mode.invokeExact(
                info.handle(),
                outMviewMode.getValue(),
                outMviewFlags.getValue());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
}

/**
 * Parses the "image-orientation" tag and transforms it into the
 * {@link VideoOrientationMethod} enum.
 * @param taglist A {@link org.gstreamer.gst.TagList}
 * @param method The location where to return the orientation.
 * @return TRUE if there was a valid "image-orientation" tag in the taglist.
 */
public static boolean videoOrientationFromTag(org.gstreamer.gst.TagList taglist, Out<org.gstreamer.video.VideoOrientationMethod> method) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemorySegment methodPOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_video_orientation_from_tag.invokeExact(
                    taglist.handle(),
                    (Addressable) methodPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
                method.set(org.gstreamer.video.VideoOrientationMethod.of(methodPOINTER.get(Interop.valueLayout.C_INT, 0)));
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
}

public static org.gtk.glib.Type videoOverlayCompositionMetaApiGetType() {
    long RESULT;
    try {
        RESULT = (long) DowncallHandles.gst_video_overlay_composition_meta_api_get_type.invokeExact();
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return new org.gtk.glib.Type(RESULT);
}

public static org.gstreamer.gst.MetaInfo videoOverlayCompositionMetaGetInfo() {
    MemoryAddress RESULT;
    try {
        RESULT = (MemoryAddress) DowncallHandles.gst_video_overlay_composition_meta_get_info.invokeExact();
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return org.gstreamer.gst.MetaInfo.fromAddress.marshal(RESULT, null);
}

/**
 * This helper shall be used by classes implementing the {@link VideoOverlay}
 * interface that want the render rectangle to be controllable using
 * properties. This helper will install "render-rectangle" property into the
 * class.
 * @param oclass The class on which the properties will be installed
 * @param lastPropId The first free property ID to use
 */
public static void videoOverlayInstallProperties(org.gtk.gobject.ObjectClass oclass, int lastPropId) {
    try {
        DowncallHandles.gst_video_overlay_install_properties.invokeExact(
                oclass.handle(),
                lastPropId);
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
}

/**
 * This helper shall be used by classes implementing the {@link VideoOverlay}
 * interface that want the render rectangle to be controllable using
 * properties. This helper will parse and set the render rectangle calling
 * gst_video_overlay_set_render_rectangle().
 * @param object The instance on which the property is set
 * @param lastPropId The highest property ID.
 * @param propertyId The property ID
 * @param value The {@link org.gtk.gobject.Value} to be set
 * @return {@code true} if the {@code property_id} matches the GstVideoOverlay property
 */
public static boolean videoOverlaySetProperty(org.gtk.gobject.GObject object, int lastPropId, int propertyId, org.gtk.gobject.Value value) {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.gst_video_overlay_set_property.invokeExact(
                object.handle(),
                lastPropId,
                propertyId,
                value.handle());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
}

public static org.gtk.glib.Type videoRegionOfInterestMetaApiGetType() {
    long RESULT;
    try {
        RESULT = (long) DowncallHandles.gst_video_region_of_interest_meta_api_get_type.invokeExact();
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return new org.gtk.glib.Type(RESULT);
}

public static org.gstreamer.gst.MetaInfo videoRegionOfInterestMetaGetInfo() {
    MemoryAddress RESULT;
    try {
        RESULT = (MemoryAddress) DowncallHandles.gst_video_region_of_interest_meta_get_info.invokeExact();
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return org.gstreamer.gst.MetaInfo.fromAddress.marshal(RESULT, null);
}

/**
 * Make a new {@code method} video scaler. {@code in_size} source lines/pixels will
 * be scaled to {@code out_size} destination lines/pixels.
 * <p>
 * {@code n_taps} specifies the amount of pixels to use from the source for one output
 * pixel. If n_taps is 0, this function chooses a good value automatically based
 * on the {@code method} and {@code in_size}/{@code out_size}.
 * @param method a {@link VideoResamplerMethod}
 * @param flags {@link VideoScalerFlags}
 * @param nTaps number of taps to use
 * @param inSize number of source elements
 * @param outSize number of destination elements
 * @param options extra options
 * @return a {@link VideoScaler}
 */
public static org.gstreamer.video.VideoScaler videoScalerNew(org.gstreamer.video.VideoResamplerMethod method, org.gstreamer.video.VideoScalerFlags flags, int nTaps, int inSize, int outSize, @Nullable org.gstreamer.gst.Structure options) {
    MemoryAddress RESULT;
    try {
        RESULT = (MemoryAddress) DowncallHandles.gst_video_scaler_new.invokeExact(
                method.getValue(),
                flags.getValue(),
                nTaps,
                inSize,
                outSize,
                (Addressable) (options == null ? MemoryAddress.NULL : options.handle()));
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return org.gstreamer.video.VideoScaler.fromAddress.marshal(RESULT, null);
}

/**
 * Get the tile index of the tile at coordinates {@code x} and {@code y} in the tiled
 * image of {@code x_tiles} by {@code y_tiles}.
 * <p>
 * Use this method when {@code mode} is of type {@link VideoTileType#INDEXED}.
 * @param mode a {@link VideoTileMode}
 * @param x x coordinate
 * @param y y coordinate
 * @param xTiles number of horizintal tiles
 * @param yTiles number of vertical tiles
 * @return the index of the tile at {@code x} and {@code y} in the tiled image of
 *   {@code x_tiles} by {@code y_tiles}.
 */
public static int videoTileGetIndex(org.gstreamer.video.VideoTileMode mode, int x, int y, int xTiles, int yTiles) {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.gst_video_tile_get_index.invokeExact(
                mode.getValue(),
                x,
                y,
                xTiles,
                yTiles);
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return RESULT;
}

public static org.gtk.glib.Type videoTimeCodeMetaApiGetType() {
    long RESULT;
    try {
        RESULT = (long) DowncallHandles.gst_video_time_code_meta_api_get_type.invokeExact();
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return new org.gtk.glib.Type(RESULT);
}

public static org.gstreamer.gst.MetaInfo videoTimeCodeMetaGetInfo() {
    MemoryAddress RESULT;
    try {
        RESULT = (MemoryAddress) DowncallHandles.gst_video_time_code_meta_get_info.invokeExact();
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return org.gstreamer.gst.MetaInfo.fromAddress.marshal(RESULT, null);
}

/**
 * Convert {@code val} to its gamma decoded value. This is the inverse operation of
 * gst_video_color_transfer_encode().
 * <p>
 * For a non-linear value L' in the range [0..1], conversion to the linear
 * L is in general performed with a power function like:
 * <pre>{@code 
 *    L = L' ^ gamma
 * }</pre>
 * <p>
 * Depending on {@code func}, different formulas might be applied. Some formulas
 * encode a linear segment in the lower range.
 * @param func a {@link VideoTransferFunction}
 * @param val a value
 * @return the gamma decoded value of {@code val}
 */
public static double videoTransferFunctionDecode(org.gstreamer.video.VideoTransferFunction func, double val) {
    double RESULT;
    try {
        RESULT = (double) DowncallHandles.gst_video_transfer_function_decode.invokeExact(
                func.getValue(),
                val);
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return RESULT;
}

/**
 * Convert {@code val} to its gamma encoded value.
 * <p>
 * For a linear value L in the range [0..1], conversion to the non-linear
 * (gamma encoded) L' is in general performed with a power function like:
 * <pre>{@code 
 *    L' = L ^ (1 / gamma)
 * }</pre>
 * <p>
 * Depending on {@code func}, different formulas might be applied. Some formulas
 * encode a linear segment in the lower range.
 * @param func a {@link VideoTransferFunction}
 * @param val a value
 * @return the gamma encoded value of {@code val}
 */
public static double videoTransferFunctionEncode(org.gstreamer.video.VideoTransferFunction func, double val) {
    double RESULT;
    try {
        RESULT = (double) DowncallHandles.gst_video_transfer_function_encode.invokeExact(
                func.getValue(),
                val);
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return RESULT;
}

/**
 * Converts the {@code value} to the {@link VideoTransferFunction}
 * The transfer characteristics (TransferCharacteristics) value is
 * defined by "ISO/IEC 23001-8 Section 7.2 Table 3"
 * and "ITU-T H.273 Table 3".
 * "H.264 Table E-4" and "H.265 Table E.4" share the identical values.
 * @param value a ITU-T H.273 transfer characteristics value
 * @return the matched {@link VideoTransferFunction}
 */
public static org.gstreamer.video.VideoTransferFunction videoTransferFunctionFromIso(int value) {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.gst_video_transfer_function_from_iso.invokeExact(value);
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return org.gstreamer.video.VideoTransferFunction.of(RESULT);
}

/**
 * Returns whether {@code from_func} and {@code to_func} are equivalent. There are cases
 * (e.g. BT601, BT709, and BT2020_10) where several functions are functionally
 * identical. In these cases, when doing conversion, we should consider them
 * as equivalent. Also, BT2020_12 is the same as the aforementioned three for
 * less than 12 bits per pixel.
 * @param fromFunc {@link VideoTransferFunction} to convert from
 * @param fromBpp bits per pixel to convert from
 * @param toFunc {@link VideoTransferFunction} to convert into
 * @param toBpp bits per pixel to convert into
 * @return TRUE if {@code from_func} and {@code to_func} can be considered equivalent.
 */
public static boolean videoTransferFunctionIsEquivalent(org.gstreamer.video.VideoTransferFunction fromFunc, int fromBpp, org.gstreamer.video.VideoTransferFunction toFunc, int toBpp) {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.gst_video_transfer_function_is_equivalent.invokeExact(
                fromFunc.getValue(),
                fromBpp,
                toFunc.getValue(),
                toBpp);
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
}

/**
 * Converts {@link VideoTransferFunction} to the "transfer characteristics"
 * (TransferCharacteristics) value defined by "ISO/IEC 23001-8 Section 7.2 Table 3"
 * and "ITU-T H.273 Table 3".
 * "H.264 Table E-4" and "H.265 Table E.4" share the identical values.
 * @param func a {@link VideoTransferFunction}
 * @return The value of ISO/IEC 23001-8 transfer characteristics.
 */
public static int videoTransferFunctionToIso(org.gstreamer.video.VideoTransferFunction func) {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.gst_video_transfer_function_to_iso.invokeExact(func.getValue());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return RESULT;
}
    
    private static class DowncallHandles {

private static final MethodHandle gst_buffer_add_video_afd_meta = Interop.downcallHandle(
        "gst_buffer_add_video_afd_meta",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_BYTE, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle gst_buffer_add_video_affine_transformation_meta = Interop.downcallHandle(
        "gst_buffer_add_video_affine_transformation_meta",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gst_buffer_add_video_bar_meta = Interop.downcallHandle(
        "gst_buffer_add_video_bar_meta",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_BYTE, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle gst_buffer_add_video_caption_meta = Interop.downcallHandle(
        "gst_buffer_add_video_caption_meta",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
        false
);

private static final MethodHandle gst_buffer_add_video_codec_alpha_meta = Interop.downcallHandle(
        "gst_buffer_add_video_codec_alpha_meta",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gst_buffer_add_video_gl_texture_upload_meta = Interop.downcallHandle(
        "gst_buffer_add_video_gl_texture_upload_meta",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gst_buffer_add_video_meta = Interop.downcallHandle(
        "gst_buffer_add_video_meta",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle gst_buffer_add_video_meta_full = Interop.downcallHandle(
        "gst_buffer_add_video_meta_full",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gst_buffer_add_video_overlay_composition_meta = Interop.downcallHandle(
        "gst_buffer_add_video_overlay_composition_meta",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gst_buffer_add_video_region_of_interest_meta = Interop.downcallHandle(
        "gst_buffer_add_video_region_of_interest_meta",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle gst_buffer_add_video_region_of_interest_meta_id = Interop.downcallHandle(
        "gst_buffer_add_video_region_of_interest_meta_id",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle gst_buffer_add_video_time_code_meta = Interop.downcallHandle(
        "gst_buffer_add_video_time_code_meta",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gst_buffer_add_video_time_code_meta_full = Interop.downcallHandle(
        "gst_buffer_add_video_time_code_meta_full",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle gst_buffer_get_video_meta = Interop.downcallHandle(
        "gst_buffer_get_video_meta",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gst_buffer_get_video_meta_id = Interop.downcallHandle(
        "gst_buffer_get_video_meta_id",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle gst_buffer_get_video_region_of_interest_meta_id = Interop.downcallHandle(
        "gst_buffer_get_video_region_of_interest_meta_id",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle gst_buffer_pool_config_get_video_alignment = Interop.downcallHandle(
        "gst_buffer_pool_config_get_video_alignment",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gst_buffer_pool_config_set_video_alignment = Interop.downcallHandle(
        "gst_buffer_pool_config_set_video_alignment",
        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gst_is_video_overlay_prepare_window_handle_message = Interop.downcallHandle(
        "gst_is_video_overlay_prepare_window_handle_message",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gst_navigation_event_get_type = Interop.downcallHandle(
        "gst_navigation_event_get_type",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gst_navigation_event_parse_command = Interop.downcallHandle(
        "gst_navigation_event_parse_command",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle gst_navigation_event_parse_key_event = Interop.downcallHandle(
        "gst_navigation_event_parse_key_event",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gst_navigation_event_parse_mouse_button_event = Interop.downcallHandle(
        "gst_navigation_event_parse_mouse_button_event",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gst_navigation_event_parse_mouse_move_event = Interop.downcallHandle(
        "gst_navigation_event_parse_mouse_move_event",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gst_navigation_event_parse_mouse_scroll_event = Interop.downcallHandle(
        "gst_navigation_event_parse_mouse_scroll_event",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gst_navigation_message_get_type = Interop.downcallHandle(
        "gst_navigation_message_get_type",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gst_navigation_message_new_angles_changed = Interop.downcallHandle(
        "gst_navigation_message_new_angles_changed",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle gst_navigation_message_new_commands_changed = Interop.downcallHandle(
        "gst_navigation_message_new_commands_changed",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gst_navigation_message_new_event = Interop.downcallHandle(
        "gst_navigation_message_new_event",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gst_navigation_message_new_mouse_over = Interop.downcallHandle(
        "gst_navigation_message_new_mouse_over",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle gst_navigation_message_parse_angles_changed = Interop.downcallHandle(
        "gst_navigation_message_parse_angles_changed",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gst_navigation_message_parse_event = Interop.downcallHandle(
        "gst_navigation_message_parse_event",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gst_navigation_message_parse_mouse_over = Interop.downcallHandle(
        "gst_navigation_message_parse_mouse_over",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle gst_navigation_query_get_type = Interop.downcallHandle(
        "gst_navigation_query_get_type",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gst_navigation_query_new_angles = Interop.downcallHandle(
        "gst_navigation_query_new_angles",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gst_navigation_query_new_commands = Interop.downcallHandle(
        "gst_navigation_query_new_commands",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gst_navigation_query_parse_angles = Interop.downcallHandle(
        "gst_navigation_query_parse_angles",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gst_navigation_query_parse_commands_length = Interop.downcallHandle(
        "gst_navigation_query_parse_commands_length",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gst_navigation_query_parse_commands_nth = Interop.downcallHandle(
        "gst_navigation_query_parse_commands_nth",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle gst_navigation_query_set_angles = Interop.downcallHandle(
        "gst_navigation_query_set_angles",
        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle gst_navigation_query_set_commandsv = Interop.downcallHandle(
        "gst_navigation_query_set_commandsv",
        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gst_video_afd_meta_api_get_type = Interop.downcallHandle(
        "gst_video_afd_meta_api_get_type",
        FunctionDescriptor.of(Interop.valueLayout.C_LONG),
        false
);

private static final MethodHandle gst_video_afd_meta_get_info = Interop.downcallHandle(
        "gst_video_afd_meta_get_info",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gst_video_affine_transformation_meta_api_get_type = Interop.downcallHandle(
        "gst_video_affine_transformation_meta_api_get_type",
        FunctionDescriptor.of(Interop.valueLayout.C_LONG),
        false
);

private static final MethodHandle gst_video_affine_transformation_meta_get_info = Interop.downcallHandle(
        "gst_video_affine_transformation_meta_get_info",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gst_video_bar_meta_api_get_type = Interop.downcallHandle(
        "gst_video_bar_meta_api_get_type",
        FunctionDescriptor.of(Interop.valueLayout.C_LONG),
        false
);

private static final MethodHandle gst_video_bar_meta_get_info = Interop.downcallHandle(
        "gst_video_bar_meta_get_info",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gst_video_blend = Interop.downcallHandle(
        "gst_video_blend",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_FLOAT),
        false
);

private static final MethodHandle gst_video_blend_scale_linear_RGBA = Interop.downcallHandle(
        "gst_video_blend_scale_linear_RGBA",
        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gst_video_calculate_display_ratio = Interop.downcallHandle(
        "gst_video_calculate_display_ratio",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle gst_video_caption_meta_api_get_type = Interop.downcallHandle(
        "gst_video_caption_meta_api_get_type",
        FunctionDescriptor.of(Interop.valueLayout.C_LONG),
        false
);

private static final MethodHandle gst_video_caption_meta_get_info = Interop.downcallHandle(
        "gst_video_caption_meta_get_info",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gst_video_caption_type_from_caps = Interop.downcallHandle(
        "gst_video_caption_type_from_caps",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gst_video_caption_type_to_caps = Interop.downcallHandle(
        "gst_video_caption_type_to_caps",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle gst_video_center_rect = Interop.downcallHandle(
        "gst_video_center_rect",
        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle gst_video_chroma_from_string = Interop.downcallHandle(
        "gst_video_chroma_from_string",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gst_video_chroma_resample = Interop.downcallHandle(
        "gst_video_chroma_resample",
        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle gst_video_chroma_resample_new = Interop.downcallHandle(
        "gst_video_chroma_resample_new",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle gst_video_chroma_site_from_string = Interop.downcallHandle(
        "gst_video_chroma_site_from_string",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gst_video_chroma_site_to_string = Interop.downcallHandle(
        "gst_video_chroma_site_to_string",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle gst_video_chroma_to_string = Interop.downcallHandle(
        "gst_video_chroma_to_string",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle gst_video_codec_alpha_meta_api_get_type = Interop.downcallHandle(
        "gst_video_codec_alpha_meta_api_get_type",
        FunctionDescriptor.of(Interop.valueLayout.C_LONG),
        false
);

private static final MethodHandle gst_video_codec_alpha_meta_get_info = Interop.downcallHandle(
        "gst_video_codec_alpha_meta_get_info",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gst_video_color_matrix_from_iso = Interop.downcallHandle(
        "gst_video_color_matrix_from_iso",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle gst_video_color_matrix_get_Kr_Kb = Interop.downcallHandle(
        "gst_video_color_matrix_get_Kr_Kb",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gst_video_color_matrix_to_iso = Interop.downcallHandle(
        "gst_video_color_matrix_to_iso",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle gst_video_color_primaries_from_iso = Interop.downcallHandle(
        "gst_video_color_primaries_from_iso",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle gst_video_color_primaries_get_info = Interop.downcallHandle(
        "gst_video_color_primaries_get_info",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle gst_video_color_primaries_to_iso = Interop.downcallHandle(
        "gst_video_color_primaries_to_iso",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle gst_video_color_range_offsets = Interop.downcallHandle(
        "gst_video_color_range_offsets",
        FunctionDescriptor.ofVoid(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gst_video_color_transfer_decode = Interop.downcallHandle(
        "gst_video_color_transfer_decode",
        FunctionDescriptor.of(Interop.valueLayout.C_DOUBLE, Interop.valueLayout.C_INT, Interop.valueLayout.C_DOUBLE),
        false
);

private static final MethodHandle gst_video_color_transfer_encode = Interop.downcallHandle(
        "gst_video_color_transfer_encode",
        FunctionDescriptor.of(Interop.valueLayout.C_DOUBLE, Interop.valueLayout.C_INT, Interop.valueLayout.C_DOUBLE),
        false
);

private static final MethodHandle gst_video_convert_sample = Interop.downcallHandle(
        "gst_video_convert_sample",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gst_video_convert_sample_async = Interop.downcallHandle(
        "gst_video_convert_sample_async",
        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gst_video_converter_new = Interop.downcallHandle(
        "gst_video_converter_new",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gst_video_converter_new_with_pool = Interop.downcallHandle(
        "gst_video_converter_new_with_pool",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gst_video_crop_meta_api_get_type = Interop.downcallHandle(
        "gst_video_crop_meta_api_get_type",
        FunctionDescriptor.of(Interop.valueLayout.C_LONG),
        false
);

private static final MethodHandle gst_video_crop_meta_get_info = Interop.downcallHandle(
        "gst_video_crop_meta_get_info",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gst_video_dither_new = Interop.downcallHandle(
        "gst_video_dither_new",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle gst_video_event_is_force_key_unit = Interop.downcallHandle(
        "gst_video_event_is_force_key_unit",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gst_video_event_new_downstream_force_key_unit = Interop.downcallHandle(
        "gst_video_event_new_downstream_force_key_unit",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.C_LONG, Interop.valueLayout.C_LONG, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle gst_video_event_new_still_frame = Interop.downcallHandle(
        "gst_video_event_new_still_frame",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle gst_video_event_new_upstream_force_key_unit = Interop.downcallHandle(
        "gst_video_event_new_upstream_force_key_unit",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle gst_video_event_parse_downstream_force_key_unit = Interop.downcallHandle(
        "gst_video_event_parse_downstream_force_key_unit",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gst_video_event_parse_still_frame = Interop.downcallHandle(
        "gst_video_event_parse_still_frame",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle gst_video_event_parse_upstream_force_key_unit = Interop.downcallHandle(
        "gst_video_event_parse_upstream_force_key_unit",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gst_video_field_order_from_string = Interop.downcallHandle(
        "gst_video_field_order_from_string",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gst_video_field_order_to_string = Interop.downcallHandle(
        "gst_video_field_order_to_string",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle gst_video_format_from_fourcc = Interop.downcallHandle(
        "gst_video_format_from_fourcc",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle gst_video_format_from_masks = Interop.downcallHandle(
        "gst_video_format_from_masks",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle gst_video_format_from_string = Interop.downcallHandle(
        "gst_video_format_from_string",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gst_video_format_get_info = Interop.downcallHandle(
        "gst_video_format_get_info",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle gst_video_format_get_palette = Interop.downcallHandle(
        "gst_video_format_get_palette",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gst_video_format_to_fourcc = Interop.downcallHandle(
        "gst_video_format_to_fourcc",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle gst_video_format_to_string = Interop.downcallHandle(
        "gst_video_format_to_string",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle gst_video_formats_raw = Interop.downcallHandle(
        "gst_video_formats_raw",
        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gst_video_frame_map = Interop.downcallHandle(
        "gst_video_frame_map",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle gst_video_frame_map_id = Interop.downcallHandle(
        "gst_video_frame_map_id",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle gst_video_gl_texture_upload_meta_api_get_type = Interop.downcallHandle(
        "gst_video_gl_texture_upload_meta_api_get_type",
        FunctionDescriptor.of(Interop.valueLayout.C_LONG),
        false
);

private static final MethodHandle gst_video_gl_texture_upload_meta_get_info = Interop.downcallHandle(
        "gst_video_gl_texture_upload_meta_get_info",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gst_video_guess_framerate = Interop.downcallHandle(
        "gst_video_guess_framerate",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gst_video_info_from_caps = Interop.downcallHandle(
        "gst_video_info_from_caps",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gst_video_info_init = Interop.downcallHandle(
        "gst_video_info_init",
        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gst_video_interlace_mode_from_string = Interop.downcallHandle(
        "gst_video_interlace_mode_from_string",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gst_video_interlace_mode_to_string = Interop.downcallHandle(
        "gst_video_interlace_mode_to_string",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle gst_video_make_raw_caps = Interop.downcallHandle(
        "gst_video_make_raw_caps",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle gst_video_make_raw_caps_with_features = Interop.downcallHandle(
        "gst_video_make_raw_caps_with_features",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gst_video_mastering_display_info_from_string = Interop.downcallHandle(
        "gst_video_mastering_display_info_from_string",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gst_video_meta_api_get_type = Interop.downcallHandle(
        "gst_video_meta_api_get_type",
        FunctionDescriptor.of(Interop.valueLayout.C_LONG),
        false
);

private static final MethodHandle gst_video_meta_get_info = Interop.downcallHandle(
        "gst_video_meta_get_info",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gst_video_meta_transform_scale_get_quark = Interop.downcallHandle(
        "gst_video_meta_transform_scale_get_quark",
        FunctionDescriptor.of(Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle gst_video_multiview_get_doubled_height_modes = Interop.downcallHandle(
        "gst_video_multiview_get_doubled_height_modes",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gst_video_multiview_get_doubled_size_modes = Interop.downcallHandle(
        "gst_video_multiview_get_doubled_size_modes",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gst_video_multiview_get_doubled_width_modes = Interop.downcallHandle(
        "gst_video_multiview_get_doubled_width_modes",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gst_video_multiview_get_mono_modes = Interop.downcallHandle(
        "gst_video_multiview_get_mono_modes",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gst_video_multiview_get_unpacked_modes = Interop.downcallHandle(
        "gst_video_multiview_get_unpacked_modes",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gst_video_multiview_guess_half_aspect = Interop.downcallHandle(
        "gst_video_multiview_guess_half_aspect",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle gst_video_multiview_mode_from_caps_string = Interop.downcallHandle(
        "gst_video_multiview_mode_from_caps_string",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gst_video_multiview_mode_to_caps_string = Interop.downcallHandle(
        "gst_video_multiview_mode_to_caps_string",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle gst_video_multiview_video_info_change_mode = Interop.downcallHandle(
        "gst_video_multiview_video_info_change_mode",
        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle gst_video_orientation_from_tag = Interop.downcallHandle(
        "gst_video_orientation_from_tag",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle gst_video_overlay_composition_meta_api_get_type = Interop.downcallHandle(
        "gst_video_overlay_composition_meta_api_get_type",
        FunctionDescriptor.of(Interop.valueLayout.C_LONG),
        false
);

private static final MethodHandle gst_video_overlay_composition_meta_get_info = Interop.downcallHandle(
        "gst_video_overlay_composition_meta_get_info",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gst_video_overlay_install_properties = Interop.downcallHandle(
        "gst_video_overlay_install_properties",
        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle gst_video_overlay_set_property = Interop.downcallHandle(
        "gst_video_overlay_set_property",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gst_video_region_of_interest_meta_api_get_type = Interop.downcallHandle(
        "gst_video_region_of_interest_meta_api_get_type",
        FunctionDescriptor.of(Interop.valueLayout.C_LONG),
        false
);

private static final MethodHandle gst_video_region_of_interest_meta_get_info = Interop.downcallHandle(
        "gst_video_region_of_interest_meta_get_info",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gst_video_scaler_new = Interop.downcallHandle(
        "gst_video_scaler_new",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gst_video_tile_get_index = Interop.downcallHandle(
        "gst_video_tile_get_index",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle gst_video_time_code_meta_api_get_type = Interop.downcallHandle(
        "gst_video_time_code_meta_api_get_type",
        FunctionDescriptor.of(Interop.valueLayout.C_LONG),
        false
);

private static final MethodHandle gst_video_time_code_meta_get_info = Interop.downcallHandle(
        "gst_video_time_code_meta_get_info",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gst_video_transfer_function_decode = Interop.downcallHandle(
        "gst_video_transfer_function_decode",
        FunctionDescriptor.of(Interop.valueLayout.C_DOUBLE, Interop.valueLayout.C_INT, Interop.valueLayout.C_DOUBLE),
        false
);

private static final MethodHandle gst_video_transfer_function_encode = Interop.downcallHandle(
        "gst_video_transfer_function_encode",
        FunctionDescriptor.of(Interop.valueLayout.C_DOUBLE, Interop.valueLayout.C_INT, Interop.valueLayout.C_DOUBLE),
        false
);

private static final MethodHandle gst_video_transfer_function_from_iso = Interop.downcallHandle(
        "gst_video_transfer_function_from_iso",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle gst_video_transfer_function_is_equivalent = Interop.downcallHandle(
        "gst_video_transfer_function_is_equivalent",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle gst_video_transfer_function_to_iso = Interop.downcallHandle(
        "gst_video_transfer_function_to_iso",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
        false
);
    }
    
    @ApiStatus.Internal
    public static class Callbacks {
    }
    
    private static void registerTypes() {
        if (ColorBalanceChannel.isAvailable()) Interop.register(ColorBalanceChannel.getType(), ColorBalanceChannel.fromAddress);
        if (VideoAggregator.isAvailable()) Interop.register(VideoAggregator.getType(), VideoAggregator.fromAddress);
        if (VideoAggregatorConvertPad.isAvailable()) Interop.register(VideoAggregatorConvertPad.getType(), VideoAggregatorConvertPad.fromAddress);
        if (VideoAggregatorPad.isAvailable()) Interop.register(VideoAggregatorPad.getType(), VideoAggregatorPad.fromAddress);
        if (VideoAggregatorParallelConvertPad.isAvailable()) Interop.register(VideoAggregatorParallelConvertPad.getType(), VideoAggregatorParallelConvertPad.fromAddress);
        if (VideoBufferPool.isAvailable()) Interop.register(VideoBufferPool.getType(), VideoBufferPool.fromAddress);
        if (VideoDecoder.isAvailable()) Interop.register(VideoDecoder.getType(), VideoDecoder.fromAddress);
        if (VideoEncoder.isAvailable()) Interop.register(VideoEncoder.getType(), VideoEncoder.fromAddress);
        if (VideoFilter.isAvailable()) Interop.register(VideoFilter.getType(), VideoFilter.fromAddress);
        if (VideoMultiviewFlagsSet.isAvailable()) Interop.register(VideoMultiviewFlagsSet.getType(), VideoMultiviewFlagsSet.fromAddress);
        if (VideoSink.isAvailable()) Interop.register(VideoSink.getType(), VideoSink.fromAddress);
        if (ColorBalance.isAvailable()) Interop.register(ColorBalance.getType(), ColorBalance.fromAddress);
        if (Navigation.isAvailable()) Interop.register(Navigation.getType(), Navigation.fromAddress);
        if (VideoDirection.isAvailable()) Interop.register(VideoDirection.getType(), VideoDirection.fromAddress);
        if (VideoOrientation.isAvailable()) Interop.register(VideoOrientation.getType(), VideoOrientation.fromAddress);
        if (VideoOverlay.isAvailable()) Interop.register(VideoOverlay.getType(), VideoOverlay.fromAddress);
    }
}
