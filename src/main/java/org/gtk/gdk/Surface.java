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
public class Surface extends org.gtk.gobject.GObject {
    
    static {
        Gdk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GdkSurface";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a Surface proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected Surface(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, Surface> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new Surface(input);
    
    private static MemoryAddress constructNewPopup(org.gtk.gdk.Surface parent, boolean autohide) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gdk_surface_new_popup.invokeExact(
                    parent.handle(),
                    Marshal.booleanToInteger.marshal(autohide, null).intValue());
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
    public static Surface newPopup(org.gtk.gdk.Surface parent, boolean autohide) {
        var RESULT = constructNewPopup(parent, autohide);
        var OBJECT = (org.gtk.gdk.Surface) Interop.register(RESULT, org.gtk.gdk.Surface.fromAddress).marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    private static MemoryAddress constructNewToplevel(org.gtk.gdk.Display display) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gdk_surface_new_toplevel.invokeExact(display.handle());
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
    public static Surface newToplevel(org.gtk.gdk.Display display) {
        var RESULT = constructNewToplevel(display);
        var OBJECT = (org.gtk.gdk.Surface) Interop.register(RESULT, org.gtk.gdk.Surface.fromAddress).marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
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
    public org.gtk.gdk.CairoContext createCairoContext() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gdk_surface_create_cairo_context.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = (org.gtk.gdk.CairoContext) Interop.register(RESULT, org.gtk.gdk.CairoContext.fromAddress).marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
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
    public org.gtk.gdk.GLContext createGlContext() throws io.github.jwharm.javagi.GErrorException {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.gdk_surface_create_gl_context.invokeExact(handle(),(Addressable) GERROR);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            var OBJECT = (org.gtk.gdk.GLContext) Interop.register(RESULT, org.gtk.gdk.GLContext.fromAddress).marshal(RESULT, null);
            OBJECT.takeOwnership();
            return OBJECT;
        }
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
    public org.cairographics.Surface createSimilarSurface(org.cairographics.Content content, int width, int height) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gdk_surface_create_similar_surface.invokeExact(
                    handle(),
                    content.getValue(),
                    width,
                    height);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = org.cairographics.Surface.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * Creates a new {@code GdkVulkanContext} for rendering on {@code surface}.
     * <p>
     * If the creation of the {@code GdkVulkanContext} failed, {@code error} will be set.
     * @return the newly created {@code GdkVulkanContext}, or
     *   {@code null} on error
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public org.gtk.gdk.VulkanContext createVulkanContext() throws io.github.jwharm.javagi.GErrorException {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.gdk_surface_create_vulkan_context.invokeExact(handle(),(Addressable) GERROR);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            var OBJECT = (org.gtk.gdk.VulkanContext) Interop.register(RESULT, org.gtk.gdk.VulkanContext.fromAddress).marshal(RESULT, null);
            OBJECT.takeOwnership();
            return OBJECT;
        }
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
        return (org.gtk.gdk.Cursor) Interop.register(RESULT, org.gtk.gdk.Cursor.fromAddress).marshal(RESULT, null);
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
    public @Nullable org.gtk.gdk.Cursor getDeviceCursor(org.gtk.gdk.Device device) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gdk_surface_get_device_cursor.invokeExact(
                    handle(),
                    device.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gdk.Cursor) Interop.register(RESULT, org.gtk.gdk.Cursor.fromAddress).marshal(RESULT, null);
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
    public boolean getDevicePosition(org.gtk.gdk.Device device, Out<Double> x, Out<Double> y, @Nullable Out<org.gtk.gdk.ModifierType> mask) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment xPOINTER = SCOPE.allocate(Interop.valueLayout.C_DOUBLE);
            MemorySegment yPOINTER = SCOPE.allocate(Interop.valueLayout.C_DOUBLE);
            MemorySegment maskPOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.gdk_surface_get_device_position.invokeExact(
                        handle(),
                        device.handle(),
                        (Addressable) (x == null ? MemoryAddress.NULL : (Addressable) xPOINTER.address()),
                        (Addressable) (y == null ? MemoryAddress.NULL : (Addressable) yPOINTER.address()),
                        (Addressable) (mask == null ? MemoryAddress.NULL : (Addressable) maskPOINTER.address()));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
                    if (x != null) x.set(xPOINTER.get(Interop.valueLayout.C_DOUBLE, 0));
                    if (y != null) y.set(yPOINTER.get(Interop.valueLayout.C_DOUBLE, 0));
                    if (mask != null) mask.set(new org.gtk.gdk.ModifierType(maskPOINTER.get(Interop.valueLayout.C_INT, 0)));
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
    }
    
    /**
     * Gets the {@code GdkDisplay} associated with a {@code GdkSurface}.
     * @return the {@code GdkDisplay} associated with {@code surface}
     */
    public org.gtk.gdk.Display getDisplay() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gdk_surface_get_display.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gdk.Display) Interop.register(RESULT, org.gtk.gdk.Display.fromAddress).marshal(RESULT, null);
    }
    
