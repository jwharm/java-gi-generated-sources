package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

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
public class Video extends Widget implements Accessible, Buildable, ConstraintTarget {

    public Video(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to Video */
    public static Video castFrom(org.gtk.gobject.Object gobject) {
        return new Video(gobject.getReference());
    }
    
    private static Reference constructNew() {
        Reference RESULT = References.get(gtk_h.gtk_video_new(), false);
        return RESULT;
    }
    
    /**
     * Creates a new empty {@code GtkVideo}.
     */
    public Video() {
        super(constructNew());
    }
    
    private static Reference constructNewForFile(org.gtk.gio.File file) {
        Reference RESULT = References.get(gtk_h.gtk_video_new_for_file(file.handle()), false);
        return RESULT;
    }
    
    /**
     * Creates a {@code GtkVideo} to play back the given {@code file}.
     */
    public static Video newForFile(org.gtk.gio.File file) {
        return new Video(constructNewForFile(file));
    }
    
    private static Reference constructNewForFilename(java.lang.String filename) {
        Reference RESULT = References.get(gtk_h.gtk_video_new_for_filename(Interop.allocateNativeString(filename).handle()), false);
        return RESULT;
    }
    
    /**
     * Creates a {@code GtkVideo} to play back the given {@code filename}.
     * <p>
     * This is a utility function that calls {@link Video#newForFile},
     * See that function for details.
     */
    public static Video newForFilename(java.lang.String filename) {
        return new Video(constructNewForFilename(filename));
    }
    
    private static Reference constructNewForMediaStream(MediaStream stream) {
        Reference RESULT = References.get(gtk_h.gtk_video_new_for_media_stream(stream.handle()), false);
        return RESULT;
    }
    
    /**
     * Creates a {@code GtkVideo} to play back the given {@code stream}.
     */
    public static Video newForMediaStream(MediaStream stream) {
        return new Video(constructNewForMediaStream(stream));
    }
    
    private static Reference constructNewForResource(java.lang.String resourcePath) {
        Reference RESULT = References.get(gtk_h.gtk_video_new_for_resource(Interop.allocateNativeString(resourcePath).handle()), false);
        return RESULT;
    }
    
    /**
     * Creates a {@code GtkVideo} to play back the resource at the
     * given {@code resource_path}.
     * <p>
     * This is a utility function that calls {@link Video#newForFile}.
     */
    public static Video newForResource(java.lang.String resourcePath) {
        return new Video(constructNewForResource(resourcePath));
    }
    
    /**
     * Returns {@code true} if videos have been set to loop.
     */
    public boolean getAutoplay() {
        var RESULT = gtk_h.gtk_video_get_autoplay(handle());
        return (RESULT != 0);
    }
    
    /**
     * Gets the file played by {@code self} or {@code null} if not playing back
     * a file.
     */
    public org.gtk.gio.File getFile() {
        var RESULT = gtk_h.gtk_video_get_file(handle());
        return new org.gtk.gio.File.FileImpl(References.get(RESULT, false));
    }
    
    /**
     * Returns {@code true} if videos have been set to loop.
     */
    public boolean getLoop() {
        var RESULT = gtk_h.gtk_video_get_loop(handle());
        return (RESULT != 0);
    }
    
    /**
     * Gets the media stream managed by {@code self} or {@code null} if none.
     */
    public MediaStream getMediaStream() {
        var RESULT = gtk_h.gtk_video_get_media_stream(handle());
        return new MediaStream(References.get(RESULT, false));
    }
    
    /**
     * Sets whether {@code self} automatically starts playback when it
     * becomes visible or when a new file gets loaded.
     */
    public void setAutoplay(boolean autoplay) {
        gtk_h.gtk_video_set_autoplay(handle(), autoplay ? 1 : 0);
    }
    
    /**
     * Makes {@code self} play the given {@code file}.
     */
    public void setFile(org.gtk.gio.File file) {
        gtk_h.gtk_video_set_file(handle(), file.handle());
    }
    
    /**
     * Makes {@code self} play the given {@code filename}.
     * <p>
     * This is a utility function that calls gtk_video_set_file(),
     */
    public void setFilename(java.lang.String filename) {
        gtk_h.gtk_video_set_filename(handle(), Interop.allocateNativeString(filename).handle());
    }
    
    /**
     * Sets whether new files loaded by {@code self} should be set to loop.
     */
    public void setLoop(boolean loop) {
        gtk_h.gtk_video_set_loop(handle(), loop ? 1 : 0);
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
     */
    public void setMediaStream(MediaStream stream) {
        gtk_h.gtk_video_set_media_stream(handle(), stream.handle());
    }
    
    /**
     * Makes {@code self} play the resource at the given {@code resource_path}.
     * <p>
     * This is a utility function that calls {@link Video#setFile}.
     */
    public void setResource(java.lang.String resourcePath) {
        gtk_h.gtk_video_set_resource(handle(), Interop.allocateNativeString(resourcePath).handle());
    }
    
}
