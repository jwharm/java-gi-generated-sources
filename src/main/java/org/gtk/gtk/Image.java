package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The {@code GtkImage} widget displays an image.
 * <p>
 * <img src="./doc-files/image.png" alt="An example GtkImage">
 * <p>
 * Various kinds of object can be displayed as an image; most typically,
 * you would load a {@code GdkTexture} from a file, using the convenience function
 * {@link Image#newFromFile}, for instance:
 * <pre>{@code c
 * GtkWidget *image = gtk_image_new_from_file ("myfile.png");
 * }</pre>
 * <p>
 * If the file isn’t loaded successfully, the image will contain a
 * “broken image” icon similar to that used in many web browsers.
 * <p>
 * If you want to handle errors in loading the file yourself,
 * for example by displaying an error message, then load the image with
 * {@link org.gtk.gdk.Texture#newFromFile}, then create the {@code GtkImage} with
 * {@link Image#newFromPaintable}.
 * <p>
 * Sometimes an application will want to avoid depending on external data
 * files, such as image files. See the documentation of {@code GResource} inside
 * GIO, for details. In this case, {@code Gtk.Image:resource},
 * {@link Image#newFromResource}, and {@link Image#setFromResource}
 * should be used.
 * <p>
 * {@code GtkImage} displays its image as an icon, with a size that is determined
 * by the application. See {@link Picture} if you want to show an image
 * at is actual size.
 * <p>
 * <strong>CSS nodes</strong><br/>
 * {@code GtkImage} has a single CSS node with the name {@code image}. The style classes
 * {@code .normal-icons} or {@code .large-icons} may appear, depending on the
 * {@code Gtk.Image:icon-size} property.
 * <p>
 * <strong>Accessibility</strong><br/>
 * {@code GtkImage} uses the {@code GTK_ACCESSIBLE_ROLE_IMG} role.
 */
public class Image extends org.gtk.gtk.Widget implements org.gtk.gtk.Accessible, org.gtk.gtk.Buildable, org.gtk.gtk.ConstraintTarget {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkImage";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a Image proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected Image(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, Image> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new Image(input);
    
    private static MemoryAddress constructNew() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_image_new.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new empty {@code GtkImage} widget.
     */
    public Image() {
        super(constructNew());
        this.refSink();
        this.takeOwnership();
    }
    
    private static MemoryAddress constructNewFromFile(java.lang.String filename) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.gtk_image_new_from_file.invokeExact(Marshal.stringToAddress.marshal(filename, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return RESULT;
        }
    }
        
    /**
     * Creates a new {@code GtkImage} displaying the file {@code filename}.
     * <p>
     * If the file isn’t found or can’t be loaded, the resulting {@code GtkImage}
     * will display a “broken image” icon. This function never returns {@code null},
     * it always returns a valid {@code GtkImage} widget.
     * <p>
     * If you need to detect failures to load the file, use
     * {@link org.gtk.gdk.Texture#newFromFile} to load the file yourself,
     * then create the {@code GtkImage} from the texture.
     * <p>
     * The storage type (see {@link Image#getStorageType})
     * of the returned image is not defined, it will be whatever
     * is appropriate for displaying the file.
     * @param filename a filename
     * @return a new {@code GtkImage}
     */
    public static Image newFromFile(java.lang.String filename) {
        var RESULT = constructNewFromFile(filename);
        var OBJECT = (org.gtk.gtk.Image) Interop.register(RESULT, org.gtk.gtk.Image.fromAddress).marshal(RESULT, null);
        OBJECT.refSink();
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    private static MemoryAddress constructNewFromGicon(org.gtk.gio.Icon icon) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_image_new_from_gicon.invokeExact(icon.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
        
    /**
     * Creates a {@code GtkImage} displaying an icon from the current icon theme.
     * <p>
     * If the icon name isn’t known, a “broken image” icon will be
     * displayed instead. If the current icon theme is changed, the icon
     * will be updated appropriately.
     * @param icon an icon
     * @return a new {@code GtkImage} displaying the themed icon
     */
    public static Image newFromGicon(org.gtk.gio.Icon icon) {
        var RESULT = constructNewFromGicon(icon);
        var OBJECT = (org.gtk.gtk.Image) Interop.register(RESULT, org.gtk.gtk.Image.fromAddress).marshal(RESULT, null);
        OBJECT.refSink();
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    private static MemoryAddress constructNewFromIconName(@Nullable java.lang.String iconName) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.gtk_image_new_from_icon_name.invokeExact((Addressable) (iconName == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(iconName, SCOPE)));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return RESULT;
        }
    }
        
    /**
     * Creates a {@code GtkImage} displaying an icon from the current icon theme.
     * <p>
     * If the icon name isn’t known, a “broken image” icon will be
     * displayed instead. If the current icon theme is changed, the icon
     * will be updated appropriately.
     * @param iconName an icon name
     * @return a new {@code GtkImage} displaying the themed icon
     */
    public static Image newFromIconName(@Nullable java.lang.String iconName) {
        var RESULT = constructNewFromIconName(iconName);
        var OBJECT = (org.gtk.gtk.Image) Interop.register(RESULT, org.gtk.gtk.Image.fromAddress).marshal(RESULT, null);
        OBJECT.refSink();
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    private static MemoryAddress constructNewFromPaintable(@Nullable org.gtk.gdk.Paintable paintable) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_image_new_from_paintable.invokeExact((Addressable) (paintable == null ? MemoryAddress.NULL : paintable.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
        
    /**
     * Creates a new {@code GtkImage} displaying {@code paintable}.
     * <p>
     * The {@code GtkImage} does not assume a reference to the paintable; you still
     * need to unref it if you own references. {@code GtkImage} will add its own
     * reference rather than adopting yours.
     * <p>
     * The {@code GtkImage} will track changes to the {@code paintable} and update
     * its size and contents in response to it.
     * @param paintable a {@code GdkPaintable}
     * @return a new {@code GtkImage}
     */
    public static Image newFromPaintable(@Nullable org.gtk.gdk.Paintable paintable) {
        var RESULT = constructNewFromPaintable(paintable);
        var OBJECT = (org.gtk.gtk.Image) Interop.register(RESULT, org.gtk.gtk.Image.fromAddress).marshal(RESULT, null);
        OBJECT.refSink();
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    private static MemoryAddress constructNewFromPixbuf(@Nullable org.gtk.gdkpixbuf.Pixbuf pixbuf) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_image_new_from_pixbuf.invokeExact((Addressable) (pixbuf == null ? MemoryAddress.NULL : pixbuf.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
        
    /**
     * Creates a new {@code GtkImage} displaying {@code pixbuf}.
     * <p>
     * The {@code GtkImage} does not assume a reference to the pixbuf; you still
     * need to unref it if you own references. {@code GtkImage} will add its own
     * reference rather than adopting yours.
     * <p>
     * This is a helper for {@link Image#newFromPaintable}, and you can't
     * get back the exact pixbuf once this is called, only a texture.
     * <p>
     * Note that this function just creates an {@code GtkImage} from the pixbuf.
     * The {@code GtkImage} created will not react to state changes. Should you
     * want that, you should use {@link Image#newFromIconName}.
     * @param pixbuf a {@code GdkPixbuf}
     * @return a new {@code GtkImage}
     */
    public static Image newFromPixbuf(@Nullable org.gtk.gdkpixbuf.Pixbuf pixbuf) {
        var RESULT = constructNewFromPixbuf(pixbuf);
        var OBJECT = (org.gtk.gtk.Image) Interop.register(RESULT, org.gtk.gtk.Image.fromAddress).marshal(RESULT, null);
        OBJECT.refSink();
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    private static MemoryAddress constructNewFromResource(java.lang.String resourcePath) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.gtk_image_new_from_resource.invokeExact(Marshal.stringToAddress.marshal(resourcePath, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return RESULT;
        }
    }
        
    /**
     * Creates a new {@code GtkImage} displaying the resource file {@code resource_path}.
     * <p>
     * If the file isn’t found or can’t be loaded, the resulting {@code GtkImage} will
     * display a “broken image” icon. This function never returns {@code null},
     * it always returns a valid {@code GtkImage} widget.
     * <p>
     * If you need to detect failures to load the file, use
     * {@link org.gtk.gdkpixbuf.Pixbuf#newFromFile} to load the file yourself,
     * then create the {@code GtkImage} from the pixbuf.
     * <p>
     * The storage type (see {@link Image#getStorageType}) of
     * the returned image is not defined, it will be whatever is
     * appropriate for displaying the file.
     * @param resourcePath a resource path
     * @return a new {@code GtkImage}
     */
    public static Image newFromResource(java.lang.String resourcePath) {
        var RESULT = constructNewFromResource(resourcePath);
        var OBJECT = (org.gtk.gtk.Image) Interop.register(RESULT, org.gtk.gtk.Image.fromAddress).marshal(RESULT, null);
        OBJECT.refSink();
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * Resets the image to be empty.
     */
    public void clear() {
        try {
            DowncallHandles.gtk_image_clear.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Gets the {@code GIcon} being displayed by the {@code GtkImage}.
     * <p>
     * The storage type of the image must be {@link ImageType#EMPTY} or
     * {@link ImageType#GICON} (see {@link Image#getStorageType}).
     * The caller of this function does not own a reference to the
     * returned {@code GIcon}.
     * @return a {@code GIcon}
     */
    public @Nullable org.gtk.gio.Icon getGicon() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_image_get_gicon.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gio.Icon) Interop.register(RESULT, org.gtk.gio.Icon.fromAddress).marshal(RESULT, null);
    }
    
    /**
     * Gets the icon name and size being displayed by the {@code GtkImage}.
     * <p>
     * The storage type of the image must be {@link ImageType#EMPTY} or
     * {@link ImageType#ICON_NAME} (see {@link Image#getStorageType}).
     * The returned string is owned by the {@code GtkImage} and should not
     * be freed.
     * @return the icon name
     */
    public @Nullable java.lang.String getIconName() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_image_get_icon_name.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Gets the icon size used by the {@code image} when rendering icons.
     * @return the image size used by icons
     */
    public org.gtk.gtk.IconSize getIconSize() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_image_get_icon_size.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.gtk.IconSize.of(RESULT);
    }
    
    /**
     * Gets the image {@code GdkPaintable} being displayed by the {@code GtkImage}.
     * <p>
     * The storage type of the image must be {@link ImageType#EMPTY} or
     * {@link ImageType#PAINTABLE} (see {@link Image#getStorageType}).
     * The caller of this function does not own a reference to the
     * returned paintable.
     * @return the displayed paintable
     */
    public @Nullable org.gtk.gdk.Paintable getPaintable() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_image_get_paintable.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gdk.Paintable) Interop.register(RESULT, org.gtk.gdk.Paintable.fromAddress).marshal(RESULT, null);
    }
    
    /**
     * Gets the pixel size used for named icons.
     * @return the pixel size used for named icons.
     */
    public int getPixelSize() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_image_get_pixel_size.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Gets the type of representation being used by the {@code GtkImage}
     * to store image data.
     * <p>
     * If the {@code GtkImage} has no image data, the return value will
     * be {@link ImageType#EMPTY}.
     * @return image representation being used
     */
    public org.gtk.gtk.ImageType getStorageType() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_image_get_storage_type.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.gtk.ImageType.of(RESULT);
    }
    
    /**
     * Sets a {@code GtkImage} to show a file.
     * <p>
     * See {@link Image#newFromFile} for details.
     * @param filename a filename
     */
    public void setFromFile(@Nullable java.lang.String filename) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.gtk_image_set_from_file.invokeExact(
                        handle(),
                        (Addressable) (filename == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(filename, SCOPE)));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
        }
    }
    
    /**
     * Sets a {@code GtkImage} to show a {@code GIcon}.
     * <p>
     * See {@link Image#newFromGicon} for details.
     * @param icon an icon
     */
    public void setFromGicon(org.gtk.gio.Icon icon) {
        try {
            DowncallHandles.gtk_image_set_from_gicon.invokeExact(
                    handle(),
                    icon.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets a {@code GtkImage} to show a named icon.
     * <p>
     * See {@link Image#newFromIconName} for details.
     * @param iconName an icon name
     */
    public void setFromIconName(@Nullable java.lang.String iconName) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.gtk_image_set_from_icon_name.invokeExact(
                        handle(),
                        (Addressable) (iconName == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(iconName, SCOPE)));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
        }
    }
    
    /**
     * Sets a {@code GtkImage} to show a {@code GdkPaintable}.
     * <p>
     * See {@link Image#newFromPaintable} for details.
     * @param paintable a {@code GdkPaintable}
     */
    public void setFromPaintable(@Nullable org.gtk.gdk.Paintable paintable) {
        try {
            DowncallHandles.gtk_image_set_from_paintable.invokeExact(
                    handle(),
                    (Addressable) (paintable == null ? MemoryAddress.NULL : paintable.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets a {@code GtkImage} to show a {@code GdkPixbuf}.
     * <p>
     * See {@link Image#newFromPixbuf} for details.
     * <p>
     * Note: This is a helper for {@link Image#setFromPaintable},
     * and you can't get back the exact pixbuf once this is called,
     * only a paintable.
     * @param pixbuf a {@code GdkPixbuf} or {@code NULL}
     */
    public void setFromPixbuf(@Nullable org.gtk.gdkpixbuf.Pixbuf pixbuf) {
        try {
            DowncallHandles.gtk_image_set_from_pixbuf.invokeExact(
                    handle(),
                    (Addressable) (pixbuf == null ? MemoryAddress.NULL : pixbuf.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets a {@code GtkImage} to show a resource.
     * <p>
     * See {@link Image#newFromResource} for details.
     * @param resourcePath a resource path
     */
    public void setFromResource(@Nullable java.lang.String resourcePath) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.gtk_image_set_from_resource.invokeExact(
                        handle(),
                        (Addressable) (resourcePath == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(resourcePath, SCOPE)));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
        }
    }
    
    /**
     * Suggests an icon size to the theme for named icons.
     * @param iconSize the new icon size
     */
    public void setIconSize(org.gtk.gtk.IconSize iconSize) {
        try {
            DowncallHandles.gtk_image_set_icon_size.invokeExact(
                    handle(),
                    iconSize.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the pixel size to use for named icons.
     * <p>
     * If the pixel size is set to a value != -1, it is used instead
     * of the icon size set by {@link Image#setFromIconName}.
     * @param pixelSize the new pixel size
     */
    public void setPixelSize(int pixelSize) {
        try {
            DowncallHandles.gtk_image_set_pixel_size.invokeExact(
                    handle(),
                    pixelSize);
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
            RESULT = (long) DowncallHandles.gtk_image_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * A {@link Image.Builder} object constructs a {@link Image} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link Image.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gtk.gtk.Widget.Builder {
        
        /**
         * Default constructor for a {@code Builder} object.
         */
        protected Builder() {
        }
        
        /**
         * Finish building the {@link Image} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link Image}.
         * @return A new instance of {@code Image} with the properties 
         *         that were set in the Builder object.
         */
        public Image build() {
            return (Image) org.gtk.gobject.GObject.newWithProperties(
                Image.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        /**
         * The `GFile to display.
         * @param file The value for the {@code file} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setFile(java.lang.String file) {
            names.add("file");
            values.add(org.gtk.gobject.Value.create(file));
            return this;
        }
        
        /**
         * The {@code GIcon} displayed in the GtkImage.
         * <p>
         * For themed icons, If the icon theme is changed, the image will be updated
         * automatically.
         * @param gicon The value for the {@code gicon} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setGicon(org.gtk.gio.Icon gicon) {
            names.add("gicon");
            values.add(org.gtk.gobject.Value.create(gicon));
            return this;
        }
        
        /**
         * The name of the icon in the icon theme.
         * <p>
         * If the icon theme is changed, the image will be updated automatically.
         * @param iconName The value for the {@code icon-name} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setIconName(java.lang.String iconName) {
            names.add("icon-name");
            values.add(org.gtk.gobject.Value.create(iconName));
            return this;
        }
        
        /**
         * The symbolic size to display icons at.
         * @param iconSize The value for the {@code icon-size} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setIconSize(org.gtk.gtk.IconSize iconSize) {
            names.add("icon-size");
            values.add(org.gtk.gobject.Value.create(iconSize));
            return this;
        }
        
        /**
         * The {@code GdkPaintable} to display.
         * @param paintable The value for the {@code paintable} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setPaintable(org.gtk.gdk.Paintable paintable) {
            names.add("paintable");
            values.add(org.gtk.gobject.Value.create(paintable));
            return this;
        }
        
        /**
         * The size in pixels to display icons at.
         * <p>
         * If set to a value != -1, this property overrides the
         * {@code Gtk.Image:icon-size} property for images of type
         * {@code GTK_IMAGE_ICON_NAME}.
         * @param pixelSize The value for the {@code pixel-size} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setPixelSize(int pixelSize) {
            names.add("pixel-size");
            values.add(org.gtk.gobject.Value.create(pixelSize));
            return this;
        }
        
        /**
         * A path to a resource file to display.
         * @param resource The value for the {@code resource} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setResource(java.lang.String resource) {
            names.add("resource");
            values.add(org.gtk.gobject.Value.create(resource));
            return this;
        }
        
        /**
         * The representation being used for image data.
         * @param storageType The value for the {@code storage-type} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setStorageType(org.gtk.gtk.ImageType storageType) {
            names.add("storage-type");
            values.add(org.gtk.gobject.Value.create(storageType));
            return this;
        }
        
        /**
         * Whether the icon displayed in the {@code GtkImage} will use
         * standard icon names fallback.
         * <p>
         * The value of this property is only relevant for images of type
         * {@link ImageType#ICON_NAME} and {@link ImageType#GICON}.
         * @param useFallback The value for the {@code use-fallback} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setUseFallback(boolean useFallback) {
            names.add("use-fallback");
            values.add(org.gtk.gobject.Value.create(useFallback));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_image_new = Interop.downcallHandle(
                "gtk_image_new",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_image_new_from_file = Interop.downcallHandle(
                "gtk_image_new_from_file",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_image_new_from_gicon = Interop.downcallHandle(
                "gtk_image_new_from_gicon",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_image_new_from_icon_name = Interop.downcallHandle(
                "gtk_image_new_from_icon_name",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_image_new_from_paintable = Interop.downcallHandle(
                "gtk_image_new_from_paintable",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_image_new_from_pixbuf = Interop.downcallHandle(
                "gtk_image_new_from_pixbuf",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_image_new_from_resource = Interop.downcallHandle(
                "gtk_image_new_from_resource",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_image_clear = Interop.downcallHandle(
                "gtk_image_clear",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_image_get_gicon = Interop.downcallHandle(
                "gtk_image_get_gicon",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_image_get_icon_name = Interop.downcallHandle(
                "gtk_image_get_icon_name",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_image_get_icon_size = Interop.downcallHandle(
                "gtk_image_get_icon_size",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_image_get_paintable = Interop.downcallHandle(
                "gtk_image_get_paintable",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_image_get_pixel_size = Interop.downcallHandle(
                "gtk_image_get_pixel_size",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_image_get_storage_type = Interop.downcallHandle(
                "gtk_image_get_storage_type",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_image_set_from_file = Interop.downcallHandle(
                "gtk_image_set_from_file",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_image_set_from_gicon = Interop.downcallHandle(
                "gtk_image_set_from_gicon",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_image_set_from_icon_name = Interop.downcallHandle(
                "gtk_image_set_from_icon_name",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_image_set_from_paintable = Interop.downcallHandle(
                "gtk_image_set_from_paintable",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_image_set_from_pixbuf = Interop.downcallHandle(
                "gtk_image_set_from_pixbuf",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_image_set_from_resource = Interop.downcallHandle(
                "gtk_image_set_from_resource",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_image_set_icon_size = Interop.downcallHandle(
                "gtk_image_set_icon_size",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gtk_image_set_pixel_size = Interop.downcallHandle(
                "gtk_image_set_pixel_size",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gtk_image_get_type = Interop.downcallHandle(
                "gtk_image_get_type",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG),
                false
        );
    }
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.gtk_image_get_type != null;
    }
}
