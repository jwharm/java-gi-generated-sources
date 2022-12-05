package org.gtk.gdkpixbuf;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * An opaque struct representing a simple animation.
 */
public class PixbufSimpleAnim extends org.gtk.gdkpixbuf.PixbufAnimation {
    
    static {
        GdkPixbuf.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GdkPixbufSimpleAnim";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a PixbufSimpleAnim proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public PixbufSimpleAnim(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to PixbufSimpleAnim if its GType is a (or inherits from) "GdkPixbufSimpleAnim".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code PixbufSimpleAnim} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GdkPixbufSimpleAnim", a ClassCastException will be thrown.
     */
    public static PixbufSimpleAnim castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(new org.gtk.gobject.TypeInstance(gobject.handle(), Ownership.NONE), PixbufSimpleAnim.getType())) {
            return new PixbufSimpleAnim(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GdkPixbufSimpleAnim");
        }
    }
    
    private static Addressable constructNew(int width, int height, float rate) {
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gdk_pixbuf_simple_anim_new.invokeExact(
                    width,
                    height,
                    rate);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new, empty animation.
     * @param width the width of the animation
     * @param height the height of the animation
     * @param rate the speed of the animation, in frames per second
     */
    public PixbufSimpleAnim(int width, int height, float rate) {
        super(constructNew(width, height, rate), Ownership.FULL);
    }
    
    /**
     * Adds a new frame to {@code animation}. The {@code pixbuf} must
     * have the dimensions specified when the animation
     * was constructed.
     * @param pixbuf the pixbuf to add
     */
    public void addFrame(@NotNull org.gtk.gdkpixbuf.Pixbuf pixbuf) {
        java.util.Objects.requireNonNull(pixbuf, "Parameter 'pixbuf' must not be null");
        try {
            DowncallHandles.gdk_pixbuf_simple_anim_add_frame.invokeExact(
                    handle(),
                    pixbuf.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Gets whether {@code animation} should loop indefinitely when it reaches the end.
     * @return {@code true} if the animation loops forever, {@code false} otherwise
     */
    public boolean getLoop() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gdk_pixbuf_simple_anim_get_loop.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Sets whether {@code animation} should loop indefinitely when it reaches the end.
     * @param loop whether to loop the animation
     */
    public void setLoop(boolean loop) {
        try {
            DowncallHandles.gdk_pixbuf_simple_anim_set_loop.invokeExact(
                    handle(),
                    loop ? 1 : 0);
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
            RESULT = (long) DowncallHandles.gdk_pixbuf_simple_anim_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * GObjects with properties.
     */
    public static class Build extends org.gtk.gdkpixbuf.PixbufAnimation.Build {
        
         /**
         * A {@link PixbufSimpleAnim.Build} object constructs a {@link PixbufSimpleAnim} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link PixbufSimpleAnim} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link PixbufSimpleAnim} using {@link PixbufSimpleAnim#castFrom}.
         * @return A new instance of {@code PixbufSimpleAnim} with the properties 
         *         that were set in the Build object.
         */
        public PixbufSimpleAnim construct() {
            return PixbufSimpleAnim.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    PixbufSimpleAnim.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
        }
        
        /**
         * Whether the animation should loop when it reaches the end.
         * @param loop The value for the {@code loop} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setLoop(boolean loop) {
            names.add("loop");
            values.add(org.gtk.gobject.Value.create(loop));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gdk_pixbuf_simple_anim_new = Interop.downcallHandle(
            "gdk_pixbuf_simple_anim_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_FLOAT),
            false
        );
        
        private static final MethodHandle gdk_pixbuf_simple_anim_add_frame = Interop.downcallHandle(
            "gdk_pixbuf_simple_anim_add_frame",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_pixbuf_simple_anim_get_loop = Interop.downcallHandle(
            "gdk_pixbuf_simple_anim_get_loop",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_pixbuf_simple_anim_set_loop = Interop.downcallHandle(
            "gdk_pixbuf_simple_anim_set_loop",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gdk_pixbuf_simple_anim_get_type = Interop.downcallHandle(
            "gdk_pixbuf_simple_anim_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}
