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
    
    private static final java.lang.String C_TYPE_NAME = "GtkVideo";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a Video proxy instance for the provided memory address.
     * <p>
     * Because Video is an {@code InitiallyUnowned} instance, when 
     * {@code ownership == Ownership.NONE}, the ownership is set to {@code FULL} 
     * and a call to {@code g_object_ref_sink()} is executed to sink the floating reference.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected Video(Addressable address, Ownership ownership) {
        super(address, Ownership.FULL);
        if (ownership == Ownership.NONE) {
            try {
                var RESULT = (MemoryAddress) Interop.g_object_ref_sink.invokeExact(address);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
        }
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, Video> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new Video(input, ownership);
    
    private static MemoryAddress constructNew() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_video_new.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new empty {@code GtkVideo}.
     */
    public Video() {
        super(constructNew(), Ownership.NONE);
    }
    
    private static MemoryAddress constructNewForFile(@Nullable org.gtk.gio.File file) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_video_new_for_file.invokeExact(
                    (Addressable) (file == null ? MemoryAddress.NULL : file.handle()));
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
        var RESULT = constructNewForFile(file);
        return (org.gtk.gtk.Video) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gtk.Video.fromAddress).marshal(RESULT, Ownership.NONE);
    }
    
    private static MemoryAddress constructNewForFilename(@Nullable java.lang.String filename) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_video_new_for_filename.invokeExact(
                    (Addressable) (filename == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(filename, null)));
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
        var RESULT = constructNewForFilename(filename);
        return (org.gtk.gtk.Video) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gtk.Video.fromAddress).marshal(RESULT, Ownership.NONE);
    }
    
    private static MemoryAddress constructNewForMediaStream(@Nullable org.gtk.gtk.MediaStream stream) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_video_new_for_media_stream.invokeExact(
                    (Addressable) (stream == null ? MemoryAddress.NULL : stream.handle()));
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
        var RESULT = constructNewForMediaStream(stream);
        return (org.gtk.gtk.Video) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gtk.Video.fromAddress).marshal(RESULT, Ownership.NONE);
    }
    
    private static MemoryAddress constructNewForResource(@Nullable java.lang.String resourcePath) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_video_new_for_resource.invokeExact(
                    (Addressable) (resourcePath == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(resourcePath, null)));
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
        var RESULT = constructNewForResource(resourcePath);
        return (org.gtk.gtk.Video) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gtk.Video.fromAddress).marshal(RESULT, Ownership.NONE);
    }
    
    /**
     * Returns {@code true} if videos have been set to loop.
     * @return {@code true} if streams should autoplay
     */
    public boolean getAutoplay() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_video_get_autoplay.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Gets the file played by {@code self} or {@code null} if not playing back
     * a file.
     * @return The file played by {@code self}
     */
    public @Nullable org.gtk.gio.File getFile() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_video_get_file.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gio.File) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gio.File.fromAddress).marshal(RESULT, Ownership.NONE);
    }
    
    /**
     * Returns {@code true} if videos have been set to loop.
     * @return {@code true} if streams should loop
     */
    public boolean getLoop() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_video_get_loop.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Gets the media stream managed by {@code self} or {@code null} if none.
     * @return The media stream managed by {@code self}
     */
    public @Nullable org.gtk.gtk.MediaStream getMediaStream() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_video_get_media_stream.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gtk.MediaStream) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gtk.MediaStream.fromAddress).marshal(RESULT, Ownership.NONE);
    }
    
    /**
     * Sets whether {@code self} automatically starts playback when it
     * becomes visible or when a new file gets loaded.
     * @param autoplay whether media streams should autoplay
     */
    public void setAutoplay(boolean autoplay) {
        try {
            DowncallHandles.gtk_video_set_autoplay.invokeExact(
                    handle(),
                    Marshal.booleanToInteger.marshal(autoplay, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Makes {@code self} play the given {@code file}.
     * @param file the file to play
     */
    public void setFile(@Nullable org.gtk.gio.File file) {
        try {
            DowncallHandles.gtk_video_set_file.invokeExact(
                    handle(),
                    (Addressable) (file == null ? MemoryAddress.NULL : file.handle()));
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
        try {
            DowncallHandles.gtk_video_set_filename.invokeExact(
                    handle(),
                    (Addressable) (filename == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(filename, null)));
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
            DowncallHandles.gtk_video_set_loop.invokeExact(
                    handle(),
                    Marshal.booleanToInteger.marshal(loop, null).intValue());
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
        try {
            DowncallHandles.gtk_video_set_media_stream.invokeExact(
                    handle(),
                    (Addressable) (stream == null ? MemoryAddress.NULL : stream.handle()));
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
        try {
            DowncallHandles.gtk_video_set_resource.invokeExact(
                    handle(),
                    (Addressable) (resourcePath == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(resourcePath, null)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gtk_video_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * A {@link Video.Builder} object constructs a {@link Video} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link Video.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gtk.gtk.Widget.Builder {
        
        protected Builder() {
        }
        
        /**
         * Finish building the {@link Video} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link Video}.
         * @return A new instance of {@code Video} with the properties 
         *         that were set in the Builder object.
         */
        public Video build() {
            return (Video) org.gtk.gobject.GObject.newWithProperties(
                Video.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        /**
         * If the video should automatically begin playing.
         * @param autoplay The value for the {@code autoplay} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setAutoplay(boolean autoplay) {
            names.add("autoplay");
            values.add(org.gtk.gobject.Value.create(autoplay));
            return this;
        }
        
        /**
         * The file played by this video if the video is playing a file.
         * @param file The value for the {@code file} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setFile(org.gtk.gio.File file) {
            names.add("file");
            values.add(org.gtk.gobject.Value.create(file));
            return this;
        }
        
        /**
         * If new media files should be set to loop.
         * @param loop The value for the {@code loop} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setLoop(boolean loop) {
            names.add("loop");
            values.add(org.gtk.gobject.Value.create(loop));
            return this;
        }
        
        /**
         * The media-stream played
         * @param mediaStream The value for the {@code media-stream} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setMediaStream(org.gtk.gtk.MediaStream mediaStream) {
            names.add("media-stream");
            values.add(org.gtk.gobject.Value.create(mediaStream));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_video_new = Interop.downcallHandle(
            "gtk_video_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_video_new_for_file = Interop.downcallHandle(
            "gtk_video_new_for_file",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_video_new_for_filename = Interop.downcallHandle(
            "gtk_video_new_for_filename",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_video_new_for_media_stream = Interop.downcallHandle(
            "gtk_video_new_for_media_stream",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_video_new_for_resource = Interop.downcallHandle(
            "gtk_video_new_for_resource",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_video_get_autoplay = Interop.downcallHandle(
            "gtk_video_get_autoplay",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_video_get_file = Interop.downcallHandle(
            "gtk_video_get_file",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_video_get_loop = Interop.downcallHandle(
            "gtk_video_get_loop",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_video_get_media_stream = Interop.downcallHandle(
            "gtk_video_get_media_stream",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_video_set_autoplay = Interop.downcallHandle(
            "gtk_video_set_autoplay",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_video_set_file = Interop.downcallHandle(
            "gtk_video_set_file",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_video_set_filename = Interop.downcallHandle(
            "gtk_video_set_filename",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_video_set_loop = Interop.downcallHandle(
            "gtk_video_set_loop",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_video_set_media_stream = Interop.downcallHandle(
            "gtk_video_set_media_stream",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_video_set_resource = Interop.downcallHandle(
            "gtk_video_set_resource",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_video_get_type = Interop.downcallHandle(
            "gtk_video_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}
