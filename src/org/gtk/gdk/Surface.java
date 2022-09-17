package org.gtk.gdk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A <code>GdkSurface</code> is a rectangular region on the screen.
 * 
 * It&#8217;s a low-level object, used to implement high-level objects
 * such as {@link org.gtk.gtk.Window} or {@link org.gtk.gtk.Dialog} in GTK.
 * 
 * The surfaces you see in practice are either {@link [iface@Gdk.Toplevel] (ref=iface)} or
 * {@link [iface@Gdk.Popup] (ref=iface)}, and those interfaces provide much of the required
 * API to interact with these surfaces. Other, more specialized surface
 * types exist, but you will rarely interact with them directly.
 */
public class Surface extends org.gtk.gobject.Object {

    public Surface(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to Surface */
    public static Surface castFrom(org.gtk.gobject.Object gobject) {
        return new Surface(gobject.getReference());
    }
    
    private static Reference constructNewPopup(Surface parent, boolean autohide) {
        Reference RESULT = References.get(gtk_h.gdk_surface_new_popup(parent.handle(), autohide ? 1 : 0), true);
        return RESULT;
    }
    
    /**
     * Create a new popup surface.
     * 
     * The surface will be attached to @parent and can be positioned
     * relative to it using {@link org.gtk.gdk.Popup#present}.
     */
    public static Surface newPopup(Surface parent, boolean autohide) {
        return new Surface(constructNewPopup(parent, autohide));
    }
    
    private static Reference constructNewToplevel(Display display) {
        Reference RESULT = References.get(gtk_h.gdk_surface_new_toplevel(display.handle()), true);
        return RESULT;
    }
    
    /**
     * Creates a new toplevel surface.
     */
    public static Surface newToplevel(Display display) {
        return new Surface(constructNewToplevel(display));
    }
    
    /**
     * Emits a short beep associated to @surface.
     * 
     * If the display of @surface does not support per-surface beeps,
     * emits a short beep on the display just as {@link org.gtk.gdk.Display#beep}.
     */
    public void beep() {
        gtk_h.gdk_surface_beep(handle());
    }
    
    /**
     * Creates a new <code>GdkCairoContext</code> for rendering on @surface.
     */
    public CairoContext createCairoContext() {
        var RESULT = gtk_h.gdk_surface_create_cairo_context(handle());
        return new CairoContext(References.get(RESULT, true));
    }
    
    /**
     * Creates a new <code>GdkGLContext</code> for the <code>GdkSurface</code>.
     * <p>
     * The context is disconnected from any particular surface or surface.
     * If the creation of the <code>GdkGLContext</code> failed, @error will be set.
     * Before using the returned <code>GdkGLContext</code>, you will need to
     * call {@link org.gtk.gdk.GLContext#makeCurrent} or {@link org.gtk.gdk.GLContext#realize}.
     */
    public GLContext createGlContext() throws io.github.jwharm.javagi.GErrorException {
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
     * pointer to a &#8220;nil&#8221; surface if @other is already in an error state
     * or any other error occurs.
     */
    public org.cairographics.Surface createSimilarSurface(org.cairographics.Content content, int width, int height) {
        var RESULT = gtk_h.gdk_surface_create_similar_surface(handle(), content.getValue(), width, height);
        return new org.cairographics.Surface(References.get(RESULT, true));
    }
    
    /**
     * Creates a new <code>GdkVulkanContext</code> for rendering on @surface.
     * <p>
     * If the creation of the <code>GdkVulkanContext</code> failed, @error will be set.
     */
    public VulkanContext createVulkanContext() throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.gdk_surface_create_vulkan_context(handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new VulkanContext(References.get(RESULT, true));
    }
    
    /**
     * Destroys the window system resources associated with @surface and
     * decrements @surface&#39;s reference count.
     * 
     * The window system resources for all children of @surface are also
     * destroyed, but the children&#8217;s reference counts are not decremented.
     * 
     * Note that a surface will not be destroyed automatically when its
     * reference count reaches zero. You must call this function yourself
     * before that happens.
     */
    public void destroy() {
        gtk_h.gdk_surface_destroy(handle());
    }
    
    /**
     * Retrieves a <code>GdkCursor</code> pointer for the cursor currently set on the<code>GdkSurface</code>.
     * 
     * If the return value is <code>null</code> then there is no custom cursor set on
     * the surface, and it is using the cursor for its parent surface.
     * 
     * Use {@link org.gtk.gdk.Surface#setCursor} to unset the cursor of the surface.
     */
    public Cursor getCursor() {
        var RESULT = gtk_h.gdk_surface_get_cursor(handle());
        return new Cursor(References.get(RESULT, false));
    }
    
    /**
     * Retrieves a <code>GdkCursor</code> pointer for the @device currently set on the
     * specified <code>GdkSurface</code>.
     * 
     * If the return value is <code>null</code> then there is no custom cursor set on the
     * specified surface, and it is using the cursor for its parent surface.
     * 
     * Use {@link org.gtk.gdk.Surface#setCursor} to unset the cursor of the surface.
     */
    public Cursor getDeviceCursor(Device device) {
        var RESULT = gtk_h.gdk_surface_get_device_cursor(handle(), device.handle());
        return new Cursor(References.get(RESULT, false));
    }
    
    /**
     * Gets the <code>GdkDisplay</code> associated with a <code>GdkSurface</code>.
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
     * Surface size is reported in &#8221;application pixels&#8221;, not
     * &#8221;device pixels&#8221; (see {@link org.gtk.gdk.Surface#getScaleFactor}).
     */
    public int getHeight() {
        var RESULT = gtk_h.gdk_surface_get_height(handle());
        return RESULT;
    }
    
    /**
     * Checks whether the surface has been mapped.
     * 
     * A surface is mapped with {@link org.gtk.gdk.Toplevel#present}
     * or {@link org.gtk.gdk.Popup#present}.
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
     * Surface size is reported in &#8221;application pixels&#8221;, not
     * &#8221;device pixels&#8221; (see {@link org.gtk.gdk.Surface#getScaleFactor}).
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
     * they won&#8217;t be displayed. Normally done automatically as
     * part of {@link org.gtk.gtk.Widget#hide}.
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
     * Forces a {@link [signal@Gdk.Surface::render] (ref=signal)} signal emission for @surface
     * to be scheduled.
     * 
     * This function is useful for implementations that track invalid
     * regions on their own.
     */
    public void queueRender() {
        gtk_h.gdk_surface_queue_render(handle());
    }
    
    /**
     * Request a layout phase from the surface&#39;s frame clock.
     * 
     * See {@link org.gtk.gdk.FrameClock#requestPhase}.
     */
    public void requestLayout() {
        gtk_h.gdk_surface_request_layout(handle());
    }
    
    /**
     * Sets the default mouse pointer for a <code>GdkSurface</code>.
     * 
     * Passing <code>null</code> for the @cursor argument means that @surface will use
     * the cursor of its parent surface. Most surfaces should use this default.
     * Note that @cursor must be for the same display as @surface.
     * 
     * Use {@link [ctor@Gdk.Cursor.new_from_name] (ref=ctor)} or {@link [ctor@Gdk.Cursor.new_from_texture] (ref=ctor)}
     * to create the cursor. To make the cursor invisible, use for the @cursor argument means that @surface will use
     * the cursor of its parent surface. Most surfaces should use this default.
     * Note that @cursor must be for the same display as @surface.
     * 
     * Use {@link [ctor@Gdk.Cursor.new_from_name] (ref=ctor)} or {@link [ctor@Gdk.Cursor.new_from_texture] (ref=ctor)}
     * to create the cursor. To make the cursor invisible, use %GDK_BLANK_CURSOR.
     */
    public void setCursor(Cursor cursor) {
        gtk_h.gdk_surface_set_cursor(handle(), cursor.handle());
    }
    
    /**
     * Sets a specific <code>GdkCursor</code> for a given device when it gets inside @surface.
     * 
     * Passing <code>null</code> for the @cursor argument means that @surface will use the
     * cursor of its parent surface. Most surfaces should use this default.
     * 
     * Use {@link [ctor@Gdk.Cursor.new_from_name] (ref=ctor)} or {@link [ctor@Gdk.Cursor.new_from_texture] (ref=ctor)}
     * to create the cursor. To make the cursor invisible, use for the @cursor argument means that @surface will use the
     * cursor of its parent surface. Most surfaces should use this default.
     * 
     * Use {@link [ctor@Gdk.Cursor.new_from_name] (ref=ctor)} or {@link [ctor@Gdk.Cursor.new_from_texture] (ref=ctor)}
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
     * controls where the surface is &#8220;clickable&#8221;.
     * 
     * Use {@link org.gtk.gdk.Display#supportsInputShapes} to find out if
     * a particular backend supports input regions.
     */
    public void setInputRegion(org.cairographics.Region region) {
        gtk_h.gdk_surface_set_input_region(handle(), region.handle());
    }
    
    /**
     * Marks a region of the <code>GdkSurface</code> as opaque.
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
     * {@link org.gtk.gtk.Widget#cssChanged} handler.
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
    public SignalHandle onEnterMonitor(EnterMonitorHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalSurfaceEnterMonitor", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("enter-monitor").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
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
    public SignalHandle onEvent(EventHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(boolean.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalSurfaceEvent", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("event").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
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
     * Surface size is reported in &#8221;application pixels&#8221;, not
     * &#8221;device pixels&#8221; (see gdk_surface_get_scale_factor()).
     */
    public SignalHandle onLayout(LayoutHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, int.class, int.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalSurfaceLayout", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("layout").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
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
    public SignalHandle onLeaveMonitor(LeaveMonitorHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalSurfaceLeaveMonitor", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("leave-monitor").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
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
    public SignalHandle onRender(RenderHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(boolean.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalSurfaceRender", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("render").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
}
