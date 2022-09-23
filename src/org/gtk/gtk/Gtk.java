package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

public final class Gtk {
    
    public static final int ACCESSIBLE_VALUE_UNDEFINED = -1;

    public static final int BINARY_AGE = 607;

    public static final java.lang.String IM_MODULE_EXTENSION_POINT_NAME = "gtk-im-module";

    public static final int INPUT_ERROR = -1;

    public static final int INTERFACE_AGE = 7;

    public static final java.lang.String LEVEL_BAR_OFFSET_FULL = "full";

    public static final java.lang.String LEVEL_BAR_OFFSET_HIGH = "high";

    public static final java.lang.String LEVEL_BAR_OFFSET_LOW = "low";

    public static final int MAJOR_VERSION = 4;

    public static final int MAX_COMPOSE_LEN = 7;

    public static final java.lang.String MEDIA_FILE_EXTENSION_POINT_NAME = "gtk-media-file";

    public static final int MICRO_VERSION = 7;

    public static final int MINOR_VERSION = 6;

    public static final java.lang.String PAPER_NAME_A3 = "iso_a3";

    public static final java.lang.String PAPER_NAME_A4 = "iso_a4";

    public static final java.lang.String PAPER_NAME_A5 = "iso_a5";

    public static final java.lang.String PAPER_NAME_B5 = "iso_b5";

    public static final java.lang.String PAPER_NAME_EXECUTIVE = "na_executive";

    public static final java.lang.String PAPER_NAME_LEGAL = "na_legal";

    public static final java.lang.String PAPER_NAME_LETTER = "na_letter";

    public static final java.lang.String PRINT_SETTINGS_COLLATE = "collate";

    public static final java.lang.String PRINT_SETTINGS_DEFAULT_SOURCE = "default-source";

    public static final java.lang.String PRINT_SETTINGS_DITHER = "dither";

    public static final java.lang.String PRINT_SETTINGS_DUPLEX = "duplex";

    public static final java.lang.String PRINT_SETTINGS_FINISHINGS = "finishings";

    public static final java.lang.String PRINT_SETTINGS_MEDIA_TYPE = "media-type";

    public static final java.lang.String PRINT_SETTINGS_NUMBER_UP = "number-up";

    public static final java.lang.String PRINT_SETTINGS_NUMBER_UP_LAYOUT = "number-up-layout";

    public static final java.lang.String PRINT_SETTINGS_N_COPIES = "n-copies";

    public static final java.lang.String PRINT_SETTINGS_ORIENTATION = "orientation";

    public static final java.lang.String PRINT_SETTINGS_OUTPUT_BASENAME = "output-basename";

    public static final java.lang.String PRINT_SETTINGS_OUTPUT_BIN = "output-bin";

    public static final java.lang.String PRINT_SETTINGS_OUTPUT_DIR = "output-dir";

    public static final java.lang.String PRINT_SETTINGS_OUTPUT_FILE_FORMAT = "output-file-format";

    public static final java.lang.String PRINT_SETTINGS_OUTPUT_URI = "output-uri";

    public static final java.lang.String PRINT_SETTINGS_PAGE_RANGES = "page-ranges";

    public static final java.lang.String PRINT_SETTINGS_PAGE_SET = "page-set";

    public static final java.lang.String PRINT_SETTINGS_PAPER_FORMAT = "paper-format";

    public static final java.lang.String PRINT_SETTINGS_PAPER_HEIGHT = "paper-height";

    public static final java.lang.String PRINT_SETTINGS_PAPER_WIDTH = "paper-width";

    public static final java.lang.String PRINT_SETTINGS_PRINTER = "printer";

    public static final java.lang.String PRINT_SETTINGS_PRINTER_LPI = "printer-lpi";

    public static final java.lang.String PRINT_SETTINGS_PRINT_PAGES = "print-pages";

    public static final java.lang.String PRINT_SETTINGS_QUALITY = "quality";

    public static final java.lang.String PRINT_SETTINGS_RESOLUTION = "resolution";

    public static final java.lang.String PRINT_SETTINGS_RESOLUTION_X = "resolution-x";

    public static final java.lang.String PRINT_SETTINGS_RESOLUTION_Y = "resolution-y";

    public static final java.lang.String PRINT_SETTINGS_REVERSE = "reverse";

    public static final java.lang.String PRINT_SETTINGS_SCALE = "scale";

    public static final java.lang.String PRINT_SETTINGS_USE_COLOR = "use-color";

    public static final java.lang.String PRINT_SETTINGS_WIN32_DRIVER_EXTRA = "win32-driver-extra";

    public static final java.lang.String PRINT_SETTINGS_WIN32_DRIVER_VERSION = "win32-driver-version";

    public static final int PRIORITY_RESIZE = 110;

    public static final int STYLE_PROVIDER_PRIORITY_APPLICATION = 600;

