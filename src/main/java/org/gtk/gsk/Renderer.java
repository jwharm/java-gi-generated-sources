package org.gtk.gsk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@code GskRenderer} is a class that renders a scene graph defined via a
 * tree of {@link RenderNode} instances.
 * <p>
 * Typically you will use a {@code GskRenderer} instance to repeatedly call
 * {@link Renderer#render} to update the contents of its associated
 * {@link org.gtk.gdk.Surface}.
 * <p>
 * It is necessary to realize a {@code GskRenderer} instance using
 * {@link Renderer#realize} before calling {@link Renderer#render},
 * in order to create the appropriate windowing system resources needed
 * to render the scene.
 */
public class Renderer extends org.gtk.gobject.GObject {
    
    static {
        Gsk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GskRenderer";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a Renderer proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected Renderer(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, Renderer> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new Renderer(input);
    
    private static MemoryAddress constructNewForSurface(org.gtk.gdk.Surface surface) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gsk_renderer_new_for_surface.invokeExact(surface.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
        
    /**
     * Creates an appropriate {@code GskRenderer} instance for the given {@code surface}.
     * <p>
     * If the {@code GSK_RENDERER} environment variable is set, GSK will
     * try that renderer first, before trying the backend-specific
     * default. The ultimate fallback is the cairo renderer.
     * <p>
     * The renderer will be realized before it is returned.
     * @param surface a {@code GdkSurface}
     * @return a {@code GskRenderer}
     */
    public static Renderer newForSurface(org.gtk.gdk.Surface surface) {
        var RESULT = constructNewForSurface(surface);
        var OBJECT = (org.gtk.gsk.Renderer) Interop.register(RESULT, org.gtk.gsk.Renderer.fromAddress).marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * Retrieves the {@code GdkSurface} set using gsk_enderer_realize().
     * <p>
     * If the renderer has not been realized yet, {@code null} will be returned.
     * @return a {@code GdkSurface}
     */
    public @Nullable org.gtk.gdk.Surface getSurface() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gsk_renderer_get_surface.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gdk.Surface) Interop.register(RESULT, org.gtk.gdk.Surface.fromAddress).marshal(RESULT, null);
    }
    
    /**
     * Checks whether the {@code renderer} is realized or not.
     * @return {@code true} if the {@code GskRenderer} was realized, and {@code false} otherwise
     */
    public boolean isRealized() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gsk_renderer_is_realized.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Creates the resources needed by the {@code renderer} to render the scene
     * graph.
     * <p>
     * Since GTK 4.6, the surface may be {@code NULL}, which allows using
     * renderers without having to create a surface.
     * <p>
     * Note that it is mandatory to call {@link Renderer#unrealize} before
     * destroying the renderer.
     * @param surface the {@code GdkSurface} renderer will be used on
     * @return Whether the renderer was successfully realized
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public boolean realize(@Nullable org.gtk.gdk.Surface surface) throws io.github.jwharm.javagi.GErrorException {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.gsk_renderer_realize.invokeExact(
                        handle(),
                        (Addressable) (surface == null ? MemoryAddress.NULL : surface.handle()),
                        (Addressable) GERROR);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
    }
    
    /**
     * Renders the scene graph, described by a tree of {@code GskRenderNode} instances
     * to the renderer's surface,  ensuring that the given {@code region} gets redrawn.
     * <p>
     * If the renderer has no associated surface, this function does nothing.
     * <p>
     * Renderers must ensure that changes of the contents given by the {@code root}
     * node as well as the area given by {@code region} are redrawn. They are however
     * free to not redraw any pixel outside of {@code region} if they can guarantee that
     * it didn't change.
     * <p>
     * The {@code renderer} will acquire a reference on the {@code GskRenderNode} tree while
     * the rendering is in progress.
     * @param root a {@code GskRenderNode}
     * @param region the {@code cairo_region_t} that must be redrawn or {@code null}
     *   for the whole window
     */
    public void render(org.gtk.gsk.RenderNode root, @Nullable org.cairographics.Region region) {
        try {
            DowncallHandles.gsk_renderer_render.invokeExact(
                    handle(),
                    root.handle(),
                    (Addressable) (region == null ? MemoryAddress.NULL : region.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Renders the scene graph, described by a tree of {@code GskRenderNode} instances,
     * to a {@code GdkTexture}.
     * <p>
     * The {@code renderer} will acquire a reference on the {@code GskRenderNode} tree while
     * the rendering is in progress.
     * <p>
     * If you want to apply any transformations to {@code root}, you should put it into a
     * transform node and pass that node instead.
     * @param root a {@code GskRenderNode}
     * @param viewport the section to draw or {@code null} to use {@code root}'s bounds
     * @return a {@code GdkTexture} with the rendered contents of {@code root}.
     */
    public org.gtk.gdk.Texture renderTexture(org.gtk.gsk.RenderNode root, @Nullable org.gtk.graphene.Rect viewport) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gsk_renderer_render_texture.invokeExact(
                    handle(),
                    root.handle(),
                    (Addressable) (viewport == null ? MemoryAddress.NULL : viewport.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = (org.gtk.gdk.Texture) Interop.register(RESULT, org.gtk.gdk.Texture.fromAddress).marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * Releases all the resources created by gsk_renderer_realize().
     */
    public void unrealize() {
        try {
            DowncallHandles.gsk_renderer_unrealize.invokeExact(handle());
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
            RESULT = (long) DowncallHandles.gsk_renderer_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * A {@link Renderer.Builder} object constructs a {@link Renderer} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link Renderer.Builder#build()}. 
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
         * Finish building the {@link Renderer} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link Renderer}.
         * @return A new instance of {@code Renderer} with the properties 
         *         that were set in the Builder object.
         */
        public Renderer build() {
            return (Renderer) org.gtk.gobject.GObject.newWithProperties(
                Renderer.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        /**
         * Whether the renderer has been associated with a surface or draw context.
         * @param realized The value for the {@code realized} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setRealized(boolean realized) {
            names.add("realized");
            values.add(org.gtk.gobject.Value.create(realized));
            return this;
        }
        
        /**
         * The surface associated with renderer.
         * @param surface The value for the {@code surface} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setSurface(org.gtk.gdk.Surface surface) {
            names.add("surface");
            values.add(org.gtk.gobject.Value.create(surface));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gsk_renderer_new_for_surface = Interop.downcallHandle(
                "gsk_renderer_new_for_surface",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gsk_renderer_get_surface = Interop.downcallHandle(
                "gsk_renderer_get_surface",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gsk_renderer_is_realized = Interop.downcallHandle(
                "gsk_renderer_is_realized",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gsk_renderer_realize = Interop.downcallHandle(
                "gsk_renderer_realize",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gsk_renderer_render = Interop.downcallHandle(
                "gsk_renderer_render",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gsk_renderer_render_texture = Interop.downcallHandle(
                "gsk_renderer_render_texture",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gsk_renderer_unrealize = Interop.downcallHandle(
                "gsk_renderer_unrealize",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gsk_renderer_get_type = Interop.downcallHandle(
                "gsk_renderer_get_type",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG),
                false
        );
    }
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.gsk_renderer_get_type != null;
    }
}
