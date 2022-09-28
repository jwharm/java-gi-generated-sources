package org.gtk.gtk;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
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

    public PrintSettings(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to PrintSettings */
    public static PrintSettings castFrom(org.gtk.gobject.Object gobject) {
        return new PrintSettings(gobject.getReference());
    }
    
    private static Reference constructNew() {
        Reference RESULT = References.get(gtk_h.gtk_print_settings_new(), true);
        return RESULT;
    }
    
    /**
     * Creates a new {@code GtkPrintSettings} object.
     */
    public PrintSettings() {
        super(constructNew());
    }
    
    private static Reference constructNewFromFile(java.lang.String fileName) throws GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        Reference RESULT = References.get(gtk_h.gtk_print_settings_new_from_file(Interop.allocateNativeString(fileName).handle(), GERROR), true);
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
     */
    public static PrintSettings newFromFile(java.lang.String fileName) throws GErrorException {
        return new PrintSettings(constructNewFromFile(fileName));
    }
    
    private static Reference constructNewFromGvariant(org.gtk.glib.Variant variant) {
        Reference RESULT = References.get(gtk_h.gtk_print_settings_new_from_gvariant(variant.handle()), true);
        return RESULT;
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
    
    private static Reference constructNewFromKeyFile(org.gtk.glib.KeyFile keyFile, java.lang.String groupName) throws GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        Reference RESULT = References.get(gtk_h.gtk_print_settings_new_from_key_file(keyFile.handle(), Interop.allocateNativeString(groupName).handle(), GERROR), true);
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
     */
    public static PrintSettings newFromKeyFile(org.gtk.glib.KeyFile keyFile, java.lang.String groupName) throws GErrorException {
        return new PrintSettings(constructNewFromKeyFile(keyFile, groupName));
    }
    
    /**
     * Copies a {@code GtkPrintSettings} object.
     */
    public PrintSettings copy() {
        var RESULT = gtk_h.gtk_print_settings_copy(handle());
        return new PrintSettings(References.get(RESULT, true));
    }
    
    /**
     * Calls {@code func} for each key-value pair of {@code settings}.
     */
    public void foreach(PrintSettingsFunc func) {
        try {
            gtk_h.gtk_print_settings_foreach(handle(), 
                    Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gtk.class, "__cbPrintSettingsFunc",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(func.hashCode(), func)));
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Looks up the string value associated with {@code key}.
     */
    public java.lang.String get(java.lang.String key) {
        var RESULT = gtk_h.gtk_print_settings_get(handle(), Interop.allocateNativeString(key).handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Returns the boolean represented by the value
     * that is associated with {@code key}.
     * <p>
     * The string “true” represents {@code true}, any other
     * string {@code false}.
     */
    public boolean getBool(java.lang.String key) {
        var RESULT = gtk_h.gtk_print_settings_get_bool(handle(), Interop.allocateNativeString(key).handle());
        return RESULT != 0;
    }
    
    /**
     * Gets the value of {@code GTK_PRINT_SETTINGS_COLLATE}.
     */
    public boolean getCollate() {
        var RESULT = gtk_h.gtk_print_settings_get_collate(handle());
        return RESULT != 0;
    }
    
    /**
     * Gets the value of {@code GTK_PRINT_SETTINGS_DEFAULT_SOURCE}.
     */
    public java.lang.String getDefaultSource() {
        var RESULT = gtk_h.gtk_print_settings_get_default_source(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets the value of {@code GTK_PRINT_SETTINGS_DITHER}.
     */
    public java.lang.String getDither() {
        var RESULT = gtk_h.gtk_print_settings_get_dither(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Returns the double value associated with {@code key}, or 0.
     */
    public double getDouble(java.lang.String key) {
        var RESULT = gtk_h.gtk_print_settings_get_double(handle(), Interop.allocateNativeString(key).handle());
        return RESULT;
    }
    
    /**
     * Returns the floating point number represented by
     * the value that is associated with {@code key}, or {@code default_val}
     * if the value does not represent a floating point number.
     * <p>
     * Floating point numbers are parsed with g_ascii_strtod().
     */
    public double getDoubleWithDefault(java.lang.String key, double def) {
        var RESULT = gtk_h.gtk_print_settings_get_double_with_default(handle(), Interop.allocateNativeString(key).handle(), def);
        return RESULT;
    }
    
    /**
     * Gets the value of {@code GTK_PRINT_SETTINGS_DUPLEX}.
     */
    public PrintDuplex getDuplex() {
        var RESULT = gtk_h.gtk_print_settings_get_duplex(handle());
        return new PrintDuplex(RESULT);
    }
    
    /**
     * Gets the value of {@code GTK_PRINT_SETTINGS_FINISHINGS}.
     */
    public java.lang.String getFinishings() {
        var RESULT = gtk_h.gtk_print_settings_get_finishings(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Returns the integer value of {@code key}, or 0.
     */
    public int getInt(java.lang.String key) {
        var RESULT = gtk_h.gtk_print_settings_get_int(handle(), Interop.allocateNativeString(key).handle());
        return RESULT;
    }
    
    /**
     * Returns the value of {@code key}, interpreted as
     * an integer, or the default value.
     */
    public int getIntWithDefault(java.lang.String key, int def) {
        var RESULT = gtk_h.gtk_print_settings_get_int_with_default(handle(), Interop.allocateNativeString(key).handle(), def);
        return RESULT;
    }
    
    /**
     * Returns the value associated with {@code key}, interpreted
     * as a length.
     * <p>
     * The returned value is converted to {@code units}.
     */
    public double getLength(java.lang.String key, Unit unit) {
        var RESULT = gtk_h.gtk_print_settings_get_length(handle(), Interop.allocateNativeString(key).handle(), unit.getValue());
        return RESULT;
    }
    
    /**
     * Gets the value of {@code GTK_PRINT_SETTINGS_MEDIA_TYPE}.
     * <p>
     * The set of media types is defined in PWG 5101.1-2002 PWG.
     */
    public java.lang.String getMediaType() {
        var RESULT = gtk_h.gtk_print_settings_get_media_type(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets the value of {@code GTK_PRINT_SETTINGS_N_COPIES}.
     */
    public int getNCopies() {
        var RESULT = gtk_h.gtk_print_settings_get_n_copies(handle());
        return RESULT;
    }
    
    /**
     * Gets the value of {@code GTK_PRINT_SETTINGS_NUMBER_UP}.
     */
    public int getNumberUp() {
        var RESULT = gtk_h.gtk_print_settings_get_number_up(handle());
        return RESULT;
    }
    
    /**
     * Gets the value of {@code GTK_PRINT_SETTINGS_NUMBER_UP_LAYOUT}.
     */
    public NumberUpLayout getNumberUpLayout() {
        var RESULT = gtk_h.gtk_print_settings_get_number_up_layout(handle());
        return new NumberUpLayout(RESULT);
    }
    
    /**
     * Get the value of {@code GTK_PRINT_SETTINGS_ORIENTATION},
     * converted to a {@code GtkPageOrientation}.
     */
    public PageOrientation getOrientation() {
        var RESULT = gtk_h.gtk_print_settings_get_orientation(handle());
        return new PageOrientation(RESULT);
    }
    
    /**
     * Gets the value of {@code GTK_PRINT_SETTINGS_OUTPUT_BIN}.
     */
    public java.lang.String getOutputBin() {
        var RESULT = gtk_h.gtk_print_settings_get_output_bin(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets the value of {@code GTK_PRINT_SETTINGS_PAGE_RANGES}.
     */
    public PointerIterator<PageRange> getPageRanges(PointerInteger numRanges) {
        var RESULT = gtk_h.gtk_print_settings_get_page_ranges(handle(), numRanges.handle());
        return new PointerProxy<PageRange>(RESULT, PageRange.class).iterator();
    }
    
    /**
     * Gets the value of {@code GTK_PRINT_SETTINGS_PAGE_SET}.
     */
    public PageSet getPageSet() {
        var RESULT = gtk_h.gtk_print_settings_get_page_set(handle());
        return new PageSet(RESULT);
    }
    
    /**
     * Gets the value of {@code GTK_PRINT_SETTINGS_PAPER_HEIGHT},
     * converted to {@code unit}.
     */
    public double getPaperHeight(Unit unit) {
        var RESULT = gtk_h.gtk_print_settings_get_paper_height(handle(), unit.getValue());
        return RESULT;
    }
    
    /**
     * Gets the value of {@code GTK_PRINT_SETTINGS_PAPER_FORMAT},
     * converted to a {@code GtkPaperSize}.
     */
    public PaperSize getPaperSize() {
        var RESULT = gtk_h.gtk_print_settings_get_paper_size(handle());
        return new PaperSize(References.get(RESULT, true));
    }
    
    /**
     * Gets the value of {@code GTK_PRINT_SETTINGS_PAPER_WIDTH},
     * converted to {@code unit}.
     */
    public double getPaperWidth(Unit unit) {
        var RESULT = gtk_h.gtk_print_settings_get_paper_width(handle(), unit.getValue());
        return RESULT;
    }
    
    /**
     * Gets the value of {@code GTK_PRINT_SETTINGS_PRINT_PAGES}.
     */
    public PrintPages getPrintPages() {
        var RESULT = gtk_h.gtk_print_settings_get_print_pages(handle());
        return new PrintPages(RESULT);
    }
    
    /**
     * Convenience function to obtain the value of
     * {@code GTK_PRINT_SETTINGS_PRINTER}.
     */
    public java.lang.String getPrinter() {
        var RESULT = gtk_h.gtk_print_settings_get_printer(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets the value of {@code GTK_PRINT_SETTINGS_PRINTER_LPI}.
     */
    public double getPrinterLpi() {
        var RESULT = gtk_h.gtk_print_settings_get_printer_lpi(handle());
        return RESULT;
    }
    
    /**
     * Gets the value of {@code GTK_PRINT_SETTINGS_QUALITY}.
     */
    public PrintQuality getQuality() {
        var RESULT = gtk_h.gtk_print_settings_get_quality(handle());
        return new PrintQuality(RESULT);
    }
    
    /**
     * Gets the value of {@code GTK_PRINT_SETTINGS_RESOLUTION}.
     */
    public int getResolution() {
        var RESULT = gtk_h.gtk_print_settings_get_resolution(handle());
        return RESULT;
    }
    
    /**
     * Gets the value of {@code GTK_PRINT_SETTINGS_RESOLUTION_X}.
     */
    public int getResolutionX() {
        var RESULT = gtk_h.gtk_print_settings_get_resolution_x(handle());
        return RESULT;
    }
    
    /**
     * Gets the value of {@code GTK_PRINT_SETTINGS_RESOLUTION_Y}.
     */
    public int getResolutionY() {
        var RESULT = gtk_h.gtk_print_settings_get_resolution_y(handle());
        return RESULT;
    }
    
    /**
     * Gets the value of {@code GTK_PRINT_SETTINGS_REVERSE}.
     */
    public boolean getReverse() {
        var RESULT = gtk_h.gtk_print_settings_get_reverse(handle());
        return RESULT != 0;
    }
    
    /**
     * Gets the value of {@code GTK_PRINT_SETTINGS_SCALE}.
     */
    public double getScale() {
        var RESULT = gtk_h.gtk_print_settings_get_scale(handle());
        return RESULT;
    }
    
    /**
     * Gets the value of {@code GTK_PRINT_SETTINGS_USE_COLOR}.
     */
    public boolean getUseColor() {
        var RESULT = gtk_h.gtk_print_settings_get_use_color(handle());
        return RESULT != 0;
    }
    
    /**
     * Returns {@code true}, if a value is associated with {@code key}.
     */
    public boolean hasKey(java.lang.String key) {
        var RESULT = gtk_h.gtk_print_settings_has_key(handle(), Interop.allocateNativeString(key).handle());
        return RESULT != 0;
    }
    
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
        var RESULT = gtk_h.gtk_print_settings_load_file(handle(), Interop.allocateNativeString(fileName).handle(), GERROR);
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
     */
    public boolean loadKeyFile(org.gtk.glib.KeyFile keyFile, java.lang.String groupName) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.gtk_print_settings_load_key_file(handle(), keyFile.handle(), Interop.allocateNativeString(groupName).handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT != 0;
    }
    
    /**
     * Associates {@code value} with {@code key}.
     */
    public void set(java.lang.String key, java.lang.String value) {
        gtk_h.gtk_print_settings_set(handle(), Interop.allocateNativeString(key).handle(), Interop.allocateNativeString(value).handle());
    }
    
    /**
     * Sets {@code key} to a boolean value.
     */
    public void setBool(java.lang.String key, boolean value) {
        gtk_h.gtk_print_settings_set_bool(handle(), Interop.allocateNativeString(key).handle(), value ? 1 : 0);
    }
    
    /**
     * Sets the value of {@code GTK_PRINT_SETTINGS_COLLATE}.
     */
    public void setCollate(boolean collate) {
        gtk_h.gtk_print_settings_set_collate(handle(), collate ? 1 : 0);
    }
    
    /**
     * Sets the value of {@code GTK_PRINT_SETTINGS_DEFAULT_SOURCE}.
     */
    public void setDefaultSource(java.lang.String defaultSource) {
        gtk_h.gtk_print_settings_set_default_source(handle(), Interop.allocateNativeString(defaultSource).handle());
    }
    
    /**
     * Sets the value of {@code GTK_PRINT_SETTINGS_DITHER}.
     */
    public void setDither(java.lang.String dither) {
        gtk_h.gtk_print_settings_set_dither(handle(), Interop.allocateNativeString(dither).handle());
    }
    
    /**
     * Sets {@code key} to a double value.
     */
    public void setDouble(java.lang.String key, double value) {
        gtk_h.gtk_print_settings_set_double(handle(), Interop.allocateNativeString(key).handle(), value);
    }
    
    /**
     * Sets the value of {@code GTK_PRINT_SETTINGS_DUPLEX}.
     */
    public void setDuplex(PrintDuplex duplex) {
        gtk_h.gtk_print_settings_set_duplex(handle(), duplex.getValue());
    }
    
    /**
     * Sets the value of {@code GTK_PRINT_SETTINGS_FINISHINGS}.
     */
    public void setFinishings(java.lang.String finishings) {
        gtk_h.gtk_print_settings_set_finishings(handle(), Interop.allocateNativeString(finishings).handle());
    }
    
    /**
     * Sets {@code key} to an integer value.
     */
    public void setInt(java.lang.String key, int value) {
        gtk_h.gtk_print_settings_set_int(handle(), Interop.allocateNativeString(key).handle(), value);
    }
    
    /**
     * Associates a length in units of {@code unit} with {@code key}.
     */
    public void setLength(java.lang.String key, double value, Unit unit) {
        gtk_h.gtk_print_settings_set_length(handle(), Interop.allocateNativeString(key).handle(), value, unit.getValue());
    }
    
    /**
     * Sets the value of {@code GTK_PRINT_SETTINGS_MEDIA_TYPE}.
     * <p>
     * The set of media types is defined in PWG 5101.1-2002 PWG.
     */
    public void setMediaType(java.lang.String mediaType) {
        gtk_h.gtk_print_settings_set_media_type(handle(), Interop.allocateNativeString(mediaType).handle());
    }
    
    /**
     * Sets the value of {@code GTK_PRINT_SETTINGS_N_COPIES}.
     */
    public void setNCopies(int numCopies) {
        gtk_h.gtk_print_settings_set_n_copies(handle(), numCopies);
    }
    
    /**
     * Sets the value of {@code GTK_PRINT_SETTINGS_NUMBER_UP}.
     */
    public void setNumberUp(int numberUp) {
        gtk_h.gtk_print_settings_set_number_up(handle(), numberUp);
    }
    
    /**
     * Sets the value of {@code GTK_PRINT_SETTINGS_NUMBER_UP_LAYOUT}.
     */
    public void setNumberUpLayout(NumberUpLayout numberUpLayout) {
        gtk_h.gtk_print_settings_set_number_up_layout(handle(), numberUpLayout.getValue());
    }
    
    /**
     * Sets the value of {@code GTK_PRINT_SETTINGS_ORIENTATION}.
     */
    public void setOrientation(PageOrientation orientation) {
        gtk_h.gtk_print_settings_set_orientation(handle(), orientation.getValue());
    }
    
    /**
     * Sets the value of {@code GTK_PRINT_SETTINGS_OUTPUT_BIN}.
     */
    public void setOutputBin(java.lang.String outputBin) {
        gtk_h.gtk_print_settings_set_output_bin(handle(), Interop.allocateNativeString(outputBin).handle());
    }
    
    /**
     * Sets the value of {@code GTK_PRINT_SETTINGS_PAGE_RANGES}.
     */
    public void setPageRanges(PageRange[] pageRanges, int numRanges) {
        gtk_h.gtk_print_settings_set_page_ranges(handle(), Interop.allocateNativeArray(pageRanges).handle(), numRanges);
    }
    
    /**
     * Sets the value of {@code GTK_PRINT_SETTINGS_PAGE_SET}.
     */
    public void setPageSet(PageSet pageSet) {
        gtk_h.gtk_print_settings_set_page_set(handle(), pageSet.getValue());
    }
    
    /**
     * Sets the value of {@code GTK_PRINT_SETTINGS_PAPER_HEIGHT}.
     */
    public void setPaperHeight(double height, Unit unit) {
        gtk_h.gtk_print_settings_set_paper_height(handle(), height, unit.getValue());
    }
    
    /**
     * Sets the value of {@code GTK_PRINT_SETTINGS_PAPER_FORMAT},
     * {@code GTK_PRINT_SETTINGS_PAPER_WIDTH} and
     * {@code GTK_PRINT_SETTINGS_PAPER_HEIGHT}.
     */
    public void setPaperSize(PaperSize paperSize) {
        gtk_h.gtk_print_settings_set_paper_size(handle(), paperSize.handle());
    }
    
    /**
     * Sets the value of {@code GTK_PRINT_SETTINGS_PAPER_WIDTH}.
     */
    public void setPaperWidth(double width, Unit unit) {
        gtk_h.gtk_print_settings_set_paper_width(handle(), width, unit.getValue());
    }
    
    /**
     * Sets the value of {@code GTK_PRINT_SETTINGS_PRINT_PAGES}.
     */
    public void setPrintPages(PrintPages pages) {
        gtk_h.gtk_print_settings_set_print_pages(handle(), pages.getValue());
    }
    
    /**
     * Convenience function to set {@code GTK_PRINT_SETTINGS_PRINTER}
     * to {@code printer}.
     */
    public void setPrinter(java.lang.String printer) {
        gtk_h.gtk_print_settings_set_printer(handle(), Interop.allocateNativeString(printer).handle());
    }
    
    /**
     * Sets the value of {@code GTK_PRINT_SETTINGS_PRINTER_LPI}.
     */
    public void setPrinterLpi(double lpi) {
        gtk_h.gtk_print_settings_set_printer_lpi(handle(), lpi);
    }
    
    /**
     * Sets the value of {@code GTK_PRINT_SETTINGS_QUALITY}.
     */
    public void setQuality(PrintQuality quality) {
        gtk_h.gtk_print_settings_set_quality(handle(), quality.getValue());
    }
    
    /**
     * Sets the values of {@code GTK_PRINT_SETTINGS_RESOLUTION},
     * {@code GTK_PRINT_SETTINGS_RESOLUTION_X} and
     * {@code GTK_PRINT_SETTINGS_RESOLUTION_Y}.
     */
    public void setResolution(int resolution) {
        gtk_h.gtk_print_settings_set_resolution(handle(), resolution);
    }
    
    /**
     * Sets the values of {@code GTK_PRINT_SETTINGS_RESOLUTION},
     * {@code GTK_PRINT_SETTINGS_RESOLUTION_X} and
     * {@code GTK_PRINT_SETTINGS_RESOLUTION_Y}.
     */
    public void setResolutionXy(int resolutionX, int resolutionY) {
        gtk_h.gtk_print_settings_set_resolution_xy(handle(), resolutionX, resolutionY);
    }
    
    /**
     * Sets the value of {@code GTK_PRINT_SETTINGS_REVERSE}.
     */
    public void setReverse(boolean reverse) {
        gtk_h.gtk_print_settings_set_reverse(handle(), reverse ? 1 : 0);
    }
    
    /**
     * Sets the value of {@code GTK_PRINT_SETTINGS_SCALE}.
     */
    public void setScale(double scale) {
        gtk_h.gtk_print_settings_set_scale(handle(), scale);
    }
    
    /**
     * Sets the value of {@code GTK_PRINT_SETTINGS_USE_COLOR}.
     */
    public void setUseColor(boolean useColor) {
        gtk_h.gtk_print_settings_set_use_color(handle(), useColor ? 1 : 0);
    }
    
    /**
     * This function saves the print settings from {@code settings} to {@code file_name}.
     * <p>
     * If the file could not be written then error is set to either a
     * {@code GFileError} or {@code GKeyFileError}.
     */
    public boolean toFile(java.lang.String fileName) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.gtk_print_settings_to_file(handle(), Interop.allocateNativeString(fileName).handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT != 0;
    }
    
    /**
     * Serialize print settings to an a{sv} variant.
     */
    public org.gtk.glib.Variant toGvariant() {
        var RESULT = gtk_h.gtk_print_settings_to_gvariant(handle());
        return new org.gtk.glib.Variant(References.get(RESULT, false));
    }
    
    /**
     * This function adds the print settings from {@code settings} to {@code key_file}.
     */
    public void toKeyFile(org.gtk.glib.KeyFile keyFile, java.lang.String groupName) {
        gtk_h.gtk_print_settings_to_key_file(handle(), keyFile.handle(), Interop.allocateNativeString(groupName).handle());
    }
    
    /**
     * Removes any value associated with {@code key}.
     * <p>
     * This has the same effect as setting the value to {@code null}.
     */
    public void unset(java.lang.String key) {
        gtk_h.gtk_print_settings_unset(handle(), Interop.allocateNativeString(key).handle());
    }
    
}