    /**
     * Gets the frame clock for the surface.
     * <p>
     * The frame clock for a surface never changes unless the surface is
     * reparented to a new toplevel surface.
     * @return the frame clock
     */
    public org.gtk.gdk.FrameClock getFrameClock() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gdk_surface_get_frame_clock.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gdk.FrameClock) Interop.register(RESULT, org.gtk.gdk.FrameClock.fromAddress).marshal(RESULT, null);
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
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
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
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
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
        try {
            DowncallHandles.gdk_surface_set_cursor.invokeExact(
                    handle(),
                    (Addressable) (cursor == null ? MemoryAddress.NULL : cursor.handle()));
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
    public void setDeviceCursor(org.gtk.gdk.Device device, org.gtk.gdk.Cursor cursor) {
        try {
            DowncallHandles.gdk_surface_set_device_cursor.invokeExact(
                    handle(),
                    device.handle(),
                    cursor.handle());
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
    public void setInputRegion(org.cairographics.Region region) {
        try {
            DowncallHandles.gdk_surface_set_input_region.invokeExact(
                    handle(),
                    region.handle());
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
        try {
            DowncallHandles.gdk_surface_set_opaque_region.invokeExact(
                    handle(),
                    (Addressable) (region == null ? MemoryAddress.NULL : region.handle()));
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
    public boolean translateCoordinates(org.gtk.gdk.Surface to, Out<Double> x, Out<Double> y) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment xPOINTER = SCOPE.allocate(Interop.valueLayout.C_DOUBLE);
            MemorySegment yPOINTER = SCOPE.allocate(Interop.valueLayout.C_DOUBLE);
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.gdk_surface_translate_coordinates.invokeExact(
                        handle(),
                        to.handle(),
                        (Addressable) xPOINTER.address(),
                        (Addressable) yPOINTER.address());
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
                    x.set(xPOINTER.get(Interop.valueLayout.C_DOUBLE, 0));
                    y.set(yPOINTER.get(Interop.valueLayout.C_DOUBLE, 0));
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gdk_surface_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * Functional interface declaration of the {@code EnterMonitor} callback.
     */
    @FunctionalInterface
    public interface EnterMonitor {
    
        /**
         * Emitted when {@code surface} starts being present on the monitor.
         */
        void run(org.gtk.gdk.Monitor monitor);
        
        @ApiStatus.Internal default void upcall(MemoryAddress sourceSurface, MemoryAddress monitor) {
            run((org.gtk.gdk.Monitor) Interop.register(monitor, org.gtk.gdk.Monitor.fromAddress).marshal(monitor, null));
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), EnterMonitor.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Emitted when {@code surface} starts being present on the monitor.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<Surface.EnterMonitor> onEnterMonitor(Surface.EnterMonitor handler) {
        MemorySession SCOPE = MemorySession.openImplicit();
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("enter-monitor", SCOPE), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Functional interface declaration of the {@code Event} callback.
     */
    @FunctionalInterface
    public interface Event {
    
        /**
         * Emitted when GDK receives an input event for {@code surface}.
         */
        boolean run(org.gtk.gdk.Event event);
        
        @ApiStatus.Internal default int upcall(MemoryAddress sourceSurface, MemoryAddress event) {
            var RESULT = run((org.gtk.gdk.Event) Interop.register(event, org.gtk.gdk.Event.fromAddress).marshal(event, null));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), Event.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Emitted when GDK receives an input event for {@code surface}.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<Surface.Event> onEvent(Surface.Event handler) {
        MemorySession SCOPE = MemorySession.openImplicit();
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("event", SCOPE), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Functional interface declaration of the {@code Layout} callback.
     */
    @FunctionalInterface
    public interface Layout {
    
        /**
         * Emitted when the size of {@code surface} is changed, or when relayout should
         * be performed.
         * <p>
         * Surface size is reported in ”application pixels”, not
         * ”device pixels” (see gdk_surface_get_scale_factor()).
         */
        void run(int width, int height);
        
        @ApiStatus.Internal default void upcall(MemoryAddress sourceSurface, int width, int height) {
            run(width, height);
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), Layout.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Emitted when the size of {@code surface} is changed, or when relayout should
     * be performed.
     * <p>
     * Surface size is reported in ”application pixels”, not
     * ”device pixels” (see gdk_surface_get_scale_factor()).
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<Surface.Layout> onLayout(Surface.Layout handler) {
        MemorySession SCOPE = MemorySession.openImplicit();
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("layout", SCOPE), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Functional interface declaration of the {@code LeaveMonitor} callback.
     */
    @FunctionalInterface
    public interface LeaveMonitor {
    
        /**
         * Emitted when {@code surface} stops being present on the monitor.
         */
        void run(org.gtk.gdk.Monitor monitor);
        
        @ApiStatus.Internal default void upcall(MemoryAddress sourceSurface, MemoryAddress monitor) {
            run((org.gtk.gdk.Monitor) Interop.register(monitor, org.gtk.gdk.Monitor.fromAddress).marshal(monitor, null));
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), LeaveMonitor.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Emitted when {@code surface} stops being present on the monitor.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<Surface.LeaveMonitor> onLeaveMonitor(Surface.LeaveMonitor handler) {
        MemorySession SCOPE = MemorySession.openImplicit();
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("leave-monitor", SCOPE), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Functional interface declaration of the {@code Render} callback.
     */
    @FunctionalInterface
    public interface Render {
    
        /**
         * Emitted when part of the surface needs to be redrawn.
         */
        boolean run(org.cairographics.Region region);
        
        @ApiStatus.Internal default int upcall(MemoryAddress sourceSurface, MemoryAddress region) {
            var RESULT = run(org.cairographics.Region.fromAddress.marshal(region, null));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), Render.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Emitted when part of the surface needs to be redrawn.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<Surface.Render> onRender(Surface.Render handler) {
        MemorySession SCOPE = MemorySession.openImplicit();
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("render", SCOPE), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * A {@link Surface.Builder} object constructs a {@link Surface} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link Surface.Builder#build()}. 
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
         * Finish building the {@link Surface} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link Surface}.
         * @return A new instance of {@code Surface} with the properties 
         *         that were set in the Builder object.
         */
        public Surface build() {
            return (Surface) org.gtk.gobject.GObject.newWithProperties(
                Surface.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        /**
         * The mouse pointer for the {@code GdkSurface}.
         * @param cursor The value for the {@code cursor} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setCursor(org.gtk.gdk.Cursor cursor) {
            names.add("cursor");
            values.add(org.gtk.gobject.Value.create(cursor));
            return this;
        }
        
        /**
         * The {@code GdkDisplay} connection of the surface.
         * @param display The value for the {@code display} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setDisplay(org.gtk.gdk.Display display) {
            names.add("display");
            values.add(org.gtk.gobject.Value.create(display));
            return this;
        }
        
        /**
         * The {@code GdkFrameClock} of the surface.
         * @param frameClock The value for the {@code frame-clock} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setFrameClock(org.gtk.gdk.FrameClock frameClock) {
            names.add("frame-clock");
            values.add(org.gtk.gobject.Value.create(frameClock));
            return this;
        }
        
        /**
         * The height of the surface, in pixels.
         * @param height The value for the {@code height} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setHeight(int height) {
            names.add("height");
            values.add(org.gtk.gobject.Value.create(height));
            return this;
        }
        
        /**
         * Whether the surface is mapped.
         * @param mapped The value for the {@code mapped} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setMapped(boolean mapped) {
            names.add("mapped");
            values.add(org.gtk.gobject.Value.create(mapped));
            return this;
        }
        
        /**
         * The scale factor of the surface.
         * @param scaleFactor The value for the {@code scale-factor} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setScaleFactor(int scaleFactor) {
            names.add("scale-factor");
            values.add(org.gtk.gobject.Value.create(scaleFactor));
            return this;
        }
        
        /**
         * The width of the surface in pixels.
         * @param width The value for the {@code width} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setWidth(int width) {
            names.add("width");
            values.add(org.gtk.gobject.Value.create(width));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gdk_surface_new_popup = Interop.downcallHandle(
                "gdk_surface_new_popup",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gdk_surface_new_toplevel = Interop.downcallHandle(
                "gdk_surface_new_toplevel",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gdk_surface_beep = Interop.downcallHandle(
                "gdk_surface_beep",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gdk_surface_create_cairo_context = Interop.downcallHandle(
                "gdk_surface_create_cairo_context",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gdk_surface_create_gl_context = Interop.downcallHandle(
                "gdk_surface_create_gl_context",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gdk_surface_create_similar_surface = Interop.downcallHandle(
                "gdk_surface_create_similar_surface",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gdk_surface_create_vulkan_context = Interop.downcallHandle(
                "gdk_surface_create_vulkan_context",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gdk_surface_destroy = Interop.downcallHandle(
                "gdk_surface_destroy",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gdk_surface_get_cursor = Interop.downcallHandle(
                "gdk_surface_get_cursor",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gdk_surface_get_device_cursor = Interop.downcallHandle(
                "gdk_surface_get_device_cursor",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gdk_surface_get_device_position = Interop.downcallHandle(
                "gdk_surface_get_device_position",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gdk_surface_get_display = Interop.downcallHandle(
                "gdk_surface_get_display",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gdk_surface_get_frame_clock = Interop.downcallHandle(
                "gdk_surface_get_frame_clock",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gdk_surface_get_height = Interop.downcallHandle(
                "gdk_surface_get_height",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gdk_surface_get_mapped = Interop.downcallHandle(
                "gdk_surface_get_mapped",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gdk_surface_get_scale_factor = Interop.downcallHandle(
                "gdk_surface_get_scale_factor",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gdk_surface_get_width = Interop.downcallHandle(
                "gdk_surface_get_width",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gdk_surface_hide = Interop.downcallHandle(
                "gdk_surface_hide",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gdk_surface_is_destroyed = Interop.downcallHandle(
                "gdk_surface_is_destroyed",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gdk_surface_queue_render = Interop.downcallHandle(
                "gdk_surface_queue_render",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gdk_surface_request_layout = Interop.downcallHandle(
                "gdk_surface_request_layout",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gdk_surface_set_cursor = Interop.downcallHandle(
                "gdk_surface_set_cursor",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gdk_surface_set_device_cursor = Interop.downcallHandle(
                "gdk_surface_set_device_cursor",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gdk_surface_set_input_region = Interop.downcallHandle(
                "gdk_surface_set_input_region",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gdk_surface_set_opaque_region = Interop.downcallHandle(
                "gdk_surface_set_opaque_region",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gdk_surface_translate_coordinates = Interop.downcallHandle(
                "gdk_surface_translate_coordinates",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gdk_surface_get_type = Interop.downcallHandle(
                "gdk_surface_get_type",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG),
                false
        );
    }
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.gdk_surface_get_type != null;
    }
}
