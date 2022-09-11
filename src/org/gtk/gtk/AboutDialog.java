package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * The `GtkAboutDialog` offers a simple way to display information about
 * a program.
 * 
 * The shown information includes the programs' logo, name, copyright,
 * website and license. It is also possible to give credits to the authors,
 * documenters, translators and artists who have worked on the program.
 * 
 * An about dialog is typically opened when the user selects the `About`
 * option from the `Help` menu. All parts of the dialog are optional.
 * 
 * ![An example GtkAboutDialog](aboutdialog.png)
 * 
 * About dialogs often contain links and email addresses. `GtkAboutDialog`
 * displays these as clickable links. By default, it calls [func@Gtk.show_uri]
 * when a user clicks one. The behaviour can be overridden with the
 * [signal@Gtk.AboutDialog::activate-link] signal.
 * 
 * To specify a person with an email address, use a string like
 * `Edgar Allan Poe <edgar@poe.com>`. To specify a website with a title,
 * use a string like `GTK team https://www.gtk.org`.
 * 
 * To make constructing a `GtkAboutDialog` as convenient as possible, you can
 * use the function [func@Gtk.show_about_dialog] which constructs and shows
 * a dialog and keeps it around so that it can be shown again.
 * 
 * Note that GTK sets a default title of `_("About %s")` on the dialog
 * window (where `%s` is replaced by the name of the application, but in
 * order to ensure proper translation of the title, applications should
 * set the title property explicitly when constructing a `GtkAboutDialog`,
 * as shown in the following example:
 * 
 * ```c
 * GFile *logo_file = g_file_new_for_path ("./logo.png");
 * GdkTexture *example_logo = gdk_texture_new_from_file (logo_file, NULL);
 * g_object_unref (logo_file);
 * 
 * gtk_show_about_dialog (NULL,
 *                        "program-name", "ExampleCode",
 *                        "logo", example_logo,
 *                        "title", _("About ExampleCode"),
 *                        NULL);
 * ```
 * 
 * ## CSS nodes
 * 
 * `GtkAboutDialog` has a single CSS node with the name `window` and style
 * class `.aboutdialog`.
 */
public class AboutDialog extends Window implements Accessible, Buildable, ConstraintTarget, Native, Root, ShortcutManager {

    public AboutDialog(io.github.jwharm.javagi.interop.Reference reference) {
        super(reference);
    }
    
    /** Cast object to AboutDialog */
    public static AboutDialog castFrom(org.gtk.gobject.Object gobject) {
        return new AboutDialog(gobject.getReference());
    }
    
    /**
     * Creates a new `GtkAboutDialog`.
     */
    public AboutDialog() {
        super(References.get(gtk_h.gtk_about_dialog_new(), false));
    }
    
    /**
     * Creates a new section in the "Credits" page.
     */
    public void addCreditSection(java.lang.String sectionName, java.lang.String[] people) {
        gtk_h.gtk_about_dialog_add_credit_section(handle(), Interop.allocateNativeString(sectionName).handle(), Interop.allocateNativeArray(people).handle());
    }
    
    /**
     * Returns the comments string.
     */
    public java.lang.String getComments() {
        var RESULT = gtk_h.gtk_about_dialog_get_comments(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Returns the copyright string.
     */
    public java.lang.String getCopyright() {
        var RESULT = gtk_h.gtk_about_dialog_get_copyright(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Returns the license information.
     */
    public java.lang.String getLicense() {
        var RESULT = gtk_h.gtk_about_dialog_get_license(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Retrieves the license type.
     */
    public License getLicenseType() {
        var RESULT = gtk_h.gtk_about_dialog_get_license_type(handle());
        return License.fromValue(RESULT);
    }
    
    /**
     * Returns the paintable displayed as logo in the about dialog.
     */
    public org.gtk.gdk.Paintable getLogo() {
        var RESULT = gtk_h.gtk_about_dialog_get_logo(handle());
        return new org.gtk.gdk.Paintable.PaintableImpl(References.get(RESULT, false));
    }
    
    /**
     * Returns the icon name displayed as logo in the about dialog.
     */
    public java.lang.String getLogoIconName() {
        var RESULT = gtk_h.gtk_about_dialog_get_logo_icon_name(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Returns the program name displayed in the about dialog.
     */
    public java.lang.String getProgramName() {
        var RESULT = gtk_h.gtk_about_dialog_get_program_name(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Returns the system information that is shown in the about dialog.
     */
    public java.lang.String getSystemInformation() {
        var RESULT = gtk_h.gtk_about_dialog_get_system_information(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Returns the translator credits string which is displayed
     * in the credits page.
     */
    public java.lang.String getTranslatorCredits() {
        var RESULT = gtk_h.gtk_about_dialog_get_translator_credits(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Returns the version string.
     */
    public java.lang.String getVersion() {
        var RESULT = gtk_h.gtk_about_dialog_get_version(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Returns the website URL.
     */
    public java.lang.String getWebsite() {
        var RESULT = gtk_h.gtk_about_dialog_get_website(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Returns the label used for the website link.
     */
    public java.lang.String getWebsiteLabel() {
        var RESULT = gtk_h.gtk_about_dialog_get_website_label(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Returns whether the license text in the about dialog is
     * automatically wrapped.
     */
    public boolean getWrapLicense() {
        var RESULT = gtk_h.gtk_about_dialog_get_wrap_license(handle());
        return (RESULT != 0);
    }
    
    /**
     * Sets the names of the artists to be displayed
     * in the "Credits" page.
     */
    public void setArtists(java.lang.String[] artists) {
        gtk_h.gtk_about_dialog_set_artists(handle(), Interop.allocateNativeArray(artists).handle());
    }
    
    /**
     * Sets the names of the authors which are displayed
     * in the "Credits" page of the about dialog.
     */
    public void setAuthors(java.lang.String[] authors) {
        gtk_h.gtk_about_dialog_set_authors(handle(), Interop.allocateNativeArray(authors).handle());
    }
    
    /**
     * Sets the comments string to display in the about dialog.
     * 
     * This should be a short string of one or two lines.
     */
    public void setComments(java.lang.String comments) {
        gtk_h.gtk_about_dialog_set_comments(handle(), Interop.allocateNativeString(comments).handle());
    }
    
    /**
     * Sets the copyright string to display in the about dialog.
     * 
     * This should be a short string of one or two lines.
     */
    public void setCopyright(java.lang.String copyright) {
        gtk_h.gtk_about_dialog_set_copyright(handle(), Interop.allocateNativeString(copyright).handle());
    }
    
    /**
     * Sets the names of the documenters which are displayed
     * in the "Credits" page.
     */
    public void setDocumenters(java.lang.String[] documenters) {
        gtk_h.gtk_about_dialog_set_documenters(handle(), Interop.allocateNativeArray(documenters).handle());
    }
    
    /**
     * Sets the license information to be displayed in the
     * about dialog.
     * 
     * If `license` is `NULL`, the license page is hidden.
     */
    public void setLicense(java.lang.String license) {
        gtk_h.gtk_about_dialog_set_license(handle(), Interop.allocateNativeString(license).handle());
    }
    
    /**
     * Sets the license of the application showing the about dialog from a
     * list of known licenses.
     * 
     * This function overrides the license set using
     * [method@Gtk.AboutDialog.set_license].
     */
    public void setLicenseType(License licenseType) {
        gtk_h.gtk_about_dialog_set_license_type(handle(), licenseType.getValue());
    }
    
    /**
     * Sets the logo in the about dialog.
     */
    public void setLogo(org.gtk.gdk.Paintable logo) {
        gtk_h.gtk_about_dialog_set_logo(handle(), logo.handle());
    }
    
    /**
     * Sets the icon name to be displayed as logo in the about dialog.
     */
    public void setLogoIconName(java.lang.String iconName) {
        gtk_h.gtk_about_dialog_set_logo_icon_name(handle(), Interop.allocateNativeString(iconName).handle());
    }
    
    /**
     * Sets the name to display in the about dialog.
     * 
     * If `name` is not set, the string returned
     * by `g_get_application_name()` is used.
     */
    public void setProgramName(java.lang.String name) {
        gtk_h.gtk_about_dialog_set_program_name(handle(), Interop.allocateNativeString(name).handle());
    }
    
    /**
     * Sets the system information to be displayed in the about
     * dialog.
     * 
     * If `system_information` is `NULL`, the system information
     * page is hidden.
     * 
     * See [property@Gtk.AboutDialog:system-information].
     */
    public void setSystemInformation(java.lang.String systemInformation) {
        gtk_h.gtk_about_dialog_set_system_information(handle(), Interop.allocateNativeString(systemInformation).handle());
    }
    
    /**
     * Sets the translator credits string which is displayed in
     * the credits page.
     * 
     * The intended use for this string is to display the translator
     * of the language which is currently used in the user interface.
     * Using `gettext()`, a simple way to achieve that is to mark the
     * string for translation:
     * 
     * ```c
     * GtkWidget *about = gtk_about_dialog_new ();
     *  gtk_about_dialog_set_translator_credits (GTK_ABOUT_DIALOG (about),
     *                                           _("translator-credits"));
     * ```
     * 
     * It is a good idea to use the customary `msgid` “translator-credits”
     * for this purpose, since translators will already know the purpose of
     * that `msgid`, and since `GtkAboutDialog` will detect if “translator-credits”
     * is untranslated and omit translator credits.
     */
    public void setTranslatorCredits(java.lang.String translatorCredits) {
        gtk_h.gtk_about_dialog_set_translator_credits(handle(), Interop.allocateNativeString(translatorCredits).handle());
    }
    
    /**
     * Sets the version string to display in the about dialog.
     */
    public void setVersion(java.lang.String version) {
        gtk_h.gtk_about_dialog_set_version(handle(), Interop.allocateNativeString(version).handle());
    }
    
    /**
     * Sets the URL to use for the website link.
     */
    public void setWebsite(java.lang.String website) {
        gtk_h.gtk_about_dialog_set_website(handle(), Interop.allocateNativeString(website).handle());
    }
    
    /**
     * Sets the label to be used for the website link.
     */
    public void setWebsiteLabel(java.lang.String websiteLabel) {
        gtk_h.gtk_about_dialog_set_website_label(handle(), Interop.allocateNativeString(websiteLabel).handle());
    }
    
    /**
     * Sets whether the license text in the about dialog should be
     * automatically wrapped.
     */
    public void setWrapLicense(boolean wrapLicense) {
        gtk_h.gtk_about_dialog_set_wrap_license(handle(), wrapLicense ? 1 : 0);
    }
    
    @FunctionalInterface
    public interface ActivateLinkHandler {
        boolean signalReceived(AboutDialog source, java.lang.String uri);
    }
    
    /**
     * Emitted every time a URL is activated.
     * 
     * Applications may connect to it to override the default behaviour,
     * which is to call [func@Gtk.show_uri].
     */
    public void onActivateLink(ActivateLinkHandler handler) {
        try {
            int hash = handler.hashCode();
            Interop.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(boolean.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalAboutDialogActivateLink", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("activate-link").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
}
