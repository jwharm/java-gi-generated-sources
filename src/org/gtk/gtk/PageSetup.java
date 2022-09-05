package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A `GtkPageSetup` object stores the page size, orientation and margins.
 * 
 * The idea is that you can get one of these from the page setup dialog
 * and then pass it to the `GtkPrintOperation` when printing.
 * The benefit of splitting this out of the `GtkPrintSettings` is that
 * these affect the actual layout of the page, and thus need to be set
 * long before user prints.
 * 
 * ## Margins
 * 
 * The margins specified in this object are the “print margins”, i.e. the
 * parts of the page that the printer cannot print on. These are different
 * from the layout margins that a word processor uses; they are typically
 * used to determine the minimal size for the layout margins.
 * 
 * To obtain a `GtkPageSetup` use [ctor@Gtk.PageSetup.new] to get the defaults,
 * or use [func@Gtk.print_run_page_setup_dialog] to show the page setup dialog
 * and receive the resulting page setup.
 * 
 * ## A page setup dialog
 * 
 * ```c
 * static GtkPrintSettings *settings = NULL;
 * static GtkPageSetup *page_setup = NULL;
 * 
 * static void
 * do_page_setup (void)
 * {
 *   GtkPageSetup *new_page_setup;
 * 
 *   if (settings == NULL)
 *     settings = gtk_print_settings_new ();
 * 
 *   new_page_setup = gtk_print_run_page_setup_dialog (GTK_WINDOW (main_window),
 *                                                     page_setup, settings);
 * 
 *   if (page_setup)
 *     g_object_unref (page_setup);
 * 
 *   page_setup = new_page_setup;
 * }
 * ```
 */
public class PageSetup extends org.gtk.gobject.Object {

    public PageSetup(io.github.jwharm.javagi.interop.Proxy proxy) {
        super(proxy);
    }
    
    /** Cast object to PageSetup */
    public static PageSetup castFrom(org.gtk.gobject.Object gobject) {
        return new PageSetup(gobject.getProxy());
    }
    
    /**
     * Creates a new `GtkPageSetup`.
     */
    public PageSetup() {
        super(ProxyFactory.get(io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_page_setup_new(), true));
    }
    
    /**
     * Desrialize a page setup from an a{sv} variant.
     * 
     * The variant must be in the format produced by
     * [method@Gtk.PageSetup.to_gvariant].
     */
    public PageSetup(org.gtk.glib.Variant variant) {
        super(ProxyFactory.get(io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_page_setup_new_from_gvariant(variant.HANDLE()), true));
    }
    
