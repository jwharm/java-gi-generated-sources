package org.gstreamer.gl;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public enum GLFormat implements io.github.jwharm.javagi.Enumeration {
    
    /**
     * Single component replicated across R, G, and B textures
     *                    components
     */
    LUMINANCE(6409),
    
    /**
     * Single component stored in the A texture component
     */
    ALPHA(6406),
    
    /**
     * Combination of {@code GST_GL_LUMINANCE} and {@code GST_GL_ALPHA}
     */
    LUMINANCE_ALPHA(6410),
    
    /**
     * Single component stored in the R texture component
     */
    RED(6403),
    
    /**
     * Single 8-bit component stored in the R texture component
     */
    R8(33321),
    
    /**
     * Two components stored in the R and G texture components
     */
    RG(33319),
    
    /**
     * Two 8-bit components stored in the R and G texture components
     */
    RG8(33323),
    
    /**
     * Three components stored in the R, G, and B texture components
     */
    RGB(6407),
    
    /**
     * Three 8-bit components stored in the R, G, and B
     *               texture components
     */
    RGB8(32849),
    
    /**
     * Three components of bit depth 5, 6 and 5 stored in the R, G,
     *                 and B texture components respectively.
     */
    RGB565(36194),
    
    /**
     * Three 16-bit components stored in the R, G, and B
     *               texture components
     */
    RGB16(32852),
    
    /**
     * Four components stored in the R, G, B, and A texture
     *               components respectively.
     */
    RGBA(6408),
    
    /**
     * Four 8-bit components stored in the R, G, B, and A texture
     *                components respectively.
     */
    RGBA8(32856),
    
    /**
     * Four 16-bit components stored in the R, G, B, and A texture
     *                components respectively.
     */
    RGBA16(32859),
    
    /**
     * A single 16-bit component for depth information.
     */
    DEPTH_COMPONENT16(33189),
    
    /**
     * A 24-bit component for depth information and
     *                           a 8-bit component for stencil informat.
     */
    DEPTH24_STENCIL8(35056),
    
    RGB10_A2(32857),
    
    /**
     * Single 16-bit component stored in the R texture component
     */
    R16(33322),
    
    /**
     * Two 16-bit components stored in the R and G texture components
     */
    RG16(33324);
    
    private static final java.lang.String C_TYPE_NAME = "GstGLFormat";
    
    private final int value;
    
    /**
     * Create a new GLFormat for the provided value
     * @param numeric value the enum value
     */
    GLFormat(int value) {
        this.value = value;
    }
    
    /**
     * Get the numeric value of this enum
     * @return the enum value
     */
    @Override
    public int getValue() {
        return value;
    }
    
    /**
     * Create a new GLFormat for the provided value
     * @param value the enum value
     * @return the enum for the provided value
     */
    public static GLFormat of(int value) {
        return switch (value) {
            case 6409 -> LUMINANCE;
            case 6406 -> ALPHA;
            case 6410 -> LUMINANCE_ALPHA;
            case 6403 -> RED;
            case 33321 -> R8;
            case 33319 -> RG;
            case 33323 -> RG8;
            case 6407 -> RGB;
            case 32849 -> RGB8;
            case 36194 -> RGB565;
            case 32852 -> RGB16;
            case 6408 -> RGBA;
            case 32856 -> RGBA8;
            case 32859 -> RGBA16;
            case 33189 -> DEPTH_COMPONENT16;
            case 35056 -> DEPTH24_STENCIL8;
            case 32857 -> RGB10_A2;
            case 33322 -> R16;
            case 33324 -> RG16;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
    
    public static org.gstreamer.gl.GLFormat fromVideoInfo(org.gstreamer.gl.GLContext context, org.gstreamer.video.VideoInfo vinfo, int plane) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_gl_format_from_video_info.invokeExact(
                    context.handle(),
                    vinfo.handle(),
                    plane);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.gl.GLFormat.of(RESULT);
    }
    
    public static boolean isSupported(org.gstreamer.gl.GLContext context, org.gstreamer.gl.GLFormat format) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_gl_format_is_supported.invokeExact(
                    context.handle(),
                    format.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Get the unsized format and type from {@code format} for usage in glReadPixels,
     * glTex{Sub}Image<em>, glTexImage</em> and similar functions.
     * @param format the sized internal {@link GLFormat}
     * @param unsizedFormat location for the resulting unsized {@link GLFormat}
     * @param glType location for the resulting GL type
     */
    public static void typeFromSizedGlFormat(org.gstreamer.gl.GLFormat format, Out<org.gstreamer.gl.GLFormat> unsizedFormat, Out<Integer> glType) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment unsizedFormatPOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
            MemorySegment glTypePOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
            try {
                DowncallHandles.gst_gl_format_type_from_sized_gl_format.invokeExact(
                        format.getValue(),
                        (Addressable) unsizedFormatPOINTER.address(),
                        (Addressable) glTypePOINTER.address());
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
                    unsizedFormat.set(org.gstreamer.gl.GLFormat.of(unsizedFormatPOINTER.get(Interop.valueLayout.C_INT, 0)));
                    glType.set(glTypePOINTER.get(Interop.valueLayout.C_INT, 0));
        }
    }
    
    public static int typeNBytes(int format, int type) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_gl_format_type_n_bytes.invokeExact(
                    format,
                    type);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_gl_format_from_video_info = Interop.downcallHandle(
                "gst_gl_format_from_video_info",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gst_gl_format_is_supported = Interop.downcallHandle(
                "gst_gl_format_is_supported",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gst_gl_format_type_from_sized_gl_format = Interop.downcallHandle(
                "gst_gl_format_type_from_sized_gl_format",
                FunctionDescriptor.ofVoid(Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_gl_format_type_n_bytes = Interop.downcallHandle(
                "gst_gl_format_type_n_bytes",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
                false
        );
    }
}
