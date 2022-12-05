package org.gstreamer.play;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class PlayVideoOverlayVideoRenderer extends org.gtk.gobject.Object implements org.gstreamer.play.PlayVideoRenderer {
    
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
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public PlayVideoOverlayVideoRenderer(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to PlayVideoOverlayVideoRenderer if its GType is a (or inherits from) "GstPlayVideoOverlayVideoRenderer".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code PlayVideoOverlayVideoRenderer} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GstPlayVideoOverlayVideoRenderer", a ClassCastException will be thrown.
     */
    public static PlayVideoOverlayVideoRenderer castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(new org.gtk.gobject.TypeInstance(gobject.handle(), Ownership.NONE), PlayVideoOverlayVideoRenderer.getType())) {
            return new PlayVideoOverlayVideoRenderer(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GstPlayVideoOverlayVideoRenderer");
        }
    }
    
    /**
     * Tell an overlay that it has been exposed. This will redraw the current frame
     * in the drawable even if the pipeline is PAUSED.
     */
    public void expose() {
        try {
            DowncallHandles.gst_play_video_overlay_video_renderer_expose.invokeExact(
                    handle());
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
        java.util.Objects.requireNonNull(x, "Parameter 'x' must not be null");
        MemorySegment xPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        java.util.Objects.requireNonNull(y, "Parameter 'y' must not be null");
        MemorySegment yPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        java.util.Objects.requireNonNull(width, "Parameter 'width' must not be null");
        MemorySegment widthPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        java.util.Objects.requireNonNull(height, "Parameter 'height' must not be null");
        MemorySegment heightPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        try {
            DowncallHandles.gst_play_video_overlay_video_renderer_get_render_rectangle.invokeExact(
                    handle(),
                    (Addressable) xPOINTER.address(),
                    (Addressable) yPOINTER.address(),
                    (Addressable) widthPOINTER.address(),
                    (Addressable) heightPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        x.set(xPOINTER.get(Interop.valueLayout.C_INT, 0));
        y.set(yPOINTER.get(Interop.valueLayout.C_INT, 0));
        width.set(widthPOINTER.get(Interop.valueLayout.C_INT, 0));
        height.set(heightPOINTER.get(Interop.valueLayout.C_INT, 0));
    }
    
    public @Nullable java.lang.foreign.MemoryAddress getWindowHandle() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_play_video_overlay_video_renderer_get_window_handle.invokeExact(
                    handle());
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
    public static @NotNull org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_play_video_overlay_video_renderer_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    public static @NotNull org.gstreamer.play.PlayVideoRenderer new_(@Nullable java.lang.foreign.MemoryAddress windowHandle) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_play_video_overlay_video_renderer_new.invokeExact(
                    (Addressable) (windowHandle == null ? MemoryAddress.NULL : (Addressable) windowHandle));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.play.PlayVideoRenderer.PlayVideoRendererImpl(RESULT, Ownership.FULL);
    }
    
    public static @NotNull org.gstreamer.play.PlayVideoRenderer newWithSink(@Nullable java.lang.foreign.MemoryAddress windowHandle, @NotNull org.gstreamer.gst.Element videoSink) {
        java.util.Objects.requireNonNull(videoSink, "Parameter 'videoSink' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_play_video_overlay_video_renderer_new_with_sink.invokeExact(
                    (Addressable) (windowHandle == null ? MemoryAddress.NULL : (Addressable) windowHandle),
                    videoSink.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.play.PlayVideoRenderer.PlayVideoRendererImpl(RESULT, Ownership.FULL);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * GObjects with properties.
     */
    public static class Build extends org.gtk.gobject.Object.Build {
        
         /**
         * A {@link PlayVideoOverlayVideoRenderer.Build} object constructs a {@link PlayVideoOverlayVideoRenderer} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link PlayVideoOverlayVideoRenderer} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link PlayVideoOverlayVideoRenderer} using {@link PlayVideoOverlayVideoRenderer#castFrom}.
         * @return A new instance of {@code PlayVideoOverlayVideoRenderer} with the properties 
         *         that were set in the Build object.
         */
        public PlayVideoOverlayVideoRenderer construct() {
            return PlayVideoOverlayVideoRenderer.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    PlayVideoOverlayVideoRenderer.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
        }
        
        public Build setVideoSink(org.gstreamer.gst.Element videoSink) {
            names.add("video-sink");
            values.add(org.gtk.gobject.Value.create(videoSink));
            return this;
        }
        
        public Build setWindowHandle(java.lang.foreign.MemoryAddress windowHandle) {
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
}
