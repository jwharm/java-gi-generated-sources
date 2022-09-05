package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * `GtkCssProvider` is an object implementing the `GtkStyleProvider` interface
 * for CSS.
 * 
 * It is able to parse CSS-like input in order to style widgets.
 * 
 * An application can make GTK parse a specific CSS style sheet by calling
 * [method@Gtk.CssProvider.load_from_file] or
 * [method@Gtk.CssProvider.load_from_resource]
 * and adding the provider with [method@Gtk.StyleContext.add_provider] or
 * [func@Gtk.StyleContext.add_provider_for_display].
 * 
 * In addition, certain files will be read when GTK is initialized.
 * First, the file `$XDG_CONFIG_HOME/gtk-4.0/gtk.css` is loaded if it
 * exists. Then, GTK loads the first existing file among
 * `XDG_DATA_HOME/themes/THEME/gtk-VERSION/gtk-VARIANT.css`,
 * `$HOME/.themes/THEME/gtk-VERSION/gtk-VARIANT.css`,
 * `$XDG_DATA_DIRS/themes/THEME/gtk-VERSION/gtk-VARIANT.css` and
 * `DATADIR/share/themes/THEME/gtk-VERSION/gtk-VARIANT.css`,
 * where `THEME` is the name of the current theme (see the
 * [property@Gtk.Settings:gtk-theme-name] setting), `VARIANT` is the
 * variant to load (see the
 * [property@Gtk.Settings:gtk-application-prefer-dark-theme] setting),
 * `DATADIR` is the prefix configured when GTK was compiled (unless
 * overridden by the `GTK_DATA_PREFIX` environment variable), and
 * `VERSION` is the GTK version number. If no file is found for the
 * current version, GTK tries older versions all the way back to 4.0.
 * 
 * To track errors while loading CSS, connect to the
 * [signal@Gtk.CssProvider::parsing-error] signal.
 */
public class CssProvider extends org.gtk.gobject.Object implements StyleProvider {

    public CssProvider(io.github.jwharm.javagi.interop.Proxy proxy) {
        super(proxy);
    }
    
    /** Cast object to CssProvider */
    public static CssProvider castFrom(org.gtk.gobject.Object gobject) {
        return new CssProvider(gobject.getProxy());
    }
    
    /**
     * Returns a newly created `GtkCssProvider`.
     */
    public CssProvider() {
        super(ProxyFactory.getProxy(io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_css_provider_new(), true));
    }
    
    /**
     * Loads @data into @css_provider.
     * 
     * This clears any previously loaded information.
     */
    public void loadFromData(byte[] data, long length) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_css_provider_load_from_data(HANDLE(), Interop.getAllocator().allocateArray(ValueLayout.JAVA_BYTE, data), length);
    }
    
    /**
     * Loads the data contained in @file into @css_provider.
     * 
     * This clears any previously loaded information.
     */
    public void loadFromFile(org.gtk.gio.File file) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_css_provider_load_from_file(HANDLE(), file.HANDLE());
    }
    
    /**
     * Loads the data contained in @path into @css_provider.
     * 
     * This clears any previously loaded information.
     */
    public void loadFromPath(java.lang.String path) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_css_provider_load_from_path(HANDLE(), Interop.getAllocator().allocateUtf8String(path));
    }
    
    /**
     * Loads the data contained in the resource at @resource_path into
     * the @css_provider.
     * 
     * This clears any previously loaded information.
     */
    public void loadFromResource(java.lang.String resourcePath) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_css_provider_load_from_resource(HANDLE(), Interop.getAllocator().allocateUtf8String(resourcePath));
    }
    
    /**
     * Loads a theme from the usual theme paths.
     * 
     * The actual process of finding the theme might change between
     * releases, but it is guaranteed that this function uses the same
     * mechanism to load the theme that GTK uses for loading its own theme.
     */
    public void loadNamed(java.lang.String name, java.lang.String variant) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_css_provider_load_named(HANDLE(), Interop.getAllocator().allocateUtf8String(name), Interop.getAllocator().allocateUtf8String(variant));
    }
    
    /**
     * Converts the @provider into a string representation in CSS
     * format.
     * 
     * Using [method@Gtk.CssProvider.load_from_data] with the return
     * value from this function on a new provider created with
     * [ctor@Gtk.CssProvider.new] will basically create a duplicate
     * of this @provider.
     */
    public java.lang.String toString() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_css_provider_to_string(HANDLE());
        return RESULT.getUtf8String(0);
    }
    
    @FunctionalInterface
    public interface ParsingErrorHandler {
        void signalReceived(CssProvider source, CssSection section, org.gtk.glib.Error error);
    }
    
    /**
     * Signals that a parsing error occurred.
     * 
     * The @path, @line and @position describe the actual location of
     * the error as accurately as possible.
     * 
     * Parsing errors are never fatal, so the parsing will resume after
     * the error. Errors may however cause parts of the given data or
     * even all of it to not be parsed at all. So it is a useful idea
     * to check that the parsing succeeds by connecting to this signal.
     * 
     * Note that this signal may be emitted at any time as the css provider
     * may opt to defer parsing parts or all of the input to a later time
     * than when a loading function was called.
     */
    public void onParsingError(ParsingErrorHandler handler) {
        try {
            int hash = handler.hashCode();
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalCssProviderParsingError", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            io.github.jwharm.javagi.interop.jextract.gtk_h.g_signal_connect_data(this.HANDLE(), Interop.getAllocator().allocateUtf8String("parsing-error"), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
}
