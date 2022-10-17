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
 * 
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
 * 
 * <h2>Sizing the paintable</h2>
 * You can influence how the paintable is displayed inside the {@code GtkPicture}.
 * By turning off {@code Gtk.Picture:keep-aspect-ratio} you can allow the
 * paintable to get stretched. {@code Gtk.Picture:can-shrink} can be unset
 * to make sure that paintables are never made smaller than their ideal size -
 * but be careful if you do not know the size of the paintable in use (like
 * when displaying user-loaded images). This can easily cause the picture to
 * grow larger than the screen. And {@code GtkWidget:halign} and
 * {@code GtkWidget:valign} can be used to make sure the paintable doesn't
 * fill all available space but is instead displayed at its original size.
 * 
 * <h2>CSS nodes</h2>
 * {@code GtkPicture} has a single CSS node with the name {@code picture}.
 * 
 * <h2>Accessibility</h2>
 * {@code GtkPicture} uses the {@code GTK_ACCESSIBLE_ROLE_IMG} role.
 */
public class Picture extends Widget implements Accessible, Buildable, ConstraintTarget {

    public Picture(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to Picture */
    public static Picture castFrom(org.gtk.gobject.Object gobject) {
        return new Picture(gobject.refcounted());
    }
    
    private static final MethodHandle gtk_picture_new = Interop.downcallHandle(
        "gtk_picture_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNew() {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gtk_picture_new.invokeExact(), false);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new empty {@code GtkPicture} widget.
     */
    public Picture() {
        super(constructNew());
    }
    
    private static final MethodHandle gtk_picture_new_for_file = Interop.downcallHandle(
        "gtk_picture_new_for_file",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNewForFile(@Nullable org.gtk.gio.File file) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gtk_picture_new_for_file.invokeExact(file.handle()), false);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
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
     */
    public static Picture newForFile(@Nullable org.gtk.gio.File file) {
        return new Picture(constructNewForFile(file));
    }
    
    private static final MethodHandle gtk_picture_new_for_filename = Interop.downcallHandle(
        "gtk_picture_new_for_filename",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNewForFilename(@Nullable java.lang.String filename) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gtk_picture_new_for_filename.invokeExact(Interop.allocateNativeString(filename)), false);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new {@code GtkPicture} displaying the file {@code filename}.
     * <p>
     * This is a utility function that calls {@link Picture#newForFile}.
     * See that function for details.
     */
    public static Picture newForFilename(@Nullable java.lang.String filename) {
        return new Picture(constructNewForFilename(filename));
    }
    
    private static final MethodHandle gtk_picture_new_for_paintable = Interop.downcallHandle(
        "gtk_picture_new_for_paintable",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNewForPaintable(@Nullable org.gtk.gdk.Paintable paintable) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gtk_picture_new_for_paintable.invokeExact(paintable.handle()), false);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new {@code GtkPicture} displaying {@code paintable}.
     * <p>
     * The {@code GtkPicture} will track changes to the {@code paintable} and update
     * its size and contents in response to it.
     */
    public static Picture newForPaintable(@Nullable org.gtk.gdk.Paintable paintable) {
        return new Picture(constructNewForPaintable(paintable));
    }
    
    private static final MethodHandle gtk_picture_new_for_pixbuf = Interop.downcallHandle(
        "gtk_picture_new_for_pixbuf",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNewForPixbuf(@Nullable org.gtk.gdkpixbuf.Pixbuf pixbuf) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gtk_picture_new_for_pixbuf.invokeExact(pixbuf.handle()), false);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new {@code GtkPicture} displaying {@code pixbuf}.
     * <p>
     * This is a utility function that calls {@link Picture#newForPaintable},
     * See that function for details.
     * <p>
     * The pixbuf must not be modified after passing it to this function.
     */
    public static Picture newForPixbuf(@Nullable org.gtk.gdkpixbuf.Pixbuf pixbuf) {
        return new Picture(constructNewForPixbuf(pixbuf));
    }
    
    private static final MethodHandle gtk_picture_new_for_resource = Interop.downcallHandle(
        "gtk_picture_new_for_resource",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNewForResource(@Nullable java.lang.String resourcePath) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gtk_picture_new_for_resource.invokeExact(Interop.allocateNativeString(resourcePath)), false);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new {@code GtkPicture} displaying the resource at {@code resource_path}.
     * <p>
     * This is a utility function that calls {@link Picture#newForFile}.
     * See that function for details.
     */
    public static Picture newForResource(@Nullable java.lang.String resourcePath) {
        return new Picture(constructNewForResource(resourcePath));
    }
    
    private static final MethodHandle gtk_picture_get_alternative_text = Interop.downcallHandle(
        "gtk_picture_get_alternative_text",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the alternative textual description of the picture.
     * <p>
     * The returned string will be {@code null} if the picture cannot be described textually.
     */
    public @Nullable java.lang.String getAlternativeText() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gtk_picture_get_alternative_text.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT.getUtf8String(0);
    }
    
    private static final MethodHandle gtk_picture_get_can_shrink = Interop.downcallHandle(
        "gtk_picture_get_can_shrink",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns whether the {@code GtkPicture} respects its contents size.
     */
    public boolean getCanShrink() {
        int RESULT;
        try {
            RESULT = (int) gtk_picture_get_can_shrink.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle gtk_picture_get_file = Interop.downcallHandle(
        "gtk_picture_get_file",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the {@code GFile} currently displayed if {@code self} is displaying a file.
     * <p>
     * If {@code self} is not displaying a file, for example when
     * {@link Picture#setPaintable} was used, then {@code null} is returned.
     */
    public @Nullable org.gtk.gio.File getFile() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gtk_picture_get_file.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gio.File.FileImpl(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle gtk_picture_get_keep_aspect_ratio = Interop.downcallHandle(
        "gtk_picture_get_keep_aspect_ratio",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns whether the {@code GtkPicture} preserves its contents aspect ratio.
     */
    public boolean getKeepAspectRatio() {
        int RESULT;
        try {
            RESULT = (int) gtk_picture_get_keep_aspect_ratio.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle gtk_picture_get_paintable = Interop.downcallHandle(
        "gtk_picture_get_paintable",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the {@code GdkPaintable} being displayed by the {@code GtkPicture}.
     */
    public @Nullable org.gtk.gdk.Paintable getPaintable() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gtk_picture_get_paintable.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gdk.Paintable.PaintableImpl(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle gtk_picture_set_alternative_text = Interop.downcallHandle(
        "gtk_picture_set_alternative_text",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets an alternative textual description for the picture contents.
     * <p>
     * It is equivalent to the "alt" attribute for images on websites.
     * <p>
     * This text will be made available to accessibility tools.
     * <p>
     * If the picture cannot be described textually, set this property to {@code null}.
     */
    public @NotNull void setAlternativeText(@Nullable java.lang.String alternativeText) {
        try {
            gtk_picture_set_alternative_text.invokeExact(handle(), Interop.allocateNativeString(alternativeText));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_picture_set_can_shrink = Interop.downcallHandle(
        "gtk_picture_set_can_shrink",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
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
     * {@code Gtk.Widget.set_valign}.
     */
    public @NotNull void setCanShrink(@NotNull boolean canShrink) {
        try {
            gtk_picture_set_can_shrink.invokeExact(handle(), canShrink ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_picture_set_file = Interop.downcallHandle(
        "gtk_picture_set_file",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Makes {@code self} load and display {@code file}.
     * <p>
     * See {@link Picture#newForFile} for details.
     */
    public @NotNull void setFile(@Nullable org.gtk.gio.File file) {
        try {
            gtk_picture_set_file.invokeExact(handle(), file.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_picture_set_filename = Interop.downcallHandle(
        "gtk_picture_set_filename",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Makes {@code self} load and display the given {@code filename}.
     * <p>
     * This is a utility function that calls {@link Picture#setFile}.
     */
    public @NotNull void setFilename(@Nullable java.lang.String filename) {
        try {
            gtk_picture_set_filename.invokeExact(handle(), Interop.allocateNativeString(filename));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_picture_set_keep_aspect_ratio = Interop.downcallHandle(
        "gtk_picture_set_keep_aspect_ratio",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * If set to {@code true}, the {@code self} will render its contents according to
     * their aspect ratio.
     * <p>
     * That means that empty space may show up at the top/bottom or
     * left/right of {@code self}.
     * <p>
     * If set to {@code false} or if the contents provide no aspect ratio,
     * the contents will be stretched over the picture's whole area.
     */
    public @NotNull void setKeepAspectRatio(@NotNull boolean keepAspectRatio) {
        try {
            gtk_picture_set_keep_aspect_ratio.invokeExact(handle(), keepAspectRatio ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_picture_set_paintable = Interop.downcallHandle(
        "gtk_picture_set_paintable",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Makes {@code self} display the given {@code paintable}.
     * <p>
     * If {@code paintable} is {@code null}, nothing will be displayed.
     * <p>
     * See {@link Picture#newForPaintable} for details.
     */
    public @NotNull void setPaintable(@Nullable org.gtk.gdk.Paintable paintable) {
        try {
            gtk_picture_set_paintable.invokeExact(handle(), paintable.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_picture_set_pixbuf = Interop.downcallHandle(
        "gtk_picture_set_pixbuf",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets a {@code GtkPicture} to show a {@code GdkPixbuf}.
     * <p>
     * See {@link Picture#newForPixbuf} for details.
     * <p>
     * This is a utility function that calls {@link Picture#setPaintable}.
     */
    public @NotNull void setPixbuf(@Nullable org.gtk.gdkpixbuf.Pixbuf pixbuf) {
        try {
            gtk_picture_set_pixbuf.invokeExact(handle(), pixbuf.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_picture_set_resource = Interop.downcallHandle(
        "gtk_picture_set_resource",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Makes {@code self} load and display the resource at the given
     * {@code resource_path}.
     * <p>
     * This is a utility function that calls {@link Picture#setFile}.
     */
    public @NotNull void setResource(@Nullable java.lang.String resourcePath) {
        try {
            gtk_picture_set_resource.invokeExact(handle(), Interop.allocateNativeString(resourcePath));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
