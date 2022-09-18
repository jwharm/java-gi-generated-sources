package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * <code>GtkCssProvider</code> is an object implementing the <code>GtkStyleProvider</code> interface
 * for CSS.
 * <p>
 * It is able to parse CSS-like input in order to style widgets.
 * <p>
 * An application can make GTK parse a specific CSS style sheet by calling
 * {@link org.gtk.gtk.CssProvider<code>#loadFromFile</code>  or
 * {@link org.gtk.gtk.CssProvider<code>#loadFromResource</code> 
 * and adding the provider with {@link org.gtk.gtk.StyleContext<code>#addProvider</code>  or
 * {@link Gtk<code>#StyleContext</code> .
 * <p>
 * In addition, certain files will be read when GTK is initialized.
 * First, the file <code>$XDG_CONFIG_HOME/gtk-4.0/gtk.css</code> is loaded if it
 * exists. Then, GTK loads the first existing file among<code>XDG_DATA_HOME/themes/THEME/gtk-VERSION/gtk-VARIANT.css</code>,<code>$HOME/.themes/THEME/gtk-VERSION/gtk-VARIANT.css</code>,<code>$XDG_DATA_DIRS/themes/THEME/gtk-VERSION/gtk-VARIANT.css</code> and<code>DATADIR/share/themes/THEME/gtk-VERSION/gtk-VARIANT.css</code>,
 * where <code>THEME</code> is the name of the current theme (see the
 * {@link [property@Gtk.Settings:gtk-theme-name] (ref=property)} setting), <code>VARIANT</code> is the
 * variant to load (see the
 * {@link [property@Gtk.Settings:gtk-application-prefer-dark-theme] (ref=property)} setting),<code>DATADIR</code> is the prefix configured when GTK was compiled (unless
 * overridden by the <code>GTK_DATA_PREFIX</code> environment variable), and<code>VERSION</code> is the GTK version number. If no file is found for the
 * current version, GTK tries older versions all the way back to 4.0.
 * 
 * To track errors while loading CSS, connect to the
 * {@link [signal@Gtk.CssProvider::parsing-error] (ref=signal)} signal.
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
     * Returns a newly created <code>GtkCssProvider</code>.
     */
    public CssProvider() {
        super(constructNew());
    }
    
    /**
     * Loads @data into @css_provider.
     * 
     * This clears any previously loaded information.
     */
    public void loadFromData(byte[] data, long length) {
        gtk_h.gtk_css_provider_load_from_data(handle(), new MemorySegmentReference(Interop.getAllocator().allocateArray(ValueLayout.JAVA_BYTE, data)).handle(), length);
    }
    
    /**
     * Loads the data contained in @file into @css_provider.
     * 
     * This clears any previously loaded information.
     */
    public void loadFromFile(org.gtk.gio.File file) {
        gtk_h.gtk_css_provider_load_from_file(handle(), file.handle());
    }
    
    /**
     * Loads the data contained in @path into @css_provider.
     * 
     * This clears any previously loaded information.
     */
    public void loadFromPath(java.lang.String path) {
        gtk_h.gtk_css_provider_load_from_path(handle(), Interop.allocateNativeString(path).handle());
    }
    
    /**
     * Loads the data contained in the resource at @resource_path into
     * the @css_provider.
     * 
     * This clears any previously loaded information.
     */
    public void loadFromResource(java.lang.String resourcePath) {
        gtk_h.gtk_css_provider_load_from_resource(handle(), Interop.allocateNativeString(resourcePath).handle());
    }
    
    /**
     * Loads a theme from the usual theme paths.
     * 
     * The actual process of finding the theme might change between
     * releases, but it is guaranteed that this function uses the same
     * mechanism to load the theme that GTK uses for loading its own theme.
     */
    public void loadNamed(java.lang.String name, java.lang.String variant) {
        gtk_h.gtk_css_provider_load_named(handle(), Interop.allocateNativeString(name).handle(), Interop.allocateNativeString(variant).handle());
    }
    
    /**
     * Converts the @provider into a string representation in CSS
     * format.
     * 
     * Using {@link org.gtk.gtk.CssProvider<code>#loadFromData</code>  with the return
     * value from this function on a new provider created with
     * {@link [ctor@Gtk.CssProvider.new] (ref=ctor)} will basically create a duplicate
     * of this @provider.
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
    public SignalHandle onParsingError(ParsingErrorHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalCssProviderParsingError", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("parsing-error").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
}
