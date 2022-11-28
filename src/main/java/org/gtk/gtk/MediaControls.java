package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@code GtkMediaControls} is a widget to show controls for a video.
 * <p>
 * <img src="./doc-files/media-controls.png" alt="An example GtkMediaControls">
 * <p>
 * Usually, {@code GtkMediaControls} is used as part of {@link Video}.
 */
public class MediaControls extends org.gtk.gtk.Widget implements org.gtk.gtk.Accessible, org.gtk.gtk.Buildable, org.gtk.gtk.ConstraintTarget {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkMediaControls";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a MediaControls proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public MediaControls(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to MediaControls if its GType is a (or inherits from) "GtkMediaControls".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code MediaControls} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GtkMediaControls", a ClassCastException will be thrown.
     */
    public static MediaControls castFrom(org.gtk.gobject.Object gobject) {
            return new MediaControls(gobject.handle(), gobject.yieldOwnership());
    }
    
    private static Addressable constructNew(@Nullable org.gtk.gtk.MediaStream stream) {
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_media_controls_new.invokeExact(
                    (Addressable) (stream == null ? MemoryAddress.NULL : stream.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@code GtkMediaControls} managing the {@code stream} passed to it.
     * @param stream a {@code GtkMediaStream} to manage
     */
    public MediaControls(@Nullable org.gtk.gtk.MediaStream stream) {
        super(constructNew(stream), Ownership.NONE);
    }
    
    /**
     * Gets the media stream managed by {@code controls} or {@code null} if none.
     * @return The media stream managed by {@code controls}
     */
    public @Nullable org.gtk.gtk.MediaStream getMediaStream() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_media_controls_get_media_stream.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.MediaStream(RESULT, Ownership.NONE);
    }
    
    /**
     * Sets the stream that is controlled by {@code controls}.
     * @param stream a {@code GtkMediaStream}
     */
    public void setMediaStream(@Nullable org.gtk.gtk.MediaStream stream) {
        try {
            DowncallHandles.gtk_media_controls_set_media_stream.invokeExact(
                    handle(),
                    (Addressable) (stream == null ? MemoryAddress.NULL : stream.handle()));
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
            RESULT = (long) DowncallHandles.gtk_media_controls_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * GObjects with properties.
     */
    public static class Build extends org.gtk.gtk.Widget.Build {
        
         /**
         * A {@link MediaControls.Build} object constructs a {@link MediaControls} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link MediaControls} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link MediaControls} using {@link MediaControls#castFrom}.
         * @return A new instance of {@code MediaControls} with the properties 
         *         that were set in the Build object.
         */
        public MediaControls construct() {
            return MediaControls.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    MediaControls.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
        }
        
        /**
         * The media-stream managed by this object or {@code null} if none.
         * @param mediaStream The value for the {@code media-stream} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setMediaStream(org.gtk.gtk.MediaStream mediaStream) {
            names.add("media-stream");
            values.add(org.gtk.gobject.Value.create(mediaStream));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_media_controls_new = Interop.downcallHandle(
            "gtk_media_controls_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_media_controls_get_media_stream = Interop.downcallHandle(
            "gtk_media_controls_get_media_stream",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_media_controls_set_media_stream = Interop.downcallHandle(
            "gtk_media_controls_set_media_stream",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_media_controls_get_type = Interop.downcallHandle(
            "gtk_media_controls_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}
