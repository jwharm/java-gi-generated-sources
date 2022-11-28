package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The {@code GtkPicture} widget displays a {@code GdkPaintable}.
 * <p>
 * <img src="./doc-files/picture.png" alt="An example GtkPicture">
 * <p>
 * Many convenience functions are provided to make pictures simple to use.
 * For example, if you want to load an image from a file, and then display
 * it, there’s a convenience function to do this:
 * <pre>{@code c
 * GtkWidget *widget = gtk_picture_new_for_filename ("myfile.png");
 * }</pre>
 * <p>
 * If the file isn’t loaded successfully, the picture will contain a
 * “broken image” icon similar to that used in many web browsers.
 * If you want to handle errors in loading the file yourself,
 * for example by displaying an error message, then load the image with
 * {@link org.gtk.gdk.Texture#newFromFile}, then create the {@code GtkPicture} with
 * {@link Picture#newForPaintable}.
 * <p>
 * Sometimes an application will want to avoid depending on external data
 * files, such as image files. See the documentation of {@code GResource} for details.
 * In this case, {@link Picture#newForResource} and
 * {@link Picture#setResource} should be used.
 * <p>
 * {@code GtkPicture} displays an image at its natural size. See {@link Image}
 * if you want to display a fixed-size image, such as an icon.
 * <p>
 * <strong>Sizing the paintable</strong><br/>
 * You can influence how the paintable is displayed inside the {@code GtkPicture}
 * by changing {@code Gtk.Picture:content-fit}. See {@code Gtk.ContentFit}
 * for details. {@code Gtk.Picture:can-shrink} can be unset to make sure
 * that paintables are never made smaller than their ideal size - but
 * be careful if you do not know the size of the paintable in use (like
 * when displaying user-loaded images). This can easily cause the picture to
 * grow larger than the screen. And {@code GtkWidget:halign} and
 * {@code GtkWidget:valign} can be used to make sure the paintable doesn't
 * fill all available space but is instead displayed at its original size.
 * <p>
 * <strong>CSS nodes</strong><br/>
 * {@code GtkPicture} has a single CSS node with the name {@code picture}.
 * <p>
 * <strong>Accessibility</strong><br/>
 * {@code GtkPicture} uses the {@code GTK_ACCESSIBLE_ROLE_IMG} role.
 */
public class Picture extends org.gtk.gtk.Widget implements org.gtk.gtk.Accessible, org.gtk.gtk.Buildable, org.gtk.gtk.ConstraintTarget {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkPicture";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a Picture proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public Picture(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to Picture if its GType is a (or inherits from) "GtkPicture".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code Picture} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GtkPicture", a ClassCastException will be thrown.
     */
    public static Picture castFrom(org.gtk.gobject.Object gobject) {
            return new Picture(gobject.handle(), gobject.yieldOwnership());
    }
    
    private static Addressable constructNew() {
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_picture_new.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new empty {@code GtkPicture} widget.
     */
    public Picture() {
        super(constructNew(), Ownership.NONE);
    }
    
    private static Addressable constructNewForFile(@Nullable org.gtk.gio.File file) {
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_picture_new_for_file.invokeExact(
                    (Addressable) (file == null ? MemoryAddress.NULL : file.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@code GtkPicture} displaying the given {@code file}.
     * <p>
     * If the file isn’t found or can’t be loaded, the resulting
     * {@code GtkPicture} is empty.
     * <p>
     * If you need to detect failures to load the file, use
     * {@link org.gtk.gdk.Texture#newFromFile} to load the file yourself,
     * then create the {@code GtkPicture} from the texture.
     * @param file a {@code GFile}
     * @return a new {@code GtkPicture}
     */
    public static Picture newForFile(@Nullable org.gtk.gio.File file) {
        return new Picture(constructNewForFile(file), Ownership.NONE);
    }
    
    private static Addressable constructNewForFilename(@Nullable java.lang.String filename) {
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_picture_new_for_filename.invokeExact(
                    (Addressable) (filename == null ? MemoryAddress.NULL : Interop.allocateNativeString(filename)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@code GtkPicture} displaying the file {@code filename}.
     * <p>
     * This is a utility function that calls {@link Picture#newForFile}.
     * See that function for details.
     * @param filename a filename
     * @return a new {@code GtkPicture}
     */
    public static Picture newForFilename(@Nullable java.lang.String filename) {
        return new Picture(constructNewForFilename(filename), Ownership.NONE);
    }
    
    private static Addressable constructNewForPaintable(@Nullable org.gtk.gdk.Paintable paintable) {
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_picture_new_for_paintable.invokeExact(
                    (Addressable) (paintable == null ? MemoryAddress.NULL : paintable.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@code GtkPicture} displaying {@code paintable}.
     * <p>
     * The {@code GtkPicture} will track changes to the {@code paintable} and update
     * its size and contents in response to it.
     * @param paintable a {@code GdkPaintable}
     * @return a new {@code GtkPicture}
     */
    public static Picture newForPaintable(@Nullable org.gtk.gdk.Paintable paintable) {
        return new Picture(constructNewForPaintable(paintable), Ownership.NONE);
    }
    
    private static Addressable constructNewForPixbuf(@Nullable org.gtk.gdkpixbuf.Pixbuf pixbuf) {
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_picture_new_for_pixbuf.invokeExact(
                    (Addressable) (pixbuf == null ? MemoryAddress.NULL : pixbuf.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@code GtkPicture} displaying {@code pixbuf}.
     * <p>
     * This is a utility function that calls {@link Picture#newForPaintable},
     * See that function for details.
     * <p>
     * The pixbuf must not be modified after passing it to this function.
     * @param pixbuf a {@code GdkPixbuf}
     * @return a new {@code GtkPicture}
     */
    public static Picture newForPixbuf(@Nullable org.gtk.gdkpixbuf.Pixbuf pixbuf) {
        return new Picture(constructNewForPixbuf(pixbuf), Ownership.NONE);
    }
    
    private static Addressable constructNewForResource(@Nullable java.lang.String resourcePath) {
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_picture_new_for_resource.invokeExact(
                    (Addressable) (resourcePath == null ? MemoryAddress.NULL : Interop.allocateNativeString(resourcePath)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@code GtkPicture} displaying the resource at {@code resource_path}.
     * <p>
     * This is a utility function that calls {@link Picture#newForFile}.
     * See that function for details.
     * @param resourcePath resource path to play back
     * @return a new {@code GtkPicture}
     */
    public static Picture newForResource(@Nullable java.lang.String resourcePath) {
        return new Picture(constructNewForResource(resourcePath), Ownership.NONE);
    }
    
    /**
     * Gets the alternative textual description of the picture.
     * <p>
     * The returned string will be {@code null} if the picture cannot be described textually.
     * @return the alternative textual description of {@code self}.
     */
    public @Nullable java.lang.String getAlternativeText() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_picture_get_alternative_text.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Returns whether the {@code GtkPicture} respects its contents size.
     * @return {@code true} if the picture can be made smaller than its contents
     */
    public boolean getCanShrink() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_picture_get_can_shrink.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Returns the fit mode for the content of the {@code GtkPicture}.
     * <p>
     * See {@code Gtk.ContentFit} for details.
     * @return the content fit mode
     */
    public @NotNull org.gtk.gtk.ContentFit getContentFit() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_picture_get_content_fit.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.ContentFit(RESULT);
    }
    
    /**
     * Gets the {@code GFile} currently displayed if {@code self} is displaying a file.
     * <p>
     * If {@code self} is not displaying a file, for example when
     * {@link Picture#setPaintable} was used, then {@code null} is returned.
     * @return The {@code GFile} displayed by {@code self}.
     */
    public @Nullable org.gtk.gio.File getFile() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_picture_get_file.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gio.File.FileImpl(RESULT, Ownership.NONE);
    }
    
    /**
     * Returns whether the {@code GtkPicture} preserves its contents aspect ratio.
     * @return {@code true} if the self tries to keep the contents' aspect ratio
     * @deprecated Use {@link Picture#getContentFit} instead. This will
     *   now return {@code FALSE} only if {@code Gtk.Picture:content-fit} is
     *   {@code GTK_CONTENT_FIT_FILL}. Returns {@code TRUE} otherwise.
     */
    @Deprecated
    public boolean getKeepAspectRatio() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_picture_get_keep_aspect_ratio.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Gets the {@code GdkPaintable} being displayed by the {@code GtkPicture}.
     * @return the displayed paintable
     */
    public @Nullable org.gtk.gdk.Paintable getPaintable() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_picture_get_paintable.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gdk.Paintable.PaintableImpl(RESULT, Ownership.NONE);
    }
    
    /**
     * Sets an alternative textual description for the picture contents.
     * <p>
     * It is equivalent to the "alt" attribute for images on websites.
     * <p>
     * This text will be made available to accessibility tools.
     * <p>
     * If the picture cannot be described textually, set this property to {@code null}.
     * @param alternativeText a textual description of the contents
     */
    public void setAlternativeText(@Nullable java.lang.String alternativeText) {
        try {
            DowncallHandles.gtk_picture_set_alternative_text.invokeExact(
                    handle(),
                    (Addressable) (alternativeText == null ? MemoryAddress.NULL : Interop.allocateNativeString(alternativeText)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * If set to {@code true}, the {@code self} can be made smaller than its contents.
     * <p>
     * The contents will then be scaled down when rendering.
     * <p>
     * If you want to still force a minimum size manually, consider using
     * {@link Widget#setSizeRequest}.
     * <p>
     * Also of note is that a similar function for growing does not exist
     * because the grow behavior can be controlled via
     * {@link Widget#setHalign} and {@link Widget#setValign}.
     * @param canShrink if {@code self} can be made smaller than its contents
     */
    public void setCanShrink(boolean canShrink) {
        try {
            DowncallHandles.gtk_picture_set_can_shrink.invokeExact(
                    handle(),
                    canShrink ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets how the content should be resized to fit the {@code GtkPicture}.
     * <p>
     * See {@code Gtk.ContentFit} for details.
     * @param contentFit the content fit mode
     */
    public void setContentFit(@NotNull org.gtk.gtk.ContentFit contentFit) {
        java.util.Objects.requireNonNull(contentFit, "Parameter 'contentFit' must not be null");
        try {
            DowncallHandles.gtk_picture_set_content_fit.invokeExact(
                    handle(),
                    contentFit.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Makes {@code self} load and display {@code file}.
     * <p>
     * See {@link Picture#newForFile} for details.
     * @param file a {@code GFile}
     */
    public void setFile(@Nullable org.gtk.gio.File file) {
        try {
            DowncallHandles.gtk_picture_set_file.invokeExact(
                    handle(),
                    (Addressable) (file == null ? MemoryAddress.NULL : file.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Makes {@code self} load and display the given {@code filename}.
     * <p>
     * This is a utility function that calls {@link Picture#setFile}.
     * @param filename the filename to play
     */
    public void setFilename(@Nullable java.lang.String filename) {
        try {
            DowncallHandles.gtk_picture_set_filename.invokeExact(
                    handle(),
                    (Addressable) (filename == null ? MemoryAddress.NULL : Interop.allocateNativeString(filename)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * If set to {@code true}, the {@code self} will render its contents according to
     * their aspect ratio.
     * <p>
     * That means that empty space may show up at the top/bottom or
     * left/right of {@code self}.
     * <p>
     * If set to {@code false} or if the contents provide no aspect ratio,
     * the contents will be stretched over the picture's whole area.
     * @param keepAspectRatio whether to keep aspect ratio
     * @deprecated Use {@link Picture#setContentFit} instead. If still
     *   used, this method will always set the {@code Gtk.Picture:content-fit}
     *   property to {@code GTK_CONTENT_FIT_CONTAIN} if {@code keep_aspect_ratio} is true,
     *   otherwise it will set it to {@code GTK_CONTENT_FIT_FILL}.
     */
    @Deprecated
    public void setKeepAspectRatio(boolean keepAspectRatio) {
        try {
            DowncallHandles.gtk_picture_set_keep_aspect_ratio.invokeExact(
                    handle(),
                    keepAspectRatio ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Makes {@code self} display the given {@code paintable}.
     * <p>
     * If {@code paintable} is {@code null}, nothing will be displayed.
     * <p>
     * See {@link Picture#newForPaintable} for details.
     * @param paintable a {@code GdkPaintable}
     */
    public void setPaintable(@Nullable org.gtk.gdk.Paintable paintable) {
        try {
            DowncallHandles.gtk_picture_set_paintable.invokeExact(
                    handle(),
                    (Addressable) (paintable == null ? MemoryAddress.NULL : paintable.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets a {@code GtkPicture} to show a {@code GdkPixbuf}.
     * <p>
     * See {@link Picture#newForPixbuf} for details.
     * <p>
     * This is a utility function that calls {@link Picture#setPaintable}.
     * @param pixbuf a {@code GdkPixbuf}
     */
    public void setPixbuf(@Nullable org.gtk.gdkpixbuf.Pixbuf pixbuf) {
        try {
            DowncallHandles.gtk_picture_set_pixbuf.invokeExact(
                    handle(),
                    (Addressable) (pixbuf == null ? MemoryAddress.NULL : pixbuf.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Makes {@code self} load and display the resource at the given
     * {@code resource_path}.
     * <p>
     * This is a utility function that calls {@link Picture#setFile}.
     * @param resourcePath the resource to set
     */
    public void setResource(@Nullable java.lang.String resourcePath) {
        try {
            DowncallHandles.gtk_picture_set_resource.invokeExact(
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
            RESULT = (long) DowncallHandles.gtk_picture_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * GObjects with properties.
     */
    public static class Build extends org.gtk.gtk.Widget.Build {
        
         /**
         * A {@link Picture.Build} object constructs a {@link Picture} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link Picture} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link Picture} using {@link Picture#castFrom}.
         * @return A new instance of {@code Picture} with the properties 
         *         that were set in the Build object.
         */
        public Picture construct() {
            return Picture.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    Picture.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
        }
        
        /**
         * The alternative textual description for the picture.
         * @param alternativeText The value for the {@code alternative-text} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setAlternativeText(java.lang.String alternativeText) {
            names.add("alternative-text");
            values.add(org.gtk.gobject.Value.create(alternativeText));
            return this;
        }
        
        /**
         * If the {@code GtkPicture} can be made smaller than the natural size of its contents.
         * @param canShrink The value for the {@code can-shrink} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setCanShrink(boolean canShrink) {
            names.add("can-shrink");
            values.add(org.gtk.gobject.Value.create(canShrink));
            return this;
        }
        
        /**
         * How the content should be resized to fit inside the {@code GtkPicture}.
         * @param contentFit The value for the {@code content-fit} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setContentFit(org.gtk.gtk.ContentFit contentFit) {
            names.add("content-fit");
            values.add(org.gtk.gobject.Value.create(contentFit));
            return this;
        }
        
        /**
         * The {@code GFile} that is displayed or {@code null} if none.
         * @param file The value for the {@code file} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setFile(org.gtk.gio.File file) {
            names.add("file");
            values.add(org.gtk.gobject.Value.create(file));
            return this;
        }
        
        /**
         * Whether the GtkPicture will render its contents trying to preserve the aspect
         * ratio.
         * @param keepAspectRatio The value for the {@code keep-aspect-ratio} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setKeepAspectRatio(boolean keepAspectRatio) {
            names.add("keep-aspect-ratio");
            values.add(org.gtk.gobject.Value.create(keepAspectRatio));
            return this;
        }
        
        /**
         * The {@code GdkPaintable} to be displayed by this {@code GtkPicture}.
         * @param paintable The value for the {@code paintable} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setPaintable(org.gtk.gdk.Paintable paintable) {
            names.add("paintable");
            values.add(org.gtk.gobject.Value.create(paintable));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_picture_new = Interop.downcallHandle(
            "gtk_picture_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_picture_new_for_file = Interop.downcallHandle(
            "gtk_picture_new_for_file",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_picture_new_for_filename = Interop.downcallHandle(
            "gtk_picture_new_for_filename",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_picture_new_for_paintable = Interop.downcallHandle(
            "gtk_picture_new_for_paintable",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_picture_new_for_pixbuf = Interop.downcallHandle(
            "gtk_picture_new_for_pixbuf",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_picture_new_for_resource = Interop.downcallHandle(
            "gtk_picture_new_for_resource",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_picture_get_alternative_text = Interop.downcallHandle(
            "gtk_picture_get_alternative_text",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_picture_get_can_shrink = Interop.downcallHandle(
            "gtk_picture_get_can_shrink",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_picture_get_content_fit = Interop.downcallHandle(
            "gtk_picture_get_content_fit",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_picture_get_file = Interop.downcallHandle(
            "gtk_picture_get_file",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_picture_get_keep_aspect_ratio = Interop.downcallHandle(
            "gtk_picture_get_keep_aspect_ratio",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_picture_get_paintable = Interop.downcallHandle(
            "gtk_picture_get_paintable",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_picture_set_alternative_text = Interop.downcallHandle(
            "gtk_picture_set_alternative_text",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_picture_set_can_shrink = Interop.downcallHandle(
            "gtk_picture_set_can_shrink",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_picture_set_content_fit = Interop.downcallHandle(
            "gtk_picture_set_content_fit",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_picture_set_file = Interop.downcallHandle(
            "gtk_picture_set_file",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_picture_set_filename = Interop.downcallHandle(
            "gtk_picture_set_filename",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_picture_set_keep_aspect_ratio = Interop.downcallHandle(
            "gtk_picture_set_keep_aspect_ratio",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_picture_set_paintable = Interop.downcallHandle(
            "gtk_picture_set_paintable",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_picture_set_pixbuf = Interop.downcallHandle(
            "gtk_picture_set_pixbuf",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_picture_set_resource = Interop.downcallHandle(
            "gtk_picture_set_resource",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_picture_get_type = Interop.downcallHandle(
            "gtk_picture_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}