    public static final int STYLE_PROVIDER_PRIORITY_FALLBACK = 1;

    public static final int STYLE_PROVIDER_PRIORITY_SETTINGS = 400;

    public static final int STYLE_PROVIDER_PRIORITY_THEME = 200;

    public static final int STYLE_PROVIDER_PRIORITY_USER = 800;

    public static final int TEXT_VIEW_PRIORITY_VALIDATE = 125;

    public static final int TREE_SORTABLE_DEFAULT_SORT_COLUMN_ID = -1;

    public static final int TREE_SORTABLE_UNSORTED_SORT_COLUMN_ID = -2;

    /**
     * Gets the modifier mask.
     * <p>
     * The modifier mask determines which modifiers are considered significant
     * for keyboard accelerators. This includes all keyboard modifiers except
     * for {@link org.gtk.gdk.ModifierType#LOCK_MASK}.
     */
    public static int acceleratorGetDefaultModMask() {
        var RESULT = gtk_h.gtk_accelerator_get_default_mod_mask();
        return RESULT;
    }
    
    /**
     * Converts an accelerator keyval and modifier mask into a string
     * which can be used to represent the accelerator to the user.
     */
    public static java.lang.String acceleratorGetLabel(int acceleratorKey, int acceleratorMods) {
        var RESULT = gtk_h.gtk_accelerator_get_label(acceleratorKey, acceleratorMods);
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Converts an accelerator keyval and modifier mask
     * into a string that can be displayed to the user.
     * <p>
     * The string may be translated.
     * <p>
     * This function is similar to {@link Gtk#acceleratorGetLabel},
     * but handling keycodes. This is only useful for system-level
     * components, applications should use {@link Gtk#acceleratorGetLabel}
     * instead.
     */
    public static java.lang.String acceleratorGetLabelWithKeycode(org.gtk.gdk.Display display, int acceleratorKey, int keycode, int acceleratorMods) {
        var RESULT = gtk_h.gtk_accelerator_get_label_with_keycode(display.handle(), acceleratorKey, keycode, acceleratorMods);
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Converts an accelerator keyval and modifier mask into a string
     * parseable by gtk_accelerator_parse().
     * <p>
     * For example, if you pass in {@code GDK_KEY_q} and {@link org.gtk.gdk.ModifierType#CONTROL_MASK},
     * this function returns {@code <Control>q}.
     * <p>
     * If you need to display accelerators in the user interface,
     * see {@link Gtk#acceleratorGetLabel}.
     */
    public static java.lang.String acceleratorName(int acceleratorKey, int acceleratorMods) {
        var RESULT = gtk_h.gtk_accelerator_name(acceleratorKey, acceleratorMods);
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Converts an accelerator keyval and modifier mask
     * into a string parseable by gtk_accelerator_parse_with_keycode().
     * <p>
     * This is similar to {@link Gtk#acceleratorName} but handling keycodes.
     * This is only useful for system-level components, applications
     * should use {@link Gtk#acceleratorName} instead.
     */
    public static java.lang.String acceleratorNameWithKeycode(org.gtk.gdk.Display display, int acceleratorKey, int keycode, int acceleratorMods) {
        var RESULT = gtk_h.gtk_accelerator_name_with_keycode(display.handle(), acceleratorKey, keycode, acceleratorMods);
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Determines whether a given keyval and modifier mask constitute
     * a valid keyboard accelerator.
     * <p>
     * For example, the {@code GDK_KEY_a} keyval plus {@link org.gtk.gdk.ModifierType#CONTROL_MASK} mark is valid,
     * and matches the “Ctrl+a” accelerator. But, you can't, for instance, use
     * the {@code GDK_KEY_Control_L} keyval as an accelerator.
     */
    public static boolean acceleratorValid(int keyval, int modifiers) {
        var RESULT = gtk_h.gtk_accelerator_valid(keyval, modifiers);
        return (RESULT != 0);
    }
    
    public static void accessiblePropertyInitValue(AccessibleProperty property, org.gtk.gobject.Value value) {
        gtk_h.gtk_accessible_property_init_value(property.getValue(), value.handle());
    }
    
    public static void accessibleRelationInitValue(AccessibleRelation relation, org.gtk.gobject.Value value) {
        gtk_h.gtk_accessible_relation_init_value(relation.getValue(), value.handle());
    }
    
    public static void accessibleStateInitValue(AccessibleState state, org.gtk.gobject.Value value) {
        gtk_h.gtk_accessible_state_init_value(state.getValue(), value.handle());
    }
    
    public static org.gtk.glib.Quark builderErrorQuark() {
        var RESULT = gtk_h.gtk_builder_error_quark();
        return new org.gtk.glib.Quark(RESULT);
    }
    
    /**
     * Checks that the GTK library in use is compatible with the
     * given version.
     * <p>
     * Generally you would pass in the constants {@code GTK_MAJOR_VERSION},
     * {@code GTK_MINOR_VERSION}, {@code GTK_MICRO_VERSION} as the three arguments
     * to this function; that produces a check that the library in
     * use is compatible with the version of GTK the application or
     * module was compiled against.
     * <p>
     * Compatibility is defined by two things: first the version
     * of the running library is newer than the version
     * {@code required_major}.required_minor.{@code required_micro}. Second
     * the running library must be binary compatible with the
     * version {@code required_major}.required_minor.{@code required_micro}
     * (same major version.)
     * <p>
     * This function is primarily for GTK modules; the module
     * can call this function to check that it wasn’t loaded
     * into an incompatible version of GTK. However, such a
     * check isn’t completely reliable, since the module may be
     * linked against an old version of GTK and calling the
     * old version of gtk_check_version(), but still get loaded
     * into an application using a newer version of GTK.
     */
    public static java.lang.String checkVersion(int requiredMajor, int requiredMinor, int requiredMicro) {
        var RESULT = gtk_h.gtk_check_version(requiredMajor, requiredMinor, requiredMicro);
        return RESULT.getUtf8String(0);
    }
    
    public static org.gtk.glib.Quark constraintVflParserErrorQuark() {
        var RESULT = gtk_h.gtk_constraint_vfl_parser_error_quark();
        return new org.gtk.glib.Quark(RESULT);
    }
    
    public static org.gtk.glib.Quark cssParserErrorQuark() {
        var RESULT = gtk_h.gtk_css_parser_error_quark();
        return new org.gtk.glib.Quark(RESULT);
    }
    
    public static org.gtk.glib.Quark cssParserWarningQuark() {
        var RESULT = gtk_h.gtk_css_parser_warning_quark();
        return new org.gtk.glib.Quark(RESULT);
    }
    
    /**
     * Prevents {@code gtk_init_check} from automatically calling
     * {@code setlocale (LC_ALL, "")}.
     * <p>
     * You would want to use this function if you wanted to set the locale for
     * your program to something other than the user’s locale, or if
     * you wanted to set different values for different locale categories.
     * <p>
     * Most programs should not need to call this function.
     */
    public static void disableSetlocale() {
        gtk_h.gtk_disable_setlocale();
    }
    
    /**
     * Distributes {@code extra_space} to child {@code sizes} by bringing smaller
     * children up to natural size first.
     * <p>
     * The remaining space will be added to the {@code minimum_size} member of the
     * {@code GtkRequestedSize} struct. If all sizes reach their natural size then
     * the remaining space is returned.
     */
    public static int distributeNaturalAllocation(int extraSpace, int nRequestedSizes, RequestedSize[] sizes) {
        var RESULT = gtk_h.gtk_distribute_natural_allocation(extraSpace, nRequestedSizes, Interop.allocateNativeArray(sizes).handle());
        return RESULT;
    }
    
    /**
     * Gets a property of the {@code GtkEditable} delegate for {@code object}.
     * <p>
     * This is helper function that should be called in the {@code get_property}
     * function of your {@code GtkEditable} implementation, before handling your
     * own properties.
     */
    public static boolean editableDelegateGetProperty(org.gtk.gobject.Object object, int propId, org.gtk.gobject.Value value, org.gtk.gobject.ParamSpec pspec) {
        var RESULT = gtk_h.gtk_editable_delegate_get_property(object.handle(), propId, value.handle(), pspec.handle());
        return (RESULT != 0);
    }
    
    /**
     * Sets a property on the {@code GtkEditable} delegate for {@code object}.
     * <p>
     * This is a helper function that should be called in the {@code set_property}
     * function of your {@code GtkEditable} implementation, before handling your
     * own properties.
     */
    public static boolean editableDelegateSetProperty(org.gtk.gobject.Object object, int propId, org.gtk.gobject.Value value, org.gtk.gobject.ParamSpec pspec) {
        var RESULT = gtk_h.gtk_editable_delegate_set_property(object.handle(), propId, value.handle(), pspec.handle());
        return (RESULT != 0);
    }
    
    /**
     * Overrides the {@code GtkEditable} properties for {@code class}.
     * <p>
     * This is a helper function that should be called in class_init,
     * after installing your own properties.
     * <p>
     * Note that your class must have "text", "cursor-position",
     * "selection-bound", "editable", "width-chars", "max-width-chars",
     * "xalign" and "enable-undo" properties for this function to work.
     * <p>
     * To handle the properties in your set_property and get_property
     * functions, you can either use {@link Gtk#Editable}
     * and {@link Gtk#Editable} (if you are using
     * a delegate), or remember the {@code first_prop} offset and add it to the
     * values in the {@code Gtk.EditableProperties} enumeration to get the
     * property IDs for these properties.
     */
    public static int editableInstallProperties(org.gtk.gobject.ObjectClass objectClass, int firstProp) {
        var RESULT = gtk_h.gtk_editable_install_properties(objectClass.handle(), firstProp);
        return RESULT;
    }
    
    /**
     * Calls a function for all {@code GtkPrinter}s.
     * <p>
     * If {@code func} returns {@code true}, the enumeration is stopped.
     */
    public static void enumeratePrinters(PrinterFunc func, boolean wait) {
        try {
            gtk_h.gtk_enumerate_printers(
                    Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbPrinterFunc",
                            MethodType.methodType(boolean.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(func.hashCode(), func)), 
                    Interop.cbDestroyNotifySymbol(), wait ? 1 : 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Registers an error quark for {@code GtkFileChooser} errors.
     */
    public static org.gtk.glib.Quark fileChooserErrorQuark() {
        var RESULT = gtk_h.gtk_file_chooser_error_quark();
        return new org.gtk.glib.Quark(RESULT);
    }
    
    /**
     * Returns the binary age as passed to {@code libtool}.
     * <p>
     * If {@code libtool} means nothing to you, don't worry about it.
     */
    public static int getBinaryAge() {
        var RESULT = gtk_h.gtk_get_binary_age();
        return RESULT;
    }
    
    /**
     * Returns the GTK debug flags that are currently active.
     * <p>
     * This function is intended for GTK modules that want
     * to adjust their debug output based on GTK debug flags.
     */
    public static int getDebugFlags() {
        var RESULT = gtk_h.gtk_get_debug_flags();
        return RESULT;
    }
    
    /**
     * Returns the {@code PangoLanguage} for the default language
     * currently in effect.
     * <p>
     * Note that this can change over the life of an
     * application.
     * <p>
     * The default language is derived from the current
     * locale. It determines, for example, whether GTK uses
     * the right-to-left or left-to-right text direction.
     * <p>
     * This function is equivalent to
     * {@link Pango#Language}.
     * See that function for details.
     */
    public static org.pango.Language getDefaultLanguage() {
        var RESULT = gtk_h.gtk_get_default_language();
        return new org.pango.Language(References.get(RESULT, false));
    }
    
    /**
     * Returns the interface age as passed to {@code libtool}.
     * <p>
     * If {@code libtool} means nothing to you, don't worry about it.
     */
    public static int getInterfaceAge() {
        var RESULT = gtk_h.gtk_get_interface_age();
        return RESULT;
    }
    
    /**
     * Get the direction of the current locale. This is the expected
     * reading direction for text and UI.
     * <p>
     * This function depends on the current locale being set with
     * setlocale() and will default to setting the {@link TextDirection#LTR}
     * direction otherwise. {@link TextDirection#NONE} will never be returned.
     * <p>
     * GTK sets the default text direction according to the locale
     * during gtk_init(), and you should normally use
     * gtk_widget_get_direction() or gtk_widget_get_default_direction()
     * to obtain the current direction.
     * <p>
     * This function is only needed rare cases when the locale is
     * changed after GTK has already been initialized. In this case,
     * you can use it to update the default text direction as follows:
     * <p>
     * <pre>{@code <!-- language="C" -->
     * #include <locale.h>
     * 
     * static void
     * update_locale (const char *new_locale)
     * {
     *   setlocale (LC_ALL, new_locale);
     *   GtkTextDirection direction = gtk_get_locale_direction ();
     *   gtk_widget_set_default_direction (direction);
     * }
     * }</pre>
     */
    public static TextDirection getLocaleDirection() {
        var RESULT = gtk_h.gtk_get_locale_direction();
        return TextDirection.fromValue(RESULT);
    }
    
    /**
     * Returns the major version number of the GTK library.
     * <p>
     * For example, in GTK version 3.1.5 this is 3.
     * <p>
     * This function is in the library, so it represents the GTK library
     * your code is running against. Contrast with the {@code GTK_MAJOR_VERSION}
     * macro, which represents the major version of the GTK headers you
     * have included when compiling your code.
     */
    public static int getMajorVersion() {
        var RESULT = gtk_h.gtk_get_major_version();
        return RESULT;
    }
    
    /**
     * Returns the micro version number of the GTK library.
     * <p>
     * For example, in GTK version 3.1.5 this is 5.
     * <p>
     * This function is in the library, so it represents the GTK library
     * your code is are running against. Contrast with the
     * {@code GTK_MICRO_VERSION} macro, which represents the micro version of the
     * GTK headers you have included when compiling your code.
     */
    public static int getMicroVersion() {
        var RESULT = gtk_h.gtk_get_micro_version();
        return RESULT;
    }
    
    /**
     * Returns the minor version number of the GTK library.
     * <p>
     * For example, in GTK version 3.1.5 this is 1.
     * <p>
     * This function is in the library, so it represents the GTK library
     * your code is are running against. Contrast with the
     * {@code GTK_MINOR_VERSION} macro, which represents the minor version of the
     * GTK headers you have included when compiling your code.
     */
    public static int getMinorVersion() {
        var RESULT = gtk_h.gtk_get_minor_version();
        return RESULT;
    }
    
    public static org.gtk.glib.Quark iconThemeErrorQuark() {
        var RESULT = gtk_h.gtk_icon_theme_error_quark();
        return new org.gtk.glib.Quark(RESULT);
    }
    
    /**
     * Call this function before using any other GTK functions in your GUI
     * applications.  It will initialize everything needed to operate the
     * toolkit.
     * <p>
     * If you are using {@code GtkApplication}, you don't have to call gtk_init()
     * or gtk_init_check(); the {@code GApplication::startup} handler
     * does it for you.
     * <p>
     * This function will terminate your program if it was unable to
     * initialize the windowing system for some reason. If you want
     * your program to fall back to a textual interface you want to
     * call gtk_init_check() instead.
     * <p>
     * GTK calls {@code signal (SIGPIPE, SIG_IGN)}
     * during initialization, to ignore SIGPIPE signals, since these are
     * almost never wanted in graphical applications. If you do need to
     * handle SIGPIPE for some reason, reset the handler after gtk_init(),
     * but notice that other libraries (e.g. libdbus or gvfs) might do
     * similar things.
     */
    public static void init() {
        gtk_h.gtk_init();
    }
    
    /**
     * This function does the same work as gtk_init() with only a single
     * change: It does not terminate the program if the windowing system
     * can’t be initialized. Instead it returns {@code false} on failure.
     * <p>
     * This way the application can fall back to some other means of
     * communication with the user - for example a curses or command line
     * interface.
     */
    public static boolean initCheck() {
        var RESULT = gtk_h.gtk_init_check();
        return (RESULT != 0);
    }
    
    /**
     * Use this function to check if GTK has been initialized with gtk_init()
     * or gtk_init_check().
     */
    public static boolean isInitialized() {
        var RESULT = gtk_h.gtk_is_initialized();
        return (RESULT != 0);
    }
    
    /**
     * Finds the {@code GtkNative} associated with the surface.
     */
    public static Native nativeGetForSurface(org.gtk.gdk.Surface surface) {
        var RESULT = gtk_h.gtk_native_get_for_surface(surface.handle());
        return new Native.NativeImpl(References.get(RESULT, false));
    }
    
    /**
     * Converts the result of a {@code GCompareFunc} like strcmp() to a
     * {@code GtkOrdering} value.
     */
    public static Ordering orderingFromCmpfunc(int cmpfuncResult) {
        var RESULT = gtk_h.gtk_ordering_from_cmpfunc(cmpfuncResult);
        return Ordering.fromValue(RESULT);
    }
    
    /**
     * Returns the name of the default paper size, which
     * depends on the current locale.
     */
    public static java.lang.String paperSizeGetDefault() {
        var RESULT = gtk_h.gtk_paper_size_get_default();
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Creates a list of known paper sizes.
     */
    public static org.gtk.glib.List paperSizeGetPaperSizes(boolean includeCustom) {
        var RESULT = gtk_h.gtk_paper_size_get_paper_sizes(includeCustom ? 1 : 0);
        return new org.gtk.glib.List(References.get(RESULT, true));
    }
    
    /**
     * Creates a new {@code GParamSpec} instance for a property holding a {@code GtkExpression}.
     * <p>
     * See {@code g_param_spec_internal()} for details on the property strings.
     */
    public static org.gtk.gobject.ParamSpec paramSpecExpression(java.lang.String name, java.lang.String nick, java.lang.String blurb, int flags) {
        var RESULT = gtk_h.gtk_param_spec_expression(Interop.allocateNativeString(name).handle(), Interop.allocateNativeString(nick).handle(), Interop.allocateNativeString(blurb).handle(), flags);
        return new org.gtk.gobject.ParamSpec(References.get(RESULT, true));
    }
    
    /**
     * Registers an error quark for {@code GtkPrintOperation} if necessary.
     */
    public static org.gtk.glib.Quark printErrorQuark() {
        var RESULT = gtk_h.gtk_print_error_quark();
        return new org.gtk.glib.Quark(RESULT);
    }
    
    /**
     * Runs a page setup dialog, letting the user modify the values from
     * {@code page_setup}. If the user cancels the dialog, the returned {@code GtkPageSetup}
     * is identical to the passed in {@code page_setup}, otherwise it contains the
     * modifications done in the dialog.
     * <p>
     * Note that this function may use a recursive mainloop to show the page
     * setup dialog. See gtk_print_run_page_setup_dialog_async() if this is
     * a problem.
     */
    public static PageSetup printRunPageSetupDialog(Window parent, PageSetup pageSetup, PrintSettings settings) {
        var RESULT = gtk_h.gtk_print_run_page_setup_dialog(parent.handle(), pageSetup.handle(), settings.handle());
        return new PageSetup(References.get(RESULT, true));
    }
    
    /**
     * Runs a page setup dialog, letting the user modify the values from {@code page_setup}.
     * <p>
     * In contrast to gtk_print_run_page_setup_dialog(), this function  returns after
     * showing the page setup dialog on platforms that support this, and calls {@code done_cb}
     * from a signal handler for the ::response signal of the dialog.
     */
    public static void printRunPageSetupDialogAsync(Window parent, PageSetup pageSetup, PrintSettings settings, PageSetupDoneFunc doneCb) {
        try {
            gtk_h.gtk_print_run_page_setup_dialog_async(parent.handle(), pageSetup.handle(), settings.handle(), 
                    Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbPageSetupDoneFunc",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(doneCb.hashCode(), doneCb)));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    public static org.gtk.glib.Quark recentManagerErrorQuark() {
        var RESULT = gtk_h.gtk_recent_manager_error_quark();
        return new org.gtk.glib.Quark(RESULT);
    }
    
    /**
     * Renders an activity indicator (such as in {@code GtkSpinner}).
     * The state {@link StateFlags#CHECKED} determines whether there is
     * activity going on.
     */
    public static void renderActivity(StyleContext context, org.cairographics.Context cr, double x, double y, double width, double height) {
        gtk_h.gtk_render_activity(context.handle(), cr.handle(), x, y, width, height);
    }
    
    /**
     * Renders an arrow pointing to {@code angle}.
     * <p>
     * Typical arrow rendering at 0, 1⁄2 π;, π; and 3⁄2 π:
     * <p>
     * ![](arrows.png)
     */
    public static void renderArrow(StyleContext context, org.cairographics.Context cr, double angle, double x, double y, double size) {
        gtk_h.gtk_render_arrow(context.handle(), cr.handle(), angle, x, y, size);
    }
    
    /**
     * Renders the background of an element.
     * <p>
     * Typical background rendering, showing the effect of
     * {@code background-image}, {@code border-width} and {@code border-radius}:
     * <p>
     * ![](background.png)
     */
    public static void renderBackground(StyleContext context, org.cairographics.Context cr, double x, double y, double width, double height) {
        gtk_h.gtk_render_background(context.handle(), cr.handle(), x, y, width, height);
    }
    
    /**
     * Renders a checkmark (as in a {@code GtkCheckButton}).
     * <p>
     * The {@link StateFlags#CHECKED} state determines whether the check is
     * on or off, and {@link StateFlags#INCONSISTENT} determines whether it
     * should be marked as undefined.
     * <p>
     * Typical checkmark rendering:
     * <p>
     * ![](checks.png)
     */
    public static void renderCheck(StyleContext context, org.cairographics.Context cr, double x, double y, double width, double height) {
        gtk_h.gtk_render_check(context.handle(), cr.handle(), x, y, width, height);
    }
    
    /**
     * Renders an expander (as used in {@code GtkTreeView} and {@code GtkExpander}) in the area
     * defined by @x, @y, {@code width}, {@code height}. The state {@link StateFlags#CHECKED}
     * determines whether the expander is collapsed or expanded.
     * <p>
     * Typical expander rendering:
     * <p>
     * ![](expanders.png)
     */
    public static void renderExpander(StyleContext context, org.cairographics.Context cr, double x, double y, double width, double height) {
        gtk_h.gtk_render_expander(context.handle(), cr.handle(), x, y, width, height);
    }
    
    /**
     * Renders a focus indicator on the rectangle determined by @x, @y, {@code width}, {@code height}.
     * <p>
     * Typical focus rendering:
     * <p>
     * ![](focus.png)
     */
    public static void renderFocus(StyleContext context, org.cairographics.Context cr, double x, double y, double width, double height) {
        gtk_h.gtk_render_focus(context.handle(), cr.handle(), x, y, width, height);
    }
    
    /**
     * Renders a frame around the rectangle defined by @x, @y, {@code width}, {@code height}.
     * <p>
     * Examples of frame rendering, showing the effect of {@code border-image},
     * {@code border-color}, {@code border-width}, {@code border-radius} and junctions:
     * <p>
     * ![](frames.png)
     */
    public static void renderFrame(StyleContext context, org.cairographics.Context cr, double x, double y, double width, double height) {
        gtk_h.gtk_render_frame(context.handle(), cr.handle(), x, y, width, height);
    }
    
    /**
     * Renders a handle (as in {@code GtkPaned} and {@code GtkWindow}’s resize grip),
     * in the rectangle determined by @x, @y, {@code width}, {@code height}.
     * <p>
     * Handles rendered for the paned and grip classes:
     * <p>
     * ![](handles.png)
     */
    public static void renderHandle(StyleContext context, org.cairographics.Context cr, double x, double y, double width, double height) {
        gtk_h.gtk_render_handle(context.handle(), cr.handle(), x, y, width, height);
    }
    
    /**
     * Renders the icon in {@code texture} at the specified @x and @y coordinates.
     * <p>
     * This function will render the icon in {@code texture} at exactly its size,
     * regardless of scaling factors, which may not be appropriate when
     * drawing on displays with high pixel densities.
     */
    public static void renderIcon(StyleContext context, org.cairographics.Context cr, org.gtk.gdk.Texture texture, double x, double y) {
        gtk_h.gtk_render_icon(context.handle(), cr.handle(), texture.handle(), x, y);
    }
    
    /**
     * Renders {@code layout} on the coordinates @x, @y
     */
    public static void renderLayout(StyleContext context, org.cairographics.Context cr, double x, double y, org.pango.Layout layout) {
        gtk_h.gtk_render_layout(context.handle(), cr.handle(), x, y, layout.handle());
    }
    
    /**
     * Renders a line from (x0, y0) to (x1, y1).
     */
    public static void renderLine(StyleContext context, org.cairographics.Context cr, double x0, double y0, double x1, double y1) {
        gtk_h.gtk_render_line(context.handle(), cr.handle(), x0, y0, x1, y1);
    }
    
    /**
     * Renders an option mark (as in a radio button), the {@link StateFlags#CHECKED}
     * state will determine whether the option is on or off, and
     * {@link StateFlags#INCONSISTENT} whether it should be marked as undefined.
     * <p>
     * Typical option mark rendering:
     * <p>
     * ![](options.png)
     */
    public static void renderOption(StyleContext context, org.cairographics.Context cr, double x, double y, double width, double height) {
        gtk_h.gtk_render_option(context.handle(), cr.handle(), x, y, width, height);
    }
    
    /**
     * Sets the GTK debug flags.
     */
    public static void setDebugFlags(int flags) {
        gtk_h.gtk_set_debug_flags(flags);
    }
    
    /**
     * This function launches the default application for showing
     * a given uri, or shows an error dialog if that fails.
     */
    public static void showUri(Window parent, java.lang.String uri, int timestamp) {
        gtk_h.gtk_show_uri(parent.handle(), Interop.allocateNativeString(uri).handle(), timestamp);
    }
    
    /**
     * This function launches the default application for showing
     * a given uri.
     * <p>
     * The {@code callback} will be called when the launch is completed.
     * It should call gtk_show_uri_full_finish() to obtain the result.
     * <p>
     * This is the recommended call to be used as it passes information
     * necessary for sandbox helpers to parent their dialogs properly.
     */
    public static void showUriFull(Window parent, java.lang.String uri, int timestamp, org.gtk.gio.Cancellable cancellable, org.gtk.gio.AsyncReadyCallback callback) {
        try {
            gtk_h.gtk_show_uri_full(parent.handle(), Interop.allocateNativeString(uri).handle(), timestamp, cancellable.handle(), 
                    Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbAsyncReadyCallback",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(callback.hashCode(), callback)));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Finishes the gtk_show_uri() call and returns the result
     * of the operation.
     */
    public static boolean showUriFullFinish(Window parent, org.gtk.gio.AsyncResult result) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.gtk_show_uri_full_finish(parent.handle(), result.handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return (RESULT != 0);
    }
    
    public static void testAccessibleAssertionMessageRole(java.lang.String domain, java.lang.String file, int line, java.lang.String func, java.lang.String expr, Accessible accessible, AccessibleRole expectedRole, AccessibleRole actualRole) {
        gtk_h.gtk_test_accessible_assertion_message_role(Interop.allocateNativeString(domain).handle(), Interop.allocateNativeString(file).handle(), line, Interop.allocateNativeString(func).handle(), Interop.allocateNativeString(expr).handle(), accessible.handle(), expectedRole.getValue(), actualRole.getValue());
    }
    
    /**
     * Checks whether the {@code GtkAccessible} has {@code property} set.
     */
    public static boolean testAccessibleHasProperty(Accessible accessible, AccessibleProperty property) {
        var RESULT = gtk_h.gtk_test_accessible_has_property(accessible.handle(), property.getValue());
        return (RESULT != 0);
    }
    
    /**
     * Checks whether the {@code GtkAccessible} has {@code relation} set.
     */
    public static boolean testAccessibleHasRelation(Accessible accessible, AccessibleRelation relation) {
        var RESULT = gtk_h.gtk_test_accessible_has_relation(accessible.handle(), relation.getValue());
        return (RESULT != 0);
    }
    
    /**
     * Checks whether the {@code GtkAccessible:accessible-role} of the accessible
     * is {@code role}.
     */
    public static boolean testAccessibleHasRole(Accessible accessible, AccessibleRole role) {
        var RESULT = gtk_h.gtk_test_accessible_has_role(accessible.handle(), role.getValue());
        return (RESULT != 0);
    }
    
    /**
     * Checks whether the {@code GtkAccessible} has {@code state} set.
     */
    public static boolean testAccessibleHasState(Accessible accessible, AccessibleState state) {
        var RESULT = gtk_h.gtk_test_accessible_has_state(accessible.handle(), state.getValue());
        return (RESULT != 0);
    }
    
    /**
     * Force registration of all core GTK object types.
     * <p>
     * This allowes to refer to any of those object types via
     * g_type_from_name() after calling this function.
     */
    public static void testRegisterAllTypes() {
        gtk_h.gtk_test_register_all_types();
    }
    
    /**
     * Enters the main loop and waits for {@code widget} to be “drawn”.
     * <p>
     * In this context that means it waits for the frame clock of
     * {@code widget} to have run a full styling, layout and drawing cycle.
     * <p>
     * This function is intended to be used for syncing with actions that
     * depend on {@code widget} relayouting or on interaction with the display
     * server.
     */
    public static void testWidgetWaitForDraw(Widget widget) {
        gtk_h.gtk_test_widget_wait_for_draw(widget.handle());
    }
    
    /**
     * Creates a content provider for dragging {@code path} from {@code tree_model}.
     */
    public static org.gtk.gdk.ContentProvider treeCreateRowDragContent(TreeModel treeModel, TreePath path) {
        var RESULT = gtk_h.gtk_tree_create_row_drag_content(treeModel.handle(), path.handle());
        return new org.gtk.gdk.ContentProvider(References.get(RESULT, true));
    }
    
    /**
     * Obtains a {@code tree_model} and {@code path} from value of target type
     * {@code GTK_TYPE_TREE_ROW_DATA}.
     * <p>
     * The returned path must be freed with gtk_tree_path_free().
     */
    public static boolean treeGetRowDragData(org.gtk.gobject.Value value, TreeModel[] treeModel, TreePath[] path) {
        var RESULT = gtk_h.gtk_tree_get_row_drag_data(value.handle(), Interop.allocateNativeArray(treeModel).handle(), Interop.allocateNativeArray(path).handle());
        return (RESULT != 0);
    }
    
    /**
     * Lets a set of row reference created by
     * gtk_tree_row_reference_new_proxy() know that the
     * model emitted the ::row-deleted signal.
     */
    public static void treeRowReferenceDeleted(org.gtk.gobject.Object proxy, TreePath path) {
        gtk_h.gtk_tree_row_reference_deleted(proxy.handle(), path.handle());
    }
    
    /**
     * Lets a set of row reference created by
     * gtk_tree_row_reference_new_proxy() know that the
     * model emitted the ::row-inserted signal.
     */
    public static void treeRowReferenceInserted(org.gtk.gobject.Object proxy, TreePath path) {
        gtk_h.gtk_tree_row_reference_inserted(proxy.handle(), path.handle());
    }
    
    /**
     * Lets a set of row reference created by
     * gtk_tree_row_reference_new_proxy() know that the
     * model emitted the ::rows-reordered signal.
     */
    public static void treeRowReferenceReordered(org.gtk.gobject.Object proxy, TreePath path, TreeIter iter, int[] newOrder) {
        gtk_h.gtk_tree_row_reference_reordered(proxy.handle(), path.handle(), iter.handle(), new MemorySegmentReference(Interop.getAllocator().allocateArray(ValueLayout.JAVA_INT, newOrder)).handle());
    }
    
    /**
     * Retrieves the {@code GtkExpression} stored inside the given {@code value}, and acquires
     * a reference to it.
     */
    public static Expression valueDupExpression(org.gtk.gobject.Value value) {
        var RESULT = gtk_h.gtk_value_dup_expression(value.handle());
        return new Expression(References.get(RESULT, true));
    }
    
    /**
     * Retrieves the {@code GtkExpression} stored inside the given {@code value}.
     */
    public static Expression valueGetExpression(org.gtk.gobject.Value value) {
        var RESULT = gtk_h.gtk_value_get_expression(value.handle());
        return new Expression(References.get(RESULT, false));
    }
    
    /**
     * Stores the given {@code GtkExpression} inside {@code value}.
     * <p>
     * The {@code GValue} will acquire a reference to the {@code expression}.
     */
    public static void valueSetExpression(org.gtk.gobject.Value value, Expression expression) {
        gtk_h.gtk_value_set_expression(value.handle(), expression.handle());
    }
    
    /**
     * Stores the given {@code GtkExpression} inside {@code value}.
     * <p>
     * This function transfers the ownership of the {@code expression} to the {@code GValue}.
     */
    public static void valueTakeExpression(org.gtk.gobject.Value value, Expression expression) {
        gtk_h.gtk_value_take_expression(value.handle(), expression.getReference().unowned().handle());
    }
    
}
