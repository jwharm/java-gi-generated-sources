package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * `GtkMediaFile` implements `GtkMediaStream` for files.
 * 
 * This provides a simple way to play back video files with GTK.
 * 
 * GTK provides a GIO extension point for `GtkMediaFile` implementations
 * to allow for external implementations using various media frameworks.
 * 
 * GTK itself includes implementations using GStreamer and ffmpeg.
 */
public class MediaFile extends MediaStream implements org.gtk.gdk.Paintable {

    public MediaFile(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to MediaFile */
    public static MediaFile castFrom(org.gtk.gobject.Object gobject) {
        return new MediaFile(gobject.getReference());
    }
    
    private static Reference constructNew() {
        Reference RESULT = References.get(gtk_h.gtk_media_file_new(), true);
        return RESULT;
    }
    
    /**
     * Creates a new empty media file.
     */
    public MediaFile() {
        super(constructNew());
    }
    
    private static Reference constructNewForFile(org.gtk.gio.File file) {
        Reference RESULT = References.get(gtk_h.gtk_media_file_new_for_file(file.handle()), true);
        return RESULT;
    }
    
    /**
     * Creates a new media file to play @file.
     */
    public static MediaFile newForFile(org.gtk.gio.File file) {
        return new MediaFile(constructNewForFile(file));
    }
    
    private static Reference constructNewForFilename(java.lang.String filename) {
        Reference RESULT = References.get(gtk_h.gtk_media_file_new_for_filename(Interop.allocateNativeString(filename).handle()), true);
        return RESULT;
    }
    
    /**
     * Creates a new media file for the given filename.
     * 
     * This is a utility function that converts the given @filename
     * to a `GFile` and calls [ctor@Gtk.MediaFile.new_for_file].
     */
    public static MediaFile newForFilename(java.lang.String filename) {
        return new MediaFile(constructNewForFilename(filename));
    }
    
    private static Reference constructNewForInputStream(org.gtk.gio.InputStream stream) {
        Reference RESULT = References.get(gtk_h.gtk_media_file_new_for_input_stream(stream.handle()), true);
        return RESULT;
    }
    
    /**
     * Creates a new media file to play @stream.
     * 
     * If you want the resulting media to be seekable,
     * the stream should implement the `GSeekable` interface.
     */
    public static MediaFile newForInputStream(org.gtk.gio.InputStream stream) {
        return new MediaFile(constructNewForInputStream(stream));
    }
    
    private static Reference constructNewForResource(java.lang.String resourcePath) {
        Reference RESULT = References.get(gtk_h.gtk_media_file_new_for_resource(Interop.allocateNativeString(resourcePath).handle()), true);
        return RESULT;
    }
    
    /**
     * Creates a new new media file for the given resource.
     * 
     * This is a utility function that converts the given @resource
     * to a `GFile` and calls [ctor@Gtk.MediaFile.new_for_file].
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
     * Returns the file that @self is currently playing from.
     * 
     * When @self is not playing or not playing from a file,
     * %NULL is returned.
     */
    public org.gtk.gio.File getFile() {
        var RESULT = gtk_h.gtk_media_file_get_file(handle());
        return new org.gtk.gio.File.FileImpl(References.get(RESULT, false));
    }
    
    /**
     * Returns the stream that @self is currently playing from.
     * 
     * When @self is not playing or not playing from a stream,
     * %NULL is returned.
     */
    public org.gtk.gio.InputStream getInputStream() {
        var RESULT = gtk_h.gtk_media_file_get_input_stream(handle());
        return new org.gtk.gio.InputStream(References.get(RESULT, false));
    }
    
    /**
     * Sets the `GtkMediaFile` to play the given file.
     * 
     * If any file is still playing, stop playing it.
     */
    public void setFile(org.gtk.gio.File file) {
        gtk_h.gtk_media_file_set_file(handle(), file.handle());
    }
    
    /**
     * Sets the `GtkMediaFile to play the given file.
     * 
     * This is a utility function that converts the given @filename
     * to a `GFile` and calls [method@Gtk.MediaFile.set_file].
     */
    public void setFilename(java.lang.String filename) {
        gtk_h.gtk_media_file_set_filename(handle(), Interop.allocateNativeString(filename).handle());
    }
    
    /**
     * Sets the `GtkMediaFile` to play the given stream.
     * 
     * If anything is still playing, stop playing it.
     * 
     * Full control about the @stream is assumed for the duration of
     * playback. The stream will not be closed.
     */
    public void setInputStream(org.gtk.gio.InputStream stream) {
        gtk_h.gtk_media_file_set_input_stream(handle(), stream.handle());
    }
    
    /**
     * Sets the `GtkMediaFile to play the given resource.
     * 
     * This is a utility function that converts the given @resource_path
     * to a `GFile` and calls [method@Gtk.MediaFile.set_file].
     */
    public void setResource(java.lang.String resourcePath) {
        gtk_h.gtk_media_file_set_resource(handle(), Interop.allocateNativeString(resourcePath).handle());
    }
    
}
