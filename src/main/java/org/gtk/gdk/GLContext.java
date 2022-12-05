package org.gtk.gdk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@code GdkGLContext} is an object representing a platform-specific
 * OpenGL draw context.
 * <p>
 * {@code GdkGLContext}s are created for a surface using
 * {@link Surface#createGlContext}, and the context will match
 * the characteristics of the surface.
 * <p>
 * A {@code GdkGLContext} is not tied to any particular normal framebuffer.
 * For instance, it cannot draw to the surface back buffer. The GDK
 * repaint system is in full control of the painting to that. Instead,
 * you can create render buffers or textures and use {@link Gdk#cairoDrawFromGl}
 * in the draw function of your widget to draw them. Then GDK will handle
 * the integration of your rendering with that of other widgets.
 * <p>
 * Support for {@code GdkGLContext} is platform-specific and context creation
 * can fail, returning {@code null} context.
 * <p>
 * A {@code GdkGLContext} has to be made "current" in order to start using
 * it, otherwise any OpenGL call will be ignored.
 * <p>
 * <strong>Creating a new OpenGL context</strong><br/>
 * In order to create a new {@code GdkGLContext} instance you need a {@code GdkSurface},
 * which you typically get during the realize call of a widget.
 * <p>
 * A {@code GdkGLContext} is not realized until either {@link GLContext#makeCurrent}
 * or {@link GLContext#realize} is called. It is possible to specify
 * details of the GL context like the OpenGL version to be used, or whether
 * the GL context should have extra state validation enabled after calling
 * {@link Surface#createGlContext} by calling {@link GLContext#realize}.
 * If the realization fails you have the option to change the settings of
 * the {@code GdkGLContext} and try again.
 * <p>
 * <strong>Using a GdkGLContext</strong><br/>
 * You will need to make the {@code GdkGLContext} the current context before issuing
 * OpenGL calls; the system sends OpenGL commands to whichever context is current.
 * It is possible to have multiple contexts, so you always need to ensure that
 * the one which you want to draw with is the current one before issuing commands:
 * <pre>{@code c
 * gdk_gl_context_make_current (context);
 * }</pre>
 * <p>
 * You can now perform your drawing using OpenGL commands.
 * <p>
 * You can check which {@code GdkGLContext} is the current one by using
 * {@link GLContext#getCurrent}; you can also unset any {@code GdkGLContext}
 * that is currently set by calling {@link GLContext#clearCurrent}.
 */
public class GLContext extends org.gtk.gdk.DrawContext {
    
    static {
        Gdk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GdkGLContext";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a GLContext proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public GLContext(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to GLContext if its GType is a (or inherits from) "GdkGLContext".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code GLContext} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GdkGLContext", a ClassCastException will be thrown.
     */
    public static GLContext castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(new org.gtk.gobject.TypeInstance(gobject.handle(), Ownership.NONE), GLContext.getType())) {
            return new GLContext(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GdkGLContext");
        }
    }
    
    /**
     * Gets the allowed APIs set via gdk_gl_context_set_allowed_apis().
     * @return the allowed APIs
     */
    public @NotNull org.gtk.gdk.GLAPI getAllowedApis() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gdk_gl_context_get_allowed_apis.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gdk.GLAPI(RESULT);
    }
    
    /**
     * Gets the API currently in use.
     * <p>
     * If the renderer has not been realized yet, 0 is returned.
     * @return the currently used API
     */
    public @NotNull org.gtk.gdk.GLAPI getApi() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gdk_gl_context_get_api.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gdk.GLAPI(RESULT);
    }
    
    /**
     * Retrieves whether the context is doing extra validations and runtime checking.
     * <p>
     * See {@link GLContext#setDebugEnabled}.
     * @return {@code true} if debugging is enabled
     */
    public boolean getDebugEnabled() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gdk_gl_context_get_debug_enabled.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Retrieves the display the {@code context} is created for
     * @return a {@code GdkDisplay}
     */
    public @Nullable org.gtk.gdk.Display getDisplay() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gdk_gl_context_get_display.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gdk.Display(RESULT, Ownership.NONE);
    }
    
    /**
     * Retrieves whether the context is forward-compatible.
     * <p>
     * See {@link GLContext#setForwardCompatible}.
     * @return {@code true} if the context should be forward-compatible
     */
    public boolean getForwardCompatible() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gdk_gl_context_get_forward_compatible.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Retrieves required OpenGL version set as a requirement for the {@code context}
     * realization. It will not change even if a greater OpenGL version is supported
     * and used after the {@code context} is realized. See
     * {@link GLContext#getVersion} for the real version in use.
     * <p>
     * See {@link GLContext#setRequiredVersion}.
     * @param major return location for the major version to request
     * @param minor return location for the minor version to request
     */
    public void getRequiredVersion(Out<Integer> major, Out<Integer> minor) {
        MemorySegment majorPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        MemorySegment minorPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        try {
            DowncallHandles.gdk_gl_context_get_required_version.invokeExact(
                    handle(),
                    (Addressable) (major == null ? MemoryAddress.NULL : (Addressable) majorPOINTER.address()),
                    (Addressable) (minor == null ? MemoryAddress.NULL : (Addressable) minorPOINTER.address()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (major != null) major.set(majorPOINTER.get(Interop.valueLayout.C_INT, 0));
        if (minor != null) minor.set(minorPOINTER.get(Interop.valueLayout.C_INT, 0));
    }
    
    /**
     * Used to retrieves the {@code GdkGLContext} that this {@code context} share data with.
     * <p>
     * As many contexts can share data now and no single shared context exists
     * anymore, this function has been deprecated and now always returns {@code null}.
     * @return {@code null}
     * @deprecated Use {@link GLContext#isShared} to check if contexts
     *   can be shared.
     */
    @Deprecated
    public @Nullable org.gtk.gdk.GLContext getSharedContext() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gdk_gl_context_get_shared_context.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gdk.GLContext(RESULT, Ownership.NONE);
    }
    
    /**
     * Retrieves the surface used by the {@code context}.
     * @return a {@code GdkSurface}
     */
    public @Nullable org.gtk.gdk.Surface getSurface() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gdk_gl_context_get_surface.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gdk.Surface(RESULT, Ownership.NONE);
    }
    
    /**
     * Checks whether the {@code context} is using an OpenGL or OpenGL ES profile.
     * @return {@code true} if the {@code GdkGLContext} is using an OpenGL ES profile;
     * {@code false} if other profile is in use of if the {@code context} has not yet
     * been realized.
     */
    public boolean getUseEs() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gdk_gl_context_get_use_es.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Retrieves the OpenGL version of the {@code context}.
     * <p>
     * The {@code context} must be realized prior to calling this function.
     * <p>
     * If the {@code context} has never been made current, the version cannot
     * be known and it will return 0 for both {@code major} and {@code minor}.
     * @param major return location for the major version
     * @param minor return location for the minor version
     */
    public void getVersion(Out<Integer> major, Out<Integer> minor) {
        java.util.Objects.requireNonNull(major, "Parameter 'major' must not be null");
        MemorySegment majorPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        java.util.Objects.requireNonNull(minor, "Parameter 'minor' must not be null");
        MemorySegment minorPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        try {
            DowncallHandles.gdk_gl_context_get_version.invokeExact(
                    handle(),
                    (Addressable) majorPOINTER.address(),
                    (Addressable) minorPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        major.set(majorPOINTER.get(Interop.valueLayout.C_INT, 0));
        minor.set(minorPOINTER.get(Interop.valueLayout.C_INT, 0));
    }
    
    /**
     * Whether the {@code GdkGLContext} is in legacy mode or not.
     * <p>
     * The {@code GdkGLContext} must be realized before calling this function.
     * <p>
     * When realizing a GL context, GDK will try to use the OpenGL 3.2 core
     * profile; this profile removes all the OpenGL API that was deprecated
     * prior to the 3.2 version of the specification. If the realization is
     * successful, this function will return {@code false}.
     * <p>
     * If the underlying OpenGL implementation does not support core profiles,
     * GDK will fall back to a pre-3.2 compatibility profile, and this function
     * will return {@code true}.
     * <p>
     * You can use the value returned by this function to decide which kind
     * of OpenGL API to use, or whether to do extension discovery, or what
     * kind of shader programs to load.
     * @return {@code true} if the GL context is in legacy mode
     */
    public boolean isLegacy() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gdk_gl_context_is_legacy.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Checks if the two GL contexts can share resources.
     * <p>
     * When they can, the texture IDs from {@code other} can be used in {@code self}. This
     * is particularly useful when passing {@code GdkGLTexture} objects between
     * different contexts.
     * <p>
     * Contexts created for the same display with the same properties will
     * always be compatible, even if they are created for different surfaces.
     * For other contexts it depends on the GL backend.
     * <p>
     * Both contexts must be realized for this check to succeed. If either one
     * is not, this function will return {@code false}.
     * @param other the {@code GdkGLContext} that should be compatible with {@code self}
     * @return {@code true} if the two GL contexts are compatible.
     */
    public boolean isShared(@NotNull org.gtk.gdk.GLContext other) {
        java.util.Objects.requireNonNull(other, "Parameter 'other' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gdk_gl_context_is_shared.invokeExact(
                    handle(),
                    other.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Makes the {@code context} the current one.
     */
    public void makeCurrent() {
        try {
            DowncallHandles.gdk_gl_context_make_current.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Realizes the given {@code GdkGLContext}.
     * <p>
     * It is safe to call this function on a realized {@code GdkGLContext}.
     * @return {@code true} if the context is realized
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public boolean realize() throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gdk_gl_context_realize.invokeExact(
                    handle(),
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT != 0;
    }
    
    /**
     * Sets the allowed APIs. When gdk_gl_context_realize() is called, only the
     * allowed APIs will be tried. If you set this to 0, realizing will always fail.
     * <p>
     * If you set it on a realized context, the property will not have any effect.
     * It is only relevant during gdk_gl_context_realize().
     * <p>
     * By default, all APIs are allowed.
     * @param apis the allowed APIs
     */
    public void setAllowedApis(@NotNull org.gtk.gdk.GLAPI apis) {
        java.util.Objects.requireNonNull(apis, "Parameter 'apis' must not be null");
        try {
            DowncallHandles.gdk_gl_context_set_allowed_apis.invokeExact(
                    handle(),
                    apis.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets whether the {@code GdkGLContext} should perform extra validations and
     * runtime checking.
     * <p>
     * This is useful during development, but has additional overhead.
     * <p>
     * The {@code GdkGLContext} must not be realized or made current prior to
     * calling this function.
     * @param enabled whether to enable debugging in the context
     */
    public void setDebugEnabled(boolean enabled) {
        try {
            DowncallHandles.gdk_gl_context_set_debug_enabled.invokeExact(
                    handle(),
                    enabled ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets whether the {@code GdkGLContext} should be forward-compatible.
     * <p>
     * Forward-compatible contexts must not support OpenGL functionality that
     * has been marked as deprecated in the requested version; non-forward
     * compatible contexts, on the other hand, must support both deprecated and
     * non deprecated functionality.
     * <p>
     * The {@code GdkGLContext} must not be realized or made current prior to calling
     * this function.
     * @param compatible whether the context should be forward-compatible
     */
    public void setForwardCompatible(boolean compatible) {
        try {
            DowncallHandles.gdk_gl_context_set_forward_compatible.invokeExact(
                    handle(),
                    compatible ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the major and minor version of OpenGL to request.
     * <p>
     * Setting {@code major} and {@code minor} to zero will use the default values.
     * <p>
     * Setting {@code major} and {@code minor} lower than the minimum versions required
     * by GTK will result in the context choosing the minimum version.
     * <p>
     * The {@code context} must not be realized or made current prior to calling
     * this function.
     * @param major the major version to request
     * @param minor the minor version to request
     */
    public void setRequiredVersion(int major, int minor) {
        try {
            DowncallHandles.gdk_gl_context_set_required_version.invokeExact(
                    handle(),
                    major,
                    minor);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Requests that GDK create an OpenGL ES context instead of an OpenGL one.
     * <p>
     * Not all platforms support OpenGL ES.
     * <p>
     * The {@code context} must not have been realized.
     * <p>
     * By default, GDK will attempt to automatically detect whether the
     * underlying GL implementation is OpenGL or OpenGL ES once the {@code context}
     * is realized.
     * <p>
     * You should check the return value of {@link GLContext#getUseEs}
     * after calling {@link GLContext#realize} to decide whether to use
     * the OpenGL or OpenGL ES API, extensions, or shaders.
     * @param useEs whether the context should use OpenGL ES instead of OpenGL,
     *   or -1 to allow auto-detection
     */
    public void setUseEs(int useEs) {
        try {
            DowncallHandles.gdk_gl_context_set_use_es.invokeExact(
                    handle(),
                    useEs);
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
            RESULT = (long) DowncallHandles.gdk_gl_context_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * Clears the current {@code GdkGLContext}.
     * <p>
     * Any OpenGL call after this function returns will be ignored
     * until {@link GLContext#makeCurrent} is called.
     */
    public static void clearCurrent() {
        try {
            DowncallHandles.gdk_gl_context_clear_current.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Retrieves the current {@code GdkGLContext}.
     * @return the current {@code GdkGLContext}
     */
    public static @Nullable org.gtk.gdk.GLContext getCurrent() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gdk_gl_context_get_current.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gdk.GLContext(RESULT, Ownership.NONE);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * GObjects with properties.
     */
    public static class Build extends org.gtk.gdk.DrawContext.Build {
        
         /**
         * A {@link GLContext.Build} object constructs a {@link GLContext} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link GLContext} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link GLContext} using {@link GLContext#castFrom}.
         * @return A new instance of {@code GLContext} with the properties 
         *         that were set in the Build object.
         */
        public GLContext construct() {
            return GLContext.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    GLContext.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
        }
        
        /**
         * The allowed APIs.
         * @param allowedApis The value for the {@code allowed-apis} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setAllowedApis(org.gtk.gdk.GLAPI allowedApis) {
            names.add("allowed-apis");
            values.add(org.gtk.gobject.Value.create(allowedApis));
            return this;
        }
        
        /**
         * The API currently in use.
         * @param api The value for the {@code api} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setApi(org.gtk.gdk.GLAPI api) {
            names.add("api");
            values.add(org.gtk.gobject.Value.create(api));
            return this;
        }
        
        /**
         * Always {@code null}
         * <p>
         * As many contexts can share data now and no single shared context exists
         * anymore, this function has been deprecated and now always returns {@code null}.
         * @param sharedContext The value for the {@code shared-context} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setSharedContext(org.gtk.gdk.GLContext sharedContext) {
            names.add("shared-context");
            values.add(org.gtk.gobject.Value.create(sharedContext));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gdk_gl_context_get_allowed_apis = Interop.downcallHandle(
            "gdk_gl_context_get_allowed_apis",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_gl_context_get_api = Interop.downcallHandle(
            "gdk_gl_context_get_api",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_gl_context_get_debug_enabled = Interop.downcallHandle(
            "gdk_gl_context_get_debug_enabled",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_gl_context_get_display = Interop.downcallHandle(
            "gdk_gl_context_get_display",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_gl_context_get_forward_compatible = Interop.downcallHandle(
            "gdk_gl_context_get_forward_compatible",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_gl_context_get_required_version = Interop.downcallHandle(
            "gdk_gl_context_get_required_version",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_gl_context_get_shared_context = Interop.downcallHandle(
            "gdk_gl_context_get_shared_context",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_gl_context_get_surface = Interop.downcallHandle(
            "gdk_gl_context_get_surface",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_gl_context_get_use_es = Interop.downcallHandle(
            "gdk_gl_context_get_use_es",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_gl_context_get_version = Interop.downcallHandle(
            "gdk_gl_context_get_version",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_gl_context_is_legacy = Interop.downcallHandle(
            "gdk_gl_context_is_legacy",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_gl_context_is_shared = Interop.downcallHandle(
            "gdk_gl_context_is_shared",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_gl_context_make_current = Interop.downcallHandle(
            "gdk_gl_context_make_current",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_gl_context_realize = Interop.downcallHandle(
            "gdk_gl_context_realize",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_gl_context_set_allowed_apis = Interop.downcallHandle(
            "gdk_gl_context_set_allowed_apis",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gdk_gl_context_set_debug_enabled = Interop.downcallHandle(
            "gdk_gl_context_set_debug_enabled",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gdk_gl_context_set_forward_compatible = Interop.downcallHandle(
            "gdk_gl_context_set_forward_compatible",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gdk_gl_context_set_required_version = Interop.downcallHandle(
            "gdk_gl_context_set_required_version",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gdk_gl_context_set_use_es = Interop.downcallHandle(
            "gdk_gl_context_set_use_es",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gdk_gl_context_get_type = Interop.downcallHandle(
            "gdk_gl_context_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle gdk_gl_context_clear_current = Interop.downcallHandle(
            "gdk_gl_context_clear_current",
            FunctionDescriptor.ofVoid(),
            false
        );
        
        private static final MethodHandle gdk_gl_context_get_current = Interop.downcallHandle(
            "gdk_gl_context_get_current",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
            false
        );
    }
}
