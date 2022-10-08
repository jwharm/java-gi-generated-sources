package org.gtk.gtk;

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

    static final MethodHandle gtk_accelerator_get_default_mod_mask = Interop.downcallHandle(
        "gtk_accelerator_get_default_mod_mask",
        FunctionDescriptor.of(ValueLayout.JAVA_INT)
    );
    
    /**
     * Gets the modifier mask.
     * <p>
     * The modifier mask determines which modifiers are considered significant
     * for keyboard accelerators. This includes all keyboard modifiers except
     * for {@link org.gtk.gdk.ModifierType#LOCK_MASK}.
     */
    public static org.gtk.gdk.ModifierType acceleratorGetDefaultModMask() {
        try {
            var RESULT = (int) gtk_accelerator_get_default_mod_mask.invokeExact();
            return new org.gtk.gdk.ModifierType(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_accelerator_get_label = Interop.downcallHandle(
        "gtk_accelerator_get_label",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
    /**
     * Converts an accelerator keyval and modifier mask into a string
     * which can be used to represent the accelerator to the user.
     */
    public static java.lang.String acceleratorGetLabel(int acceleratorKey, org.gtk.gdk.ModifierType acceleratorMods) {
        try {
            var RESULT = (MemoryAddress) gtk_accelerator_get_label.invokeExact(acceleratorKey, acceleratorMods.getValue());
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_accelerator_get_label_with_keycode = Interop.downcallHandle(
        "gtk_accelerator_get_label_with_keycode",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
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
        try {
            var RESULT = (MemoryAddress) gtk_accelerator_get_label_with_keycode.invokeExact(display.handle(), acceleratorKey, keycode, acceleratorMods.getValue());
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_accelerator_name = Interop.downcallHandle(
        "gtk_accelerator_name",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
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
        try {
            var RESULT = (MemoryAddress) gtk_accelerator_name.invokeExact(acceleratorKey, acceleratorMods.getValue());
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_accelerator_name_with_keycode = Interop.downcallHandle(
        "gtk_accelerator_name_with_keycode",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
    /**
     * Converts an accelerator keyval and modifier mask
     * into a string parseable by gtk_accelerator_parse_with_keycode().
     * <p>
     * This is similar to {@link Gtk#acceleratorName} but handling keycodes.
     * This is only useful for system-level components, applications
     * should use {@link Gtk#acceleratorName} instead.
     */
    public static java.lang.String acceleratorNameWithKeycode(org.gtk.gdk.Display display, int acceleratorKey, int keycode, org.gtk.gdk.ModifierType acceleratorMods) {
        try {
            var RESULT = (MemoryAddress) gtk_accelerator_name_with_keycode.invokeExact(display.handle(), acceleratorKey, keycode, acceleratorMods.getValue());
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_accelerator_parse = Interop.downcallHandle(
        "gtk_accelerator_parse",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
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
        try {
            var RESULT = (int) gtk_accelerator_parse.invokeExact(Interop.allocateNativeString(accelerator).handle(), acceleratorKey.handle(), new PointerInteger(acceleratorMods.getValue()).handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_accelerator_parse_with_keycode = Interop.downcallHandle(
        "gtk_accelerator_parse_with_keycode",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
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
    public static boolean acceleratorParseWithKeycode(java.lang.String accelerator, org.gtk.gdk.Display display, PointerInteger acceleratorKey, PointerInteger acceleratorCodes, org.gtk.gdk.ModifierType acceleratorMods) {
        try {
            var RESULT = (int) gtk_accelerator_parse_with_keycode.invokeExact(Interop.allocateNativeString(accelerator).handle(), display.handle(), acceleratorKey.handle(), acceleratorCodes.handle(), new PointerInteger(acceleratorMods.getValue()).handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_accelerator_valid = Interop.downcallHandle(
        "gtk_accelerator_valid",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
    /**
     * Determines whether a given keyval and modifier mask constitute
     * a valid keyboard accelerator.
     * <p>
     * For example, the {@code GDK_KEY_a} keyval plus {@link org.gtk.gdk.ModifierType#CONTROL_MASK} mark is valid,
     * and matches the “Ctrl+a” accelerator. But, you can't, for instance, use
     * the {@code GDK_KEY_Control_L} keyval as an accelerator.
     */
    public static boolean acceleratorValid(int keyval, org.gtk.gdk.ModifierType modifiers) {
        try {
            var RESULT = (int) gtk_accelerator_valid.invokeExact(keyval, modifiers.getValue());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_accessible_property_init_value = Interop.downcallHandle(
        "gtk_accessible_property_init_value",
        FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    public static void accessiblePropertyInitValue(AccessibleProperty property, org.gtk.gobject.Value value) {
        try {
            gtk_accessible_property_init_value.invokeExact(property.getValue(), value.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_accessible_relation_init_value = Interop.downcallHandle(
        "gtk_accessible_relation_init_value",
        FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    public static void accessibleRelationInitValue(AccessibleRelation relation, org.gtk.gobject.Value value) {
        try {
            gtk_accessible_relation_init_value.invokeExact(relation.getValue(), value.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_accessible_state_init_value = Interop.downcallHandle(
        "gtk_accessible_state_init_value",
        FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    public static void accessibleStateInitValue(AccessibleState state, org.gtk.gobject.Value value) {
        try {
            gtk_accessible_state_init_value.invokeExact(state.getValue(), value.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_bitset_iter_init_at = Interop.downcallHandle(
        "gtk_bitset_iter_init_at",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Initializes {@code iter} to point to {@code target}.
     * <p>
     * If {@code target} is not found, finds the next value after it.
     * If no value >= {@code target} exists in {@code set}, this function returns {@code false}.
     */
    public static boolean bitsetIterInitAt(BitsetIter iter, Bitset set, int target, PointerInteger value) {
        try {
            var RESULT = (int) gtk_bitset_iter_init_at.invokeExact(iter.handle(), set.handle(), target, value.handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_bitset_iter_init_first = Interop.downcallHandle(
        "gtk_bitset_iter_init_first",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Initializes an iterator for {@code set} and points it to the first
     * value in {@code set}.
     * <p>
     * If {@code set} is empty, {@code false} is returned and {@code value} is set to {@code G_MAXUINT}.
     */
    public static boolean bitsetIterInitFirst(BitsetIter iter, Bitset set, PointerInteger value) {
        try {
            var RESULT = (int) gtk_bitset_iter_init_first.invokeExact(iter.handle(), set.handle(), value.handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_bitset_iter_init_last = Interop.downcallHandle(
        "gtk_bitset_iter_init_last",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Initializes an iterator for {@code set} and points it to the last
     * value in {@code set}.
     * <p>
     * If {@code set} is empty, {@code false} is returned.
     */
    public static boolean bitsetIterInitLast(BitsetIter iter, Bitset set, PointerInteger value) {
        try {
            var RESULT = (int) gtk_bitset_iter_init_last.invokeExact(iter.handle(), set.handle(), value.handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_builder_error_quark = Interop.downcallHandle(
        "gtk_builder_error_quark",
        FunctionDescriptor.of(ValueLayout.JAVA_INT)
    );
    
    public static org.gtk.glib.Quark builderErrorQuark() {
        try {
            var RESULT = (int) gtk_builder_error_quark.invokeExact();
            return new org.gtk.glib.Quark(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_check_version = Interop.downcallHandle(
        "gtk_check_version",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
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
        try {
            var RESULT = (MemoryAddress) gtk_check_version.invokeExact(requiredMajor, requiredMinor, requiredMicro);
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_constraint_vfl_parser_error_quark = Interop.downcallHandle(
        "gtk_constraint_vfl_parser_error_quark",
        FunctionDescriptor.of(ValueLayout.JAVA_INT)
    );
    
    public static org.gtk.glib.Quark constraintVflParserErrorQuark() {
        try {
            var RESULT = (int) gtk_constraint_vfl_parser_error_quark.invokeExact();
            return new org.gtk.glib.Quark(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_css_parser_error_quark = Interop.downcallHandle(
        "gtk_css_parser_error_quark",
        FunctionDescriptor.of(ValueLayout.JAVA_INT)
    );
    
    public static org.gtk.glib.Quark cssParserErrorQuark() {
        try {
            var RESULT = (int) gtk_css_parser_error_quark.invokeExact();
            return new org.gtk.glib.Quark(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_css_parser_warning_quark = Interop.downcallHandle(
        "gtk_css_parser_warning_quark",
        FunctionDescriptor.of(ValueLayout.JAVA_INT)
    );
    
    public static org.gtk.glib.Quark cssParserWarningQuark() {
        try {
            var RESULT = (int) gtk_css_parser_warning_quark.invokeExact();
            return new org.gtk.glib.Quark(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_disable_setlocale = Interop.downcallHandle(
        "gtk_disable_setlocale",
        FunctionDescriptor.ofVoid()
    );
    
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
        try {
            gtk_disable_setlocale.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_distribute_natural_allocation = Interop.downcallHandle(
        "gtk_distribute_natural_allocation",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Distributes {@code extra_space} to child {@code sizes} by bringing smaller
     * children up to natural size first.
     * <p>
     * The remaining space will be added to the {@code minimum_size} member of the
     * {@code GtkRequestedSize} struct. If all sizes reach their natural size then
     * the remaining space is returned.
     */
    public static int distributeNaturalAllocation(int extraSpace, int nRequestedSizes, RequestedSize[] sizes) {
        try {
            var RESULT = (int) gtk_distribute_natural_allocation.invokeExact(extraSpace, nRequestedSizes, Interop.allocateNativeArray(sizes).handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_editable_delegate_get_property = Interop.downcallHandle(
        "gtk_editable_delegate_get_property",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets a property of the {@code GtkEditable} delegate for {@code object}.
     * <p>
     * This is helper function that should be called in the {@code get_property}
     * function of your {@code GtkEditable} implementation, before handling your
     * own properties.
     */
    public static boolean editableDelegateGetProperty(org.gtk.gobject.Object object, int propId, org.gtk.gobject.Value value, org.gtk.gobject.ParamSpec pspec) {
        try {
            var RESULT = (int) gtk_editable_delegate_get_property.invokeExact(object.handle(), propId, value.handle(), pspec.handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_editable_delegate_set_property = Interop.downcallHandle(
        "gtk_editable_delegate_set_property",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets a property on the {@code GtkEditable} delegate for {@code object}.
     * <p>
     * This is a helper function that should be called in the {@code set_property}
     * function of your {@code GtkEditable} implementation, before handling your
     * own properties.
     */
    public static boolean editableDelegateSetProperty(org.gtk.gobject.Object object, int propId, org.gtk.gobject.Value value, org.gtk.gobject.ParamSpec pspec) {
        try {
            var RESULT = (int) gtk_editable_delegate_set_property.invokeExact(object.handle(), propId, value.handle(), pspec.handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_editable_install_properties = Interop.downcallHandle(
        "gtk_editable_install_properties",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
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
        try {
            var RESULT = (int) gtk_editable_install_properties.invokeExact(objectClass.handle(), firstProp);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_enumerate_printers = Interop.downcallHandle(
        "gtk_enumerate_printers",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Calls a function for all {@code GtkPrinter}s.
     * <p>
     * If {@code func} returns {@code true}, the enumeration is stopped.
     */
    public static void enumeratePrinters(PrinterFunc func, boolean wait) {
        try {
            gtk_enumerate_printers.invokeExact(
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gtk.class, "__cbPrinterFunc",
                            MethodType.methodType(int.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(func.hashCode(), func)), 
                    Interop.cbDestroyNotifySymbol(), wait ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_file_chooser_error_quark = Interop.downcallHandle(
        "gtk_file_chooser_error_quark",
        FunctionDescriptor.of(ValueLayout.JAVA_INT)
    );
    
    /**
     * Registers an error quark for {@code GtkFileChooser} errors.
     */
    public static org.gtk.glib.Quark fileChooserErrorQuark() {
        try {
            var RESULT = (int) gtk_file_chooser_error_quark.invokeExact();
            return new org.gtk.glib.Quark(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_get_binary_age = Interop.downcallHandle(
        "gtk_get_binary_age",
        FunctionDescriptor.of(ValueLayout.JAVA_INT)
    );
    
    /**
     * Returns the binary age as passed to {@code libtool}.
     * <p>
     * If {@code libtool} means nothing to you, don't worry about it.
     */
    public static int getBinaryAge() {
        try {
            var RESULT = (int) gtk_get_binary_age.invokeExact();
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_get_debug_flags = Interop.downcallHandle(
        "gtk_get_debug_flags",
        FunctionDescriptor.of(ValueLayout.JAVA_INT)
    );
    
    /**
     * Returns the GTK debug flags that are currently active.
     * <p>
     * This function is intended for GTK modules that want
     * to adjust their debug output based on GTK debug flags.
     */
    public static DebugFlags getDebugFlags() {
        try {
            var RESULT = (int) gtk_get_debug_flags.invokeExact();
            return new DebugFlags(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_get_default_language = Interop.downcallHandle(
        "gtk_get_default_language",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
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
        try {
            var RESULT = (MemoryAddress) gtk_get_default_language.invokeExact();
            return new org.pango.Language(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_get_interface_age = Interop.downcallHandle(
        "gtk_get_interface_age",
        FunctionDescriptor.of(ValueLayout.JAVA_INT)
    );
    
    /**
     * Returns the interface age as passed to {@code libtool}.
     * <p>
     * If {@code libtool} means nothing to you, don't worry about it.
     */
    public static int getInterfaceAge() {
        try {
            var RESULT = (int) gtk_get_interface_age.invokeExact();
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_get_locale_direction = Interop.downcallHandle(
        "gtk_get_locale_direction",
        FunctionDescriptor.of(ValueLayout.JAVA_INT)
    );
    
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
        try {
            var RESULT = (int) gtk_get_locale_direction.invokeExact();
            return new TextDirection(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_get_major_version = Interop.downcallHandle(
        "gtk_get_major_version",
        FunctionDescriptor.of(ValueLayout.JAVA_INT)
    );
    
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
        try {
            var RESULT = (int) gtk_get_major_version.invokeExact();
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_get_micro_version = Interop.downcallHandle(
        "gtk_get_micro_version",
        FunctionDescriptor.of(ValueLayout.JAVA_INT)
    );
    
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
        try {
            var RESULT = (int) gtk_get_micro_version.invokeExact();
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_get_minor_version = Interop.downcallHandle(
        "gtk_get_minor_version",
        FunctionDescriptor.of(ValueLayout.JAVA_INT)
    );
    
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
        try {
            var RESULT = (int) gtk_get_minor_version.invokeExact();
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_hsv_to_rgb = Interop.downcallHandle(
        "gtk_hsv_to_rgb",
        FunctionDescriptor.ofVoid(ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Converts a color from HSV space to RGB.
     * <p>
     * Input values must be in the [0.0, 1.0] range;
     * output values will be in the same range.
     */
    public static void hsvToRgb(float h, float s, float v, PointerFloat r, PointerFloat g, PointerFloat b) {
        try {
            gtk_hsv_to_rgb.invokeExact(h, s, v, r.handle(), g.handle(), b.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_icon_theme_error_quark = Interop.downcallHandle(
        "gtk_icon_theme_error_quark",
        FunctionDescriptor.of(ValueLayout.JAVA_INT)
    );
    
    public static org.gtk.glib.Quark iconThemeErrorQuark() {
        try {
            var RESULT = (int) gtk_icon_theme_error_quark.invokeExact();
            return new org.gtk.glib.Quark(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_init = Interop.downcallHandle(
        "gtk_init",
        FunctionDescriptor.ofVoid()
    );
    
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
        try {
            gtk_init.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_init_check = Interop.downcallHandle(
        "gtk_init_check",
        FunctionDescriptor.of(ValueLayout.JAVA_INT)
    );
    
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
        try {
            var RESULT = (int) gtk_init_check.invokeExact();
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_is_initialized = Interop.downcallHandle(
        "gtk_is_initialized",
        FunctionDescriptor.of(ValueLayout.JAVA_INT)
    );
    
    /**
     * Use this function to check if GTK has been initialized with gtk_init()
     * or gtk_init_check().
     */
    public static boolean isInitialized() {
        try {
            var RESULT = (int) gtk_is_initialized.invokeExact();
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_native_get_for_surface = Interop.downcallHandle(
        "gtk_native_get_for_surface",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Finds the {@code GtkNative} associated with the surface.
     */
    public static Native nativeGetForSurface(org.gtk.gdk.Surface surface) {
        try {
            var RESULT = (MemoryAddress) gtk_native_get_for_surface.invokeExact(surface.handle());
            return new Native.NativeImpl(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_ordering_from_cmpfunc = Interop.downcallHandle(
        "gtk_ordering_from_cmpfunc",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
    /**
     * Converts the result of a {@code GCompareFunc} like strcmp() to a
     * {@code GtkOrdering} value.
     */
    public static Ordering orderingFromCmpfunc(int cmpfuncResult) {
        try {
            var RESULT = (int) gtk_ordering_from_cmpfunc.invokeExact(cmpfuncResult);
            return new Ordering(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_paper_size_get_default = Interop.downcallHandle(
        "gtk_paper_size_get_default",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the name of the default paper size, which
     * depends on the current locale.
     */
    public static java.lang.String paperSizeGetDefault() {
        try {
            var RESULT = (MemoryAddress) gtk_paper_size_get_default.invokeExact();
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_paper_size_get_paper_sizes = Interop.downcallHandle(
        "gtk_paper_size_get_paper_sizes",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Creates a list of known paper sizes.
     */
    public static org.gtk.glib.List paperSizeGetPaperSizes(boolean includeCustom) {
        try {
            var RESULT = (MemoryAddress) gtk_paper_size_get_paper_sizes.invokeExact(includeCustom ? 1 : 0);
            return new org.gtk.glib.List(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_param_spec_expression = Interop.downcallHandle(
        "gtk_param_spec_expression",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Creates a new {@code GParamSpec} instance for a property holding a {@code GtkExpression}.
     * <p>
     * See {@code g_param_spec_internal()} for details on the property strings.
     */
    public static org.gtk.gobject.ParamSpec paramSpecExpression(java.lang.String name, java.lang.String nick, java.lang.String blurb, org.gtk.gobject.ParamFlags flags) {
        try {
            var RESULT = (MemoryAddress) gtk_param_spec_expression.invokeExact(Interop.allocateNativeString(name).handle(), Interop.allocateNativeString(nick).handle(), Interop.allocateNativeString(blurb).handle(), flags.getValue());
            return new org.gtk.gobject.ParamSpec(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_print_error_quark = Interop.downcallHandle(
        "gtk_print_error_quark",
        FunctionDescriptor.of(ValueLayout.JAVA_INT)
    );
    
    /**
     * Registers an error quark for {@code GtkPrintOperation} if necessary.
     */
    public static org.gtk.glib.Quark printErrorQuark() {
        try {
            var RESULT = (int) gtk_print_error_quark.invokeExact();
            return new org.gtk.glib.Quark(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_print_run_page_setup_dialog = Interop.downcallHandle(
        "gtk_print_run_page_setup_dialog",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
        try {
            var RESULT = (MemoryAddress) gtk_print_run_page_setup_dialog.invokeExact(parent.handle(), pageSetup.handle(), settings.handle());
            return new PageSetup(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_print_run_page_setup_dialog_async = Interop.downcallHandle(
        "gtk_print_run_page_setup_dialog_async",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Runs a page setup dialog, letting the user modify the values from {@code page_setup}.
     * <p>
     * In contrast to gtk_print_run_page_setup_dialog(), this function  returns after
     * showing the page setup dialog on platforms that support this, and calls {@code done_cb}
     * from a signal handler for the ::response signal of the dialog.
     */
    public static void printRunPageSetupDialogAsync(Window parent, PageSetup pageSetup, PrintSettings settings, PageSetupDoneFunc doneCb) {
        try {
            gtk_print_run_page_setup_dialog_async.invokeExact(parent.handle(), pageSetup.handle(), settings.handle(), 
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gtk.class, "__cbPageSetupDoneFunc",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(doneCb.hashCode(), doneCb)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_recent_manager_error_quark = Interop.downcallHandle(
        "gtk_recent_manager_error_quark",
        FunctionDescriptor.of(ValueLayout.JAVA_INT)
    );
    
    public static org.gtk.glib.Quark recentManagerErrorQuark() {
        try {
            var RESULT = (int) gtk_recent_manager_error_quark.invokeExact();
            return new org.gtk.glib.Quark(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_render_activity = Interop.downcallHandle(
        "gtk_render_activity",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE)
    );
    
    /**
     * Renders an activity indicator (such as in {@code GtkSpinner}).
     * The state {@link StateFlags#CHECKED} determines whether there is
     * activity going on.
     */
    public static void renderActivity(StyleContext context, org.cairographics.Context cr, double x, double y, double width, double height) {
        try {
            gtk_render_activity.invokeExact(context.handle(), cr.handle(), x, y, width, height);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_render_arrow = Interop.downcallHandle(
        "gtk_render_arrow",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE)
    );
    
    /**
     * Renders an arrow pointing to {@code angle}.
     * <p>
     * Typical arrow rendering at 0, 1⁄2 π;, π; and 3⁄2 π:
     * <p>
     * ![](arrows.png)
     */
    public static void renderArrow(StyleContext context, org.cairographics.Context cr, double angle, double x, double y, double size) {
        try {
            gtk_render_arrow.invokeExact(context.handle(), cr.handle(), angle, x, y, size);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_render_background = Interop.downcallHandle(
        "gtk_render_background",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE)
    );
    
    /**
     * Renders the background of an element.
     * <p>
     * Typical background rendering, showing the effect of
     * {@code background-image}, {@code border-width} and {@code border-radius}:
     * <p>
     * ![](background.png)
     */
    public static void renderBackground(StyleContext context, org.cairographics.Context cr, double x, double y, double width, double height) {
        try {
            gtk_render_background.invokeExact(context.handle(), cr.handle(), x, y, width, height);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_render_check = Interop.downcallHandle(
        "gtk_render_check",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE)
    );
    
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
        try {
            gtk_render_check.invokeExact(context.handle(), cr.handle(), x, y, width, height);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_render_expander = Interop.downcallHandle(
        "gtk_render_expander",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE)
    );
    
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
        try {
            gtk_render_expander.invokeExact(context.handle(), cr.handle(), x, y, width, height);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_render_focus = Interop.downcallHandle(
        "gtk_render_focus",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE)
    );
    
    /**
     * Renders a focus indicator on the rectangle determined by @x, @y, {@code width}, {@code height}.
     * <p>
     * Typical focus rendering:
     * <p>
     * ![](focus.png)
     */
    public static void renderFocus(StyleContext context, org.cairographics.Context cr, double x, double y, double width, double height) {
        try {
            gtk_render_focus.invokeExact(context.handle(), cr.handle(), x, y, width, height);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_render_frame = Interop.downcallHandle(
        "gtk_render_frame",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE)
    );
    
    /**
     * Renders a frame around the rectangle defined by @x, @y, {@code width}, {@code height}.
     * <p>
     * Examples of frame rendering, showing the effect of {@code border-image},
     * {@code border-color}, {@code border-width}, {@code border-radius} and junctions:
     * <p>
     * ![](frames.png)
     */
    public static void renderFrame(StyleContext context, org.cairographics.Context cr, double x, double y, double width, double height) {
        try {
            gtk_render_frame.invokeExact(context.handle(), cr.handle(), x, y, width, height);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_render_handle = Interop.downcallHandle(
        "gtk_render_handle",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE)
    );
    
    /**
     * Renders a handle (as in {@code GtkPaned} and {@code GtkWindow}’s resize grip),
     * in the rectangle determined by @x, @y, {@code width}, {@code height}.
     * <p>
     * Handles rendered for the paned and grip classes:
     * <p>
     * ![](handles.png)
     */
    public static void renderHandle(StyleContext context, org.cairographics.Context cr, double x, double y, double width, double height) {
        try {
            gtk_render_handle.invokeExact(context.handle(), cr.handle(), x, y, width, height);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_render_icon = Interop.downcallHandle(
        "gtk_render_icon",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE)
    );
    
    /**
     * Renders the icon in {@code texture} at the specified @x and @y coordinates.
     * <p>
     * This function will render the icon in {@code texture} at exactly its size,
     * regardless of scaling factors, which may not be appropriate when
     * drawing on displays with high pixel densities.
     */
    public static void renderIcon(StyleContext context, org.cairographics.Context cr, org.gtk.gdk.Texture texture, double x, double y) {
        try {
            gtk_render_icon.invokeExact(context.handle(), cr.handle(), texture.handle(), x, y);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_render_layout = Interop.downcallHandle(
        "gtk_render_layout",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS)
    );
    
    /**
     * Renders {@code layout} on the coordinates @x, @y
     */
    public static void renderLayout(StyleContext context, org.cairographics.Context cr, double x, double y, org.pango.Layout layout) {
        try {
            gtk_render_layout.invokeExact(context.handle(), cr.handle(), x, y, layout.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_render_line = Interop.downcallHandle(
        "gtk_render_line",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE)
    );
    
    /**
     * Renders a line from (x0, y0) to (x1, y1).
     */
    public static void renderLine(StyleContext context, org.cairographics.Context cr, double x0, double y0, double x1, double y1) {
        try {
            gtk_render_line.invokeExact(context.handle(), cr.handle(), x0, y0, x1, y1);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_render_option = Interop.downcallHandle(
        "gtk_render_option",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE)
    );
    
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
        try {
            gtk_render_option.invokeExact(context.handle(), cr.handle(), x, y, width, height);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_rgb_to_hsv = Interop.downcallHandle(
        "gtk_rgb_to_hsv",
        FunctionDescriptor.ofVoid(ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Converts a color from RGB space to HSV.
     * <p>
     * Input values must be in the [0.0, 1.0] range;
     * output values will be in the same range.
     */
    public static void rgbToHsv(float r, float g, float b, PointerFloat h, PointerFloat s, PointerFloat v) {
        try {
            gtk_rgb_to_hsv.invokeExact(r, g, b, h.handle(), s.handle(), v.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_set_debug_flags = Interop.downcallHandle(
        "gtk_set_debug_flags",
        FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the GTK debug flags.
     */
    public static void setDebugFlags(DebugFlags flags) {
        try {
            gtk_set_debug_flags.invokeExact(flags.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_show_uri = Interop.downcallHandle(
        "gtk_show_uri",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * This function launches the default application for showing
     * a given uri, or shows an error dialog if that fails.
     */
    public static void showUri(Window parent, java.lang.String uri, int timestamp) {
        try {
            gtk_show_uri.invokeExact(parent.handle(), Interop.allocateNativeString(uri).handle(), timestamp);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_show_uri_full = Interop.downcallHandle(
        "gtk_show_uri_full",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
            gtk_show_uri_full.invokeExact(parent.handle(), Interop.allocateNativeString(uri).handle(), timestamp, cancellable.handle(), 
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gtk.class, "__cbAsyncReadyCallback",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(callback.hashCode(), callback)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_show_uri_full_finish = Interop.downcallHandle(
        "gtk_show_uri_full_finish",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Finishes the gtk_show_uri() call and returns the result
     * of the operation.
     */
    public static boolean showUriFullFinish(Window parent, org.gtk.gio.AsyncResult result) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (int) gtk_show_uri_full_finish.invokeExact(parent.handle(), result.handle(), (Addressable) GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_test_accessible_assertion_message_role = Interop.downcallHandle(
        "gtk_test_accessible_assertion_message_role",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
    public static void testAccessibleAssertionMessageRole(java.lang.String domain, java.lang.String file, int line, java.lang.String func, java.lang.String expr, Accessible accessible, AccessibleRole expectedRole, AccessibleRole actualRole) {
        try {
            gtk_test_accessible_assertion_message_role.invokeExact(Interop.allocateNativeString(domain).handle(), Interop.allocateNativeString(file).handle(), line, Interop.allocateNativeString(func).handle(), Interop.allocateNativeString(expr).handle(), accessible.handle(), expectedRole.getValue(), actualRole.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_test_accessible_has_property = Interop.downcallHandle(
        "gtk_test_accessible_has_property",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Checks whether the {@code GtkAccessible} has {@code property} set.
     */
    public static boolean testAccessibleHasProperty(Accessible accessible, AccessibleProperty property) {
        try {
            var RESULT = (int) gtk_test_accessible_has_property.invokeExact(accessible.handle(), property.getValue());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_test_accessible_has_relation = Interop.downcallHandle(
        "gtk_test_accessible_has_relation",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Checks whether the {@code GtkAccessible} has {@code relation} set.
     */
    public static boolean testAccessibleHasRelation(Accessible accessible, AccessibleRelation relation) {
        try {
            var RESULT = (int) gtk_test_accessible_has_relation.invokeExact(accessible.handle(), relation.getValue());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_test_accessible_has_role = Interop.downcallHandle(
        "gtk_test_accessible_has_role",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Checks whether the {@code GtkAccessible:accessible-role} of the accessible
     * is {@code role}.
     */
    public static boolean testAccessibleHasRole(Accessible accessible, AccessibleRole role) {
        try {
            var RESULT = (int) gtk_test_accessible_has_role.invokeExact(accessible.handle(), role.getValue());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_test_accessible_has_state = Interop.downcallHandle(
        "gtk_test_accessible_has_state",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Checks whether the {@code GtkAccessible} has {@code state} set.
     */
    public static boolean testAccessibleHasState(Accessible accessible, AccessibleState state) {
        try {
            var RESULT = (int) gtk_test_accessible_has_state.invokeExact(accessible.handle(), state.getValue());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_test_list_all_types = Interop.downcallHandle(
        "gtk_test_list_all_types",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Return the type ids that have been registered after
     * calling gtk_test_register_all_types().
     */
    public static PointerLong testListAllTypes(PointerInteger nTypes) {
        try {
            var RESULT = (MemoryAddress) gtk_test_list_all_types.invokeExact(nTypes.handle());
            return new PointerLong(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_test_register_all_types = Interop.downcallHandle(
        "gtk_test_register_all_types",
        FunctionDescriptor.ofVoid()
    );
    
    /**
     * Force registration of all core GTK object types.
     * <p>
     * This allowes to refer to any of those object types via
     * g_type_from_name() after calling this function.
     */
    public static void testRegisterAllTypes() {
        try {
            gtk_test_register_all_types.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_test_widget_wait_for_draw = Interop.downcallHandle(
        "gtk_test_widget_wait_for_draw",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
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
        try {
            gtk_test_widget_wait_for_draw.invokeExact(widget.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_tree_create_row_drag_content = Interop.downcallHandle(
        "gtk_tree_create_row_drag_content",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Creates a content provider for dragging {@code path} from {@code tree_model}.
     */
    public static org.gtk.gdk.ContentProvider treeCreateRowDragContent(TreeModel treeModel, TreePath path) {
        try {
            var RESULT = (MemoryAddress) gtk_tree_create_row_drag_content.invokeExact(treeModel.handle(), path.handle());
            return new org.gtk.gdk.ContentProvider(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_tree_get_row_drag_data = Interop.downcallHandle(
        "gtk_tree_get_row_drag_data",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Obtains a {@code tree_model} and {@code path} from value of target type
     * {@code GTK_TYPE_TREE_ROW_DATA}.
     * <p>
     * The returned path must be freed with gtk_tree_path_free().
     */
    public static boolean treeGetRowDragData(org.gtk.gobject.Value value, PointerProxy<TreeModel> treeModel, PointerProxy<TreePath> path) {
        try {
            var RESULT = (int) gtk_tree_get_row_drag_data.invokeExact(value.handle(), treeModel.handle(), path.handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_tree_row_reference_deleted = Interop.downcallHandle(
        "gtk_tree_row_reference_deleted",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Lets a set of row reference created by
     * gtk_tree_row_reference_new_proxy() know that the
     * model emitted the ::row-deleted signal.
     */
    public static void treeRowReferenceDeleted(org.gtk.gobject.Object proxy, TreePath path) {
        try {
            gtk_tree_row_reference_deleted.invokeExact(proxy.handle(), path.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_tree_row_reference_inserted = Interop.downcallHandle(
        "gtk_tree_row_reference_inserted",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Lets a set of row reference created by
     * gtk_tree_row_reference_new_proxy() know that the
     * model emitted the ::row-inserted signal.
     */
    public static void treeRowReferenceInserted(org.gtk.gobject.Object proxy, TreePath path) {
        try {
            gtk_tree_row_reference_inserted.invokeExact(proxy.handle(), path.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_tree_row_reference_reordered = Interop.downcallHandle(
        "gtk_tree_row_reference_reordered",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Lets a set of row reference created by
     * gtk_tree_row_reference_new_proxy() know that the
     * model emitted the ::rows-reordered signal.
     */
    public static void treeRowReferenceReordered(org.gtk.gobject.Object proxy, TreePath path, TreeIter iter, int[] newOrder) {
        try {
            gtk_tree_row_reference_reordered.invokeExact(proxy.handle(), path.handle(), iter.handle(), Interop.allocateNativeArray(newOrder).handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_value_dup_expression = Interop.downcallHandle(
        "gtk_value_dup_expression",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the {@code GtkExpression} stored inside the given {@code value}, and acquires
     * a reference to it.
     */
    public static Expression valueDupExpression(org.gtk.gobject.Value value) {
        try {
            var RESULT = (MemoryAddress) gtk_value_dup_expression.invokeExact(value.handle());
            return new Expression(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_value_get_expression = Interop.downcallHandle(
        "gtk_value_get_expression",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the {@code GtkExpression} stored inside the given {@code value}.
     */
    public static Expression valueGetExpression(org.gtk.gobject.Value value) {
        try {
            var RESULT = (MemoryAddress) gtk_value_get_expression.invokeExact(value.handle());
            return new Expression(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_value_set_expression = Interop.downcallHandle(
        "gtk_value_set_expression",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Stores the given {@code GtkExpression} inside {@code value}.
     * <p>
     * The {@code GValue} will acquire a reference to the {@code expression}.
     */
    public static void valueSetExpression(org.gtk.gobject.Value value, Expression expression) {
        try {
            gtk_value_set_expression.invokeExact(value.handle(), expression.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_value_take_expression = Interop.downcallHandle(
        "gtk_value_take_expression",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Stores the given {@code GtkExpression} inside {@code value}.
     * <p>
     * This function transfers the ownership of the {@code expression} to the {@code GValue}.
     */
    public static void valueTakeExpression(org.gtk.gobject.Value value, Expression expression) {
        try {
            gtk_value_take_expression.invokeExact(value.handle(), expression.refcounted().unowned().handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    public static int __cbAssistantPageFunc(int currentPage, MemoryAddress data) {
        int hash = data.get(ValueLayout.JAVA_INT, 0);
        var handler = (AssistantPageFunc) Interop.signalRegistry.get(hash);
        return handler.onAssistantPageFunc(currentPage);
    }
    
    public static boolean __cbEntryCompletionMatchFunc(MemoryAddress completion, MemoryAddress key, MemoryAddress iter, MemoryAddress userData) {
        int hash = userData.get(ValueLayout.JAVA_INT, 0);
        var handler = (EntryCompletionMatchFunc) Interop.signalRegistry.get(hash);
        return handler.onEntryCompletionMatchFunc(new EntryCompletion(Refcounted.get(completion, false)), key.getUtf8String(0), new TreeIter(Refcounted.get(iter, false)));
    }
    
    public static void __cbMenuButtonCreatePopupFunc(MemoryAddress menuButton, MemoryAddress userData) {
        int hash = userData.get(ValueLayout.JAVA_INT, 0);
        var handler = (MenuButtonCreatePopupFunc) Interop.signalRegistry.get(hash);
        handler.onMenuButtonCreatePopupFunc(new MenuButton(Refcounted.get(menuButton, false)));
    }
    
    public static void __cbExpressionNotify(MemoryAddress userData) {
        int hash = userData.get(ValueLayout.JAVA_INT, 0);
        var handler = (ExpressionNotify) Interop.signalRegistry.get(hash);
        handler.onExpressionNotify();
    }
    
    public static Widget __cbFlowBoxCreateWidgetFunc(MemoryAddress item, MemoryAddress userData) {
        int hash = userData.get(ValueLayout.JAVA_INT, 0);
        var handler = (FlowBoxCreateWidgetFunc) Interop.signalRegistry.get(hash);
        return handler.onFlowBoxCreateWidgetFunc(new org.gtk.gobject.Object(Refcounted.get(item, false)));
    }
    
    public static void __cbFlowBoxForeachFunc(MemoryAddress box, MemoryAddress child, MemoryAddress userData) {
        int hash = userData.get(ValueLayout.JAVA_INT, 0);
        var handler = (FlowBoxForeachFunc) Interop.signalRegistry.get(hash);
        handler.onFlowBoxForeachFunc(new FlowBox(Refcounted.get(box, false)), new FlowBoxChild(Refcounted.get(child, false)));
    }
    
    public static java.lang.String __cbScaleFormatValueFunc(MemoryAddress scale, double value, MemoryAddress userData) {
        int hash = userData.get(ValueLayout.JAVA_INT, 0);
        var handler = (ScaleFormatValueFunc) Interop.signalRegistry.get(hash);
        return handler.onScaleFormatValueFunc(new Scale(Refcounted.get(scale, false)), value);
    }
    
    public static boolean __cbCellCallback(MemoryAddress renderer, MemoryAddress data) {
        int hash = data.get(ValueLayout.JAVA_INT, 0);
        var handler = (CellCallback) Interop.signalRegistry.get(hash);
        return handler.onCellCallback(new CellRenderer(Refcounted.get(renderer, false)));
    }
    
    public static boolean __cbListBoxFilterFunc(MemoryAddress row, MemoryAddress userData) {
        int hash = userData.get(ValueLayout.JAVA_INT, 0);
        var handler = (ListBoxFilterFunc) Interop.signalRegistry.get(hash);
        return handler.onListBoxFilterFunc(new ListBoxRow(Refcounted.get(row, false)));
    }
    
    public static int __cbListBoxSortFunc(MemoryAddress row1, MemoryAddress row2, MemoryAddress userData) {
        int hash = userData.get(ValueLayout.JAVA_INT, 0);
        var handler = (ListBoxSortFunc) Interop.signalRegistry.get(hash);
        return handler.onListBoxSortFunc(new ListBoxRow(Refcounted.get(row1, false)), new ListBoxRow(Refcounted.get(row2, false)));
    }
    
    public static void __cbCellLayoutDataFunc(MemoryAddress cellLayout, MemoryAddress cell, MemoryAddress treeModel, MemoryAddress iter, MemoryAddress data) {
        int hash = data.get(ValueLayout.JAVA_INT, 0);
        var handler = (CellLayoutDataFunc) Interop.signalRegistry.get(hash);
        handler.onCellLayoutDataFunc(new CellLayout.CellLayoutImpl(Refcounted.get(cellLayout, false)), new CellRenderer(Refcounted.get(cell, false)), new TreeModel.TreeModelImpl(Refcounted.get(treeModel, false)), new TreeIter(Refcounted.get(iter, false)));
    }
    
    public static void __cbListBoxForeachFunc(MemoryAddress box, MemoryAddress row, MemoryAddress userData) {
        int hash = userData.get(ValueLayout.JAVA_INT, 0);
        var handler = (ListBoxForeachFunc) Interop.signalRegistry.get(hash);
        handler.onListBoxForeachFunc(new ListBox(Refcounted.get(box, false)), new ListBoxRow(Refcounted.get(row, false)));
    }
    
    public static Widget __cbListBoxCreateWidgetFunc(MemoryAddress item, MemoryAddress userData) {
        int hash = userData.get(ValueLayout.JAVA_INT, 0);
        var handler = (ListBoxCreateWidgetFunc) Interop.signalRegistry.get(hash);
        return handler.onListBoxCreateWidgetFunc(new org.gtk.gobject.Object(Refcounted.get(item, false)));
    }
    
    public static void __cbTreeViewMappingFunc(MemoryAddress treeView, MemoryAddress path, MemoryAddress userData) {
        int hash = userData.get(ValueLayout.JAVA_INT, 0);
        var handler = (TreeViewMappingFunc) Interop.signalRegistry.get(hash);
        handler.onTreeViewMappingFunc(new TreeView(Refcounted.get(treeView, false)), new TreePath(Refcounted.get(path, false)));
    }
    
    public static boolean __cbTreeViewColumnDropFunc(MemoryAddress treeView, MemoryAddress column, MemoryAddress prevColumn, MemoryAddress nextColumn, MemoryAddress data) {
        int hash = data.get(ValueLayout.JAVA_INT, 0);
        var handler = (TreeViewColumnDropFunc) Interop.signalRegistry.get(hash);
        return handler.onTreeViewColumnDropFunc(new TreeView(Refcounted.get(treeView, false)), new TreeViewColumn(Refcounted.get(column, false)), new TreeViewColumn(Refcounted.get(prevColumn, false)), new TreeViewColumn(Refcounted.get(nextColumn, false)));
    }
    
    public static void __cbTreeSelectionForeachFunc(MemoryAddress model, MemoryAddress path, MemoryAddress iter, MemoryAddress data) {
        int hash = data.get(ValueLayout.JAVA_INT, 0);
        var handler = (TreeSelectionForeachFunc) Interop.signalRegistry.get(hash);
        handler.onTreeSelectionForeachFunc(new TreeModel.TreeModelImpl(Refcounted.get(model, false)), new TreePath(Refcounted.get(path, false)), new TreeIter(Refcounted.get(iter, false)));
    }
    
    public static int __cbFlowBoxSortFunc(MemoryAddress child1, MemoryAddress child2, MemoryAddress userData) {
        int hash = userData.get(ValueLayout.JAVA_INT, 0);
        var handler = (FlowBoxSortFunc) Interop.signalRegistry.get(hash);
        return handler.onFlowBoxSortFunc(new FlowBoxChild(Refcounted.get(child1, false)), new FlowBoxChild(Refcounted.get(child2, false)));
    }
    
    public static boolean __cbFontFilterFunc(MemoryAddress family, MemoryAddress face, MemoryAddress data) {
        int hash = data.get(ValueLayout.JAVA_INT, 0);
        var handler = (FontFilterFunc) Interop.signalRegistry.get(hash);
        return handler.onFontFilterFunc(new org.pango.FontFamily(Refcounted.get(family, false)), new org.pango.FontFace(Refcounted.get(face, false)));
    }
    
    public static boolean __cbTreeModelForeachFunc(MemoryAddress model, MemoryAddress path, MemoryAddress iter, MemoryAddress data) {
        int hash = data.get(ValueLayout.JAVA_INT, 0);
        var handler = (TreeModelForeachFunc) Interop.signalRegistry.get(hash);
        return handler.onTreeModelForeachFunc(new TreeModel.TreeModelImpl(Refcounted.get(model, false)), new TreePath(Refcounted.get(path, false)), new TreeIter(Refcounted.get(iter, false)));
    }
    
    public static void __cbTextTagTableForeach(MemoryAddress tag, MemoryAddress data) {
        int hash = data.get(ValueLayout.JAVA_INT, 0);
        var handler = (TextTagTableForeach) Interop.signalRegistry.get(hash);
        handler.onTextTagTableForeach(new TextTag(Refcounted.get(tag, false)));
    }
    
    public static void __cbPrintSettingsFunc(MemoryAddress key, MemoryAddress value, MemoryAddress userData) {
        int hash = userData.get(ValueLayout.JAVA_INT, 0);
        var handler = (PrintSettingsFunc) Interop.signalRegistry.get(hash);
        handler.onPrintSettingsFunc(key.getUtf8String(0), value.getUtf8String(0));
    }
    
    public static void __cbTreeModelFilterModifyFunc(MemoryAddress model, MemoryAddress iter, MemoryAddress value, int column, MemoryAddress data) {
        int hash = data.get(ValueLayout.JAVA_INT, 0);
        var handler = (TreeModelFilterModifyFunc) Interop.signalRegistry.get(hash);
        handler.onTreeModelFilterModifyFunc(new TreeModel.TreeModelImpl(Refcounted.get(model, false)), new TreeIter(Refcounted.get(iter, false)), new org.gtk.gobject.Value(Refcounted.get(value, false)), column);
    }
    
    public static boolean __cbTreeViewSearchEqualFunc(MemoryAddress model, int column, MemoryAddress key, MemoryAddress iter, MemoryAddress searchData) {
        int hash = searchData.get(ValueLayout.JAVA_INT, 0);
        var handler = (TreeViewSearchEqualFunc) Interop.signalRegistry.get(hash);
        return handler.onTreeViewSearchEqualFunc(new TreeModel.TreeModelImpl(Refcounted.get(model, false)), column, key.getUtf8String(0), new TreeIter(Refcounted.get(iter, false)));
    }
    
    public static void __cbTreeCellDataFunc(MemoryAddress treeColumn, MemoryAddress cell, MemoryAddress treeModel, MemoryAddress iter, MemoryAddress data) {
        int hash = data.get(ValueLayout.JAVA_INT, 0);
        var handler = (TreeCellDataFunc) Interop.signalRegistry.get(hash);
        handler.onTreeCellDataFunc(new TreeViewColumn(Refcounted.get(treeColumn, false)), new CellRenderer(Refcounted.get(cell, false)), new TreeModel.TreeModelImpl(Refcounted.get(treeModel, false)), new TreeIter(Refcounted.get(iter, false)));
    }
    
    public static boolean __cbTreeModelFilterVisibleFunc(MemoryAddress model, MemoryAddress iter, MemoryAddress data) {
        int hash = data.get(ValueLayout.JAVA_INT, 0);
        var handler = (TreeModelFilterVisibleFunc) Interop.signalRegistry.get(hash);
        return handler.onTreeModelFilterVisibleFunc(new TreeModel.TreeModelImpl(Refcounted.get(model, false)), new TreeIter(Refcounted.get(iter, false)));
    }
    
    public static boolean __cbTextCharPredicate(int ch, MemoryAddress userData) {
        int hash = userData.get(ValueLayout.JAVA_INT, 0);
        var handler = (TextCharPredicate) Interop.signalRegistry.get(hash);
        return handler.onTextCharPredicate(ch);
    }
    
    public static void __cbPageSetupDoneFunc(MemoryAddress pageSetup, MemoryAddress data) {
        int hash = data.get(ValueLayout.JAVA_INT, 0);
        var handler = (PageSetupDoneFunc) Interop.signalRegistry.get(hash);
        handler.onPageSetupDoneFunc(new PageSetup(Refcounted.get(pageSetup, false)));
    }
    
    public static void __cbIconViewForeachFunc(MemoryAddress iconView, MemoryAddress path, MemoryAddress data) {
        int hash = data.get(ValueLayout.JAVA_INT, 0);
        var handler = (IconViewForeachFunc) Interop.signalRegistry.get(hash);
        handler.onIconViewForeachFunc(new IconView(Refcounted.get(iconView, false)), new TreePath(Refcounted.get(path, false)));
    }
    
    public static org.gtk.gobject.Object __cbMapListModelMapFunc(MemoryAddress item, MemoryAddress userData) {
        int hash = userData.get(ValueLayout.JAVA_INT, 0);
        var handler = (MapListModelMapFunc) Interop.signalRegistry.get(hash);
        return handler.onMapListModelMapFunc(new org.gtk.gobject.Object(Refcounted.get(item, true)));
    }
    
    public static boolean __cbFlowBoxFilterFunc(MemoryAddress child, MemoryAddress userData) {
        int hash = userData.get(ValueLayout.JAVA_INT, 0);
        var handler = (FlowBoxFilterFunc) Interop.signalRegistry.get(hash);
        return handler.onFlowBoxFilterFunc(new FlowBoxChild(Refcounted.get(child, false)));
    }
    
    public static boolean __cbCustomFilterFunc(MemoryAddress item, MemoryAddress userData) {
        int hash = userData.get(ValueLayout.JAVA_INT, 0);
        var handler = (CustomFilterFunc) Interop.signalRegistry.get(hash);
        return handler.onCustomFilterFunc(new org.gtk.gobject.Object(Refcounted.get(item, false)));
    }
    
    public static void __cbPrintJobCompleteFunc(MemoryAddress printJob, MemoryAddress userData, MemoryAddress error) {
        int hash = userData.get(ValueLayout.JAVA_INT, 0);
        var handler = (PrintJobCompleteFunc) Interop.signalRegistry.get(hash);
        handler.onPrintJobCompleteFunc(new PrintJob(Refcounted.get(printJob, false)), new org.gtk.glib.Error(Refcounted.get(error, false)));
    }
    
    public static org.gtk.gio.ListModel __cbTreeListModelCreateModelFunc(MemoryAddress item, MemoryAddress userData) {
        int hash = userData.get(ValueLayout.JAVA_INT, 0);
        var handler = (TreeListModelCreateModelFunc) Interop.signalRegistry.get(hash);
        return handler.onTreeListModelCreateModelFunc(new org.gtk.gobject.Object(Refcounted.get(item, false)));
    }
    
    public static boolean __cbTreeSelectionFunc(MemoryAddress selection, MemoryAddress model, MemoryAddress path, int pathCurrentlySelected, MemoryAddress data) {
        int hash = data.get(ValueLayout.JAVA_INT, 0);
        var handler = (TreeSelectionFunc) Interop.signalRegistry.get(hash);
        return handler.onTreeSelectionFunc(new TreeSelection(Refcounted.get(selection, false)), new TreeModel.TreeModelImpl(Refcounted.get(model, false)), new TreePath(Refcounted.get(path, false)), pathCurrentlySelected != 0);
    }
    
    public static void __cbDrawingAreaDrawFunc(MemoryAddress drawingArea, MemoryAddress cr, int width, int height, MemoryAddress userData) {
        int hash = userData.get(ValueLayout.JAVA_INT, 0);
        var handler = (DrawingAreaDrawFunc) Interop.signalRegistry.get(hash);
        handler.onDrawingAreaDrawFunc(new DrawingArea(Refcounted.get(drawingArea, false)), new org.cairographics.Context(Refcounted.get(cr, false)), width, height);
    }
    
    public static boolean __cbShortcutFunc(MemoryAddress widget, MemoryAddress args, MemoryAddress userData) {
        int hash = userData.get(ValueLayout.JAVA_INT, 0);
        var handler = (ShortcutFunc) Interop.signalRegistry.get(hash);
        return handler.onShortcutFunc(new Widget(Refcounted.get(widget, false)), new org.gtk.glib.Variant(Refcounted.get(args, false)));
    }
    
    public static void __cbListBoxUpdateHeaderFunc(MemoryAddress row, MemoryAddress before, MemoryAddress userData) {
        int hash = userData.get(ValueLayout.JAVA_INT, 0);
        var handler = (ListBoxUpdateHeaderFunc) Interop.signalRegistry.get(hash);
        handler.onListBoxUpdateHeaderFunc(new ListBoxRow(Refcounted.get(row, false)), new ListBoxRow(Refcounted.get(before, false)));
    }
    
    public static int __cbTreeIterCompareFunc(MemoryAddress model, MemoryAddress a, MemoryAddress b, MemoryAddress userData) {
        int hash = userData.get(ValueLayout.JAVA_INT, 0);
        var handler = (TreeIterCompareFunc) Interop.signalRegistry.get(hash);
        return handler.onTreeIterCompareFunc(new TreeModel.TreeModelImpl(Refcounted.get(model, false)), new TreeIter(Refcounted.get(a, false)), new TreeIter(Refcounted.get(b, false)));
    }
    
    public static boolean __cbCellAllocCallback(MemoryAddress renderer, MemoryAddress cellArea, MemoryAddress cellBackground, MemoryAddress data) {
        int hash = data.get(ValueLayout.JAVA_INT, 0);
        var handler = (CellAllocCallback) Interop.signalRegistry.get(hash);
        return handler.onCellAllocCallback(new CellRenderer(Refcounted.get(renderer, false)), new org.gtk.gdk.Rectangle(Refcounted.get(cellArea, false)), new org.gtk.gdk.Rectangle(Refcounted.get(cellBackground, false)));
    }
    
    public static boolean __cbTickCallback(MemoryAddress widget, MemoryAddress frameClock, MemoryAddress userData) {
        int hash = userData.get(ValueLayout.JAVA_INT, 0);
        var handler = (TickCallback) Interop.signalRegistry.get(hash);
        return handler.onTickCallback(new Widget(Refcounted.get(widget, false)), new org.gtk.gdk.FrameClock(Refcounted.get(frameClock, false)));
    }
    
    public static boolean __cbPrinterFunc(MemoryAddress printer, MemoryAddress data) {
        int hash = data.get(ValueLayout.JAVA_INT, 0);
        var handler = (PrinterFunc) Interop.signalRegistry.get(hash);
        return handler.onPrinterFunc(new Printer(Refcounted.get(printer, false)));
    }
    
    public static boolean __cbTreeViewRowSeparatorFunc(MemoryAddress model, MemoryAddress iter, MemoryAddress data) {
        int hash = data.get(ValueLayout.JAVA_INT, 0);
        var handler = (TreeViewRowSeparatorFunc) Interop.signalRegistry.get(hash);
        return handler.onTreeViewRowSeparatorFunc(new TreeModel.TreeModelImpl(Refcounted.get(model, false)), new TreeIter(Refcounted.get(iter, false)));
    }
    
}
