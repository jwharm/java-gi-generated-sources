package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
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

    public CssProvider(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to CssProvider */
    public static CssProvider castFrom(org.gtk.gobject.Object gobject) {
        return new CssProvider(gobject.getReference());
    }
    
    private static Reference constructNew() {
        Reference RESULT = References.get(gtk_h.gtk_css_provider_new(), true);
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
     */
    public void loadFromData(byte[] data, long length) {
        gtk_h.gtk_css_provider_load_from_data(handle(), new MemorySegmentReference(Interop.getAllocator().allocateArray(ValueLayout.JAVA_BYTE, data)).handle(), length);
    }
    
    /**
     * Loads the data contained in {@code file} into {@code css_provider}.
     * <p>
     * This clears any previously loaded information.
     */
    public void loadFromFile(org.gtk.gio.File file) {
        gtk_h.gtk_css_provider_load_from_file(handle(), file.handle());
    }
    
    /**
     * Loads the data contained in {@code path} into {@code css_provider}.
     * <p>
     * This clears any previously loaded information.
     */
    public void loadFromPath(java.lang.String path) {
        gtk_h.gtk_css_provider_load_from_path(handle(), Interop.allocateNativeString(path).handle());
    }
    
    /**
     * Loads the data contained in the resource at {@code resource_path} into
     * the {@code css_provider}.
     * <p>
     * This clears any previously loaded information.
     */
    public void loadFromResource(java.lang.String resourcePath) {
        gtk_h.gtk_css_provider_load_from_resource(handle(), Interop.allocateNativeString(resourcePath).handle());
    }
    
    /**
     * Loads a theme from the usual theme paths.
     * <p>
     * The actual process of finding the theme might change between
     * releases, but it is guaranteed that this function uses the same
     * mechanism to load the theme that GTK uses for loading its own theme.
     */
    public void loadNamed(java.lang.String name, java.lang.String variant) {
        gtk_h.gtk_css_provider_load_named(handle(), Interop.allocateNativeString(name).handle(), Interop.allocateNativeString(variant).handle());
    }
    
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
        var RESULT = gtk_h.gtk_css_provider_to_string(handle());
        return RESULT.getUtf8String(0);
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
            var RESULT = gtk_h.g_signal_connect_data(
                handle(),
                Interop.allocateNativeString("parsing-error").handle(),
                Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(CssProvider.class, "__signalCssProviderParsingError",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.getAllocator().allocate(C_INT, Interop.registerCallback(handler.hashCode(), handler)),
                MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
    
    public static void __signalCssProviderParsingError(MemoryAddress source, MemoryAddress section, MemoryAddress error, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (CssProvider.ParsingErrorHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new CssProvider(References.get(source)), new CssSection(References.get(section, false)), new org.gtk.glib.Error(References.get(error, false)));
    }
    
}
