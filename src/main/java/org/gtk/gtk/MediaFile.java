package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * {@code GtkMediaFile} implements {@code GtkMediaStream} for files.
 * <p>
 * This provides a simple way to play back video files with GTK.
 * <p>
 * GTK provides a GIO extension point for {@code GtkMediaFile} implementations
 * to allow for external implementations using various media frameworks.
 * <p>
 * GTK itself includes implementations using GStreamer and ffmpeg.
 */
public class MediaFile extends MediaStream implements org.gtk.gdk.Paintable {

    public MediaFile(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to MediaFile */
    public static MediaFile castFrom(org.gtk.gobject.Object gobject) {
        return new MediaFile(gobject.refcounted());
    }
    
    static final MethodHandle gtk_media_file_new = Interop.downcallHandle(
        "gtk_media_file_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNew() {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gtk_media_file_new.invokeExact(), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new empty media file.
     */
    public MediaFile() {
        super(constructNew());
    }
    
    static final MethodHandle gtk_media_file_new_for_file = Interop.downcallHandle(
        "gtk_media_file_new_for_file",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNewForFile(org.gtk.gio.File file) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gtk_media_file_new_for_file.invokeExact(file.handle()), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new media file to play {@code file}.
     */
    public static MediaFile newForFile(org.gtk.gio.File file) {
        return new MediaFile(constructNewForFile(file));
    }
    
    static final MethodHandle gtk_media_file_new_for_filename = Interop.downcallHandle(
        "gtk_media_file_new_for_filename",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNewForFilename(java.lang.String filename) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gtk_media_file_new_for_filename.invokeExact(Interop.allocateNativeString(filename).handle()), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new media file for the given filename.
     * <p>
     * This is a utility function that converts the given {@code filename}
     * to a {@code GFile} and calls {@link MediaFile#newForFile}.
     */
    public static MediaFile newForFilename(java.lang.String filename) {
        return new MediaFile(constructNewForFilename(filename));
    }
    
    static final MethodHandle gtk_media_file_new_for_input_stream = Interop.downcallHandle(
        "gtk_media_file_new_for_input_stream",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNewForInputStream(org.gtk.gio.InputStream stream) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gtk_media_file_new_for_input_stream.invokeExact(stream.handle()), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new media file to play {@code stream}.
     * <p>
     * If you want the resulting media to be seekable,
     * the stream should implement the {@code GSeekable} interface.
     */
    public static MediaFile newForInputStream(org.gtk.gio.InputStream stream) {
        return new MediaFile(constructNewForInputStream(stream));
    }
    
    static final MethodHandle gtk_media_file_new_for_resource = Interop.downcallHandle(
        "gtk_media_file_new_for_resource",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNewForResource(java.lang.String resourcePath) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gtk_media_file_new_for_resource.invokeExact(Interop.allocateNativeString(resourcePath).handle()), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new new media file for the given resource.
     * <p>
     * This is a utility function that converts the given {@code resource}
     * to a {@code GFile} and calls {@link MediaFile#newForFile}.
     */
    public static MediaFile newForResource(java.lang.String resourcePath) {
        return new MediaFile(constructNewForResource(resourcePath));
    }
    
    static final MethodHandle gtk_media_file_clear = Interop.downcallHandle(
        "gtk_media_file_clear",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Resets the media file to be empty.
     */
    public void clear() {
        try {
            gtk_media_file_clear.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_media_file_get_file = Interop.downcallHandle(
        "gtk_media_file_get_file",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the file that {@code self} is currently playing from.
     * <p>
     * When {@code self} is not playing or not playing from a file,
     * {@code null} is returned.
     */
    public org.gtk.gio.File getFile() {
        try {
            var RESULT = (MemoryAddress) gtk_media_file_get_file.invokeExact(handle());
            return new org.gtk.gio.File.FileImpl(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_media_file_get_input_stream = Interop.downcallHandle(
        "gtk_media_file_get_input_stream",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the stream that {@code self} is currently playing from.
     * <p>
     * When {@code self} is not playing or not playing from a stream,
     * {@code null} is returned.
     */
    public org.gtk.gio.InputStream getInputStream() {
        try {
            var RESULT = (MemoryAddress) gtk_media_file_get_input_stream.invokeExact(handle());
            return new org.gtk.gio.InputStream(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_media_file_set_file = Interop.downcallHandle(
        "gtk_media_file_set_file",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the {@code GtkMediaFile} to play the given file.
     * <p>
     * If any file is still playing, stop playing it.
     */
    public void setFile(org.gtk.gio.File file) {
        try {
            gtk_media_file_set_file.invokeExact(handle(), file.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_media_file_set_filename = Interop.downcallHandle(
        "gtk_media_file_set_filename",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the {@code GtkMediaFile to play the given file.
     * 
     * This is a utility function that converts the given @filename
     * to a }GFile` and calls {@link MediaFile#setFile}.
     */
    public void setFilename(java.lang.String filename) {
        try {
            gtk_media_file_set_filename.invokeExact(handle(), Interop.allocateNativeString(filename).handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_media_file_set_input_stream = Interop.downcallHandle(
        "gtk_media_file_set_input_stream",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the {@code GtkMediaFile} to play the given stream.
     * <p>
     * If anything is still playing, stop playing it.
     * <p>
     * Full control about the {@code stream} is assumed for the duration of
     * playback. The stream will not be closed.
     */
    public void setInputStream(org.gtk.gio.InputStream stream) {
        try {
            gtk_media_file_set_input_stream.invokeExact(handle(), stream.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_media_file_set_resource = Interop.downcallHandle(
        "gtk_media_file_set_resource",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the {@code GtkMediaFile to play the given resource.
     * 
     * This is a utility function that converts the given @resource_path
     * to a }GFile` and calls {@link MediaFile#setFile}.
     */
    public void setResource(java.lang.String resourcePath) {
        try {
            gtk_media_file_set_resource.invokeExact(handle(), Interop.allocateNativeString(resourcePath).handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
