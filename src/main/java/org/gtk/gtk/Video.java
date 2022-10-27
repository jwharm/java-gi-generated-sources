package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@code GtkVideo} is a widget to show a {@code GtkMediaStream} with media controls.
 * <p>
 * <img src="./doc-files/video.png" alt="An example GtkVideo">
 * <p>
 * The controls are available separately as {@link MediaControls}.
 * If you just want to display a video without controls, you can treat it
 * like any other paintable and for example put it into a {@link Picture}.
 * <p>
 * {@code GtkVideo} aims to cover use cases such as previews, embedded animations,
 * etc. It supports autoplay, looping, and simple media controls. It does
 * not have support for video overlays, multichannel audio, device
 * selection, or input. If you are writing a full-fledged video player,
 * you may want to use the {@code Gdk.Paintable} API and a media framework
 * such as Gstreamer directly.
 */
public class Video extends org.gtk.gtk.Widget implements org.gtk.gtk.Accessible, org.gtk.gtk.Buildable, org.gtk.gtk.ConstraintTarget {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    public Video(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to Video */
    public static Video castFrom(org.gtk.gobject.Object gobject) {
        return new Video(gobject.refcounted());
    }
    
    private static Refcounted constructNew() {
        Refcounted RESULT;
        try {
            RESULT = Refcounted.get((MemoryAddress) DowncallHandles.gtk_video_new.invokeExact(), false);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new empty {@code GtkVideo}.
     */
    public Video() {
        super(constructNew());
    }
    
    private static Refcounted constructNewForFile(@Nullable org.gtk.gio.File file) {
        java.util.Objects.requireNonNullElse(file, MemoryAddress.NULL);
        Refcounted RESULT;
        try {
            RESULT = Refcounted.get((MemoryAddress) DowncallHandles.gtk_video_new_for_file.invokeExact(file.handle()), false);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a {@code GtkVideo} to play back the given {@code file}.
     * @param file a {@code GFile}
     * @return a new {@code GtkVideo}
     */
    public static Video newForFile(@Nullable org.gtk.gio.File file) {
        return new Video(constructNewForFile(file));
    }
    
    private static Refcounted constructNewForFilename(@Nullable java.lang.String filename) {
        java.util.Objects.requireNonNullElse(filename, MemoryAddress.NULL);
        Refcounted RESULT;
        try {
            RESULT = Refcounted.get((MemoryAddress) DowncallHandles.gtk_video_new_for_filename.invokeExact(Interop.allocateNativeString(filename)), false);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a {@code GtkVideo} to play back the given {@code filename}.
     * <p>
     * This is a utility function that calls {@link Video#newForFile},
     * See that function for details.
     * @param filename filename to play back
     * @return a new {@code GtkVideo}
     */
    public static Video newForFilename(@Nullable java.lang.String filename) {
        return new Video(constructNewForFilename(filename));
    }
    
    private static Refcounted constructNewForMediaStream(@Nullable org.gtk.gtk.MediaStream stream) {
        java.util.Objects.requireNonNullElse(stream, MemoryAddress.NULL);
        Refcounted RESULT;
        try {
            RESULT = Refcounted.get((MemoryAddress) DowncallHandles.gtk_video_new_for_media_stream.invokeExact(stream.handle()), false);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a {@code GtkVideo} to play back the given {@code stream}.
     * @param stream a {@code GtkMediaStream}
     * @return a new {@code GtkVideo}
     */
    public static Video newForMediaStream(@Nullable org.gtk.gtk.MediaStream stream) {
        return new Video(constructNewForMediaStream(stream));
    }
    
    private static Refcounted constructNewForResource(@Nullable java.lang.String resourcePath) {
        java.util.Objects.requireNonNullElse(resourcePath, MemoryAddress.NULL);
        Refcounted RESULT;
        try {
            RESULT = Refcounted.get((MemoryAddress) DowncallHandles.gtk_video_new_for_resource.invokeExact(Interop.allocateNativeString(resourcePath)), false);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a {@code GtkVideo} to play back the resource at the
     * given {@code resource_path}.
     * <p>
     * This is a utility function that calls {@link Video#newForFile}.
     * @param resourcePath resource path to play back
     * @return a new {@code GtkVideo}
     */
    public static Video newForResource(@Nullable java.lang.String resourcePath) {
        return new Video(constructNewForResource(resourcePath));
    }
    
    /**
     * Returns {@code true} if videos have been set to loop.
     * @return {@code true} if streams should autoplay
     */
    public boolean getAutoplay() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_video_get_autoplay.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Gets the file played by {@code self} or {@code null} if not playing back
     * a file.
     * @return The file played by {@code self}
     */
    public @Nullable org.gtk.gio.File getFile() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_video_get_file.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gio.File.FileImpl(Refcounted.get(RESULT, false));
    }
    
    /**
     * Returns {@code true} if videos have been set to loop.
     * @return {@code true} if streams should loop
     */
    public boolean getLoop() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_video_get_loop.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Gets the media stream managed by {@code self} or {@code null} if none.
     * @return The media stream managed by {@code self}
     */
    public @Nullable org.gtk.gtk.MediaStream getMediaStream() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_video_get_media_stream.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.MediaStream(Refcounted.get(RESULT, false));
    }
    
    /**
     * Sets whether {@code self} automatically starts playback when it
     * becomes visible or when a new file gets loaded.
     * @param autoplay whether media streams should autoplay
     */
    public void setAutoplay(boolean autoplay) {
        try {
            DowncallHandles.gtk_video_set_autoplay.invokeExact(handle(), autoplay ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Makes {@code self} play the given {@code file}.
     * @param file the file to play
     */
    public void setFile(@Nullable org.gtk.gio.File file) {
        java.util.Objects.requireNonNullElse(file, MemoryAddress.NULL);
        try {
            DowncallHandles.gtk_video_set_file.invokeExact(handle(), file.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Makes {@code self} play the given {@code filename}.
     * <p>
     * This is a utility function that calls gtk_video_set_file(),
     * @param filename the filename to play
     */
    public void setFilename(@Nullable java.lang.String filename) {
        java.util.Objects.requireNonNullElse(filename, MemoryAddress.NULL);
        try {
            DowncallHandles.gtk_video_set_filename.invokeExact(handle(), Interop.allocateNativeString(filename));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets whether new files loaded by {@code self} should be set to loop.
     * @param loop whether media streams should loop
     */
    public void setLoop(boolean loop) {
        try {
            DowncallHandles.gtk_video_set_loop.invokeExact(handle(), loop ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the media stream to be played back.
     * <p>
     * {@code self} will take full control of managing the media stream. If you
     * want to manage a media stream yourself, consider using a
     * {@link Picture} for display.
     * <p>
     * If you want to display a file, consider using {@link Video#setFile}
     * instead.
     * @param stream The media stream to play or {@code null} to unset
     */
    public void setMediaStream(@Nullable org.gtk.gtk.MediaStream stream) {
        java.util.Objects.requireNonNullElse(stream, MemoryAddress.NULL);
        try {
            DowncallHandles.gtk_video_set_media_stream.invokeExact(handle(), stream.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Makes {@code self} play the resource at the given {@code resource_path}.
     * <p>
     * This is a utility function that calls {@link Video#setFile}.
     * @param resourcePath the resource to set
     */
    public void setResource(@Nullable java.lang.String resourcePath) {
        java.util.Objects.requireNonNullElse(resourcePath, MemoryAddress.NULL);
        try {
            DowncallHandles.gtk_video_set_resource.invokeExact(handle(), Interop.allocateNativeString(resourcePath));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_video_new = Interop.downcallHandle(
            "gtk_video_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_video_new_for_file = Interop.downcallHandle(
            "gtk_video_new_for_file",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_video_new_for_filename = Interop.downcallHandle(
            "gtk_video_new_for_filename",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_video_new_for_media_stream = Interop.downcallHandle(
            "gtk_video_new_for_media_stream",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_video_new_for_resource = Interop.downcallHandle(
            "gtk_video_new_for_resource",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_video_get_autoplay = Interop.downcallHandle(
            "gtk_video_get_autoplay",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_video_get_file = Interop.downcallHandle(
            "gtk_video_get_file",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_video_get_loop = Interop.downcallHandle(
            "gtk_video_get_loop",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_video_get_media_stream = Interop.downcallHandle(
            "gtk_video_get_media_stream",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_video_set_autoplay = Interop.downcallHandle(
            "gtk_video_set_autoplay",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
        
        private static final MethodHandle gtk_video_set_file = Interop.downcallHandle(
            "gtk_video_set_file",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_video_set_filename = Interop.downcallHandle(
            "gtk_video_set_filename",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_video_set_loop = Interop.downcallHandle(
            "gtk_video_set_loop",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
        
        private static final MethodHandle gtk_video_set_media_stream = Interop.downcallHandle(
            "gtk_video_set_media_stream",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_video_set_resource = Interop.downcallHandle(
            "gtk_video_set_resource",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
    }
}
