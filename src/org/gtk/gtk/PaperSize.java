package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * <code>GtkPaperSize</code> handles paper sizes.
 * <p>
 * It uses the standard called
 * {@link [PWG 5101.1-2002 PWG: Standard for Media Standardized Names]}(http://www.pwg.org/standards.html)
 * to name the paper sizes (and to get the data for the page sizes).
 * In addition to standard paper sizes, <code>GtkPaperSize</code> allows to
 * construct custom paper sizes with arbitrary dimensions.
 * <p>
 * The <code>GtkPaperSize</code> object stores not only the dimensions (width
 * and height) of a paper size and its name, it also provides
 * default print margins.
 */
public class PaperSize extends io.github.jwharm.javagi.ResourceBase {

    public PaperSize(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    private static Reference constructNew(java.lang.String name) {
        Reference RESULT = References.get(gtk_h.gtk_paper_size_new(Interop.allocateNativeString(name).handle()), true);
        return RESULT;
    }
    
    /**
     * Creates a new <code>GtkPaperSize</code> object by parsing a
     * {@link [PWG 5101.1-2002]}(ftp://ftp.pwg.org/pub/pwg/candidates/cs-pwgmsn10-20020226-5101.1.pdf)
     * paper name.
     * 
     * If @name is <code>null</code>  the default paper size is returned,
     * see {@link Gtk<code>#PaperSize</code> .
     */
    public PaperSize(java.lang.String name) {
        super(constructNew(name));
    }
    
    private static Reference constructNewCustom(java.lang.String name, java.lang.String displayName, double width, double height, Unit unit) {
        Reference RESULT = References.get(gtk_h.gtk_paper_size_new_custom(Interop.allocateNativeString(name).handle(), Interop.allocateNativeString(displayName).handle(), width, height, unit.getValue()), true);
        return RESULT;
    }
    
    /**
     * Creates a new <code>GtkPaperSize</code> object with the
     * given parameters.
     */
    public static PaperSize newCustom(java.lang.String name, java.lang.String displayName, double width, double height, Unit unit) {
        return new PaperSize(constructNewCustom(name, displayName, width, height, unit));
    }
    
    private static Reference constructNewFromGvariant(org.gtk.glib.Variant variant) {
        Reference RESULT = References.get(gtk_h.gtk_paper_size_new_from_gvariant(variant.handle()), true);
        return RESULT;
    }
    
    /**
     * Deserialize a paper size from a <code>GVariant</code>.
     * <p>
     * The <code>GVariant must be in the format produced by
     * {@link org.gtk.gtk.PaperSize<code>#toGvariant</code> .
     */
    public static PaperSize newFromGvariant(org.gtk.glib.Variant variant) {
        return new PaperSize(constructNewFromGvariant(variant));
    }
    
    private static Reference constructNewFromIpp(java.lang.String ippName, double width, double height) {
        Reference RESULT = References.get(gtk_h.gtk_paper_size_new_from_ipp(Interop.allocateNativeString(ippName).handle(), width, height), true);
        return RESULT;
    }
    
    /**
     * Creates a new <code>GtkPaperSize</code> object by using
     * IPP information.
     * <p>
     * If @ipp_name is not a recognized paper name,
     * @width and @height are used to
     * construct a custom <code>GtkPaperSize</code> object.
     */
    public static PaperSize newFromIpp(java.lang.String ippName, double width, double height) {
        return new PaperSize(constructNewFromIpp(ippName, width, height));
    }
    
    private static Reference constructNewFromKeyFile(org.gtk.glib.KeyFile keyFile, java.lang.String groupName) throws GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        Reference RESULT = References.get(gtk_h.gtk_paper_size_new_from_key_file(keyFile.handle(), Interop.allocateNativeString(groupName).handle(), GERROR), true);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT;
    }
    
    /**
     * Reads a paper size from the group @group_name in the key file
     * @key_file.
     */
    public static PaperSize newFromKeyFile(org.gtk.glib.KeyFile keyFile, java.lang.String groupName) throws GErrorException {
        return new PaperSize(constructNewFromKeyFile(keyFile, groupName));
    }
    
    private static Reference constructNewFromPpd(java.lang.String ppdName, java.lang.String ppdDisplayName, double width, double height) {
        Reference RESULT = References.get(gtk_h.gtk_paper_size_new_from_ppd(Interop.allocateNativeString(ppdName).handle(), Interop.allocateNativeString(ppdDisplayName).handle(), width, height), true);
        return RESULT;
    }
    
    /**
     * Creates a new <code>GtkPaperSize</code> object by using
     * PPD information.
     * <p>
     * If @ppd_name is not a recognized PPD paper name,
     * @ppd_display_name, @width and @height are used to
     * construct a custom <code>GtkPaperSize</code> object.
     */
    public static PaperSize newFromPpd(java.lang.String ppdName, java.lang.String ppdDisplayName, double width, double height) {
        return new PaperSize(constructNewFromPpd(ppdName, ppdDisplayName, width, height));
    }
    
    /**
     * Copies an existing <code>GtkPaperSize</code>.
     */
    public PaperSize copy() {
        var RESULT = gtk_h.gtk_paper_size_copy(handle());
        return new PaperSize(References.get(RESULT, true));
    }
    
    /**
     * Free the given <code>GtkPaperSize</code> object.
     */
    public void free() {
        gtk_h.gtk_paper_size_free(handle());
    }
    
    /**
     * Gets the default bottom margin for the <code>GtkPaperSize</code>.
     */
    public double getDefaultBottomMargin(Unit unit) {
        var RESULT = gtk_h.gtk_paper_size_get_default_bottom_margin(handle(), unit.getValue());
        return RESULT;
    }
    
    /**
     * Gets the default left margin for the <code>GtkPaperSize</code>.
     */
    public double getDefaultLeftMargin(Unit unit) {
        var RESULT = gtk_h.gtk_paper_size_get_default_left_margin(handle(), unit.getValue());
        return RESULT;
    }
    
    /**
     * Gets the default right margin for the <code>GtkPaperSize</code>.
     */
    public double getDefaultRightMargin(Unit unit) {
        var RESULT = gtk_h.gtk_paper_size_get_default_right_margin(handle(), unit.getValue());
        return RESULT;
    }
    
    /**
     * Gets the default top margin for the <code>GtkPaperSize</code>.
     */
    public double getDefaultTopMargin(Unit unit) {
        var RESULT = gtk_h.gtk_paper_size_get_default_top_margin(handle(), unit.getValue());
        return RESULT;
    }
    
    /**
     * Gets the human-readable name of the <code>GtkPaperSize</code>.
     */
    public java.lang.String getDisplayName() {
        var RESULT = gtk_h.gtk_paper_size_get_display_name(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets the paper height of the <code>GtkPaperSize</code>, in
     * units of @unit.
     */
    public double getHeight(Unit unit) {
        var RESULT = gtk_h.gtk_paper_size_get_height(handle(), unit.getValue());
        return RESULT;
    }
    
    /**
     * Gets the name of the <code>GtkPaperSize</code>.
     */
    public java.lang.String getName() {
        var RESULT = gtk_h.gtk_paper_size_get_name(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets the PPD name of the <code>GtkPaperSize</code>, which
     * may be <code>null</code>
     */
    public java.lang.String getPpdName() {
        var RESULT = gtk_h.gtk_paper_size_get_ppd_name(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets the paper width of the <code>GtkPaperSize</code>, in
     * units of @unit.
     */
    public double getWidth(Unit unit) {
        var RESULT = gtk_h.gtk_paper_size_get_width(handle(), unit.getValue());
        return RESULT;
    }
    
    /**
     * Returns <code>true</code> if @size is not a standard paper size.
     */
    public boolean isCustom() {
        var RESULT = gtk_h.gtk_paper_size_is_custom(handle());
        return (RESULT != 0);
    }
    
    /**
     * Compares two <code>GtkPaperSize</code> objects.
     */
    public boolean isEqual(PaperSize size2) {
        var RESULT = gtk_h.gtk_paper_size_is_equal(handle(), size2.handle());
        return (RESULT != 0);
    }
    
    /**
     * Returns <code>true</code> if @size is an IPP standard paper size.
     */
    public boolean isIpp() {
        var RESULT = gtk_h.gtk_paper_size_is_ipp(handle());
        return (RESULT != 0);
    }
    
    /**
     * Changes the dimensions of a @size to @width x @height.
     */
    public void setSize(double width, double height, Unit unit) {
        gtk_h.gtk_paper_size_set_size(handle(), width, height, unit.getValue());
    }
    
    /**
     * Serialize a paper size to an <code>a{sv}</code> variant.
     */
    public org.gtk.glib.Variant toGvariant() {
        var RESULT = gtk_h.gtk_paper_size_to_gvariant(handle());
        return new org.gtk.glib.Variant(References.get(RESULT, false));
    }
    
    /**
     * This function adds the paper size from @size to @key_file.
     */
    public void toKeyFile(org.gtk.glib.KeyFile keyFile, java.lang.String groupName) {
        gtk_h.gtk_paper_size_to_key_file(handle(), keyFile.handle(), Interop.allocateNativeString(groupName).handle());
    }
    
    /**
     * Returns the name of the default paper size, which
     * depends on the current locale.
     */
    public static java.lang.String getDefault() {
        var RESULT = gtk_h.gtk_paper_size_get_default();
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Creates a list of known paper sizes.
     */
    public static org.gtk.glib.List getPaperSizes(boolean includeCustom) {
        var RESULT = gtk_h.gtk_paper_size_get_paper_sizes(includeCustom ? 1 : 0);
        return new org.gtk.glib.List(References.get(RESULT, true));
    }
    
}