    /**
     * Copies a `GtkPageSetup`.
     */
    public PageSetup copy() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_page_setup_copy(HANDLE());
        return new PageSetup(ProxyFactory.get(RESULT, true));
    }
    
    /**
     * Gets the bottom margin in units of @unit.
     */
    public double getBottomMargin(Unit unit) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_page_setup_get_bottom_margin(HANDLE(), unit.getValue());
        return RESULT;
    }
    
    /**
     * Gets the left margin in units of @unit.
     */
    public double getLeftMargin(Unit unit) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_page_setup_get_left_margin(HANDLE(), unit.getValue());
        return RESULT;
    }
    
    /**
     * Gets the page orientation of the `GtkPageSetup`.
     */
    public PageOrientation getOrientation() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_page_setup_get_orientation(HANDLE());
        return PageOrientation.fromValue(RESULT);
    }
    
    /**
     * Returns the page height in units of @unit.
     * 
     * Note that this function takes orientation
     * and margins into consideration.
     * See [method@Gtk.PageSetup.get_paper_height].
     */
    public double getPageHeight(Unit unit) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_page_setup_get_page_height(HANDLE(), unit.getValue());
        return RESULT;
    }
    
    /**
     * Returns the page width in units of @unit.
     * 
     * Note that this function takes orientation
     * and margins into consideration.
     * See [method@Gtk.PageSetup.get_paper_width].
     */
    public double getPageWidth(Unit unit) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_page_setup_get_page_width(HANDLE(), unit.getValue());
        return RESULT;
    }
    
    /**
     * Returns the paper height in units of @unit.
     * 
     * Note that this function takes orientation,
     * but not margins into consideration.
     * See [method@Gtk.PageSetup.get_page_height].
     */
    public double getPaperHeight(Unit unit) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_page_setup_get_paper_height(HANDLE(), unit.getValue());
        return RESULT;
    }
    
    /**
     * Gets the paper size of the `GtkPageSetup`.
     */
    public PaperSize getPaperSize() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_page_setup_get_paper_size(HANDLE());
        return new PaperSize(ProxyFactory.get(RESULT, false));
    }
    
    /**
     * Returns the paper width in units of @unit.
     * 
     * Note that this function takes orientation,
     * but not margins into consideration.
     * See [method@Gtk.PageSetup.get_page_width].
     */
    public double getPaperWidth(Unit unit) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_page_setup_get_paper_width(HANDLE(), unit.getValue());
        return RESULT;
    }
    
    /**
     * Gets the right margin in units of @unit.
     */
    public double getRightMargin(Unit unit) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_page_setup_get_right_margin(HANDLE(), unit.getValue());
        return RESULT;
    }
    
    /**
     * Gets the top margin in units of @unit.
     */
    public double getTopMargin(Unit unit) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_page_setup_get_top_margin(HANDLE(), unit.getValue());
        return RESULT;
    }
    
    /**
     * Reads the page setup from the file @file_name.
     * 
     * See [method@Gtk.PageSetup.to_file].
     */
    public boolean loadFile(java.lang.String fileName) throws io.github.jwharm.javagi.interop.GErrorException {
        MemorySegment GERROR = io.github.jwharm.javagi.interop.jextract.GError.allocate(Interop.getScope());
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_page_setup_load_file(HANDLE(), Interop.allocateNativeString(fileName).HANDLE(), GERROR);
        if (! java.util.Objects.equals(MemoryAddress.NULL, GERROR)) {
            throw new io.github.jwharm.javagi.interop.GErrorException(GERROR);
        }
        return (RESULT != 0);
    }
    
    /**
     * Reads the page setup from the group @group_name in the key file
     * @key_file.
     */
    public boolean loadKeyFile(org.gtk.glib.KeyFile keyFile, java.lang.String groupName) throws io.github.jwharm.javagi.interop.GErrorException {
        MemorySegment GERROR = io.github.jwharm.javagi.interop.jextract.GError.allocate(Interop.getScope());
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_page_setup_load_key_file(HANDLE(), keyFile.HANDLE(), Interop.allocateNativeString(groupName).HANDLE(), GERROR);
        if (! java.util.Objects.equals(MemoryAddress.NULL, GERROR)) {
            throw new io.github.jwharm.javagi.interop.GErrorException(GERROR);
        }
        return (RESULT != 0);
    }
    
    /**
     * Sets the bottom margin of the `GtkPageSetup`.
     */
    public void setBottomMargin(double margin, Unit unit) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_page_setup_set_bottom_margin(HANDLE(), margin, unit.getValue());
    }
    
    /**
     * Sets the left margin of the `GtkPageSetup`.
     */
    public void setLeftMargin(double margin, Unit unit) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_page_setup_set_left_margin(HANDLE(), margin, unit.getValue());
    }
    
    /**
     * Sets the page orientation of the `GtkPageSetup`.
     */
    public void setOrientation(PageOrientation orientation) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_page_setup_set_orientation(HANDLE(), orientation.getValue());
    }
    
    /**
     * Sets the paper size of the `GtkPageSetup` without
     * changing the margins.
     * 
     * See [method@Gtk.PageSetup.set_paper_size_and_default_margins].
     */
    public void setPaperSize(PaperSize size) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_page_setup_set_paper_size(HANDLE(), size.HANDLE());
    }
    
    /**
     * Sets the paper size of the `GtkPageSetup` and modifies
     * the margins according to the new paper size.
     */
    public void setPaperSizeAndDefaultMargins(PaperSize size) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_page_setup_set_paper_size_and_default_margins(HANDLE(), size.HANDLE());
    }
    
    /**
     * Sets the right margin of the `GtkPageSetup`.
     */
    public void setRightMargin(double margin, Unit unit) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_page_setup_set_right_margin(HANDLE(), margin, unit.getValue());
    }
    
    /**
     * Sets the top margin of the `GtkPageSetup`.
     */
    public void setTopMargin(double margin, Unit unit) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_page_setup_set_top_margin(HANDLE(), margin, unit.getValue());
    }
    
    /**
     * This function saves the information from @setup to @file_name.
     */
    public boolean toFile(java.lang.String fileName) throws io.github.jwharm.javagi.interop.GErrorException {
        MemorySegment GERROR = io.github.jwharm.javagi.interop.jextract.GError.allocate(Interop.getScope());
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_page_setup_to_file(HANDLE(), Interop.allocateNativeString(fileName).HANDLE(), GERROR);
        if (! java.util.Objects.equals(MemoryAddress.NULL, GERROR)) {
            throw new io.github.jwharm.javagi.interop.GErrorException(GERROR);
        }
        return (RESULT != 0);
    }
    
    /**
     * Serialize page setup to an a{sv} variant.
     */
    public org.gtk.glib.Variant toGvariant() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_page_setup_to_gvariant(HANDLE());
        return new org.gtk.glib.Variant(ProxyFactory.get(RESULT, false));
    }
    
    /**
     * This function adds the page setup from @setup to @key_file.
     */
    public void toKeyFile(org.gtk.glib.KeyFile keyFile, java.lang.String groupName) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_page_setup_to_key_file(HANDLE(), keyFile.HANDLE(), Interop.allocateNativeString(groupName).HANDLE());
    }
    
}
