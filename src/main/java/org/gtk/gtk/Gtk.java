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
        System.loadLibrary("gtk-4");
    }
    
    @ApiStatus.Internal static void javagi$ensureInitialized() {}
    
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
    public static final int BINARY_AGE = 608;
    
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
    public static final int INTERFACE_AGE = 8;
    
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
    public static final int MICRO_VERSION = 8;
    
    /**
     * Like {@link Gtk#getMinorVersion}, but from the headers used at
     * application compile time, rather than from the library linked
     * against at application run time.
     */
    public static final int MINOR_VERSION = 6;
    
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
    public static @NotNull org.gtk.gdk.ModifierType acceleratorGetDefaultModMask() {
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
    public static @NotNull java.lang.String acceleratorGetLabel(int acceleratorKey, @NotNull org.gtk.gdk.ModifierType acceleratorMods) {
        java.util.Objects.requireNonNull(acceleratorMods, "Parameter 'acceleratorMods' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_accelerator_get_label.invokeExact(
                    acceleratorKey,
                    acceleratorMods.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
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
    public static @NotNull java.lang.String acceleratorGetLabelWithKeycode(@Nullable org.gtk.gdk.Display display, int acceleratorKey, int keycode, @NotNull org.gtk.gdk.ModifierType acceleratorMods) {
        java.util.Objects.requireNonNull(acceleratorMods, "Parameter 'acceleratorMods' must not be null");
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
        return Interop.getStringFrom(RESULT);
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
    public static @NotNull java.lang.String acceleratorName(int acceleratorKey, @NotNull org.gtk.gdk.ModifierType acceleratorMods) {
        java.util.Objects.requireNonNull(acceleratorMods, "Parameter 'acceleratorMods' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_accelerator_name.invokeExact(
                    acceleratorKey,
                    acceleratorMods.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
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
    public static @NotNull java.lang.String acceleratorNameWithKeycode(@Nullable org.gtk.gdk.Display display, int acceleratorKey, int keycode, @NotNull org.gtk.gdk.ModifierType acceleratorMods) {
        java.util.Objects.requireNonNull(acceleratorMods, "Parameter 'acceleratorMods' must not be null");
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
        return Interop.getStringFrom(RESULT);
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
    public static boolean acceleratorParse(@NotNull java.lang.String accelerator, Out<Integer> acceleratorKey, @NotNull Out<org.gtk.gdk.ModifierType> acceleratorMods) {
        java.util.Objects.requireNonNull(accelerator, "Parameter 'accelerator' must not be null");
        java.util.Objects.requireNonNull(acceleratorKey, "Parameter 'acceleratorKey' must not be null");
        java.util.Objects.requireNonNull(acceleratorMods, "Parameter 'acceleratorMods' must not be null");
        MemorySegment acceleratorKeyPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_INT);
        MemorySegment acceleratorModsPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_INT);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_accelerator_parse.invokeExact(
                    Interop.allocateNativeString(accelerator),
                    (Addressable) acceleratorKeyPOINTER.address(),
                    (Addressable) acceleratorModsPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        acceleratorKey.set(acceleratorKeyPOINTER.get(ValueLayout.JAVA_INT, 0));
        acceleratorMods.set(new org.gtk.gdk.ModifierType(acceleratorModsPOINTER.get(ValueLayout.JAVA_INT, 0)));
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
     * @param accelerator string representing an accelerator
     * @param display the {@code GdkDisplay} to look up {@code accelerator_codes} in
     * @param acceleratorKey return location for accelerator keyval
     * @param acceleratorCodes return location for accelerator keycodes
     * @param acceleratorMods return location for accelerator
     *   modifier mask
     * @return {@code true} if parsing succeeded
     */
    public static boolean acceleratorParseWithKeycode(@NotNull java.lang.String accelerator, @Nullable org.gtk.gdk.Display display, Out<Integer> acceleratorKey, @NotNull Out<int[]> acceleratorCodes, @NotNull Out<org.gtk.gdk.ModifierType> acceleratorMods) {
        throw new UnsupportedOperationException("Operation not supported yet");
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
    public static boolean acceleratorValid(int keyval, @NotNull org.gtk.gdk.ModifierType modifiers) {
        java.util.Objects.requireNonNull(modifiers, "Parameter 'modifiers' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_accelerator_valid.invokeExact(
                    keyval,
                    modifiers.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    public static void accessiblePropertyInitValue(@NotNull org.gtk.gtk.AccessibleProperty property, @NotNull org.gtk.gobject.Value value) {
        java.util.Objects.requireNonNull(property, "Parameter 'property' must not be null");
        java.util.Objects.requireNonNull(value, "Parameter 'value' must not be null");
        try {
            DowncallHandles.gtk_accessible_property_init_value.invokeExact(
                    property.getValue(),
                    value.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    public static void accessibleRelationInitValue(@NotNull org.gtk.gtk.AccessibleRelation relation, @NotNull org.gtk.gobject.Value value) {
        java.util.Objects.requireNonNull(relation, "Parameter 'relation' must not be null");
        java.util.Objects.requireNonNull(value, "Parameter 'value' must not be null");
        try {
            DowncallHandles.gtk_accessible_relation_init_value.invokeExact(
                    relation.getValue(),
                    value.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    public static void accessibleStateInitValue(@NotNull org.gtk.gtk.AccessibleState state, @NotNull org.gtk.gobject.Value value) {
        java.util.Objects.requireNonNull(state, "Parameter 'state' must not be null");
        java.util.Objects.requireNonNull(value, "Parameter 'value' must not be null");
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
    public static boolean bitsetIterInitAt(@NotNull org.gtk.gtk.BitsetIter iter, @NotNull org.gtk.gtk.Bitset set, int target, Out<Integer> value) {
        java.util.Objects.requireNonNull(iter, "Parameter 'iter' must not be null");
        java.util.Objects.requireNonNull(set, "Parameter 'set' must not be null");
        java.util.Objects.requireNonNull(value, "Parameter 'value' must not be null");
        MemorySegment valuePOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_INT);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_bitset_iter_init_at.invokeExact(
                    iter.handle(),
                    set.handle(),
                    target,
                    (Addressable) valuePOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        value.set(valuePOINTER.get(ValueLayout.JAVA_INT, 0));
        return RESULT != 0;
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
    public static boolean bitsetIterInitFirst(@NotNull org.gtk.gtk.BitsetIter iter, @NotNull org.gtk.gtk.Bitset set, Out<Integer> value) {
        java.util.Objects.requireNonNull(iter, "Parameter 'iter' must not be null");
        java.util.Objects.requireNonNull(set, "Parameter 'set' must not be null");
        java.util.Objects.requireNonNull(value, "Parameter 'value' must not be null");
        MemorySegment valuePOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_INT);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_bitset_iter_init_first.invokeExact(
                    iter.handle(),
                    set.handle(),
                    (Addressable) valuePOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        value.set(valuePOINTER.get(ValueLayout.JAVA_INT, 0));
        return RESULT != 0;
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
    public static boolean bitsetIterInitLast(@NotNull org.gtk.gtk.BitsetIter iter, @NotNull org.gtk.gtk.Bitset set, Out<Integer> value) {
        java.util.Objects.requireNonNull(iter, "Parameter 'iter' must not be null");
        java.util.Objects.requireNonNull(set, "Parameter 'set' must not be null");
        java.util.Objects.requireNonNull(value, "Parameter 'value' must not be null");
        MemorySegment valuePOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_INT);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_bitset_iter_init_last.invokeExact(
                    iter.handle(),
                    set.handle(),
                    (Addressable) valuePOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        value.set(valuePOINTER.get(ValueLayout.JAVA_INT, 0));
        return RESULT != 0;
    }
    
    public static @NotNull org.gtk.glib.Quark builderErrorQuark() {
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
        return Interop.getStringFrom(RESULT);
    }
    
    public static @NotNull org.gtk.glib.Quark constraintVflParserErrorQuark() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_constraint_vfl_parser_error_quark.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Quark(RESULT);
    }
    
    public static @NotNull org.gtk.glib.Quark cssParserErrorQuark() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_css_parser_error_quark.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Quark(RESULT);
    }
    
    public static @NotNull org.gtk.glib.Quark cssParserWarningQuark() {
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
    public static int distributeNaturalAllocation(int extraSpace, int nRequestedSizes, @NotNull org.gtk.gtk.RequestedSize[] sizes) {
        java.util.Objects.requireNonNull(sizes, "Parameter 'sizes' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_distribute_natural_allocation.invokeExact(
                    extraSpace,
                    nRequestedSizes,
                    Interop.allocateNativeArray(sizes, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
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
    public static boolean editableDelegateGetProperty(@NotNull org.gtk.gobject.Object object, int propId, @NotNull org.gtk.gobject.Value value, @NotNull org.gtk.gobject.ParamSpec pspec) {
        java.util.Objects.requireNonNull(object, "Parameter 'object' must not be null");
        java.util.Objects.requireNonNull(value, "Parameter 'value' must not be null");
        java.util.Objects.requireNonNull(pspec, "Parameter 'pspec' must not be null");
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
        return RESULT != 0;
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
    public static boolean editableDelegateSetProperty(@NotNull org.gtk.gobject.Object object, int propId, @NotNull org.gtk.gobject.Value value, @NotNull org.gtk.gobject.ParamSpec pspec) {
        java.util.Objects.requireNonNull(object, "Parameter 'object' must not be null");
        java.util.Objects.requireNonNull(value, "Parameter 'value' must not be null");
        java.util.Objects.requireNonNull(pspec, "Parameter 'pspec' must not be null");
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
     * functions, you can either use {@link Editable#delegateSetProperty}
     * and {@link Editable#delegateGetProperty} (if you are using
     * a delegate), or remember the {@code first_prop} offset and add it to the
     * values in the {@code Gtk.EditableProperties} enumeration to get the
     * property IDs for these properties.
     * @param objectClass a {@code GObjectClass}
     * @param firstProp property ID to use for the first property
     * @return the number of properties that were installed
     */
    public static int editableInstallProperties(@NotNull org.gtk.gobject.ObjectClass objectClass, int firstProp) {
        java.util.Objects.requireNonNull(objectClass, "Parameter 'objectClass' must not be null");
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
     * @param wait if {@code true}, wait in a recursive mainloop until
     *    all printers are enumerated; otherwise return early
     */
    public static void enumeratePrinters(@NotNull org.gtk.gtk.PrinterFunc func, boolean wait) {
        java.util.Objects.requireNonNull(func, "Parameter 'func' must not be null");
        try {
            DowncallHandles.gtk_enumerate_printers.invokeExact(
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gtk.Callbacks.class, "cbPrinterFunc",
                            MethodType.methodType(int.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()),
                    (Addressable) (Interop.registerCallback(func)),
                    Interop.cbDestroyNotifySymbol(),
                    wait ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Registers an error quark for {@code GtkFileChooser} errors.
     * @return The error quark used for {@code GtkFileChooser} errors.
     */
    public static @NotNull org.gtk.glib.Quark fileChooserErrorQuark() {
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
    public static @NotNull org.gtk.gtk.DebugFlags getDebugFlags() {
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
    public static @NotNull org.pango.Language getDefaultLanguage() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_get_default_language.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.pango.Language(RESULT, Ownership.NONE);
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
    public static @NotNull org.gtk.gtk.TextDirection getLocaleDirection() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_get_locale_direction.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.TextDirection(RESULT);
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
        java.util.Objects.requireNonNull(r, "Parameter 'r' must not be null");
        java.util.Objects.requireNonNull(g, "Parameter 'g' must not be null");
        java.util.Objects.requireNonNull(b, "Parameter 'b' must not be null");
        MemorySegment rPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_FLOAT);
        MemorySegment gPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_FLOAT);
        MemorySegment bPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_FLOAT);
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
        r.set(rPOINTER.get(ValueLayout.JAVA_FLOAT, 0));
        g.set(gPOINTER.get(ValueLayout.JAVA_FLOAT, 0));
        b.set(bPOINTER.get(ValueLayout.JAVA_FLOAT, 0));
    }
    
    public static @NotNull org.gtk.glib.Quark iconThemeErrorQuark() {
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
        return RESULT != 0;
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
        return RESULT != 0;
    }
    
    /**
     * Finds the {@code GtkNative} associated with the surface.
     * @param surface a {@code GdkSurface}
     * @return the {@code GtkNative} that is associated with {@code surface}
     */
    public static @Nullable org.gtk.gtk.Native nativeGetForSurface(@NotNull org.gtk.gdk.Surface surface) {
        java.util.Objects.requireNonNull(surface, "Parameter 'surface' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_native_get_for_surface.invokeExact(
                    surface.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.Native.NativeImpl(RESULT, Ownership.NONE);
    }
    
    /**
     * Converts the result of a {@code GCompareFunc} like strcmp() to a
     * {@code GtkOrdering} value.
     * @param cmpfuncResult Result of a comparison function
     * @return the corresponding {@code GtkOrdering}
     */
    public static @NotNull org.gtk.gtk.Ordering orderingFromCmpfunc(int cmpfuncResult) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_ordering_from_cmpfunc.invokeExact(
                    cmpfuncResult);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.Ordering(RESULT);
    }
    
    /**
     * Returns the name of the default paper size, which
     * depends on the current locale.
     * @return the name of the default paper size. The string
     * is owned by GTK and should not be modified.
     */
    public static @NotNull java.lang.String paperSizeGetDefault() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_paper_size_get_default.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Creates a list of known paper sizes.
     * @param includeCustom whether to include custom paper sizes
     *   as defined in the page setup dialog
     * @return a newly allocated list of newly
     *    allocated {@code GtkPaperSize} objects
     */
    public static @NotNull org.gtk.glib.List paperSizeGetPaperSizes(boolean includeCustom) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_paper_size_get_paper_sizes.invokeExact(
                    includeCustom ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.List(RESULT, Ownership.FULL);
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
    public static @NotNull org.gtk.gobject.ParamSpec paramSpecExpression(@NotNull java.lang.String name, @NotNull java.lang.String nick, @NotNull java.lang.String blurb, @NotNull org.gtk.gobject.ParamFlags flags) {
        java.util.Objects.requireNonNull(name, "Parameter 'name' must not be null");
        java.util.Objects.requireNonNull(nick, "Parameter 'nick' must not be null");
        java.util.Objects.requireNonNull(blurb, "Parameter 'blurb' must not be null");
        java.util.Objects.requireNonNull(flags, "Parameter 'flags' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_param_spec_expression.invokeExact(
                    Interop.allocateNativeString(name),
                    Interop.allocateNativeString(nick),
                    Interop.allocateNativeString(blurb),
                    flags.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gobject.ParamSpec(RESULT, Ownership.FULL);
    }
    
    /**
     * Registers an error quark for {@code GtkPrintOperation} if necessary.
     * @return The error quark used for {@code GtkPrintOperation} errors.
     */
    public static @NotNull org.gtk.glib.Quark printErrorQuark() {
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
    public static @NotNull org.gtk.gtk.PageSetup printRunPageSetupDialog(@Nullable org.gtk.gtk.Window parent, @Nullable org.gtk.gtk.PageSetup pageSetup, @NotNull org.gtk.gtk.PrintSettings settings) {
        java.util.Objects.requireNonNull(settings, "Parameter 'settings' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_print_run_page_setup_dialog.invokeExact(
                    (Addressable) (parent == null ? MemoryAddress.NULL : parent.handle()),
                    (Addressable) (pageSetup == null ? MemoryAddress.NULL : pageSetup.handle()),
                    settings.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.PageSetup(RESULT, Ownership.FULL);
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
    public static void printRunPageSetupDialogAsync(@Nullable org.gtk.gtk.Window parent, @Nullable org.gtk.gtk.PageSetup pageSetup, @NotNull org.gtk.gtk.PrintSettings settings, @NotNull org.gtk.gtk.PageSetupDoneFunc doneCb) {
        java.util.Objects.requireNonNull(settings, "Parameter 'settings' must not be null");
        java.util.Objects.requireNonNull(doneCb, "Parameter 'doneCb' must not be null");
        try {
            DowncallHandles.gtk_print_run_page_setup_dialog_async.invokeExact(
                    (Addressable) (parent == null ? MemoryAddress.NULL : parent.handle()),
                    (Addressable) (pageSetup == null ? MemoryAddress.NULL : pageSetup.handle()),
                    settings.handle(),
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gtk.Callbacks.class, "cbPageSetupDoneFunc",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()),
                    (Addressable) (Interop.registerCallback(doneCb)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    public static @NotNull org.gtk.glib.Quark recentManagerErrorQuark() {
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
    public static void renderActivity(@NotNull org.gtk.gtk.StyleContext context, @NotNull org.cairographics.Context cr, double x, double y, double width, double height) {
        java.util.Objects.requireNonNull(context, "Parameter 'context' must not be null");
        java.util.Objects.requireNonNull(cr, "Parameter 'cr' must not be null");
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
    public static void renderArrow(@NotNull org.gtk.gtk.StyleContext context, @NotNull org.cairographics.Context cr, double angle, double x, double y, double size) {
        java.util.Objects.requireNonNull(context, "Parameter 'context' must not be null");
        java.util.Objects.requireNonNull(cr, "Parameter 'cr' must not be null");
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
    public static void renderBackground(@NotNull org.gtk.gtk.StyleContext context, @NotNull org.cairographics.Context cr, double x, double y, double width, double height) {
        java.util.Objects.requireNonNull(context, "Parameter 'context' must not be null");
        java.util.Objects.requireNonNull(cr, "Parameter 'cr' must not be null");
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
    public static void renderCheck(@NotNull org.gtk.gtk.StyleContext context, @NotNull org.cairographics.Context cr, double x, double y, double width, double height) {
        java.util.Objects.requireNonNull(context, "Parameter 'context' must not be null");
        java.util.Objects.requireNonNull(cr, "Parameter 'cr' must not be null");
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
    public static void renderExpander(@NotNull org.gtk.gtk.StyleContext context, @NotNull org.cairographics.Context cr, double x, double y, double width, double height) {
        java.util.Objects.requireNonNull(context, "Parameter 'context' must not be null");
        java.util.Objects.requireNonNull(cr, "Parameter 'cr' must not be null");
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
    public static void renderFocus(@NotNull org.gtk.gtk.StyleContext context, @NotNull org.cairographics.Context cr, double x, double y, double width, double height) {
        java.util.Objects.requireNonNull(context, "Parameter 'context' must not be null");
        java.util.Objects.requireNonNull(cr, "Parameter 'cr' must not be null");
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
    public static void renderFrame(@NotNull org.gtk.gtk.StyleContext context, @NotNull org.cairographics.Context cr, double x, double y, double width, double height) {
        java.util.Objects.requireNonNull(context, "Parameter 'context' must not be null");
        java.util.Objects.requireNonNull(cr, "Parameter 'cr' must not be null");
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
    public static void renderHandle(@NotNull org.gtk.gtk.StyleContext context, @NotNull org.cairographics.Context cr, double x, double y, double width, double height) {
        java.util.Objects.requireNonNull(context, "Parameter 'context' must not be null");
        java.util.Objects.requireNonNull(cr, "Parameter 'cr' must not be null");
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
    public static void renderIcon(@NotNull org.gtk.gtk.StyleContext context, @NotNull org.cairographics.Context cr, @NotNull org.gtk.gdk.Texture texture, double x, double y) {
        java.util.Objects.requireNonNull(context, "Parameter 'context' must not be null");
        java.util.Objects.requireNonNull(cr, "Parameter 'cr' must not be null");
        java.util.Objects.requireNonNull(texture, "Parameter 'texture' must not be null");
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
    public static void renderLayout(@NotNull org.gtk.gtk.StyleContext context, @NotNull org.cairographics.Context cr, double x, double y, @NotNull org.pango.Layout layout) {
        java.util.Objects.requireNonNull(context, "Parameter 'context' must not be null");
        java.util.Objects.requireNonNull(cr, "Parameter 'cr' must not be null");
        java.util.Objects.requireNonNull(layout, "Parameter 'layout' must not be null");
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
    public static void renderLine(@NotNull org.gtk.gtk.StyleContext context, @NotNull org.cairographics.Context cr, double x0, double y0, double x1, double y1) {
        java.util.Objects.requireNonNull(context, "Parameter 'context' must not be null");
        java.util.Objects.requireNonNull(cr, "Parameter 'cr' must not be null");
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
    public static void renderOption(@NotNull org.gtk.gtk.StyleContext context, @NotNull org.cairographics.Context cr, double x, double y, double width, double height) {
        java.util.Objects.requireNonNull(context, "Parameter 'context' must not be null");
        java.util.Objects.requireNonNull(cr, "Parameter 'cr' must not be null");
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
        java.util.Objects.requireNonNull(h, "Parameter 'h' must not be null");
        java.util.Objects.requireNonNull(s, "Parameter 's' must not be null");
        java.util.Objects.requireNonNull(v, "Parameter 'v' must not be null");
        MemorySegment hPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_FLOAT);
        MemorySegment sPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_FLOAT);
        MemorySegment vPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_FLOAT);
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
        h.set(hPOINTER.get(ValueLayout.JAVA_FLOAT, 0));
        s.set(sPOINTER.get(ValueLayout.JAVA_FLOAT, 0));
        v.set(vPOINTER.get(ValueLayout.JAVA_FLOAT, 0));
    }
    
    /**
     * Sets the GTK debug flags.
     * @param flags the debug flags to set
     */
    public static void setDebugFlags(@NotNull org.gtk.gtk.DebugFlags flags) {
        java.util.Objects.requireNonNull(flags, "Parameter 'flags' must not be null");
        try {
            DowncallHandles.gtk_set_debug_flags.invokeExact(
                    flags.getValue());
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
    public static void showAboutDialog(@Nullable org.gtk.gtk.Window parent, @NotNull java.lang.String firstPropertyName, java.lang.Object... varargs) {
        java.util.Objects.requireNonNull(firstPropertyName, "Parameter 'firstPropertyName' must not be null");
        try {
            DowncallHandles.gtk_show_about_dialog.invokeExact(
                    (Addressable) (parent == null ? MemoryAddress.NULL : parent.handle()),
                    Interop.allocateNativeString(firstPropertyName),
                    varargs);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * This function launches the default application for showing
     * a given uri, or shows an error dialog if that fails.
     * @param parent parent window
     * @param uri the uri to show
     * @param timestamp timestamp from the event that triggered this call, or {@code GDK_CURRENT_TIME}
     */
    public static void showUri(@Nullable org.gtk.gtk.Window parent, @NotNull java.lang.String uri, int timestamp) {
        java.util.Objects.requireNonNull(uri, "Parameter 'uri' must not be null");
        try {
            DowncallHandles.gtk_show_uri.invokeExact(
                    (Addressable) (parent == null ? MemoryAddress.NULL : parent.handle()),
                    Interop.allocateNativeString(uri),
                    timestamp);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
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
    public static void showUriFull(@Nullable org.gtk.gtk.Window parent, @NotNull java.lang.String uri, int timestamp, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.AsyncReadyCallback callback) {
        java.util.Objects.requireNonNull(uri, "Parameter 'uri' must not be null");
        try {
            DowncallHandles.gtk_show_uri_full.invokeExact(
                    (Addressable) (parent == null ? MemoryAddress.NULL : parent.handle()),
                    Interop.allocateNativeString(uri),
                    timestamp,
                    (Addressable) (cancellable == null ? MemoryAddress.NULL : cancellable.handle()),
                    (Addressable) (callback == null ? MemoryAddress.NULL : (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gtk.Callbacks.class, "cbAsyncReadyCallback",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope())),
                    (Addressable) (callback == null ? MemoryAddress.NULL : Interop.registerCallback(callback)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
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
    public static boolean showUriFullFinish(@NotNull org.gtk.gtk.Window parent, @NotNull org.gtk.gio.AsyncResult result) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNull(parent, "Parameter 'parent' must not be null");
        java.util.Objects.requireNonNull(result, "Parameter 'result' must not be null");
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
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
        return RESULT != 0;
    }
    
    public static void testAccessibleAssertionMessageRole(@NotNull java.lang.String domain, @NotNull java.lang.String file, int line, @NotNull java.lang.String func, @NotNull java.lang.String expr, @NotNull org.gtk.gtk.Accessible accessible, @NotNull org.gtk.gtk.AccessibleRole expectedRole, @NotNull org.gtk.gtk.AccessibleRole actualRole) {
        java.util.Objects.requireNonNull(domain, "Parameter 'domain' must not be null");
        java.util.Objects.requireNonNull(file, "Parameter 'file' must not be null");
        java.util.Objects.requireNonNull(func, "Parameter 'func' must not be null");
        java.util.Objects.requireNonNull(expr, "Parameter 'expr' must not be null");
        java.util.Objects.requireNonNull(accessible, "Parameter 'accessible' must not be null");
        java.util.Objects.requireNonNull(expectedRole, "Parameter 'expectedRole' must not be null");
        java.util.Objects.requireNonNull(actualRole, "Parameter 'actualRole' must not be null");
        try {
            DowncallHandles.gtk_test_accessible_assertion_message_role.invokeExact(
                    Interop.allocateNativeString(domain),
                    Interop.allocateNativeString(file),
                    line,
                    Interop.allocateNativeString(func),
                    Interop.allocateNativeString(expr),
                    accessible.handle(),
                    expectedRole.getValue(),
                    actualRole.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
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
    public static @NotNull java.lang.String testAccessibleCheckProperty(@NotNull org.gtk.gtk.Accessible accessible, @NotNull org.gtk.gtk.AccessibleProperty property, java.lang.Object... varargs) {
        java.util.Objects.requireNonNull(accessible, "Parameter 'accessible' must not be null");
        java.util.Objects.requireNonNull(property, "Parameter 'property' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_test_accessible_check_property.invokeExact(
                    accessible.handle(),
                    property.getValue(),
                    varargs);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Checks whether the accessible {@code relation} of {@code accessible} is set to
     * a specific value.
     * @param accessible a {@code GtkAccessible}
     * @param relation a {@code GtkAccessibleRelation}
     * @param varargs the expected value of {@code relation}
     * @return the value of the accessible relation
     */
    public static @NotNull java.lang.String testAccessibleCheckRelation(@NotNull org.gtk.gtk.Accessible accessible, @NotNull org.gtk.gtk.AccessibleRelation relation, java.lang.Object... varargs) {
        java.util.Objects.requireNonNull(accessible, "Parameter 'accessible' must not be null");
        java.util.Objects.requireNonNull(relation, "Parameter 'relation' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_test_accessible_check_relation.invokeExact(
                    accessible.handle(),
                    relation.getValue(),
                    varargs);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Checks whether the accessible {@code state} of {@code accessible} is set to
     * a specific value.
     * @param accessible a {@code GtkAccessible}
     * @param state a {@code GtkAccessibleState}
     * @param varargs the expected value of {@code state}
     * @return the value of the accessible state
     */
    public static @NotNull java.lang.String testAccessibleCheckState(@NotNull org.gtk.gtk.Accessible accessible, @NotNull org.gtk.gtk.AccessibleState state, java.lang.Object... varargs) {
        java.util.Objects.requireNonNull(accessible, "Parameter 'accessible' must not be null");
        java.util.Objects.requireNonNull(state, "Parameter 'state' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_test_accessible_check_state.invokeExact(
                    accessible.handle(),
                    state.getValue(),
                    varargs);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Checks whether the {@code GtkAccessible} has {@code property} set.
     * @param accessible a {@code GtkAccessible}
     * @param property a {@code GtkAccessibleProperty}
     * @return {@code true} if the {@code property} is set in the {@code accessible}
     */
    public static boolean testAccessibleHasProperty(@NotNull org.gtk.gtk.Accessible accessible, @NotNull org.gtk.gtk.AccessibleProperty property) {
        java.util.Objects.requireNonNull(accessible, "Parameter 'accessible' must not be null");
        java.util.Objects.requireNonNull(property, "Parameter 'property' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_test_accessible_has_property.invokeExact(
                    accessible.handle(),
                    property.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Checks whether the {@code GtkAccessible} has {@code relation} set.
     * @param accessible a {@code GtkAccessible}
     * @param relation a {@code GtkAccessibleRelation}
     * @return {@code true} if the {@code relation} is set in the {@code accessible}
     */
    public static boolean testAccessibleHasRelation(@NotNull org.gtk.gtk.Accessible accessible, @NotNull org.gtk.gtk.AccessibleRelation relation) {
        java.util.Objects.requireNonNull(accessible, "Parameter 'accessible' must not be null");
        java.util.Objects.requireNonNull(relation, "Parameter 'relation' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_test_accessible_has_relation.invokeExact(
                    accessible.handle(),
                    relation.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Checks whether the {@code GtkAccessible:accessible-role} of the accessible
     * is {@code role}.
     * @param accessible a {@code GtkAccessible}
     * @param role a {@code GtkAccessibleRole}
     * @return {@code true} if the role matches
     */
    public static boolean testAccessibleHasRole(@NotNull org.gtk.gtk.Accessible accessible, @NotNull org.gtk.gtk.AccessibleRole role) {
        java.util.Objects.requireNonNull(accessible, "Parameter 'accessible' must not be null");
        java.util.Objects.requireNonNull(role, "Parameter 'role' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_test_accessible_has_role.invokeExact(
                    accessible.handle(),
                    role.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Checks whether the {@code GtkAccessible} has {@code state} set.
     * @param accessible a {@code GtkAccessible}
     * @param state a {@code GtkAccessibleState}
     * @return {@code true} if the {@code state} is set in the {@code accessible}
     */
    public static boolean testAccessibleHasState(@NotNull org.gtk.gtk.Accessible accessible, @NotNull org.gtk.gtk.AccessibleState state) {
        java.util.Objects.requireNonNull(accessible, "Parameter 'accessible' must not be null");
        java.util.Objects.requireNonNull(state, "Parameter 'state' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_test_accessible_has_state.invokeExact(
                    accessible.handle(),
                    state.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
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
    public static void testInit(Out<Integer> argcp, @NotNull Out<java.lang.String[]> argvp, java.lang.Object... varargs) {
        java.util.Objects.requireNonNull(argcp, "Parameter 'argcp' must not be null");
        java.util.Objects.requireNonNull(argvp, "Parameter 'argvp' must not be null");
        MemorySegment argcpPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_INT);
        MemorySegment argvpPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            DowncallHandles.gtk_test_init.invokeExact(
                    (Addressable) argcpPOINTER.address(),
                    (Addressable) argvpPOINTER.address(),
                    varargs);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        argcp.set(argcpPOINTER.get(ValueLayout.JAVA_INT, 0));
        java.lang.String[] argvpARRAY = new java.lang.String[argcp.get().intValue()];
        for (int I = 0; I < argcp.get().intValue(); I++) {
            var OBJ = argvpPOINTER.get(ValueLayout.ADDRESS, I);
            argvpARRAY[I] = Interop.getStringFrom(OBJ);
        }
        argvp.set(argvpARRAY);
    }
    
    /**
     * Return the type ids that have been registered after
     * calling gtk_test_register_all_types().
     * @param nTypes location to store number of types
     * @return 0-terminated array of type ids
     */
    public static @NotNull org.gtk.glib.Type[] testListAllTypes(Out<Integer> nTypes) {
        java.util.Objects.requireNonNull(nTypes, "Parameter 'nTypes' must not be null");
        MemorySegment nTypesPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_INT);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_test_list_all_types.invokeExact(
                    (Addressable) nTypesPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        nTypes.set(nTypesPOINTER.get(ValueLayout.JAVA_INT, 0));
        org.gtk.glib.Type[] resultARRAY = new org.gtk.glib.Type[nTypes.get().intValue()];
        for (int I = 0; I < nTypes.get().intValue(); I++) {
            var OBJ = RESULT.get(ValueLayout.JAVA_LONG, I);
            resultARRAY[I] = new org.gtk.glib.Type(OBJ);
        }
        return resultARRAY;
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
    public static void testWidgetWaitForDraw(@NotNull org.gtk.gtk.Widget widget) {
        java.util.Objects.requireNonNull(widget, "Parameter 'widget' must not be null");
        try {
            DowncallHandles.gtk_test_widget_wait_for_draw.invokeExact(
                    widget.handle());
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
    public static @NotNull org.gtk.gdk.ContentProvider treeCreateRowDragContent(@NotNull org.gtk.gtk.TreeModel treeModel, @NotNull org.gtk.gtk.TreePath path) {
        java.util.Objects.requireNonNull(treeModel, "Parameter 'treeModel' must not be null");
        java.util.Objects.requireNonNull(path, "Parameter 'path' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_tree_create_row_drag_content.invokeExact(
                    treeModel.handle(),
                    path.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gdk.ContentProvider(RESULT, Ownership.FULL);
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
    public static boolean treeGetRowDragData(@NotNull org.gtk.gobject.Value value, @Nullable PointerProxy<org.gtk.gtk.TreeModel> treeModel, @Nullable PointerProxy<org.gtk.gtk.TreePath> path) {
        java.util.Objects.requireNonNull(value, "Parameter 'value' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_tree_get_row_drag_data.invokeExact(
                    value.handle(),
                    (Addressable) (treeModel == null ? MemoryAddress.NULL : treeModel.handle()),
                    (Addressable) (path == null ? MemoryAddress.NULL : path.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Lets a set of row reference created by
     * gtk_tree_row_reference_new_proxy() know that the
     * model emitted the ::row-deleted signal.
     * @param proxy a {@code GObject}
     * @param path the path position that was deleted
     */
    public static void treeRowReferenceDeleted(@NotNull org.gtk.gobject.Object proxy, @NotNull org.gtk.gtk.TreePath path) {
        java.util.Objects.requireNonNull(proxy, "Parameter 'proxy' must not be null");
        java.util.Objects.requireNonNull(path, "Parameter 'path' must not be null");
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
    public static void treeRowReferenceInserted(@NotNull org.gtk.gobject.Object proxy, @NotNull org.gtk.gtk.TreePath path) {
        java.util.Objects.requireNonNull(proxy, "Parameter 'proxy' must not be null");
        java.util.Objects.requireNonNull(path, "Parameter 'path' must not be null");
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
    public static void treeRowReferenceReordered(@NotNull org.gtk.gobject.Object proxy, @NotNull org.gtk.gtk.TreePath path, @NotNull org.gtk.gtk.TreeIter iter, @NotNull int[] newOrder) {
        java.util.Objects.requireNonNull(proxy, "Parameter 'proxy' must not be null");
        java.util.Objects.requireNonNull(path, "Parameter 'path' must not be null");
        java.util.Objects.requireNonNull(iter, "Parameter 'iter' must not be null");
        java.util.Objects.requireNonNull(newOrder, "Parameter 'newOrder' must not be null");
        try {
            DowncallHandles.gtk_tree_row_reference_reordered.invokeExact(
                    proxy.handle(),
                    path.handle(),
                    iter.handle(),
                    Interop.allocateNativeArray(newOrder, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Retrieves the {@code GtkExpression} stored inside the given {@code value}, and acquires
     * a reference to it.
     * @param value a {@code GValue} initialized with type {@code GTK_TYPE_EXPRESSION}
     * @return a {@code GtkExpression}
     */
    public static @Nullable org.gtk.gtk.Expression valueDupExpression(@NotNull org.gtk.gobject.Value value) {
        java.util.Objects.requireNonNull(value, "Parameter 'value' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_value_dup_expression.invokeExact(
                    value.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.Expression(RESULT, Ownership.FULL);
    }
    
    /**
     * Retrieves the {@code GtkExpression} stored inside the given {@code value}.
     * @param value a {@code GValue} initialized with type {@code GTK_TYPE_EXPRESSION}
     * @return a {@code GtkExpression}
     */
    public static @Nullable org.gtk.gtk.Expression valueGetExpression(@NotNull org.gtk.gobject.Value value) {
        java.util.Objects.requireNonNull(value, "Parameter 'value' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_value_get_expression.invokeExact(
                    value.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.Expression(RESULT, Ownership.NONE);
    }
    
    /**
     * Stores the given {@code GtkExpression} inside {@code value}.
     * <p>
     * The {@code GValue} will acquire a reference to the {@code expression}.
     * @param value a {@code GValue} initialized with type {@code GTK_TYPE_EXPRESSION}
     * @param expression a {@code GtkExpression}
     */
    public static void valueSetExpression(@NotNull org.gtk.gobject.Value value, @NotNull org.gtk.gtk.Expression expression) {
        java.util.Objects.requireNonNull(value, "Parameter 'value' must not be null");
        java.util.Objects.requireNonNull(expression, "Parameter 'expression' must not be null");
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
    public static void valueTakeExpression(@NotNull org.gtk.gobject.Value value, @Nullable org.gtk.gtk.Expression expression) {
        java.util.Objects.requireNonNull(value, "Parameter 'value' must not be null");
        try {
            DowncallHandles.gtk_value_take_expression.invokeExact(
                    value.handle(),
                    (Addressable) (expression == null ? MemoryAddress.NULL : expression.refcounted().unowned().handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_accelerator_get_default_mod_mask = Interop.downcallHandle(
            "gtk_accelerator_get_default_mod_mask",
            FunctionDescriptor.of(ValueLayout.JAVA_INT),
            false
        );
        
        private static final MethodHandle gtk_accelerator_get_label = Interop.downcallHandle(
            "gtk_accelerator_get_label",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT),
            false
        );
        
        private static final MethodHandle gtk_accelerator_get_label_with_keycode = Interop.downcallHandle(
            "gtk_accelerator_get_label_with_keycode",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT),
            false
        );
        
        private static final MethodHandle gtk_accelerator_name = Interop.downcallHandle(
            "gtk_accelerator_name",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT),
            false
        );
        
        private static final MethodHandle gtk_accelerator_name_with_keycode = Interop.downcallHandle(
            "gtk_accelerator_name_with_keycode",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT),
            false
        );
        
        private static final MethodHandle gtk_accelerator_parse = Interop.downcallHandle(
            "gtk_accelerator_parse",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT),
            false
        );
        
        private static final MethodHandle gtk_accelerator_parse_with_keycode = Interop.downcallHandle(
            "gtk_accelerator_parse_with_keycode",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT),
            false
        );
        
        private static final MethodHandle gtk_accelerator_valid = Interop.downcallHandle(
            "gtk_accelerator_valid",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT),
            false
        );
        
        private static final MethodHandle gtk_accessible_property_init_value = Interop.downcallHandle(
            "gtk_accessible_property_init_value",
            FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_accessible_relation_init_value = Interop.downcallHandle(
            "gtk_accessible_relation_init_value",
            FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_accessible_state_init_value = Interop.downcallHandle(
            "gtk_accessible_state_init_value",
            FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_bitset_iter_init_at = Interop.downcallHandle(
            "gtk_bitset_iter_init_at",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_bitset_iter_init_first = Interop.downcallHandle(
            "gtk_bitset_iter_init_first",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_bitset_iter_init_last = Interop.downcallHandle(
            "gtk_bitset_iter_init_last",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_builder_error_quark = Interop.downcallHandle(
            "gtk_builder_error_quark",
            FunctionDescriptor.of(ValueLayout.JAVA_INT),
            false
        );
        
        private static final MethodHandle gtk_check_version = Interop.downcallHandle(
            "gtk_check_version",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT),
            false
        );
        
        private static final MethodHandle gtk_constraint_vfl_parser_error_quark = Interop.downcallHandle(
            "gtk_constraint_vfl_parser_error_quark",
            FunctionDescriptor.of(ValueLayout.JAVA_INT),
            false
        );
        
        private static final MethodHandle gtk_css_parser_error_quark = Interop.downcallHandle(
            "gtk_css_parser_error_quark",
            FunctionDescriptor.of(ValueLayout.JAVA_INT),
            false
        );
        
        private static final MethodHandle gtk_css_parser_warning_quark = Interop.downcallHandle(
            "gtk_css_parser_warning_quark",
            FunctionDescriptor.of(ValueLayout.JAVA_INT),
            false
        );
        
        private static final MethodHandle gtk_disable_setlocale = Interop.downcallHandle(
            "gtk_disable_setlocale",
            FunctionDescriptor.ofVoid(),
            false
        );
        
        private static final MethodHandle gtk_distribute_natural_allocation = Interop.downcallHandle(
            "gtk_distribute_natural_allocation",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_editable_delegate_get_property = Interop.downcallHandle(
            "gtk_editable_delegate_get_property",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_editable_delegate_set_property = Interop.downcallHandle(
            "gtk_editable_delegate_set_property",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_editable_install_properties = Interop.downcallHandle(
            "gtk_editable_install_properties",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT),
            false
        );
        
        private static final MethodHandle gtk_enumerate_printers = Interop.downcallHandle(
            "gtk_enumerate_printers",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT),
            false
        );
        
        private static final MethodHandle gtk_file_chooser_error_quark = Interop.downcallHandle(
            "gtk_file_chooser_error_quark",
            FunctionDescriptor.of(ValueLayout.JAVA_INT),
            false
        );
        
        private static final MethodHandle gtk_get_binary_age = Interop.downcallHandle(
            "gtk_get_binary_age",
            FunctionDescriptor.of(ValueLayout.JAVA_INT),
            false
        );
        
        private static final MethodHandle gtk_get_debug_flags = Interop.downcallHandle(
            "gtk_get_debug_flags",
            FunctionDescriptor.of(ValueLayout.JAVA_INT),
            false
        );
        
        private static final MethodHandle gtk_get_default_language = Interop.downcallHandle(
            "gtk_get_default_language",
            FunctionDescriptor.of(ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_get_interface_age = Interop.downcallHandle(
            "gtk_get_interface_age",
            FunctionDescriptor.of(ValueLayout.JAVA_INT),
            false
        );
        
        private static final MethodHandle gtk_get_locale_direction = Interop.downcallHandle(
            "gtk_get_locale_direction",
            FunctionDescriptor.of(ValueLayout.JAVA_INT),
            false
        );
        
        private static final MethodHandle gtk_get_major_version = Interop.downcallHandle(
            "gtk_get_major_version",
            FunctionDescriptor.of(ValueLayout.JAVA_INT),
            false
        );
        
        private static final MethodHandle gtk_get_micro_version = Interop.downcallHandle(
            "gtk_get_micro_version",
            FunctionDescriptor.of(ValueLayout.JAVA_INT),
            false
        );
        
        private static final MethodHandle gtk_get_minor_version = Interop.downcallHandle(
            "gtk_get_minor_version",
            FunctionDescriptor.of(ValueLayout.JAVA_INT),
            false
        );
        
        private static final MethodHandle gtk_hsv_to_rgb = Interop.downcallHandle(
            "gtk_hsv_to_rgb",
            FunctionDescriptor.ofVoid(ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_icon_theme_error_quark = Interop.downcallHandle(
            "gtk_icon_theme_error_quark",
            FunctionDescriptor.of(ValueLayout.JAVA_INT),
            false
        );
        
        private static final MethodHandle gtk_init = Interop.downcallHandle(
            "gtk_init",
            FunctionDescriptor.ofVoid(),
            false
        );
        
        private static final MethodHandle gtk_init_check = Interop.downcallHandle(
            "gtk_init_check",
            FunctionDescriptor.of(ValueLayout.JAVA_INT),
            false
        );
        
        private static final MethodHandle gtk_is_initialized = Interop.downcallHandle(
            "gtk_is_initialized",
            FunctionDescriptor.of(ValueLayout.JAVA_INT),
            false
        );
        
        private static final MethodHandle gtk_native_get_for_surface = Interop.downcallHandle(
            "gtk_native_get_for_surface",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_ordering_from_cmpfunc = Interop.downcallHandle(
            "gtk_ordering_from_cmpfunc",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT),
            false
        );
        
        private static final MethodHandle gtk_paper_size_get_default = Interop.downcallHandle(
            "gtk_paper_size_get_default",
            FunctionDescriptor.of(ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_paper_size_get_paper_sizes = Interop.downcallHandle(
            "gtk_paper_size_get_paper_sizes",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT),
            false
        );
        
        private static final MethodHandle gtk_param_spec_expression = Interop.downcallHandle(
            "gtk_param_spec_expression",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT),
            false
        );
        
        private static final MethodHandle gtk_print_error_quark = Interop.downcallHandle(
            "gtk_print_error_quark",
            FunctionDescriptor.of(ValueLayout.JAVA_INT),
            false
        );
        
        private static final MethodHandle gtk_print_run_page_setup_dialog = Interop.downcallHandle(
            "gtk_print_run_page_setup_dialog",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_print_run_page_setup_dialog_async = Interop.downcallHandle(
            "gtk_print_run_page_setup_dialog_async",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_recent_manager_error_quark = Interop.downcallHandle(
            "gtk_recent_manager_error_quark",
            FunctionDescriptor.of(ValueLayout.JAVA_INT),
            false
        );
        
        private static final MethodHandle gtk_render_activity = Interop.downcallHandle(
            "gtk_render_activity",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE),
            false
        );
        
        private static final MethodHandle gtk_render_arrow = Interop.downcallHandle(
            "gtk_render_arrow",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE),
            false
        );
        
        private static final MethodHandle gtk_render_background = Interop.downcallHandle(
            "gtk_render_background",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE),
            false
        );
        
        private static final MethodHandle gtk_render_check = Interop.downcallHandle(
            "gtk_render_check",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE),
            false
        );
        
        private static final MethodHandle gtk_render_expander = Interop.downcallHandle(
            "gtk_render_expander",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE),
            false
        );
        
        private static final MethodHandle gtk_render_focus = Interop.downcallHandle(
            "gtk_render_focus",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE),
            false
        );
        
        private static final MethodHandle gtk_render_frame = Interop.downcallHandle(
            "gtk_render_frame",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE),
            false
        );
        
        private static final MethodHandle gtk_render_handle = Interop.downcallHandle(
            "gtk_render_handle",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE),
            false
        );
        
        private static final MethodHandle gtk_render_icon = Interop.downcallHandle(
            "gtk_render_icon",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE),
            false
        );
        
        private static final MethodHandle gtk_render_layout = Interop.downcallHandle(
            "gtk_render_layout",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_render_line = Interop.downcallHandle(
            "gtk_render_line",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE),
            false
        );
        
        private static final MethodHandle gtk_render_option = Interop.downcallHandle(
            "gtk_render_option",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE),
            false
        );
        
        private static final MethodHandle gtk_rgb_to_hsv = Interop.downcallHandle(
            "gtk_rgb_to_hsv",
            FunctionDescriptor.ofVoid(ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_set_debug_flags = Interop.downcallHandle(
            "gtk_set_debug_flags",
            FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT),
            false
        );
        
        private static final MethodHandle gtk_show_about_dialog = Interop.downcallHandle(
            "gtk_show_about_dialog",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            true
        );
        
        private static final MethodHandle gtk_show_uri = Interop.downcallHandle(
            "gtk_show_uri",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT),
            false
        );
        
        private static final MethodHandle gtk_show_uri_full = Interop.downcallHandle(
            "gtk_show_uri_full",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_show_uri_full_finish = Interop.downcallHandle(
            "gtk_show_uri_full_finish",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_test_accessible_assertion_message_role = Interop.downcallHandle(
            "gtk_test_accessible_assertion_message_role",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT),
            false
        );
        
        private static final MethodHandle gtk_test_accessible_check_property = Interop.downcallHandle(
            "gtk_test_accessible_check_property",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT),
            true
        );
        
        private static final MethodHandle gtk_test_accessible_check_relation = Interop.downcallHandle(
            "gtk_test_accessible_check_relation",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT),
            true
        );
        
        private static final MethodHandle gtk_test_accessible_check_state = Interop.downcallHandle(
            "gtk_test_accessible_check_state",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT),
            true
        );
        
        private static final MethodHandle gtk_test_accessible_has_property = Interop.downcallHandle(
            "gtk_test_accessible_has_property",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT),
            false
        );
        
        private static final MethodHandle gtk_test_accessible_has_relation = Interop.downcallHandle(
            "gtk_test_accessible_has_relation",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT),
            false
        );
        
        private static final MethodHandle gtk_test_accessible_has_role = Interop.downcallHandle(
            "gtk_test_accessible_has_role",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT),
            false
        );
        
        private static final MethodHandle gtk_test_accessible_has_state = Interop.downcallHandle(
            "gtk_test_accessible_has_state",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT),
            false
        );
        
        private static final MethodHandle gtk_test_init = Interop.downcallHandle(
            "gtk_test_init",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            true
        );
        
        private static final MethodHandle gtk_test_list_all_types = Interop.downcallHandle(
            "gtk_test_list_all_types",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_test_register_all_types = Interop.downcallHandle(
            "gtk_test_register_all_types",
            FunctionDescriptor.ofVoid(),
            false
        );
        
        private static final MethodHandle gtk_test_widget_wait_for_draw = Interop.downcallHandle(
            "gtk_test_widget_wait_for_draw",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_tree_create_row_drag_content = Interop.downcallHandle(
            "gtk_tree_create_row_drag_content",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_tree_get_row_drag_data = Interop.downcallHandle(
            "gtk_tree_get_row_drag_data",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_tree_row_reference_deleted = Interop.downcallHandle(
            "gtk_tree_row_reference_deleted",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_tree_row_reference_inserted = Interop.downcallHandle(
            "gtk_tree_row_reference_inserted",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_tree_row_reference_reordered = Interop.downcallHandle(
            "gtk_tree_row_reference_reordered",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_value_dup_expression = Interop.downcallHandle(
            "gtk_value_dup_expression",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_value_get_expression = Interop.downcallHandle(
            "gtk_value_get_expression",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_value_set_expression = Interop.downcallHandle(
            "gtk_value_set_expression",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_value_take_expression = Interop.downcallHandle(
            "gtk_value_take_expression",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
    }
    
    @ApiStatus.Internal
    public static class Callbacks {
        
        public static int cbAssistantPageFunc(int currentPage, MemoryAddress data) {
            int HASH = data.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (AssistantPageFunc) Interop.signalRegistry.get(HASH);
            var RESULT = HANDLER.onAssistantPageFunc(currentPage);
            return RESULT;
        }
        
        public static boolean cbEntryCompletionMatchFunc(MemoryAddress completion, MemoryAddress key, MemoryAddress iter, MemoryAddress userData) {
            int HASH = userData.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (EntryCompletionMatchFunc) Interop.signalRegistry.get(HASH);
            var RESULT = HANDLER.onEntryCompletionMatchFunc(new org.gtk.gtk.EntryCompletion(completion, Ownership.NONE), Interop.getStringFrom(key), new org.gtk.gtk.TreeIter(iter, Ownership.NONE));
            return RESULT;
        }
        
        public static void cbMenuButtonCreatePopupFunc(MemoryAddress menuButton, MemoryAddress userData) {
            int HASH = userData.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (MenuButtonCreatePopupFunc) Interop.signalRegistry.get(HASH);
            HANDLER.onMenuButtonCreatePopupFunc(new org.gtk.gtk.MenuButton(menuButton, Ownership.NONE));
        }
        
        public static void cbExpressionNotify(MemoryAddress userData) {
            int HASH = userData.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (ExpressionNotify) Interop.signalRegistry.get(HASH);
            HANDLER.onExpressionNotify();
        }
        
        public static org.gtk.gtk.Widget cbFlowBoxCreateWidgetFunc(MemoryAddress item, MemoryAddress userData) {
            int HASH = userData.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (FlowBoxCreateWidgetFunc) Interop.signalRegistry.get(HASH);
            var RESULT = HANDLER.onFlowBoxCreateWidgetFunc(new org.gtk.gobject.Object(item, Ownership.NONE));
            return RESULT;
        }
        
        public static void cbFlowBoxForeachFunc(MemoryAddress box, MemoryAddress child, MemoryAddress userData) {
            int HASH = userData.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (FlowBoxForeachFunc) Interop.signalRegistry.get(HASH);
            HANDLER.onFlowBoxForeachFunc(new org.gtk.gtk.FlowBox(box, Ownership.NONE), new org.gtk.gtk.FlowBoxChild(child, Ownership.NONE));
        }
        
        public static java.lang.String cbScaleFormatValueFunc(MemoryAddress scale, double value, MemoryAddress userData) {
            int HASH = userData.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (ScaleFormatValueFunc) Interop.signalRegistry.get(HASH);
            var RESULT = HANDLER.onScaleFormatValueFunc(new org.gtk.gtk.Scale(scale, Ownership.NONE), value);
            return RESULT;
        }
        
        public static boolean cbCellCallback(MemoryAddress renderer, MemoryAddress data) {
            int HASH = data.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (CellCallback) Interop.signalRegistry.get(HASH);
            var RESULT = HANDLER.onCellCallback(new org.gtk.gtk.CellRenderer(renderer, Ownership.NONE));
            return RESULT;
        }
        
        public static boolean cbListBoxFilterFunc(MemoryAddress row, MemoryAddress userData) {
            int HASH = userData.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (ListBoxFilterFunc) Interop.signalRegistry.get(HASH);
            var RESULT = HANDLER.onListBoxFilterFunc(new org.gtk.gtk.ListBoxRow(row, Ownership.NONE));
            return RESULT;
        }
        
        public static int cbListBoxSortFunc(MemoryAddress row1, MemoryAddress row2, MemoryAddress userData) {
            int HASH = userData.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (ListBoxSortFunc) Interop.signalRegistry.get(HASH);
            var RESULT = HANDLER.onListBoxSortFunc(new org.gtk.gtk.ListBoxRow(row1, Ownership.NONE), new org.gtk.gtk.ListBoxRow(row2, Ownership.NONE));
            return RESULT;
        }
        
        public static void cbCellLayoutDataFunc(MemoryAddress cellLayout, MemoryAddress cell, MemoryAddress treeModel, MemoryAddress iter, MemoryAddress data) {
            int HASH = data.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (CellLayoutDataFunc) Interop.signalRegistry.get(HASH);
            HANDLER.onCellLayoutDataFunc(new org.gtk.gtk.CellLayout.CellLayoutImpl(cellLayout, Ownership.NONE), new org.gtk.gtk.CellRenderer(cell, Ownership.NONE), new org.gtk.gtk.TreeModel.TreeModelImpl(treeModel, Ownership.NONE), new org.gtk.gtk.TreeIter(iter, Ownership.NONE));
        }
        
        public static void cbListBoxForeachFunc(MemoryAddress box, MemoryAddress row, MemoryAddress userData) {
            int HASH = userData.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (ListBoxForeachFunc) Interop.signalRegistry.get(HASH);
            HANDLER.onListBoxForeachFunc(new org.gtk.gtk.ListBox(box, Ownership.NONE), new org.gtk.gtk.ListBoxRow(row, Ownership.NONE));
        }
        
        public static org.gtk.gtk.Widget cbListBoxCreateWidgetFunc(MemoryAddress item, MemoryAddress userData) {
            int HASH = userData.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (ListBoxCreateWidgetFunc) Interop.signalRegistry.get(HASH);
            var RESULT = HANDLER.onListBoxCreateWidgetFunc(new org.gtk.gobject.Object(item, Ownership.NONE));
            return RESULT;
        }
        
        public static void cbTreeViewMappingFunc(MemoryAddress treeView, MemoryAddress path, MemoryAddress userData) {
            int HASH = userData.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (TreeViewMappingFunc) Interop.signalRegistry.get(HASH);
            HANDLER.onTreeViewMappingFunc(new org.gtk.gtk.TreeView(treeView, Ownership.NONE), new org.gtk.gtk.TreePath(path, Ownership.NONE));
        }
        
        public static boolean cbTreeViewColumnDropFunc(MemoryAddress treeView, MemoryAddress column, MemoryAddress prevColumn, MemoryAddress nextColumn, MemoryAddress data) {
            int HASH = data.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (TreeViewColumnDropFunc) Interop.signalRegistry.get(HASH);
            var RESULT = HANDLER.onTreeViewColumnDropFunc(new org.gtk.gtk.TreeView(treeView, Ownership.NONE), new org.gtk.gtk.TreeViewColumn(column, Ownership.NONE), new org.gtk.gtk.TreeViewColumn(prevColumn, Ownership.NONE), new org.gtk.gtk.TreeViewColumn(nextColumn, Ownership.NONE));
            return RESULT;
        }
        
        public static void cbTreeSelectionForeachFunc(MemoryAddress model, MemoryAddress path, MemoryAddress iter, MemoryAddress data) {
            int HASH = data.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (TreeSelectionForeachFunc) Interop.signalRegistry.get(HASH);
            HANDLER.onTreeSelectionForeachFunc(new org.gtk.gtk.TreeModel.TreeModelImpl(model, Ownership.NONE), new org.gtk.gtk.TreePath(path, Ownership.NONE), new org.gtk.gtk.TreeIter(iter, Ownership.NONE));
        }
        
        public static int cbFlowBoxSortFunc(MemoryAddress child1, MemoryAddress child2, MemoryAddress userData) {
            int HASH = userData.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (FlowBoxSortFunc) Interop.signalRegistry.get(HASH);
            var RESULT = HANDLER.onFlowBoxSortFunc(new org.gtk.gtk.FlowBoxChild(child1, Ownership.NONE), new org.gtk.gtk.FlowBoxChild(child2, Ownership.NONE));
            return RESULT;
        }
        
        public static boolean cbFontFilterFunc(MemoryAddress family, MemoryAddress face, MemoryAddress data) {
            int HASH = data.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (FontFilterFunc) Interop.signalRegistry.get(HASH);
            var RESULT = HANDLER.onFontFilterFunc(new org.pango.FontFamily(family, Ownership.NONE), new org.pango.FontFace(face, Ownership.NONE));
            return RESULT;
        }
        
        public static boolean cbTreeModelForeachFunc(MemoryAddress model, MemoryAddress path, MemoryAddress iter, MemoryAddress data) {
            int HASH = data.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (TreeModelForeachFunc) Interop.signalRegistry.get(HASH);
            var RESULT = HANDLER.onTreeModelForeachFunc(new org.gtk.gtk.TreeModel.TreeModelImpl(model, Ownership.NONE), new org.gtk.gtk.TreePath(path, Ownership.NONE), new org.gtk.gtk.TreeIter(iter, Ownership.NONE));
            return RESULT;
        }
        
        public static void cbTextTagTableForeach(MemoryAddress tag, MemoryAddress data) {
            int HASH = data.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (TextTagTableForeach) Interop.signalRegistry.get(HASH);
            HANDLER.onTextTagTableForeach(new org.gtk.gtk.TextTag(tag, Ownership.NONE));
        }
        
        public static void cbPrintSettingsFunc(MemoryAddress key, MemoryAddress value, MemoryAddress userData) {
            int HASH = userData.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (PrintSettingsFunc) Interop.signalRegistry.get(HASH);
            HANDLER.onPrintSettingsFunc(Interop.getStringFrom(key), Interop.getStringFrom(value));
        }
        
        public static void cbTreeModelFilterModifyFunc(MemoryAddress model, MemoryAddress iter, MemoryAddress value, int column, MemoryAddress data) {
            int HASH = data.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (TreeModelFilterModifyFunc) Interop.signalRegistry.get(HASH);
            HANDLER.onTreeModelFilterModifyFunc(new org.gtk.gtk.TreeModel.TreeModelImpl(model, Ownership.NONE), new org.gtk.gtk.TreeIter(iter, Ownership.NONE), new org.gtk.gobject.Value(value, Ownership.NONE), column);
        }
        
        public static boolean cbTreeViewSearchEqualFunc(MemoryAddress model, int column, MemoryAddress key, MemoryAddress iter, MemoryAddress searchData) {
            int HASH = searchData.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (TreeViewSearchEqualFunc) Interop.signalRegistry.get(HASH);
            var RESULT = HANDLER.onTreeViewSearchEqualFunc(new org.gtk.gtk.TreeModel.TreeModelImpl(model, Ownership.NONE), column, Interop.getStringFrom(key), new org.gtk.gtk.TreeIter(iter, Ownership.NONE));
            return RESULT;
        }
        
        public static void cbTreeCellDataFunc(MemoryAddress treeColumn, MemoryAddress cell, MemoryAddress treeModel, MemoryAddress iter, MemoryAddress data) {
            int HASH = data.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (TreeCellDataFunc) Interop.signalRegistry.get(HASH);
            HANDLER.onTreeCellDataFunc(new org.gtk.gtk.TreeViewColumn(treeColumn, Ownership.NONE), new org.gtk.gtk.CellRenderer(cell, Ownership.NONE), new org.gtk.gtk.TreeModel.TreeModelImpl(treeModel, Ownership.NONE), new org.gtk.gtk.TreeIter(iter, Ownership.NONE));
        }
        
        public static boolean cbTreeModelFilterVisibleFunc(MemoryAddress model, MemoryAddress iter, MemoryAddress data) {
            int HASH = data.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (TreeModelFilterVisibleFunc) Interop.signalRegistry.get(HASH);
            var RESULT = HANDLER.onTreeModelFilterVisibleFunc(new org.gtk.gtk.TreeModel.TreeModelImpl(model, Ownership.NONE), new org.gtk.gtk.TreeIter(iter, Ownership.NONE));
            return RESULT;
        }
        
        public static boolean cbTextCharPredicate(int ch, MemoryAddress userData) {
            int HASH = userData.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (TextCharPredicate) Interop.signalRegistry.get(HASH);
            var RESULT = HANDLER.onTextCharPredicate(ch);
            return RESULT;
        }
        
        public static void cbPageSetupDoneFunc(MemoryAddress pageSetup, MemoryAddress data) {
            int HASH = data.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (PageSetupDoneFunc) Interop.signalRegistry.get(HASH);
            HANDLER.onPageSetupDoneFunc(new org.gtk.gtk.PageSetup(pageSetup, Ownership.NONE));
        }
        
        public static void cbIconViewForeachFunc(MemoryAddress iconView, MemoryAddress path, MemoryAddress data) {
            int HASH = data.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (IconViewForeachFunc) Interop.signalRegistry.get(HASH);
            HANDLER.onIconViewForeachFunc(new org.gtk.gtk.IconView(iconView, Ownership.NONE), new org.gtk.gtk.TreePath(path, Ownership.NONE));
        }
        
        public static org.gtk.gobject.Object cbMapListModelMapFunc(MemoryAddress item, MemoryAddress userData) {
            int HASH = userData.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (MapListModelMapFunc) Interop.signalRegistry.get(HASH);
            var RESULT = HANDLER.onMapListModelMapFunc(new org.gtk.gobject.Object(item, Ownership.FULL));
            return RESULT;
        }
        
        public static boolean cbFlowBoxFilterFunc(MemoryAddress child, MemoryAddress userData) {
            int HASH = userData.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (FlowBoxFilterFunc) Interop.signalRegistry.get(HASH);
            var RESULT = HANDLER.onFlowBoxFilterFunc(new org.gtk.gtk.FlowBoxChild(child, Ownership.NONE));
            return RESULT;
        }
        
        public static boolean cbCustomFilterFunc(MemoryAddress item, MemoryAddress userData) {
            int HASH = userData.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (CustomFilterFunc) Interop.signalRegistry.get(HASH);
            var RESULT = HANDLER.onCustomFilterFunc(new org.gtk.gobject.Object(item, Ownership.NONE));
            return RESULT;
        }
        
        public static void cbPrintJobCompleteFunc(MemoryAddress printJob, MemoryAddress userData, MemoryAddress error) {
            int HASH = userData.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (PrintJobCompleteFunc) Interop.signalRegistry.get(HASH);
            HANDLER.onPrintJobCompleteFunc(new org.gtk.gtk.PrintJob(printJob, Ownership.NONE), new org.gtk.glib.Error(error, Ownership.NONE));
        }
        
        public static org.gtk.gio.ListModel cbTreeListModelCreateModelFunc(MemoryAddress item, MemoryAddress userData) {
            int HASH = userData.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (TreeListModelCreateModelFunc) Interop.signalRegistry.get(HASH);
            var RESULT = HANDLER.onTreeListModelCreateModelFunc(new org.gtk.gobject.Object(item, Ownership.NONE));
            return RESULT;
        }
        
        public static boolean cbTreeSelectionFunc(MemoryAddress selection, MemoryAddress model, MemoryAddress path, int pathCurrentlySelected, MemoryAddress data) {
            int HASH = data.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (TreeSelectionFunc) Interop.signalRegistry.get(HASH);
            var RESULT = HANDLER.onTreeSelectionFunc(new org.gtk.gtk.TreeSelection(selection, Ownership.NONE), new org.gtk.gtk.TreeModel.TreeModelImpl(model, Ownership.NONE), new org.gtk.gtk.TreePath(path, Ownership.NONE), pathCurrentlySelected != 0);
            return RESULT;
        }
        
        public static void cbDrawingAreaDrawFunc(MemoryAddress drawingArea, MemoryAddress cr, int width, int height, MemoryAddress userData) {
            int HASH = userData.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (DrawingAreaDrawFunc) Interop.signalRegistry.get(HASH);
            HANDLER.onDrawingAreaDrawFunc(new org.gtk.gtk.DrawingArea(drawingArea, Ownership.NONE), new org.cairographics.Context(cr, Ownership.NONE), width, height);
        }
        
        public static boolean cbShortcutFunc(MemoryAddress widget, MemoryAddress args, MemoryAddress userData) {
            int HASH = userData.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (ShortcutFunc) Interop.signalRegistry.get(HASH);
            var RESULT = HANDLER.onShortcutFunc(new org.gtk.gtk.Widget(widget, Ownership.NONE), new org.gtk.glib.Variant(args, Ownership.NONE));
            return RESULT;
        }
        
        public static void cbListBoxUpdateHeaderFunc(MemoryAddress row, MemoryAddress before, MemoryAddress userData) {
            int HASH = userData.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (ListBoxUpdateHeaderFunc) Interop.signalRegistry.get(HASH);
            HANDLER.onListBoxUpdateHeaderFunc(new org.gtk.gtk.ListBoxRow(row, Ownership.NONE), new org.gtk.gtk.ListBoxRow(before, Ownership.NONE));
        }
        
        public static int cbTreeIterCompareFunc(MemoryAddress model, MemoryAddress a, MemoryAddress b, MemoryAddress userData) {
            int HASH = userData.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (TreeIterCompareFunc) Interop.signalRegistry.get(HASH);
            var RESULT = HANDLER.onTreeIterCompareFunc(new org.gtk.gtk.TreeModel.TreeModelImpl(model, Ownership.NONE), new org.gtk.gtk.TreeIter(a, Ownership.NONE), new org.gtk.gtk.TreeIter(b, Ownership.NONE));
            return RESULT;
        }
        
        public static boolean cbCellAllocCallback(MemoryAddress renderer, MemoryAddress cellArea, MemoryAddress cellBackground, MemoryAddress data) {
            int HASH = data.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (CellAllocCallback) Interop.signalRegistry.get(HASH);
            var RESULT = HANDLER.onCellAllocCallback(new org.gtk.gtk.CellRenderer(renderer, Ownership.NONE), new org.gtk.gdk.Rectangle(cellArea, Ownership.NONE), new org.gtk.gdk.Rectangle(cellBackground, Ownership.NONE));
            return RESULT;
        }
        
        public static boolean cbTickCallback(MemoryAddress widget, MemoryAddress frameClock, MemoryAddress userData) {
            int HASH = userData.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (TickCallback) Interop.signalRegistry.get(HASH);
            var RESULT = HANDLER.onTickCallback(new org.gtk.gtk.Widget(widget, Ownership.NONE), new org.gtk.gdk.FrameClock(frameClock, Ownership.NONE));
            return RESULT;
        }
        
        public static boolean cbPrinterFunc(MemoryAddress printer, MemoryAddress data) {
            int HASH = data.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (PrinterFunc) Interop.signalRegistry.get(HASH);
            var RESULT = HANDLER.onPrinterFunc(new org.gtk.gtk.Printer(printer, Ownership.NONE));
            return RESULT;
        }
        
        public static boolean cbTreeViewRowSeparatorFunc(MemoryAddress model, MemoryAddress iter, MemoryAddress data) {
            int HASH = data.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (TreeViewRowSeparatorFunc) Interop.signalRegistry.get(HASH);
            var RESULT = HANDLER.onTreeViewRowSeparatorFunc(new org.gtk.gtk.TreeModel.TreeModelImpl(model, Ownership.NONE), new org.gtk.gtk.TreeIter(iter, Ownership.NONE));
            return RESULT;
        }
    }
}
