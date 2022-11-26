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
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkPrintSettings";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a PrintSettings proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public PrintSettings(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to PrintSettings if its GType is a (or inherits from) "GtkPrintSettings".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code PrintSettings} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GtkPrintSettings", a ClassCastException will be thrown.
     */
    public static PrintSettings castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), PrintSettings.getType())) {
            return new PrintSettings(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GtkPrintSettings");
        }
    }
    
    private static Addressable constructNew() {
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_print_settings_new.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@code GtkPrintSettings} object.
     */
    public PrintSettings() {
        super(constructNew(), Ownership.FULL);
    }
    
    private static Addressable constructNewFromFile(@NotNull java.lang.String fileName) throws GErrorException {
        java.util.Objects.requireNonNull(fileName, "Parameter 'fileName' must not be null");
        MemorySegment GERROR = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_print_settings_new_from_file.invokeExact(
                    Interop.allocateNativeString(fileName),
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT;
    }
    
    /**
     * Reads the print settings from {@code file_name}.
     * <p>
     * Returns a new {@code GtkPrintSettings} object with the restored settings,
     * or {@code null} if an error occurred. If the file could not be loaded then
     * error is set to either a {@code GFileError} or {@code GKeyFileError}.
     * <p>
     * See {@link PrintSettings#toFile}.
     * @param fileName the filename to read the settings from
     * @return the restored {@code GtkPrintSettings}
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public static PrintSettings newFromFile(@NotNull java.lang.String fileName) throws GErrorException {
        return new PrintSettings(constructNewFromFile(fileName), Ownership.FULL);
    }
    
    private static Addressable constructNewFromGvariant(@NotNull org.gtk.glib.Variant variant) {
        java.util.Objects.requireNonNull(variant, "Parameter 'variant' must not be null");
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_print_settings_new_from_gvariant.invokeExact(
                    variant.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Deserialize print settings from an a{sv} variant.
     * <p>
     * The variant must be in the format produced by
     * {@link PrintSettings#toGvariant}.
     * @param variant an a{sv} {@code GVariant}
     * @return a new {@code GtkPrintSettings} object
     */
    public static PrintSettings newFromGvariant(@NotNull org.gtk.glib.Variant variant) {
        return new PrintSettings(constructNewFromGvariant(variant), Ownership.FULL);
    }
    
    private static Addressable constructNewFromKeyFile(@NotNull org.gtk.glib.KeyFile keyFile, @Nullable java.lang.String groupName) throws GErrorException {
        java.util.Objects.requireNonNull(keyFile, "Parameter 'keyFile' must not be null");
        MemorySegment GERROR = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_print_settings_new_from_key_file.invokeExact(
                    keyFile.handle(),
                    (Addressable) (groupName == null ? MemoryAddress.NULL : Interop.allocateNativeString(groupName)),
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT;
    }
    
    /**
     * Reads the print settings from the group {@code group_name} in {@code key_file}.
     * <p>
     * Returns a new {@code GtkPrintSettings} object with the restored settings,
     * or {@code null} if an error occurred. If the file could not be loaded then
     * error is set to either {@code GFileError} or {@code GKeyFileError}.
     * @param keyFile the {@code GKeyFile} to retrieve the settings from
     * @param groupName the name of the group to use, or {@code null} to use
     *   the default “Print Settings”
     * @return the restored {@code GtkPrintSettings}
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public static PrintSettings newFromKeyFile(@NotNull org.gtk.glib.KeyFile keyFile, @Nullable java.lang.String groupName) throws GErrorException {
        return new PrintSettings(constructNewFromKeyFile(keyFile, groupName), Ownership.FULL);
    }
    
    /**
     * Copies a {@code GtkPrintSettings} object.
     * @return a newly allocated copy of {@code other}
     */
    public @NotNull org.gtk.gtk.PrintSettings copy() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_print_settings_copy.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.PrintSettings(RESULT, Ownership.FULL);
    }
    
    /**
     * Calls {@code func} for each key-value pair of {@code settings}.
     * @param func the function to call
     */
    public void foreach(@NotNull org.gtk.gtk.PrintSettingsFunc func) {
        java.util.Objects.requireNonNull(func, "Parameter 'func' must not be null");
        try {
            DowncallHandles.gtk_print_settings_foreach.invokeExact(
                    handle(),
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gtk.Callbacks.class, "cbPrintSettingsFunc",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                        Interop.getScope()),
                    (Addressable) (Interop.registerCallback(func)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Looks up the string value associated with {@code key}.
     * @param key a key
     * @return the string value for {@code key}
     */
    public @Nullable java.lang.String getString(@NotNull java.lang.String key) {
        java.util.Objects.requireNonNull(key, "Parameter 'key' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_print_settings_get.invokeExact(
                    handle(),
                    Interop.allocateNativeString(key));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Returns the boolean represented by the value
     * that is associated with {@code key}.
     * <p>
     * The string “true” represents {@code true}, any other
     * string {@code false}.
     * @param key a key
     * @return {@code true}, if {@code key} maps to a true value.
     */
    public boolean getBool(@NotNull java.lang.String key) {
        java.util.Objects.requireNonNull(key, "Parameter 'key' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_print_settings_get_bool.invokeExact(
                    handle(),
                    Interop.allocateNativeString(key));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Gets the value of {@code GTK_PRINT_SETTINGS_COLLATE}.
     * @return whether to collate the printed pages
     */
    public boolean getCollate() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_print_settings_get_collate.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Gets the value of {@code GTK_PRINT_SETTINGS_DEFAULT_SOURCE}.
     * @return the default source
     */
    public @Nullable java.lang.String getDefaultSource() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_print_settings_get_default_source.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Gets the value of {@code GTK_PRINT_SETTINGS_DITHER}.
     * @return the dithering that is used
     */
    public @Nullable java.lang.String getDither() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_print_settings_get_dither.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Returns the double value associated with {@code key}, or 0.
     * @param key a key
     * @return the double value of {@code key}
     */
    public double getDouble(@NotNull java.lang.String key) {
        java.util.Objects.requireNonNull(key, "Parameter 'key' must not be null");
        double RESULT;
        try {
            RESULT = (double) DowncallHandles.gtk_print_settings_get_double.invokeExact(
                    handle(),
                    Interop.allocateNativeString(key));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Returns the floating point number represented by
     * the value that is associated with {@code key}, or {@code default_val}
     * if the value does not represent a floating point number.
     * <p>
     * Floating point numbers are parsed with g_ascii_strtod().
     * @param key a key
     * @param def the default value
     * @return the floating point number associated with {@code key}
     */
    public double getDoubleWithDefault(@NotNull java.lang.String key, double def) {
        java.util.Objects.requireNonNull(key, "Parameter 'key' must not be null");
        double RESULT;
        try {
            RESULT = (double) DowncallHandles.gtk_print_settings_get_double_with_default.invokeExact(
                    handle(),
                    Interop.allocateNativeString(key),
                    def);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Gets the value of {@code GTK_PRINT_SETTINGS_DUPLEX}.
     * @return whether to print the output in duplex.
     */
    public @NotNull org.gtk.gtk.PrintDuplex getDuplex() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_print_settings_get_duplex.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.PrintDuplex(RESULT);
    }
    
    /**
     * Gets the value of {@code GTK_PRINT_SETTINGS_FINISHINGS}.
     * @return the finishings
     */
    public @Nullable java.lang.String getFinishings() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_print_settings_get_finishings.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Returns the integer value of {@code key}, or 0.
     * @param key a key
     * @return the integer value of {@code key}
     */
    public int getInt(@NotNull java.lang.String key) {
        java.util.Objects.requireNonNull(key, "Parameter 'key' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_print_settings_get_int.invokeExact(
                    handle(),
                    Interop.allocateNativeString(key));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Returns the value of {@code key}, interpreted as
     * an integer, or the default value.
     * @param key a key
     * @param def the default value
     * @return the integer value of {@code key}
     */
    public int getIntWithDefault(@NotNull java.lang.String key, int def) {
        java.util.Objects.requireNonNull(key, "Parameter 'key' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_print_settings_get_int_with_default.invokeExact(
                    handle(),
                    Interop.allocateNativeString(key),
                    def);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Returns the value associated with {@code key}, interpreted
     * as a length.
     * <p>
     * The returned value is converted to {@code units}.
     * @param key a key
     * @param unit the unit of the return value
     * @return the length value of {@code key}, converted to {@code unit}
     */
    public double getLength(@NotNull java.lang.String key, @NotNull org.gtk.gtk.Unit unit) {
        java.util.Objects.requireNonNull(key, "Parameter 'key' must not be null");
        java.util.Objects.requireNonNull(unit, "Parameter 'unit' must not be null");
        double RESULT;
        try {
            RESULT = (double) DowncallHandles.gtk_print_settings_get_length.invokeExact(
                    handle(),
                    Interop.allocateNativeString(key),
                    unit.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Gets the value of {@code GTK_PRINT_SETTINGS_MEDIA_TYPE}.
     * <p>
     * The set of media types is defined in PWG 5101.1-2002 PWG.
     * @return the media type
     */
    public @Nullable java.lang.String getMediaType() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_print_settings_get_media_type.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Gets the value of {@code GTK_PRINT_SETTINGS_N_COPIES}.
     * @return the number of copies to print
     */
    public int getNCopies() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_print_settings_get_n_copies.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Gets the value of {@code GTK_PRINT_SETTINGS_NUMBER_UP}.
     * @return the number of pages per sheet
     */
    public int getNumberUp() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_print_settings_get_number_up.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Gets the value of {@code GTK_PRINT_SETTINGS_NUMBER_UP_LAYOUT}.
     * @return layout of page in number-up mode
     */
    public @NotNull org.gtk.gtk.NumberUpLayout getNumberUpLayout() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_print_settings_get_number_up_layout.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.NumberUpLayout(RESULT);
    }
    
    /**
     * Get the value of {@code GTK_PRINT_SETTINGS_ORIENTATION},
     * converted to a {@code GtkPageOrientation}.
     * @return the orientation
     */
    public @NotNull org.gtk.gtk.PageOrientation getOrientation() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_print_settings_get_orientation.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.PageOrientation(RESULT);
    }
    
    /**
     * Gets the value of {@code GTK_PRINT_SETTINGS_OUTPUT_BIN}.
     * @return the output bin
     */
    public @Nullable java.lang.String getOutputBin() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_print_settings_get_output_bin.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Gets the value of {@code GTK_PRINT_SETTINGS_PAGE_RANGES}.
     * @param numRanges return location for the length of the returned array
     * @return an array
     *   of {@code GtkPageRange}s. Use g_free() to free the array when
     *   it is no longer needed.
     */
    public @NotNull org.gtk.gtk.PageRange[] getPageRanges(Out<Integer> numRanges) {
        java.util.Objects.requireNonNull(numRanges, "Parameter 'numRanges' must not be null");
        MemorySegment numRangesPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_print_settings_get_page_ranges.invokeExact(
                    handle(),
                    (Addressable) numRangesPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        numRanges.set(numRangesPOINTER.get(Interop.valueLayout.C_INT, 0));
        org.gtk.gtk.PageRange[] resultARRAY = new org.gtk.gtk.PageRange[numRanges.get().intValue()];
        for (int I = 0; I < numRanges.get().intValue(); I++) {
            var OBJ = RESULT.get(Interop.valueLayout.ADDRESS, I);
            resultARRAY[I] = new org.gtk.gtk.PageRange(OBJ, Ownership.FULL);
        }
        return resultARRAY;
    }
    
    /**
     * Gets the value of {@code GTK_PRINT_SETTINGS_PAGE_SET}.
     * @return the set of pages to print
     */
    public @NotNull org.gtk.gtk.PageSet getPageSet() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_print_settings_get_page_set.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.PageSet(RESULT);
    }
    
    /**
     * Gets the value of {@code GTK_PRINT_SETTINGS_PAPER_HEIGHT},
     * converted to {@code unit}.
     * @param unit the unit for the return value
     * @return the paper height, in units of {@code unit}
     */
    public double getPaperHeight(@NotNull org.gtk.gtk.Unit unit) {
        java.util.Objects.requireNonNull(unit, "Parameter 'unit' must not be null");
        double RESULT;
        try {
            RESULT = (double) DowncallHandles.gtk_print_settings_get_paper_height.invokeExact(
                    handle(),
                    unit.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Gets the value of {@code GTK_PRINT_SETTINGS_PAPER_FORMAT},
     * converted to a {@code GtkPaperSize}.
     * @return the paper size
     */
    public @Nullable org.gtk.gtk.PaperSize getPaperSize() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_print_settings_get_paper_size.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.PaperSize(RESULT, Ownership.FULL);
    }
    
    /**
     * Gets the value of {@code GTK_PRINT_SETTINGS_PAPER_WIDTH},
     * converted to {@code unit}.
     * @param unit the unit for the return value
     * @return the paper width, in units of {@code unit}
     */
    public double getPaperWidth(@NotNull org.gtk.gtk.Unit unit) {
        java.util.Objects.requireNonNull(unit, "Parameter 'unit' must not be null");
        double RESULT;
        try {
            RESULT = (double) DowncallHandles.gtk_print_settings_get_paper_width.invokeExact(
                    handle(),
                    unit.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Gets the value of {@code GTK_PRINT_SETTINGS_PRINT_PAGES}.
     * @return which pages to print
     */
    public @NotNull org.gtk.gtk.PrintPages getPrintPages() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_print_settings_get_print_pages.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.PrintPages(RESULT);
    }
    
    /**
     * Convenience function to obtain the value of
     * {@code GTK_PRINT_SETTINGS_PRINTER}.
     * @return the printer name
     */
    public @Nullable java.lang.String getPrinter() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_print_settings_get_printer.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Gets the value of {@code GTK_PRINT_SETTINGS_PRINTER_LPI}.
     * @return the resolution in lpi (lines per inch)
     */
    public double getPrinterLpi() {
        double RESULT;
        try {
            RESULT = (double) DowncallHandles.gtk_print_settings_get_printer_lpi.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Gets the value of {@code GTK_PRINT_SETTINGS_QUALITY}.
     * @return the print quality
     */
    public @NotNull org.gtk.gtk.PrintQuality getQuality() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_print_settings_get_quality.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.PrintQuality(RESULT);
    }
    
    /**
     * Gets the value of {@code GTK_PRINT_SETTINGS_RESOLUTION}.
     * @return the resolution in dpi
     */
    public int getResolution() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_print_settings_get_resolution.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Gets the value of {@code GTK_PRINT_SETTINGS_RESOLUTION_X}.
     * @return the horizontal resolution in dpi
     */
    public int getResolutionX() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_print_settings_get_resolution_x.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Gets the value of {@code GTK_PRINT_SETTINGS_RESOLUTION_Y}.
     * @return the vertical resolution in dpi
     */
    public int getResolutionY() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_print_settings_get_resolution_y.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Gets the value of {@code GTK_PRINT_SETTINGS_REVERSE}.
     * @return whether to reverse the order of the printed pages
     */
    public boolean getReverse() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_print_settings_get_reverse.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Gets the value of {@code GTK_PRINT_SETTINGS_SCALE}.
     * @return the scale in percent
     */
    public double getScale() {
        double RESULT;
        try {
            RESULT = (double) DowncallHandles.gtk_print_settings_get_scale.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Gets the value of {@code GTK_PRINT_SETTINGS_USE_COLOR}.
     * @return whether to use color
     */
    public boolean getUseColor() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_print_settings_get_use_color.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Returns {@code true}, if a value is associated with {@code key}.
     * @param key a key
     * @return {@code true}, if {@code key} has a value
     */
    public boolean hasKey(@NotNull java.lang.String key) {
        java.util.Objects.requireNonNull(key, "Parameter 'key' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_print_settings_has_key.invokeExact(
                    handle(),
                    Interop.allocateNativeString(key));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Reads the print settings from {@code file_name}.
     * <p>
     * If the file could not be loaded then error is set to either
     * a {@code GFileError} or {@code GKeyFileError}.
     * <p>
     * See {@link PrintSettings#toFile}.
     * @param fileName the filename to read the settings from
     * @return {@code true} on success
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public boolean loadFile(@NotNull java.lang.String fileName) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNull(fileName, "Parameter 'fileName' must not be null");
        MemorySegment GERROR = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_print_settings_load_file.invokeExact(
                    handle(),
                    Interop.allocateNativeString(fileName),
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT != 0;
    }
    
    /**
     * Reads the print settings from the group {@code group_name} in {@code key_file}.
     * <p>
     * If the file could not be loaded then error is set to either a
     * {@code GFileError} or {@code GKeyFileError}.
     * @param keyFile the {@code GKeyFile} to retrieve the settings from
     * @param groupName the name of the group to use, or {@code null}
     *   to use the default “Print Settings”
     * @return {@code true} on success
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public boolean loadKeyFile(@NotNull org.gtk.glib.KeyFile keyFile, @Nullable java.lang.String groupName) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNull(keyFile, "Parameter 'keyFile' must not be null");
        MemorySegment GERROR = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_print_settings_load_key_file.invokeExact(
                    handle(),
                    keyFile.handle(),
                    (Addressable) (groupName == null ? MemoryAddress.NULL : Interop.allocateNativeString(groupName)),
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT != 0;
    }
    
    /**
     * Associates {@code value} with {@code key}.
     * @param key a key
     * @param value a string value
     */
    public void set(@NotNull java.lang.String key, @Nullable java.lang.String value) {
        java.util.Objects.requireNonNull(key, "Parameter 'key' must not be null");
        try {
            DowncallHandles.gtk_print_settings_set.invokeExact(
                    handle(),
                    Interop.allocateNativeString(key),
                    (Addressable) (value == null ? MemoryAddress.NULL : Interop.allocateNativeString(value)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets {@code key} to a boolean value.
     * @param key a key
     * @param value a boolean
     */
    public void setBool(@NotNull java.lang.String key, boolean value) {
        java.util.Objects.requireNonNull(key, "Parameter 'key' must not be null");
        try {
            DowncallHandles.gtk_print_settings_set_bool.invokeExact(
                    handle(),
                    Interop.allocateNativeString(key),
                    value ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the value of {@code GTK_PRINT_SETTINGS_COLLATE}.
     * @param collate whether to collate the output
     */
    public void setCollate(boolean collate) {
        try {
            DowncallHandles.gtk_print_settings_set_collate.invokeExact(
                    handle(),
                    collate ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the value of {@code GTK_PRINT_SETTINGS_DEFAULT_SOURCE}.
     * @param defaultSource the default source
     */
    public void setDefaultSource(@NotNull java.lang.String defaultSource) {
        java.util.Objects.requireNonNull(defaultSource, "Parameter 'defaultSource' must not be null");
        try {
            DowncallHandles.gtk_print_settings_set_default_source.invokeExact(
                    handle(),
                    Interop.allocateNativeString(defaultSource));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the value of {@code GTK_PRINT_SETTINGS_DITHER}.
     * @param dither the dithering that is used
     */
    public void setDither(@NotNull java.lang.String dither) {
        java.util.Objects.requireNonNull(dither, "Parameter 'dither' must not be null");
        try {
            DowncallHandles.gtk_print_settings_set_dither.invokeExact(
                    handle(),
                    Interop.allocateNativeString(dither));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets {@code key} to a double value.
     * @param key a key
     * @param value a double value
     */
    public void setDouble(@NotNull java.lang.String key, double value) {
        java.util.Objects.requireNonNull(key, "Parameter 'key' must not be null");
        try {
            DowncallHandles.gtk_print_settings_set_double.invokeExact(
                    handle(),
                    Interop.allocateNativeString(key),
                    value);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the value of {@code GTK_PRINT_SETTINGS_DUPLEX}.
     * @param duplex a {@code GtkPrintDuplex} value
     */
    public void setDuplex(@NotNull org.gtk.gtk.PrintDuplex duplex) {
        java.util.Objects.requireNonNull(duplex, "Parameter 'duplex' must not be null");
        try {
            DowncallHandles.gtk_print_settings_set_duplex.invokeExact(
                    handle(),
                    duplex.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the value of {@code GTK_PRINT_SETTINGS_FINISHINGS}.
     * @param finishings the finishings
     */
    public void setFinishings(@NotNull java.lang.String finishings) {
        java.util.Objects.requireNonNull(finishings, "Parameter 'finishings' must not be null");
        try {
            DowncallHandles.gtk_print_settings_set_finishings.invokeExact(
                    handle(),
                    Interop.allocateNativeString(finishings));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets {@code key} to an integer value.
     * @param key a key
     * @param value an integer
     */
    public void setInt(@NotNull java.lang.String key, int value) {
        java.util.Objects.requireNonNull(key, "Parameter 'key' must not be null");
        try {
            DowncallHandles.gtk_print_settings_set_int.invokeExact(
                    handle(),
                    Interop.allocateNativeString(key),
                    value);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Associates a length in units of {@code unit} with {@code key}.
     * @param key a key
     * @param value a length
     * @param unit the unit of {@code length}
     */
    public void setLength(@NotNull java.lang.String key, double value, @NotNull org.gtk.gtk.Unit unit) {
        java.util.Objects.requireNonNull(key, "Parameter 'key' must not be null");
        java.util.Objects.requireNonNull(unit, "Parameter 'unit' must not be null");
        try {
            DowncallHandles.gtk_print_settings_set_length.invokeExact(
                    handle(),
                    Interop.allocateNativeString(key),
                    value,
                    unit.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the value of {@code GTK_PRINT_SETTINGS_MEDIA_TYPE}.
     * <p>
     * The set of media types is defined in PWG 5101.1-2002 PWG.
     * @param mediaType the media type
     */
    public void setMediaType(@NotNull java.lang.String mediaType) {
        java.util.Objects.requireNonNull(mediaType, "Parameter 'mediaType' must not be null");
        try {
            DowncallHandles.gtk_print_settings_set_media_type.invokeExact(
                    handle(),
                    Interop.allocateNativeString(mediaType));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the value of {@code GTK_PRINT_SETTINGS_N_COPIES}.
     * @param numCopies the number of copies
     */
    public void setNCopies(int numCopies) {
        try {
            DowncallHandles.gtk_print_settings_set_n_copies.invokeExact(
                    handle(),
                    numCopies);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the value of {@code GTK_PRINT_SETTINGS_NUMBER_UP}.
     * @param numberUp the number of pages per sheet
     */
    public void setNumberUp(int numberUp) {
        try {
            DowncallHandles.gtk_print_settings_set_number_up.invokeExact(
                    handle(),
                    numberUp);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the value of {@code GTK_PRINT_SETTINGS_NUMBER_UP_LAYOUT}.
     * @param numberUpLayout a {@code GtkNumberUpLayout} value
     */
    public void setNumberUpLayout(@NotNull org.gtk.gtk.NumberUpLayout numberUpLayout) {
        java.util.Objects.requireNonNull(numberUpLayout, "Parameter 'numberUpLayout' must not be null");
        try {
            DowncallHandles.gtk_print_settings_set_number_up_layout.invokeExact(
                    handle(),
                    numberUpLayout.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the value of {@code GTK_PRINT_SETTINGS_ORIENTATION}.
     * @param orientation a page orientation
     */
    public void setOrientation(@NotNull org.gtk.gtk.PageOrientation orientation) {
        java.util.Objects.requireNonNull(orientation, "Parameter 'orientation' must not be null");
        try {
            DowncallHandles.gtk_print_settings_set_orientation.invokeExact(
                    handle(),
                    orientation.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the value of {@code GTK_PRINT_SETTINGS_OUTPUT_BIN}.
     * @param outputBin the output bin
     */
    public void setOutputBin(@NotNull java.lang.String outputBin) {
        java.util.Objects.requireNonNull(outputBin, "Parameter 'outputBin' must not be null");
        try {
            DowncallHandles.gtk_print_settings_set_output_bin.invokeExact(
                    handle(),
                    Interop.allocateNativeString(outputBin));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the value of {@code GTK_PRINT_SETTINGS_PAGE_RANGES}.
     * @param pageRanges an array of {@code GtkPageRange}s
     * @param numRanges the length of {@code page_ranges}
     */
    public void setPageRanges(@NotNull org.gtk.gtk.PageRange[] pageRanges, int numRanges) {
        java.util.Objects.requireNonNull(pageRanges, "Parameter 'pageRanges' must not be null");
        try {
            DowncallHandles.gtk_print_settings_set_page_ranges.invokeExact(
                    handle(),
                    Interop.allocateNativeArray(pageRanges, org.gtk.gtk.PageRange.getMemoryLayout(), false),
                    numRanges);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the value of {@code GTK_PRINT_SETTINGS_PAGE_SET}.
     * @param pageSet a {@code GtkPageSet} value
     */
    public void setPageSet(@NotNull org.gtk.gtk.PageSet pageSet) {
        java.util.Objects.requireNonNull(pageSet, "Parameter 'pageSet' must not be null");
        try {
            DowncallHandles.gtk_print_settings_set_page_set.invokeExact(
                    handle(),
                    pageSet.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the value of {@code GTK_PRINT_SETTINGS_PAPER_HEIGHT}.
     * @param height the paper height
     * @param unit the units of {@code height}
     */
    public void setPaperHeight(double height, @NotNull org.gtk.gtk.Unit unit) {
        java.util.Objects.requireNonNull(unit, "Parameter 'unit' must not be null");
        try {
            DowncallHandles.gtk_print_settings_set_paper_height.invokeExact(
                    handle(),
                    height,
                    unit.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the value of {@code GTK_PRINT_SETTINGS_PAPER_FORMAT},
     * {@code GTK_PRINT_SETTINGS_PAPER_WIDTH} and
     * {@code GTK_PRINT_SETTINGS_PAPER_HEIGHT}.
     * @param paperSize a paper size
     */
    public void setPaperSize(@NotNull org.gtk.gtk.PaperSize paperSize) {
        java.util.Objects.requireNonNull(paperSize, "Parameter 'paperSize' must not be null");
        try {
            DowncallHandles.gtk_print_settings_set_paper_size.invokeExact(
                    handle(),
                    paperSize.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the value of {@code GTK_PRINT_SETTINGS_PAPER_WIDTH}.
     * @param width the paper width
     * @param unit the units of {@code width}
     */
    public void setPaperWidth(double width, @NotNull org.gtk.gtk.Unit unit) {
        java.util.Objects.requireNonNull(unit, "Parameter 'unit' must not be null");
        try {
            DowncallHandles.gtk_print_settings_set_paper_width.invokeExact(
                    handle(),
                    width,
                    unit.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the value of {@code GTK_PRINT_SETTINGS_PRINT_PAGES}.
     * @param pages a {@code GtkPrintPages} value
     */
    public void setPrintPages(@NotNull org.gtk.gtk.PrintPages pages) {
        java.util.Objects.requireNonNull(pages, "Parameter 'pages' must not be null");
        try {
            DowncallHandles.gtk_print_settings_set_print_pages.invokeExact(
                    handle(),
                    pages.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Convenience function to set {@code GTK_PRINT_SETTINGS_PRINTER}
     * to {@code printer}.
     * @param printer the printer name
     */
    public void setPrinter(@NotNull java.lang.String printer) {
        java.util.Objects.requireNonNull(printer, "Parameter 'printer' must not be null");
        try {
            DowncallHandles.gtk_print_settings_set_printer.invokeExact(
                    handle(),
                    Interop.allocateNativeString(printer));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the value of {@code GTK_PRINT_SETTINGS_PRINTER_LPI}.
     * @param lpi the resolution in lpi (lines per inch)
     */
    public void setPrinterLpi(double lpi) {
        try {
            DowncallHandles.gtk_print_settings_set_printer_lpi.invokeExact(
                    handle(),
                    lpi);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the value of {@code GTK_PRINT_SETTINGS_QUALITY}.
     * @param quality a {@code GtkPrintQuality} value
     */
    public void setQuality(@NotNull org.gtk.gtk.PrintQuality quality) {
        java.util.Objects.requireNonNull(quality, "Parameter 'quality' must not be null");
        try {
            DowncallHandles.gtk_print_settings_set_quality.invokeExact(
                    handle(),
                    quality.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the values of {@code GTK_PRINT_SETTINGS_RESOLUTION},
     * {@code GTK_PRINT_SETTINGS_RESOLUTION_X} and
     * {@code GTK_PRINT_SETTINGS_RESOLUTION_Y}.
     * @param resolution the resolution in dpi
     */
    public void setResolution(int resolution) {
        try {
            DowncallHandles.gtk_print_settings_set_resolution.invokeExact(
                    handle(),
                    resolution);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the values of {@code GTK_PRINT_SETTINGS_RESOLUTION},
     * {@code GTK_PRINT_SETTINGS_RESOLUTION_X} and
     * {@code GTK_PRINT_SETTINGS_RESOLUTION_Y}.
     * @param resolutionX the horizontal resolution in dpi
     * @param resolutionY the vertical resolution in dpi
     */
    public void setResolutionXy(int resolutionX, int resolutionY) {
        try {
            DowncallHandles.gtk_print_settings_set_resolution_xy.invokeExact(
                    handle(),
                    resolutionX,
                    resolutionY);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the value of {@code GTK_PRINT_SETTINGS_REVERSE}.
     * @param reverse whether to reverse the output
     */
    public void setReverse(boolean reverse) {
        try {
            DowncallHandles.gtk_print_settings_set_reverse.invokeExact(
                    handle(),
                    reverse ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the value of {@code GTK_PRINT_SETTINGS_SCALE}.
     * @param scale the scale in percent
     */
    public void setScale(double scale) {
        try {
            DowncallHandles.gtk_print_settings_set_scale.invokeExact(
                    handle(),
                    scale);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the value of {@code GTK_PRINT_SETTINGS_USE_COLOR}.
     * @param useColor whether to use color
     */
    public void setUseColor(boolean useColor) {
        try {
            DowncallHandles.gtk_print_settings_set_use_color.invokeExact(
                    handle(),
                    useColor ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * This function saves the print settings from {@code settings} to {@code file_name}.
     * <p>
     * If the file could not be written then error is set to either a
     * {@code GFileError} or {@code GKeyFileError}.
     * @param fileName the file to save to
     * @return {@code true} on success
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public boolean toFile(@NotNull java.lang.String fileName) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNull(fileName, "Parameter 'fileName' must not be null");
        MemorySegment GERROR = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_print_settings_to_file.invokeExact(
                    handle(),
                    Interop.allocateNativeString(fileName),
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT != 0;
    }
    
    /**
     * Serialize print settings to an a{sv} variant.
     * @return a new, floating, {@code GVariant}
     */
    public @NotNull org.gtk.glib.Variant toGvariant() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_print_settings_to_gvariant.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Variant(RESULT, Ownership.NONE);
    }
    
    /**
     * This function adds the print settings from {@code settings} to {@code key_file}.
     * @param keyFile the {@code GKeyFile} to save the print settings to
     * @param groupName the group to add the settings to in {@code key_file}, or
     *   {@code null} to use the default “Print Settings”
     */
    public void toKeyFile(@NotNull org.gtk.glib.KeyFile keyFile, @Nullable java.lang.String groupName) {
        java.util.Objects.requireNonNull(keyFile, "Parameter 'keyFile' must not be null");
        try {
            DowncallHandles.gtk_print_settings_to_key_file.invokeExact(
                    handle(),
                    keyFile.handle(),
                    (Addressable) (groupName == null ? MemoryAddress.NULL : Interop.allocateNativeString(groupName)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Removes any value associated with {@code key}.
     * <p>
     * This has the same effect as setting the value to {@code null}.
     * @param key a key
     */
    public void unset(@NotNull java.lang.String key) {
        java.util.Objects.requireNonNull(key, "Parameter 'key' must not be null");
        try {
            DowncallHandles.gtk_print_settings_unset.invokeExact(
                    handle(),
                    Interop.allocateNativeString(key));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static @NotNull org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gtk_print_settings_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * GObjects with properties.
     */
    public static class Build extends org.gtk.gobject.Object.Build {
        
         /**
         * A {@link PrintSettings.Build} object constructs a {@link PrintSettings} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link PrintSettings} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link PrintSettings} using {@link PrintSettings#castFrom}.
         * @return A new instance of {@code PrintSettings} with the properties 
         *         that were set in the Build object.
         */
        public PrintSettings construct() {
            return PrintSettings.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    PrintSettings.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_print_settings_new = Interop.downcallHandle(
            "gtk_print_settings_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_print_settings_new_from_file = Interop.downcallHandle(
            "gtk_print_settings_new_from_file",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_print_settings_new_from_gvariant = Interop.downcallHandle(
            "gtk_print_settings_new_from_gvariant",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_print_settings_new_from_key_file = Interop.downcallHandle(
            "gtk_print_settings_new_from_key_file",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_print_settings_copy = Interop.downcallHandle(
            "gtk_print_settings_copy",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_print_settings_foreach = Interop.downcallHandle(
            "gtk_print_settings_foreach",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_print_settings_get = Interop.downcallHandle(
            "gtk_print_settings_get",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_print_settings_get_bool = Interop.downcallHandle(
            "gtk_print_settings_get_bool",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_print_settings_get_collate = Interop.downcallHandle(
            "gtk_print_settings_get_collate",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_print_settings_get_default_source = Interop.downcallHandle(
            "gtk_print_settings_get_default_source",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_print_settings_get_dither = Interop.downcallHandle(
            "gtk_print_settings_get_dither",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_print_settings_get_double = Interop.downcallHandle(
            "gtk_print_settings_get_double",
            FunctionDescriptor.of(Interop.valueLayout.C_DOUBLE, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_print_settings_get_double_with_default = Interop.downcallHandle(
            "gtk_print_settings_get_double_with_default",
            FunctionDescriptor.of(Interop.valueLayout.C_DOUBLE, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_DOUBLE),
            false
        );
        
        private static final MethodHandle gtk_print_settings_get_duplex = Interop.downcallHandle(
            "gtk_print_settings_get_duplex",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_print_settings_get_finishings = Interop.downcallHandle(
            "gtk_print_settings_get_finishings",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_print_settings_get_int = Interop.downcallHandle(
            "gtk_print_settings_get_int",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_print_settings_get_int_with_default = Interop.downcallHandle(
            "gtk_print_settings_get_int_with_default",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_print_settings_get_length = Interop.downcallHandle(
            "gtk_print_settings_get_length",
            FunctionDescriptor.of(Interop.valueLayout.C_DOUBLE, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_print_settings_get_media_type = Interop.downcallHandle(
            "gtk_print_settings_get_media_type",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_print_settings_get_n_copies = Interop.downcallHandle(
            "gtk_print_settings_get_n_copies",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_print_settings_get_number_up = Interop.downcallHandle(
            "gtk_print_settings_get_number_up",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_print_settings_get_number_up_layout = Interop.downcallHandle(
            "gtk_print_settings_get_number_up_layout",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_print_settings_get_orientation = Interop.downcallHandle(
            "gtk_print_settings_get_orientation",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_print_settings_get_output_bin = Interop.downcallHandle(
            "gtk_print_settings_get_output_bin",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_print_settings_get_page_ranges = Interop.downcallHandle(
            "gtk_print_settings_get_page_ranges",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_print_settings_get_page_set = Interop.downcallHandle(
            "gtk_print_settings_get_page_set",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_print_settings_get_paper_height = Interop.downcallHandle(
            "gtk_print_settings_get_paper_height",
            FunctionDescriptor.of(Interop.valueLayout.C_DOUBLE, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_print_settings_get_paper_size = Interop.downcallHandle(
            "gtk_print_settings_get_paper_size",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_print_settings_get_paper_width = Interop.downcallHandle(
            "gtk_print_settings_get_paper_width",
            FunctionDescriptor.of(Interop.valueLayout.C_DOUBLE, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_print_settings_get_print_pages = Interop.downcallHandle(
            "gtk_print_settings_get_print_pages",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_print_settings_get_printer = Interop.downcallHandle(
            "gtk_print_settings_get_printer",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_print_settings_get_printer_lpi = Interop.downcallHandle(
            "gtk_print_settings_get_printer_lpi",
            FunctionDescriptor.of(Interop.valueLayout.C_DOUBLE, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_print_settings_get_quality = Interop.downcallHandle(
            "gtk_print_settings_get_quality",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_print_settings_get_resolution = Interop.downcallHandle(
            "gtk_print_settings_get_resolution",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_print_settings_get_resolution_x = Interop.downcallHandle(
            "gtk_print_settings_get_resolution_x",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_print_settings_get_resolution_y = Interop.downcallHandle(
            "gtk_print_settings_get_resolution_y",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_print_settings_get_reverse = Interop.downcallHandle(
            "gtk_print_settings_get_reverse",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_print_settings_get_scale = Interop.downcallHandle(
            "gtk_print_settings_get_scale",
            FunctionDescriptor.of(Interop.valueLayout.C_DOUBLE, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_print_settings_get_use_color = Interop.downcallHandle(
            "gtk_print_settings_get_use_color",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_print_settings_has_key = Interop.downcallHandle(
            "gtk_print_settings_has_key",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_print_settings_load_file = Interop.downcallHandle(
            "gtk_print_settings_load_file",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_print_settings_load_key_file = Interop.downcallHandle(
            "gtk_print_settings_load_key_file",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_print_settings_set = Interop.downcallHandle(
            "gtk_print_settings_set",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_print_settings_set_bool = Interop.downcallHandle(
            "gtk_print_settings_set_bool",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_print_settings_set_collate = Interop.downcallHandle(
            "gtk_print_settings_set_collate",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_print_settings_set_default_source = Interop.downcallHandle(
            "gtk_print_settings_set_default_source",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_print_settings_set_dither = Interop.downcallHandle(
            "gtk_print_settings_set_dither",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_print_settings_set_double = Interop.downcallHandle(
            "gtk_print_settings_set_double",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_DOUBLE),
            false
        );
        
        private static final MethodHandle gtk_print_settings_set_duplex = Interop.downcallHandle(
            "gtk_print_settings_set_duplex",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_print_settings_set_finishings = Interop.downcallHandle(
            "gtk_print_settings_set_finishings",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_print_settings_set_int = Interop.downcallHandle(
            "gtk_print_settings_set_int",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_print_settings_set_length = Interop.downcallHandle(
            "gtk_print_settings_set_length",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_print_settings_set_media_type = Interop.downcallHandle(
            "gtk_print_settings_set_media_type",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_print_settings_set_n_copies = Interop.downcallHandle(
            "gtk_print_settings_set_n_copies",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_print_settings_set_number_up = Interop.downcallHandle(
            "gtk_print_settings_set_number_up",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_print_settings_set_number_up_layout = Interop.downcallHandle(
            "gtk_print_settings_set_number_up_layout",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_print_settings_set_orientation = Interop.downcallHandle(
            "gtk_print_settings_set_orientation",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_print_settings_set_output_bin = Interop.downcallHandle(
            "gtk_print_settings_set_output_bin",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_print_settings_set_page_ranges = Interop.downcallHandle(
            "gtk_print_settings_set_page_ranges",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_print_settings_set_page_set = Interop.downcallHandle(
            "gtk_print_settings_set_page_set",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_print_settings_set_paper_height = Interop.downcallHandle(
            "gtk_print_settings_set_paper_height",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_print_settings_set_paper_size = Interop.downcallHandle(
            "gtk_print_settings_set_paper_size",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_print_settings_set_paper_width = Interop.downcallHandle(
            "gtk_print_settings_set_paper_width",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_print_settings_set_print_pages = Interop.downcallHandle(
            "gtk_print_settings_set_print_pages",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_print_settings_set_printer = Interop.downcallHandle(
            "gtk_print_settings_set_printer",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_print_settings_set_printer_lpi = Interop.downcallHandle(
            "gtk_print_settings_set_printer_lpi",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_DOUBLE),
            false
        );
        
        private static final MethodHandle gtk_print_settings_set_quality = Interop.downcallHandle(
            "gtk_print_settings_set_quality",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_print_settings_set_resolution = Interop.downcallHandle(
            "gtk_print_settings_set_resolution",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_print_settings_set_resolution_xy = Interop.downcallHandle(
            "gtk_print_settings_set_resolution_xy",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_print_settings_set_reverse = Interop.downcallHandle(
            "gtk_print_settings_set_reverse",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_print_settings_set_scale = Interop.downcallHandle(
            "gtk_print_settings_set_scale",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_DOUBLE),
            false
        );
        
        private static final MethodHandle gtk_print_settings_set_use_color = Interop.downcallHandle(
            "gtk_print_settings_set_use_color",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_print_settings_to_file = Interop.downcallHandle(
            "gtk_print_settings_to_file",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_print_settings_to_gvariant = Interop.downcallHandle(
            "gtk_print_settings_to_gvariant",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_print_settings_to_key_file = Interop.downcallHandle(
            "gtk_print_settings_to_key_file",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_print_settings_unset = Interop.downcallHandle(
            "gtk_print_settings_unset",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_print_settings_get_type = Interop.downcallHandle(
            "gtk_print_settings_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}
