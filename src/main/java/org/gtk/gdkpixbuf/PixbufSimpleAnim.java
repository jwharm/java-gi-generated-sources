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
    protected PixbufSimpleAnim(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, PixbufSimpleAnim> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new PixbufSimpleAnim(input, ownership);
    
    private static MemoryAddress constructNew(int width, int height, float rate) {
        MemoryAddress RESULT;
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
    public void addFrame(org.gtk.gdkpixbuf.Pixbuf pixbuf) {
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
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Sets whether {@code animation} should loop indefinitely when it reaches the end.
     * @param loop whether to loop the animation
     */
    public void setLoop(boolean loop) {
        try {
            DowncallHandles.gdk_pixbuf_simple_anim_set_loop.invokeExact(
                    handle(),
                    Marshal.booleanToInteger.marshal(loop, null).intValue());
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
            RESULT = (long) DowncallHandles.gdk_pixbuf_simple_anim_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * A {@link PixbufSimpleAnim.Builder} object constructs a {@link PixbufSimpleAnim} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link PixbufSimpleAnim.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gtk.gdkpixbuf.PixbufAnimation.Builder {
        
        protected Builder() {
        }
        
        /**
         * Finish building the {@link PixbufSimpleAnim} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link PixbufSimpleAnim}.
         * @return A new instance of {@code PixbufSimpleAnim} with the properties 
         *         that were set in the Builder object.
         */
        public PixbufSimpleAnim build() {
            return (PixbufSimpleAnim) org.gtk.gobject.GObject.newWithProperties(
                PixbufSimpleAnim.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        /**
         * Whether the animation should loop when it reaches the end.
         * @param loop The value for the {@code loop} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setLoop(boolean loop) {
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
