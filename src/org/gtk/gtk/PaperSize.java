package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * `GtkPaperSize` handles paper sizes.
 * 
 * It uses the standard called
 * [PWG 5101.1-2002 PWG: Standard for Media Standardized Names](http://www.pwg.org/standards.html)
 * to name the paper sizes (and to get the data for the page sizes).
 * In addition to standard paper sizes, `GtkPaperSize` allows to
 * construct custom paper sizes with arbitrary dimensions.
 * 
 * The `GtkPaperSize` object stores not only the dimensions (width
 * and height) of a paper size and its name, it also provides
 * default print margins.
 */
public class PaperSize extends io.github.jwharm.javagi.interop.ResourceBase {

    public PaperSize(io.github.jwharm.javagi.interop.Reference reference) {
        super(reference);
    }
    
    /**
     * Creates a new `GtkPaperSize` object by parsing a
     * [PWG 5101.1-2002](ftp://ftp.pwg.org/pub/pwg/candidates/cs-pwgmsn10-20020226-5101.1.pdf)
     * paper name.
     * 
     * If @name is %NULL, the default paper size is returned,
     * see [func@Gtk.PaperSize.get_default].
     */
    public PaperSize(java.lang.String name) {
        super(References.get(gtk_h.gtk_paper_size_new(Interop.allocateNativeString(name).handle()), true));
    }
    
    /**
     * Creates a new `GtkPaperSize` object with the
     * given parameters.
     */
    public static PaperSize newCustom(java.lang.String name, java.lang.String displayName, double width, double height, Unit unit) {
        return new PaperSize(References.get(gtk_h.gtk_paper_size_new_custom(Interop.allocateNativeString(name).handle(), Interop.allocateNativeString(displayName).handle(), width, height, unit.getValue()), true));
    }
    
    /**
     * Deserialize a paper size from a `GVariant`.
     * 
     * The `GVariant must be in the format produced by
     * [method@Gtk.PaperSize.to_gvariant].
     */
    public static PaperSize newFromGvariant(org.gtk.glib.Variant variant) {
        return new PaperSize(References.get(gtk_h.gtk_paper_size_new_from_gvariant(variant.handle()), true));
    }
    
    /**
     * Creates a new `GtkPaperSize` object by using
     * IPP information.
     * 
     * If @ipp_name is not a recognized paper name,
     * @width and @height are used to
     * construct a custom `GtkPaperSize` object.
     */
    public static PaperSize newFromIpp(java.lang.String ippName, double width, double height) {
        return new PaperSize(References.get(gtk_h.gtk_paper_size_new_from_ipp(Interop.allocateNativeString(ippName).handle(), width, height), true));
    }
    
    private static Reference constructNewFromKeyFileOrThrow(org.gtk.glib.KeyFile keyFile, java.lang.String groupName) throws GErrorException {
        MemorySegment GERROR = io.github.jwharm.javagi.interop.jextract.GError.allocate(Interop.getScope());
        Reference RESULT = References.get(gtk_h.gtk_paper_size_new_from_key_file(keyFile.handle(), Interop.allocateNativeString(groupName).handle(), GERROR), true);
        if (! java.util.Objects.equals(MemoryAddress.NULL, GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT;
    }
    
    /**
     * Reads a paper size from the group @group_name in the key file
     * @key_file.
     */
    public static PaperSize newFromKeyFile(org.gtk.glib.KeyFile keyFile, java.lang.String groupName) throws GErrorException {
        return new PaperSize(constructNewFromKeyFileOrThrow(keyFile, groupName));
    }
    
    /**
     * Creates a new `GtkPaperSize` object by using
     * PPD information.
     * 
     * If @ppd_name is not a recognized PPD paper name,
     * @ppd_display_name, @width and @height are used to
     * construct a custom `GtkPaperSize` object.
     */
    public static PaperSize newFromPpd(java.lang.String ppdName, java.lang.String ppdDisplayName, double width, double height) {
        return new PaperSize(References.get(gtk_h.gtk_paper_size_new_from_ppd(Interop.allocateNativeString(ppdName).handle(), Interop.allocateNativeString(ppdDisplayName).handle(), width, height), true));
    }
    
    /**
     * Copies an existing `GtkPaperSize`.
     */
    public PaperSize copy() {
        var RESULT = gtk_h.gtk_paper_size_copy(handle());
        return new PaperSize(References.get(RESULT, true));
    }
    
    /**
     * Free the given `GtkPaperSize` object.
     */
    public void free() {
        gtk_h.gtk_paper_size_free(handle());
    }
    
    /**
     * Gets the default bottom margin for the `GtkPaperSize`.
     */
    public double getDefaultBottomMargin(Unit unit) {
        var RESULT = gtk_h.gtk_paper_size_get_default_bottom_margin(handle(), unit.getValue());
        return RESULT;
    }
    
    /**
     * Gets the default left margin for the `GtkPaperSize`.
     */
    public double getDefaultLeftMargin(Unit unit) {
        var RESULT = gtk_h.gtk_paper_size_get_default_left_margin(handle(), unit.getValue());
        return RESULT;
    }
    
    /**
     * Gets the default right margin for the `GtkPaperSize`.
     */
    public double getDefaultRightMargin(Unit unit) {
        var RESULT = gtk_h.gtk_paper_size_get_default_right_margin(handle(), unit.getValue());
        return RESULT;
    }
    
    /**
     * Gets the default top margin for the `GtkPaperSize`.
     */
    public double getDefaultTopMargin(Unit unit) {
        var RESULT = gtk_h.gtk_paper_size_get_default_top_margin(handle(), unit.getValue());
        return RESULT;
    }
    
    /**
     * Gets the human-readable name of the `GtkPaperSize`.
     */
    public java.lang.String getDisplayName() {
        var RESULT = gtk_h.gtk_paper_size_get_display_name(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets the paper height of the `GtkPaperSize`, in
     * units of @unit.
     */
    public double getHeight(Unit unit) {
        var RESULT = gtk_h.gtk_paper_size_get_height(handle(), unit.getValue());
        return RESULT;
    }
    
    /**
     * Gets the name of the `GtkPaperSize`.
     */
    public java.lang.String getName() {
        var RESULT = gtk_h.gtk_paper_size_get_name(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets the PPD name of the `GtkPaperSize`, which
     * may be %NULL.
     */
    public java.lang.String getPpdName() {
        var RESULT = gtk_h.gtk_paper_size_get_ppd_name(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets the paper width of the `GtkPaperSize`, in
     * units of @unit.
     */
    public double getWidth(Unit unit) {
        var RESULT = gtk_h.gtk_paper_size_get_width(handle(), unit.getValue());
        return RESULT;
    }
    
    /**
     * Returns %TRUE if @size is not a standard paper size.
     */
    public boolean isCustom() {
        var RESULT = gtk_h.gtk_paper_size_is_custom(handle());
        return (RESULT != 0);
    }
    
    /**
     * Compares two `GtkPaperSize` objects.
     */
    public boolean isEqual(PaperSize size2) {
        var RESULT = gtk_h.gtk_paper_size_is_equal(handle(), size2.handle());
        return (RESULT != 0);
    }
    
    /**
     * Returns %TRUE if @size is an IPP standard paper size.
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
     * Serialize a paper size to an `a{sv}` variant.
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
    
}
