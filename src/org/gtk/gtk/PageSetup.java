package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A <code>GtkPageSetup</code> object stores the page size, orientation and margins.
 * <p>
 * The idea is that you can get one of these from the page setup dialog
 * and then pass it to the <code>GtkPrintOperation</code> when printing.
 * The benefit of splitting this out of the <code>GtkPrintSettings</code> is that
 * these affect the actual layout of the page, and thus need to be set
 * long before user prints.
 * <p>
 * <h2>Margins</h2>
 * <p>
 * The margins specified in this object are the &<code>#8220</code> print margins&<code>#8221</code> , i.e. the
 * parts of the page that the printer cannot print on. These are different
 * from the layout margins that a word processor uses; they are typically
 * used to determine the minimal size for the layout margins.
 * <p>
 * To obtain a <code>GtkPageSetup</code> use {@link [ctor@Gtk.PageSetup.new] (ref=ctor)} to get the defaults,
 * or use {@link Gtk<code>#printRunPageSetupDialog</code>  to show the page setup dialog
 * and receive the resulting page setup.
 * <p>
 * <h2>A page setup dialog</h2>
 * <p><pre>c
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
 * </pre>
 */
public class PageSetup extends org.gtk.gobject.Object {

    public PageSetup(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to PageSetup */
    public static PageSetup castFrom(org.gtk.gobject.Object gobject) {
        return new PageSetup(gobject.getReference());
    }
    
    private static Reference constructNew() {
        Reference RESULT = References.get(gtk_h.gtk_page_setup_new(), true);
        return RESULT;
    }
    
    /**
     * Creates a new <code>GtkPageSetup</code>.
     */
    public PageSetup() {
        super(constructNew());
    }
    
    private static Reference constructNewFromFile(java.lang.String fileName) throws GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        Reference RESULT = References.get(gtk_h.gtk_page_setup_new_from_file(Interop.allocateNativeString(fileName).handle(), GERROR), true);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT;
    }
    
    /**
     * Reads the page setup from the file @file_name.
     * <p>
     * Returns a new <code>GtkPageSetup</code> object with the restored
     * page setup, or <code>null</code> if an error occurred.
     * See {@link org.gtk.gtk.PageSetup<code>#toFile</code> .
     */
    public static PageSetup newFromFile(java.lang.String fileName) throws GErrorException {
        return new PageSetup(constructNewFromFile(fileName));
    }
    
    private static Reference constructNewFromGvariant(org.gtk.glib.Variant variant) {
        Reference RESULT = References.get(gtk_h.gtk_page_setup_new_from_gvariant(variant.handle()), true);
        return RESULT;
    }
    
    /**
     * Desrialize a page setup from an a{sv} variant.
     * 
     * The variant must be in the format produced by
     * {@link org.gtk.gtk.PageSetup<code>#toGvariant</code> .
     */
    public static PageSetup newFromGvariant(org.gtk.glib.Variant variant) {
        return new PageSetup(constructNewFromGvariant(variant));
    }
    
    private static Reference constructNewFromKeyFile(org.gtk.glib.KeyFile keyFile, java.lang.String groupName) throws GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        Reference RESULT = References.get(gtk_h.gtk_page_setup_new_from_key_file(keyFile.handle(), Interop.allocateNativeString(groupName).handle(), GERROR), true);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT;
    }
    
    /**
     * Reads the page setup from the group @group_name in the key file
     * @key_file.
     * <p>
     * Returns a new <code>GtkPageSetup</code> object with the restored
     * page setup, or <code>null</code> if an error occurred.
     */
    public static PageSetup newFromKeyFile(org.gtk.glib.KeyFile keyFile, java.lang.String groupName) throws GErrorException {
        return new PageSetup(constructNewFromKeyFile(keyFile, groupName));
    }
    
    /**
     * Copies a <code>GtkPageSetup</code>.
     */
    public PageSetup copy() {
        var RESULT = gtk_h.gtk_page_setup_copy(handle());
        return new PageSetup(References.get(RESULT, true));
    }
    
    /**
     * Gets the bottom margin in units of @unit.
     */
    public double getBottomMargin(Unit unit) {
        var RESULT = gtk_h.gtk_page_setup_get_bottom_margin(handle(), unit.getValue());
        return RESULT;
    }
    
    /**
     * Gets the left margin in units of @unit.
     */
    public double getLeftMargin(Unit unit) {
        var RESULT = gtk_h.gtk_page_setup_get_left_margin(handle(), unit.getValue());
        return RESULT;
    }
    
    /**
     * Gets the page orientation of the <code>GtkPageSetup</code>.
     */
    public PageOrientation getOrientation() {
        var RESULT = gtk_h.gtk_page_setup_get_orientation(handle());
        return PageOrientation.fromValue(RESULT);
    }
    
    /**
     * Returns the page height in units of @unit.
     * 
     * Note that this function takes orientation
     * and margins into consideration.
     * See {@link org.gtk.gtk.PageSetup<code>#getPaperHeight</code> .
     */
    public double getPageHeight(Unit unit) {
        var RESULT = gtk_h.gtk_page_setup_get_page_height(handle(), unit.getValue());
        return RESULT;
    }
    
    /**
     * Returns the page width in units of @unit.
     * 
     * Note that this function takes orientation
     * and margins into consideration.
     * See {@link org.gtk.gtk.PageSetup<code>#getPaperWidth</code> .
     */
    public double getPageWidth(Unit unit) {
        var RESULT = gtk_h.gtk_page_setup_get_page_width(handle(), unit.getValue());
        return RESULT;
    }
    
    /**
     * Returns the paper height in units of @unit.
     * 
     * Note that this function takes orientation,
     * but not margins into consideration.
     * See {@link org.gtk.gtk.PageSetup<code>#getPageHeight</code> .
     */
    public double getPaperHeight(Unit unit) {
        var RESULT = gtk_h.gtk_page_setup_get_paper_height(handle(), unit.getValue());
        return RESULT;
    }
    
    /**
     * Gets the paper size of the <code>GtkPageSetup</code>.
     */
    public PaperSize getPaperSize() {
        var RESULT = gtk_h.gtk_page_setup_get_paper_size(handle());
        return new PaperSize(References.get(RESULT, false));
    }
    
    /**
     * Returns the paper width in units of @unit.
     * 
     * Note that this function takes orientation,
     * but not margins into consideration.
     * See {@link org.gtk.gtk.PageSetup<code>#getPageWidth</code> .
     */
    public double getPaperWidth(Unit unit) {
        var RESULT = gtk_h.gtk_page_setup_get_paper_width(handle(), unit.getValue());
        return RESULT;
    }
    
    /**
     * Gets the right margin in units of @unit.
     */
    public double getRightMargin(Unit unit) {
        var RESULT = gtk_h.gtk_page_setup_get_right_margin(handle(), unit.getValue());
        return RESULT;
    }
    
    /**
     * Gets the top margin in units of @unit.
     */
    public double getTopMargin(Unit unit) {
        var RESULT = gtk_h.gtk_page_setup_get_top_margin(handle(), unit.getValue());
        return RESULT;
    }
    
    /**
     * Reads the page setup from the file @file_name.
     * 
     * See {@link org.gtk.gtk.PageSetup<code>#toFile</code> .
     */
    public boolean loadFile(java.lang.String fileName) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.gtk_page_setup_load_file(handle(), Interop.allocateNativeString(fileName).handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return (RESULT != 0);
    }
    
    /**
     * Reads the page setup from the group @group_name in the key file
     * @key_file.
     */
    public boolean loadKeyFile(org.gtk.glib.KeyFile keyFile, java.lang.String groupName) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.gtk_page_setup_load_key_file(handle(), keyFile.handle(), Interop.allocateNativeString(groupName).handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return (RESULT != 0);
    }
    
    /**
     * Sets the bottom margin of the <code>GtkPageSetup</code>.
     */
    public void setBottomMargin(double margin, Unit unit) {
        gtk_h.gtk_page_setup_set_bottom_margin(handle(), margin, unit.getValue());
    }
    
    /**
     * Sets the left margin of the <code>GtkPageSetup</code>.
     */
    public void setLeftMargin(double margin, Unit unit) {
        gtk_h.gtk_page_setup_set_left_margin(handle(), margin, unit.getValue());
    }
    
    /**
     * Sets the page orientation of the <code>GtkPageSetup</code>.
     */
    public void setOrientation(PageOrientation orientation) {
        gtk_h.gtk_page_setup_set_orientation(handle(), orientation.getValue());
    }
    
    /**
     * Sets the paper size of the <code>GtkPageSetup</code> without
     * changing the margins.
     * 
     * See {@link org.gtk.gtk.PageSetup<code>#setPaperSizeAndDefaultMargins</code> .
     */
    public void setPaperSize(PaperSize size) {
        gtk_h.gtk_page_setup_set_paper_size(handle(), size.handle());
    }
    
    /**
     * Sets the paper size of the <code>GtkPageSetup</code> and modifies
     * the margins according to the new paper size.
     */
    public void setPaperSizeAndDefaultMargins(PaperSize size) {
        gtk_h.gtk_page_setup_set_paper_size_and_default_margins(handle(), size.handle());
    }
    
    /**
     * Sets the right margin of the <code>GtkPageSetup</code>.
     */
    public void setRightMargin(double margin, Unit unit) {
        gtk_h.gtk_page_setup_set_right_margin(handle(), margin, unit.getValue());
    }
    
    /**
     * Sets the top margin of the <code>GtkPageSetup</code>.
     */
    public void setTopMargin(double margin, Unit unit) {
        gtk_h.gtk_page_setup_set_top_margin(handle(), margin, unit.getValue());
    }
    
    /**
     * This function saves the information from @setup to @file_name.
     */
    public boolean toFile(java.lang.String fileName) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.gtk_page_setup_to_file(handle(), Interop.allocateNativeString(fileName).handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return (RESULT != 0);
    }
    
    /**
     * Serialize page setup to an a{sv} variant.
     */
    public org.gtk.glib.Variant toGvariant() {
        var RESULT = gtk_h.gtk_page_setup_to_gvariant(handle());
        return new org.gtk.glib.Variant(References.get(RESULT, false));
    }
    
    /**
     * This function adds the page setup from @setup to @key_file.
     */
    public void toKeyFile(org.gtk.glib.KeyFile keyFile, java.lang.String groupName) {
        gtk_h.gtk_page_setup_to_key_file(handle(), keyFile.handle(), Interop.allocateNativeString(groupName).handle());
    }
    
}
