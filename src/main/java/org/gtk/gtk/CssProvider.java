package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

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
 * {@link Gtk#StyleContext}.
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
public class CssProvider extends org.gtk.gobject.Object implements StyleProvider {

    public CssProvider(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to CssProvider */
    public static CssProvider castFrom(org.gtk.gobject.Object gobject) {
        return new CssProvider(gobject.refcounted());
    }
    
    static final MethodHandle gtk_css_provider_new = Interop.downcallHandle(
        "gtk_css_provider_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNew() {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gtk_css_provider_new.invokeExact(), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Returns a newly created {@code GtkCssProvider}.
     */
    public CssProvider() {
        super(constructNew());
    }
    
    static final MethodHandle gtk_css_provider_load_from_data = Interop.downcallHandle(
        "gtk_css_provider_load_from_data",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
    );
    
    /**
     * Loads {@code data} into {@code css_provider}.
     * <p>
     * This clears any previously loaded information.
     */
    public void loadFromData(byte[] data, long length) {
        try {
            gtk_css_provider_load_from_data.invokeExact(handle(), Interop.allocateNativeArray(data).handle(), length);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_css_provider_load_from_file = Interop.downcallHandle(
        "gtk_css_provider_load_from_file",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Loads the data contained in {@code file} into {@code css_provider}.
     * <p>
     * This clears any previously loaded information.
     */
    public void loadFromFile(org.gtk.gio.File file) {
        try {
            gtk_css_provider_load_from_file.invokeExact(handle(), file.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_css_provider_load_from_path = Interop.downcallHandle(
        "gtk_css_provider_load_from_path",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Loads the data contained in {@code path} into {@code css_provider}.
     * <p>
     * This clears any previously loaded information.
     */
    public void loadFromPath(java.lang.String path) {
        try {
            gtk_css_provider_load_from_path.invokeExact(handle(), Interop.allocateNativeString(path).handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_css_provider_load_from_resource = Interop.downcallHandle(
        "gtk_css_provider_load_from_resource",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Loads the data contained in the resource at {@code resource_path} into
     * the {@code css_provider}.
     * <p>
     * This clears any previously loaded information.
     */
    public void loadFromResource(java.lang.String resourcePath) {
        try {
            gtk_css_provider_load_from_resource.invokeExact(handle(), Interop.allocateNativeString(resourcePath).handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_css_provider_load_named = Interop.downcallHandle(
        "gtk_css_provider_load_named",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Loads a theme from the usual theme paths.
     * <p>
     * The actual process of finding the theme might change between
     * releases, but it is guaranteed that this function uses the same
     * mechanism to load the theme that GTK uses for loading its own theme.
     */
    public void loadNamed(java.lang.String name, java.lang.String variant) {
        try {
            gtk_css_provider_load_named.invokeExact(handle(), Interop.allocateNativeString(name).handle(), Interop.allocateNativeString(variant).handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_css_provider_to_string = Interop.downcallHandle(
        "gtk_css_provider_to_string",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Converts the {@code provider} into a string representation in CSS
     * format.
     * <p>
     * Using {@link CssProvider#loadFromData} with the return
     * value from this function on a new provider created with
     * {@link CssProvider#CssProvider} will basically create a duplicate
     * of this {@code provider}.
     */
    public java.lang.String toString() {
        try {
            var RESULT = (MemoryAddress) gtk_css_provider_to_string.invokeExact(handle());
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface ParsingErrorHandler {
        void signalReceived(CssProvider source, CssSection section, org.gtk.glib.Error error);
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
    public SignalHandle onParsingError(ParsingErrorHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("parsing-error").handle(),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(CssProvider.Callbacks.class, "signalCssProviderParsingError",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    public static class Callbacks {
    
        public static void signalCssProviderParsingError(MemoryAddress source, MemoryAddress section, MemoryAddress error, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (CssProvider.ParsingErrorHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new CssProvider(Refcounted.get(source)), new CssSection(Refcounted.get(section, false)), new org.gtk.glib.Error(Refcounted.get(error, false)));
        }
        
    }
}
