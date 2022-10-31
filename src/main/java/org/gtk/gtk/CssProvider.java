package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@code GtkCssProvider} is an object implementing the {@code GtkStyleProvider} interface
 * for CSS.
 * <p>
 * It is able to parse CSS-like input in order to style widgets.
 * <p>
 * An application can make GTK parse a specific CSS style sheet by calling
 * {@link CssProvider#loadFromFile} or
 * {@link CssProvider#loadFromResource}
 * and adding the provider with {@link StyleContext#addProvider} or
 * {@link StyleContext#addProviderForDisplay}.
 * <p>
 * In addition, certain files will be read when GTK is initialized.
 * First, the file {@code $XDG_CONFIG_HOME/gtk-4.0/gtk.css} is loaded if it
 * exists. Then, GTK loads the first existing file among
 * {@code XDG_DATA_HOME/themes/THEME/gtk-VERSION/gtk-VARIANT.css},
 * {@code $HOME/.themes/THEME/gtk-VERSION/gtk-VARIANT.css},
 * {@code $XDG_DATA_DIRS/themes/THEME/gtk-VERSION/gtk-VARIANT.css} and
 * {@code DATADIR/share/themes/THEME/gtk-VERSION/gtk-VARIANT.css},
 * where {@code THEME} is the name of the current theme (see the
 * {@code Gtk.Settings:gtk-theme-name} setting), {@code VARIANT} is the
 * variant to load (see the
 * {@code Gtk.Settings:gtk-application-prefer-dark-theme} setting),
 * {@code DATADIR} is the prefix configured when GTK was compiled (unless
 * overridden by the {@code GTK_DATA_PREFIX} environment variable), and
 * {@code VERSION} is the GTK version number. If no file is found for the
 * current version, GTK tries older versions all the way back to 4.0.
 * <p>
 * To track errors while loading CSS, connect to the
 * {@code Gtk.CssProvider::parsing-error} signal.
 */
public class CssProvider extends org.gtk.gobject.Object implements org.gtk.gtk.StyleProvider {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkCssProvider";
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gobject.Object.getMemoryLayout().withName("parent_instance")
    ).withName(C_TYPE_NAME);
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    /**
     * Get the value of the field {@code parent_instance}
     * @return The value of the field {@code parent_instance}
     */
    public org.gtk.gobject.Object parent_instance$get() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent_instance"));
        return new org.gtk.gobject.Object(Refcounted.get(((MemoryAddress) handle()).addOffset(OFFSET), false));
    }
    
    @ApiStatus.Internal
    public CssProvider(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /**
     * Cast object to CssProvider if its GType is a (or inherits from) "GtkCssProvider".
     * @param  gobject            An object that inherits from GObject
     * @return                    An instance of "CssProvider" that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GtkCssProvider", a ClassCastException will be thrown.
     */
    public static CssProvider castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("GtkCssProvider"))) {
            return new CssProvider(gobject.refcounted());
        } else {
            throw new ClassCastException("Object type is not an instance of GtkCssProvider");
        }
    }
    
    private static Refcounted constructNew() {
        Refcounted RESULT;
        try {
            RESULT = Refcounted.get((MemoryAddress) DowncallHandles.gtk_css_provider_new.invokeExact(), true);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Returns a newly created {@code GtkCssProvider}.
     */
    public CssProvider() {
        super(constructNew());
    }
    
    /**
     * Loads {@code data} into {@code css_provider}.
     * <p>
     * This clears any previously loaded information.
     * @param data CSS data loaded in memory
     * @param length the length of {@code data} in bytes, or -1 for NUL terminated strings. If
     *   {@code length} is not -1, the code will assume it is not NUL terminated and will
     *   potentially do a copy.
     */
    public void loadFromData(byte[] data, long length) {
        java.util.Objects.requireNonNull(data, "Parameter 'data' must not be null");
        try {
            DowncallHandles.gtk_css_provider_load_from_data.invokeExact(
                    handle(),
                    Interop.allocateNativeArray(data, false),
                    length);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Loads the data contained in {@code file} into {@code css_provider}.
     * <p>
     * This clears any previously loaded information.
     * @param file {@code GFile} pointing to a file to load
     */
    public void loadFromFile(@NotNull org.gtk.gio.File file) {
        java.util.Objects.requireNonNull(file, "Parameter 'file' must not be null");
        try {
            DowncallHandles.gtk_css_provider_load_from_file.invokeExact(
                    handle(),
                    file.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Loads the data contained in {@code path} into {@code css_provider}.
     * <p>
     * This clears any previously loaded information.
     * @param path the path of a filename to load, in the GLib filename encoding
     */
    public void loadFromPath(@NotNull java.lang.String path) {
        java.util.Objects.requireNonNull(path, "Parameter 'path' must not be null");
        try {
            DowncallHandles.gtk_css_provider_load_from_path.invokeExact(
                    handle(),
                    Interop.allocateNativeString(path));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Loads the data contained in the resource at {@code resource_path} into
     * the {@code css_provider}.
     * <p>
     * This clears any previously loaded information.
     * @param resourcePath a {@code GResource} resource path
     */
    public void loadFromResource(@NotNull java.lang.String resourcePath) {
        java.util.Objects.requireNonNull(resourcePath, "Parameter 'resourcePath' must not be null");
        try {
            DowncallHandles.gtk_css_provider_load_from_resource.invokeExact(
                    handle(),
                    Interop.allocateNativeString(resourcePath));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Loads a theme from the usual theme paths.
     * <p>
     * The actual process of finding the theme might change between
     * releases, but it is guaranteed that this function uses the same
     * mechanism to load the theme that GTK uses for loading its own theme.
     * @param name A theme name
     * @param variant variant to load, for example, "dark", or
     *   {@code null} for the default
     */
    public void loadNamed(@NotNull java.lang.String name, @Nullable java.lang.String variant) {
        java.util.Objects.requireNonNull(name, "Parameter 'name' must not be null");
        try {
            DowncallHandles.gtk_css_provider_load_named.invokeExact(
                    handle(),
                    Interop.allocateNativeString(name),
                    (Addressable) (variant == null ? MemoryAddress.NULL : Interop.allocateNativeString(variant)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Converts the {@code provider} into a string representation in CSS
     * format.
     * <p>
     * Using {@link CssProvider#loadFromData} with the return
     * value from this function on a new provider created with
     * {@link CssProvider#CssProvider} will basically create a duplicate
     * of this {@code provider}.
     * @return a new string representing the {@code provider}.
     */
    public @NotNull java.lang.String toString() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_css_provider_to_string.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    @FunctionalInterface
    public interface ParsingError {
        void signalReceived(CssProvider source, @NotNull org.gtk.gtk.CssSection section, @NotNull org.gtk.glib.Error error);
    }
    
    /**
     * Signals that a parsing error occurred.
     * <p>
     * The {@code path}, {@code line} and {@code position} describe the actual location of
     * the error as accurately as possible.
     * <p>
     * Parsing errors are never fatal, so the parsing will resume after
     * the error. Errors may however cause parts of the given data or
     * even all of it to not be parsed at all. So it is a useful idea
     * to check that the parsing succeeds by connecting to this signal.
     * <p>
     * Note that this signal may be emitted at any time as the css provider
     * may opt to defer parsing parts or all of the input to a later time
     * than when a loading function was called.
     */
    public Signal<CssProvider.ParsingError> onParsingError(CssProvider.ParsingError handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("parsing-error"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(CssProvider.Callbacks.class, "signalCssProviderParsingError",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<CssProvider.ParsingError>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_css_provider_new = Interop.downcallHandle(
            "gtk_css_provider_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_css_provider_load_from_data = Interop.downcallHandle(
            "gtk_css_provider_load_from_data",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
        );
        
        private static final MethodHandle gtk_css_provider_load_from_file = Interop.downcallHandle(
            "gtk_css_provider_load_from_file",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_css_provider_load_from_path = Interop.downcallHandle(
            "gtk_css_provider_load_from_path",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_css_provider_load_from_resource = Interop.downcallHandle(
            "gtk_css_provider_load_from_resource",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_css_provider_load_named = Interop.downcallHandle(
            "gtk_css_provider_load_named",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_css_provider_to_string = Interop.downcallHandle(
            "gtk_css_provider_to_string",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
    }
    
    private static class Callbacks {
        
        public static void signalCssProviderParsingError(MemoryAddress source, MemoryAddress section, MemoryAddress error, MemoryAddress data) {
            int HASH = data.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (CssProvider.ParsingError) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new CssProvider(Refcounted.get(source)), new org.gtk.gtk.CssSection(Refcounted.get(section, false)), new org.gtk.glib.Error(Refcounted.get(error, false)));
        }
    }
}
