package org.gtk.gtk;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
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
    public static org.gtk.gdk.ModifierType acceleratorGetDefaultModMask() {
        var RESULT = gtk_h.gtk_accelerator_get_default_mod_mask();
        return new org.gtk.gdk.ModifierType(RESULT);
    }
    
    /**
     * Converts an accelerator keyval and modifier mask into a string
     * which can be used to represent the accelerator to the user.
     */
    public static java.lang.String acceleratorGetLabel(int acceleratorKey, org.gtk.gdk.ModifierType acceleratorMods) {
        var RESULT = gtk_h.gtk_accelerator_get_label(acceleratorKey, acceleratorMods.getValue());
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
    public static java.lang.String acceleratorGetLabelWithKeycode(org.gtk.gdk.Display display, int acceleratorKey, int keycode, org.gtk.gdk.ModifierType acceleratorMods) {
        var RESULT = gtk_h.gtk_accelerator_get_label_with_keycode(display.handle(), acceleratorKey, keycode, acceleratorMods.getValue());
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
    public static java.lang.String acceleratorName(int acceleratorKey, org.gtk.gdk.ModifierType acceleratorMods) {
        var RESULT = gtk_h.gtk_accelerator_name(acceleratorKey, acceleratorMods.getValue());
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
    public static java.lang.String acceleratorNameWithKeycode(org.gtk.gdk.Display display, int acceleratorKey, int keycode, org.gtk.gdk.ModifierType acceleratorMods) {
        var RESULT = gtk_h.gtk_accelerator_name_with_keycode(display.handle(), acceleratorKey, keycode, acceleratorMods.getValue());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Parses a string representing an accelerator.
     * <p>
     * The format looks like “{@code <Control>a}” or “{@code <Shift><Alt>F1}”.
     * <p>
     * The parser is fairly liberal and allows lower or upper case, and also
     * abbreviations such as “{@code <Ctl>}” and “{@code <Ctrl>}”.
     * <p>
     * Key names are parsed using {@link Gdk#keyvalFromName}. For character keys
     * the name is not the symbol, but the lowercase name, e.g. one would use
     * “{@code <Ctrl>minus}” instead of “{@code <Ctrl>-}”.
     * <p>
     * Modifiers are enclosed in angular brackets {@code <>}, and match the
     * {@code Gdk.ModifierType} mask:
     * <p>
     * <ul>
     * <li>{@code <Shift>} for {@code GDK_SHIFT_MASK}
     * <li>{@code <Ctrl>} for {@code GDK_CONTROL_MASK}
     * <li>{@code <Alt>} for {@code GDK_ALT_MASK}
     * <li>{@code <Meta>} for {@code GDK_META_MASK}
     * <li>{@code <Super>} for {@code GDK_SUPER_MASK}
     * <li>{@code <Hyper>} for {@code GDK_HYPER_MASK}
     * </ul>
     * <p>
     * If the parse operation fails, {@code accelerator_key} and {@code accelerator_mods} will
     * be set to 0 (zero).
     */
    public static boolean acceleratorParse(java.lang.String accelerator, PointerInteger acceleratorKey, org.gtk.gdk.ModifierType acceleratorMods) {
        var RESULT = gtk_h.gtk_accelerator_parse(Interop.allocateNativeString(accelerator).handle(), acceleratorKey.handle(), new PointerInteger(acceleratorMods.getValue()).handle());
        return RESULT != 0;
    }
    
    /**
     * Parses a string representing an accelerator.
     * <p>
     * This is similar to {@link Gtk#acceleratorParse} but handles keycodes as
     * well. This is only useful for system-level components, applications should
     * use {@link Gtk#acceleratorParse} instead.
     * <p>
     * If {@code accelerator_codes} is given and the result stored in it is non-{@code null},
     * the result must be freed with g_free().
     * <p>
     * If a keycode is present in the accelerator and no {@code accelerator_codes}
     * is given, the parse will fail.
     * <p>
     * If the parse fails, {@code accelerator_key}, {@code accelerator_mods} and
     * {@code accelerator_codes} will be set to 0 (zero).
     */
    public static boolean acceleratorParseWithKeycode(java.lang.String accelerator, org.gtk.gdk.Display display, PointerInteger acceleratorKey, int[] acceleratorCodes, org.gtk.gdk.ModifierType acceleratorMods) {
        var RESULT = gtk_h.gtk_accelerator_parse_with_keycode(Interop.allocateNativeString(accelerator).handle(), display.handle(), acceleratorKey.handle(), Interop.allocateNativeArray(acceleratorCodes).handle(), new PointerInteger(acceleratorMods.getValue()).handle());
        return RESULT != 0;
    }
    
    /**
     * Determines whether a given keyval and modifier mask constitute
     * a valid keyboard accelerator.
     * <p>
     * For example, the {@code GDK_KEY_a} keyval plus {@link org.gtk.gdk.ModifierType#CONTROL_MASK} mark is valid,
     * and matches the “Ctrl+a” accelerator. But, you can't, for instance, use
     * the {@code GDK_KEY_Control_L} keyval as an accelerator.
     */
    public static boolean acceleratorValid(int keyval, org.gtk.gdk.ModifierType modifiers) {
        var RESULT = gtk_h.gtk_accelerator_valid(keyval, modifiers.getValue());
        return RESULT != 0;
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
    
    /**
     * Initializes {@code iter} to point to {@code target}.
     * <p>
     * If {@code target} is not found, finds the next value after it.
     * If no value >= {@code target} exists in {@code set}, this function returns {@code false}.
     */
    public static boolean bitsetIterInitAt(BitsetIter iter, Bitset set, int target, PointerInteger value) {
        var RESULT = gtk_h.gtk_bitset_iter_init_at(iter.handle(), set.handle(), target, value.handle());
        return RESULT != 0;
    }
    
    /**
     * Initializes an iterator for {@code set} and points it to the first
     * value in {@code set}.
     * <p>
     * If {@code set} is empty, {@code false} is returned and {@code value} is set to {@code G_MAXUINT}.
     */
    public static boolean bitsetIterInitFirst(BitsetIter iter, Bitset set, PointerInteger value) {
        var RESULT = gtk_h.gtk_bitset_iter_init_first(iter.handle(), set.handle(), value.handle());
        return RESULT != 0;
    }
    
    /**
     * Initializes an iterator for {@code set} and points it to the last
     * value in {@code set}.
     * <p>
     * If {@code set} is empty, {@code false} is returned.
     */
    public static boolean bitsetIterInitLast(BitsetIter iter, Bitset set, PointerInteger value) {
        var RESULT = gtk_h.gtk_bitset_iter_init_last(iter.handle(), set.handle(), value.handle());
        return RESULT != 0;
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
        return RESULT != 0;
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
        return RESULT != 0;
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
                        MethodHandles.lookup().findStatic(Gtk.class, "__cbPrinterFunc",
                            MethodType.methodType(int.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(func.hashCode(), func)), 
                    Interop.cbDestroyNotifySymbol(), wait ? 1 : 0);
        } catch (IllegalAccessException | NoSuchMethodException e) {
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
    public static DebugFlags getDebugFlags() {
        var RESULT = gtk_h.gtk_get_debug_flags();
        return new DebugFlags(RESULT);
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
        return new TextDirection(RESULT);
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
    
    /**
     * Converts a color from HSV space to RGB.
     * <p>
     * Input values must be in the [0.0, 1.0] range;
     * output values will be in the same range.
     */
    public static void hsvToRgb(float h, float s, float v, PointerFloat r, PointerFloat g, PointerFloat b) {
        gtk_h.gtk_hsv_to_rgb(h, s, v, r.handle(), g.handle(), b.handle());
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
        return RESULT != 0;
    }
    
    /**
     * Use this function to check if GTK has been initialized with gtk_init()
     * or gtk_init_check().
     */
    public static boolean isInitialized() {
        var RESULT = gtk_h.gtk_is_initialized();
        return RESULT != 0;
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
        return new Ordering(RESULT);
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
    public static org.gtk.gobject.ParamSpec paramSpecExpression(java.lang.String name, java.lang.String nick, java.lang.String blurb, org.gtk.gobject.ParamFlags flags) {
        var RESULT = gtk_h.gtk_param_spec_expression(Interop.allocateNativeString(name).handle(), Interop.allocateNativeString(nick).handle(), Interop.allocateNativeString(blurb).handle(), flags.getValue());
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
                        MethodHandles.lookup().findStatic(Gtk.class, "__cbPageSetupDoneFunc",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(doneCb.hashCode(), doneCb)));
        } catch (IllegalAccessException | NoSuchMethodException e) {
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
     * Converts a color from RGB space to HSV.
     * <p>
     * Input values must be in the [0.0, 1.0] range;
     * output values will be in the same range.
     */
    public static void rgbToHsv(float r, float g, float b, PointerFloat h, PointerFloat s, PointerFloat v) {
        gtk_h.gtk_rgb_to_hsv(r, g, b, h.handle(), s.handle(), v.handle());
    }
    
    /**
     * Sets the GTK debug flags.
     */
    public static void setDebugFlags(DebugFlags flags) {
        gtk_h.gtk_set_debug_flags(flags.getValue());
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
                        MethodHandles.lookup().findStatic(Gtk.class, "__cbAsyncReadyCallback",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(callback.hashCode(), callback)));
        } catch (IllegalAccessException | NoSuchMethodException e) {
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
        return RESULT != 0;
    }
    
    public static void testAccessibleAssertionMessageRole(java.lang.String domain, java.lang.String file, int line, java.lang.String func, java.lang.String expr, Accessible accessible, AccessibleRole expectedRole, AccessibleRole actualRole) {
        gtk_h.gtk_test_accessible_assertion_message_role(Interop.allocateNativeString(domain).handle(), Interop.allocateNativeString(file).handle(), line, Interop.allocateNativeString(func).handle(), Interop.allocateNativeString(expr).handle(), accessible.handle(), expectedRole.getValue(), actualRole.getValue());
    }
    
    /**
     * Checks whether the {@code GtkAccessible} has {@code property} set.
     */
    public static boolean testAccessibleHasProperty(Accessible accessible, AccessibleProperty property) {
        var RESULT = gtk_h.gtk_test_accessible_has_property(accessible.handle(), property.getValue());
        return RESULT != 0;
    }
    
    /**
     * Checks whether the {@code GtkAccessible} has {@code relation} set.
     */
    public static boolean testAccessibleHasRelation(Accessible accessible, AccessibleRelation relation) {
        var RESULT = gtk_h.gtk_test_accessible_has_relation(accessible.handle(), relation.getValue());
        return RESULT != 0;
    }
    
    /**
     * Checks whether the {@code GtkAccessible:accessible-role} of the accessible
     * is {@code role}.
     */
    public static boolean testAccessibleHasRole(Accessible accessible, AccessibleRole role) {
        var RESULT = gtk_h.gtk_test_accessible_has_role(accessible.handle(), role.getValue());
        return RESULT != 0;
    }
    
    /**
     * Checks whether the {@code GtkAccessible} has {@code state} set.
     */
    public static boolean testAccessibleHasState(Accessible accessible, AccessibleState state) {
        var RESULT = gtk_h.gtk_test_accessible_has_state(accessible.handle(), state.getValue());
        return RESULT != 0;
    }
    
    /**
     * Return the type ids that have been registered after
     * calling gtk_test_register_all_types().
     */
    public static PointerIterator<Long> testListAllTypes(PointerInteger nTypes) {
        var RESULT = gtk_h.gtk_test_list_all_types(nTypes.handle());
        return new PointerLong(RESULT).iterator();
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
        return RESULT != 0;
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
        gtk_h.gtk_tree_row_reference_reordered(proxy.handle(), path.handle(), iter.handle(), Interop.allocateNativeArray(newOrder).handle());
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
    
    public static int __cbAssistantPageFunc(int currentPage, MemoryAddress data) {
        int hash = data.get(ValueLayout.JAVA_INT, 0);
        var handler = (AssistantPageFunc) Interop.signalRegistry.get(hash);
        return handler.onAssistantPageFunc(currentPage);
    }
    
    public static boolean __cbEntryCompletionMatchFunc(MemoryAddress completion, MemoryAddress key, MemoryAddress iter, MemoryAddress userData) {
        int hash = userData.get(ValueLayout.JAVA_INT, 0);
        var handler = (EntryCompletionMatchFunc) Interop.signalRegistry.get(hash);
        return handler.onEntryCompletionMatchFunc(new EntryCompletion(References.get(completion, false)), key.getUtf8String(0), new TreeIter(References.get(iter, false)));
    }
    
    public static void __cbMenuButtonCreatePopupFunc(MemoryAddress menuButton, MemoryAddress userData) {
        int hash = userData.get(ValueLayout.JAVA_INT, 0);
        var handler = (MenuButtonCreatePopupFunc) Interop.signalRegistry.get(hash);
        handler.onMenuButtonCreatePopupFunc(new MenuButton(References.get(menuButton, false)));
    }
    
    public static void __cbExpressionNotify(MemoryAddress userData) {
        int hash = userData.get(ValueLayout.JAVA_INT, 0);
        var handler = (ExpressionNotify) Interop.signalRegistry.get(hash);
        handler.onExpressionNotify();
    }
    
    public static Widget __cbFlowBoxCreateWidgetFunc(MemoryAddress item, MemoryAddress userData) {
        int hash = userData.get(ValueLayout.JAVA_INT, 0);
        var handler = (FlowBoxCreateWidgetFunc) Interop.signalRegistry.get(hash);
        return handler.onFlowBoxCreateWidgetFunc(new org.gtk.gobject.Object(References.get(item, false)));
    }
    
    public static void __cbFlowBoxForeachFunc(MemoryAddress box, MemoryAddress child, MemoryAddress userData) {
        int hash = userData.get(ValueLayout.JAVA_INT, 0);
        var handler = (FlowBoxForeachFunc) Interop.signalRegistry.get(hash);
        handler.onFlowBoxForeachFunc(new FlowBox(References.get(box, false)), new FlowBoxChild(References.get(child, false)));
    }
    
    public static java.lang.String __cbScaleFormatValueFunc(MemoryAddress scale, double value, MemoryAddress userData) {
        int hash = userData.get(ValueLayout.JAVA_INT, 0);
        var handler = (ScaleFormatValueFunc) Interop.signalRegistry.get(hash);
        return handler.onScaleFormatValueFunc(new Scale(References.get(scale, false)), value);
    }
    
    public static boolean __cbCellCallback(MemoryAddress renderer, MemoryAddress data) {
        int hash = data.get(ValueLayout.JAVA_INT, 0);
        var handler = (CellCallback) Interop.signalRegistry.get(hash);
        return handler.onCellCallback(new CellRenderer(References.get(renderer, false)));
    }
    
    public static boolean __cbListBoxFilterFunc(MemoryAddress row, MemoryAddress userData) {
        int hash = userData.get(ValueLayout.JAVA_INT, 0);
        var handler = (ListBoxFilterFunc) Interop.signalRegistry.get(hash);
        return handler.onListBoxFilterFunc(new ListBoxRow(References.get(row, false)));
    }
    
    public static int __cbListBoxSortFunc(MemoryAddress row1, MemoryAddress row2, MemoryAddress userData) {
        int hash = userData.get(ValueLayout.JAVA_INT, 0);
        var handler = (ListBoxSortFunc) Interop.signalRegistry.get(hash);
        return handler.onListBoxSortFunc(new ListBoxRow(References.get(row1, false)), new ListBoxRow(References.get(row2, false)));
    }
    
    public static void __cbCellLayoutDataFunc(MemoryAddress cellLayout, MemoryAddress cell, MemoryAddress treeModel, MemoryAddress iter, MemoryAddress data) {
        int hash = data.get(ValueLayout.JAVA_INT, 0);
        var handler = (CellLayoutDataFunc) Interop.signalRegistry.get(hash);
        handler.onCellLayoutDataFunc(new CellLayout.CellLayoutImpl(References.get(cellLayout, false)), new CellRenderer(References.get(cell, false)), new TreeModel.TreeModelImpl(References.get(treeModel, false)), new TreeIter(References.get(iter, false)));
    }
    
    public static void __cbListBoxForeachFunc(MemoryAddress box, MemoryAddress row, MemoryAddress userData) {
        int hash = userData.get(ValueLayout.JAVA_INT, 0);
        var handler = (ListBoxForeachFunc) Interop.signalRegistry.get(hash);
        handler.onListBoxForeachFunc(new ListBox(References.get(box, false)), new ListBoxRow(References.get(row, false)));
    }
    
    public static Widget __cbListBoxCreateWidgetFunc(MemoryAddress item, MemoryAddress userData) {
        int hash = userData.get(ValueLayout.JAVA_INT, 0);
        var handler = (ListBoxCreateWidgetFunc) Interop.signalRegistry.get(hash);
        return handler.onListBoxCreateWidgetFunc(new org.gtk.gobject.Object(References.get(item, false)));
    }
    
    public static void __cbTreeViewMappingFunc(MemoryAddress treeView, MemoryAddress path, MemoryAddress userData) {
        int hash = userData.get(ValueLayout.JAVA_INT, 0);
        var handler = (TreeViewMappingFunc) Interop.signalRegistry.get(hash);
        handler.onTreeViewMappingFunc(new TreeView(References.get(treeView, false)), new TreePath(References.get(path, false)));
    }
    
    public static boolean __cbTreeViewColumnDropFunc(MemoryAddress treeView, MemoryAddress column, MemoryAddress prevColumn, MemoryAddress nextColumn, MemoryAddress data) {
        int hash = data.get(ValueLayout.JAVA_INT, 0);
        var handler = (TreeViewColumnDropFunc) Interop.signalRegistry.get(hash);
        return handler.onTreeViewColumnDropFunc(new TreeView(References.get(treeView, false)), new TreeViewColumn(References.get(column, false)), new TreeViewColumn(References.get(prevColumn, false)), new TreeViewColumn(References.get(nextColumn, false)));
    }
    
    public static void __cbTreeSelectionForeachFunc(MemoryAddress model, MemoryAddress path, MemoryAddress iter, MemoryAddress data) {
        int hash = data.get(ValueLayout.JAVA_INT, 0);
        var handler = (TreeSelectionForeachFunc) Interop.signalRegistry.get(hash);
        handler.onTreeSelectionForeachFunc(new TreeModel.TreeModelImpl(References.get(model, false)), new TreePath(References.get(path, false)), new TreeIter(References.get(iter, false)));
    }
    
    public static int __cbFlowBoxSortFunc(MemoryAddress child1, MemoryAddress child2, MemoryAddress userData) {
        int hash = userData.get(ValueLayout.JAVA_INT, 0);
        var handler = (FlowBoxSortFunc) Interop.signalRegistry.get(hash);
        return handler.onFlowBoxSortFunc(new FlowBoxChild(References.get(child1, false)), new FlowBoxChild(References.get(child2, false)));
    }
    
    public static boolean __cbFontFilterFunc(MemoryAddress family, MemoryAddress face, MemoryAddress data) {
        int hash = data.get(ValueLayout.JAVA_INT, 0);
        var handler = (FontFilterFunc) Interop.signalRegistry.get(hash);
        return handler.onFontFilterFunc(new org.pango.FontFamily(References.get(family, false)), new org.pango.FontFace(References.get(face, false)));
    }
    
    public static boolean __cbTreeModelForeachFunc(MemoryAddress model, MemoryAddress path, MemoryAddress iter, MemoryAddress data) {
        int hash = data.get(ValueLayout.JAVA_INT, 0);
        var handler = (TreeModelForeachFunc) Interop.signalRegistry.get(hash);
        return handler.onTreeModelForeachFunc(new TreeModel.TreeModelImpl(References.get(model, false)), new TreePath(References.get(path, false)), new TreeIter(References.get(iter, false)));
    }
    
    public static void __cbTextTagTableForeach(MemoryAddress tag, MemoryAddress data) {
        int hash = data.get(ValueLayout.JAVA_INT, 0);
        var handler = (TextTagTableForeach) Interop.signalRegistry.get(hash);
        handler.onTextTagTableForeach(new TextTag(References.get(tag, false)));
    }
    
    public static void __cbPrintSettingsFunc(MemoryAddress key, MemoryAddress value, MemoryAddress userData) {
        int hash = userData.get(ValueLayout.JAVA_INT, 0);
        var handler = (PrintSettingsFunc) Interop.signalRegistry.get(hash);
        handler.onPrintSettingsFunc(key.getUtf8String(0), value.getUtf8String(0));
    }
    
    public static void __cbTreeModelFilterModifyFunc(MemoryAddress model, MemoryAddress iter, MemoryAddress value, int column, MemoryAddress data) {
        int hash = data.get(ValueLayout.JAVA_INT, 0);
        var handler = (TreeModelFilterModifyFunc) Interop.signalRegistry.get(hash);
        handler.onTreeModelFilterModifyFunc(new TreeModel.TreeModelImpl(References.get(model, false)), new TreeIter(References.get(iter, false)), new org.gtk.gobject.Value(References.get(value, false)), column);
    }
    
    public static boolean __cbTreeViewSearchEqualFunc(MemoryAddress model, int column, MemoryAddress key, MemoryAddress iter, MemoryAddress searchData) {
        int hash = searchData.get(ValueLayout.JAVA_INT, 0);
        var handler = (TreeViewSearchEqualFunc) Interop.signalRegistry.get(hash);
        return handler.onTreeViewSearchEqualFunc(new TreeModel.TreeModelImpl(References.get(model, false)), column, key.getUtf8String(0), new TreeIter(References.get(iter, false)));
    }
    
    public static void __cbTreeCellDataFunc(MemoryAddress treeColumn, MemoryAddress cell, MemoryAddress treeModel, MemoryAddress iter, MemoryAddress data) {
        int hash = data.get(ValueLayout.JAVA_INT, 0);
        var handler = (TreeCellDataFunc) Interop.signalRegistry.get(hash);
        handler.onTreeCellDataFunc(new TreeViewColumn(References.get(treeColumn, false)), new CellRenderer(References.get(cell, false)), new TreeModel.TreeModelImpl(References.get(treeModel, false)), new TreeIter(References.get(iter, false)));
    }
    
    public static boolean __cbTreeModelFilterVisibleFunc(MemoryAddress model, MemoryAddress iter, MemoryAddress data) {
        int hash = data.get(ValueLayout.JAVA_INT, 0);
        var handler = (TreeModelFilterVisibleFunc) Interop.signalRegistry.get(hash);
        return handler.onTreeModelFilterVisibleFunc(new TreeModel.TreeModelImpl(References.get(model, false)), new TreeIter(References.get(iter, false)));
    }
    
    public static boolean __cbTextCharPredicate(int ch, MemoryAddress userData) {
        int hash = userData.get(ValueLayout.JAVA_INT, 0);
        var handler = (TextCharPredicate) Interop.signalRegistry.get(hash);
        return handler.onTextCharPredicate(ch);
    }
    
    public static void __cbPageSetupDoneFunc(MemoryAddress pageSetup, MemoryAddress data) {
        int hash = data.get(ValueLayout.JAVA_INT, 0);
        var handler = (PageSetupDoneFunc) Interop.signalRegistry.get(hash);
        handler.onPageSetupDoneFunc(new PageSetup(References.get(pageSetup, false)));
    }
    
    public static void __cbIconViewForeachFunc(MemoryAddress iconView, MemoryAddress path, MemoryAddress data) {
        int hash = data.get(ValueLayout.JAVA_INT, 0);
        var handler = (IconViewForeachFunc) Interop.signalRegistry.get(hash);
        handler.onIconViewForeachFunc(new IconView(References.get(iconView, false)), new TreePath(References.get(path, false)));
    }
    
    public static org.gtk.gobject.Object __cbMapListModelMapFunc(MemoryAddress item, MemoryAddress userData) {
        int hash = userData.get(ValueLayout.JAVA_INT, 0);
        var handler = (MapListModelMapFunc) Interop.signalRegistry.get(hash);
        return handler.onMapListModelMapFunc(new org.gtk.gobject.Object(References.get(item, true)));
    }
    
    public static boolean __cbFlowBoxFilterFunc(MemoryAddress child, MemoryAddress userData) {
        int hash = userData.get(ValueLayout.JAVA_INT, 0);
        var handler = (FlowBoxFilterFunc) Interop.signalRegistry.get(hash);
        return handler.onFlowBoxFilterFunc(new FlowBoxChild(References.get(child, false)));
    }
    
    public static boolean __cbCustomFilterFunc(MemoryAddress item, MemoryAddress userData) {
        int hash = userData.get(ValueLayout.JAVA_INT, 0);
        var handler = (CustomFilterFunc) Interop.signalRegistry.get(hash);
        return handler.onCustomFilterFunc(new org.gtk.gobject.Object(References.get(item, false)));
    }
    
    public static void __cbPrintJobCompleteFunc(MemoryAddress printJob, MemoryAddress userData, MemoryAddress error) {
        int hash = userData.get(ValueLayout.JAVA_INT, 0);
        var handler = (PrintJobCompleteFunc) Interop.signalRegistry.get(hash);
        handler.onPrintJobCompleteFunc(new PrintJob(References.get(printJob, false)), new org.gtk.glib.Error(References.get(error, false)));
    }
    
    public static org.gtk.gio.ListModel __cbTreeListModelCreateModelFunc(MemoryAddress item, MemoryAddress userData) {
        int hash = userData.get(ValueLayout.JAVA_INT, 0);
        var handler = (TreeListModelCreateModelFunc) Interop.signalRegistry.get(hash);
        return handler.onTreeListModelCreateModelFunc(new org.gtk.gobject.Object(References.get(item, false)));
    }
    
    public static boolean __cbTreeSelectionFunc(MemoryAddress selection, MemoryAddress model, MemoryAddress path, int pathCurrentlySelected, MemoryAddress data) {
        int hash = data.get(ValueLayout.JAVA_INT, 0);
        var handler = (TreeSelectionFunc) Interop.signalRegistry.get(hash);
        return handler.onTreeSelectionFunc(new TreeSelection(References.get(selection, false)), new TreeModel.TreeModelImpl(References.get(model, false)), new TreePath(References.get(path, false)), pathCurrentlySelected != 0);
    }
    
    public static void __cbDrawingAreaDrawFunc(MemoryAddress drawingArea, MemoryAddress cr, int width, int height, MemoryAddress userData) {
        int hash = userData.get(ValueLayout.JAVA_INT, 0);
        var handler = (DrawingAreaDrawFunc) Interop.signalRegistry.get(hash);
        handler.onDrawingAreaDrawFunc(new DrawingArea(References.get(drawingArea, false)), new org.cairographics.Context(References.get(cr, false)), width, height);
    }
    
    public static boolean __cbShortcutFunc(MemoryAddress widget, MemoryAddress args, MemoryAddress userData) {
        int hash = userData.get(ValueLayout.JAVA_INT, 0);
        var handler = (ShortcutFunc) Interop.signalRegistry.get(hash);
        return handler.onShortcutFunc(new Widget(References.get(widget, false)), new org.gtk.glib.Variant(References.get(args, false)));
    }
    
    public static void __cbListBoxUpdateHeaderFunc(MemoryAddress row, MemoryAddress before, MemoryAddress userData) {
        int hash = userData.get(ValueLayout.JAVA_INT, 0);
        var handler = (ListBoxUpdateHeaderFunc) Interop.signalRegistry.get(hash);
        handler.onListBoxUpdateHeaderFunc(new ListBoxRow(References.get(row, false)), new ListBoxRow(References.get(before, false)));
    }
    
    public static int __cbTreeIterCompareFunc(MemoryAddress model, MemoryAddress a, MemoryAddress b, MemoryAddress userData) {
        int hash = userData.get(ValueLayout.JAVA_INT, 0);
        var handler = (TreeIterCompareFunc) Interop.signalRegistry.get(hash);
        return handler.onTreeIterCompareFunc(new TreeModel.TreeModelImpl(References.get(model, false)), new TreeIter(References.get(a, false)), new TreeIter(References.get(b, false)));
    }
    
    public static boolean __cbCellAllocCallback(MemoryAddress renderer, MemoryAddress cellArea, MemoryAddress cellBackground, MemoryAddress data) {
        int hash = data.get(ValueLayout.JAVA_INT, 0);
        var handler = (CellAllocCallback) Interop.signalRegistry.get(hash);
        return handler.onCellAllocCallback(new CellRenderer(References.get(renderer, false)), new org.gtk.gdk.Rectangle(References.get(cellArea, false)), new org.gtk.gdk.Rectangle(References.get(cellBackground, false)));
    }
    
    public static boolean __cbTickCallback(MemoryAddress widget, MemoryAddress frameClock, MemoryAddress userData) {
        int hash = userData.get(ValueLayout.JAVA_INT, 0);
        var handler = (TickCallback) Interop.signalRegistry.get(hash);
        return handler.onTickCallback(new Widget(References.get(widget, false)), new org.gtk.gdk.FrameClock(References.get(frameClock, false)));
    }
    
    public static boolean __cbPrinterFunc(MemoryAddress printer, MemoryAddress data) {
        int hash = data.get(ValueLayout.JAVA_INT, 0);
        var handler = (PrinterFunc) Interop.signalRegistry.get(hash);
        return handler.onPrinterFunc(new Printer(References.get(printer, false)));
    }
    
    public static boolean __cbTreeViewRowSeparatorFunc(MemoryAddress model, MemoryAddress iter, MemoryAddress data) {
        int hash = data.get(ValueLayout.JAVA_INT, 0);
        var handler = (TreeViewRowSeparatorFunc) Interop.signalRegistry.get(hash);
        return handler.onTreeViewRowSeparatorFunc(new TreeModel.TreeModelImpl(References.get(model, false)), new TreeIter(References.get(iter, false)));
    }
    
}
