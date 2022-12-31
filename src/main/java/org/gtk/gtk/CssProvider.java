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
public class CssProvider extends org.gtk.gobject.GObject implements org.gtk.gtk.StyleProvider {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkCssProvider";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gtk.gobject.GObject.getMemoryLayout().withName("parent_instance")
        ).withName(C_TYPE_NAME);
    }
    
    /**
     * Create a CssProvider proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected CssProvider(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, CssProvider> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new CssProvider(input, ownership);
    
    private static MemoryAddress constructNew() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_css_provider_new.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Returns a newly created {@code GtkCssProvider}.
     */
    public CssProvider() {
        super(constructNew(), Ownership.FULL);
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
    public void loadFromFile(org.gtk.gio.File file) {
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
    public void loadFromPath(java.lang.String path) {
        try {
            DowncallHandles.gtk_css_provider_load_from_path.invokeExact(
                    handle(),
                    Marshal.stringToAddress.marshal(path, null));
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
    public void loadFromResource(java.lang.String resourcePath) {
        try {
            DowncallHandles.gtk_css_provider_load_from_resource.invokeExact(
                    handle(),
                    Marshal.stringToAddress.marshal(resourcePath, null));
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
    public void loadNamed(java.lang.String name, @Nullable java.lang.String variant) {
        try {
            DowncallHandles.gtk_css_provider_load_named.invokeExact(
                    handle(),
                    Marshal.stringToAddress.marshal(name, null),
                    (Addressable) (variant == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(variant, null)));
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
    public java.lang.String toString() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_css_provider_to_string.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gtk_css_provider_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    @FunctionalInterface
    public interface ParsingError {
        void run(org.gtk.gtk.CssSection section, org.gtk.glib.Error error);

        @ApiStatus.Internal default void upcall(MemoryAddress sourceCssProvider, MemoryAddress section, MemoryAddress error) {
            run(org.gtk.gtk.CssSection.fromAddress.marshal(section, Ownership.NONE), org.gtk.glib.Error.fromAddress.marshal(error, Ownership.NONE));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(ParsingError.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
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
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<CssProvider.ParsingError> onParsingError(CssProvider.ParsingError handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("parsing-error"), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * A {@link CssProvider.Builder} object constructs a {@link CssProvider} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link CssProvider.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gtk.gobject.GObject.Builder {
        
        protected Builder() {
        }
        
        /**
         * Finish building the {@link CssProvider} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link CssProvider}.
         * @return A new instance of {@code CssProvider} with the properties 
         *         that were set in the Builder object.
         */
        public CssProvider build() {
            return (CssProvider) org.gtk.gobject.GObject.newWithProperties(
                CssProvider.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_css_provider_new = Interop.downcallHandle(
            "gtk_css_provider_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_css_provider_load_from_data = Interop.downcallHandle(
            "gtk_css_provider_load_from_data",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle gtk_css_provider_load_from_file = Interop.downcallHandle(
            "gtk_css_provider_load_from_file",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_css_provider_load_from_path = Interop.downcallHandle(
            "gtk_css_provider_load_from_path",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_css_provider_load_from_resource = Interop.downcallHandle(
            "gtk_css_provider_load_from_resource",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_css_provider_load_named = Interop.downcallHandle(
            "gtk_css_provider_load_named",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_css_provider_to_string = Interop.downcallHandle(
            "gtk_css_provider_to_string",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_css_provider_get_type = Interop.downcallHandle(
            "gtk_css_provider_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}
