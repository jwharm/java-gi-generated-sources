package org.gtk.gdkpixbuf;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * An opaque object representing an iterator which points to a
 * certain position in an animation.
 */
public class PixbufAnimationIter extends org.gtk.gobject.GObject {
    
    static {
        GdkPixbuf.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GdkPixbufAnimationIter";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gtk.gobject.GObject.getMemoryLayout().withName("parent_instance")
        ).withName(C_TYPE_NAME);
    }
    
    /**
     * Create a PixbufAnimationIter proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected PixbufAnimationIter(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, PixbufAnimationIter> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new PixbufAnimationIter(input);
    
    /**
     * Possibly advances an animation to a new frame.
     * <p>
     * Chooses the frame based on the start time passed to
     * gdk_pixbuf_animation_get_iter().
     * <p>
     * {@code current_time} would normally come from g_get_current_time(), and
     * must be greater than or equal to the time passed to
     * gdk_pixbuf_animation_get_iter(), and must increase or remain
     * unchanged each time gdk_pixbuf_animation_iter_get_pixbuf() is
     * called. That is, you can't go backward in time; animations only
     * play forward.
     * <p>
     * As a shortcut, pass {@code NULL} for the current time and g_get_current_time()
     * will be invoked on your behalf. So you only need to explicitly pass
     * {@code current_time} if you're doing something odd like playing the animation
     * at double speed.
     * <p>
     * If this function returns {@code FALSE}, there's no need to update the animation
     * display, assuming the display had been rendered prior to advancing;
     * if {@code TRUE}, you need to call gdk_pixbuf_animation_iter_get_pixbuf()
     * and update the display with the new pixbuf.
     * @param currentTime current time
     * @return {@code TRUE} if the image may need updating
     */
    public boolean advance(@Nullable org.gtk.glib.TimeVal currentTime) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gdk_pixbuf_animation_iter_advance.invokeExact(
                    handle(),
                    (Addressable) (currentTime == null ? MemoryAddress.NULL : currentTime.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Gets the number of milliseconds the current pixbuf should be displayed,
     * or -1 if the current pixbuf should be displayed forever.
     * <p>
     * The {@code g_timeout_add()} function conveniently takes a timeout in milliseconds,
     * so you can use a timeout to schedule the next update.
     * <p>
     * Note that some formats, like GIF, might clamp the timeout values in the
     * image file to avoid updates that are just too quick. The minimum timeout
     * for GIF images is currently 20 milliseconds.
     * @return delay time in milliseconds (thousandths of a second)
     */
    public int getDelayTime() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gdk_pixbuf_animation_iter_get_delay_time.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Gets the current pixbuf which should be displayed.
     * <p>
     * The pixbuf might not be the same size as the animation itself
     * (gdk_pixbuf_animation_get_width(), gdk_pixbuf_animation_get_height()).
     * <p>
     * This pixbuf should be displayed for gdk_pixbuf_animation_iter_get_delay_time()
     * milliseconds.
     * <p>
     * The caller of this function does not own a reference to the returned
     * pixbuf; the returned pixbuf will become invalid when the iterator
     * advances to the next frame, which may happen anytime you call
     * gdk_pixbuf_animation_iter_advance().
     * <p>
     * Copy the pixbuf to keep it (don't just add a reference), as it may get
     * recycled as you advance the iterator.
     * @return the pixbuf to be displayed
     */
    public org.gtk.gdkpixbuf.Pixbuf getPixbuf() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gdk_pixbuf_animation_iter_get_pixbuf.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gdkpixbuf.Pixbuf) Interop.register(RESULT, org.gtk.gdkpixbuf.Pixbuf.fromAddress).marshal(RESULT, null);
    }
    
    /**
     * Used to determine how to respond to the area_updated signal on
     * {@link PixbufLoader} when loading an animation.
     * <p>
     * The {@code ::area_updated} signal is emitted for an area of the frame currently
     * streaming in to the loader. So if you're on the currently loading frame,
     * you will need to redraw the screen for the updated area.
     * @return {@code TRUE} if the frame we're on is partially loaded, or the last frame
     */
    public boolean onCurrentlyLoadingFrame() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gdk_pixbuf_animation_iter_on_currently_loading_frame.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gdk_pixbuf_animation_iter_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * A {@link PixbufAnimationIter.Builder} object constructs a {@link PixbufAnimationIter} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link PixbufAnimationIter.Builder#build()}. 
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
         * Finish building the {@link PixbufAnimationIter} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link PixbufAnimationIter}.
         * @return A new instance of {@code PixbufAnimationIter} with the properties 
         *         that were set in the Builder object.
         */
        public PixbufAnimationIter build() {
            return (PixbufAnimationIter) org.gtk.gobject.GObject.newWithProperties(
                PixbufAnimationIter.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gdk_pixbuf_animation_iter_advance = Interop.downcallHandle(
                "gdk_pixbuf_animation_iter_advance",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gdk_pixbuf_animation_iter_get_delay_time = Interop.downcallHandle(
                "gdk_pixbuf_animation_iter_get_delay_time",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gdk_pixbuf_animation_iter_get_pixbuf = Interop.downcallHandle(
                "gdk_pixbuf_animation_iter_get_pixbuf",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gdk_pixbuf_animation_iter_on_currently_loading_frame = Interop.downcallHandle(
                "gdk_pixbuf_animation_iter_on_currently_loading_frame",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gdk_pixbuf_animation_iter_get_type = Interop.downcallHandle(
                "gdk_pixbuf_animation_iter_get_type",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG),
                false
        );
    }
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.gdk_pixbuf_animation_iter_get_type != null;
    }
}
