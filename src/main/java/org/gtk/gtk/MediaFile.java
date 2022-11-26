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
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gtk.MediaStream.getMemoryLayout().withName("parent_instance")
    ).withName(C_TYPE_NAME);
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    /**
     * Get the value of the field {@code parent_instance}
     * @return The value of the field {@code parent_instance}
     */
    public org.gtk.gtk.MediaStream parent_instance$get() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent_instance"));
        return new org.gtk.gtk.MediaStream(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Create a MediaFile proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public MediaFile(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to MediaFile if its GType is a (or inherits from) "GtkMediaFile".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code MediaFile} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GtkMediaFile", a ClassCastException will be thrown.
     */
    public static MediaFile castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), MediaFile.getType())) {
            return new MediaFile(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GtkMediaFile");
        }
    }
    
    private static Addressable constructNew() {
        Addressable RESULT;
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
    
    private static Addressable constructNewForFile(@NotNull org.gtk.gio.File file) {
        java.util.Objects.requireNonNull(file, "Parameter 'file' must not be null");
        Addressable RESULT;
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
    public static MediaFile newForFile(@NotNull org.gtk.gio.File file) {
        return new MediaFile(constructNewForFile(file), Ownership.FULL);
    }
    
    private static Addressable constructNewForFilename(@NotNull java.lang.String filename) {
        java.util.Objects.requireNonNull(filename, "Parameter 'filename' must not be null");
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_media_file_new_for_filename.invokeExact(
                    Interop.allocateNativeString(filename));
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
        return new MediaFile(constructNewForFilename(filename), Ownership.FULL);
    }
    
    private static Addressable constructNewForInputStream(@NotNull org.gtk.gio.InputStream stream) {
        java.util.Objects.requireNonNull(stream, "Parameter 'stream' must not be null");
        Addressable RESULT;
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
    public static MediaFile newForInputStream(@NotNull org.gtk.gio.InputStream stream) {
        return new MediaFile(constructNewForInputStream(stream), Ownership.FULL);
    }
    
    private static Addressable constructNewForResource(@NotNull java.lang.String resourcePath) {
        java.util.Objects.requireNonNull(resourcePath, "Parameter 'resourcePath' must not be null");
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_media_file_new_for_resource.invokeExact(
                    Interop.allocateNativeString(resourcePath));
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
        return new MediaFile(constructNewForResource(resourcePath), Ownership.FULL);
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
        return new org.gtk.gio.File.FileImpl(RESULT, Ownership.NONE);
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
        return new org.gtk.gio.InputStream(RESULT, Ownership.NONE);
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
                    (Addressable) (filename == null ? MemoryAddress.NULL : Interop.allocateNativeString(filename)));
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
                    (Addressable) (resourcePath == null ? MemoryAddress.NULL : Interop.allocateNativeString(resourcePath)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static @NotNull org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gtk_media_file_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * GObjects with properties.
     */
    public static class Build extends org.gtk.gtk.MediaStream.Build {
        
         /**
         * A {@link MediaFile.Build} object constructs a {@link MediaFile} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link MediaFile} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link MediaFile} using {@link MediaFile#castFrom}.
         * @return A new instance of {@code MediaFile} with the properties 
         *         that were set in the Build object.
         */
        public MediaFile construct() {
            return MediaFile.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    MediaFile.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
        }
        
        /**
         * The file being played back or {@code null} if not playing a file.
         * @param file The value for the {@code file} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setFile(org.gtk.gio.File file) {
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
        public Build setInputStream(org.gtk.gio.InputStream inputStream) {
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
