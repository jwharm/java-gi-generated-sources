package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * `GtkVideo` is a widget to show a `GtkMediaStream` with media controls.
 * 
 * ![An example GtkVideo](video.png)
 * 
 * The controls are available separately as [class@Gtk.MediaControls].
 * If you just want to display a video without controls, you can treat it
 * like any other paintable and for example put it into a [class@Gtk.Picture].
 * 
 * `GtkVideo` aims to cover use cases such as previews, embedded animations,
 * etc. It supports autoplay, looping, and simple media controls. It does
 * not have support for video overlays, multichannel audio, device
 * selection, or input. If you are writing a full-fledged video player,
 * you may want to use the [iface@Gdk.Paintable] API and a media framework
 * such as Gstreamer directly.
 */
public class Video extends Widget implements Accessible, Buildable, ConstraintTarget {

    public Video(io.github.jwharm.javagi.interop.Proxy proxy) {
        super(proxy);
    }
    
    /** Cast object to Video */
    public static Video castFrom(org.gtk.gobject.Object gobject) {
        return new Video(gobject.getProxy());
    }
    
    /**
     * Creates a new empty `GtkVideo`.
     */
    public Video() {
        super(ProxyFactory.getProxy(io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_video_new(), false));
    }
    
    /**
     * Creates a `GtkVideo` to play back the given @file.
     */
    public Video(org.gtk.gio.File file) {
        super(ProxyFactory.getProxy(io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_video_new_for_file(file.HANDLE()), false));
    }
    
    /**
     * Creates a `GtkVideo` to play back the given @filename.
     * 
     * This is a utility function that calls [ctor@Gtk.Video.new_for_file],
     * See that function for details.
     */
    public static Video newForFilename(java.lang.String filename) {
        return new Video(ProxyFactory.getProxy(io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_video_new_for_filename(Interop.getAllocator().allocateUtf8String(filename)), false));
    }
    
    /**
     * Creates a `GtkVideo` to play back the given @stream.
     */
    public Video(MediaStream stream) {
        super(ProxyFactory.getProxy(io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_video_new_for_media_stream(stream.HANDLE()), false));
    }
    
    /**
     * Creates a `GtkVideo` to play back the resource at the
     * given @resource_path.
     * 
     * This is a utility function that calls [ctor@Gtk.Video.new_for_file].
     */
    public static Video newForResource(java.lang.String resourcePath) {
        return new Video(ProxyFactory.getProxy(io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_video_new_for_resource(Interop.getAllocator().allocateUtf8String(resourcePath)), false));
    }
    
    /**
     * Returns %TRUE if videos have been set to loop.
     */
    public boolean getAutoplay() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_video_get_autoplay(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Gets the file played by @self or %NULL if not playing back
     * a file.
     */
    public org.gtk.gio.File getFile() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_video_get_file(HANDLE());
        return new org.gtk.gio.File.FileImpl(ProxyFactory.getProxy(RESULT, false));
    }
    
    /**
     * Returns %TRUE if videos have been set to loop.
     */
    public boolean getLoop() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_video_get_loop(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Gets the media stream managed by @self or %NULL if none.
     */
    public MediaStream getMediaStream() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_video_get_media_stream(HANDLE());
        return new MediaStream(ProxyFactory.getProxy(RESULT, false));
    }
    
    /**
     * Sets whether @self automatically starts playback when it
     * becomes visible or when a new file gets loaded.
     */
    public void setAutoplay(boolean autoplay) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_video_set_autoplay(HANDLE(), autoplay ? 1 : 0);
    }
    
    /**
     * Makes @self play the given @file.
     */
    public void setFile(org.gtk.gio.File file) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_video_set_file(HANDLE(), file.HANDLE());
    }
    
    /**
     * Makes @self play the given @filename.
     * 
     * This is a utility function that calls gtk_video_set_file(),
     */
    public void setFilename(java.lang.String filename) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_video_set_filename(HANDLE(), Interop.getAllocator().allocateUtf8String(filename));
    }
    
    /**
     * Sets whether new files loaded by @self should be set to loop.
     */
    public void setLoop(boolean loop) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_video_set_loop(HANDLE(), loop ? 1 : 0);
    }
    
    /**
     * Sets the media stream to be played back.
     * 
     * @self will take full control of managing the media stream. If you
     * want to manage a media stream yourself, consider using a
     * [class@Gtk.Picture] for display.
     * 
     * If you want to display a file, consider using [method@Gtk.Video.set_file]
     * instead.
     */
    public void setMediaStream(MediaStream stream) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_video_set_media_stream(HANDLE(), stream.HANDLE());
    }
    
    /**
     * Makes @self play the resource at the given @resource_path.
     * 
     * This is a utility function that calls [method@Gtk.Video.set_file].
     */
    public void setResource(java.lang.String resourcePath) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_video_set_resource(HANDLE(), Interop.getAllocator().allocateUtf8String(resourcePath));
    }
    
}
