package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

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
    
    static final MethodHandle gtk_print_settings_new = Interop.downcallHandle(
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
    
    static final MethodHandle gtk_print_settings_new_from_file = Interop.downcallHandle(
        "gtk_print_settings_new_from_file",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNewFromFile(java.lang.String fileName) throws GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gtk_print_settings_new_from_file.invokeExact(Interop.allocateNativeString(fileName).handle(), GERROR), true);
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
    public static PrintSettings newFromFile(java.lang.String fileName) throws GErrorException {
        return new PrintSettings(constructNewFromFile(fileName));
    }
    
    static final MethodHandle gtk_print_settings_new_from_gvariant = Interop.downcallHandle(
        "gtk_print_settings_new_from_gvariant",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNewFromGvariant(org.gtk.glib.Variant variant) {
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
    public static PrintSettings newFromGvariant(org.gtk.glib.Variant variant) {
        return new PrintSettings(constructNewFromGvariant(variant));
    }
    
    static final MethodHandle gtk_print_settings_new_from_key_file = Interop.downcallHandle(
        "gtk_print_settings_new_from_key_file",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNewFromKeyFile(org.gtk.glib.KeyFile keyFile, java.lang.String groupName) throws GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gtk_print_settings_new_from_key_file.invokeExact(keyFile.handle(), Interop.allocateNativeString(groupName).handle(), GERROR), true);
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
    public static PrintSettings newFromKeyFile(org.gtk.glib.KeyFile keyFile, java.lang.String groupName) throws GErrorException {
        return new PrintSettings(constructNewFromKeyFile(keyFile, groupName));
    }
    
    static final MethodHandle gtk_print_settings_copy = Interop.downcallHandle(
        "gtk_print_settings_copy",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Copies a {@code GtkPrintSettings} object.
     */
    public PrintSettings copy() {
        try {
            var RESULT = (MemoryAddress) gtk_print_settings_copy.invokeExact(handle());
            return new PrintSettings(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_print_settings_foreach = Interop.downcallHandle(
        "gtk_print_settings_foreach",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Calls {@code func} for each key-value pair of {@code settings}.
     */
    public void foreach(PrintSettingsFunc func) {
        try {
            gtk_print_settings_foreach.invokeExact(handle(), 
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gtk.class, "__cbPrintSettingsFunc",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(func.hashCode(), func)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_print_settings_get = Interop.downcallHandle(
        "gtk_print_settings_get",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Looks up the string value associated with {@code key}.
     */
    public java.lang.String get(java.lang.String key) {
        try {
            var RESULT = (MemoryAddress) gtk_print_settings_get.invokeExact(handle(), Interop.allocateNativeString(key).handle());
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_print_settings_get_bool = Interop.downcallHandle(
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
    public boolean getBool(java.lang.String key) {
        try {
            var RESULT = (int) gtk_print_settings_get_bool.invokeExact(handle(), Interop.allocateNativeString(key).handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_print_settings_get_collate = Interop.downcallHandle(
        "gtk_print_settings_get_collate",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the value of {@code GTK_PRINT_SETTINGS_COLLATE}.
     */
    public boolean getCollate() {
        try {
            var RESULT = (int) gtk_print_settings_get_collate.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_print_settings_get_default_source = Interop.downcallHandle(
        "gtk_print_settings_get_default_source",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the value of {@code GTK_PRINT_SETTINGS_DEFAULT_SOURCE}.
     */
    public java.lang.String getDefaultSource() {
        try {
            var RESULT = (MemoryAddress) gtk_print_settings_get_default_source.invokeExact(handle());
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_print_settings_get_dither = Interop.downcallHandle(
        "gtk_print_settings_get_dither",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the value of {@code GTK_PRINT_SETTINGS_DITHER}.
     */
    public java.lang.String getDither() {
        try {
            var RESULT = (MemoryAddress) gtk_print_settings_get_dither.invokeExact(handle());
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_print_settings_get_double = Interop.downcallHandle(
        "gtk_print_settings_get_double",
        FunctionDescriptor.of(ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the double value associated with {@code key}, or 0.
     */
    public double getDouble(java.lang.String key) {
        try {
            var RESULT = (double) gtk_print_settings_get_double.invokeExact(handle(), Interop.allocateNativeString(key).handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_print_settings_get_double_with_default = Interop.downcallHandle(
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
    public double getDoubleWithDefault(java.lang.String key, double def) {
        try {
            var RESULT = (double) gtk_print_settings_get_double_with_default.invokeExact(handle(), Interop.allocateNativeString(key).handle(), def);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_print_settings_get_duplex = Interop.downcallHandle(
        "gtk_print_settings_get_duplex",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the value of {@code GTK_PRINT_SETTINGS_DUPLEX}.
     */
    public PrintDuplex getDuplex() {
        try {
            var RESULT = (int) gtk_print_settings_get_duplex.invokeExact(handle());
            return new PrintDuplex(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_print_settings_get_finishings = Interop.downcallHandle(
        "gtk_print_settings_get_finishings",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the value of {@code GTK_PRINT_SETTINGS_FINISHINGS}.
     */
    public java.lang.String getFinishings() {
        try {
            var RESULT = (MemoryAddress) gtk_print_settings_get_finishings.invokeExact(handle());
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_print_settings_get_int = Interop.downcallHandle(
        "gtk_print_settings_get_int",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the integer value of {@code key}, or 0.
     */
    public int getInt(java.lang.String key) {
        try {
            var RESULT = (int) gtk_print_settings_get_int.invokeExact(handle(), Interop.allocateNativeString(key).handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_print_settings_get_int_with_default = Interop.downcallHandle(
        "gtk_print_settings_get_int_with_default",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Returns the value of {@code key}, interpreted as
     * an integer, or the default value.
     */
    public int getIntWithDefault(java.lang.String key, int def) {
        try {
            var RESULT = (int) gtk_print_settings_get_int_with_default.invokeExact(handle(), Interop.allocateNativeString(key).handle(), def);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_print_settings_get_length = Interop.downcallHandle(
        "gtk_print_settings_get_length",
        FunctionDescriptor.of(ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Returns the value associated with {@code key}, interpreted
     * as a length.
     * <p>
     * The returned value is converted to {@code units}.
     */
    public double getLength(java.lang.String key, Unit unit) {
        try {
            var RESULT = (double) gtk_print_settings_get_length.invokeExact(handle(), Interop.allocateNativeString(key).handle(), unit.getValue());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_print_settings_get_media_type = Interop.downcallHandle(
        "gtk_print_settings_get_media_type",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the value of {@code GTK_PRINT_SETTINGS_MEDIA_TYPE}.
     * <p>
     * The set of media types is defined in PWG 5101.1-2002 PWG.
     */
    public java.lang.String getMediaType() {
        try {
            var RESULT = (MemoryAddress) gtk_print_settings_get_media_type.invokeExact(handle());
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_print_settings_get_n_copies = Interop.downcallHandle(
        "gtk_print_settings_get_n_copies",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the value of {@code GTK_PRINT_SETTINGS_N_COPIES}.
     */
    public int getNCopies() {
        try {
            var RESULT = (int) gtk_print_settings_get_n_copies.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_print_settings_get_number_up = Interop.downcallHandle(
        "gtk_print_settings_get_number_up",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the value of {@code GTK_PRINT_SETTINGS_NUMBER_UP}.
     */
    public int getNumberUp() {
        try {
            var RESULT = (int) gtk_print_settings_get_number_up.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_print_settings_get_number_up_layout = Interop.downcallHandle(
        "gtk_print_settings_get_number_up_layout",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the value of {@code GTK_PRINT_SETTINGS_NUMBER_UP_LAYOUT}.
     */
    public NumberUpLayout getNumberUpLayout() {
        try {
            var RESULT = (int) gtk_print_settings_get_number_up_layout.invokeExact(handle());
            return new NumberUpLayout(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_print_settings_get_orientation = Interop.downcallHandle(
        "gtk_print_settings_get_orientation",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Get the value of {@code GTK_PRINT_SETTINGS_ORIENTATION},
     * converted to a {@code GtkPageOrientation}.
     */
    public PageOrientation getOrientation() {
        try {
            var RESULT = (int) gtk_print_settings_get_orientation.invokeExact(handle());
            return new PageOrientation(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_print_settings_get_output_bin = Interop.downcallHandle(
        "gtk_print_settings_get_output_bin",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the value of {@code GTK_PRINT_SETTINGS_OUTPUT_BIN}.
     */
    public java.lang.String getOutputBin() {
        try {
            var RESULT = (MemoryAddress) gtk_print_settings_get_output_bin.invokeExact(handle());
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_print_settings_get_page_ranges = Interop.downcallHandle(
        "gtk_print_settings_get_page_ranges",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the value of {@code GTK_PRINT_SETTINGS_PAGE_RANGES}.
     */
    public PointerProxy<PageRange> getPageRanges(PointerInteger numRanges) {
        try {
            var RESULT = (MemoryAddress) gtk_print_settings_get_page_ranges.invokeExact(handle(), numRanges.handle());
            return new PointerProxy<PageRange>(RESULT, PageRange.class);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_print_settings_get_page_set = Interop.downcallHandle(
        "gtk_print_settings_get_page_set",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the value of {@code GTK_PRINT_SETTINGS_PAGE_SET}.
     */
    public PageSet getPageSet() {
        try {
            var RESULT = (int) gtk_print_settings_get_page_set.invokeExact(handle());
            return new PageSet(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_print_settings_get_paper_height = Interop.downcallHandle(
        "gtk_print_settings_get_paper_height",
        FunctionDescriptor.of(ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Gets the value of {@code GTK_PRINT_SETTINGS_PAPER_HEIGHT},
     * converted to {@code unit}.
     */
    public double getPaperHeight(Unit unit) {
        try {
            var RESULT = (double) gtk_print_settings_get_paper_height.invokeExact(handle(), unit.getValue());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_print_settings_get_paper_size = Interop.downcallHandle(
        "gtk_print_settings_get_paper_size",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the value of {@code GTK_PRINT_SETTINGS_PAPER_FORMAT},
     * converted to a {@code GtkPaperSize}.
     */
    public PaperSize getPaperSize() {
        try {
            var RESULT = (MemoryAddress) gtk_print_settings_get_paper_size.invokeExact(handle());
            return new PaperSize(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_print_settings_get_paper_width = Interop.downcallHandle(
        "gtk_print_settings_get_paper_width",
        FunctionDescriptor.of(ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Gets the value of {@code GTK_PRINT_SETTINGS_PAPER_WIDTH},
     * converted to {@code unit}.
     */
    public double getPaperWidth(Unit unit) {
        try {
            var RESULT = (double) gtk_print_settings_get_paper_width.invokeExact(handle(), unit.getValue());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_print_settings_get_print_pages = Interop.downcallHandle(
        "gtk_print_settings_get_print_pages",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the value of {@code GTK_PRINT_SETTINGS_PRINT_PAGES}.
     */
    public PrintPages getPrintPages() {
        try {
            var RESULT = (int) gtk_print_settings_get_print_pages.invokeExact(handle());
            return new PrintPages(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_print_settings_get_printer = Interop.downcallHandle(
        "gtk_print_settings_get_printer",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Convenience function to obtain the value of
     * {@code GTK_PRINT_SETTINGS_PRINTER}.
     */
    public java.lang.String getPrinter() {
        try {
            var RESULT = (MemoryAddress) gtk_print_settings_get_printer.invokeExact(handle());
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_print_settings_get_printer_lpi = Interop.downcallHandle(
        "gtk_print_settings_get_printer_lpi",
        FunctionDescriptor.of(ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the value of {@code GTK_PRINT_SETTINGS_PRINTER_LPI}.
     */
    public double getPrinterLpi() {
        try {
            var RESULT = (double) gtk_print_settings_get_printer_lpi.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_print_settings_get_quality = Interop.downcallHandle(
        "gtk_print_settings_get_quality",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the value of {@code GTK_PRINT_SETTINGS_QUALITY}.
     */
    public PrintQuality getQuality() {
        try {
            var RESULT = (int) gtk_print_settings_get_quality.invokeExact(handle());
            return new PrintQuality(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_print_settings_get_resolution = Interop.downcallHandle(
        "gtk_print_settings_get_resolution",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the value of {@code GTK_PRINT_SETTINGS_RESOLUTION}.
     */
    public int getResolution() {
        try {
            var RESULT = (int) gtk_print_settings_get_resolution.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_print_settings_get_resolution_x = Interop.downcallHandle(
        "gtk_print_settings_get_resolution_x",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the value of {@code GTK_PRINT_SETTINGS_RESOLUTION_X}.
     */
    public int getResolutionX() {
        try {
            var RESULT = (int) gtk_print_settings_get_resolution_x.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_print_settings_get_resolution_y = Interop.downcallHandle(
        "gtk_print_settings_get_resolution_y",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the value of {@code GTK_PRINT_SETTINGS_RESOLUTION_Y}.
     */
    public int getResolutionY() {
        try {
            var RESULT = (int) gtk_print_settings_get_resolution_y.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_print_settings_get_reverse = Interop.downcallHandle(
        "gtk_print_settings_get_reverse",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the value of {@code GTK_PRINT_SETTINGS_REVERSE}.
     */
    public boolean getReverse() {
        try {
            var RESULT = (int) gtk_print_settings_get_reverse.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_print_settings_get_scale = Interop.downcallHandle(
        "gtk_print_settings_get_scale",
        FunctionDescriptor.of(ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the value of {@code GTK_PRINT_SETTINGS_SCALE}.
     */
    public double getScale() {
        try {
            var RESULT = (double) gtk_print_settings_get_scale.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_print_settings_get_use_color = Interop.downcallHandle(
        "gtk_print_settings_get_use_color",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the value of {@code GTK_PRINT_SETTINGS_USE_COLOR}.
     */
    public boolean getUseColor() {
        try {
            var RESULT = (int) gtk_print_settings_get_use_color.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_print_settings_has_key = Interop.downcallHandle(
        "gtk_print_settings_has_key",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns {@code true}, if a value is associated with {@code key}.
     */
    public boolean hasKey(java.lang.String key) {
        try {
            var RESULT = (int) gtk_print_settings_has_key.invokeExact(handle(), Interop.allocateNativeString(key).handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_print_settings_load_file = Interop.downcallHandle(
        "gtk_print_settings_load_file",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Reads the print settings from {@code file_name}.
     * <p>
     * If the file could not be loaded then error is set to either
     * a {@code GFileError} or {@code GKeyFileError}.
     * <p>
     * See {@link PrintSettings#toFile}.
     */
    public boolean loadFile(java.lang.String fileName) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (int) gtk_print_settings_load_file.invokeExact(handle(), Interop.allocateNativeString(fileName).handle(), GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_print_settings_load_key_file = Interop.downcallHandle(
        "gtk_print_settings_load_key_file",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Reads the print settings from the group {@code group_name} in {@code key_file}.
     * <p>
     * If the file could not be loaded then error is set to either a
     * {@code GFileError} or {@code GKeyFileError}.
     */
    public boolean loadKeyFile(org.gtk.glib.KeyFile keyFile, java.lang.String groupName) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (int) gtk_print_settings_load_key_file.invokeExact(handle(), keyFile.handle(), Interop.allocateNativeString(groupName).handle(), GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_print_settings_set = Interop.downcallHandle(
        "gtk_print_settings_set",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Associates {@code value} with {@code key}.
     */
    public void set(java.lang.String key, java.lang.String value) {
        try {
            gtk_print_settings_set.invokeExact(handle(), Interop.allocateNativeString(key).handle(), Interop.allocateNativeString(value).handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_print_settings_set_bool = Interop.downcallHandle(
        "gtk_print_settings_set_bool",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets {@code key} to a boolean value.
     */
    public void setBool(java.lang.String key, boolean value) {
        try {
            gtk_print_settings_set_bool.invokeExact(handle(), Interop.allocateNativeString(key).handle(), value ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_print_settings_set_collate = Interop.downcallHandle(
        "gtk_print_settings_set_collate",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the value of {@code GTK_PRINT_SETTINGS_COLLATE}.
     */
    public void setCollate(boolean collate) {
        try {
            gtk_print_settings_set_collate.invokeExact(handle(), collate ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_print_settings_set_default_source = Interop.downcallHandle(
        "gtk_print_settings_set_default_source",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the value of {@code GTK_PRINT_SETTINGS_DEFAULT_SOURCE}.
     */
    public void setDefaultSource(java.lang.String defaultSource) {
        try {
            gtk_print_settings_set_default_source.invokeExact(handle(), Interop.allocateNativeString(defaultSource).handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_print_settings_set_dither = Interop.downcallHandle(
        "gtk_print_settings_set_dither",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the value of {@code GTK_PRINT_SETTINGS_DITHER}.
     */
    public void setDither(java.lang.String dither) {
        try {
            gtk_print_settings_set_dither.invokeExact(handle(), Interop.allocateNativeString(dither).handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_print_settings_set_double = Interop.downcallHandle(
        "gtk_print_settings_set_double",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE)
    );
    
    /**
     * Sets {@code key} to a double value.
     */
    public void setDouble(java.lang.String key, double value) {
        try {
            gtk_print_settings_set_double.invokeExact(handle(), Interop.allocateNativeString(key).handle(), value);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_print_settings_set_duplex = Interop.downcallHandle(
        "gtk_print_settings_set_duplex",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the value of {@code GTK_PRINT_SETTINGS_DUPLEX}.
     */
    public void setDuplex(PrintDuplex duplex) {
        try {
            gtk_print_settings_set_duplex.invokeExact(handle(), duplex.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_print_settings_set_finishings = Interop.downcallHandle(
        "gtk_print_settings_set_finishings",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the value of {@code GTK_PRINT_SETTINGS_FINISHINGS}.
     */
    public void setFinishings(java.lang.String finishings) {
        try {
            gtk_print_settings_set_finishings.invokeExact(handle(), Interop.allocateNativeString(finishings).handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_print_settings_set_int = Interop.downcallHandle(
        "gtk_print_settings_set_int",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets {@code key} to an integer value.
     */
    public void setInt(java.lang.String key, int value) {
        try {
            gtk_print_settings_set_int.invokeExact(handle(), Interop.allocateNativeString(key).handle(), value);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_print_settings_set_length = Interop.downcallHandle(
        "gtk_print_settings_set_length",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_INT)
    );
    
    /**
     * Associates a length in units of {@code unit} with {@code key}.
     */
    public void setLength(java.lang.String key, double value, Unit unit) {
        try {
            gtk_print_settings_set_length.invokeExact(handle(), Interop.allocateNativeString(key).handle(), value, unit.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_print_settings_set_media_type = Interop.downcallHandle(
        "gtk_print_settings_set_media_type",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the value of {@code GTK_PRINT_SETTINGS_MEDIA_TYPE}.
     * <p>
     * The set of media types is defined in PWG 5101.1-2002 PWG.
     */
    public void setMediaType(java.lang.String mediaType) {
        try {
            gtk_print_settings_set_media_type.invokeExact(handle(), Interop.allocateNativeString(mediaType).handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_print_settings_set_n_copies = Interop.downcallHandle(
        "gtk_print_settings_set_n_copies",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the value of {@code GTK_PRINT_SETTINGS_N_COPIES}.
     */
    public void setNCopies(int numCopies) {
        try {
            gtk_print_settings_set_n_copies.invokeExact(handle(), numCopies);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_print_settings_set_number_up = Interop.downcallHandle(
        "gtk_print_settings_set_number_up",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the value of {@code GTK_PRINT_SETTINGS_NUMBER_UP}.
     */
    public void setNumberUp(int numberUp) {
        try {
            gtk_print_settings_set_number_up.invokeExact(handle(), numberUp);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_print_settings_set_number_up_layout = Interop.downcallHandle(
        "gtk_print_settings_set_number_up_layout",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the value of {@code GTK_PRINT_SETTINGS_NUMBER_UP_LAYOUT}.
     */
    public void setNumberUpLayout(NumberUpLayout numberUpLayout) {
        try {
            gtk_print_settings_set_number_up_layout.invokeExact(handle(), numberUpLayout.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_print_settings_set_orientation = Interop.downcallHandle(
        "gtk_print_settings_set_orientation",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the value of {@code GTK_PRINT_SETTINGS_ORIENTATION}.
     */
    public void setOrientation(PageOrientation orientation) {
        try {
            gtk_print_settings_set_orientation.invokeExact(handle(), orientation.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_print_settings_set_output_bin = Interop.downcallHandle(
        "gtk_print_settings_set_output_bin",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the value of {@code GTK_PRINT_SETTINGS_OUTPUT_BIN}.
     */
    public void setOutputBin(java.lang.String outputBin) {
        try {
            gtk_print_settings_set_output_bin.invokeExact(handle(), Interop.allocateNativeString(outputBin).handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_print_settings_set_page_ranges = Interop.downcallHandle(
        "gtk_print_settings_set_page_ranges",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the value of {@code GTK_PRINT_SETTINGS_PAGE_RANGES}.
     */
    public void setPageRanges(PageRange[] pageRanges, int numRanges) {
        try {
            gtk_print_settings_set_page_ranges.invokeExact(handle(), Interop.allocateNativeArray(pageRanges).handle(), numRanges);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_print_settings_set_page_set = Interop.downcallHandle(
        "gtk_print_settings_set_page_set",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the value of {@code GTK_PRINT_SETTINGS_PAGE_SET}.
     */
    public void setPageSet(PageSet pageSet) {
        try {
            gtk_print_settings_set_page_set.invokeExact(handle(), pageSet.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_print_settings_set_paper_height = Interop.downcallHandle(
        "gtk_print_settings_set_paper_height",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the value of {@code GTK_PRINT_SETTINGS_PAPER_HEIGHT}.
     */
    public void setPaperHeight(double height, Unit unit) {
        try {
            gtk_print_settings_set_paper_height.invokeExact(handle(), height, unit.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_print_settings_set_paper_size = Interop.downcallHandle(
        "gtk_print_settings_set_paper_size",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the value of {@code GTK_PRINT_SETTINGS_PAPER_FORMAT},
     * {@code GTK_PRINT_SETTINGS_PAPER_WIDTH} and
     * {@code GTK_PRINT_SETTINGS_PAPER_HEIGHT}.
     */
    public void setPaperSize(PaperSize paperSize) {
        try {
            gtk_print_settings_set_paper_size.invokeExact(handle(), paperSize.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_print_settings_set_paper_width = Interop.downcallHandle(
        "gtk_print_settings_set_paper_width",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the value of {@code GTK_PRINT_SETTINGS_PAPER_WIDTH}.
     */
    public void setPaperWidth(double width, Unit unit) {
        try {
            gtk_print_settings_set_paper_width.invokeExact(handle(), width, unit.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_print_settings_set_print_pages = Interop.downcallHandle(
        "gtk_print_settings_set_print_pages",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the value of {@code GTK_PRINT_SETTINGS_PRINT_PAGES}.
     */
    public void setPrintPages(PrintPages pages) {
        try {
            gtk_print_settings_set_print_pages.invokeExact(handle(), pages.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_print_settings_set_printer = Interop.downcallHandle(
        "gtk_print_settings_set_printer",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Convenience function to set {@code GTK_PRINT_SETTINGS_PRINTER}
     * to {@code printer}.
     */
    public void setPrinter(java.lang.String printer) {
        try {
            gtk_print_settings_set_printer.invokeExact(handle(), Interop.allocateNativeString(printer).handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_print_settings_set_printer_lpi = Interop.downcallHandle(
        "gtk_print_settings_set_printer_lpi",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE)
    );
    
    /**
     * Sets the value of {@code GTK_PRINT_SETTINGS_PRINTER_LPI}.
     */
    public void setPrinterLpi(double lpi) {
        try {
            gtk_print_settings_set_printer_lpi.invokeExact(handle(), lpi);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_print_settings_set_quality = Interop.downcallHandle(
        "gtk_print_settings_set_quality",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the value of {@code GTK_PRINT_SETTINGS_QUALITY}.
     */
    public void setQuality(PrintQuality quality) {
        try {
            gtk_print_settings_set_quality.invokeExact(handle(), quality.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_print_settings_set_resolution = Interop.downcallHandle(
        "gtk_print_settings_set_resolution",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the values of {@code GTK_PRINT_SETTINGS_RESOLUTION},
     * {@code GTK_PRINT_SETTINGS_RESOLUTION_X} and
     * {@code GTK_PRINT_SETTINGS_RESOLUTION_Y}.
     */
    public void setResolution(int resolution) {
        try {
            gtk_print_settings_set_resolution.invokeExact(handle(), resolution);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_print_settings_set_resolution_xy = Interop.downcallHandle(
        "gtk_print_settings_set_resolution_xy",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the values of {@code GTK_PRINT_SETTINGS_RESOLUTION},
     * {@code GTK_PRINT_SETTINGS_RESOLUTION_X} and
     * {@code GTK_PRINT_SETTINGS_RESOLUTION_Y}.
     */
    public void setResolutionXy(int resolutionX, int resolutionY) {
        try {
            gtk_print_settings_set_resolution_xy.invokeExact(handle(), resolutionX, resolutionY);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_print_settings_set_reverse = Interop.downcallHandle(
        "gtk_print_settings_set_reverse",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the value of {@code GTK_PRINT_SETTINGS_REVERSE}.
     */
    public void setReverse(boolean reverse) {
        try {
            gtk_print_settings_set_reverse.invokeExact(handle(), reverse ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_print_settings_set_scale = Interop.downcallHandle(
        "gtk_print_settings_set_scale",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE)
    );
    
    /**
     * Sets the value of {@code GTK_PRINT_SETTINGS_SCALE}.
     */
    public void setScale(double scale) {
        try {
            gtk_print_settings_set_scale.invokeExact(handle(), scale);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_print_settings_set_use_color = Interop.downcallHandle(
        "gtk_print_settings_set_use_color",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the value of {@code GTK_PRINT_SETTINGS_USE_COLOR}.
     */
    public void setUseColor(boolean useColor) {
        try {
            gtk_print_settings_set_use_color.invokeExact(handle(), useColor ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_print_settings_to_file = Interop.downcallHandle(
        "gtk_print_settings_to_file",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * This function saves the print settings from {@code settings} to {@code file_name}.
     * <p>
     * If the file could not be written then error is set to either a
     * {@code GFileError} or {@code GKeyFileError}.
     */
    public boolean toFile(java.lang.String fileName) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (int) gtk_print_settings_to_file.invokeExact(handle(), Interop.allocateNativeString(fileName).handle(), GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_print_settings_to_gvariant = Interop.downcallHandle(
        "gtk_print_settings_to_gvariant",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Serialize print settings to an a{sv} variant.
     */
    public org.gtk.glib.Variant toGvariant() {
        try {
            var RESULT = (MemoryAddress) gtk_print_settings_to_gvariant.invokeExact(handle());
            return new org.gtk.glib.Variant(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_print_settings_to_key_file = Interop.downcallHandle(
        "gtk_print_settings_to_key_file",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * This function adds the print settings from {@code settings} to {@code key_file}.
     */
    public void toKeyFile(org.gtk.glib.KeyFile keyFile, java.lang.String groupName) {
        try {
            gtk_print_settings_to_key_file.invokeExact(handle(), keyFile.handle(), Interop.allocateNativeString(groupName).handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_print_settings_unset = Interop.downcallHandle(
        "gtk_print_settings_unset",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Removes any value associated with {@code key}.
     * <p>
     * This has the same effect as setting the value to {@code null}.
     */
    public void unset(java.lang.String key) {
        try {
            gtk_print_settings_unset.invokeExact(handle(), Interop.allocateNativeString(key).handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
