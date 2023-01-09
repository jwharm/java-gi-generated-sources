package org.gstreamer.play;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class PlayVideoOverlayVideoRenderer extends org.gtk.gobject.GObject implements org.gstreamer.play.PlayVideoRenderer {
    
    static {
        GstPlay.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstPlayVideoOverlayVideoRenderer";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a PlayVideoOverlayVideoRenderer proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected PlayVideoOverlayVideoRenderer(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, PlayVideoOverlayVideoRenderer> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new PlayVideoOverlayVideoRenderer(input);
    
    /**
     * Tell an overlay that it has been exposed. This will redraw the current frame
     * in the drawable even if the pipeline is PAUSED.
     */
    public void expose() {
        try {
            DowncallHandles.gst_play_video_overlay_video_renderer_expose.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Return the currently configured render rectangle. See gst_play_video_overlay_video_renderer_set_render_rectangle()
     * for details.
     * @param x the horizontal offset of the render area inside the window
     * @param y the vertical offset of the render area inside the window
     * @param width the width of the render area inside the window
     * @param height the height of the render area inside the window
     */
    public void getRenderRectangle(Out<Integer> x, Out<Integer> y, Out<Integer> width, Out<Integer> height) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment xPOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
            MemorySegment yPOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
            MemorySegment widthPOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
            MemorySegment heightPOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
            try {
                DowncallHandles.gst_play_video_overlay_video_renderer_get_render_rectangle.invokeExact(
                        handle(),
                        (Addressable) (x == null ? MemoryAddress.NULL : (Addressable) xPOINTER.address()),
                        (Addressable) (y == null ? MemoryAddress.NULL : (Addressable) yPOINTER.address()),
                        (Addressable) (width == null ? MemoryAddress.NULL : (Addressable) widthPOINTER.address()),
                        (Addressable) (height == null ? MemoryAddress.NULL : (Addressable) heightPOINTER.address()));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
                    if (x != null) x.set(xPOINTER.get(Interop.valueLayout.C_INT, 0));
                    if (y != null) y.set(yPOINTER.get(Interop.valueLayout.C_INT, 0));
                    if (width != null) width.set(widthPOINTER.get(Interop.valueLayout.C_INT, 0));
                    if (height != null) height.set(heightPOINTER.get(Interop.valueLayout.C_INT, 0));
        }
    }
    
    public @Nullable java.lang.foreign.MemoryAddress getWindowHandle() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_play_video_overlay_video_renderer_get_window_handle.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Configure a subregion as a video target within the window set by
     * gst_play_video_overlay_video_renderer_set_window_handle(). If this is not
     * used or not supported the video will fill the area of the window set as the
     * overlay to 100%. By specifying the rectangle, the video can be overlaid to
     * a specific region of that window only. After setting the new rectangle one
     * should call gst_play_video_overlay_video_renderer_expose() to force a
     * redraw. To unset the region pass -1 for the {@code width} and {@code height} parameters.
     * <p>
     * This method is needed for non fullscreen video overlay in UI toolkits that
     * do not support subwindows.
     * @param x the horizontal offset of the render area inside the window
     * @param y the vertical offset of the render area inside the window
     * @param width the width of the render area inside the window
     * @param height the height of the render area inside the window
     */
    public void setRenderRectangle(int x, int y, int width, int height) {
        try {
            DowncallHandles.gst_play_video_overlay_video_renderer_set_render_rectangle.invokeExact(
                    handle(),
                    x,
                    y,
                    width,
                    height);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the platform specific window handle into which the video
     * should be rendered
     * @param windowHandle handle referencing to the platform specific window
     */
    public void setWindowHandle(@Nullable java.lang.foreign.MemoryAddress windowHandle) {
        try {
            DowncallHandles.gst_play_video_overlay_video_renderer_set_window_handle.invokeExact(
                    handle(),
                    (Addressable) (windowHandle == null ? MemoryAddress.NULL : (Addressable) windowHandle));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_play_video_overlay_video_renderer_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    public static org.gstreamer.play.PlayVideoRenderer new_(@Nullable java.lang.foreign.MemoryAddress windowHandle) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_play_video_overlay_video_renderer_new.invokeExact((Addressable) (windowHandle == null ? MemoryAddress.NULL : (Addressable) windowHandle));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = (org.gstreamer.play.PlayVideoRenderer) Interop.register(RESULT, org.gstreamer.play.PlayVideoRenderer.fromAddress).marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    public static org.gstreamer.play.PlayVideoRenderer newWithSink(@Nullable java.lang.foreign.MemoryAddress windowHandle, org.gstreamer.gst.Element videoSink) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_play_video_overlay_video_renderer_new_with_sink.invokeExact(
                    (Addressable) (windowHandle == null ? MemoryAddress.NULL : (Addressable) windowHandle),
                    videoSink.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = (org.gstreamer.play.PlayVideoRenderer) Interop.register(RESULT, org.gstreamer.play.PlayVideoRenderer.fromAddress).marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * A {@link PlayVideoOverlayVideoRenderer.Builder} object constructs a {@link PlayVideoOverlayVideoRenderer} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link PlayVideoOverlayVideoRenderer.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gtk.gobject.GObject.Builder {
        
        /**
         * Default constructor for a {@code Builder} object.
         */
        protected Builder() {
        }
        
        /**
         * Finish building the {@link PlayVideoOverlayVideoRenderer} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link PlayVideoOverlayVideoRenderer}.
         * @return A new instance of {@code PlayVideoOverlayVideoRenderer} with the properties 
         *         that were set in the Builder object.
         */
        public PlayVideoOverlayVideoRenderer build() {
            return (PlayVideoOverlayVideoRenderer) org.gtk.gobject.GObject.newWithProperties(
                PlayVideoOverlayVideoRenderer.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        public Builder setVideoSink(org.gstreamer.gst.Element videoSink) {
            names.add("video-sink");
            values.add(org.gtk.gobject.Value.create(videoSink));
            return this;
        }
        
        public Builder setWindowHandle(java.lang.foreign.MemoryAddress windowHandle) {
            names.add("window-handle");
            values.add(org.gtk.gobject.Value.create(windowHandle));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_play_video_overlay_video_renderer_expose = Interop.downcallHandle(
                "gst_play_video_overlay_video_renderer_expose",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_play_video_overlay_video_renderer_get_render_rectangle = Interop.downcallHandle(
                "gst_play_video_overlay_video_renderer_get_render_rectangle",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_play_video_overlay_video_renderer_get_window_handle = Interop.downcallHandle(
                "gst_play_video_overlay_video_renderer_get_window_handle",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_play_video_overlay_video_renderer_set_render_rectangle = Interop.downcallHandle(
                "gst_play_video_overlay_video_renderer_set_render_rectangle",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gst_play_video_overlay_video_renderer_set_window_handle = Interop.downcallHandle(
                "gst_play_video_overlay_video_renderer_set_window_handle",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_play_video_overlay_video_renderer_get_type = Interop.downcallHandle(
                "gst_play_video_overlay_video_renderer_get_type",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG),
                false
        );
        
        private static final MethodHandle gst_play_video_overlay_video_renderer_new = Interop.downcallHandle(
                "gst_play_video_overlay_video_renderer_new",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_play_video_overlay_video_renderer_new_with_sink = Interop.downcallHandle(
                "gst_play_video_overlay_video_renderer_new_with_sink",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
    }
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.gst_play_video_overlay_video_renderer_get_type != null;
    }
}
