package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A {@code GtkPrintSettings} object represents the settings of a print dialog in
 * a system-independent way.
 * <p>
 * The main use for this object is that once you’ve printed you can get a
 * settings object that represents the settings the user chose, and the next
 * time you print you can pass that object in so that the user doesn’t have
 * to re-set all his settings.
 * <p>
 * Its also possible to enumerate the settings so that you can easily save
 * the settings for the next time your app runs, or even store them in a
 * document. The predefined keys try to use shared values as much as possible
 * so that moving such a document between systems still works.
 */
public class PrintSettings extends org.gtk.gobject.Object {

    public PrintSettings(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to PrintSettings */
    public static PrintSettings castFrom(org.gtk.gobject.Object gobject) {
        return new PrintSettings(gobject.refcounted());
    }
    
    private static final MethodHandle gtk_print_settings_new = Interop.downcallHandle(
        "gtk_print_settings_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNew() {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gtk_print_settings_new.invokeExact(), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new {@code GtkPrintSettings} object.
     */
    public PrintSettings() {
        super(constructNew());
    }
    
    private static final MethodHandle gtk_print_settings_new_from_file = Interop.downcallHandle(
        "gtk_print_settings_new_from_file",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNewFromFile(@NotNull java.lang.String fileName) throws GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gtk_print_settings_new_from_file.invokeExact(Interop.allocateNativeString(fileName), (Addressable) GERROR), true);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Reads the print settings from {@code file_name}.
     * <p>
     * Returns a new {@code GtkPrintSettings} object with the restored settings,
     * or {@code null} if an error occurred. If the file could not be loaded then
     * error is set to either a {@code GFileError} or {@code GKeyFileError}.
     * <p>
     * See {@link PrintSettings#toFile}.
     */
    public static PrintSettings newFromFile(@NotNull java.lang.String fileName) throws GErrorException {
        return new PrintSettings(constructNewFromFile(fileName));
    }
    
    private static final MethodHandle gtk_print_settings_new_from_gvariant = Interop.downcallHandle(
        "gtk_print_settings_new_from_gvariant",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNewFromGvariant(@NotNull org.gtk.glib.Variant variant) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gtk_print_settings_new_from_gvariant.invokeExact(variant.handle()), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Deserialize print settings from an a{sv} variant.
     * <p>
     * The variant must be in the format produced by
     * {@link PrintSettings#toGvariant}.
     */
    public static PrintSettings newFromGvariant(@NotNull org.gtk.glib.Variant variant) {
        return new PrintSettings(constructNewFromGvariant(variant));
    }
    
    private static final MethodHandle gtk_print_settings_new_from_key_file = Interop.downcallHandle(
        "gtk_print_settings_new_from_key_file",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNewFromKeyFile(@NotNull org.gtk.glib.KeyFile keyFile, @Nullable java.lang.String groupName) throws GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gtk_print_settings_new_from_key_file.invokeExact(keyFile.handle(), Interop.allocateNativeString(groupName), (Addressable) GERROR), true);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Reads the print settings from the group {@code group_name} in {@code key_file}.
     * <p>
     * Returns a new {@code GtkPrintSettings} object with the restored settings,
     * or {@code null} if an error occurred. If the file could not be loaded then
     * error is set to either {@code GFileError} or {@code GKeyFileError}.
     */
    public static PrintSettings newFromKeyFile(@NotNull org.gtk.glib.KeyFile keyFile, @Nullable java.lang.String groupName) throws GErrorException {
        return new PrintSettings(constructNewFromKeyFile(keyFile, groupName));
    }
    
    private static final MethodHandle gtk_print_settings_copy = Interop.downcallHandle(
        "gtk_print_settings_copy",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Copies a {@code GtkPrintSettings} object.
     */
    public @NotNull PrintSettings copy() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gtk_print_settings_copy.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new PrintSettings(Refcounted.get(RESULT, true));
    }
    
    private static final MethodHandle gtk_print_settings_foreach = Interop.downcallHandle(
        "gtk_print_settings_foreach",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Calls {@code func} for each key-value pair of {@code settings}.
     */
    public @NotNull void foreach(@NotNull PrintSettingsFunc func) {
        try {
            gtk_print_settings_foreach.invokeExact(handle(), 
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gtk.class, "__cbPrintSettingsFunc",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(func)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_print_settings_get = Interop.downcallHandle(
        "gtk_print_settings_get",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Looks up the string value associated with {@code key}.
     */
    public @Nullable java.lang.String get(@NotNull java.lang.String key) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gtk_print_settings_get.invokeExact(handle(), Interop.allocateNativeString(key));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT.getUtf8String(0);
    }
    
    private static final MethodHandle gtk_print_settings_get_bool = Interop.downcallHandle(
        "gtk_print_settings_get_bool",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the boolean represented by the value
     * that is associated with {@code key}.
     * <p>
     * The string “true” represents {@code true}, any other
     * string {@code false}.
     */
    public boolean getBool(@NotNull java.lang.String key) {
        int RESULT;
        try {
            RESULT = (int) gtk_print_settings_get_bool.invokeExact(handle(), Interop.allocateNativeString(key));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle gtk_print_settings_get_collate = Interop.downcallHandle(
        "gtk_print_settings_get_collate",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the value of {@code GTK_PRINT_SETTINGS_COLLATE}.
     */
    public boolean getCollate() {
        int RESULT;
        try {
            RESULT = (int) gtk_print_settings_get_collate.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle gtk_print_settings_get_default_source = Interop.downcallHandle(
        "gtk_print_settings_get_default_source",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the value of {@code GTK_PRINT_SETTINGS_DEFAULT_SOURCE}.
     */
    public @Nullable java.lang.String getDefaultSource() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gtk_print_settings_get_default_source.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT.getUtf8String(0);
    }
    
    private static final MethodHandle gtk_print_settings_get_dither = Interop.downcallHandle(
        "gtk_print_settings_get_dither",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the value of {@code GTK_PRINT_SETTINGS_DITHER}.
     */
    public @Nullable java.lang.String getDither() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gtk_print_settings_get_dither.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT.getUtf8String(0);
    }
    
    private static final MethodHandle gtk_print_settings_get_double = Interop.downcallHandle(
        "gtk_print_settings_get_double",
        FunctionDescriptor.of(ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the double value associated with {@code key}, or 0.
     */
    public double getDouble(@NotNull java.lang.String key) {
        double RESULT;
        try {
            RESULT = (double) gtk_print_settings_get_double.invokeExact(handle(), Interop.allocateNativeString(key));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle gtk_print_settings_get_double_with_default = Interop.downcallHandle(
        "gtk_print_settings_get_double_with_default",
        FunctionDescriptor.of(ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE)
    );
    
    /**
     * Returns the floating point number represented by
     * the value that is associated with {@code key}, or {@code default_val}
     * if the value does not represent a floating point number.
     * <p>
     * Floating point numbers are parsed with g_ascii_strtod().
     */
    public double getDoubleWithDefault(@NotNull java.lang.String key, @NotNull double def) {
        double RESULT;
        try {
            RESULT = (double) gtk_print_settings_get_double_with_default.invokeExact(handle(), Interop.allocateNativeString(key), def);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle gtk_print_settings_get_duplex = Interop.downcallHandle(
        "gtk_print_settings_get_duplex",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the value of {@code GTK_PRINT_SETTINGS_DUPLEX}.
     */
    public @NotNull PrintDuplex getDuplex() {
        int RESULT;
        try {
            RESULT = (int) gtk_print_settings_get_duplex.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new PrintDuplex(RESULT);
    }
    
    private static final MethodHandle gtk_print_settings_get_finishings = Interop.downcallHandle(
        "gtk_print_settings_get_finishings",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the value of {@code GTK_PRINT_SETTINGS_FINISHINGS}.
     */
    public @Nullable java.lang.String getFinishings() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gtk_print_settings_get_finishings.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT.getUtf8String(0);
    }
    
    private static final MethodHandle gtk_print_settings_get_int = Interop.downcallHandle(
        "gtk_print_settings_get_int",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the integer value of {@code key}, or 0.
     */
    public int getInt(@NotNull java.lang.String key) {
        int RESULT;
        try {
            RESULT = (int) gtk_print_settings_get_int.invokeExact(handle(), Interop.allocateNativeString(key));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle gtk_print_settings_get_int_with_default = Interop.downcallHandle(
        "gtk_print_settings_get_int_with_default",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Returns the value of {@code key}, interpreted as
     * an integer, or the default value.
     */
    public int getIntWithDefault(@NotNull java.lang.String key, @NotNull int def) {
        int RESULT;
        try {
            RESULT = (int) gtk_print_settings_get_int_with_default.invokeExact(handle(), Interop.allocateNativeString(key), def);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle gtk_print_settings_get_length = Interop.downcallHandle(
        "gtk_print_settings_get_length",
        FunctionDescriptor.of(ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Returns the value associated with {@code key}, interpreted
     * as a length.
     * <p>
     * The returned value is converted to {@code units}.
     */
    public double getLength(@NotNull java.lang.String key, @NotNull Unit unit) {
        double RESULT;
        try {
            RESULT = (double) gtk_print_settings_get_length.invokeExact(handle(), Interop.allocateNativeString(key), unit.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle gtk_print_settings_get_media_type = Interop.downcallHandle(
        "gtk_print_settings_get_media_type",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the value of {@code GTK_PRINT_SETTINGS_MEDIA_TYPE}.
     * <p>
     * The set of media types is defined in PWG 5101.1-2002 PWG.
     */
    public @Nullable java.lang.String getMediaType() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gtk_print_settings_get_media_type.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT.getUtf8String(0);
    }
    
    private static final MethodHandle gtk_print_settings_get_n_copies = Interop.downcallHandle(
        "gtk_print_settings_get_n_copies",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the value of {@code GTK_PRINT_SETTINGS_N_COPIES}.
     */
    public int getNCopies() {
        int RESULT;
        try {
            RESULT = (int) gtk_print_settings_get_n_copies.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle gtk_print_settings_get_number_up = Interop.downcallHandle(
        "gtk_print_settings_get_number_up",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the value of {@code GTK_PRINT_SETTINGS_NUMBER_UP}.
     */
    public int getNumberUp() {
        int RESULT;
        try {
            RESULT = (int) gtk_print_settings_get_number_up.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle gtk_print_settings_get_number_up_layout = Interop.downcallHandle(
        "gtk_print_settings_get_number_up_layout",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the value of {@code GTK_PRINT_SETTINGS_NUMBER_UP_LAYOUT}.
     */
    public @NotNull NumberUpLayout getNumberUpLayout() {
        int RESULT;
        try {
            RESULT = (int) gtk_print_settings_get_number_up_layout.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new NumberUpLayout(RESULT);
    }
    
    private static final MethodHandle gtk_print_settings_get_orientation = Interop.downcallHandle(
        "gtk_print_settings_get_orientation",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Get the value of {@code GTK_PRINT_SETTINGS_ORIENTATION},
     * converted to a {@code GtkPageOrientation}.
     */
    public @NotNull PageOrientation getOrientation() {
        int RESULT;
        try {
            RESULT = (int) gtk_print_settings_get_orientation.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new PageOrientation(RESULT);
    }
    
    private static final MethodHandle gtk_print_settings_get_output_bin = Interop.downcallHandle(
        "gtk_print_settings_get_output_bin",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the value of {@code GTK_PRINT_SETTINGS_OUTPUT_BIN}.
     */
    public @Nullable java.lang.String getOutputBin() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gtk_print_settings_get_output_bin.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT.getUtf8String(0);
    }
    
    private static final MethodHandle gtk_print_settings_get_page_ranges = Interop.downcallHandle(
        "gtk_print_settings_get_page_ranges",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the value of {@code GTK_PRINT_SETTINGS_PAGE_RANGES}.
     */
    public PageRange[] getPageRanges(@NotNull Out<Integer> numRanges) {
        MemorySegment numRangesPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_INT);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gtk_print_settings_get_page_ranges.invokeExact(handle(), (Addressable) numRangesPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        numRanges.set(numRangesPOINTER.get(ValueLayout.JAVA_INT, 0));
        PageRange[] resultARRAY = new PageRange[numRanges.get().intValue()];
        for (int I = 0; I < numRanges.get().intValue(); I++) {
            var OBJ = RESULT.get(ValueLayout.ADDRESS, I);
            resultARRAY[I] = new PageRange(Refcounted.get(OBJ, true));
        }
        return resultARRAY;
    }
    
    private static final MethodHandle gtk_print_settings_get_page_set = Interop.downcallHandle(
        "gtk_print_settings_get_page_set",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the value of {@code GTK_PRINT_SETTINGS_PAGE_SET}.
     */
    public @NotNull PageSet getPageSet() {
        int RESULT;
        try {
            RESULT = (int) gtk_print_settings_get_page_set.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new PageSet(RESULT);
    }
    
    private static final MethodHandle gtk_print_settings_get_paper_height = Interop.downcallHandle(
        "gtk_print_settings_get_paper_height",
        FunctionDescriptor.of(ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Gets the value of {@code GTK_PRINT_SETTINGS_PAPER_HEIGHT},
     * converted to {@code unit}.
     */
    public double getPaperHeight(@NotNull Unit unit) {
        double RESULT;
        try {
            RESULT = (double) gtk_print_settings_get_paper_height.invokeExact(handle(), unit.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle gtk_print_settings_get_paper_size = Interop.downcallHandle(
        "gtk_print_settings_get_paper_size",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the value of {@code GTK_PRINT_SETTINGS_PAPER_FORMAT},
     * converted to a {@code GtkPaperSize}.
     */
    public @Nullable PaperSize getPaperSize() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gtk_print_settings_get_paper_size.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new PaperSize(Refcounted.get(RESULT, true));
    }
    
    private static final MethodHandle gtk_print_settings_get_paper_width = Interop.downcallHandle(
        "gtk_print_settings_get_paper_width",
        FunctionDescriptor.of(ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Gets the value of {@code GTK_PRINT_SETTINGS_PAPER_WIDTH},
     * converted to {@code unit}.
     */
    public double getPaperWidth(@NotNull Unit unit) {
        double RESULT;
        try {
            RESULT = (double) gtk_print_settings_get_paper_width.invokeExact(handle(), unit.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle gtk_print_settings_get_print_pages = Interop.downcallHandle(
        "gtk_print_settings_get_print_pages",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the value of {@code GTK_PRINT_SETTINGS_PRINT_PAGES}.
     */
    public @NotNull PrintPages getPrintPages() {
        int RESULT;
        try {
            RESULT = (int) gtk_print_settings_get_print_pages.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new PrintPages(RESULT);
    }
    
    private static final MethodHandle gtk_print_settings_get_printer = Interop.downcallHandle(
        "gtk_print_settings_get_printer",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Convenience function to obtain the value of
     * {@code GTK_PRINT_SETTINGS_PRINTER}.
     */
    public @Nullable java.lang.String getPrinter() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gtk_print_settings_get_printer.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT.getUtf8String(0);
    }
    
    private static final MethodHandle gtk_print_settings_get_printer_lpi = Interop.downcallHandle(
        "gtk_print_settings_get_printer_lpi",
        FunctionDescriptor.of(ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the value of {@code GTK_PRINT_SETTINGS_PRINTER_LPI}.
     */
    public double getPrinterLpi() {
        double RESULT;
        try {
            RESULT = (double) gtk_print_settings_get_printer_lpi.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle gtk_print_settings_get_quality = Interop.downcallHandle(
        "gtk_print_settings_get_quality",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the value of {@code GTK_PRINT_SETTINGS_QUALITY}.
     */
    public @NotNull PrintQuality getQuality() {
        int RESULT;
        try {
            RESULT = (int) gtk_print_settings_get_quality.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new PrintQuality(RESULT);
    }
    
    private static final MethodHandle gtk_print_settings_get_resolution = Interop.downcallHandle(
        "gtk_print_settings_get_resolution",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the value of {@code GTK_PRINT_SETTINGS_RESOLUTION}.
     */
    public int getResolution() {
        int RESULT;
        try {
            RESULT = (int) gtk_print_settings_get_resolution.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle gtk_print_settings_get_resolution_x = Interop.downcallHandle(
        "gtk_print_settings_get_resolution_x",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the value of {@code GTK_PRINT_SETTINGS_RESOLUTION_X}.
     */
    public int getResolutionX() {
        int RESULT;
        try {
            RESULT = (int) gtk_print_settings_get_resolution_x.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle gtk_print_settings_get_resolution_y = Interop.downcallHandle(
        "gtk_print_settings_get_resolution_y",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the value of {@code GTK_PRINT_SETTINGS_RESOLUTION_Y}.
     */
    public int getResolutionY() {
        int RESULT;
        try {
            RESULT = (int) gtk_print_settings_get_resolution_y.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle gtk_print_settings_get_reverse = Interop.downcallHandle(
        "gtk_print_settings_get_reverse",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the value of {@code GTK_PRINT_SETTINGS_REVERSE}.
     */
    public boolean getReverse() {
        int RESULT;
        try {
            RESULT = (int) gtk_print_settings_get_reverse.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle gtk_print_settings_get_scale = Interop.downcallHandle(
        "gtk_print_settings_get_scale",
        FunctionDescriptor.of(ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the value of {@code GTK_PRINT_SETTINGS_SCALE}.
     */
    public double getScale() {
        double RESULT;
        try {
            RESULT = (double) gtk_print_settings_get_scale.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle gtk_print_settings_get_use_color = Interop.downcallHandle(
        "gtk_print_settings_get_use_color",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the value of {@code GTK_PRINT_SETTINGS_USE_COLOR}.
     */
    public boolean getUseColor() {
        int RESULT;
        try {
            RESULT = (int) gtk_print_settings_get_use_color.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle gtk_print_settings_has_key = Interop.downcallHandle(
        "gtk_print_settings_has_key",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns {@code true}, if a value is associated with {@code key}.
     */
    public boolean hasKey(@NotNull java.lang.String key) {
        int RESULT;
        try {
            RESULT = (int) gtk_print_settings_has_key.invokeExact(handle(), Interop.allocateNativeString(key));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle gtk_print_settings_load_file = Interop.downcallHandle(
        "gtk_print_settings_load_file",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Reads the print settings from {@code file_name}.
     * <p>
     * If the file could not be loaded then error is set to either
     * a {@code GFileError} or {@code GKeyFileError}.
     * <p>
     * See {@link PrintSettings#toFile}.
     */
    public boolean loadFile(@NotNull java.lang.String fileName) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) gtk_print_settings_load_file.invokeExact(handle(), Interop.allocateNativeString(fileName), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle gtk_print_settings_load_key_file = Interop.downcallHandle(
        "gtk_print_settings_load_key_file",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Reads the print settings from the group {@code group_name} in {@code key_file}.
     * <p>
     * If the file could not be loaded then error is set to either a
     * {@code GFileError} or {@code GKeyFileError}.
     */
    public boolean loadKeyFile(@NotNull org.gtk.glib.KeyFile keyFile, @Nullable java.lang.String groupName) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) gtk_print_settings_load_key_file.invokeExact(handle(), keyFile.handle(), Interop.allocateNativeString(groupName), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle gtk_print_settings_set = Interop.downcallHandle(
        "gtk_print_settings_set",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Associates {@code value} with {@code key}.
     */
    public @NotNull void set(@NotNull java.lang.String key, @Nullable java.lang.String value) {
        try {
            gtk_print_settings_set.invokeExact(handle(), Interop.allocateNativeString(key), Interop.allocateNativeString(value));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_print_settings_set_bool = Interop.downcallHandle(
        "gtk_print_settings_set_bool",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets {@code key} to a boolean value.
     */
    public @NotNull void setBool(@NotNull java.lang.String key, @NotNull boolean value) {
        try {
            gtk_print_settings_set_bool.invokeExact(handle(), Interop.allocateNativeString(key), value ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_print_settings_set_collate = Interop.downcallHandle(
        "gtk_print_settings_set_collate",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the value of {@code GTK_PRINT_SETTINGS_COLLATE}.
     */
    public @NotNull void setCollate(@NotNull boolean collate) {
        try {
            gtk_print_settings_set_collate.invokeExact(handle(), collate ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_print_settings_set_default_source = Interop.downcallHandle(
        "gtk_print_settings_set_default_source",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the value of {@code GTK_PRINT_SETTINGS_DEFAULT_SOURCE}.
     */
    public @NotNull void setDefaultSource(@NotNull java.lang.String defaultSource) {
        try {
            gtk_print_settings_set_default_source.invokeExact(handle(), Interop.allocateNativeString(defaultSource));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_print_settings_set_dither = Interop.downcallHandle(
        "gtk_print_settings_set_dither",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the value of {@code GTK_PRINT_SETTINGS_DITHER}.
     */
    public @NotNull void setDither(@NotNull java.lang.String dither) {
        try {
            gtk_print_settings_set_dither.invokeExact(handle(), Interop.allocateNativeString(dither));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_print_settings_set_double = Interop.downcallHandle(
        "gtk_print_settings_set_double",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE)
    );
    
    /**
     * Sets {@code key} to a double value.
     */
    public @NotNull void setDouble(@NotNull java.lang.String key, @NotNull double value) {
        try {
            gtk_print_settings_set_double.invokeExact(handle(), Interop.allocateNativeString(key), value);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_print_settings_set_duplex = Interop.downcallHandle(
        "gtk_print_settings_set_duplex",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the value of {@code GTK_PRINT_SETTINGS_DUPLEX}.
     */
    public @NotNull void setDuplex(@NotNull PrintDuplex duplex) {
        try {
            gtk_print_settings_set_duplex.invokeExact(handle(), duplex.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_print_settings_set_finishings = Interop.downcallHandle(
        "gtk_print_settings_set_finishings",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the value of {@code GTK_PRINT_SETTINGS_FINISHINGS}.
     */
    public @NotNull void setFinishings(@NotNull java.lang.String finishings) {
        try {
            gtk_print_settings_set_finishings.invokeExact(handle(), Interop.allocateNativeString(finishings));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_print_settings_set_int = Interop.downcallHandle(
        "gtk_print_settings_set_int",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets {@code key} to an integer value.
     */
    public @NotNull void setInt(@NotNull java.lang.String key, @NotNull int value) {
        try {
            gtk_print_settings_set_int.invokeExact(handle(), Interop.allocateNativeString(key), value);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_print_settings_set_length = Interop.downcallHandle(
        "gtk_print_settings_set_length",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_INT)
    );
    
    /**
     * Associates a length in units of {@code unit} with {@code key}.
     */
    public @NotNull void setLength(@NotNull java.lang.String key, @NotNull double value, @NotNull Unit unit) {
        try {
            gtk_print_settings_set_length.invokeExact(handle(), Interop.allocateNativeString(key), value, unit.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_print_settings_set_media_type = Interop.downcallHandle(
        "gtk_print_settings_set_media_type",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the value of {@code GTK_PRINT_SETTINGS_MEDIA_TYPE}.
     * <p>
     * The set of media types is defined in PWG 5101.1-2002 PWG.
     */
    public @NotNull void setMediaType(@NotNull java.lang.String mediaType) {
        try {
            gtk_print_settings_set_media_type.invokeExact(handle(), Interop.allocateNativeString(mediaType));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_print_settings_set_n_copies = Interop.downcallHandle(
        "gtk_print_settings_set_n_copies",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the value of {@code GTK_PRINT_SETTINGS_N_COPIES}.
     */
    public @NotNull void setNCopies(@NotNull int numCopies) {
        try {
            gtk_print_settings_set_n_copies.invokeExact(handle(), numCopies);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_print_settings_set_number_up = Interop.downcallHandle(
        "gtk_print_settings_set_number_up",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the value of {@code GTK_PRINT_SETTINGS_NUMBER_UP}.
     */
    public @NotNull void setNumberUp(@NotNull int numberUp) {
        try {
            gtk_print_settings_set_number_up.invokeExact(handle(), numberUp);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_print_settings_set_number_up_layout = Interop.downcallHandle(
        "gtk_print_settings_set_number_up_layout",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the value of {@code GTK_PRINT_SETTINGS_NUMBER_UP_LAYOUT}.
     */
    public @NotNull void setNumberUpLayout(@NotNull NumberUpLayout numberUpLayout) {
        try {
            gtk_print_settings_set_number_up_layout.invokeExact(handle(), numberUpLayout.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_print_settings_set_orientation = Interop.downcallHandle(
        "gtk_print_settings_set_orientation",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the value of {@code GTK_PRINT_SETTINGS_ORIENTATION}.
     */
    public @NotNull void setOrientation(@NotNull PageOrientation orientation) {
        try {
            gtk_print_settings_set_orientation.invokeExact(handle(), orientation.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_print_settings_set_output_bin = Interop.downcallHandle(
        "gtk_print_settings_set_output_bin",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the value of {@code GTK_PRINT_SETTINGS_OUTPUT_BIN}.
     */
    public @NotNull void setOutputBin(@NotNull java.lang.String outputBin) {
        try {
            gtk_print_settings_set_output_bin.invokeExact(handle(), Interop.allocateNativeString(outputBin));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_print_settings_set_page_ranges = Interop.downcallHandle(
        "gtk_print_settings_set_page_ranges",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the value of {@code GTK_PRINT_SETTINGS_PAGE_RANGES}.
     */
    public @NotNull void setPageRanges(@NotNull PageRange[] pageRanges, @NotNull int numRanges) {
        try {
            gtk_print_settings_set_page_ranges.invokeExact(handle(), Interop.allocateNativeArray(pageRanges), numRanges);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_print_settings_set_page_set = Interop.downcallHandle(
        "gtk_print_settings_set_page_set",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the value of {@code GTK_PRINT_SETTINGS_PAGE_SET}.
     */
    public @NotNull void setPageSet(@NotNull PageSet pageSet) {
        try {
            gtk_print_settings_set_page_set.invokeExact(handle(), pageSet.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_print_settings_set_paper_height = Interop.downcallHandle(
        "gtk_print_settings_set_paper_height",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the value of {@code GTK_PRINT_SETTINGS_PAPER_HEIGHT}.
     */
    public @NotNull void setPaperHeight(@NotNull double height, @NotNull Unit unit) {
        try {
            gtk_print_settings_set_paper_height.invokeExact(handle(), height, unit.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_print_settings_set_paper_size = Interop.downcallHandle(
        "gtk_print_settings_set_paper_size",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the value of {@code GTK_PRINT_SETTINGS_PAPER_FORMAT},
     * {@code GTK_PRINT_SETTINGS_PAPER_WIDTH} and
     * {@code GTK_PRINT_SETTINGS_PAPER_HEIGHT}.
     */
    public @NotNull void setPaperSize(@NotNull PaperSize paperSize) {
        try {
            gtk_print_settings_set_paper_size.invokeExact(handle(), paperSize.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_print_settings_set_paper_width = Interop.downcallHandle(
        "gtk_print_settings_set_paper_width",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the value of {@code GTK_PRINT_SETTINGS_PAPER_WIDTH}.
     */
    public @NotNull void setPaperWidth(@NotNull double width, @NotNull Unit unit) {
        try {
            gtk_print_settings_set_paper_width.invokeExact(handle(), width, unit.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_print_settings_set_print_pages = Interop.downcallHandle(
        "gtk_print_settings_set_print_pages",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the value of {@code GTK_PRINT_SETTINGS_PRINT_PAGES}.
     */
    public @NotNull void setPrintPages(@NotNull PrintPages pages) {
        try {
            gtk_print_settings_set_print_pages.invokeExact(handle(), pages.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_print_settings_set_printer = Interop.downcallHandle(
        "gtk_print_settings_set_printer",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Convenience function to set {@code GTK_PRINT_SETTINGS_PRINTER}
     * to {@code printer}.
     */
    public @NotNull void setPrinter(@NotNull java.lang.String printer) {
        try {
            gtk_print_settings_set_printer.invokeExact(handle(), Interop.allocateNativeString(printer));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_print_settings_set_printer_lpi = Interop.downcallHandle(
        "gtk_print_settings_set_printer_lpi",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE)
    );
    
    /**
     * Sets the value of {@code GTK_PRINT_SETTINGS_PRINTER_LPI}.
     */
    public @NotNull void setPrinterLpi(@NotNull double lpi) {
        try {
            gtk_print_settings_set_printer_lpi.invokeExact(handle(), lpi);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_print_settings_set_quality = Interop.downcallHandle(
        "gtk_print_settings_set_quality",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the value of {@code GTK_PRINT_SETTINGS_QUALITY}.
     */
    public @NotNull void setQuality(@NotNull PrintQuality quality) {
        try {
            gtk_print_settings_set_quality.invokeExact(handle(), quality.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_print_settings_set_resolution = Interop.downcallHandle(
        "gtk_print_settings_set_resolution",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the values of {@code GTK_PRINT_SETTINGS_RESOLUTION},
     * {@code GTK_PRINT_SETTINGS_RESOLUTION_X} and
     * {@code GTK_PRINT_SETTINGS_RESOLUTION_Y}.
     */
    public @NotNull void setResolution(@NotNull int resolution) {
        try {
            gtk_print_settings_set_resolution.invokeExact(handle(), resolution);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_print_settings_set_resolution_xy = Interop.downcallHandle(
        "gtk_print_settings_set_resolution_xy",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the values of {@code GTK_PRINT_SETTINGS_RESOLUTION},
     * {@code GTK_PRINT_SETTINGS_RESOLUTION_X} and
     * {@code GTK_PRINT_SETTINGS_RESOLUTION_Y}.
     */
    public @NotNull void setResolutionXy(@NotNull int resolutionX, @NotNull int resolutionY) {
        try {
            gtk_print_settings_set_resolution_xy.invokeExact(handle(), resolutionX, resolutionY);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_print_settings_set_reverse = Interop.downcallHandle(
        "gtk_print_settings_set_reverse",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the value of {@code GTK_PRINT_SETTINGS_REVERSE}.
     */
    public @NotNull void setReverse(@NotNull boolean reverse) {
        try {
            gtk_print_settings_set_reverse.invokeExact(handle(), reverse ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_print_settings_set_scale = Interop.downcallHandle(
        "gtk_print_settings_set_scale",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE)
    );
    
    /**
     * Sets the value of {@code GTK_PRINT_SETTINGS_SCALE}.
     */
    public @NotNull void setScale(@NotNull double scale) {
        try {
            gtk_print_settings_set_scale.invokeExact(handle(), scale);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_print_settings_set_use_color = Interop.downcallHandle(
        "gtk_print_settings_set_use_color",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the value of {@code GTK_PRINT_SETTINGS_USE_COLOR}.
     */
    public @NotNull void setUseColor(@NotNull boolean useColor) {
        try {
            gtk_print_settings_set_use_color.invokeExact(handle(), useColor ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_print_settings_to_file = Interop.downcallHandle(
        "gtk_print_settings_to_file",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * This function saves the print settings from {@code settings} to {@code file_name}.
     * <p>
     * If the file could not be written then error is set to either a
     * {@code GFileError} or {@code GKeyFileError}.
     */
    public boolean toFile(@NotNull java.lang.String fileName) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) gtk_print_settings_to_file.invokeExact(handle(), Interop.allocateNativeString(fileName), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle gtk_print_settings_to_gvariant = Interop.downcallHandle(
        "gtk_print_settings_to_gvariant",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Serialize print settings to an a{sv} variant.
     */
    public @NotNull org.gtk.glib.Variant toGvariant() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gtk_print_settings_to_gvariant.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Variant(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle gtk_print_settings_to_key_file = Interop.downcallHandle(
        "gtk_print_settings_to_key_file",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * This function adds the print settings from {@code settings} to {@code key_file}.
     */
    public @NotNull void toKeyFile(@NotNull org.gtk.glib.KeyFile keyFile, @Nullable java.lang.String groupName) {
        try {
            gtk_print_settings_to_key_file.invokeExact(handle(), keyFile.handle(), Interop.allocateNativeString(groupName));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_print_settings_unset = Interop.downcallHandle(
        "gtk_print_settings_unset",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Removes any value associated with {@code key}.
     * <p>
     * This has the same effect as setting the value to {@code null}.
     */
    public @NotNull void unset(@NotNull java.lang.String key) {
        try {
            gtk_print_settings_unset.invokeExact(handle(), Interop.allocateNativeString(key));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
