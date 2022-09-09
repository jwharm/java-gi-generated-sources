package org.gtk.gdk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A `GdkSurface` is a rectangular region on the screen.
 * 
 * It’s a low-level object, used to implement high-level objects
 * such as [class@Gtk.Window] or [class@Gtk.Dialog] in GTK.
 * 
 * The surfaces you see in practice are either [iface@Gdk.Toplevel] or
 * [iface@Gdk.Popup], and those interfaces provide much of the required
 * API to interact with these surfaces. Other, more specialized surface
 * types exist, but you will rarely interact with them directly.
 */
public class Surface extends org.gtk.gobject.Object {

    public Surface(io.github.jwharm.javagi.interop.Reference reference) {
        super(reference);
    }
    
    /** Cast object to Surface */
    public static Surface castFrom(org.gtk.gobject.Object gobject) {
        return new Surface(gobject.getReference());
    }
    
    /**
     * Create a new popup surface.
     * 
     * The surface will be attached to @parent and can be positioned
     * relative to it using [method@Gdk.Popup.present].
     */
    public static Surface newPopup(Surface parent, boolean autohide) {
        return new Surface(References.get(gtk_h.gdk_surface_new_popup(parent.handle(), autohide ? 1 : 0), true));
    }
    
    /**
     * Creates a new toplevel surface.
     */
    public static Surface newToplevel(Display display) {
        return new Surface(References.get(gtk_h.gdk_surface_new_toplevel(display.handle()), true));
    }
    
    /**
     * Emits a short beep associated to @surface.
     * 
     * If the display of @surface does not support per-surface beeps,
     * emits a short beep on the display just as [method@Gdk.Display.beep].
     */
    public void beep() {
        gtk_h.gdk_surface_beep(handle());
    }
    
    /**
     * Creates a new `GdkCairoContext` for rendering on @surface.
     */
    public CairoContext createCairoContext() {
        var RESULT = gtk_h.gdk_surface_create_cairo_context(handle());
        return new CairoContext(References.get(RESULT, true));
    }
    
    /**
     * Creates a new `GdkGLContext` for the `GdkSurface`.
     * 
     * The context is disconnected from any particular surface or surface.
     * If the creation of the `GdkGLContext` failed, @error will be set.
     * Before using the returned `GdkGLContext`, you will need to
     * call [method@Gdk.GLContext.make_current] or [method@Gdk.GLContext.realize].
     */
    public GLContext createGlContext() throws io.github.jwharm.javagi.interop.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.gdk_surface_create_gl_context(handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new GLContext(References.get(RESULT, true));
    }
    
    /**
     * Create a new Cairo surface that is as compatible as possible with the
     * given @surface.
     * 
     * For example the new surface will have the same fallback resolution
     * and font options as @surface. Generally, the new surface will also
     * use the same backend as @surface, unless that is not possible for
     * some reason. The type of the returned surface may be examined with
     * cairo_surface_get_type().
     * 
     * Initially the surface contents are all 0 (transparent if contents
     * have transparency, black otherwise.)
     * 
     * This function always returns a valid pointer, but it will return a
     * pointer to a “nil” surface if @other is already in an error state
     * or any other error occurs.
     */
    public org.cairographics.Surface createSimilarSurface(org.cairographics.Content content, int width, int height) {
        var RESULT = gtk_h.gdk_surface_create_similar_surface(handle(), content.getValue(), width, height);
        return new org.cairographics.Surface(References.get(RESULT, true));
    }
    
    /**
     * Creates a new `GdkVulkanContext` for rendering on @surface.
     * 
     * If the creation of the `GdkVulkanContext` failed, @error will be set.
     */
    public VulkanContext createVulkanContext() throws io.github.jwharm.javagi.interop.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.gdk_surface_create_vulkan_context(handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new VulkanContext(References.get(RESULT, true));
    }
    
    /**
     * Destroys the window system resources associated with @surface and
     * decrements @surface's reference count.
     * 
     * The window system resources for all children of @surface are also
     * destroyed, but the children’s reference counts are not decremented.
     * 
     * Note that a surface will not be destroyed automatically when its
     * reference count reaches zero. You must call this function yourself
     * before that happens.
     */
    public void destroy() {
        gtk_h.gdk_surface_destroy(handle());
    }
    
    /**
     * Retrieves a `GdkCursor` pointer for the cursor currently set on the
     * `GdkSurface`.
     * 
     * If the return value is %NULL then there is no custom cursor set on
     * the surface, and it is using the cursor for its parent surface.
     * 
     * Use [method@Gdk.Surface.set_cursor] to unset the cursor of the surface.
     */
    public Cursor getCursor() {
        var RESULT = gtk_h.gdk_surface_get_cursor(handle());
        return new Cursor(References.get(RESULT, false));
    }
    
