package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

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
public class MediaFile extends org.gtk.gtk.MediaStream implements org.gtk.gdk.Paintable {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gtk.MediaStream.getMemoryLayout().withName("parent_instance")
    ).withName("GtkMediaFile");
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    public MediaFile(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to MediaFile */
    public static MediaFile castFrom(org.gtk.gobject.Object gobject) {
        return new MediaFile(gobject.refcounted());
    }
    
    private static Refcounted constructNew() {
        Refcounted RESULT;
        try {
            RESULT = Refcounted.get((MemoryAddress) DowncallHandles.gtk_media_file_new.invokeExact(), true);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new empty media file.
     */
    public MediaFile() {
        super(constructNew());
    }
    
    private static Refcounted constructNewForFile(@NotNull org.gtk.gio.File file) {
        java.util.Objects.requireNonNull(file, "Parameter 'file' must not be null");
        Refcounted RESULT;
        try {
            RESULT = Refcounted.get((MemoryAddress) DowncallHandles.gtk_media_file_new_for_file.invokeExact(file.handle()), true);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new media file to play {@code file}.
     * @param file The file to play
     * @return a new {@code GtkMediaFile} playing {@code file}
     */
    public static MediaFile newForFile(@NotNull org.gtk.gio.File file) {
        return new MediaFile(constructNewForFile(file));
    }
    
    private static Refcounted constructNewForFilename(@NotNull java.lang.String filename) {
        java.util.Objects.requireNonNull(filename, "Parameter 'filename' must not be null");
        Refcounted RESULT;
        try {
            RESULT = Refcounted.get((MemoryAddress) DowncallHandles.gtk_media_file_new_for_filename.invokeExact(Interop.allocateNativeString(filename)), true);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new media file for the given filename.
     * <p>
     * This is a utility function that converts the given {@code filename}
     * to a {@code GFile} and calls {@link MediaFile#newForFile}.
     * @param filename filename to open
     * @return a new {@code GtkMediaFile} playing {@code filename}
     */
    public static MediaFile newForFilename(@NotNull java.lang.String filename) {
        return new MediaFile(constructNewForFilename(filename));
    }
    
    private static Refcounted constructNewForInputStream(@NotNull org.gtk.gio.InputStream stream) {
        java.util.Objects.requireNonNull(stream, "Parameter 'stream' must not be null");
        Refcounted RESULT;
        try {
            RESULT = Refcounted.get((MemoryAddress) DowncallHandles.gtk_media_file_new_for_input_stream.invokeExact(stream.handle()), true);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new media file to play {@code stream}.
     * <p>
     * If you want the resulting media to be seekable,
     * the stream should implement the {@code GSeekable} interface.
     * @param stream The stream to play
     * @return a new {@code GtkMediaFile}
     */
    public static MediaFile newForInputStream(@NotNull org.gtk.gio.InputStream stream) {
        return new MediaFile(constructNewForInputStream(stream));
    }
    
    private static Refcounted constructNewForResource(@NotNull java.lang.String resourcePath) {
        java.util.Objects.requireNonNull(resourcePath, "Parameter 'resourcePath' must not be null");
        Refcounted RESULT;
        try {
            RESULT = Refcounted.get((MemoryAddress) DowncallHandles.gtk_media_file_new_for_resource.invokeExact(Interop.allocateNativeString(resourcePath)), true);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new new media file for the given resource.
     * <p>
     * This is a utility function that converts the given {@code resource}
     * to a {@code GFile} and calls {@link MediaFile#newForFile}.
     * @param resourcePath resource path to open
     * @return a new {@code GtkMediaFile} playing {@code resource_path}
     */
    public static MediaFile newForResource(@NotNull java.lang.String resourcePath) {
        return new MediaFile(constructNewForResource(resourcePath));
    }
    
    /**
     * Resets the media file to be empty.
     */
    public void clear() {
        try {
            DowncallHandles.gtk_media_file_clear.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Returns the file that {@code self} is currently playing from.
     * <p>
     * When {@code self} is not playing or not playing from a file,
     * {@code null} is returned.
     * @return The currently playing file
     */
    public @Nullable org.gtk.gio.File getFile() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_media_file_get_file.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gio.File.FileImpl(Refcounted.get(RESULT, false));
    }
    
    /**
     * Returns the stream that {@code self} is currently playing from.
     * <p>
     * When {@code self} is not playing or not playing from a stream,
     * {@code null} is returned.
     * @return The currently playing stream
     */
    public @Nullable org.gtk.gio.InputStream getInputStream() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_media_file_get_input_stream.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gio.InputStream(Refcounted.get(RESULT, false));
    }
    
    /**
     * Sets the {@code GtkMediaFile} to play the given file.
     * <p>
     * If any file is still playing, stop playing it.
     * @param file the file to play
     */
    public void setFile(@Nullable org.gtk.gio.File file) {
        java.util.Objects.requireNonNullElse(file, MemoryAddress.NULL);
        try {
            DowncallHandles.gtk_media_file_set_file.invokeExact(handle(), file.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the {@code GtkMediaFile to play the given file.
     * 
     * This is a utility function that converts the given @filename
     * to a }GFile` and calls {@link MediaFile#setFile}.
     * @param filename name of file to play
     */
    public void setFilename(@Nullable java.lang.String filename) {
        java.util.Objects.requireNonNullElse(filename, MemoryAddress.NULL);
        try {
            DowncallHandles.gtk_media_file_set_filename.invokeExact(handle(), Interop.allocateNativeString(filename));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the {@code GtkMediaFile} to play the given stream.
     * <p>
     * If anything is still playing, stop playing it.
     * <p>
     * Full control about the {@code stream} is assumed for the duration of
     * playback. The stream will not be closed.
     * @param stream the stream to play from
     */
    public void setInputStream(@Nullable org.gtk.gio.InputStream stream) {
        java.util.Objects.requireNonNullElse(stream, MemoryAddress.NULL);
        try {
            DowncallHandles.gtk_media_file_set_input_stream.invokeExact(handle(), stream.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the {@code GtkMediaFile to play the given resource.
     * 
     * This is a utility function that converts the given @resource_path
     * to a }GFile` and calls {@link MediaFile#setFile}.
     * @param resourcePath path to resource to play
     */
    public void setResource(@Nullable java.lang.String resourcePath) {
        java.util.Objects.requireNonNullElse(resourcePath, MemoryAddress.NULL);
        try {
            DowncallHandles.gtk_media_file_set_resource.invokeExact(handle(), Interop.allocateNativeString(resourcePath));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_media_file_new = Interop.downcallHandle(
            "gtk_media_file_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_media_file_new_for_file = Interop.downcallHandle(
            "gtk_media_file_new_for_file",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_media_file_new_for_filename = Interop.downcallHandle(
            "gtk_media_file_new_for_filename",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_media_file_new_for_input_stream = Interop.downcallHandle(
            "gtk_media_file_new_for_input_stream",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_media_file_new_for_resource = Interop.downcallHandle(
            "gtk_media_file_new_for_resource",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_media_file_clear = Interop.downcallHandle(
            "gtk_media_file_clear",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_media_file_get_file = Interop.downcallHandle(
            "gtk_media_file_get_file",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_media_file_get_input_stream = Interop.downcallHandle(
            "gtk_media_file_get_input_stream",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_media_file_set_file = Interop.downcallHandle(
            "gtk_media_file_set_file",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_media_file_set_filename = Interop.downcallHandle(
            "gtk_media_file_set_filename",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_media_file_set_input_stream = Interop.downcallHandle(
            "gtk_media_file_set_input_stream",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_media_file_set_resource = Interop.downcallHandle(
            "gtk_media_file_set_resource",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
    }
}
