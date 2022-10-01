package org.gtk.gtk;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
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
    
    private static Refcounted constructNew() {
        Refcounted RESULT = Refcounted.get(gtk_h.gtk_media_file_new(), true);
        return RESULT;
    }
    
    /**
     * Creates a new empty media file.
     */
    public MediaFile() {
        super(constructNew());
    }
    
    private static Refcounted constructNewForFile(org.gtk.gio.File file) {
        Refcounted RESULT = Refcounted.get(gtk_h.gtk_media_file_new_for_file(file.handle()), true);
        return RESULT;
    }
    
    /**
     * Creates a new media file to play {@code file}.
     */
    public static MediaFile newForFile(org.gtk.gio.File file) {
        return new MediaFile(constructNewForFile(file));
    }
    
    private static Refcounted constructNewForFilename(java.lang.String filename) {
        Refcounted RESULT = Refcounted.get(gtk_h.gtk_media_file_new_for_filename(Interop.allocateNativeString(filename).handle()), true);
        return RESULT;
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
    
    private static Refcounted constructNewForInputStream(org.gtk.gio.InputStream stream) {
        Refcounted RESULT = Refcounted.get(gtk_h.gtk_media_file_new_for_input_stream(stream.handle()), true);
        return RESULT;
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
    
    private static Refcounted constructNewForResource(java.lang.String resourcePath) {
        Refcounted RESULT = Refcounted.get(gtk_h.gtk_media_file_new_for_resource(Interop.allocateNativeString(resourcePath).handle()), true);
        return RESULT;
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
    
    /**
     * Resets the media file to be empty.
     */
    public void clear() {
        gtk_h.gtk_media_file_clear(handle());
    }
    
    /**
     * Returns the file that {@code self} is currently playing from.
     * <p>
     * When {@code self} is not playing or not playing from a file,
     * {@code null} is returned.
     */
    public org.gtk.gio.File getFile() {
        var RESULT = gtk_h.gtk_media_file_get_file(handle());
        return new org.gtk.gio.File.FileImpl(Refcounted.get(RESULT, false));
    }
    
    /**
     * Returns the stream that {@code self} is currently playing from.
     * <p>
     * When {@code self} is not playing or not playing from a stream,
     * {@code null} is returned.
     */
    public org.gtk.gio.InputStream getInputStream() {
        var RESULT = gtk_h.gtk_media_file_get_input_stream(handle());
        return new org.gtk.gio.InputStream(Refcounted.get(RESULT, false));
    }
    
    /**
     * Sets the {@code GtkMediaFile} to play the given file.
     * <p>
     * If any file is still playing, stop playing it.
     */
    public void setFile(org.gtk.gio.File file) {
        gtk_h.gtk_media_file_set_file(handle(), file.handle());
    }
    
    /**
     * Sets the {@code GtkMediaFile to play the given file.
     * 
     * This is a utility function that converts the given @filename
     * to a }GFile` and calls {@link MediaFile#setFile}.
     */
    public void setFilename(java.lang.String filename) {
        gtk_h.gtk_media_file_set_filename(handle(), Interop.allocateNativeString(filename).handle());
    }
    
    /**
     * Sets the {@code GtkMediaFile} to play the given stream.
     * <p>
     * If anything is still playing, stop playing it.
     * <p>
     * Full control about the {@code stream} is assumed for the duration of
     * playback. The stream will not be closed.
     */
    public void setInputStream(org.gtk.gio.InputStream stream) {
        gtk_h.gtk_media_file_set_input_stream(handle(), stream.handle());
    }
    
    /**
     * Sets the {@code GtkMediaFile to play the given resource.
     * 
     * This is a utility function that converts the given @resource_path
     * to a }GFile` and calls {@link MediaFile#setFile}.
     */
    public void setResource(java.lang.String resourcePath) {
        gtk_h.gtk_media_file_set_resource(handle(), Interop.allocateNativeString(resourcePath).handle());
    }
    
}
