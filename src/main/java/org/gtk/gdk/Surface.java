package org.gtk.gdk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A {@code GdkSurface} is a rectangular region on the screen.
 * <p>
 * It’s a low-level object, used to implement high-level objects
 * such as {@link org.gtk.gtk.Window} in GTK.
 * <p>
 * The surfaces you see in practice are either {@code Gdk.Toplevel} or
 * {@code Gdk.Popup}, and those interfaces provide much of the required
 * API to interact with these surfaces. Other, more specialized surface
 * types exist, but you will rarely interact with them directly.
 */
public class Surface extends org.gtk.gobject.Object {
    
    static {
        Gdk.javagi$ensureInitialized();
    }
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    public Surface(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to Surface */
    public static Surface castFrom(org.gtk.gobject.Object gobject) {
        return new Surface(gobject.refcounted());
    }
    
    private static Refcounted constructNewPopup(@NotNull org.gtk.gdk.Surface parent, boolean autohide) {
        java.util.Objects.requireNonNull(parent, "Parameter 'parent' must not be null");
        Refcounted RESULT;
        try {
            RESULT = Refcounted.get((MemoryAddress) DowncallHandles.gdk_surface_new_popup.invokeExact(parent.handle(), autohide ? 1 : 0), true);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Create a new popup surface.
     * <p>
     * The surface will be attached to {@code parent} and can be positioned
     * relative to it using {@link Popup#present}.
     * @param parent the parent surface to attach the surface to
     * @param autohide whether to hide the surface on outside clicks
     * @return a new {@code GdkSurface}
     */
    public static Surface newPopup(@NotNull org.gtk.gdk.Surface parent, boolean autohide) {
        return new Surface(constructNewPopup(parent, autohide));
    }
    
    private static Refcounted constructNewToplevel(@NotNull org.gtk.gdk.Display display) {
        java.util.Objects.requireNonNull(display, "Parameter 'display' must not be null");
        Refcounted RESULT;
        try {
            RESULT = Refcounted.get((MemoryAddress) DowncallHandles.gdk_surface_new_toplevel.invokeExact(display.handle()), true);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new toplevel surface.
     * @param display the display to create the surface on
     * @return the new {@code GdkSurface}
     */
    public static Surface newToplevel(@NotNull org.gtk.gdk.Display display) {
        return new Surface(constructNewToplevel(display));
    }
    
    /**
     * Emits a short beep associated to {@code surface}.
     * <p>
     * If the display of {@code surface} does not support per-surface beeps,
     * emits a short beep on the display just as {@link Display#beep}.
     */
    public void beep() {
        try {
            DowncallHandles.gdk_surface_beep.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new {@code GdkCairoContext} for rendering on {@code surface}.
     * @return the newly created {@code GdkCairoContext}
     */
    public @NotNull org.gtk.gdk.CairoContext createCairoContext() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gdk_surface_create_cairo_context.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gdk.CairoContext(Refcounted.get(RESULT, true));
    }
    
    /**
     * Creates a new {@code GdkGLContext} for the {@code GdkSurface}.
     * <p>
     * The context is disconnected from any particular surface or surface.
     * If the creation of the {@code GdkGLContext} failed, {@code error} will be set.
     * Before using the returned {@code GdkGLContext}, you will need to
     * call {@link GLContext#makeCurrent} or {@link GLContext#realize}.
     * @return the newly created {@code GdkGLContext}
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public @NotNull org.gtk.gdk.GLContext createGlContext() throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gdk_surface_create_gl_context.invokeExact(handle(), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new org.gtk.gdk.GLContext(Refcounted.get(RESULT, true));
    }
    
    /**
     * Create a new Cairo surface that is as compatible as possible with the
     * given {@code surface}.
     * <p>
     * For example the new surface will have the same fallback resolution
     * and font options as {@code surface}. Generally, the new surface will also
     * use the same backend as {@code surface}, unless that is not possible for
     * some reason. The type of the returned surface may be examined with
     * cairo_surface_get_type().
     * <p>
     * Initially the surface contents are all 0 (transparent if contents
     * have transparency, black otherwise.)
     * <p>
     * This function always returns a valid pointer, but it will return a
     * pointer to a “nil” surface if {@code other} is already in an error state
     * or any other error occurs.
     * @param content the content for the new surface
     * @param width width of the new surface
     * @param height height of the new surface
     * @return a pointer to the newly allocated surface. The caller
     *   owns the surface and should call cairo_surface_destroy() when done
     *   with it.
     */
    public @NotNull org.cairographics.Surface createSimilarSurface(@NotNull org.cairographics.Content content, int width, int height) {
        java.util.Objects.requireNonNull(content, "Parameter 'content' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gdk_surface_create_similar_surface.invokeExact(handle(), content.getValue(), width, height);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.cairographics.Surface(Refcounted.get(RESULT, true));
    }
    
    /**
     * Creates a new {@code GdkVulkanContext} for rendering on {@code surface}.
     * <p>
     * If the creation of the {@code GdkVulkanContext} failed, {@code error} will be set.
     * @return the newly created {@code GdkVulkanContext}, or
     *   {@code null} on error
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public @NotNull org.gtk.gdk.VulkanContext createVulkanContext() throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gdk_surface_create_vulkan_context.invokeExact(handle(), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new org.gtk.gdk.VulkanContext(Refcounted.get(RESULT, true));
    }
    
    /**
     * Destroys the window system resources associated with {@code surface} and
     * decrements {@code surface}'s reference count.
     * <p>
     * The window system resources for all children of {@code surface} are also
     * destroyed, but the children’s reference counts are not decremented.
     * <p>
     * Note that a surface will not be destroyed automatically when its
     * reference count reaches zero. You must call this function yourself
     * before that happens.
     */
    public void destroy() {
        try {
            DowncallHandles.gdk_surface_destroy.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Retrieves a {@code GdkCursor} pointer for the cursor currently set on the
     * {@code GdkSurface}.
     * <p>
     * If the return value is {@code null} then there is no custom cursor set on
     * the surface, and it is using the cursor for its parent surface.
     * <p>
     * Use {@link Surface#setCursor} to unset the cursor of the surface.
     * @return a {@code GdkCursor}
     */
    public @Nullable org.gtk.gdk.Cursor getCursor() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gdk_surface_get_cursor.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gdk.Cursor(Refcounted.get(RESULT, false));
    }
    
    /**
     * Retrieves a {@code GdkCursor} pointer for the {@code device} currently set on the
     * specified {@code GdkSurface}.
     * <p>
     * If the return value is {@code null} then there is no custom cursor set on the
     * specified surface, and it is using the cursor for its parent surface.
     * <p>
     * Use {@link Surface#setCursor} to unset the cursor of the surface.
     * @param device a pointer {@code GdkDevice}
     * @return a {@code GdkCursor}
     */
    public @Nullable org.gtk.gdk.Cursor getDeviceCursor(@NotNull org.gtk.gdk.Device device) {
        java.util.Objects.requireNonNull(device, "Parameter 'device' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gdk_surface_get_device_cursor.invokeExact(handle(), device.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gdk.Cursor(Refcounted.get(RESULT, false));
    }
    
    /**
     * Obtains the current device position and modifier state.
     * <p>
     * The position is given in coordinates relative to the upper
     * left corner of {@code surface}.
     * @param device pointer {@code GdkDevice} to query to
     * @param x return location for the X coordinate of {@code device}
     * @param y return location for the Y coordinate of {@code device}
     * @param mask return location for the modifier mask
     * @return {@code true} if the device is over the surface
     */
    public boolean getDevicePosition(@NotNull org.gtk.gdk.Device device, Out<Double> x, Out<Double> y, @NotNull Out<org.gtk.gdk.ModifierType> mask) {
        java.util.Objects.requireNonNull(device, "Parameter 'device' must not be null");
        java.util.Objects.requireNonNull(x, "Parameter 'x' must not be null");
        java.util.Objects.requireNonNull(y, "Parameter 'y' must not be null");
        java.util.Objects.requireNonNull(mask, "Parameter 'mask' must not be null");
        MemorySegment xPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_DOUBLE);
        MemorySegment yPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_DOUBLE);
        MemorySegment maskPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_INT);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gdk_surface_get_device_position.invokeExact(handle(), device.handle(), (Addressable) xPOINTER.address(), (Addressable) yPOINTER.address(), (Addressable) maskPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        x.set(xPOINTER.get(ValueLayout.JAVA_DOUBLE, 0));
        y.set(yPOINTER.get(ValueLayout.JAVA_DOUBLE, 0));
        mask.set(new org.gtk.gdk.ModifierType(maskPOINTER.get(ValueLayout.JAVA_INT, 0)));
        return RESULT != 0;
    }
    
    /**
     * Gets the {@code GdkDisplay} associated with a {@code GdkSurface}.
     * @return the {@code GdkDisplay} associated with {@code surface}
     */
    public @NotNull org.gtk.gdk.Display getDisplay() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gdk_surface_get_display.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gdk.Display(Refcounted.get(RESULT, false));
    }
    
    /**
     * Gets the frame clock for the surface.
     * <p>
     * The frame clock for a surface never changes unless the surface is
     * reparented to a new toplevel surface.
     * @return the frame clock
     */
    public @NotNull org.gtk.gdk.FrameClock getFrameClock() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gdk_surface_get_frame_clock.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gdk.FrameClock(Refcounted.get(RESULT, false));
    }
    
    /**
     * Returns the height of the given {@code surface}.
     * <p>
     * Surface size is reported in ”application pixels”, not
     * ”device pixels” (see {@link Surface#getScaleFactor}).
     * @return The height of {@code surface}
     */
    public int getHeight() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gdk_surface_get_height.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Checks whether the surface has been mapped.
     * <p>
     * A surface is mapped with {@link Toplevel#present}
     * or {@link Popup#present}.
     * @return {@code true} if the surface is mapped
     */
    public boolean getMapped() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gdk_surface_get_mapped.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Returns the internal scale factor that maps from surface coordinates
     * to the actual device pixels.
     * <p>
     * On traditional systems this is 1, but on very high density outputs
     * this can be a higher value (often 2). A higher value means that drawing
     * is automatically scaled up to a higher resolution, so any code doing
     * drawing will automatically look nicer. However, if you are supplying
     * pixel-based data the scale value can be used to determine whether to
     * use a pixel resource with higher resolution data.
     * <p>
     * The scale of a surface may change during runtime.
     * @return the scale factor
     */
    public int getScaleFactor() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gdk_surface_get_scale_factor.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Returns the width of the given {@code surface}.
     * <p>
     * Surface size is reported in ”application pixels”, not
     * ”device pixels” (see {@link Surface#getScaleFactor}).
     * @return The width of {@code surface}
     */
    public int getWidth() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gdk_surface_get_width.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Hide the surface.
     * <p>
     * For toplevel surfaces, withdraws them, so they will no longer be
     * known to the window manager; for all surfaces, unmaps them, so
     * they won’t be displayed. Normally done automatically as
     * part of {@link org.gtk.gtk.Widget#hide}.
     */
    public void hide() {
        try {
            DowncallHandles.gdk_surface_hide.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Check to see if a surface is destroyed.
     * @return {@code true} if the surface is destroyed
     */
    public boolean isDestroyed() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gdk_surface_is_destroyed.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Forces a {@code Gdk.Surface::render} signal emission for {@code surface}
     * to be scheduled.
     * <p>
     * This function is useful for implementations that track invalid
     * regions on their own.
     */
    public void queueRender() {
        try {
            DowncallHandles.gdk_surface_queue_render.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Request a layout phase from the surface's frame clock.
     * <p>
     * See {@link FrameClock#requestPhase}.
     */
    public void requestLayout() {
        try {
            DowncallHandles.gdk_surface_request_layout.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the default mouse pointer for a {@code GdkSurface}.
     * <p>
     * Passing {@code null} for the {@code cursor} argument means that {@code surface} will use
     * the cursor of its parent surface. Most surfaces should use this default.
     * Note that {@code cursor} must be for the same display as {@code surface}.
     * <p>
     * Use {@link Cursor#newFromName} or {@link Cursor#newFromTexture}
     * to create the cursor. To make the cursor invisible, use {@code GDK_BLANK_CURSOR}.
     * @param cursor a {@code GdkCursor}
     */
    public void setCursor(@Nullable org.gtk.gdk.Cursor cursor) {
        java.util.Objects.requireNonNullElse(cursor, MemoryAddress.NULL);
        try {
            DowncallHandles.gdk_surface_set_cursor.invokeExact(handle(), cursor.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets a specific {@code GdkCursor} for a given device when it gets inside {@code surface}.
     * <p>
     * Passing {@code null} for the {@code cursor} argument means that {@code surface} will use the
     * cursor of its parent surface. Most surfaces should use this default.
     * <p>
     * Use {@link Cursor#newFromName} or {@link Cursor#newFromTexture}
     * to create the cursor. To make the cursor invisible, use {@code GDK_BLANK_CURSOR}.
     * @param device a pointer {@code GdkDevice}
     * @param cursor a {@code GdkCursor}
     */
    public void setDeviceCursor(@NotNull org.gtk.gdk.Device device, @NotNull org.gtk.gdk.Cursor cursor) {
        java.util.Objects.requireNonNull(device, "Parameter 'device' must not be null");
        java.util.Objects.requireNonNull(cursor, "Parameter 'cursor' must not be null");
        try {
            DowncallHandles.gdk_surface_set_device_cursor.invokeExact(handle(), device.handle(), cursor.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Apply the region to the surface for the purpose of event
     * handling.
     * <p>
     * Mouse events which happen while the pointer position corresponds
     * to an unset bit in the mask will be passed on the surface below
     * {@code surface}.
     * <p>
     * An input region is typically used with RGBA surfaces. The alpha
     * channel of the surface defines which pixels are invisible and
     * allows for nicely antialiased borders, and the input region
     * controls where the surface is “clickable”.
     * <p>
     * Use {@link Display#supportsInputShapes} to find out if
     * a particular backend supports input regions.
     * @param region region of surface to be reactive
     */
    public void setInputRegion(@NotNull org.cairographics.Region region) {
        java.util.Objects.requireNonNull(region, "Parameter 'region' must not be null");
        try {
            DowncallHandles.gdk_surface_set_input_region.invokeExact(handle(), region.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Marks a region of the {@code GdkSurface} as opaque.
     * <p>
     * For optimisation purposes, compositing window managers may
     * like to not draw obscured regions of surfaces, or turn off blending
     * during for these regions. With RGB windows with no transparency,
     * this is just the shape of the window, but with ARGB32 windows, the
     * compositor does not know what regions of the window are transparent
     * or not.
     * <p>
     * This function only works for toplevel surfaces.
     * <p>
     * GTK will update this property automatically if the {@code surface} background
     * is opaque, as we know where the opaque regions are. If your surface
     * background is not opaque, please update this property in your
     * {@code org.gtk.gtk.Widget#cssChanged} handler.
     * @param region a region, or {@code null} to make the entire
     *   surface opaque
     */
    public void setOpaqueRegion(@Nullable org.cairographics.Region region) {
        java.util.Objects.requireNonNullElse(region, MemoryAddress.NULL);
        try {
            DowncallHandles.gdk_surface_set_opaque_region.invokeExact(handle(), region.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Translates coordinates between two surfaces.
     * <p>
     * Note that this only works if {@code to} and {@code from} are popups or
     * transient-for to the same toplevel (directly or indirectly).
     * @param to the target surface
     * @param x coordinates to translate
     * @param y coordinates to translate
     * @return {@code true} if the coordinates were successfully translated
     */
    public boolean translateCoordinates(@NotNull org.gtk.gdk.Surface to, Out<Double> x, Out<Double> y) {
        java.util.Objects.requireNonNull(to, "Parameter 'to' must not be null");
        java.util.Objects.requireNonNull(x, "Parameter 'x' must not be null");
        java.util.Objects.requireNonNull(y, "Parameter 'y' must not be null");
        MemorySegment xPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_DOUBLE);
        MemorySegment yPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_DOUBLE);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gdk_surface_translate_coordinates.invokeExact(handle(), to.handle(), (Addressable) xPOINTER.address(), (Addressable) yPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        x.set(xPOINTER.get(ValueLayout.JAVA_DOUBLE, 0));
        y.set(yPOINTER.get(ValueLayout.JAVA_DOUBLE, 0));
        return RESULT != 0;
    }
    
    @FunctionalInterface
    public interface EnterMonitor {
        void signalReceived(Surface source, @NotNull org.gtk.gdk.Monitor monitor);
    }
    
    /**
     * Emitted when {@code surface} starts being present on the monitor.
     */
    public Signal<Surface.EnterMonitor> onEnterMonitor(Surface.EnterMonitor handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("enter-monitor"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Surface.Callbacks.class, "signalSurfaceEnterMonitor",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<Surface.EnterMonitor>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface Event {
        boolean signalReceived(Surface source, @NotNull org.gtk.gdk.Event event);
    }
    
    /**
     * Emitted when GDK receives an input event for {@code surface}.
     */
    public Signal<Surface.Event> onEvent(Surface.Event handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("event"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Surface.Callbacks.class, "signalSurfaceEvent",
                        MethodType.methodType(boolean.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<Surface.Event>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface Layout {
        void signalReceived(Surface source, int width, int height);
    }
    
    /**
     * Emitted when the size of {@code surface} is changed, or when relayout should
     * be performed.
     * <p>
     * Surface size is reported in ”application pixels”, not
     * ”device pixels” (see gdk_surface_get_scale_factor()).
     */
    public Signal<Surface.Layout> onLayout(Surface.Layout handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("layout"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Surface.Callbacks.class, "signalSurfaceLayout",
                        MethodType.methodType(void.class, MemoryAddress.class, int.class, int.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<Surface.Layout>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface LeaveMonitor {
        void signalReceived(Surface source, @NotNull org.gtk.gdk.Monitor monitor);
    }
    
    /**
     * Emitted when {@code surface} stops being present on the monitor.
     */
    public Signal<Surface.LeaveMonitor> onLeaveMonitor(Surface.LeaveMonitor handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("leave-monitor"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Surface.Callbacks.class, "signalSurfaceLeaveMonitor",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<Surface.LeaveMonitor>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface Render {
        boolean signalReceived(Surface source, @NotNull org.cairographics.Region region);
    }
    
    /**
     * Emitted when part of the surface needs to be redrawn.
     */
    public Signal<Surface.Render> onRender(Surface.Render handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("render"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Surface.Callbacks.class, "signalSurfaceRender",
                        MethodType.methodType(boolean.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<Surface.Render>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gdk_surface_new_popup = Interop.downcallHandle(
            "gdk_surface_new_popup",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
        
        private static final MethodHandle gdk_surface_new_toplevel = Interop.downcallHandle(
            "gdk_surface_new_toplevel",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gdk_surface_beep = Interop.downcallHandle(
            "gdk_surface_beep",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gdk_surface_create_cairo_context = Interop.downcallHandle(
            "gdk_surface_create_cairo_context",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gdk_surface_create_gl_context = Interop.downcallHandle(
            "gdk_surface_create_gl_context",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gdk_surface_create_similar_surface = Interop.downcallHandle(
            "gdk_surface_create_similar_surface",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
        );
        
        private static final MethodHandle gdk_surface_create_vulkan_context = Interop.downcallHandle(
            "gdk_surface_create_vulkan_context",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gdk_surface_destroy = Interop.downcallHandle(
            "gdk_surface_destroy",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gdk_surface_get_cursor = Interop.downcallHandle(
            "gdk_surface_get_cursor",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gdk_surface_get_device_cursor = Interop.downcallHandle(
            "gdk_surface_get_device_cursor",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gdk_surface_get_device_position = Interop.downcallHandle(
            "gdk_surface_get_device_position",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
        
        private static final MethodHandle gdk_surface_get_display = Interop.downcallHandle(
            "gdk_surface_get_display",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gdk_surface_get_frame_clock = Interop.downcallHandle(
            "gdk_surface_get_frame_clock",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gdk_surface_get_height = Interop.downcallHandle(
            "gdk_surface_get_height",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gdk_surface_get_mapped = Interop.downcallHandle(
            "gdk_surface_get_mapped",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gdk_surface_get_scale_factor = Interop.downcallHandle(
            "gdk_surface_get_scale_factor",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gdk_surface_get_width = Interop.downcallHandle(
            "gdk_surface_get_width",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gdk_surface_hide = Interop.downcallHandle(
            "gdk_surface_hide",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gdk_surface_is_destroyed = Interop.downcallHandle(
            "gdk_surface_is_destroyed",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gdk_surface_queue_render = Interop.downcallHandle(
            "gdk_surface_queue_render",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gdk_surface_request_layout = Interop.downcallHandle(
            "gdk_surface_request_layout",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gdk_surface_set_cursor = Interop.downcallHandle(
            "gdk_surface_set_cursor",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gdk_surface_set_device_cursor = Interop.downcallHandle(
            "gdk_surface_set_device_cursor",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gdk_surface_set_input_region = Interop.downcallHandle(
            "gdk_surface_set_input_region",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gdk_surface_set_opaque_region = Interop.downcallHandle(
            "gdk_surface_set_opaque_region",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gdk_surface_translate_coordinates = Interop.downcallHandle(
            "gdk_surface_translate_coordinates",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
    }
    
    private static class Callbacks {
        
        public static void signalSurfaceEnterMonitor(MemoryAddress source, MemoryAddress monitor, MemoryAddress data) {
            int HASH = data.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (Surface.EnterMonitor) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new Surface(Refcounted.get(source)), new org.gtk.gdk.Monitor(Refcounted.get(monitor, false)));
        }
        
        public static boolean signalSurfaceEvent(MemoryAddress source, MemoryAddress event, MemoryAddress data) {
            int HASH = data.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (Surface.Event) Interop.signalRegistry.get(HASH);
            return HANDLER.signalReceived(new Surface(Refcounted.get(source)), new org.gtk.gdk.Event(Refcounted.get(event, false)));
        }
        
        public static void signalSurfaceLayout(MemoryAddress source, int width, int height, MemoryAddress data) {
            int HASH = data.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (Surface.Layout) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new Surface(Refcounted.get(source)), width, height);
        }
        
        public static void signalSurfaceLeaveMonitor(MemoryAddress source, MemoryAddress monitor, MemoryAddress data) {
            int HASH = data.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (Surface.LeaveMonitor) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new Surface(Refcounted.get(source)), new org.gtk.gdk.Monitor(Refcounted.get(monitor, false)));
        }
        
        public static boolean signalSurfaceRender(MemoryAddress source, MemoryAddress region, MemoryAddress data) {
            int HASH = data.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (Surface.Render) Interop.signalRegistry.get(HASH);
            return HANDLER.signalReceived(new Surface(Refcounted.get(source)), new org.cairographics.Region(Refcounted.get(region, false)));
        }
    }
}