    /**
     * Retrieves a `GdkCursor` pointer for the @device currently set on the
     * specified `GdkSurface`.
     * 
     * If the return value is %NULL then there is no custom cursor set on the
     * specified surface, and it is using the cursor for its parent surface.
     * 
     * Use [method@Gdk.Surface.set_cursor] to unset the cursor of the surface.
     */
    public Cursor getDeviceCursor(Device device) {
        var RESULT = gtk_h.gdk_surface_get_device_cursor(handle(), device.handle());
        return new Cursor(References.get(RESULT, false));
    }
    
    /**
     * Gets the `GdkDisplay` associated with a `GdkSurface`.
     */
    public Display getDisplay() {
        var RESULT = gtk_h.gdk_surface_get_display(handle());
        return new Display(References.get(RESULT, false));
    }
    
    /**
     * Gets the frame clock for the surface.
     * 
     * The frame clock for a surface never changes unless the surface is
     * reparented to a new toplevel surface.
     */
    public FrameClock getFrameClock() {
        var RESULT = gtk_h.gdk_surface_get_frame_clock(handle());
        return new FrameClock(References.get(RESULT, false));
    }
    
    /**
     * Returns the height of the given @surface.
     * 
     * Surface size is reported in ”application pixels”, not
     * ”device pixels” (see [method@Gdk.Surface.get_scale_factor]).
     */
    public int getHeight() {
        var RESULT = gtk_h.gdk_surface_get_height(handle());
        return RESULT;
    }
    
    /**
     * Checks whether the surface has been mapped.
     * 
     * A surface is mapped with [method@Gdk.Toplevel.present]
     * or [method@Gdk.Popup.present].
     */
    public boolean getMapped() {
        var RESULT = gtk_h.gdk_surface_get_mapped(handle());
        return (RESULT != 0);
    }
    
    /**
     * Returns the internal scale factor that maps from surface coordinates
     * to the actual device pixels.
     * 
     * On traditional systems this is 1, but on very high density outputs
     * this can be a higher value (often 2). A higher value means that drawing
     * is automatically scaled up to a higher resolution, so any code doing
     * drawing will automatically look nicer. However, if you are supplying
     * pixel-based data the scale value can be used to determine whether to
     * use a pixel resource with higher resolution data.
     * 
     * The scale of a surface may change during runtime.
     */
    public int getScaleFactor() {
        var RESULT = gtk_h.gdk_surface_get_scale_factor(handle());
        return RESULT;
    }
    
    /**
     * Returns the width of the given @surface.
     * 
     * Surface size is reported in ”application pixels”, not
     * ”device pixels” (see [method@Gdk.Surface.get_scale_factor]).
     */
    public int getWidth() {
        var RESULT = gtk_h.gdk_surface_get_width(handle());
        return RESULT;
    }
    
    /**
     * Hide the surface.
     * 
     * For toplevel surfaces, withdraws them, so they will no longer be
     * known to the window manager; for all surfaces, unmaps them, so
     * they won’t be displayed. Normally done automatically as
     * part of [method@Gtk.Widget.hide].
     */
    public void hide() {
        gtk_h.gdk_surface_hide(handle());
    }
    
    /**
     * Check to see if a surface is destroyed.
     */
    public boolean isDestroyed() {
        var RESULT = gtk_h.gdk_surface_is_destroyed(handle());
        return (RESULT != 0);
    }
    
    /**
     * Forces a [signal@Gdk.Surface::render] signal emission for @surface
     * to be scheduled.
     * 
     * This function is useful for implementations that track invalid
     * regions on their own.
     */
    public void queueRender() {
        gtk_h.gdk_surface_queue_render(handle());
    }
    
    /**
     * Request a layout phase from the surface's frame clock.
     * 
     * See [method@Gdk.FrameClock.request_phase].
     */
    public void requestLayout() {
        gtk_h.gdk_surface_request_layout(handle());
    }
    
    /**
     * Sets the default mouse pointer for a `GdkSurface`.
     * 
     * Passing %NULL for the @cursor argument means that @surface will use
     * the cursor of its parent surface. Most surfaces should use this default.
     * Note that @cursor must be for the same display as @surface.
     * 
     * Use [ctor@Gdk.Cursor.new_from_name] or [ctor@Gdk.Cursor.new_from_texture]
     * to create the cursor. To make the cursor invisible, use %GDK_BLANK_CURSOR.
     */
    public void setCursor(Cursor cursor) {
        gtk_h.gdk_surface_set_cursor(handle(), cursor.handle());
    }
    
