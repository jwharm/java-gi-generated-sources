package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A `GtkPrintSettings` object represents the settings of a print dialog in
 * a system-independent way.
 * 
 * The main use for this object is that once you’ve printed you can get a
 * settings object that represents the settings the user chose, and the next
 * time you print you can pass that object in so that the user doesn’t have
 * to re-set all his settings.
 * 
 * Its also possible to enumerate the settings so that you can easily save
 * the settings for the next time your app runs, or even store them in a
 * document. The predefined keys try to use shared values as much as possible
 * so that moving such a document between systems still works.
 */
public class PrintSettings extends org.gtk.gobject.Object {

    public PrintSettings(io.github.jwharm.javagi.interop.Proxy proxy) {
        super(proxy);
    }
    
    /** Cast object to PrintSettings */
    public static PrintSettings castFrom(org.gtk.gobject.Object gobject) {
        return new PrintSettings(gobject.getProxy());
    }
    
    /**
     * Creates a new `GtkPrintSettings` object.
     */
    public PrintSettings() {
        super(ProxyFactory.get(io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_print_settings_new(), true));
    }
    
    /**
     * Deserialize print settings from an a{sv} variant.
     * 
     * The variant must be in the format produced by
     * [method@Gtk.PrintSettings.to_gvariant].
     */
    public PrintSettings(org.gtk.glib.Variant variant) {
        super(ProxyFactory.get(io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_print_settings_new_from_gvariant(variant.HANDLE()), true));
    }
    
