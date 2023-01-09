package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Constants and functions that are declared in the global Gtk namespace.
 */
public final class Gtk {
    
    static {
        LibLoad.loadLibrary("gtk-4");
        registerTypes();
    }
    
    @ApiStatus.Internal public static void javagi$ensureInitialized() {}
    
/**
 * An undefined value. The accessible attribute is either unset, or its
 * value is undefined.
 */
public static final int ACCESSIBLE_VALUE_UNDEFINED = -1;
    
/**
 * Like {@link Gtk#getBinaryAge}, but from the headers used at
 * application compile time, rather than from the library linked
 * against at application run time.
 */
public static final int BINARY_AGE = 802;
    
public static final java.lang.String IM_MODULE_EXTENSION_POINT_NAME = "gtk-im-module";
    
/**
 * Constant to return from a signal handler for the ::input
 * signal in case of conversion failure.
 * <p>
 * See {@code Gtk.SpinButton::input}.
 */
public static final int INPUT_ERROR = -1;
    
/**
 * Like {@link Gtk#getInterfaceAge}, but from the headers used at
 * application compile time, rather than from the library linked
 * against at application run time.
 */
public static final int INTERFACE_AGE = 2;
    
/**
 * The value used to refer to a guaranteed invalid position
 * in a {@code GListModel}.
 * <p>
 * This value may be returned from some functions, others may
 * accept it as input. Its interpretation may differ for different
 * functions.
 * <p>
 * Refer to each function's documentation for if this value is
 * allowed and what it does.
 */
public static final int INVALID_LIST_POSITION = -1;
    
/**
 * The name used for the stock full offset included by {@code GtkLevelBar}.
 */
public static final java.lang.String LEVEL_BAR_OFFSET_FULL = "full";
    
/**
 * The name used for the stock high offset included by {@code GtkLevelBar}.
 */
public static final java.lang.String LEVEL_BAR_OFFSET_HIGH = "high";
    
/**
 * The name used for the stock low offset included by {@code GtkLevelBar}.
 */
public static final java.lang.String LEVEL_BAR_OFFSET_LOW = "low";
    
/**
 * Like {@link Gtk#getMajorVersion}, but from the headers used at
 * application compile time, rather than from the library linked
 * against at application run time.
 */
public static final int MAJOR_VERSION = 4;
    
public static final int MAX_COMPOSE_LEN = 7;
    
public static final java.lang.String MEDIA_FILE_EXTENSION_POINT_NAME = "gtk-media-file";
    
/**
 * Like {@link Gtk#getMicroVersion}, but from the headers used at
 * application compile time, rather than from the library linked
 * against at application run time.
 */
public static final int MICRO_VERSION = 2;
    
/**
 * Like {@link Gtk#getMinorVersion}, but from the headers used at
 * application compile time, rather than from the library linked
 * against at application run time.
 */
public static final int MINOR_VERSION = 8;
    
/**
 * Name for the A3 paper size.
 */
public static final java.lang.String PAPER_NAME_A3 = "iso_a3";
    
/**
 * Name for the A4 paper size.
 */
public static final java.lang.String PAPER_NAME_A4 = "iso_a4";
    
/**
 * Name for the A5 paper size.
 */
public static final java.lang.String PAPER_NAME_A5 = "iso_a5";
    
/**
 * Name for the B5 paper size.
 */
public static final java.lang.String PAPER_NAME_B5 = "iso_b5";
    
/**
 * Name for the Executive paper size.
 */
public static final java.lang.String PAPER_NAME_EXECUTIVE = "na_executive";
    
/**
 * Name for the Legal paper size.
 */
public static final java.lang.String PAPER_NAME_LEGAL = "na_legal";
    
/**
 * Name for the Letter paper size.
 */
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
    
/**
 * The key used by the “Print to file” printer to store the file
 * name of the output without the path to the directory and the
 * file extension.
 */
public static final java.lang.String PRINT_SETTINGS_OUTPUT_BASENAME = "output-basename";
    
public static final java.lang.String PRINT_SETTINGS_OUTPUT_BIN = "output-bin";
    
/**
 * The key used by the “Print to file” printer to store the
 * directory to which the output should be written.
 */
public static final java.lang.String PRINT_SETTINGS_OUTPUT_DIR = "output-dir";
    
/**
 * The key used by the “Print to file” printer to store the format
 * of the output. The supported values are “PS” and “PDF”.
 */
public static final java.lang.String PRINT_SETTINGS_OUTPUT_FILE_FORMAT = "output-file-format";
    
/**
 * The key used by the “Print to file” printer to store the URI
 * to which the output should be written. GTK itself supports
 * only “file://” URIs.
 */
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
    
/**
 * Use this priority for functionality related to size allocation.
 * <p>
 * It is used internally by GTK+ to compute the sizes of widgets.
 * This priority is higher than {@code GDK_PRIORITY_REDRAW} to avoid
 * resizing a widget which was just redrawn.
 */
public static final int PRIORITY_RESIZE = 110;
    
/**
 * A priority that can be used when adding a {@code GtkStyleProvider}
 * for application-specific style information.
 */
public static final int STYLE_PROVIDER_PRIORITY_APPLICATION = 600;
    
/**
 * The priority used for default style information
 * that is used in the absence of themes.
 * <p>
 * Note that this is not very useful for providing default
 * styling for custom style classes - themes are likely to
 * override styling provided at this priority with
 * catch-all {@code * {...}} rules.
 */
public static final int STYLE_PROVIDER_PRIORITY_FALLBACK = 1;
    
/**
 * The priority used for style information provided
 * via {@code GtkSettings}.
 * <p>
 * This priority is higher than {@code GTK_STYLE_PROVIDER_PRIORITY_THEME}
 * to let settings override themes.
 */
public static final int STYLE_PROVIDER_PRIORITY_SETTINGS = 400;
    
/**
 * The priority used for style information provided
 * by themes.
 */
public static final int STYLE_PROVIDER_PRIORITY_THEME = 200;
    
/**
 * The priority used for the style information from
 * {@code $XDG_CONFIG_HOME/gtk-4.0/gtk.css}.
 * <p>
 * You should not use priorities higher than this, to
 * give the user the last word.
 */
public static final int STYLE_PROVIDER_PRIORITY_USER = 800;
    
/**
 * The priority at which the text view validates onscreen lines
 * in an idle job in the background.
 */
public static final int TEXT_VIEW_PRIORITY_VALIDATE = 125;
    
/**
 * Uses the default sort function in a {@code Gtk.TreeSortable}.
 * <p>
 * See also: {@link TreeSortable#setSortColumnId}
 */
public static final int TREE_SORTABLE_DEFAULT_SORT_COLUMN_ID = -1;
    
/**
 * Disables sorting in a {@code Gtk.TreeSortable}.
 * <p>
 * See also: {@link TreeSortable#setSortColumnId}
 */
public static final int TREE_SORTABLE_UNSORTED_SORT_COLUMN_ID = -2;

/**
 * Gets the modifier mask.
 * <p>
 * The modifier mask determines which modifiers are considered significant
 * for keyboard accelerators. This includes all keyboard modifiers except
 * for {@link org.gtk.gdk.ModifierType#LOCK_MASK}.
 * @return the modifier mask for accelerators
 */
public static org.gtk.gdk.ModifierType acceleratorGetDefaultModMask() {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.gtk_accelerator_get_default_mod_mask.invokeExact();
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return new org.gtk.gdk.ModifierType(RESULT);
}

/**
 * Converts an accelerator keyval and modifier mask into a string
 * which can be used to represent the accelerator to the user.
 * @param acceleratorKey accelerator keyval
 * @param acceleratorMods accelerator modifier mask
 * @return a newly-allocated string representing the accelerator
 */
public static java.lang.String acceleratorGetLabel(int acceleratorKey, org.gtk.gdk.ModifierType acceleratorMods) {
    MemoryAddress RESULT;
    try {
        RESULT = (MemoryAddress) DowncallHandles.gtk_accelerator_get_label.invokeExact(
                acceleratorKey,
                acceleratorMods.getValue());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return Marshal.addressToString.marshal(RESULT, null);
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
 * @param display a {@code GdkDisplay} or {@code null} to use the default display
 * @param acceleratorKey accelerator keyval
 * @param keycode accelerator keycode
 * @param acceleratorMods accelerator modifier mask
 * @return a newly-allocated string representing the accelerator
 */
public static java.lang.String acceleratorGetLabelWithKeycode(@Nullable org.gtk.gdk.Display display, int acceleratorKey, int keycode, org.gtk.gdk.ModifierType acceleratorMods) {
    MemoryAddress RESULT;
    try {
        RESULT = (MemoryAddress) DowncallHandles.gtk_accelerator_get_label_with_keycode.invokeExact(
                (Addressable) (display == null ? MemoryAddress.NULL : display.handle()),
                acceleratorKey,
                keycode,
                acceleratorMods.getValue());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return Marshal.addressToString.marshal(RESULT, null);
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
 * @param acceleratorKey accelerator keyval
 * @param acceleratorMods accelerator modifier mask
 * @return a newly-allocated accelerator name
 */
public static java.lang.String acceleratorName(int acceleratorKey, org.gtk.gdk.ModifierType acceleratorMods) {
    MemoryAddress RESULT;
    try {
        RESULT = (MemoryAddress) DowncallHandles.gtk_accelerator_name.invokeExact(
                acceleratorKey,
                acceleratorMods.getValue());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return Marshal.addressToString.marshal(RESULT, null);
}

/**
 * Converts an accelerator keyval and modifier mask
 * into a string parseable by gtk_accelerator_parse_with_keycode().
 * <p>
 * This is similar to {@link Gtk#acceleratorName} but handling keycodes.
 * This is only useful for system-level components, applications
 * should use {@link Gtk#acceleratorName} instead.
 * @param display a {@code GdkDisplay} or {@code null} to use the default display
 * @param acceleratorKey accelerator keyval
 * @param keycode accelerator keycode
 * @param acceleratorMods accelerator modifier mask
 * @return a newly allocated accelerator name.
 */
public static java.lang.String acceleratorNameWithKeycode(@Nullable org.gtk.gdk.Display display, int acceleratorKey, int keycode, org.gtk.gdk.ModifierType acceleratorMods) {
    MemoryAddress RESULT;
    try {
        RESULT = (MemoryAddress) DowncallHandles.gtk_accelerator_name_with_keycode.invokeExact(
                (Addressable) (display == null ? MemoryAddress.NULL : display.handle()),
                acceleratorKey,
                keycode,
                acceleratorMods.getValue());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return Marshal.addressToString.marshal(RESULT, null);
}

/**
 * Parses a string representing an accelerator.
 * <p>
 * The format looks like “{@code <Control>a}” or “{@code <Shift><Alt>F1}”.
 * <p>
 * The parser is fairly liberal and allows lower or upper case, and also
 * abbreviations such as “{@code <Ctl>}” and “{@code <Ctrl>}”.
 * <p>
 * Key names are parsed using {@link org.gtk.gdk.Gdk#keyvalFromName}. For character keys
 * the name is not the symbol, but the lowercase name, e.g. one would use
 * “{@code <Ctrl>minus}” instead of “{@code <Ctrl>-}”.
 * <p>
 * Modifiers are enclosed in angular brackets {@code <>}, and match the
 * {@code Gdk.ModifierType} mask:
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
 * @param accelerator string representing an accelerator
 * @param acceleratorKey return location for accelerator keyval
 * @param acceleratorMods return location for accelerator
 *   modifier mask
 */
public static boolean acceleratorParse(java.lang.String accelerator, Out<Integer> acceleratorKey, @Nullable Out<org.gtk.gdk.ModifierType> acceleratorMods) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemorySegment acceleratorKeyPOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
        MemorySegment acceleratorModsPOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_accelerator_parse.invokeExact(
                    Marshal.stringToAddress.marshal(accelerator, SCOPE),
                    (Addressable) (acceleratorKey == null ? MemoryAddress.NULL : (Addressable) acceleratorKeyPOINTER.address()),
                    (Addressable) (acceleratorMods == null ? MemoryAddress.NULL : (Addressable) acceleratorModsPOINTER.address()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
                if (acceleratorKey != null) acceleratorKey.set(acceleratorKeyPOINTER.get(Interop.valueLayout.C_INT, 0));
                if (acceleratorMods != null) acceleratorMods.set(new org.gtk.gdk.ModifierType(acceleratorModsPOINTER.get(Interop.valueLayout.C_INT, 0)));
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
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
 * @param accelerator string representing an accelerator
 * @param display the {@code GdkDisplay} to look up {@code accelerator_codes} in
 * @param acceleratorKey return location for accelerator keyval
 * @param acceleratorCodes return location for accelerator keycodes
 * @param acceleratorMods return location for accelerator
 *   modifier mask
 * @return {@code true} if parsing succeeded
 */
public static boolean acceleratorParseWithKeycode(java.lang.String accelerator, @Nullable org.gtk.gdk.Display display, Out<Integer> acceleratorKey, int[] acceleratorCodes, @Nullable Out<org.gtk.gdk.ModifierType> acceleratorMods) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemorySegment acceleratorKeyPOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
        MemorySegment acceleratorModsPOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_accelerator_parse_with_keycode.invokeExact(
                    Marshal.stringToAddress.marshal(accelerator, SCOPE),
                    (Addressable) (display == null ? MemoryAddress.NULL : display.handle()),
                    (Addressable) (acceleratorKey == null ? MemoryAddress.NULL : (Addressable) acceleratorKeyPOINTER.address()),
                    (Addressable) (acceleratorCodes == null ? MemoryAddress.NULL : Interop.allocateNativeArray(acceleratorCodes, false, SCOPE)),
                    (Addressable) (acceleratorMods == null ? MemoryAddress.NULL : (Addressable) acceleratorModsPOINTER.address()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
                if (acceleratorKey != null) acceleratorKey.set(acceleratorKeyPOINTER.get(Interop.valueLayout.C_INT, 0));
                if (acceleratorMods != null) acceleratorMods.set(new org.gtk.gdk.ModifierType(acceleratorModsPOINTER.get(Interop.valueLayout.C_INT, 0)));
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
}

/**
 * Determines whether a given keyval and modifier mask constitute
 * a valid keyboard accelerator.
 * <p>
 * For example, the {@code GDK_KEY_a} keyval plus {@link org.gtk.gdk.ModifierType#CONTROL_MASK} mark is valid,
 * and matches the “Ctrl+a” accelerator. But, you can't, for instance, use
 * the {@code GDK_KEY_Control_L} keyval as an accelerator.
 * @param keyval a GDK keyval
 * @param modifiers modifier mask
 * @return {@code true} if the accelerator is valid
 */
public static boolean acceleratorValid(int keyval, org.gtk.gdk.ModifierType modifiers) {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.gtk_accelerator_valid.invokeExact(
                keyval,
                modifiers.getValue());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
}

public static void accessiblePropertyInitValue(org.gtk.gtk.AccessibleProperty property, org.gtk.gobject.Value value) {
    try {
        DowncallHandles.gtk_accessible_property_init_value.invokeExact(
                property.getValue(),
                value.handle());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
}

public static void accessibleRelationInitValue(org.gtk.gtk.AccessibleRelation relation, org.gtk.gobject.Value value) {
    try {
        DowncallHandles.gtk_accessible_relation_init_value.invokeExact(
                relation.getValue(),
                value.handle());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
}

public static void accessibleStateInitValue(org.gtk.gtk.AccessibleState state, org.gtk.gobject.Value value) {
    try {
        DowncallHandles.gtk_accessible_state_init_value.invokeExact(
                state.getValue(),
                value.handle());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
}

/**
 * Initializes {@code iter} to point to {@code target}.
 * <p>
 * If {@code target} is not found, finds the next value after it.
 * If no value &gt;= {@code target} exists in {@code set}, this function returns {@code false}.
 * @param iter a pointer to an uninitialized {@code GtkBitsetIter}
 * @param set a {@code GtkBitset}
 * @param target target value to start iterating at
 * @param value Set to the found value in {@code set}
 * @return {@code true} if a value was found.
 */
public static boolean bitsetIterInitAt(org.gtk.gtk.BitsetIter iter, org.gtk.gtk.Bitset set, int target, Out<Integer> value) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemorySegment valuePOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_bitset_iter_init_at.invokeExact(
                    iter.handle(),
                    set.handle(),
                    target,
                    (Addressable) (value == null ? MemoryAddress.NULL : (Addressable) valuePOINTER.address()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
                if (value != null) value.set(valuePOINTER.get(Interop.valueLayout.C_INT, 0));
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
}

/**
 * Initializes an iterator for {@code set} and points it to the first
 * value in {@code set}.
 * <p>
 * If {@code set} is empty, {@code false} is returned and {@code value} is set to {@code G_MAXUINT}.
 * @param iter a pointer to an uninitialized {@code GtkBitsetIter}
 * @param set a {@code GtkBitset}
 * @param value Set to the first value in {@code set}
 * @return {@code true} if {@code set} isn't empty.
 */
public static boolean bitsetIterInitFirst(org.gtk.gtk.BitsetIter iter, org.gtk.gtk.Bitset set, Out<Integer> value) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemorySegment valuePOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_bitset_iter_init_first.invokeExact(
                    iter.handle(),
                    set.handle(),
                    (Addressable) (value == null ? MemoryAddress.NULL : (Addressable) valuePOINTER.address()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
                if (value != null) value.set(valuePOINTER.get(Interop.valueLayout.C_INT, 0));
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
}

/**
 * Initializes an iterator for {@code set} and points it to the last
 * value in {@code set}.
 * <p>
 * If {@code set} is empty, {@code false} is returned.
 * @param iter a pointer to an uninitialized {@code GtkBitsetIter}
 * @param set a {@code GtkBitset}
 * @param value Set to the last value in {@code set}
 * @return {@code true} if {@code set} isn't empty.
 */
public static boolean bitsetIterInitLast(org.gtk.gtk.BitsetIter iter, org.gtk.gtk.Bitset set, Out<Integer> value) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemorySegment valuePOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_bitset_iter_init_last.invokeExact(
                    iter.handle(),
                    set.handle(),
                    (Addressable) (value == null ? MemoryAddress.NULL : (Addressable) valuePOINTER.address()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
                if (value != null) value.set(valuePOINTER.get(Interop.valueLayout.C_INT, 0));
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
}

public static org.gtk.glib.Quark builderErrorQuark() {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.gtk_builder_error_quark.invokeExact();
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
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
 * @param requiredMajor the required major version
 * @param requiredMinor the required minor version
 * @param requiredMicro the required micro version
 * @return {@code null} if the GTK library is compatible with the
 *   given version, or a string describing the version mismatch.
 *   The returned string is owned by GTK and should not be modified
 *   or freed.
 */
public static @Nullable java.lang.String checkVersion(int requiredMajor, int requiredMinor, int requiredMicro) {
    MemoryAddress RESULT;
    try {
        RESULT = (MemoryAddress) DowncallHandles.gtk_check_version.invokeExact(
                requiredMajor,
                requiredMinor,
                requiredMicro);
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return Marshal.addressToString.marshal(RESULT, null);
}

public static org.gtk.glib.Quark constraintVflParserErrorQuark() {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.gtk_constraint_vfl_parser_error_quark.invokeExact();
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return new org.gtk.glib.Quark(RESULT);
}

public static org.gtk.glib.Quark cssParserErrorQuark() {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.gtk_css_parser_error_quark.invokeExact();
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return new org.gtk.glib.Quark(RESULT);
}

public static org.gtk.glib.Quark cssParserWarningQuark() {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.gtk_css_parser_warning_quark.invokeExact();
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return new org.gtk.glib.Quark(RESULT);
}

/**
 * Prevents {@link Gtk#init} from automatically calling
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
        DowncallHandles.gtk_disable_setlocale.invokeExact();
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
}

/**
 * Distributes {@code extra_space} to child {@code sizes} by bringing smaller
 * children up to natural size first.
 * <p>
 * The remaining space will be added to the {@code minimum_size} member of the
 * {@code GtkRequestedSize} struct. If all sizes reach their natural size then
 * the remaining space is returned.
 * @param extraSpace Extra space to redistribute among children after subtracting
 *   minimum sizes and any child padding from the overall allocation
 * @param nRequestedSizes Number of requests to fit into the allocation
 * @param sizes An array of structs with a client pointer and a minimum/natural size
 *  in the orientation of the allocation.
 * @return The remainder of {@code extra_space} after redistributing space
 * to {@code sizes}.
 */
public static int distributeNaturalAllocation(int extraSpace, int nRequestedSizes, org.gtk.gtk.RequestedSize[] sizes) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_distribute_natural_allocation.invokeExact(
                    extraSpace,
                    nRequestedSizes,
                    Interop.allocateNativeArray(sizes, org.gtk.gtk.RequestedSize.getMemoryLayout(), false, SCOPE));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
}

/**
 * Gets a property of the {@code GtkEditable} delegate for {@code object}.
 * <p>
 * This is helper function that should be called in the {@code get_property}
 * function of your {@code GtkEditable} implementation, before handling your
 * own properties.
 * @param object a {@code GObject}
 * @param propId a property ID
 * @param value value to set
 * @param pspec the {@code GParamSpec} for the property
 * @return {@code true} if the property was found
 */
public static boolean editableDelegateGetProperty(org.gtk.gobject.GObject object, int propId, org.gtk.gobject.Value value, org.gtk.gobject.ParamSpec pspec) {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.gtk_editable_delegate_get_property.invokeExact(
                object.handle(),
                propId,
                value.handle(),
                pspec.handle());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
}

/**
 * Sets a property on the {@code GtkEditable} delegate for {@code object}.
 * <p>
 * This is a helper function that should be called in the {@code set_property}
 * function of your {@code GtkEditable} implementation, before handling your
 * own properties.
 * @param object a {@code GObject}
 * @param propId a property ID
 * @param value value to set
 * @param pspec the {@code GParamSpec} for the property
 * @return {@code true} if the property was found
 */
public static boolean editableDelegateSetProperty(org.gtk.gobject.GObject object, int propId, org.gtk.gobject.Value value, org.gtk.gobject.ParamSpec pspec) {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.gtk_editable_delegate_set_property.invokeExact(
                object.handle(),
                propId,
                value.handle(),
                pspec.handle());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
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
 * functions, you can either use {@link Editable#delegateSetProperty}
 * and {@link Editable#delegateGetProperty} (if you are using
 * a delegate), or remember the {@code first_prop} offset and add it to the
 * values in the {@code Gtk.EditableProperties} enumeration to get the
 * property IDs for these properties.
 * @param objectClass a {@code GObjectClass}
 * @param firstProp property ID to use for the first property
 * @return the number of properties that were installed
 */
public static int editableInstallProperties(org.gtk.gobject.ObjectClass objectClass, int firstProp) {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.gtk_editable_install_properties.invokeExact(
                objectClass.handle(),
                firstProp);
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return RESULT;
}

/**
 * Calls a function for all {@code GtkPrinter}s.
 * <p>
 * If {@code func} returns {@code true}, the enumeration is stopped.
 * @param func a function to call for each printer
 * @param destroy function to call if {@code data} is no longer needed
 * @param wait_ if {@code true}, wait in a recursive mainloop until
 *    all printers are enumerated; otherwise return early
 */
public static void enumeratePrinters(org.gtk.gtk.PrinterFunc func, org.gtk.glib.DestroyNotify destroy, boolean wait_) {
    try {
        DowncallHandles.gtk_enumerate_printers.invokeExact(
                (Addressable) func.toCallback(),
                (Addressable) MemoryAddress.NULL,
                (Addressable) destroy.toCallback(),
                Marshal.booleanToInteger.marshal(wait_, null).intValue());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
}

/**
 * Registers an error quark for {@code GtkFileChooser} errors.
 * @return The error quark used for {@code GtkFileChooser} errors.
 */
public static org.gtk.glib.Quark fileChooserErrorQuark() {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.gtk_file_chooser_error_quark.invokeExact();
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return new org.gtk.glib.Quark(RESULT);
}

/**
 * Returns the binary age as passed to {@code libtool}.
 * <p>
 * If {@code libtool} means nothing to you, don't worry about it.
 * @return the binary age of the GTK library
 */
public static int getBinaryAge() {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.gtk_get_binary_age.invokeExact();
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return RESULT;
}

/**
 * Returns the GTK debug flags that are currently active.
 * <p>
 * This function is intended for GTK modules that want
 * to adjust their debug output based on GTK debug flags.
 * @return the GTK debug flags.
 */
public static org.gtk.gtk.DebugFlags getDebugFlags() {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.gtk_get_debug_flags.invokeExact();
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return new org.gtk.gtk.DebugFlags(RESULT);
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
 * {@link org.pango.Language#getDefault}.
 * See that function for details.
 * @return the default language as a
 *   {@code PangoLanguage}
 */
public static org.pango.Language getDefaultLanguage() {
    MemoryAddress RESULT;
    try {
        RESULT = (MemoryAddress) DowncallHandles.gtk_get_default_language.invokeExact();
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return org.pango.Language.fromAddress.marshal(RESULT, null);
}

/**
 * Returns the interface age as passed to {@code libtool}.
 * <p>
 * If {@code libtool} means nothing to you, don't worry about it.
 * @return the interface age of the GTK library
 */
public static int getInterfaceAge() {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.gtk_get_interface_age.invokeExact();
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
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
 * @return the {@code GtkTextDirection} of the current locale
 */
public static org.gtk.gtk.TextDirection getLocaleDirection() {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.gtk_get_locale_direction.invokeExact();
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return org.gtk.gtk.TextDirection.of(RESULT);
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
 * @return the major version number of the GTK library
 */
public static int getMajorVersion() {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.gtk_get_major_version.invokeExact();
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
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
 * @return the micro version number of the GTK library
 */
public static int getMicroVersion() {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.gtk_get_micro_version.invokeExact();
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
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
 * @return the minor version number of the GTK library
 */
public static int getMinorVersion() {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.gtk_get_minor_version.invokeExact();
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return RESULT;
}

/**
 * Converts a color from HSV space to RGB.
 * <p>
 * Input values must be in the [0.0, 1.0] range;
 * output values will be in the same range.
 * @param h Hue
 * @param s Saturation
 * @param v Value
 * @param r Return value for the red component
 * @param g Return value for the green component
 * @param b Return value for the blue component
 */
public static void hsvToRgb(float h, float s, float v, Out<Float> r, Out<Float> g, Out<Float> b) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemorySegment rPOINTER = SCOPE.allocate(Interop.valueLayout.C_FLOAT);
        MemorySegment gPOINTER = SCOPE.allocate(Interop.valueLayout.C_FLOAT);
        MemorySegment bPOINTER = SCOPE.allocate(Interop.valueLayout.C_FLOAT);
        try {
            DowncallHandles.gtk_hsv_to_rgb.invokeExact(
                    h,
                    s,
                    v,
                    (Addressable) rPOINTER.address(),
                    (Addressable) gPOINTER.address(),
                    (Addressable) bPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
                r.set(rPOINTER.get(Interop.valueLayout.C_FLOAT, 0));
                g.set(gPOINTER.get(Interop.valueLayout.C_FLOAT, 0));
                b.set(bPOINTER.get(Interop.valueLayout.C_FLOAT, 0));
    }
}

public static org.gtk.glib.Quark iconThemeErrorQuark() {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.gtk_icon_theme_error_quark.invokeExact();
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
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
    try {
        DowncallHandles.gtk_init.invokeExact();
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
}

/**
 * This function does the same work as gtk_init() with only a single
 * change: It does not terminate the program if the windowing system
 * can’t be initialized. Instead it returns {@code false} on failure.
 * <p>
 * This way the application can fall back to some other means of
 * communication with the user - for example a curses or command line
 * interface.
 * @return {@code true} if the windowing system has been successfully
 *   initialized, {@code false} otherwise
 */
public static boolean initCheck() {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.gtk_init_check.invokeExact();
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
}

/**
 * Use this function to check if GTK has been initialized with gtk_init()
 * or gtk_init_check().
 * @return the initialization status
 */
public static boolean isInitialized() {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.gtk_is_initialized.invokeExact();
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
}

/**
 * Finds the {@code GtkNative} associated with the surface.
 * @param surface a {@code GdkSurface}
 * @return the {@code GtkNative} that is associated with {@code surface}
 */
public static @Nullable org.gtk.gtk.Native nativeGetForSurface(org.gtk.gdk.Surface surface) {
    MemoryAddress RESULT;
    try {
        RESULT = (MemoryAddress) DowncallHandles.gtk_native_get_for_surface.invokeExact(surface.handle());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return (org.gtk.gtk.Native) Interop.register(RESULT, org.gtk.gtk.Native.fromAddress).marshal(RESULT, null);
}

/**
 * Converts the result of a {@code GCompareFunc} like strcmp() to a
 * {@code GtkOrdering} value.
 * @param cmpfuncResult Result of a comparison function
 * @return the corresponding {@code GtkOrdering}
 */
public static org.gtk.gtk.Ordering orderingFromCmpfunc(int cmpfuncResult) {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.gtk_ordering_from_cmpfunc.invokeExact(cmpfuncResult);
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return org.gtk.gtk.Ordering.of(RESULT);
}

/**
 * Returns the name of the default paper size, which
 * depends on the current locale.
 * @return the name of the default paper size. The string
 * is owned by GTK and should not be modified.
 */
public static java.lang.String paperSizeGetDefault() {
    MemoryAddress RESULT;
    try {
        RESULT = (MemoryAddress) DowncallHandles.gtk_paper_size_get_default.invokeExact();
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return Marshal.addressToString.marshal(RESULT, null);
}

/**
 * Creates a list of known paper sizes.
 * @param includeCustom whether to include custom paper sizes
 *   as defined in the page setup dialog
 * @return a newly allocated list of newly
 *    allocated {@code GtkPaperSize} objects
 */
public static org.gtk.glib.List paperSizeGetPaperSizes(boolean includeCustom) {
    MemoryAddress RESULT;
    try {
        RESULT = (MemoryAddress) DowncallHandles.gtk_paper_size_get_paper_sizes.invokeExact(Marshal.booleanToInteger.marshal(includeCustom, null).intValue());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    var OBJECT = org.gtk.glib.List.fromAddress.marshal(RESULT, null);
    OBJECT.takeOwnership();
    return OBJECT;
}

/**
 * Creates a new {@code GParamSpec} instance for a property holding a {@code GtkExpression}.
 * <p>
 * See {@code g_param_spec_internal()} for details on the property strings.
 * @param name canonical name of the property
 * @param nick a user-readable name for the property
 * @param blurb a user-readable description of the property
 * @param flags flags for the property
 * @return a newly created property specification
 */
public static org.gtk.gobject.ParamSpec paramSpecExpression(java.lang.String name, java.lang.String nick, java.lang.String blurb, org.gtk.gobject.ParamFlags flags) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_param_spec_expression.invokeExact(
                    Marshal.stringToAddress.marshal(name, SCOPE),
                    Marshal.stringToAddress.marshal(nick, SCOPE),
                    Marshal.stringToAddress.marshal(blurb, SCOPE),
                    flags.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = (org.gtk.gobject.ParamSpec) Interop.register(RESULT, org.gtk.gobject.ParamSpec.fromAddress).marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
}

/**
 * Registers an error quark for {@code GtkPrintOperation} if necessary.
 * @return The error quark used for {@code GtkPrintOperation} errors.
 */
public static org.gtk.glib.Quark printErrorQuark() {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.gtk_print_error_quark.invokeExact();
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
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
 * @param parent transient parent
 * @param pageSetup an existing {@code GtkPageSetup}
 * @param settings a {@code GtkPrintSettings}
 * @return a new {@code GtkPageSetup}
 */
public static org.gtk.gtk.PageSetup printRunPageSetupDialog(@Nullable org.gtk.gtk.Window parent, @Nullable org.gtk.gtk.PageSetup pageSetup, org.gtk.gtk.PrintSettings settings) {
    MemoryAddress RESULT;
    try {
        RESULT = (MemoryAddress) DowncallHandles.gtk_print_run_page_setup_dialog.invokeExact(
                (Addressable) (parent == null ? MemoryAddress.NULL : parent.handle()),
                (Addressable) (pageSetup == null ? MemoryAddress.NULL : pageSetup.handle()),
                settings.handle());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    var OBJECT = (org.gtk.gtk.PageSetup) Interop.register(RESULT, org.gtk.gtk.PageSetup.fromAddress).marshal(RESULT, null);
    OBJECT.takeOwnership();
    return OBJECT;
}

/**
 * Runs a page setup dialog, letting the user modify the values from {@code page_setup}.
 * <p>
 * In contrast to gtk_print_run_page_setup_dialog(), this function  returns after
 * showing the page setup dialog on platforms that support this, and calls {@code done_cb}
 * from a signal handler for the ::response signal of the dialog.
 * @param parent transient parent
 * @param pageSetup an existing {@code GtkPageSetup}
 * @param settings a {@code GtkPrintSettings}
 * @param doneCb a function to call when the user saves
 *    the modified page setup
 */
public static void printRunPageSetupDialogAsync(@Nullable org.gtk.gtk.Window parent, @Nullable org.gtk.gtk.PageSetup pageSetup, org.gtk.gtk.PrintSettings settings, org.gtk.gtk.PageSetupDoneFunc doneCb) {
    try {
        DowncallHandles.gtk_print_run_page_setup_dialog_async.invokeExact(
                (Addressable) (parent == null ? MemoryAddress.NULL : parent.handle()),
                (Addressable) (pageSetup == null ? MemoryAddress.NULL : pageSetup.handle()),
                settings.handle(),
                (Addressable) doneCb.toCallback(),
                (Addressable) MemoryAddress.NULL);
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
}

public static org.gtk.glib.Quark recentManagerErrorQuark() {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.gtk_recent_manager_error_quark.invokeExact();
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return new org.gtk.glib.Quark(RESULT);
}

/**
 * Renders an activity indicator (such as in {@code GtkSpinner}).
 * The state {@link StateFlags#CHECKED} determines whether there is
 * activity going on.
 * @param context a {@code GtkStyleContext}
 * @param cr a {@code cairo_t}
 * @param x X origin of the rectangle
 * @param y Y origin of the rectangle
 * @param width rectangle width
 * @param height rectangle height
 */
public static void renderActivity(org.gtk.gtk.StyleContext context, org.cairographics.Context cr, double x, double y, double width, double height) {
    try {
        DowncallHandles.gtk_render_activity.invokeExact(
                context.handle(),
                cr.handle(),
                x,
                y,
                width,
                height);
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
}

/**
 * Renders an arrow pointing to {@code angle}.
 * <p>
 * Typical arrow rendering at 0, 1⁄2 π;, π; and 3⁄2 π:
 * <p>
 * <img src="./doc-files/arrows.png" alt="">
 * @param context a {@code GtkStyleContext}
 * @param cr a {@code cairo_t}
 * @param angle arrow angle from 0 to 2 * {@code G_PI}, being 0 the arrow pointing to the north
 * @param x X origin of the render area
 * @param y Y origin of the render area
 * @param size square side for render area
 */
public static void renderArrow(org.gtk.gtk.StyleContext context, org.cairographics.Context cr, double angle, double x, double y, double size) {
    try {
        DowncallHandles.gtk_render_arrow.invokeExact(
                context.handle(),
                cr.handle(),
                angle,
                x,
                y,
                size);
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
}

/**
 * Renders the background of an element.
 * <p>
 * Typical background rendering, showing the effect of
 * {@code background-image}, {@code border-width} and {@code border-radius}:
 * <p>
 * <img src="./doc-files/background.png" alt="">
 * @param context a {@code GtkStyleContext}
 * @param cr a {@code cairo_t}
 * @param x X origin of the rectangle
 * @param y Y origin of the rectangle
 * @param width rectangle width
 * @param height rectangle height
 */
public static void renderBackground(org.gtk.gtk.StyleContext context, org.cairographics.Context cr, double x, double y, double width, double height) {
    try {
        DowncallHandles.gtk_render_background.invokeExact(
                context.handle(),
                cr.handle(),
                x,
                y,
                width,
                height);
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
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
 * <img src="./doc-files/checks.png" alt="">
 * @param context a {@code GtkStyleContext}
 * @param cr a {@code cairo_t}
 * @param x X origin of the rectangle
 * @param y Y origin of the rectangle
 * @param width rectangle width
 * @param height rectangle height
 */
public static void renderCheck(org.gtk.gtk.StyleContext context, org.cairographics.Context cr, double x, double y, double width, double height) {
    try {
        DowncallHandles.gtk_render_check.invokeExact(
                context.handle(),
                cr.handle(),
                x,
                y,
                width,
                height);
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
}

/**
 * Renders an expander (as used in {@code GtkTreeView} and {@code GtkExpander}) in the area
 * defined by {@code x}, {@code y}, {@code width}, {@code height}. The state {@link StateFlags#CHECKED}
 * determines whether the expander is collapsed or expanded.
 * <p>
 * Typical expander rendering:
 * <p>
 * <img src="./doc-files/expanders.png" alt="">
 * @param context a {@code GtkStyleContext}
 * @param cr a {@code cairo_t}
 * @param x X origin of the rectangle
 * @param y Y origin of the rectangle
 * @param width rectangle width
 * @param height rectangle height
 */
public static void renderExpander(org.gtk.gtk.StyleContext context, org.cairographics.Context cr, double x, double y, double width, double height) {
    try {
        DowncallHandles.gtk_render_expander.invokeExact(
                context.handle(),
                cr.handle(),
                x,
                y,
                width,
                height);
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
}

/**
 * Renders a focus indicator on the rectangle determined by {@code x}, {@code y}, {@code width}, {@code height}.
 * <p>
 * Typical focus rendering:
 * <p>
 * <img src="./doc-files/focus.png" alt="">
 * @param context a {@code GtkStyleContext}
 * @param cr a {@code cairo_t}
 * @param x X origin of the rectangle
 * @param y Y origin of the rectangle
 * @param width rectangle width
 * @param height rectangle height
 */
public static void renderFocus(org.gtk.gtk.StyleContext context, org.cairographics.Context cr, double x, double y, double width, double height) {
    try {
        DowncallHandles.gtk_render_focus.invokeExact(
                context.handle(),
                cr.handle(),
                x,
                y,
                width,
                height);
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
}

/**
 * Renders a frame around the rectangle defined by {@code x}, {@code y}, {@code width}, {@code height}.
 * <p>
 * Examples of frame rendering, showing the effect of {@code border-image},
 * {@code border-color}, {@code border-width}, {@code border-radius} and junctions:
 * <p>
 * <img src="./doc-files/frames.png" alt="">
 * @param context a {@code GtkStyleContext}
 * @param cr a {@code cairo_t}
 * @param x X origin of the rectangle
 * @param y Y origin of the rectangle
 * @param width rectangle width
 * @param height rectangle height
 */
public static void renderFrame(org.gtk.gtk.StyleContext context, org.cairographics.Context cr, double x, double y, double width, double height) {
    try {
        DowncallHandles.gtk_render_frame.invokeExact(
                context.handle(),
                cr.handle(),
                x,
                y,
                width,
                height);
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
}

/**
 * Renders a handle (as in {@code GtkPaned} and {@code GtkWindow}’s resize grip),
 * in the rectangle determined by {@code x}, {@code y}, {@code width}, {@code height}.
 * <p>
 * Handles rendered for the paned and grip classes:
 * <p>
 * <img src="./doc-files/handles.png" alt="">
 * @param context a {@code GtkStyleContext}
 * @param cr a {@code cairo_t}
 * @param x X origin of the rectangle
 * @param y Y origin of the rectangle
 * @param width rectangle width
 * @param height rectangle height
 */
public static void renderHandle(org.gtk.gtk.StyleContext context, org.cairographics.Context cr, double x, double y, double width, double height) {
    try {
        DowncallHandles.gtk_render_handle.invokeExact(
                context.handle(),
                cr.handle(),
                x,
                y,
                width,
                height);
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
}

/**
 * Renders the icon in {@code texture} at the specified {@code x} and {@code y} coordinates.
 * <p>
 * This function will render the icon in {@code texture} at exactly its size,
 * regardless of scaling factors, which may not be appropriate when
 * drawing on displays with high pixel densities.
 * @param context a {@code GtkStyleContext}
 * @param cr a {@code cairo_t}
 * @param texture a {@code GdkTexture} containing the icon to draw
 * @param x X position for the {@code texture}
 * @param y Y position for the {@code texture}
 */
public static void renderIcon(org.gtk.gtk.StyleContext context, org.cairographics.Context cr, org.gtk.gdk.Texture texture, double x, double y) {
    try {
        DowncallHandles.gtk_render_icon.invokeExact(
                context.handle(),
                cr.handle(),
                texture.handle(),
                x,
                y);
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
}

/**
 * Renders {@code layout} on the coordinates {@code x}, {@code y}
 * @param context a {@code GtkStyleContext}
 * @param cr a {@code cairo_t}
 * @param x X origin
 * @param y Y origin
 * @param layout the {@code PangoLayout} to render
 */
public static void renderLayout(org.gtk.gtk.StyleContext context, org.cairographics.Context cr, double x, double y, org.pango.Layout layout) {
    try {
        DowncallHandles.gtk_render_layout.invokeExact(
                context.handle(),
                cr.handle(),
                x,
                y,
                layout.handle());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
}

/**
 * Renders a line from (x0, y0) to (x1, y1).
 * @param context a {@code GtkStyleContext}
 * @param cr a {@code cairo_t}
 * @param x0 X coordinate for the origin of the line
 * @param y0 Y coordinate for the origin of the line
 * @param x1 X coordinate for the end of the line
 * @param y1 Y coordinate for the end of the line
 */
public static void renderLine(org.gtk.gtk.StyleContext context, org.cairographics.Context cr, double x0, double y0, double x1, double y1) {
    try {
        DowncallHandles.gtk_render_line.invokeExact(
                context.handle(),
                cr.handle(),
                x0,
                y0,
                x1,
                y1);
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
}

/**
 * Renders an option mark (as in a radio button), the {@link StateFlags#CHECKED}
 * state will determine whether the option is on or off, and
 * {@link StateFlags#INCONSISTENT} whether it should be marked as undefined.
 * <p>
 * Typical option mark rendering:
 * <p>
 * <img src="./doc-files/options.png" alt="">
 * @param context a {@code GtkStyleContext}
 * @param cr a {@code cairo_t}
 * @param x X origin of the rectangle
 * @param y Y origin of the rectangle
 * @param width rectangle width
 * @param height rectangle height
 */
public static void renderOption(org.gtk.gtk.StyleContext context, org.cairographics.Context cr, double x, double y, double width, double height) {
    try {
        DowncallHandles.gtk_render_option.invokeExact(
                context.handle(),
                cr.handle(),
                x,
                y,
                width,
                height);
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
}

/**
 * Converts a color from RGB space to HSV.
 * <p>
 * Input values must be in the [0.0, 1.0] range;
 * output values will be in the same range.
 * @param r Red
 * @param g Green
 * @param b Blue
 * @param h Return value for the hue component
 * @param s Return value for the saturation component
 * @param v Return value for the value component
 */
public static void rgbToHsv(float r, float g, float b, Out<Float> h, Out<Float> s, Out<Float> v) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemorySegment hPOINTER = SCOPE.allocate(Interop.valueLayout.C_FLOAT);
        MemorySegment sPOINTER = SCOPE.allocate(Interop.valueLayout.C_FLOAT);
        MemorySegment vPOINTER = SCOPE.allocate(Interop.valueLayout.C_FLOAT);
        try {
            DowncallHandles.gtk_rgb_to_hsv.invokeExact(
                    r,
                    g,
                    b,
                    (Addressable) hPOINTER.address(),
                    (Addressable) sPOINTER.address(),
                    (Addressable) vPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
                h.set(hPOINTER.get(Interop.valueLayout.C_FLOAT, 0));
                s.set(sPOINTER.get(Interop.valueLayout.C_FLOAT, 0));
                v.set(vPOINTER.get(Interop.valueLayout.C_FLOAT, 0));
    }
}

/**
 * Sets the GTK debug flags.
 * @param flags the debug flags to set
 */
public static void setDebugFlags(org.gtk.gtk.DebugFlags flags) {
    try {
        DowncallHandles.gtk_set_debug_flags.invokeExact(flags.getValue());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
}

/**
 * A convenience function for showing an application’s about dialog.
 * <p>
 * The constructed dialog is associated with the parent window and
 * reused for future invocations of this function.
 * @param parent the parent top-level window
 * @param firstPropertyName the name of the first property
 * @param varargs value of first property, followed by more pairs of property
 *   name and value, {@code NULL}-terminated
 */
public static void showAboutDialog(@Nullable org.gtk.gtk.Window parent, java.lang.String firstPropertyName, java.lang.Object... varargs) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        try {
            DowncallHandles.gtk_show_about_dialog.invokeExact(
                    (Addressable) (parent == null ? MemoryAddress.NULL : parent.handle()),
                    Marshal.stringToAddress.marshal(firstPropertyName, SCOPE),
                    varargs);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
}

/**
 * This function launches the default application for showing
 * a given uri, or shows an error dialog if that fails.
 * @param parent parent window
 * @param uri the uri to show
 * @param timestamp timestamp from the event that triggered this call, or {@code GDK_CURRENT_TIME}
 */
public static void showUri(@Nullable org.gtk.gtk.Window parent, java.lang.String uri, int timestamp) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        try {
            DowncallHandles.gtk_show_uri.invokeExact(
                    (Addressable) (parent == null ? MemoryAddress.NULL : parent.handle()),
                    Marshal.stringToAddress.marshal(uri, SCOPE),
                    timestamp);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
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
 * @param parent parent window
 * @param uri the uri to show
 * @param timestamp timestamp from the event that triggered this call, or {@code GDK_CURRENT_TIME}
 * @param cancellable a {@code GCancellable} to cancel the launch
 * @param callback a callback to call when the action is complete
 */
public static void showUriFull(@Nullable org.gtk.gtk.Window parent, java.lang.String uri, int timestamp, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.AsyncReadyCallback callback) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        try {
            DowncallHandles.gtk_show_uri_full.invokeExact(
                    (Addressable) (parent == null ? MemoryAddress.NULL : parent.handle()),
                    Marshal.stringToAddress.marshal(uri, SCOPE),
                    timestamp,
                    (Addressable) (cancellable == null ? MemoryAddress.NULL : cancellable.handle()),
                    (Addressable) (callback == null ? MemoryAddress.NULL : (Addressable) callback.toCallback()),
                    (Addressable) MemoryAddress.NULL);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
}

/**
 * Finishes the gtk_show_uri() call and returns the result
 * of the operation.
 * @param parent the {@code GtkWindow} passed to gtk_show_uri()
 * @param result {@code GAsyncResult} that was passed to {@code callback}
 * @return {@code true} if the URI was shown successfully.
 *   Otherwise, {@code false} is returned and {@code error} is set
 * @throws GErrorException See {@link org.gtk.glib.Error}
 */
public static boolean showUriFullFinish(org.gtk.gtk.Window parent, org.gtk.gio.AsyncResult result) throws io.github.jwharm.javagi.GErrorException {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_show_uri_full_finish.invokeExact(
                    parent.handle(),
                    result.handle(),
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
}

public static void testAccessibleAssertionMessageRole(java.lang.String domain, java.lang.String file, int line, java.lang.String func, java.lang.String expr, org.gtk.gtk.Accessible accessible, org.gtk.gtk.AccessibleRole expectedRole, org.gtk.gtk.AccessibleRole actualRole) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        try {
            DowncallHandles.gtk_test_accessible_assertion_message_role.invokeExact(
                    Marshal.stringToAddress.marshal(domain, SCOPE),
                    Marshal.stringToAddress.marshal(file, SCOPE),
                    line,
                    Marshal.stringToAddress.marshal(func, SCOPE),
                    Marshal.stringToAddress.marshal(expr, SCOPE),
                    accessible.handle(),
                    expectedRole.getValue(),
                    actualRole.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
}

/**
 * Checks whether the accessible {@code property} of {@code accessible} is set to
 * a specific value.
 * @param accessible a {@code GtkAccessible}
 * @param property a {@code GtkAccessibleProperty}
 * @param varargs the expected value of {@code property}
 * @return the value of the accessible property
 */
public static java.lang.String testAccessibleCheckProperty(org.gtk.gtk.Accessible accessible, org.gtk.gtk.AccessibleProperty property, java.lang.Object... varargs) {
    MemoryAddress RESULT;
    try {
        RESULT = (MemoryAddress) DowncallHandles.gtk_test_accessible_check_property.invokeExact(
                accessible.handle(),
                property.getValue(),
                varargs);
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return Marshal.addressToString.marshal(RESULT, null);
}

/**
 * Checks whether the accessible {@code relation} of {@code accessible} is set to
 * a specific value.
 * @param accessible a {@code GtkAccessible}
 * @param relation a {@code GtkAccessibleRelation}
 * @param varargs the expected value of {@code relation}
 * @return the value of the accessible relation
 */
public static java.lang.String testAccessibleCheckRelation(org.gtk.gtk.Accessible accessible, org.gtk.gtk.AccessibleRelation relation, java.lang.Object... varargs) {
    MemoryAddress RESULT;
    try {
        RESULT = (MemoryAddress) DowncallHandles.gtk_test_accessible_check_relation.invokeExact(
                accessible.handle(),
                relation.getValue(),
                varargs);
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return Marshal.addressToString.marshal(RESULT, null);
}

/**
 * Checks whether the accessible {@code state} of {@code accessible} is set to
 * a specific value.
 * @param accessible a {@code GtkAccessible}
 * @param state a {@code GtkAccessibleState}
 * @param varargs the expected value of {@code state}
 * @return the value of the accessible state
 */
public static java.lang.String testAccessibleCheckState(org.gtk.gtk.Accessible accessible, org.gtk.gtk.AccessibleState state, java.lang.Object... varargs) {
    MemoryAddress RESULT;
    try {
        RESULT = (MemoryAddress) DowncallHandles.gtk_test_accessible_check_state.invokeExact(
                accessible.handle(),
                state.getValue(),
                varargs);
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return Marshal.addressToString.marshal(RESULT, null);
}

/**
 * Checks whether the {@code GtkAccessible} has {@code property} set.
 * @param accessible a {@code GtkAccessible}
 * @param property a {@code GtkAccessibleProperty}
 * @return {@code true} if the {@code property} is set in the {@code accessible}
 */
public static boolean testAccessibleHasProperty(org.gtk.gtk.Accessible accessible, org.gtk.gtk.AccessibleProperty property) {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.gtk_test_accessible_has_property.invokeExact(
                accessible.handle(),
                property.getValue());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
}

/**
 * Checks whether the {@code GtkAccessible} has {@code relation} set.
 * @param accessible a {@code GtkAccessible}
 * @param relation a {@code GtkAccessibleRelation}
 * @return {@code true} if the {@code relation} is set in the {@code accessible}
 */
public static boolean testAccessibleHasRelation(org.gtk.gtk.Accessible accessible, org.gtk.gtk.AccessibleRelation relation) {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.gtk_test_accessible_has_relation.invokeExact(
                accessible.handle(),
                relation.getValue());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
}

/**
 * Checks whether the {@code GtkAccessible:accessible-role} of the accessible
 * is {@code role}.
 * @param accessible a {@code GtkAccessible}
 * @param role a {@code GtkAccessibleRole}
 * @return {@code true} if the role matches
 */
public static boolean testAccessibleHasRole(org.gtk.gtk.Accessible accessible, org.gtk.gtk.AccessibleRole role) {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.gtk_test_accessible_has_role.invokeExact(
                accessible.handle(),
                role.getValue());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
}

/**
 * Checks whether the {@code GtkAccessible} has {@code state} set.
 * @param accessible a {@code GtkAccessible}
 * @param state a {@code GtkAccessibleState}
 * @return {@code true} if the {@code state} is set in the {@code accessible}
 */
public static boolean testAccessibleHasState(org.gtk.gtk.Accessible accessible, org.gtk.gtk.AccessibleState state) {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.gtk_test_accessible_has_state.invokeExact(
                accessible.handle(),
                state.getValue());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
}

/**
 * This function is used to initialize a GTK test program.
 * <p>
 * It will in turn call g_test_init() and gtk_init() to properly
 * initialize the testing framework and graphical toolkit. It’ll
 * also set the program’s locale to “C”. This is done to make test
 * program environments as deterministic as possible.
 * <p>
 * Like gtk_init() and g_test_init(), any known arguments will be
 * processed and stripped from {@code argc} and {@code argv}.
 * @param argcp Address of the {@code argc} parameter of the
 *   main() function. Changed if any arguments were handled.
 * @param argvp Address of the {@code argv}
 *   parameter of main(). Any parameters understood by g_test_init()
 *   or gtk_init() are stripped before return.
 * @param varargs currently unused
 */
public static void testInit(Out<Integer> argcp, Out<java.lang.String[]> argvp, java.lang.Object... varargs) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemorySegment argcpPOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
        MemorySegment argvpPOINTER = SCOPE.allocate(Interop.valueLayout.ADDRESS);
        try {
            DowncallHandles.gtk_test_init.invokeExact(
                    (Addressable) argcpPOINTER.address(),
                    (Addressable) argvpPOINTER.address(),
                    varargs);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
                argcp.set(argcpPOINTER.get(Interop.valueLayout.C_INT, 0));
        java.lang.String[] argvpARRAY = new java.lang.String[argcp.get().intValue()];
        for (int I = 0; I < argcp.get().intValue(); I++) {
            var OBJ = argvpPOINTER.get(Interop.valueLayout.ADDRESS, I);
            argvpARRAY[I] = Marshal.addressToString.marshal(OBJ, null);
            }
        argvp.set(argvpARRAY);
    }
}

/**
 * Return the type ids that have been registered after
 * calling gtk_test_register_all_types().
 * @param nTypes location to store number of types
 * @return 0-terminated array of type ids
 */
public static org.gtk.glib.Type[] testListAllTypes(Out<Integer> nTypes) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemorySegment nTypesPOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_test_list_all_types.invokeExact((Addressable) nTypesPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
                nTypes.set(nTypesPOINTER.get(Interop.valueLayout.C_INT, 0));
        org.gtk.glib.Type[] resultARRAY = new org.gtk.glib.Type[nTypes.get().intValue()];
        for (int I = 0; I < nTypes.get().intValue(); I++) {
            var OBJ = RESULT.get(Interop.valueLayout.C_LONG, I);
            resultARRAY[I] = new org.gtk.glib.Type(OBJ);
        }
        return resultARRAY;
    }
}

/**
 * Force registration of all core GTK object types.
 * <p>
 * This allowes to refer to any of those object types via
 * g_type_from_name() after calling this function.
 */
public static void testRegisterAllTypes() {
    try {
        DowncallHandles.gtk_test_register_all_types.invokeExact();
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
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
 * @param widget the widget to wait for
 */
public static void testWidgetWaitForDraw(org.gtk.gtk.Widget widget) {
    try {
        DowncallHandles.gtk_test_widget_wait_for_draw.invokeExact(widget.handle());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
}

/**
 * Creates a content provider for dragging {@code path} from {@code tree_model}.
 * @param treeModel a {@code GtkTreeModel}
 * @param path a row in {@code tree_model}
 * @return a new {@code GdkContentProvider}
 */
public static org.gtk.gdk.ContentProvider treeCreateRowDragContent(org.gtk.gtk.TreeModel treeModel, org.gtk.gtk.TreePath path) {
    MemoryAddress RESULT;
    try {
        RESULT = (MemoryAddress) DowncallHandles.gtk_tree_create_row_drag_content.invokeExact(
                treeModel.handle(),
                path.handle());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    var OBJECT = (org.gtk.gdk.ContentProvider) Interop.register(RESULT, org.gtk.gdk.ContentProvider.fromAddress).marshal(RESULT, null);
    OBJECT.takeOwnership();
    return OBJECT;
}

/**
 * Obtains a {@code tree_model} and {@code path} from value of target type
 * {@code GTK_TYPE_TREE_ROW_DATA}.
 * <p>
 * The returned path must be freed with gtk_tree_path_free().
 * @param value a {@code GValue}
 * @param treeModel a {@code GtkTreeModel}
 * @param path row in {@code tree_model}
 * @return {@code true} if {@code selection_data} had target type {@code GTK_TYPE_TREE_ROW_DATA}
 *  is otherwise valid
 */
public static boolean treeGetRowDragData(org.gtk.gobject.Value value, @Nullable Out<org.gtk.gtk.TreeModel> treeModel, @Nullable Out<org.gtk.gtk.TreePath> path) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemorySegment treeModelPOINTER = SCOPE.allocate(Interop.valueLayout.ADDRESS);
        MemorySegment pathPOINTER = SCOPE.allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_tree_get_row_drag_data.invokeExact(
                    value.handle(),
                    (Addressable) (treeModel == null ? MemoryAddress.NULL : (Addressable) treeModelPOINTER.address()),
                    (Addressable) (path == null ? MemoryAddress.NULL : (Addressable) pathPOINTER.address()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
                if (treeModel != null) treeModel.set((org.gtk.gtk.TreeModel) Interop.register(treeModelPOINTER.get(Interop.valueLayout.ADDRESS, 0), org.gtk.gtk.TreeModel.fromAddress).marshal(treeModelPOINTER.get(Interop.valueLayout.ADDRESS, 0), null));
                if (path != null) path.set(org.gtk.gtk.TreePath.fromAddress.marshal(pathPOINTER.get(Interop.valueLayout.ADDRESS, 0), null));
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
}

/**
 * Lets a set of row reference created by
 * gtk_tree_row_reference_new_proxy() know that the
 * model emitted the ::row-deleted signal.
 * @param proxy a {@code GObject}
 * @param path the path position that was deleted
 */
public static void treeRowReferenceDeleted(org.gtk.gobject.GObject proxy, org.gtk.gtk.TreePath path) {
    try {
        DowncallHandles.gtk_tree_row_reference_deleted.invokeExact(
                proxy.handle(),
                path.handle());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
}

/**
 * Lets a set of row reference created by
 * gtk_tree_row_reference_new_proxy() know that the
 * model emitted the ::row-inserted signal.
 * @param proxy a {@code GObject}
 * @param path the row position that was inserted
 */
public static void treeRowReferenceInserted(org.gtk.gobject.GObject proxy, org.gtk.gtk.TreePath path) {
    try {
        DowncallHandles.gtk_tree_row_reference_inserted.invokeExact(
                proxy.handle(),
                path.handle());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
}

/**
 * Lets a set of row reference created by
 * gtk_tree_row_reference_new_proxy() know that the
 * model emitted the ::rows-reordered signal.
 * @param proxy a {@code GObject}
 * @param path the parent path of the reordered signal
 * @param iter the iter pointing to the parent of the reordered
 * @param newOrder the new order of rows
 */
public static void treeRowReferenceReordered(org.gtk.gobject.GObject proxy, org.gtk.gtk.TreePath path, org.gtk.gtk.TreeIter iter, int[] newOrder) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        try {
            DowncallHandles.gtk_tree_row_reference_reordered.invokeExact(
                    proxy.handle(),
                    path.handle(),
                    iter.handle(),
                    Interop.allocateNativeArray(newOrder, false, SCOPE));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
}

/**
 * Retrieves the {@code GtkExpression} stored inside the given {@code value}, and acquires
 * a reference to it.
 * @param value a {@code GValue} initialized with type {@code GTK_TYPE_EXPRESSION}
 * @return a {@code GtkExpression}
 */
public static @Nullable org.gtk.gtk.Expression valueDupExpression(org.gtk.gobject.Value value) {
    MemoryAddress RESULT;
    try {
        RESULT = (MemoryAddress) DowncallHandles.gtk_value_dup_expression.invokeExact(value.handle());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    var OBJECT = (org.gtk.gtk.Expression) Interop.register(RESULT, org.gtk.gtk.Expression.fromAddress).marshal(RESULT, null);
    OBJECT.takeOwnership();
    return OBJECT;
}

/**
 * Retrieves the {@code GtkExpression} stored inside the given {@code value}.
 * @param value a {@code GValue} initialized with type {@code GTK_TYPE_EXPRESSION}
 * @return a {@code GtkExpression}
 */
public static @Nullable org.gtk.gtk.Expression valueGetExpression(org.gtk.gobject.Value value) {
    MemoryAddress RESULT;
    try {
        RESULT = (MemoryAddress) DowncallHandles.gtk_value_get_expression.invokeExact(value.handle());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return (org.gtk.gtk.Expression) Interop.register(RESULT, org.gtk.gtk.Expression.fromAddress).marshal(RESULT, null);
}

/**
 * Stores the given {@code GtkExpression} inside {@code value}.
 * <p>
 * The {@code GValue} will acquire a reference to the {@code expression}.
 * @param value a {@code GValue} initialized with type {@code GTK_TYPE_EXPRESSION}
 * @param expression a {@code GtkExpression}
 */
public static void valueSetExpression(org.gtk.gobject.Value value, org.gtk.gtk.Expression expression) {
    try {
        DowncallHandles.gtk_value_set_expression.invokeExact(
                value.handle(),
                expression.handle());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
}

/**
 * Stores the given {@code GtkExpression} inside {@code value}.
 * <p>
 * This function transfers the ownership of the {@code expression} to the {@code GValue}.
 * @param value a {@code GValue} initialized with type {@code GTK_TYPE_EXPRESSION}
 * @param expression a {@code GtkExpression}
 */
public static void valueTakeExpression(org.gtk.gobject.Value value, @Nullable org.gtk.gtk.Expression expression) {
    try {
        DowncallHandles.gtk_value_take_expression.invokeExact(
                value.handle(),
                (Addressable) (expression == null ? MemoryAddress.NULL : expression.handle()));
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    expression.yieldOwnership();
}
    
    private static class DowncallHandles {

private static final MethodHandle gtk_accelerator_get_default_mod_mask = Interop.downcallHandle(
        "gtk_accelerator_get_default_mod_mask",
        FunctionDescriptor.of(Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle gtk_accelerator_get_label = Interop.downcallHandle(
        "gtk_accelerator_get_label",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle gtk_accelerator_get_label_with_keycode = Interop.downcallHandle(
        "gtk_accelerator_get_label_with_keycode",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle gtk_accelerator_name = Interop.downcallHandle(
        "gtk_accelerator_name",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle gtk_accelerator_name_with_keycode = Interop.downcallHandle(
        "gtk_accelerator_name_with_keycode",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle gtk_accelerator_parse = Interop.downcallHandle(
        "gtk_accelerator_parse",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle gtk_accelerator_parse_with_keycode = Interop.downcallHandle(
        "gtk_accelerator_parse_with_keycode",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle gtk_accelerator_valid = Interop.downcallHandle(
        "gtk_accelerator_valid",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle gtk_accessible_property_init_value = Interop.downcallHandle(
        "gtk_accessible_property_init_value",
        FunctionDescriptor.ofVoid(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gtk_accessible_relation_init_value = Interop.downcallHandle(
        "gtk_accessible_relation_init_value",
        FunctionDescriptor.ofVoid(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gtk_accessible_state_init_value = Interop.downcallHandle(
        "gtk_accessible_state_init_value",
        FunctionDescriptor.ofVoid(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gtk_bitset_iter_init_at = Interop.downcallHandle(
        "gtk_bitset_iter_init_at",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gtk_bitset_iter_init_first = Interop.downcallHandle(
        "gtk_bitset_iter_init_first",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gtk_bitset_iter_init_last = Interop.downcallHandle(
        "gtk_bitset_iter_init_last",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gtk_builder_error_quark = Interop.downcallHandle(
        "gtk_builder_error_quark",
        FunctionDescriptor.of(Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle gtk_check_version = Interop.downcallHandle(
        "gtk_check_version",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle gtk_constraint_vfl_parser_error_quark = Interop.downcallHandle(
        "gtk_constraint_vfl_parser_error_quark",
        FunctionDescriptor.of(Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle gtk_css_parser_error_quark = Interop.downcallHandle(
        "gtk_css_parser_error_quark",
        FunctionDescriptor.of(Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle gtk_css_parser_warning_quark = Interop.downcallHandle(
        "gtk_css_parser_warning_quark",
        FunctionDescriptor.of(Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle gtk_disable_setlocale = Interop.downcallHandle(
        "gtk_disable_setlocale",
        FunctionDescriptor.ofVoid(),
        false
);

private static final MethodHandle gtk_distribute_natural_allocation = Interop.downcallHandle(
        "gtk_distribute_natural_allocation",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gtk_editable_delegate_get_property = Interop.downcallHandle(
        "gtk_editable_delegate_get_property",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gtk_editable_delegate_set_property = Interop.downcallHandle(
        "gtk_editable_delegate_set_property",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gtk_editable_install_properties = Interop.downcallHandle(
        "gtk_editable_install_properties",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle gtk_enumerate_printers = Interop.downcallHandle(
        "gtk_enumerate_printers",
        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle gtk_file_chooser_error_quark = Interop.downcallHandle(
        "gtk_file_chooser_error_quark",
        FunctionDescriptor.of(Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle gtk_get_binary_age = Interop.downcallHandle(
        "gtk_get_binary_age",
        FunctionDescriptor.of(Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle gtk_get_debug_flags = Interop.downcallHandle(
        "gtk_get_debug_flags",
        FunctionDescriptor.of(Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle gtk_get_default_language = Interop.downcallHandle(
        "gtk_get_default_language",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gtk_get_interface_age = Interop.downcallHandle(
        "gtk_get_interface_age",
        FunctionDescriptor.of(Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle gtk_get_locale_direction = Interop.downcallHandle(
        "gtk_get_locale_direction",
        FunctionDescriptor.of(Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle gtk_get_major_version = Interop.downcallHandle(
        "gtk_get_major_version",
        FunctionDescriptor.of(Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle gtk_get_micro_version = Interop.downcallHandle(
        "gtk_get_micro_version",
        FunctionDescriptor.of(Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle gtk_get_minor_version = Interop.downcallHandle(
        "gtk_get_minor_version",
        FunctionDescriptor.of(Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle gtk_hsv_to_rgb = Interop.downcallHandle(
        "gtk_hsv_to_rgb",
        FunctionDescriptor.ofVoid(Interop.valueLayout.C_FLOAT, Interop.valueLayout.C_FLOAT, Interop.valueLayout.C_FLOAT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gtk_icon_theme_error_quark = Interop.downcallHandle(
        "gtk_icon_theme_error_quark",
        FunctionDescriptor.of(Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle gtk_init = Interop.downcallHandle(
        "gtk_init",
        FunctionDescriptor.ofVoid(),
        false
);

private static final MethodHandle gtk_init_check = Interop.downcallHandle(
        "gtk_init_check",
        FunctionDescriptor.of(Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle gtk_is_initialized = Interop.downcallHandle(
        "gtk_is_initialized",
        FunctionDescriptor.of(Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle gtk_native_get_for_surface = Interop.downcallHandle(
        "gtk_native_get_for_surface",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gtk_ordering_from_cmpfunc = Interop.downcallHandle(
        "gtk_ordering_from_cmpfunc",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle gtk_paper_size_get_default = Interop.downcallHandle(
        "gtk_paper_size_get_default",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gtk_paper_size_get_paper_sizes = Interop.downcallHandle(
        "gtk_paper_size_get_paper_sizes",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle gtk_param_spec_expression = Interop.downcallHandle(
        "gtk_param_spec_expression",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle gtk_print_error_quark = Interop.downcallHandle(
        "gtk_print_error_quark",
        FunctionDescriptor.of(Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle gtk_print_run_page_setup_dialog = Interop.downcallHandle(
        "gtk_print_run_page_setup_dialog",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gtk_print_run_page_setup_dialog_async = Interop.downcallHandle(
        "gtk_print_run_page_setup_dialog_async",
        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gtk_recent_manager_error_quark = Interop.downcallHandle(
        "gtk_recent_manager_error_quark",
        FunctionDescriptor.of(Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle gtk_render_activity = Interop.downcallHandle(
        "gtk_render_activity",
        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.C_DOUBLE),
        false
);

private static final MethodHandle gtk_render_arrow = Interop.downcallHandle(
        "gtk_render_arrow",
        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.C_DOUBLE),
        false
);

private static final MethodHandle gtk_render_background = Interop.downcallHandle(
        "gtk_render_background",
        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.C_DOUBLE),
        false
);

private static final MethodHandle gtk_render_check = Interop.downcallHandle(
        "gtk_render_check",
        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.C_DOUBLE),
        false
);

private static final MethodHandle gtk_render_expander = Interop.downcallHandle(
        "gtk_render_expander",
        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.C_DOUBLE),
        false
);

private static final MethodHandle gtk_render_focus = Interop.downcallHandle(
        "gtk_render_focus",
        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.C_DOUBLE),
        false
);

private static final MethodHandle gtk_render_frame = Interop.downcallHandle(
        "gtk_render_frame",
        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.C_DOUBLE),
        false
);

private static final MethodHandle gtk_render_handle = Interop.downcallHandle(
        "gtk_render_handle",
        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.C_DOUBLE),
        false
);

private static final MethodHandle gtk_render_icon = Interop.downcallHandle(
        "gtk_render_icon",
        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.C_DOUBLE),
        false
);

private static final MethodHandle gtk_render_layout = Interop.downcallHandle(
        "gtk_render_layout",
        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gtk_render_line = Interop.downcallHandle(
        "gtk_render_line",
        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.C_DOUBLE),
        false
);

private static final MethodHandle gtk_render_option = Interop.downcallHandle(
        "gtk_render_option",
        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.C_DOUBLE),
        false
);

private static final MethodHandle gtk_rgb_to_hsv = Interop.downcallHandle(
        "gtk_rgb_to_hsv",
        FunctionDescriptor.ofVoid(Interop.valueLayout.C_FLOAT, Interop.valueLayout.C_FLOAT, Interop.valueLayout.C_FLOAT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gtk_set_debug_flags = Interop.downcallHandle(
        "gtk_set_debug_flags",
        FunctionDescriptor.ofVoid(Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle gtk_show_about_dialog = Interop.downcallHandle(
        "gtk_show_about_dialog",
        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        true
);

private static final MethodHandle gtk_show_uri = Interop.downcallHandle(
        "gtk_show_uri",
        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle gtk_show_uri_full = Interop.downcallHandle(
        "gtk_show_uri_full",
        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gtk_show_uri_full_finish = Interop.downcallHandle(
        "gtk_show_uri_full_finish",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gtk_test_accessible_assertion_message_role = Interop.downcallHandle(
        "gtk_test_accessible_assertion_message_role",
        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle gtk_test_accessible_check_property = Interop.downcallHandle(
        "gtk_test_accessible_check_property",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
        true
);

private static final MethodHandle gtk_test_accessible_check_relation = Interop.downcallHandle(
        "gtk_test_accessible_check_relation",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
        true
);

private static final MethodHandle gtk_test_accessible_check_state = Interop.downcallHandle(
        "gtk_test_accessible_check_state",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
        true
);

private static final MethodHandle gtk_test_accessible_has_property = Interop.downcallHandle(
        "gtk_test_accessible_has_property",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle gtk_test_accessible_has_relation = Interop.downcallHandle(
        "gtk_test_accessible_has_relation",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle gtk_test_accessible_has_role = Interop.downcallHandle(
        "gtk_test_accessible_has_role",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle gtk_test_accessible_has_state = Interop.downcallHandle(
        "gtk_test_accessible_has_state",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle gtk_test_init = Interop.downcallHandle(
        "gtk_test_init",
        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        true
);

private static final MethodHandle gtk_test_list_all_types = Interop.downcallHandle(
        "gtk_test_list_all_types",
        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gtk_test_register_all_types = Interop.downcallHandle(
        "gtk_test_register_all_types",
        FunctionDescriptor.ofVoid(),
        false
);

private static final MethodHandle gtk_test_widget_wait_for_draw = Interop.downcallHandle(
        "gtk_test_widget_wait_for_draw",
        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gtk_tree_create_row_drag_content = Interop.downcallHandle(
        "gtk_tree_create_row_drag_content",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gtk_tree_get_row_drag_data = Interop.downcallHandle(
        "gtk_tree_get_row_drag_data",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gtk_tree_row_reference_deleted = Interop.downcallHandle(
        "gtk_tree_row_reference_deleted",
        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gtk_tree_row_reference_inserted = Interop.downcallHandle(
        "gtk_tree_row_reference_inserted",
        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gtk_tree_row_reference_reordered = Interop.downcallHandle(
        "gtk_tree_row_reference_reordered",
        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gtk_value_dup_expression = Interop.downcallHandle(
        "gtk_value_dup_expression",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gtk_value_get_expression = Interop.downcallHandle(
        "gtk_value_get_expression",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gtk_value_set_expression = Interop.downcallHandle(
        "gtk_value_set_expression",
        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gtk_value_take_expression = Interop.downcallHandle(
        "gtk_value_take_expression",
        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);
    }
    
    @ApiStatus.Internal
    public static class Callbacks {
    }
    
    private static void registerTypes() {
        if (ATContext.isAvailable()) Interop.register(ATContext.getType(), ATContext.fromAddress);
        if (AboutDialog.isAvailable()) Interop.register(AboutDialog.getType(), AboutDialog.fromAddress);
        if (ActionBar.isAvailable()) Interop.register(ActionBar.getType(), ActionBar.fromAddress);
        if (ActivateAction.isAvailable()) Interop.register(ActivateAction.getType(), ActivateAction.fromAddress);
        if (Adjustment.isAvailable()) Interop.register(Adjustment.getType(), Adjustment.fromAddress);
        if (AlternativeTrigger.isAvailable()) Interop.register(AlternativeTrigger.getType(), AlternativeTrigger.fromAddress);
        if (AnyFilter.isAvailable()) Interop.register(AnyFilter.getType(), AnyFilter.fromAddress);
        if (AppChooserButton.isAvailable()) Interop.register(AppChooserButton.getType(), AppChooserButton.fromAddress);
        if (AppChooserDialog.isAvailable()) Interop.register(AppChooserDialog.getType(), AppChooserDialog.fromAddress);
        if (AppChooserWidget.isAvailable()) Interop.register(AppChooserWidget.getType(), AppChooserWidget.fromAddress);
        if (Application.isAvailable()) Interop.register(Application.getType(), Application.fromAddress);
        if (ApplicationWindow.isAvailable()) Interop.register(ApplicationWindow.getType(), ApplicationWindow.fromAddress);
        if (AspectFrame.isAvailable()) Interop.register(AspectFrame.getType(), AspectFrame.fromAddress);
        if (Assistant.isAvailable()) Interop.register(Assistant.getType(), Assistant.fromAddress);
        if (AssistantPage.isAvailable()) Interop.register(AssistantPage.getType(), AssistantPage.fromAddress);
        if (BinLayout.isAvailable()) Interop.register(BinLayout.getType(), BinLayout.fromAddress);
        if (BookmarkList.isAvailable()) Interop.register(BookmarkList.getType(), BookmarkList.fromAddress);
        if (BoolFilter.isAvailable()) Interop.register(BoolFilter.getType(), BoolFilter.fromAddress);
        if (Box.isAvailable()) Interop.register(Box.getType(), Box.fromAddress);
        if (BoxLayout.isAvailable()) Interop.register(BoxLayout.getType(), BoxLayout.fromAddress);
        if (GtkBuilder.isAvailable()) Interop.register(GtkBuilder.getType(), GtkBuilder.fromAddress);
        if (BuilderCScope.isAvailable()) Interop.register(BuilderCScope.getType(), BuilderCScope.fromAddress);
        if (BuilderListItemFactory.isAvailable()) Interop.register(BuilderListItemFactory.getType(), BuilderListItemFactory.fromAddress);
        if (Button.isAvailable()) Interop.register(Button.getType(), Button.fromAddress);
        if (CClosureExpression.isAvailable()) Interop.register(CClosureExpression.getType(), CClosureExpression.fromAddress);
        if (Calendar.isAvailable()) Interop.register(Calendar.getType(), Calendar.fromAddress);
        if (CallbackAction.isAvailable()) Interop.register(CallbackAction.getType(), CallbackAction.fromAddress);
        if (CellArea.isAvailable()) Interop.register(CellArea.getType(), CellArea.fromAddress);
        if (CellAreaBox.isAvailable()) Interop.register(CellAreaBox.getType(), CellAreaBox.fromAddress);
        if (CellAreaContext.isAvailable()) Interop.register(CellAreaContext.getType(), CellAreaContext.fromAddress);
        if (CellRenderer.isAvailable()) Interop.register(CellRenderer.getType(), CellRenderer.fromAddress);
        if (CellRendererAccel.isAvailable()) Interop.register(CellRendererAccel.getType(), CellRendererAccel.fromAddress);
        if (CellRendererCombo.isAvailable()) Interop.register(CellRendererCombo.getType(), CellRendererCombo.fromAddress);
        if (CellRendererPixbuf.isAvailable()) Interop.register(CellRendererPixbuf.getType(), CellRendererPixbuf.fromAddress);
        if (CellRendererProgress.isAvailable()) Interop.register(CellRendererProgress.getType(), CellRendererProgress.fromAddress);
        if (CellRendererSpin.isAvailable()) Interop.register(CellRendererSpin.getType(), CellRendererSpin.fromAddress);
        if (CellRendererSpinner.isAvailable()) Interop.register(CellRendererSpinner.getType(), CellRendererSpinner.fromAddress);
        if (CellRendererText.isAvailable()) Interop.register(CellRendererText.getType(), CellRendererText.fromAddress);
        if (CellRendererToggle.isAvailable()) Interop.register(CellRendererToggle.getType(), CellRendererToggle.fromAddress);
        if (CellView.isAvailable()) Interop.register(CellView.getType(), CellView.fromAddress);
        if (CenterBox.isAvailable()) Interop.register(CenterBox.getType(), CenterBox.fromAddress);
        if (CenterLayout.isAvailable()) Interop.register(CenterLayout.getType(), CenterLayout.fromAddress);
        if (CheckButton.isAvailable()) Interop.register(CheckButton.getType(), CheckButton.fromAddress);
        if (ClosureExpression.isAvailable()) Interop.register(ClosureExpression.getType(), ClosureExpression.fromAddress);
        if (ColorButton.isAvailable()) Interop.register(ColorButton.getType(), ColorButton.fromAddress);
        if (ColorChooserDialog.isAvailable()) Interop.register(ColorChooserDialog.getType(), ColorChooserDialog.fromAddress);
        if (ColorChooserWidget.isAvailable()) Interop.register(ColorChooserWidget.getType(), ColorChooserWidget.fromAddress);
        if (ColumnView.isAvailable()) Interop.register(ColumnView.getType(), ColumnView.fromAddress);
        if (ColumnViewColumn.isAvailable()) Interop.register(ColumnViewColumn.getType(), ColumnViewColumn.fromAddress);
        if (ComboBox.isAvailable()) Interop.register(ComboBox.getType(), ComboBox.fromAddress);
        if (ComboBoxText.isAvailable()) Interop.register(ComboBoxText.getType(), ComboBoxText.fromAddress);
        if (ConstantExpression.isAvailable()) Interop.register(ConstantExpression.getType(), ConstantExpression.fromAddress);
        if (Constraint.isAvailable()) Interop.register(Constraint.getType(), Constraint.fromAddress);
        if (ConstraintGuide.isAvailable()) Interop.register(ConstraintGuide.getType(), ConstraintGuide.fromAddress);
        if (ConstraintLayout.isAvailable()) Interop.register(ConstraintLayout.getType(), ConstraintLayout.fromAddress);
        if (ConstraintLayoutChild.isAvailable()) Interop.register(ConstraintLayoutChild.getType(), ConstraintLayoutChild.fromAddress);
        if (CssProvider.isAvailable()) Interop.register(CssProvider.getType(), CssProvider.fromAddress);
        if (CustomFilter.isAvailable()) Interop.register(CustomFilter.getType(), CustomFilter.fromAddress);
        if (CustomLayout.isAvailable()) Interop.register(CustomLayout.getType(), CustomLayout.fromAddress);
        if (CustomSorter.isAvailable()) Interop.register(CustomSorter.getType(), CustomSorter.fromAddress);
        if (Dialog.isAvailable()) Interop.register(Dialog.getType(), Dialog.fromAddress);
        if (DirectoryList.isAvailable()) Interop.register(DirectoryList.getType(), DirectoryList.fromAddress);
        if (DragIcon.isAvailable()) Interop.register(DragIcon.getType(), DragIcon.fromAddress);
        if (DragSource.isAvailable()) Interop.register(DragSource.getType(), DragSource.fromAddress);
        if (DrawingArea.isAvailable()) Interop.register(DrawingArea.getType(), DrawingArea.fromAddress);
        if (DropControllerMotion.isAvailable()) Interop.register(DropControllerMotion.getType(), DropControllerMotion.fromAddress);
        if (DropDown.isAvailable()) Interop.register(DropDown.getType(), DropDown.fromAddress);
        if (DropTarget.isAvailable()) Interop.register(DropTarget.getType(), DropTarget.fromAddress);
        if (DropTargetAsync.isAvailable()) Interop.register(DropTargetAsync.getType(), DropTargetAsync.fromAddress);
        if (EditableLabel.isAvailable()) Interop.register(EditableLabel.getType(), EditableLabel.fromAddress);
        if (EmojiChooser.isAvailable()) Interop.register(EmojiChooser.getType(), EmojiChooser.fromAddress);
        if (Entry.isAvailable()) Interop.register(Entry.getType(), Entry.fromAddress);
        if (EntryBuffer.isAvailable()) Interop.register(EntryBuffer.getType(), EntryBuffer.fromAddress);
        if (EntryCompletion.isAvailable()) Interop.register(EntryCompletion.getType(), EntryCompletion.fromAddress);
        if (EventController.isAvailable()) Interop.register(EventController.getType(), EventController.fromAddress);
        if (EventControllerFocus.isAvailable()) Interop.register(EventControllerFocus.getType(), EventControllerFocus.fromAddress);
        if (EventControllerKey.isAvailable()) Interop.register(EventControllerKey.getType(), EventControllerKey.fromAddress);
        if (EventControllerLegacy.isAvailable()) Interop.register(EventControllerLegacy.getType(), EventControllerLegacy.fromAddress);
        if (EventControllerMotion.isAvailable()) Interop.register(EventControllerMotion.getType(), EventControllerMotion.fromAddress);
        if (EventControllerScroll.isAvailable()) Interop.register(EventControllerScroll.getType(), EventControllerScroll.fromAddress);
        if (EveryFilter.isAvailable()) Interop.register(EveryFilter.getType(), EveryFilter.fromAddress);
        if (Expander.isAvailable()) Interop.register(Expander.getType(), Expander.fromAddress);
        if (Expression.isAvailable()) Interop.register(Expression.getType(), Expression.fromAddress);
        if (FileChooserDialog.isAvailable()) Interop.register(FileChooserDialog.getType(), FileChooserDialog.fromAddress);
        if (FileChooserNative.isAvailable()) Interop.register(FileChooserNative.getType(), FileChooserNative.fromAddress);
        if (FileChooserWidget.isAvailable()) Interop.register(FileChooserWidget.getType(), FileChooserWidget.fromAddress);
        if (FileFilter.isAvailable()) Interop.register(FileFilter.getType(), FileFilter.fromAddress);
        if (Filter.isAvailable()) Interop.register(Filter.getType(), Filter.fromAddress);
        if (FilterListModel.isAvailable()) Interop.register(FilterListModel.getType(), FilterListModel.fromAddress);
        if (Fixed.isAvailable()) Interop.register(Fixed.getType(), Fixed.fromAddress);
        if (FixedLayout.isAvailable()) Interop.register(FixedLayout.getType(), FixedLayout.fromAddress);
        if (FixedLayoutChild.isAvailable()) Interop.register(FixedLayoutChild.getType(), FixedLayoutChild.fromAddress);
        if (FlattenListModel.isAvailable()) Interop.register(FlattenListModel.getType(), FlattenListModel.fromAddress);
        if (FlowBox.isAvailable()) Interop.register(FlowBox.getType(), FlowBox.fromAddress);
        if (FlowBoxChild.isAvailable()) Interop.register(FlowBoxChild.getType(), FlowBoxChild.fromAddress);
        if (FontButton.isAvailable()) Interop.register(FontButton.getType(), FontButton.fromAddress);
        if (FontChooserDialog.isAvailable()) Interop.register(FontChooserDialog.getType(), FontChooserDialog.fromAddress);
        if (FontChooserWidget.isAvailable()) Interop.register(FontChooserWidget.getType(), FontChooserWidget.fromAddress);
        if (Frame.isAvailable()) Interop.register(Frame.getType(), Frame.fromAddress);
        if (GLArea.isAvailable()) Interop.register(GLArea.getType(), GLArea.fromAddress);
        if (Gesture.isAvailable()) Interop.register(Gesture.getType(), Gesture.fromAddress);
        if (GestureClick.isAvailable()) Interop.register(GestureClick.getType(), GestureClick.fromAddress);
        if (GestureDrag.isAvailable()) Interop.register(GestureDrag.getType(), GestureDrag.fromAddress);
        if (GestureLongPress.isAvailable()) Interop.register(GestureLongPress.getType(), GestureLongPress.fromAddress);
        if (GesturePan.isAvailable()) Interop.register(GesturePan.getType(), GesturePan.fromAddress);
        if (GestureRotate.isAvailable()) Interop.register(GestureRotate.getType(), GestureRotate.fromAddress);
        if (GestureSingle.isAvailable()) Interop.register(GestureSingle.getType(), GestureSingle.fromAddress);
        if (GestureStylus.isAvailable()) Interop.register(GestureStylus.getType(), GestureStylus.fromAddress);
        if (GestureSwipe.isAvailable()) Interop.register(GestureSwipe.getType(), GestureSwipe.fromAddress);
        if (GestureZoom.isAvailable()) Interop.register(GestureZoom.getType(), GestureZoom.fromAddress);
        if (Grid.isAvailable()) Interop.register(Grid.getType(), Grid.fromAddress);
        if (GridLayout.isAvailable()) Interop.register(GridLayout.getType(), GridLayout.fromAddress);
        if (GridLayoutChild.isAvailable()) Interop.register(GridLayoutChild.getType(), GridLayoutChild.fromAddress);
        if (GridView.isAvailable()) Interop.register(GridView.getType(), GridView.fromAddress);
        if (HeaderBar.isAvailable()) Interop.register(HeaderBar.getType(), HeaderBar.fromAddress);
        if (IMContext.isAvailable()) Interop.register(IMContext.getType(), IMContext.fromAddress);
        if (IMContextSimple.isAvailable()) Interop.register(IMContextSimple.getType(), IMContextSimple.fromAddress);
        if (IMMulticontext.isAvailable()) Interop.register(IMMulticontext.getType(), IMMulticontext.fromAddress);
        if (IconPaintable.isAvailable()) Interop.register(IconPaintable.getType(), IconPaintable.fromAddress);
        if (IconTheme.isAvailable()) Interop.register(IconTheme.getType(), IconTheme.fromAddress);
        if (IconView.isAvailable()) Interop.register(IconView.getType(), IconView.fromAddress);
        if (Image.isAvailable()) Interop.register(Image.getType(), Image.fromAddress);
        if (InfoBar.isAvailable()) Interop.register(InfoBar.getType(), InfoBar.fromAddress);
        if (Inscription.isAvailable()) Interop.register(Inscription.getType(), Inscription.fromAddress);
        if (KeyvalTrigger.isAvailable()) Interop.register(KeyvalTrigger.getType(), KeyvalTrigger.fromAddress);
        if (Label.isAvailable()) Interop.register(Label.getType(), Label.fromAddress);
        if (LayoutChild.isAvailable()) Interop.register(LayoutChild.getType(), LayoutChild.fromAddress);
        if (LayoutManager.isAvailable()) Interop.register(LayoutManager.getType(), LayoutManager.fromAddress);
        if (LevelBar.isAvailable()) Interop.register(LevelBar.getType(), LevelBar.fromAddress);
        if (LinkButton.isAvailable()) Interop.register(LinkButton.getType(), LinkButton.fromAddress);
        if (ListBase.isAvailable()) Interop.register(ListBase.getType(), ListBase.fromAddress);
        if (ListBox.isAvailable()) Interop.register(ListBox.getType(), ListBox.fromAddress);
        if (ListBoxRow.isAvailable()) Interop.register(ListBoxRow.getType(), ListBoxRow.fromAddress);
        if (ListItem.isAvailable()) Interop.register(ListItem.getType(), ListItem.fromAddress);
        if (ListItemFactory.isAvailable()) Interop.register(ListItemFactory.getType(), ListItemFactory.fromAddress);
        if (ListStore.isAvailable()) Interop.register(ListStore.getType(), ListStore.fromAddress);
        if (ListView.isAvailable()) Interop.register(ListView.getType(), ListView.fromAddress);
        if (LockButton.isAvailable()) Interop.register(LockButton.getType(), LockButton.fromAddress);
        if (MapListModel.isAvailable()) Interop.register(MapListModel.getType(), MapListModel.fromAddress);
        if (MediaControls.isAvailable()) Interop.register(MediaControls.getType(), MediaControls.fromAddress);
        if (MediaFile.isAvailable()) Interop.register(MediaFile.getType(), MediaFile.fromAddress);
        if (MediaStream.isAvailable()) Interop.register(MediaStream.getType(), MediaStream.fromAddress);
        if (MenuButton.isAvailable()) Interop.register(MenuButton.getType(), MenuButton.fromAddress);
        if (MessageDialog.isAvailable()) Interop.register(MessageDialog.getType(), MessageDialog.fromAddress);
        if (MnemonicAction.isAvailable()) Interop.register(MnemonicAction.getType(), MnemonicAction.fromAddress);
        if (MnemonicTrigger.isAvailable()) Interop.register(MnemonicTrigger.getType(), MnemonicTrigger.fromAddress);
        if (MountOperation.isAvailable()) Interop.register(MountOperation.getType(), MountOperation.fromAddress);
        if (MultiFilter.isAvailable()) Interop.register(MultiFilter.getType(), MultiFilter.fromAddress);
        if (MultiSelection.isAvailable()) Interop.register(MultiSelection.getType(), MultiSelection.fromAddress);
        if (MultiSorter.isAvailable()) Interop.register(MultiSorter.getType(), MultiSorter.fromAddress);
        if (NamedAction.isAvailable()) Interop.register(NamedAction.getType(), NamedAction.fromAddress);
        if (NativeDialog.isAvailable()) Interop.register(NativeDialog.getType(), NativeDialog.fromAddress);
        if (NeverTrigger.isAvailable()) Interop.register(NeverTrigger.getType(), NeverTrigger.fromAddress);
        if (NoSelection.isAvailable()) Interop.register(NoSelection.getType(), NoSelection.fromAddress);
        if (Notebook.isAvailable()) Interop.register(Notebook.getType(), Notebook.fromAddress);
        if (NotebookPage.isAvailable()) Interop.register(NotebookPage.getType(), NotebookPage.fromAddress);
        if (NothingAction.isAvailable()) Interop.register(NothingAction.getType(), NothingAction.fromAddress);
        if (NumericSorter.isAvailable()) Interop.register(NumericSorter.getType(), NumericSorter.fromAddress);
        if (ObjectExpression.isAvailable()) Interop.register(ObjectExpression.getType(), ObjectExpression.fromAddress);
        if (Overlay.isAvailable()) Interop.register(Overlay.getType(), Overlay.fromAddress);
        if (OverlayLayout.isAvailable()) Interop.register(OverlayLayout.getType(), OverlayLayout.fromAddress);
        if (OverlayLayoutChild.isAvailable()) Interop.register(OverlayLayoutChild.getType(), OverlayLayoutChild.fromAddress);
        if (PadController.isAvailable()) Interop.register(PadController.getType(), PadController.fromAddress);
        if (PageSetup.isAvailable()) Interop.register(PageSetup.getType(), PageSetup.fromAddress);
        if (PageSetupUnixDialog.isAvailable()) Interop.register(PageSetupUnixDialog.getType(), PageSetupUnixDialog.fromAddress);
        if (Paned.isAvailable()) Interop.register(Paned.getType(), Paned.fromAddress);
        if (ParamSpecExpression.isAvailable()) Interop.register(ParamSpecExpression.getType(), ParamSpecExpression.fromAddress);
        if (PasswordEntry.isAvailable()) Interop.register(PasswordEntry.getType(), PasswordEntry.fromAddress);
        if (PasswordEntryBuffer.isAvailable()) Interop.register(PasswordEntryBuffer.getType(), PasswordEntryBuffer.fromAddress);
        if (Picture.isAvailable()) Interop.register(Picture.getType(), Picture.fromAddress);
        if (Popover.isAvailable()) Interop.register(Popover.getType(), Popover.fromAddress);
        if (PopoverMenu.isAvailable()) Interop.register(PopoverMenu.getType(), PopoverMenu.fromAddress);
        if (PopoverMenuBar.isAvailable()) Interop.register(PopoverMenuBar.getType(), PopoverMenuBar.fromAddress);
        if (PrintContext.isAvailable()) Interop.register(PrintContext.getType(), PrintContext.fromAddress);
        if (PrintJob.isAvailable()) Interop.register(PrintJob.getType(), PrintJob.fromAddress);
        if (PrintOperation.isAvailable()) Interop.register(PrintOperation.getType(), PrintOperation.fromAddress);
        if (PrintSettings.isAvailable()) Interop.register(PrintSettings.getType(), PrintSettings.fromAddress);
        if (PrintUnixDialog.isAvailable()) Interop.register(PrintUnixDialog.getType(), PrintUnixDialog.fromAddress);
        if (Printer.isAvailable()) Interop.register(Printer.getType(), Printer.fromAddress);
        if (ProgressBar.isAvailable()) Interop.register(ProgressBar.getType(), ProgressBar.fromAddress);
        if (PropertyExpression.isAvailable()) Interop.register(PropertyExpression.getType(), PropertyExpression.fromAddress);
        if (Range.isAvailable()) Interop.register(Range.getType(), Range.fromAddress);
        if (RecentManager.isAvailable()) Interop.register(RecentManager.getType(), RecentManager.fromAddress);
        if (Revealer.isAvailable()) Interop.register(Revealer.getType(), Revealer.fromAddress);
        if (Scale.isAvailable()) Interop.register(Scale.getType(), Scale.fromAddress);
        if (ScaleButton.isAvailable()) Interop.register(ScaleButton.getType(), ScaleButton.fromAddress);
        if (Scrollbar.isAvailable()) Interop.register(Scrollbar.getType(), Scrollbar.fromAddress);
        if (ScrolledWindow.isAvailable()) Interop.register(ScrolledWindow.getType(), ScrolledWindow.fromAddress);
        if (SearchBar.isAvailable()) Interop.register(SearchBar.getType(), SearchBar.fromAddress);
        if (SearchEntry.isAvailable()) Interop.register(SearchEntry.getType(), SearchEntry.fromAddress);
        if (SelectionFilterModel.isAvailable()) Interop.register(SelectionFilterModel.getType(), SelectionFilterModel.fromAddress);
        if (Separator.isAvailable()) Interop.register(Separator.getType(), Separator.fromAddress);
        if (Settings.isAvailable()) Interop.register(Settings.getType(), Settings.fromAddress);
        if (Shortcut.isAvailable()) Interop.register(Shortcut.getType(), Shortcut.fromAddress);
        if (ShortcutAction.isAvailable()) Interop.register(ShortcutAction.getType(), ShortcutAction.fromAddress);
        if (ShortcutController.isAvailable()) Interop.register(ShortcutController.getType(), ShortcutController.fromAddress);
        if (ShortcutLabel.isAvailable()) Interop.register(ShortcutLabel.getType(), ShortcutLabel.fromAddress);
        if (ShortcutTrigger.isAvailable()) Interop.register(ShortcutTrigger.getType(), ShortcutTrigger.fromAddress);
        if (ShortcutsGroup.isAvailable()) Interop.register(ShortcutsGroup.getType(), ShortcutsGroup.fromAddress);
        if (ShortcutsSection.isAvailable()) Interop.register(ShortcutsSection.getType(), ShortcutsSection.fromAddress);
        if (ShortcutsShortcut.isAvailable()) Interop.register(ShortcutsShortcut.getType(), ShortcutsShortcut.fromAddress);
        if (ShortcutsWindow.isAvailable()) Interop.register(ShortcutsWindow.getType(), ShortcutsWindow.fromAddress);
        if (SignalAction.isAvailable()) Interop.register(SignalAction.getType(), SignalAction.fromAddress);
        if (SignalListItemFactory.isAvailable()) Interop.register(SignalListItemFactory.getType(), SignalListItemFactory.fromAddress);
        if (SingleSelection.isAvailable()) Interop.register(SingleSelection.getType(), SingleSelection.fromAddress);
        if (SizeGroup.isAvailable()) Interop.register(SizeGroup.getType(), SizeGroup.fromAddress);
        if (SliceListModel.isAvailable()) Interop.register(SliceListModel.getType(), SliceListModel.fromAddress);
        if (Snapshot.isAvailable()) Interop.register(Snapshot.getType(), Snapshot.fromAddress);
        if (SortListModel.isAvailable()) Interop.register(SortListModel.getType(), SortListModel.fromAddress);
        if (Sorter.isAvailable()) Interop.register(Sorter.getType(), Sorter.fromAddress);
        if (SpinButton.isAvailable()) Interop.register(SpinButton.getType(), SpinButton.fromAddress);
        if (Spinner.isAvailable()) Interop.register(Spinner.getType(), Spinner.fromAddress);
        if (Stack.isAvailable()) Interop.register(Stack.getType(), Stack.fromAddress);
        if (StackPage.isAvailable()) Interop.register(StackPage.getType(), StackPage.fromAddress);
        if (StackSidebar.isAvailable()) Interop.register(StackSidebar.getType(), StackSidebar.fromAddress);
        if (StackSwitcher.isAvailable()) Interop.register(StackSwitcher.getType(), StackSwitcher.fromAddress);
        if (Statusbar.isAvailable()) Interop.register(Statusbar.getType(), Statusbar.fromAddress);
        if (StringFilter.isAvailable()) Interop.register(StringFilter.getType(), StringFilter.fromAddress);
        if (StringList.isAvailable()) Interop.register(StringList.getType(), StringList.fromAddress);
        if (StringObject.isAvailable()) Interop.register(StringObject.getType(), StringObject.fromAddress);
        if (StringSorter.isAvailable()) Interop.register(StringSorter.getType(), StringSorter.fromAddress);
        if (StyleContext.isAvailable()) Interop.register(StyleContext.getType(), StyleContext.fromAddress);
        if (Switch.isAvailable()) Interop.register(Switch.getType(), Switch.fromAddress);
        if (Text.isAvailable()) Interop.register(Text.getType(), Text.fromAddress);
        if (TextBuffer.isAvailable()) Interop.register(TextBuffer.getType(), TextBuffer.fromAddress);
        if (TextChildAnchor.isAvailable()) Interop.register(TextChildAnchor.getType(), TextChildAnchor.fromAddress);
        if (TextMark.isAvailable()) Interop.register(TextMark.getType(), TextMark.fromAddress);
        if (TextTag.isAvailable()) Interop.register(TextTag.getType(), TextTag.fromAddress);
        if (TextTagTable.isAvailable()) Interop.register(TextTagTable.getType(), TextTagTable.fromAddress);
        if (TextView.isAvailable()) Interop.register(TextView.getType(), TextView.fromAddress);
        if (ToggleButton.isAvailable()) Interop.register(ToggleButton.getType(), ToggleButton.fromAddress);
        if (Tooltip.isAvailable()) Interop.register(Tooltip.getType(), Tooltip.fromAddress);
        if (TreeExpander.isAvailable()) Interop.register(TreeExpander.getType(), TreeExpander.fromAddress);
        if (TreeListModel.isAvailable()) Interop.register(TreeListModel.getType(), TreeListModel.fromAddress);
        if (TreeListRow.isAvailable()) Interop.register(TreeListRow.getType(), TreeListRow.fromAddress);
        if (TreeListRowSorter.isAvailable()) Interop.register(TreeListRowSorter.getType(), TreeListRowSorter.fromAddress);
        if (TreeModelFilter.isAvailable()) Interop.register(TreeModelFilter.getType(), TreeModelFilter.fromAddress);
        if (TreeModelSort.isAvailable()) Interop.register(TreeModelSort.getType(), TreeModelSort.fromAddress);
        if (TreeSelection.isAvailable()) Interop.register(TreeSelection.getType(), TreeSelection.fromAddress);
        if (TreeStore.isAvailable()) Interop.register(TreeStore.getType(), TreeStore.fromAddress);
        if (TreeView.isAvailable()) Interop.register(TreeView.getType(), TreeView.fromAddress);
        if (TreeViewColumn.isAvailable()) Interop.register(TreeViewColumn.getType(), TreeViewColumn.fromAddress);
        if (Video.isAvailable()) Interop.register(Video.getType(), Video.fromAddress);
        if (Viewport.isAvailable()) Interop.register(Viewport.getType(), Viewport.fromAddress);
        if (VolumeButton.isAvailable()) Interop.register(VolumeButton.getType(), VolumeButton.fromAddress);
        if (Widget.isAvailable()) Interop.register(Widget.getType(), Widget.fromAddress);
        if (WidgetPaintable.isAvailable()) Interop.register(WidgetPaintable.getType(), WidgetPaintable.fromAddress);
        if (Window.isAvailable()) Interop.register(Window.getType(), Window.fromAddress);
        if (WindowControls.isAvailable()) Interop.register(WindowControls.getType(), WindowControls.fromAddress);
        if (WindowGroup.isAvailable()) Interop.register(WindowGroup.getType(), WindowGroup.fromAddress);
        if (WindowHandle.isAvailable()) Interop.register(WindowHandle.getType(), WindowHandle.fromAddress);
        if (Accessible.isAvailable()) Interop.register(Accessible.getType(), Accessible.fromAddress);
        if (Actionable.isAvailable()) Interop.register(Actionable.getType(), Actionable.fromAddress);
        if (AppChooser.isAvailable()) Interop.register(AppChooser.getType(), AppChooser.fromAddress);
        if (Buildable.isAvailable()) Interop.register(Buildable.getType(), Buildable.fromAddress);
        if (BuilderScope.isAvailable()) Interop.register(BuilderScope.getType(), BuilderScope.fromAddress);
        if (CellEditable.isAvailable()) Interop.register(CellEditable.getType(), CellEditable.fromAddress);
        if (CellLayout.isAvailable()) Interop.register(CellLayout.getType(), CellLayout.fromAddress);
        if (ColorChooser.isAvailable()) Interop.register(ColorChooser.getType(), ColorChooser.fromAddress);
        if (ConstraintTarget.isAvailable()) Interop.register(ConstraintTarget.getType(), ConstraintTarget.fromAddress);
        if (Editable.isAvailable()) Interop.register(Editable.getType(), Editable.fromAddress);
        if (FileChooser.isAvailable()) Interop.register(FileChooser.getType(), FileChooser.fromAddress);
        if (FontChooser.isAvailable()) Interop.register(FontChooser.getType(), FontChooser.fromAddress);
        if (Native.isAvailable()) Interop.register(Native.getType(), Native.fromAddress);
        if (Orientable.isAvailable()) Interop.register(Orientable.getType(), Orientable.fromAddress);
        if (PrintOperationPreview.isAvailable()) Interop.register(PrintOperationPreview.getType(), PrintOperationPreview.fromAddress);
        if (Root.isAvailable()) Interop.register(Root.getType(), Root.fromAddress);
        if (Scrollable.isAvailable()) Interop.register(Scrollable.getType(), Scrollable.fromAddress);
        if (SelectionModel.isAvailable()) Interop.register(SelectionModel.getType(), SelectionModel.fromAddress);
        if (ShortcutManager.isAvailable()) Interop.register(ShortcutManager.getType(), ShortcutManager.fromAddress);
        if (StyleProvider.isAvailable()) Interop.register(StyleProvider.getType(), StyleProvider.fromAddress);
        if (SymbolicPaintable.isAvailable()) Interop.register(SymbolicPaintable.getType(), SymbolicPaintable.fromAddress);
        if (TreeDragDest.isAvailable()) Interop.register(TreeDragDest.getType(), TreeDragDest.fromAddress);
        if (TreeDragSource.isAvailable()) Interop.register(TreeDragSource.getType(), TreeDragSource.fromAddress);
        if (TreeModel.isAvailable()) Interop.register(TreeModel.getType(), TreeModel.fromAddress);
        if (TreeSortable.isAvailable()) Interop.register(TreeSortable.getType(), TreeSortable.fromAddress);
    }
}