    /**
     * Sets a specific `GdkCursor` for a given device when it gets inside @surface.
     * 
     * Passing %NULL for the @cursor argument means that @surface will use the
     * cursor of its parent surface. Most surfaces should use this default.
     * 
     * Use [ctor@Gdk.Cursor.new_from_name] or [ctor@Gdk.Cursor.new_from_texture]
     * to create the cursor. To make the cursor invisible, use %GDK_BLANK_CURSOR.
     */
    public void setDeviceCursor(Device device, Cursor cursor) {
        gtk_h.gdk_surface_set_device_cursor(handle(), device.handle(), cursor.handle());
    }
    
    /**
     * Apply the region to the surface for the purpose of event
     * handling.
     * 
     * Mouse events which happen while the pointer position corresponds
     * to an unset bit in the mask will be passed on the surface below
     * @surface.
     * 
     * An input region is typically used with RGBA surfaces. The alpha
     * channel of the surface defines which pixels are invisible and
     * allows for nicely antialiased borders, and the input region
     * controls where the surface is “clickable”.
     * 
     * Use [method@Gdk.Display.supports_input_shapes] to find out if
     * a particular backend supports input regions.
     */
    public void setInputRegion(org.cairographics.Region region) {
        gtk_h.gdk_surface_set_input_region(handle(), region.handle());
    }
    
    /**
     * Marks a region of the `GdkSurface` as opaque.
     * 
     * For optimisation purposes, compositing window managers may
     * like to not draw obscured regions of surfaces, or turn off blending
     * during for these regions. With RGB windows with no transparency,
     * this is just the shape of the window, but with ARGB32 windows, the
     * compositor does not know what regions of the window are transparent
     * or not.
     * 
     * This function only works for toplevel surfaces.
     * 
     * GTK will update this property automatically if the @surface background
     * is opaque, as we know where the opaque regions are. If your surface
     * background is not opaque, please update this property in your
     * [vfunc@Gtk.Widget.css_changed] handler.
     */
    public void setOpaqueRegion(org.cairographics.Region region) {
        gtk_h.gdk_surface_set_opaque_region(handle(), region.handle());
    }
    
    @FunctionalInterface
    public interface EnterMonitorHandler {
        void signalReceived(Surface source, Monitor monitor);
    }
    
    /**
     * Emitted when @surface starts being present on the monitor.
     */
    public void onEnterMonitor(EnterMonitorHandler handler) {
        try {
            int hash = handler.hashCode();
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalSurfaceEnterMonitor", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            gtk_h.g_signal_connect_data(this.handle(), Interop.allocateNativeString("enter-monitor").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface EventHandler {
        boolean signalReceived(Surface source, Event event);
    }
    
    /**
     * Emitted when GDK receives an input event for @surface.
     */
    public void onEvent(EventHandler handler) {
        try {
            int hash = handler.hashCode();
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(boolean.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalSurfaceEvent", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            gtk_h.g_signal_connect_data(this.handle(), Interop.allocateNativeString("event").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface LayoutHandler {
        void signalReceived(Surface source, int width, int height);
    }
    
    /**
     * Emitted when the size of @surface is changed, or when relayout should
     * be performed.
     * 
     * Surface size is reported in ”application pixels”, not
     * ”device pixels” (see gdk_surface_get_scale_factor()).
     */
    public void onLayout(LayoutHandler handler) {
        try {
            int hash = handler.hashCode();
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, int.class, int.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalSurfaceLayout", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            gtk_h.g_signal_connect_data(this.handle(), Interop.allocateNativeString("layout").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface LeaveMonitorHandler {
        void signalReceived(Surface source, Monitor monitor);
    }
    
    /**
     * Emitted when @surface stops being present on the monitor.
     */
    public void onLeaveMonitor(LeaveMonitorHandler handler) {
        try {
            int hash = handler.hashCode();
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalSurfaceLeaveMonitor", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            gtk_h.g_signal_connect_data(this.handle(), Interop.allocateNativeString("leave-monitor").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface RenderHandler {
        boolean signalReceived(Surface source, org.cairographics.Region region);
    }
    
    /**
     * Emitted when part of the surface needs to be redrawn.
     */
    public void onRender(RenderHandler handler) {
        try {
            int hash = handler.hashCode();
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(boolean.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalSurfaceRender", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            gtk_h.g_signal_connect_data(this.handle(), Interop.allocateNativeString("render").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
}
