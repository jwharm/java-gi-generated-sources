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
    
    private static final java.lang.String C_TYPE_NAME = "GtkMediaFile";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gtk.gtk.MediaStream.getMemoryLayout().withName("parent_instance")
        ).withName(C_TYPE_NAME);
    }
    
    /**
     * Create a MediaFile proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected MediaFile(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, MediaFile> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new MediaFile(input, ownership);
    
    private static MemoryAddress constructNew() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_media_file_new.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new empty media file.
     */
    public MediaFile() {
        super(constructNew(), Ownership.FULL);
    }
    
    private static MemoryAddress constructNewForFile(org.gtk.gio.File file) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_media_file_new_for_file.invokeExact(
                    file.handle());
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
    public static MediaFile newForFile(org.gtk.gio.File file) {
        var RESULT = constructNewForFile(file);
        return (org.gtk.gtk.MediaFile) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gtk.MediaFile.fromAddress).marshal(RESULT, Ownership.FULL);
    }
    
    private static MemoryAddress constructNewForFilename(java.lang.String filename) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_media_file_new_for_filename.invokeExact(
                    Marshal.stringToAddress.marshal(filename, null));
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
    public static MediaFile newForFilename(java.lang.String filename) {
        var RESULT = constructNewForFilename(filename);
        return (org.gtk.gtk.MediaFile) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gtk.MediaFile.fromAddress).marshal(RESULT, Ownership.FULL);
    }
    
    private static MemoryAddress constructNewForInputStream(org.gtk.gio.InputStream stream) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_media_file_new_for_input_stream.invokeExact(
                    stream.handle());
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
    public static MediaFile newForInputStream(org.gtk.gio.InputStream stream) {
        var RESULT = constructNewForInputStream(stream);
        return (org.gtk.gtk.MediaFile) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gtk.MediaFile.fromAddress).marshal(RESULT, Ownership.FULL);
    }
    
    private static MemoryAddress constructNewForResource(java.lang.String resourcePath) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_media_file_new_for_resource.invokeExact(
                    Marshal.stringToAddress.marshal(resourcePath, null));
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
    public static MediaFile newForResource(java.lang.String resourcePath) {
        var RESULT = constructNewForResource(resourcePath);
        return (org.gtk.gtk.MediaFile) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gtk.MediaFile.fromAddress).marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Resets the media file to be empty.
     */
    public void clear() {
        try {
            DowncallHandles.gtk_media_file_clear.invokeExact(
                    handle());
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
            RESULT = (MemoryAddress) DowncallHandles.gtk_media_file_get_file.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gio.File) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gio.File.fromAddress).marshal(RESULT, Ownership.NONE);
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
            RESULT = (MemoryAddress) DowncallHandles.gtk_media_file_get_input_stream.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gio.InputStream) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gio.InputStream.fromAddress).marshal(RESULT, Ownership.NONE);
    }
    
    /**
     * Sets the {@code GtkMediaFile} to play the given file.
     * <p>
     * If any file is still playing, stop playing it.
     * @param file the file to play
     */
    public void setFile(@Nullable org.gtk.gio.File file) {
        try {
            DowncallHandles.gtk_media_file_set_file.invokeExact(
                    handle(),
                    (Addressable) (file == null ? MemoryAddress.NULL : file.handle()));
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
        try {
            DowncallHandles.gtk_media_file_set_filename.invokeExact(
                    handle(),
                    (Addressable) (filename == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(filename, null)));
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
        try {
            DowncallHandles.gtk_media_file_set_input_stream.invokeExact(
                    handle(),
                    (Addressable) (stream == null ? MemoryAddress.NULL : stream.handle()));
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
        try {
            DowncallHandles.gtk_media_file_set_resource.invokeExact(
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
            RESULT = (long) DowncallHandles.gtk_media_file_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * A {@link MediaFile.Builder} object constructs a {@link MediaFile} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link MediaFile.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gtk.gtk.MediaStream.Builder {
        
        protected Builder() {
        }
        
        /**
         * Finish building the {@link MediaFile} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link MediaFile}.
         * @return A new instance of {@code MediaFile} with the properties 
         *         that were set in the Builder object.
         */
        public MediaFile build() {
            return (MediaFile) org.gtk.gobject.GObject.newWithProperties(
                MediaFile.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        /**
         * The file being played back or {@code null} if not playing a file.
         * @param file The value for the {@code file} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setFile(org.gtk.gio.File file) {
            names.add("file");
            values.add(org.gtk.gobject.Value.create(file));
            return this;
        }
        
        /**
         * The stream being played back or {@code null} if not playing a stream.
         * <p>
         * This is {@code null} when playing a file.
         * @param inputStream The value for the {@code input-stream} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setInputStream(org.gtk.gio.InputStream inputStream) {
            names.add("input-stream");
            values.add(org.gtk.gobject.Value.create(inputStream));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_media_file_new = Interop.downcallHandle(
            "gtk_media_file_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_media_file_new_for_file = Interop.downcallHandle(
            "gtk_media_file_new_for_file",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_media_file_new_for_filename = Interop.downcallHandle(
            "gtk_media_file_new_for_filename",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_media_file_new_for_input_stream = Interop.downcallHandle(
            "gtk_media_file_new_for_input_stream",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_media_file_new_for_resource = Interop.downcallHandle(
            "gtk_media_file_new_for_resource",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_media_file_clear = Interop.downcallHandle(
            "gtk_media_file_clear",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_media_file_get_file = Interop.downcallHandle(
            "gtk_media_file_get_file",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_media_file_get_input_stream = Interop.downcallHandle(
            "gtk_media_file_get_input_stream",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_media_file_set_file = Interop.downcallHandle(
            "gtk_media_file_set_file",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_media_file_set_filename = Interop.downcallHandle(
            "gtk_media_file_set_filename",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_media_file_set_input_stream = Interop.downcallHandle(
            "gtk_media_file_set_input_stream",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_media_file_set_resource = Interop.downcallHandle(
            "gtk_media_file_set_resource",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_media_file_get_type = Interop.downcallHandle(
            "gtk_media_file_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}