    /**
     * Copies a `GtkPrintSettings` object.
     */
    public PrintSettings copy() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_print_settings_copy(HANDLE());
        return new PrintSettings(ProxyFactory.get(RESULT, true));
    }
    
    /**
     * Looks up the string value associated with @key.
     */
    public java.lang.String get(java.lang.String key) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_print_settings_get(HANDLE(), Interop.allocateNativeString(key).HANDLE());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Returns the boolean represented by the value
     * that is associated with @key.
     * 
     * The string “true” represents %TRUE, any other
     * string %FALSE.
     */
    public boolean getBool(java.lang.String key) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_print_settings_get_bool(HANDLE(), Interop.allocateNativeString(key).HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Gets the value of %GTK_PRINT_SETTINGS_COLLATE.
     */
    public boolean getCollate() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_print_settings_get_collate(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Gets the value of %GTK_PRINT_SETTINGS_DEFAULT_SOURCE.
     */
    public java.lang.String getDefaultSource() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_print_settings_get_default_source(HANDLE());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets the value of %GTK_PRINT_SETTINGS_DITHER.
     */
    public java.lang.String getDither() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_print_settings_get_dither(HANDLE());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Returns the double value associated with @key, or 0.
     */
    public double getDouble(java.lang.String key) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_print_settings_get_double(HANDLE(), Interop.allocateNativeString(key).HANDLE());
        return RESULT;
    }
    
    /**
     * Returns the floating point number represented by
     * the value that is associated with @key, or @default_val
     * if the value does not represent a floating point number.
     * 
     * Floating point numbers are parsed with g_ascii_strtod().
     */
    public double getDoubleWithDefault(java.lang.String key, double def) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_print_settings_get_double_with_default(HANDLE(), Interop.allocateNativeString(key).HANDLE(), def);
        return RESULT;
    }
    
    /**
     * Gets the value of %GTK_PRINT_SETTINGS_DUPLEX.
     */
    public PrintDuplex getDuplex() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_print_settings_get_duplex(HANDLE());
        return PrintDuplex.fromValue(RESULT);
    }
    
    /**
     * Gets the value of %GTK_PRINT_SETTINGS_FINISHINGS.
     */
    public java.lang.String getFinishings() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_print_settings_get_finishings(HANDLE());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Returns the integer value of @key, or 0.
     */
    public int getInt(java.lang.String key) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_print_settings_get_int(HANDLE(), Interop.allocateNativeString(key).HANDLE());
        return RESULT;
    }
    
    /**
     * Returns the value of @key, interpreted as
     * an integer, or the default value.
     */
    public int getIntWithDefault(java.lang.String key, int def) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_print_settings_get_int_with_default(HANDLE(), Interop.allocateNativeString(key).HANDLE(), def);
        return RESULT;
    }
    
    /**
     * Returns the value associated with @key, interpreted
     * as a length.
     * 
     * The returned value is converted to @units.
     */
    public double getLength(java.lang.String key, Unit unit) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_print_settings_get_length(HANDLE(), Interop.allocateNativeString(key).HANDLE(), unit.getValue());
        return RESULT;
    }
    
    /**
     * Gets the value of %GTK_PRINT_SETTINGS_MEDIA_TYPE.
     * 
     * The set of media types is defined in PWG 5101.1-2002 PWG.
     */
    public java.lang.String getMediaType() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_print_settings_get_media_type(HANDLE());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets the value of %GTK_PRINT_SETTINGS_N_COPIES.
     */
    public int getNCopies() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_print_settings_get_n_copies(HANDLE());
        return RESULT;
    }
    
    /**
     * Gets the value of %GTK_PRINT_SETTINGS_NUMBER_UP.
     */
    public int getNumberUp() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_print_settings_get_number_up(HANDLE());
        return RESULT;
    }
    
    /**
     * Gets the value of %GTK_PRINT_SETTINGS_NUMBER_UP_LAYOUT.
     */
    public NumberUpLayout getNumberUpLayout() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_print_settings_get_number_up_layout(HANDLE());
        return NumberUpLayout.fromValue(RESULT);
    }
    
    /**
     * Get the value of %GTK_PRINT_SETTINGS_ORIENTATION,
     * converted to a `GtkPageOrientation`.
     */
    public PageOrientation getOrientation() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_print_settings_get_orientation(HANDLE());
        return PageOrientation.fromValue(RESULT);
    }
    
    /**
     * Gets the value of %GTK_PRINT_SETTINGS_OUTPUT_BIN.
     */
    public java.lang.String getOutputBin() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_print_settings_get_output_bin(HANDLE());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets the value of %GTK_PRINT_SETTINGS_PAGE_SET.
     */
    public PageSet getPageSet() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_print_settings_get_page_set(HANDLE());
        return PageSet.fromValue(RESULT);
    }
    
    /**
     * Gets the value of %GTK_PRINT_SETTINGS_PAPER_HEIGHT,
     * converted to @unit.
     */
    public double getPaperHeight(Unit unit) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_print_settings_get_paper_height(HANDLE(), unit.getValue());
        return RESULT;
    }
    
    /**
     * Gets the value of %GTK_PRINT_SETTINGS_PAPER_FORMAT,
     * converted to a `GtkPaperSize`.
     */
    public PaperSize getPaperSize() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_print_settings_get_paper_size(HANDLE());
        return new PaperSize(ProxyFactory.get(RESULT, true));
    }
    
    /**
     * Gets the value of %GTK_PRINT_SETTINGS_PAPER_WIDTH,
     * converted to @unit.
     */
    public double getPaperWidth(Unit unit) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_print_settings_get_paper_width(HANDLE(), unit.getValue());
        return RESULT;
    }
    
    /**
     * Gets the value of %GTK_PRINT_SETTINGS_PRINT_PAGES.
     */
    public PrintPages getPrintPages() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_print_settings_get_print_pages(HANDLE());
        return PrintPages.fromValue(RESULT);
    }
    
    /**
     * Convenience function to obtain the value of
     * %GTK_PRINT_SETTINGS_PRINTER.
     */
    public java.lang.String getPrinter() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_print_settings_get_printer(HANDLE());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets the value of %GTK_PRINT_SETTINGS_PRINTER_LPI.
     */
    public double getPrinterLpi() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_print_settings_get_printer_lpi(HANDLE());
        return RESULT;
    }
    
    /**
     * Gets the value of %GTK_PRINT_SETTINGS_QUALITY.
     */
    public PrintQuality getQuality() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_print_settings_get_quality(HANDLE());
        return PrintQuality.fromValue(RESULT);
    }
    
    /**
     * Gets the value of %GTK_PRINT_SETTINGS_RESOLUTION.
     */
    public int getResolution() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_print_settings_get_resolution(HANDLE());
        return RESULT;
    }
    
    /**
     * Gets the value of %GTK_PRINT_SETTINGS_RESOLUTION_X.
     */
    public int getResolutionX() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_print_settings_get_resolution_x(HANDLE());
        return RESULT;
    }
    
    /**
     * Gets the value of %GTK_PRINT_SETTINGS_RESOLUTION_Y.
     */
    public int getResolutionY() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_print_settings_get_resolution_y(HANDLE());
        return RESULT;
    }
    
    /**
     * Gets the value of %GTK_PRINT_SETTINGS_REVERSE.
     */
    public boolean getReverse() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_print_settings_get_reverse(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Gets the value of %GTK_PRINT_SETTINGS_SCALE.
     */
    public double getScale() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_print_settings_get_scale(HANDLE());
        return RESULT;
    }
    
    /**
     * Gets the value of %GTK_PRINT_SETTINGS_USE_COLOR.
     */
    public boolean getUseColor() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_print_settings_get_use_color(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Returns %TRUE, if a value is associated with @key.
     */
    public boolean hasKey(java.lang.String key) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_print_settings_has_key(HANDLE(), Interop.allocateNativeString(key).HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Reads the print settings from @file_name.
     * 
     * If the file could not be loaded then error is set to either
     * a `GFileError` or `GKeyFileError`.
     * 
     * See [method@Gtk.PrintSettings.to_file].
     */
    public boolean loadFile(java.lang.String fileName) throws io.github.jwharm.javagi.interop.GErrorException {
        MemorySegment GERROR = io.github.jwharm.javagi.interop.jextract.GError.allocate(Interop.getScope());
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_print_settings_load_file(HANDLE(), Interop.allocateNativeString(fileName).HANDLE(), GERROR);
        if (! java.util.Objects.equals(MemoryAddress.NULL, GERROR)) {
            throw new io.github.jwharm.javagi.interop.GErrorException(GERROR);
        }
        return (RESULT != 0);
    }
    
    /**
     * Reads the print settings from the group @group_name in @key_file.
     * 
     * If the file could not be loaded then error is set to either a
     * `GFileError` or `GKeyFileError`.
     */
    public boolean loadKeyFile(org.gtk.glib.KeyFile keyFile, java.lang.String groupName) throws io.github.jwharm.javagi.interop.GErrorException {
        MemorySegment GERROR = io.github.jwharm.javagi.interop.jextract.GError.allocate(Interop.getScope());
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_print_settings_load_key_file(HANDLE(), keyFile.HANDLE(), Interop.allocateNativeString(groupName).HANDLE(), GERROR);
        if (! java.util.Objects.equals(MemoryAddress.NULL, GERROR)) {
            throw new io.github.jwharm.javagi.interop.GErrorException(GERROR);
        }
        return (RESULT != 0);
    }
    
    /**
     * Associates @value with @key.
     */
    public void set(java.lang.String key, java.lang.String value) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_print_settings_set(HANDLE(), Interop.allocateNativeString(key).HANDLE(), Interop.allocateNativeString(value).HANDLE());
    }
    
    /**
     * Sets @key to a boolean value.
     */
    public void setBool(java.lang.String key, boolean value) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_print_settings_set_bool(HANDLE(), Interop.allocateNativeString(key).HANDLE(), value ? 1 : 0);
    }
    
    /**
     * Sets the value of %GTK_PRINT_SETTINGS_COLLATE.
     */
    public void setCollate(boolean collate) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_print_settings_set_collate(HANDLE(), collate ? 1 : 0);
    }
    
    /**
     * Sets the value of %GTK_PRINT_SETTINGS_DEFAULT_SOURCE.
     */
    public void setDefaultSource(java.lang.String defaultSource) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_print_settings_set_default_source(HANDLE(), Interop.allocateNativeString(defaultSource).HANDLE());
    }
    
    /**
     * Sets the value of %GTK_PRINT_SETTINGS_DITHER.
     */
    public void setDither(java.lang.String dither) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_print_settings_set_dither(HANDLE(), Interop.allocateNativeString(dither).HANDLE());
    }
    
    /**
     * Sets @key to a double value.
     */
    public void setDouble(java.lang.String key, double value) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_print_settings_set_double(HANDLE(), Interop.allocateNativeString(key).HANDLE(), value);
    }
    
    /**
     * Sets the value of %GTK_PRINT_SETTINGS_DUPLEX.
     */
    public void setDuplex(PrintDuplex duplex) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_print_settings_set_duplex(HANDLE(), duplex.getValue());
    }
    
    /**
     * Sets the value of %GTK_PRINT_SETTINGS_FINISHINGS.
     */
    public void setFinishings(java.lang.String finishings) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_print_settings_set_finishings(HANDLE(), Interop.allocateNativeString(finishings).HANDLE());
    }
    
    /**
     * Sets @key to an integer value.
     */
    public void setInt(java.lang.String key, int value) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_print_settings_set_int(HANDLE(), Interop.allocateNativeString(key).HANDLE(), value);
    }
    
    /**
     * Associates a length in units of @unit with @key.
     */
    public void setLength(java.lang.String key, double value, Unit unit) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_print_settings_set_length(HANDLE(), Interop.allocateNativeString(key).HANDLE(), value, unit.getValue());
    }
    
    /**
     * Sets the value of %GTK_PRINT_SETTINGS_MEDIA_TYPE.
     * 
     * The set of media types is defined in PWG 5101.1-2002 PWG.
     */
    public void setMediaType(java.lang.String mediaType) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_print_settings_set_media_type(HANDLE(), Interop.allocateNativeString(mediaType).HANDLE());
    }
    
    /**
     * Sets the value of %GTK_PRINT_SETTINGS_N_COPIES.
     */
    public void setNCopies(int numCopies) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_print_settings_set_n_copies(HANDLE(), numCopies);
    }
    
    /**
     * Sets the value of %GTK_PRINT_SETTINGS_NUMBER_UP.
     */
    public void setNumberUp(int numberUp) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_print_settings_set_number_up(HANDLE(), numberUp);
    }
    
    /**
     * Sets the value of %GTK_PRINT_SETTINGS_NUMBER_UP_LAYOUT.
     */
    public void setNumberUpLayout(NumberUpLayout numberUpLayout) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_print_settings_set_number_up_layout(HANDLE(), numberUpLayout.getValue());
    }
    
    /**
     * Sets the value of %GTK_PRINT_SETTINGS_ORIENTATION.
     */
    public void setOrientation(PageOrientation orientation) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_print_settings_set_orientation(HANDLE(), orientation.getValue());
    }
    
    /**
     * Sets the value of %GTK_PRINT_SETTINGS_OUTPUT_BIN.
     */
    public void setOutputBin(java.lang.String outputBin) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_print_settings_set_output_bin(HANDLE(), Interop.allocateNativeString(outputBin).HANDLE());
    }
    
    /**
     * Sets the value of %GTK_PRINT_SETTINGS_PAGE_RANGES.
     */
    public void setPageRanges(PageRange[] pageRanges, int numRanges) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_print_settings_set_page_ranges(HANDLE(), Interop.allocateNativeArray(pageRanges), numRanges);
    }
    
    /**
     * Sets the value of %GTK_PRINT_SETTINGS_PAGE_SET.
     */
    public void setPageSet(PageSet pageSet) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_print_settings_set_page_set(HANDLE(), pageSet.getValue());
    }
    
    /**
     * Sets the value of %GTK_PRINT_SETTINGS_PAPER_HEIGHT.
     */
    public void setPaperHeight(double height, Unit unit) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_print_settings_set_paper_height(HANDLE(), height, unit.getValue());
    }
    
    /**
     * Sets the value of %GTK_PRINT_SETTINGS_PAPER_FORMAT,
     * %GTK_PRINT_SETTINGS_PAPER_WIDTH and
     * %GTK_PRINT_SETTINGS_PAPER_HEIGHT.
     */
    public void setPaperSize(PaperSize paperSize) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_print_settings_set_paper_size(HANDLE(), paperSize.HANDLE());
    }
    
    /**
     * Sets the value of %GTK_PRINT_SETTINGS_PAPER_WIDTH.
     */
    public void setPaperWidth(double width, Unit unit) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_print_settings_set_paper_width(HANDLE(), width, unit.getValue());
    }
    
    /**
     * Sets the value of %GTK_PRINT_SETTINGS_PRINT_PAGES.
     */
    public void setPrintPages(PrintPages pages) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_print_settings_set_print_pages(HANDLE(), pages.getValue());
    }
    
    /**
     * Convenience function to set %GTK_PRINT_SETTINGS_PRINTER
     * to @printer.
     */
    public void setPrinter(java.lang.String printer) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_print_settings_set_printer(HANDLE(), Interop.allocateNativeString(printer).HANDLE());
    }
    
    /**
     * Sets the value of %GTK_PRINT_SETTINGS_PRINTER_LPI.
     */
    public void setPrinterLpi(double lpi) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_print_settings_set_printer_lpi(HANDLE(), lpi);
    }
    
    /**
     * Sets the value of %GTK_PRINT_SETTINGS_QUALITY.
     */
    public void setQuality(PrintQuality quality) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_print_settings_set_quality(HANDLE(), quality.getValue());
    }
    
    /**
     * Sets the values of %GTK_PRINT_SETTINGS_RESOLUTION,
     * %GTK_PRINT_SETTINGS_RESOLUTION_X and
     * %GTK_PRINT_SETTINGS_RESOLUTION_Y.
     */
    public void setResolution(int resolution) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_print_settings_set_resolution(HANDLE(), resolution);
    }
    
    /**
     * Sets the values of %GTK_PRINT_SETTINGS_RESOLUTION,
     * %GTK_PRINT_SETTINGS_RESOLUTION_X and
     * %GTK_PRINT_SETTINGS_RESOLUTION_Y.
     */
    public void setResolutionXy(int resolutionX, int resolutionY) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_print_settings_set_resolution_xy(HANDLE(), resolutionX, resolutionY);
    }
    
    /**
     * Sets the value of %GTK_PRINT_SETTINGS_REVERSE.
     */
    public void setReverse(boolean reverse) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_print_settings_set_reverse(HANDLE(), reverse ? 1 : 0);
    }
    
    /**
     * Sets the value of %GTK_PRINT_SETTINGS_SCALE.
     */
    public void setScale(double scale) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_print_settings_set_scale(HANDLE(), scale);
    }
    
    /**
     * Sets the value of %GTK_PRINT_SETTINGS_USE_COLOR.
     */
    public void setUseColor(boolean useColor) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_print_settings_set_use_color(HANDLE(), useColor ? 1 : 0);
    }
    
    /**
     * This function saves the print settings from @settings to @file_name.
     * 
     * If the file could not be written then error is set to either a
     * `GFileError` or `GKeyFileError`.
     */
    public boolean toFile(java.lang.String fileName) throws io.github.jwharm.javagi.interop.GErrorException {
        MemorySegment GERROR = io.github.jwharm.javagi.interop.jextract.GError.allocate(Interop.getScope());
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_print_settings_to_file(HANDLE(), Interop.allocateNativeString(fileName).HANDLE(), GERROR);
        if (! java.util.Objects.equals(MemoryAddress.NULL, GERROR)) {
            throw new io.github.jwharm.javagi.interop.GErrorException(GERROR);
        }
        return (RESULT != 0);
    }
    
    /**
     * Serialize print settings to an a{sv} variant.
     */
    public org.gtk.glib.Variant toGvariant() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_print_settings_to_gvariant(HANDLE());
        return new org.gtk.glib.Variant(ProxyFactory.get(RESULT, false));
    }
    
    /**
     * This function adds the print settings from @settings to @key_file.
     */
    public void toKeyFile(org.gtk.glib.KeyFile keyFile, java.lang.String groupName) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_print_settings_to_key_file(HANDLE(), keyFile.HANDLE(), Interop.allocateNativeString(groupName).HANDLE());
    }
    
    /**
     * Removes any value associated with @key.
     * 
     * This has the same effect as setting the value to %NULL.
     */
    public void unset(java.lang.String key) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_print_settings_unset(HANDLE(), Interop.allocateNativeString(key).HANDLE());
    }
    
}
