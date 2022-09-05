package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
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

    public MediaFile(io.github.jwharm.javagi.interop.Proxy proxy) {
        super(proxy);
    }
    
    /** Cast object to MediaFile */
    public static MediaFile castFrom(org.gtk.gobject.Object gobject) {
        return new MediaFile(gobject.getProxy());
    }
    
    /**
     * Creates a new empty media file.
     */
    public MediaFile() {
        super(ProxyFactory.get(io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_media_file_new(), true));
    }
    
    /**
     * Creates a new media file to play @file.
     */
    public MediaFile(org.gtk.gio.File file) {
        super(ProxyFactory.get(io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_media_file_new_for_file(file.HANDLE()), true));
    }
    
    /**
     * Creates a new media file for the given filename.
     * 
     * This is a utility function that converts the given @filename
     * to a `GFile` and calls [ctor@Gtk.MediaFile.new_for_file].
     */
    public static MediaFile newForFilename(java.lang.String filename) {
        return new MediaFile(ProxyFactory.get(io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_media_file_new_for_filename(Interop.getAllocator().allocateUtf8String(filename)), true));
    }
    
    /**
     * Creates a new media file to play @stream.
     * 
     * If you want the resulting media to be seekable,
     * the stream should implement the `GSeekable` interface.
     */
    public MediaFile(org.gtk.gio.InputStream stream) {
        super(ProxyFactory.get(io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_media_file_new_for_input_stream(stream.HANDLE()), true));
    }
    
    /**
     * Creates a new new media file for the given resource.
     * 
     * This is a utility function that converts the given @resource
     * to a `GFile` and calls [ctor@Gtk.MediaFile.new_for_file].
     */
    public static MediaFile newForResource(java.lang.String resourcePath) {
        return new MediaFile(ProxyFactory.get(io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_media_file_new_for_resource(Interop.getAllocator().allocateUtf8String(resourcePath)), true));
    }
    
    /**
     * Resets the media file to be empty.
     */
    public void clear() {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_media_file_clear(HANDLE());
    }
    
    /**
     * Returns the file that @self is currently playing from.
     * 
     * When @self is not playing or not playing from a file,
     * %NULL is returned.
     */
    public org.gtk.gio.File getFile() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_media_file_get_file(HANDLE());
        return new org.gtk.gio.File.FileImpl(ProxyFactory.get(RESULT, false));
    }
    
    /**
     * Returns the stream that @self is currently playing from.
     * 
     * When @self is not playing or not playing from a stream,
     * %NULL is returned.
     */
    public org.gtk.gio.InputStream getInputStream() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_media_file_get_input_stream(HANDLE());
        return new org.gtk.gio.InputStream(ProxyFactory.get(RESULT, false));
    }
    
    /**
     * Sets the `GtkMediaFile` to play the given file.
     * 
     * If any file is still playing, stop playing it.
     */
    public void setFile(org.gtk.gio.File file) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_media_file_set_file(HANDLE(), file.HANDLE());
    }
    
    /**
     * Sets the `GtkMediaFile to play the given file.
     * 
     * This is a utility function that converts the given @filename
     * to a `GFile` and calls [method@Gtk.MediaFile.set_file].
     */
    public void setFilename(java.lang.String filename) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_media_file_set_filename(HANDLE(), Interop.getAllocator().allocateUtf8String(filename));
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
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_media_file_set_input_stream(HANDLE(), stream.HANDLE());
    }
    
    /**
     * Sets the `GtkMediaFile to play the given resource.
     * 
     * This is a utility function that converts the given @resource_path
     * to a `GFile` and calls [method@Gtk.MediaFile.set_file].
     */
    public void setResource(java.lang.String resourcePath) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_media_file_set_resource(HANDLE(), Interop.getAllocator().allocateUtf8String(resourcePath));
    }
    
}
