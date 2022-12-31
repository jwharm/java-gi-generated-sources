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
public class PrintSettings extends org.gtk.gobject.GObject {
    
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
    protected PrintSettings(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, PrintSettings> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new PrintSettings(input, ownership);
    
    private static MemoryAddress constructNew() {
        MemoryAddress RESULT;
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
    
    private static MemoryAddress constructNewFromFile(java.lang.String fileName) throws GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_print_settings_new_from_file.invokeExact(
                    Marshal.stringToAddress.marshal(fileName, null),
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
    public static PrintSettings newFromFile(java.lang.String fileName) throws GErrorException {
        var RESULT = constructNewFromFile(fileName);
        return (org.gtk.gtk.PrintSettings) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gtk.PrintSettings.fromAddress).marshal(RESULT, Ownership.FULL);
    }
    
    private static MemoryAddress constructNewFromGvariant(org.gtk.glib.Variant variant) {
        MemoryAddress RESULT;
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
    public static PrintSettings newFromGvariant(org.gtk.glib.Variant variant) {
        var RESULT = constructNewFromGvariant(variant);
        return (org.gtk.gtk.PrintSettings) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gtk.PrintSettings.fromAddress).marshal(RESULT, Ownership.FULL);
    }
    
    private static MemoryAddress constructNewFromKeyFile(org.gtk.glib.KeyFile keyFile, @Nullable java.lang.String groupName) throws GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_print_settings_new_from_key_file.invokeExact(
                    keyFile.handle(),
                    (Addressable) (groupName == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(groupName, null)),
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
    public static PrintSettings newFromKeyFile(org.gtk.glib.KeyFile keyFile, @Nullable java.lang.String groupName) throws GErrorException {
        var RESULT = constructNewFromKeyFile(keyFile, groupName);
        return (org.gtk.gtk.PrintSettings) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gtk.PrintSettings.fromAddress).marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Copies a {@code GtkPrintSettings} object.
     * @return a newly allocated copy of {@code other}
     */
    public org.gtk.gtk.PrintSettings copy() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_print_settings_copy.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gtk.PrintSettings) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gtk.PrintSettings.fromAddress).marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Calls {@code func} for each key-value pair of {@code settings}.
     * @param func the function to call
     */
    public void foreach(org.gtk.gtk.PrintSettingsFunc func) {
        try {
            DowncallHandles.gtk_print_settings_foreach.invokeExact(
                    handle(),
                    (Addressable) func.toCallback(),
                    (Addressable) MemoryAddress.NULL);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Looks up the string value associated with {@code key}.
     * @param key a key
     * @return the string value for {@code key}
     */
    public @Nullable java.lang.String getString(java.lang.String key) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_print_settings_get.invokeExact(
                    handle(),
                    Marshal.stringToAddress.marshal(key, null));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
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
    public boolean getBool(java.lang.String key) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_print_settings_get_bool.invokeExact(
                    handle(),
                    Marshal.stringToAddress.marshal(key, null));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
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
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
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
        return Marshal.addressToString.marshal(RESULT, null);
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
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Returns the double value associated with {@code key}, or 0.
     * @param key a key
     * @return the double value of {@code key}
     */
    public double getDouble(java.lang.String key) {
        double RESULT;
        try {
            RESULT = (double) DowncallHandles.gtk_print_settings_get_double.invokeExact(
                    handle(),
                    Marshal.stringToAddress.marshal(key, null));
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
    public double getDoubleWithDefault(java.lang.String key, double def) {
        double RESULT;
        try {
            RESULT = (double) DowncallHandles.gtk_print_settings_get_double_with_default.invokeExact(
                    handle(),
                    Marshal.stringToAddress.marshal(key, null),
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
    public org.gtk.gtk.PrintDuplex getDuplex() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_print_settings_get_duplex.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.gtk.PrintDuplex.of(RESULT);
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
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Returns the integer value of {@code key}, or 0.
     * @param key a key
     * @return the integer value of {@code key}
     */
    public int getInt(java.lang.String key) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_print_settings_get_int.invokeExact(
                    handle(),
                    Marshal.stringToAddress.marshal(key, null));
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
    public int getIntWithDefault(java.lang.String key, int def) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_print_settings_get_int_with_default.invokeExact(
                    handle(),
                    Marshal.stringToAddress.marshal(key, null),
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
    public double getLength(java.lang.String key, org.gtk.gtk.Unit unit) {
        double RESULT;
        try {
            RESULT = (double) DowncallHandles.gtk_print_settings_get_length.invokeExact(
                    handle(),
                    Marshal.stringToAddress.marshal(key, null),
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
        return Marshal.addressToString.marshal(RESULT, null);
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
    public org.gtk.gtk.NumberUpLayout getNumberUpLayout() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_print_settings_get_number_up_layout.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.gtk.NumberUpLayout.of(RESULT);
    }
    
    /**
     * Get the value of {@code GTK_PRINT_SETTINGS_ORIENTATION},
     * converted to a {@code GtkPageOrientation}.
     * @return the orientation
     */
    public org.gtk.gtk.PageOrientation getOrientation() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_print_settings_get_orientation.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.gtk.PageOrientation.of(RESULT);
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
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Gets the value of {@code GTK_PRINT_SETTINGS_PAGE_RANGES}.
     * @param numRanges return location for the length of the returned array
     * @return an array
     *   of {@code GtkPageRange}s. Use g_free() to free the array when
     *   it is no longer needed.
     */
    public org.gtk.gtk.PageRange[] getPageRanges(Out<Integer> numRanges) {
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
            resultARRAY[I] = org.gtk.gtk.PageRange.fromAddress.marshal(OBJ, Ownership.FULL);
        }
        return resultARRAY;
    }
    
    /**
     * Gets the value of {@code GTK_PRINT_SETTINGS_PAGE_SET}.
     * @return the set of pages to print
     */
    public org.gtk.gtk.PageSet getPageSet() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_print_settings_get_page_set.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.gtk.PageSet.of(RESULT);
    }
    
    /**
     * Gets the value of {@code GTK_PRINT_SETTINGS_PAPER_HEIGHT},
     * converted to {@code unit}.
     * @param unit the unit for the return value
     * @return the paper height, in units of {@code unit}
     */
    public double getPaperHeight(org.gtk.gtk.Unit unit) {
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
        return org.gtk.gtk.PaperSize.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Gets the value of {@code GTK_PRINT_SETTINGS_PAPER_WIDTH},
     * converted to {@code unit}.
     * @param unit the unit for the return value
     * @return the paper width, in units of {@code unit}
     */
    public double getPaperWidth(org.gtk.gtk.Unit unit) {
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
    public org.gtk.gtk.PrintPages getPrintPages() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_print_settings_get_print_pages.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.gtk.PrintPages.of(RESULT);
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
        return Marshal.addressToString.marshal(RESULT, null);
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
    public org.gtk.gtk.PrintQuality getQuality() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_print_settings_get_quality.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.gtk.PrintQuality.of(RESULT);
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
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
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
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Returns {@code true}, if a value is associated with {@code key}.
     * @param key a key
     * @return {@code true}, if {@code key} has a value
     */
    public boolean hasKey(java.lang.String key) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_print_settings_has_key.invokeExact(
                    handle(),
                    Marshal.stringToAddress.marshal(key, null));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
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
    public boolean loadFile(java.lang.String fileName) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_print_settings_load_file.invokeExact(
                    handle(),
                    Marshal.stringToAddress.marshal(fileName, null),
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
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
    public boolean loadKeyFile(org.gtk.glib.KeyFile keyFile, @Nullable java.lang.String groupName) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_print_settings_load_key_file.invokeExact(
                    handle(),
                    keyFile.handle(),
                    (Addressable) (groupName == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(groupName, null)),
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Associates {@code value} with {@code key}.
     * @param key a key
     * @param value a string value
     */
    public void set(java.lang.String key, @Nullable java.lang.String value) {
        try {
            DowncallHandles.gtk_print_settings_set.invokeExact(
                    handle(),
                    Marshal.stringToAddress.marshal(key, null),
                    (Addressable) (value == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(value, null)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets {@code key} to a boolean value.
     * @param key a key
     * @param value a boolean
     */
    public void setBool(java.lang.String key, boolean value) {
        try {
            DowncallHandles.gtk_print_settings_set_bool.invokeExact(
                    handle(),
                    Marshal.stringToAddress.marshal(key, null),
                    Marshal.booleanToInteger.marshal(value, null).intValue());
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
                    Marshal.booleanToInteger.marshal(collate, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the value of {@code GTK_PRINT_SETTINGS_DEFAULT_SOURCE}.
     * @param defaultSource the default source
     */
    public void setDefaultSource(java.lang.String defaultSource) {
        try {
            DowncallHandles.gtk_print_settings_set_default_source.invokeExact(
                    handle(),
                    Marshal.stringToAddress.marshal(defaultSource, null));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the value of {@code GTK_PRINT_SETTINGS_DITHER}.
     * @param dither the dithering that is used
     */
    public void setDither(java.lang.String dither) {
        try {
            DowncallHandles.gtk_print_settings_set_dither.invokeExact(
                    handle(),
                    Marshal.stringToAddress.marshal(dither, null));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets {@code key} to a double value.
     * @param key a key
     * @param value a double value
     */
    public void setDouble(java.lang.String key, double value) {
        try {
            DowncallHandles.gtk_print_settings_set_double.invokeExact(
                    handle(),
                    Marshal.stringToAddress.marshal(key, null),
                    value);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the value of {@code GTK_PRINT_SETTINGS_DUPLEX}.
     * @param duplex a {@code GtkPrintDuplex} value
     */
    public void setDuplex(org.gtk.gtk.PrintDuplex duplex) {
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
    public void setFinishings(java.lang.String finishings) {
        try {
            DowncallHandles.gtk_print_settings_set_finishings.invokeExact(
                    handle(),
                    Marshal.stringToAddress.marshal(finishings, null));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets {@code key} to an integer value.
     * @param key a key
     * @param value an integer
     */
    public void setInt(java.lang.String key, int value) {
        try {
            DowncallHandles.gtk_print_settings_set_int.invokeExact(
                    handle(),
                    Marshal.stringToAddress.marshal(key, null),
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
    public void setLength(java.lang.String key, double value, org.gtk.gtk.Unit unit) {
        try {
            DowncallHandles.gtk_print_settings_set_length.invokeExact(
                    handle(),
                    Marshal.stringToAddress.marshal(key, null),
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
    public void setMediaType(java.lang.String mediaType) {
        try {
            DowncallHandles.gtk_print_settings_set_media_type.invokeExact(
                    handle(),
                    Marshal.stringToAddress.marshal(mediaType, null));
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
    public void setNumberUpLayout(org.gtk.gtk.NumberUpLayout numberUpLayout) {
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
    public void setOrientation(org.gtk.gtk.PageOrientation orientation) {
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
    public void setOutputBin(java.lang.String outputBin) {
        try {
            DowncallHandles.gtk_print_settings_set_output_bin.invokeExact(
                    handle(),
                    Marshal.stringToAddress.marshal(outputBin, null));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the value of {@code GTK_PRINT_SETTINGS_PAGE_RANGES}.
     * @param pageRanges an array of {@code GtkPageRange}s
     * @param numRanges the length of {@code page_ranges}
     */
    public void setPageRanges(org.gtk.gtk.PageRange[] pageRanges, int numRanges) {
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
    public void setPageSet(org.gtk.gtk.PageSet pageSet) {
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
    public void setPaperHeight(double height, org.gtk.gtk.Unit unit) {
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
    public void setPaperSize(org.gtk.gtk.PaperSize paperSize) {
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
    public void setPaperWidth(double width, org.gtk.gtk.Unit unit) {
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
    public void setPrintPages(org.gtk.gtk.PrintPages pages) {
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
    public void setPrinter(java.lang.String printer) {
        try {
            DowncallHandles.gtk_print_settings_set_printer.invokeExact(
                    handle(),
                    Marshal.stringToAddress.marshal(printer, null));
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
    public void setQuality(org.gtk.gtk.PrintQuality quality) {
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
                    Marshal.booleanToInteger.marshal(reverse, null).intValue());
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
                    Marshal.booleanToInteger.marshal(useColor, null).intValue());
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
    public boolean toFile(java.lang.String fileName) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_print_settings_to_file.invokeExact(
                    handle(),
                    Marshal.stringToAddress.marshal(fileName, null),
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Serialize print settings to an a{sv} variant.
     * @return a new, floating, {@code GVariant}
     */
    public org.gtk.glib.Variant toGvariant() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_print_settings_to_gvariant.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.glib.Variant.fromAddress.marshal(RESULT, Ownership.NONE);
    }
    
    /**
     * This function adds the print settings from {@code settings} to {@code key_file}.
     * @param keyFile the {@code GKeyFile} to save the print settings to
     * @param groupName the group to add the settings to in {@code key_file}, or
     *   {@code null} to use the default “Print Settings”
     */
    public void toKeyFile(org.gtk.glib.KeyFile keyFile, @Nullable java.lang.String groupName) {
        try {
            DowncallHandles.gtk_print_settings_to_key_file.invokeExact(
                    handle(),
                    keyFile.handle(),
                    (Addressable) (groupName == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(groupName, null)));
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
    public void unset(java.lang.String key) {
        try {
            DowncallHandles.gtk_print_settings_unset.invokeExact(
                    handle(),
                    Marshal.stringToAddress.marshal(key, null));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gtk_print_settings_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * A {@link PrintSettings.Builder} object constructs a {@link PrintSettings} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link PrintSettings.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gtk.gobject.GObject.Builder {
        
        protected Builder() {
        }
        
        /**
         * Finish building the {@link PrintSettings} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link PrintSettings}.
         * @return A new instance of {@code PrintSettings} with the properties 
         *         that were set in the Builder object.
         */
        public PrintSettings build() {
            return (PrintSettings) org.gtk.gobject.GObject.newWithProperties(
                PrintSettings.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
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
